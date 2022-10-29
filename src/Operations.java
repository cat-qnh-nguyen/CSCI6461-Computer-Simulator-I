public class Operations {
	//Creating a memory object that points to the singleton
	public static Memory memory = Memory.getInstance();
	
	//Creating a register object that points to the singleton
	public static Register register = Register.getInstance();
	
	
	/**
	 * Loading the content of an address in memory to a general register
	 * @param the register number, effective address
	 */
	//Regular method with Indirect bit
	public static void loadRegister(int reg, int effAddress) {
		register.setGeneralReg(reg, memory.load(effAddress));
	}
	
	
	/**
	 * Storing the content of a register into memory
	 * @param the register number, effective address
	 */
	public static void storeRegister(int reg, int effAddress) {
		memory.store(effAddress, register.getGeneralReg(reg));
	}

	
	/**
	 * Load register with the effective address (r <- EA)
	 * @param register number, effective address
	 */
	public static void loadAddress(int reg, int effAddress)	{
		register.setGeneralReg(reg, effAddress);
	}
	
	
	/**
	 * Load index register from memory
	 * @param index register number, effective address
	 */
	public static void loadIndex(int reg, int effAddress) {
		register.setIndexReg(reg, memory.load(effAddress));
	}
	
	
	/**
	 * Store index register to memory
	 * @param index register number, effective address
	 */
	public static void storeIndex(int reg, int effAddress) {
		memory.store(effAddress, register.getIndexReg(reg));
	}
	
	
	
	//For reading the file with address and instruction in one line
	/**
	 * Storing the second hex number in the first number as the address
	 * @param hexInstruction as a string
	 */
	public static void saveInstructionFromText(String hexInstruction) {
		String addressStr = hexInstruction.substring(0,4);
		String contentStr = hexInstruction.substring(5);
		
		int address = hexToNum(addressStr);
		int content = hexToNum(contentStr);
		
		memory.store(address, content);
	}
	
	
	/**
	 * Converting a number into an x-bit string
	 * @param num is the number to be converted to string
	 * @param bit is the number of bits that should be formatted
	 * @return the number in x-bit string
	 */
	public static String numToStr(int num, int bit) {
		String result = Integer.toBinaryString(num);

		if(num >= 0) {
			if(bit == 32) {
		        result = String.format("%32s", result).replaceAll(" ", "0");
			}
			if(bit == 16) {
		        result = String.format("%16s", result).replaceAll(" ", "0");
			}
			else if(bit == 12) {
		        result = String.format("%12s", result).replaceAll(" ", "0");
			}
			else if(bit == 4) {
		        result = String.format("%4s", result).replaceAll(" ", "0");
			}
		}
		else {
			if(bit == 16) {
		        result = result.substring(result.length()-16);
			}
			else if(bit == 12) {
		        result = result.substring(result.length()-12);
			}
		}
		
		return result;
	}

	/**
	 * Returning the data in integer (32 bits) form from a string of various sizes
	 * @param str the data in string form
	 * @param bits the number of bits for that particular data type (4 bits, 12 bits, or 16 bits)
	 * @return the data in int form (32 bits)
	 */
	public static int strToNum(String str) {
		int result = 0;
		String resultStr = "";
		
		if(str.charAt(0) == '1') {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '0') {
					resultStr += '1';
				}
				else {
					resultStr += '0';
				}
			}

			result = -(Integer.parseInt(resultStr,2) + 1);
		}
		
		else {
			result = Integer.parseInt(str,2);
		}
		
		System.out.println("String " + str + " is: " + result);
		return result;
	}
	
	
	/**
	 * Converting a hex number to a number to store in memory
	 * @param hex is the hex string
	 * @return a number converted in 2's complement
	 */
	public static int hexToNum(String hex) {
		int result;
		String total = "";
		for(int i = 0; i < hex.length(); i++) {
			int temp = Integer.parseInt(hex.substring(i, i+1), 16);
			total += Operations.numToStr(temp, 4);
		}
		result = Operations.strToNum(total);
		
		System.out.println(hex + " is converted to: " + result);
		return result;
		
	}
	
	//Transfer Instructions

	/**
	 * Jump if Zero
	 * @param reg is the register to be considered
	 * @param ea is the address to jump to
	 */
	public static void jumpZero (int reg, int ea) {
		if (register.getGeneralReg(reg) == 0) {
			register.setPC(ea);
		}
		else {
			register.setPC(register.getPC()+1);
		}
	}
	
	/**
	 * Jump if Not Zero
	 * @param reg is the register to be considered
	 * @param ea is the address to jump to
	 */
	public static void jumpNotZero (int reg, int ea) {
		if (register.getGeneralReg(reg)!= 0) {
			register.setPC(ea);
		}
		else {
			register.setPC(register.getPC()+1);
		}
	}
	
	
	/**
	 * Jump condition code
	 * @param cc is the bit of the condition to be checked
	 * @param ea is the address to jump to
	 */
	public static void jumpConditionCode (int cc, int ea) {
		String conditionStr = Integer.toBinaryString(register.getCC());
        conditionStr = String.format("%4s", conditionStr).replaceAll(" ", "0");
        
        String ccBit = conditionStr.substring(cc, cc + 1);
        
        if(Integer.parseInt(ccBit) == 1) {
        	register.setPC(ea);
        }
        else {
        	register.setPC(register.getPC()+1);
        }        
	}
	
	/**
	 * Jump to address unconditionally
	 * @param ea the address to jump to
	 */
	public static void jumpAddress(int ea) {
		register.setPC(ea);
	}
	
	/**
	 * Jump save return address in R3
	 * @param ea address to jump to
	 */
	public static void jumpSaveReturn(int ea) {
		register.setGeneralReg(3, register.getPC() + 1);
		register.setPC(ea);
	}
	
	/**
	 * Return from subroutine
	 * @param immed is the immediate stored in R0
	 */
	public static void returnFromSubroutine(int immed) {
		register.setGeneralReg(0, immed);
		register.setPC(register.getGeneralReg(3));
	}
	
	
	/**
	 * Subtract One and Branch
	 * @param r is the register to be subtracted
	 * @param ea is the address to jump to
	 */
	public static void subtractOneBranch(int r, int ea) {
		register.setGeneralReg(r, register.getGeneralReg(r) - 1);
		if(register.getGeneralReg(r) > 0) {
			register.setPC(ea);
		}
		else {
			register.setPC(register.getPC() + 1);
		}
	}
	
	/**
	 * Jump greater than or equal to
	 * @param r is the register to consider
	 * @param ea is the address to jump to
	 */
	public static void jumpGreaterEqual (int r, int ea) {
		if(register.getGeneralReg(r) >= 0) {
			register.setPC(ea);
		}
		else {
			register.setPC(register.getPC() + 1);
		}
	}

	// arithmetic instructions

	/**
	 * Add memory to register
	 * @param r is the register
	 * @param ea the address in memory
	 */
	public static void addMemToReg(int r, int ea) {
		int result = register.getGeneralReg(r) + memory.load(ea);
		
		if(result > 32767) {
			register.setCC(register.getCC() | 8);
			System.out.println("OVERFLOW");
		}
		else if(result < -32768) {
			register.setCC(register.getCC() | 4);
			System.out.println("UNDERFLOW");
		}
		else
			register.setGeneralReg(r, result);
	}
	
	/**
	 * Subtract memory to register
	 * @param r is the register
	 * @param ea the address in memory
	 */
	public static void subMemFromReg(int r, int ea) {
		int result = register.getGeneralReg(r) - memory.load(ea);
		
		if(result > 32767) {
			register.setCC(register.getCC() | 8);
			System.out.println("OVERFLOW");
		}
		else if(result < -32768) {
			register.setCC(register.getCC() | 4);
			System.out.println("UNDERFLOW");
		}
		else
			register.setGeneralReg(r, result);
	}
	
	/**
	 * Add immediate to register
	 * @param r is the register
	 * @param immediate the number to add to
	 */
	public static void addImmedToReg(int r, int immediate) {
		if(immediate != 0) {
			int result = register.getGeneralReg(r) + immediate;

			if(result > 32767) {
				register.setCC(register.getCC() | 8);
				System.out.println("OVERFLOW");
			}
			else if(result < -32768) {
				register.setCC(register.getCC() | 4);
				System.out.println("UNDERFLOW");
			}
			else
				register.setGeneralReg(r, result);
		}
	}
	
	/**
	 * Subtract immediate to register
	 * @param r is the register
	 * @param immediate the number to subtract from c(reg)
	 */
	public static void subImmedFromReg(int r, int immediate) {
		if(immediate != 0) {
			int result = register.getGeneralReg(r) - immediate;
			if(result > 32767) {
				register.setCC(register.getCC() | 8);
				System.out.println("OVERFLOW");
			}
			else if(result < -32768) {
				register.setCC(register.getCC() | 4);
				System.out.println("UNDERFLOW");
			}
			else
				register.setGeneralReg(r, result);			
		}	
	}
	
	/**
	 * Multiply register by register
	 * @param Rx the first register
	 * @param Ry the second register
	 */
	public static void multRegByReg(int Rx, int Ry) {
		// when multiplied value is more than 32 bit - "Overflow"
		int result = register.getGeneralReg(Rx)*register.getGeneralReg(Ry);
		if(result > 2147483647) {
			register.setCC(register.getCC() |8);
			System.out.println("OVERFLOW");
		}
		// when multiplied value is less than 32 bit - "Underflow"
		else if(result < -2147483648) {
			register.setCC(register.getCC() | 4);
			System.out.println("Underflow");
		}
		else {
			// store high order bits in Rx and low order bits in Rx+1.
			String resultStr = numToStr(result, 32);
			System.out.println("Result of mult is " + resultStr + " = " + result);
			register.setGeneralReg(Rx, strToNum(resultStr.substring(0,16)));
			register.setGeneralReg(Rx + 1, strToNum(resultStr.substring(16)));
		}
	} 
	
	/**
	 * Dividing one register by another
	 * @param Rx holds the dividend
	 * @param Ry holds the divisor
	 */
	public static void divRegByReg(int Rx, int Ry) {
		if(register.getGeneralReg(Ry) == 0) {
			register.setCC(register.getCC() | 2);		
			System.out.println("DIVZERO");
		}
		else {
			// store quotient in Rx and remainder in Rx+1
			int quotient =  register.getGeneralReg(Rx) / register.getGeneralReg(Ry);
			int remainder =  register.getGeneralReg(Rx) % register.getGeneralReg(Ry);
			
			register.setGeneralReg(Rx, quotient);
			register.setGeneralReg(Rx + 1, remainder);
		}
	} 
	
	// logical operations
	
	// Check if the register values are equal.
	public static void testRegReg(int Rx, int Ry) {
		if(register.getGeneralReg(Rx) == register.getGeneralReg(Ry)) {
			register.setCC(1);		
			System.out.println("Equal");
		}
		else {
			register.setCC(0);		
			System.out.println("Not Equal");
		}
	} 
	
	
	// logical AND of two register values.
	public static void logicalAndOfRegisterAndRegister(int Rx, int Ry) {
		register.setGeneralReg(Rx, register.getGeneralReg(Rx) & register.getGeneralReg(Ry));
	} 
	
	// logical OR of two register values.
	public static void logicalOrOfRegisterAndRegister(int Rx, int Ry) {
		register.setGeneralReg(Rx, register.getGeneralReg(Rx) | register.getGeneralReg(Ry));
	} 
	
	// logical NOT of a register value.
	public static void logicalNotOfRegister(int Rx) {
		register.setGeneralReg(Rx, ~register.getGeneralReg(Rx));
	} 

	// shift/rotate operations
	
	// Shift Register by Count 
	public static void shiftRegisterByCount (int r, int count, char leftRight, char arithLogic) {
		if(count > 0) {
			String regBitVal = numToStr(register.getGeneralReg(r), 16);
			// left shift
			if(leftRight == '1') {
				// arithmetic shift
				if(arithLogic == '0')
					regBitVal = regBitVal.charAt(0) + regBitVal.substring(count+1, regBitVal.length());
				// logical shift
				else 
					regBitVal = regBitVal.substring(count, regBitVal.length());
				// adding 0s at the end for the remaining bits
				while(regBitVal.length()<16) {
					regBitVal += "0";
				}
			}
			//right shift
			else {
				String rightShiftedVal = "";
				// arithmetic shift
				if(arithLogic == '0') {
					rightShiftedVal += regBitVal.charAt(0);
					for(int i=0; i<count; i++)
						rightShiftedVal += "0";
					regBitVal = rightShiftedVal + regBitVal.substring(count+1, regBitVal.length()-count-1);
				}
				// logical shift
				else {
					for(int i=0; i<count; i++)
						rightShiftedVal += "0";
					regBitVal = rightShiftedVal + regBitVal.substring(count, regBitVal.length()-count);
				}
			}
			register.setGeneralReg(r, Integer.parseInt(regBitVal, 2));
		}
	} 
	
	// Rotate Register by Count 
	public static void rotateRegisterByCount (int r, int count, char leftRight) {
		if(count > 0) {
			String regBitVal = numToStr(register.getGeneralReg(r), 16);
			// left shift
			if(leftRight == '1') 
				regBitVal = regBitVal.substring(count, regBitVal.length()) + regBitVal.substring(0, count);
			//right shift
			else 
				regBitVal = regBitVal.substring(regBitVal.length()-count, regBitVal.length()) + regBitVal.substring(0, regBitVal.length()-count);
			register.setGeneralReg(r, Integer.parseInt(regBitVal, 2));
		}
	} 
	
	
	



}