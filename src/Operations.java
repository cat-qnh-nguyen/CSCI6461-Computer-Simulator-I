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
		System.out.println("Register R" + reg + " has " + register.getGeneralReg(reg));
	}
	
	
	/**
	 * Storing the content of a register into memory
	 * @param the register number, effective address
	 */
	public static void storeRegister(int reg, int effAddress) {
		memory.store(effAddress, register.getGeneralReg(reg));
		System.out.println("Memory["+ effAddress +"] has " + memory.load(effAddress));
	}

	
	/**
	 * Load register with the effective address (r <- EA)
	 * @param register number, effective address
	 */
	public static void loadAddress(int reg, int effAddress)	{
		register.setGeneralReg(reg, effAddress);
		System.out.println("Register R" + reg + " has " + register.getGeneralReg(reg));
	}
	
	
	/**
	 * Load index register from memory
	 * @param index register number, effective address
	 */
	public static void loadIndex(int reg, int effAddress) {
		register.setIndexReg(reg, memory.load(effAddress));
		System.out.println("Register I" + reg + " has " + register.getIndexReg(reg));
	}
	
	
	/**
	 * Store index register to memory
	 * @param index register number, effective address
	 */
	public static void storeIndex(int reg, int effAddress) {
		memory.store(effAddress, register.getIndexReg(reg));
		System.out.println("Memory["+ effAddress +"] has " + memory.load(effAddress));
	}
	
	
	
	//For reading the file with address and instruction in one line
	/**
	 * Storing the second hex number in the first number as the address
	 * @param hexInstruction as a string
	 */
	public static void saveInstructionFromText(String hexInstruction) {
		String addressStr = hexInstruction.substring(0,4);
		String contentStr = hexInstruction.substring(5);
		
		int address = Integer.parseInt(addressStr, 16);
		int content = Integer.parseInt(contentStr, 16);
		
		memory.store(address, content);
		System.out.println("Address: " + address + " has " + memory.load(address));
	}
	
	/**
	 * Converting a number into an x-bit string
	 * @param num is the number to be converted to string
	 * @param bit is the number of bits that should be formatted
	 * @return the number in x-bit string
	 */
	public static String numToStr(int num, int bit) {
		String result = Integer.toBinaryString(num);
		System.out.println("Before:" + result);
		if(num >= 0) {
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
			else if(bit == 4) {
		        result = result.substring(result.length()-4);
			}
		}
		System.out.println("Length of string: " + result.length());
		return result;
	}

	
	public static void jumpZero (int reg, int ea) {
		if (register.getGeneralReg(reg) == 0) {
			register.setPC(ea);
		}
		else {
			register.setPC(register.getPC()+1);
		}
	}
	

	public static void jumpNotZero (int reg, int ea) {
		if (register.getGeneralReg(reg)!= 0) {
			register.setPC(ea);
		}
		else {
			register.setPC(register.getPC()+1);
		}
	}
	
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
	
	
	public static void jumpAddress(int ea) {
		register.setPC(ea);
	}
	
	public static void jumpSaveReturn(int ea) {
		register.setGeneralReg(3, register.getPC() + 1);
		register.setPC(ea);
	}
	
	public static void returnFromSubroutine(int immed) {
		register.setGeneralReg(0, immed);
		register.setPC(register.getGeneralReg(3));
	}
	
	public static void subtractOneBranch(int r, int ea) {
		register.setGeneralReg(r, register.getGeneralReg(r) - 1);
		if(register.getGeneralReg(r) > 0) {
			register.setPC(ea);
		}
		else {
			register.setPC(register.getPC() + 1);
		}
	}
	
	public static void jumpGreaterEqual (int r, int ea) {
		if(register.getGeneralReg(r) >= 0) {
			register.setPC(ea);
		}
		else {
			register.setPC(register.getPC() + 1);
		}
	}
	
	// arithmetic instructions
	
	// add EA value to register
	public static void addMemoryToReg(int r, int ea) {
		// when value is more than 16 bit - "Overflow"
		if(register.getGeneralReg(r) + memory.load(ea) > 32767) {
			register.setCC(8);
			System.out.println("OVERFLOW");
		}
		else
			register.setGeneralReg(r, register.getGeneralReg(r) + memory.load(ea));
	}
	
	// subtract EA value from register
	public static void subtractMemoryFromRegister(int r, int ea) {
		// when value is less than the 16 bit range - "Underflow"
		if(register.getGeneralReg(r) - memory.load(ea) < -32768) {
			register.setCC(4);
			System.out.println("Underflow");
		}
		else
			register.setGeneralReg(r, register.getGeneralReg(r) - memory.load(ea));
	}
	
	// doubt
	// add immediate value to register
	public static void addImmediateToRegister(int r, int immediate) {
		if(immediate != 0) {
			// when value is more than 16 bit - "Overflow"
			if(register.getGeneralReg(r) + immediate > 32767) {
				register.setCC(8);
				System.out.println("OVERFLOW");
			}
			else
				register.setGeneralReg(r, register.getGeneralReg(r) + immediate);
		}
	}
	
	// doubt immediate and cc values
	// subtract immediate value to register
	public static void subtractImmediateFromRegister(int r, int immediate) {
		if(immediate != 0) {
			// when value is less than the 16 bit range - "Underflow"
			if(register.getGeneralReg(r) - immediate < -32768) {
				register.setCC(4);
				System.out.println("Underflow");
			}
			else
				register.setGeneralReg(r, register.getGeneralReg(r) - immediate);			
		}	
	}
	
	// multiple the values in both the registers.
	public static void multiplyRegisterByRegister(int Rx, int Ry) {
		// when multiplied value is more than 32 bit - "Overflow"
		if(register.getGeneralReg(Rx)*register.getGeneralReg(Ry) > 2147483647) {
			register.setCC(8);
			System.out.println("OVERFLOW");
		}
		// when multiplied value is less than 32 bit - "Underflow"
		else if(register.getGeneralReg(Rx)*register.getGeneralReg(Ry) < -2147483648) {
			register.setCC(4);
			System.out.println("Underflow");
		}
		else {
			// store high order bits in Rx and low order bits in Rx+1.
			if(register.getGeneralReg(Rx)*register.getGeneralReg(Ry) <= 65535) {
				register.setGeneralReg(Rx, 0);
				register.setGeneralReg(Rx+1, register.getGeneralReg(Rx)*register.getGeneralReg(Ry));
			}
			else {
				int multipliedValue = register.getGeneralReg(Rx)*register.getGeneralReg(Ry);
				register.setGeneralReg(Rx, multipliedValue-65535);
				register.setGeneralReg(Rx+1, 65535);
			}
		}
	} 
	
	// divide one register value by another register value.
	public static void divideRegisterByRegister(int Rx, int Ry) {
		if(register.getGeneralReg(Ry) == 0) {
			register.setCC(2);		
			System.out.println("DIVZERO");
		}
		else {
			// store quotient in Rx and remainder in Rx+1
			register.setGeneralReg(Rx, register.getGeneralReg(Rx)%register.getGeneralReg(Ry));
			register.setGeneralReg(Rx+1, register.getGeneralReg(Rx)/register.getGeneralReg(Ry));
		}
	} 
	
	// logical operations
	
	// Check if the register values are equal.
	public static void testEqualityOfRegisterAndRegister(int Rx, int Ry) {
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
	
	
	












}
