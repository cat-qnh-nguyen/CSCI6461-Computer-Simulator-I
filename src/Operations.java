
public class Operations {
	// Creating a memory object that points to the singleton
	// No need for memory instance now that cache is implemented
	public static Memory memory = Memory.getInstance();

	// Creating a register object that points to the singleton
	public static Register register = Register.getInstance();

	public static Cache cache = Cache.getInstance();
	public static Pipeline pipeline = Pipeline.getInstance();

	/**
	 * Loading the content of an address in memory to a general register
	 * 
	 * @param the register number, effective address
	 */
	// Regular method with Indirect bit
	public static void loadRegister(int reg, int effAddress) {
		pipeline.setEXE(effAddress);
		pipeline.setMEM(cache.loadCache(effAddress));
		pipeline.setWB(cache.loadCache(effAddress));
		
		register.setGeneralReg(reg, cache.loadCache(effAddress));
	}

	/**
	 * Storing the content of a register into memory
	 * 
	 * @param the register number, effective address
	 */
	public static void storeRegister(int reg, int effAddress) {
		pipeline.setEXE(effAddress);
		pipeline.setMEM(register.getGeneralReg(reg));
		
		cache.writeCache(effAddress, register.getGeneralReg(reg));
		
	}

	/**
	 * Load register with the effective address (r <- EA)
	 * 
	 * @param register number, effective address
	 */
	public static void loadAddress(int reg, int effAddress) {
		pipeline.setEXE(effAddress);
		
		pipeline.setWB(effAddress);
		register.setGeneralReg(reg, effAddress);
	}

	/**
	 * Load index register from memory
	 * 
	 * @param index register number, effective address
	 */
	public static void loadIndex(int reg, int effAddress) {
		pipeline.setEXE(effAddress);
		pipeline.setMEM(cache.loadCache(effAddress));
		pipeline.setWB(cache.loadCache(effAddress));
		register.setIndexReg(reg, cache.loadCache(effAddress));
	}

	/**
	 * Store index register to memory
	 * 
	 * @param index register number, effective address
	 */
	public static void storeIndex(int reg, int effAddress) {
		pipeline.setEXE(effAddress);
		pipeline.setMEM(register.getIndexReg(reg));
		cache.writeCache(effAddress, register.getIndexReg(reg));
	}


	// Transfer Instructions
	/**
	 * Jump if Zero
	 * 
	 * @param reg is the register to be considered
	 * @param ea  is the address to jump to
	 */
	public static void jumpZero(int reg, int ea) {
		pipeline.setEXE(ea);
		if (register.getGeneralReg(reg) == 0) {
			System.out.println("R" + reg + " = 0: jump");
			register.setPC(ea);
		}
		else
		{
			System.out.println("Not 0: EA = PC + 1");
		}
		//In jump cases, WB will hold the jump address
		pipeline.setWB(register.getPC());

	}

	/**
	 * Jump if Not Zero
	 * 
	 * @param reg is the register to be considered
	 * @param ea  is the address to jump to
	 */
	public static void jumpNotZero(int reg, int ea) {
		pipeline.setEXE(ea);

		if (register.getGeneralReg(reg) != 0) {
			System.out.println("R" + reg + " != 0: jump");
			register.setPC(ea);
		}
		else
		{
			System.out.println("R" + reg + " = 0: EA = PC + 1");
		}
		pipeline.setWB(register.getPC());
	}

	/**
	 * Jump condition code
	 * 
	 * @param cc is the bit of the condition to be checked
	 * @param ea is the address to jump to
	 */
	public static void jumpConditionCode(int cc, int ea) {
		String conditionStr = Integer.toBinaryString(register.getCC());
		pipeline.setEXE(ea);
		
		conditionStr = String.format("%4s", conditionStr).replaceAll(" ", "0");
		
		String ccBit = conditionStr.substring(cc, cc + 1);
		
		if (Integer.parseInt(ccBit) == 1) {
			register.setPC(ea);
		}
		pipeline.setWB(register.getPC());
	}

	/**
	 * Jump to address unconditionally
	 * 
	 * @param ea the address to jump to
	 */
	public static void jumpAddress(int ea) {
		
		register.setPC(ea);
		pipeline.setEXE(ea);
		pipeline.setWB(register.getPC());
	}

	/**
	 * Jump save return address in R3
	 * 
	 * @param ea address to jump to
	 */
	public static void jumpSaveReturn(int ea) {
		pipeline.setWB(register.getPC());
		register.setGeneralReg(3, register.getPC());
		register.setPC(ea);
		pipeline.setEXE(register.getPC());
	}

	/**
	 * Return from subroutine
	 * 
	 * @param immed is the immediate stored in R0
	 */
	public static void returnFromSubroutine(int immed) {
		pipeline.setEXE(immed);
		register.setGeneralReg(0, immed);
		register.setPC(register.getGeneralReg(3));
		pipeline.setWB(register.getPC());
	}

	/**
	 * Subtract One and Branch
	 * 
	 * @param r  is the register to be subtracted
	 * @param ea is the address to jump to
	 */
	public static void subtractOneBranch(int r, int ea) {
		pipeline.setEXE(register.getGeneralReg(r) - 1);
		register.setGeneralReg(r, register.getGeneralReg(r) - 1);
		if (register.getGeneralReg(r) > 0) {
			register.setPC(ea);
		}
		pipeline.setWB(register.getPC());
	}

	/**
	 * Jump greater than or equal to
	 * 
	 * @param r  is the register to consider
	 * @param ea is the address to jump to
	 */
	public static void jumpGreaterEqual(int r, int ea) {
		pipeline.setEXE(register.getGeneralReg(r));
		if (register.getGeneralReg(r) >= 0) {
			register.setPC(ea);
		}
		pipeline.setWB(register.getPC());
	}

	// arithmetic instructions

	/**
	 * Add memory to register
	 * 
	 * @param r  is the register
	 * @param ea the address in memory
	 */
	public static void addMemToReg(int r, int ea) {
		
		int result = register.getGeneralReg(r) + cache.loadCache(ea);
		pipeline.setEXE(result);
		pipeline.setMEM(cache.loadCache(ea));
		if (result > 32767) {
			register.setCC(register.getCC() | 8);
			System.out.println("OVERFLOW");
		} else if (result < -32768) {
			register.setCC(register.getCC() | 4);
			System.out.println("UNDERFLOW");
		} 
		else {
			register.setGeneralReg(r, result);
			pipeline.setWB(result);
		}

	}

	/**
	 * Subtract memory to register
	 * 
	 * @param r  is the register
	 * @param ea the address in memory
	 */
	public static void subMemFromReg(int r, int ea) {
		int result = register.getGeneralReg(r) - cache.loadCache(ea);
		pipeline.setEXE(result);
		pipeline.setMEM(cache.loadCache(ea));
		
		if (result > 32767) {
			register.setCC(register.getCC() | 8);
			System.out.println("OVERFLOW");
		} else if (result < -32768) {
			register.setCC(register.getCC() | 4);
			System.out.println("UNDERFLOW");
		} 
		else {
			register.setGeneralReg(r, result);
			pipeline.setWB(result);
		}
	}

	/**
	 * Add immediate to register
	 * 
	 * @param r         is the register
	 * @param immediate the number to add to
	 */
	public static void addImmedToReg(int r, int immediate) {
		
		if (immediate != 0) {
			int result = register.getGeneralReg(r) + immediate;
			pipeline.setEXE(result);
			if (result > 32767) {
				register.setCC(register.getCC() | 8);
				System.out.println("OVERFLOW");
			} else if (result < -32768) {
				register.setCC(register.getCC() | 4);
				System.out.println("UNDERFLOW");
			} else
				register.setGeneralReg(r, result);		
				pipeline.setWB(result);
		}

	}

	/**
	 * Subtract immediate to register
	 * 
	 * @param r         is the register
	 * @param immediate the number to subtract from c(reg)
	 */
	public static void subImmedFromReg(int r, int immediate) {
		if (immediate != 0) {
			int result = register.getGeneralReg(r) - immediate;
			pipeline.setEXE(result);
			
			if (result > 32767) {
				register.setCC(register.getCC() | 8);
				System.out.println("OVERFLOW");
			} else if (result < -32768) {
				register.setCC(register.getCC() | 4);
				System.out.println("UNDERFLOW");
			} else {
				register.setGeneralReg(r, result);
				pipeline.setWB(result);
			}
		}
	}

	/**
	 * Multiply register by register
	 * 
	 * @param Rx the first register
	 * @param Ry the second register
	 */
	public static void multRegByReg(int Rx, int Ry) {
		// when multiplied value is more than 32 bit - "Overflow"
		int result = register.getGeneralReg(Rx) * register.getGeneralReg(Ry);
		
		
		if (result > 2147483647) {
			register.setCC(register.getCC() | 8);
			System.out.println("OVERFLOW");
		}
		// when multiplied value is less than 32 bit - "Underflow"
		else if (result < -2147483648) {
			register.setCC(register.getCC() | 4);
			System.out.println("Underflow");
		} else {
			// store high order bits in Rx and low order bits in Rx+1.
			String resultStr = Helper.numToStr(result, 32);
			System.out.println("Result of mult is " + resultStr + " = " + result);
			register.setGeneralReg(Rx, Helper.strToNum(resultStr.substring(0, 16)));
			register.setGeneralReg(Rx + 1, Helper.strToNum(resultStr.substring(16)));
			pipeline.setEXE(register.getGeneralReg(Rx));
			pipeline.setWB(register.getGeneralReg(Rx + 1));
		}
	}

	/**
	 * Dividing one register by another
	 * 
	 * @param Rx holds the dividend
	 * @param Ry holds the divisor
	 */
	public static void divRegByReg(int Rx, int Ry) {
		if (register.getGeneralReg(Ry) == 0) {
			register.setCC(register.getCC() | 2);
			System.out.println("DIVZERO");
		} else {
			// store quotient in Rx and remainder in Rx+1
			int quotient = register.getGeneralReg(Rx) / register.getGeneralReg(Ry);
			int remainder = register.getGeneralReg(Rx) % register.getGeneralReg(Ry);

			register.setGeneralReg(Rx, quotient);
			register.setGeneralReg(Rx + 1, remainder);
			
			pipeline.setEXE(register.getGeneralReg(Rx));
			pipeline.setWB(register.getGeneralReg(Rx + 1));
		}
	}

	// logical operations

	// Check if the register values are equal.
	public static void testRegReg(int Rx, int Ry) {
		pipeline.setEXE(register.getGeneralReg(Rx) - register.getGeneralReg(Ry));
		if (register.getGeneralReg(Rx) == register.getGeneralReg(Ry)) {
			register.setCC(register.getCC() | 1);
			System.out.println("Equal");
		} else {
			if(register.getCC() % 2 != 0) {
				register.setCC(register.getCC() - 1);
			}

			System.out.println("Not Equal");
		}
		pipeline.setWB(register.getCC());
	}

	/**
	 * Logical AND of 2 registers
	 * 
	 * @param Rx
	 * @param Ry
	 */
	public static void logicalAND(int Rx, int Ry) {
		System.out.println(Helper.numToStr(register.getGeneralReg(Rx), 16));
		System.out.println(Helper.numToStr(register.getGeneralReg(Ry), 16));
		System.out.println(Helper.numToStr(register.getGeneralReg(Rx) & register.getGeneralReg(Ry), 16));

		register.setGeneralReg(Rx, register.getGeneralReg(Rx) & register.getGeneralReg(Ry));
		pipeline.setEXE(register.getGeneralReg(Rx));
		pipeline.setWB(register.getGeneralReg(Rx));
	}

	/**
	 * Logical OR of 2 registers
	 * 
	 * @param Rx
	 * @param Ry
	 */
	public static void logicalOR(int Rx, int Ry) {
		System.out.println(Helper.numToStr(register.getGeneralReg(Rx), 16));
		System.out.println(Helper.numToStr(register.getGeneralReg(Ry), 16));
		System.out.println(Helper.numToStr(register.getGeneralReg(Rx) | register.getGeneralReg(Ry), 16));

		register.setGeneralReg(Rx, register.getGeneralReg(Rx) | register.getGeneralReg(Ry));
		pipeline.setEXE(register.getGeneralReg(Rx));
		pipeline.setWB(register.getGeneralReg(Rx));
	}

	/**
	 * Logical Not of a register value
	 * 
	 * @param Rx
	 */
	public static void logicalNot(int Rx) {
		System.out.println(Helper.numToStr(register.getGeneralReg(Rx), 16));
		System.out.println(Helper.numToStr(~register.getGeneralReg(Rx), 16));

		register.setGeneralReg(Rx, ~register.getGeneralReg(Rx));
		pipeline.setEXE(register.getGeneralReg(Rx));
		pipeline.setWB(register.getGeneralReg(Rx));
	}

	// shift/rotate operations

	/**
	 * Shift register by count
	 * 
	 * @param r          the register to shift
	 * @param count      how many bits to shift
	 * @param leftRight  1 for left, 0 for right
	 * @param arithLogic 0 for arithmetic, 1 for logical
	 */
	public static void shiftRegByCount(int r, int count, int leftRight, int arithLogic) {
		if (count > 0) {
			String regBitVal = Helper.numToStr(register.getGeneralReg(r), 16);
			
			// Logical shift (shift left or right regardless of sign bit)
			if (arithLogic == 1) {
				// Left
				if (leftRight == 1) {
					System.out.println("Logical left shift by " + count + " count.");

					regBitVal = regBitVal.substring(count, regBitVal.length());
					while (regBitVal.length() < 16) {
						regBitVal += "0";
					}
				}
				// Right
				else {
					System.out.println("Logical right shift by " + count + " count.");

					for (int i = 0; i < count; i++) {
						regBitVal = "0" + regBitVal;
					}
					regBitVal = regBitVal.substring(0, 16);
				}
			}

			// Arithmetic shift (shift left or right but preserving sign bit)
			else {
				String sign = regBitVal.substring(0, 1);
				regBitVal = regBitVal.substring(1);
				String cut;
				// Left
				if (leftRight == 1) {
					System.out.println("Arithmetic left shift by " + count + " count.");

					cut = regBitVal.substring(0, count);

					regBitVal = regBitVal.substring(count);

					// This means the value stored in r will become junk

					if (cut.contains("01") || (cut.contains("10"))) {
						register.setCC(register.getCC() | 8);
						System.out.println("OVERFLOW");
					}

					regBitVal = sign + regBitVal;

					for (int i = 0; i < count; i++) {
						regBitVal += "0";
					}
				}
				// Right
				else {
					System.out.println("Arithmetic right shift by " + count + " count.");

					cut = regBitVal.substring(regBitVal.length() - count);
					System.out.println(cut);
					regBitVal = regBitVal.substring(0, regBitVal.length() - count);

					if (cut.contains("1")) {
						register.setCC(register.getCC() | 4);
						System.out.println("UNDERFLOW");
					}

					for (int i = 0; i < count; i++) {
						if (sign.equals("1")) {
							regBitVal = "1" + regBitVal;
						} else {
							regBitVal = "0" + regBitVal;
						}
					}
					regBitVal = sign + regBitVal;
				}
			}

			System.out.println("Original: " + Helper.numToStr(register.getGeneralReg(r), 16) +
					"\nShifted: " + regBitVal);
			pipeline.setEXE(register.getGeneralReg(r));
			
			register.setGeneralReg(r, Helper.strToNum(regBitVal));
			
			pipeline.setWB(register.getGeneralReg(r));
		}
	}

	/**
	 * Rotate register by count
	 * 
	 * @param r         the register to rotate
	 * @param count     is how many bits to rotate
	 * @param leftRight left = 1, right = 0
	 */
	public static void rotateRegByCount(int r, int count, int leftRight) {
		if (count > 0) {
			String regBitVal = Helper.numToStr(register.getGeneralReg(r), 16);
			// left rotate
			if (leftRight == 1) {
				System.out.println("Rotate left by " + count);
				regBitVal = regBitVal.substring(count, regBitVal.length())
						+ regBitVal.substring(0, count);

			}
			// right rotate
			else {
				System.out.println("Rotate right by " + count);
				regBitVal = regBitVal.substring(regBitVal.length() - count, regBitVal.length())
						+ regBitVal.substring(0, regBitVal.length() - count);
			}

			System.out.println("Original: " + Helper.numToStr(register.getGeneralReg(r), 16) +
					"\nRotated: " + regBitVal);
			
			pipeline.setEXE(register.getGeneralReg(r));
			
			register.setGeneralReg(r, Helper.strToNum(regBitVal));
			
			pipeline.setWB(register.getGeneralReg(r));
		}
	}

	/**
	 * In instruction
	 * @param r the register to hold input character
	 * @param device
	 */
	public static void in(int r, int device) {
		pipeline.setEXE(device);
		
		if (device == 0) //getting data from the keyboard
		{
			String str = OperatorConsole.decodeMessage();
			if(str == null || str == "") {
				OperatorConsole.printConsole("You enter nothing! Enter again!");
				in(r, device);
			}
			else if(str.length() > 1) {
				OperatorConsole.printConsole("Too long. Enter only one character.");
				in(r, device);
			}
			else {
				register.setGeneralReg(r, (int)str.charAt(0));
				pipeline.setWB(register.getGeneralReg(r));
			}
		}
		else if (device == 2) //getting data from the card reader
		{
			OperatorConsole.printConsole("First character is read.");
			CardReader.readFromFile(r, false);
		}
	}
	
	/**
	 * Input everything as a string saved in memory
	 * @param r is the register that holds the first address of the string
	 * @param device is the input device
	 */
	public static void ins(int r, int device) {
		if(device == 0) //getting data from the keyboard
		{
			pipeline.setEXE(device);
			String str = OperatorConsole.decodeMessage();
			int length = str.length();
			
			int add = register.getGeneralReg(r);
			
			//Store each character into memory
			for(int i = 0; i < length; i++) {
				cache.writeCache(add, (int)str.charAt(i));
				pipeline.setMEM((int)str.charAt(i));
				add++;
			}
			//Store the new line
			cache.writeCache(add, 0);
		}
		else if (device == 2) //getting data from the cardReader
		{
			CardReader.readFromFile(r, true);
		}
	}
	
	/**
	 * Input literal
	 * @param r the register to store the literal
	 * @param device to get input from
	 */
	public static void inl (int r, int device) {
		if(device == 0) {
			pipeline.setEXE(device);
			String str = OperatorConsole.decodeMessage();
			
			register.setGeneralReg(r, Integer.parseInt(str));
			pipeline.setWB(register.getGeneralReg(r));
		}
	}
	
	/**
	 * Out instruction
	 * @param r holds the data for output
	 * @param device
	 */
	public static void out(int r, int device) {
		// device = printer
		pipeline.setEXE(device);
		if (device == 1) {
		
			String result = "";
			result += (char) register.getGeneralReg(r);
			OperatorConsole.printConsole(result);
			
			pipeline.setWB(register.getGeneralReg(r));
			
			System.out.println("Printing " + result + " to console");
		}
	}
	
	public static void outs(int r, int device) {
		pipeline.setEXE(device);
		if(device == 1) {
			String result = "";
			int i = register.getGeneralReg(r);
			
			int temp = cache.loadCache(i);
			
			while(temp!= 0) {
				result += (char)temp;
				pipeline.setMEM(temp);
				i++;
				temp = cache.loadCache(i);
				pipeline.setWB(temp);
			}
			OperatorConsole.printConsole(result);
			//i points at 0 aka the end of string
			register.setGeneralReg(r, i);
			System.out.println("Printing: " + result);
		}
	}
	/**
	 * printing the literal value in the register
	 * @param r the register to print out
	 * @param device
	 */
	public static void outl(int r, int device) {
		pipeline.setEXE(device);
		if(device == 1) {
			pipeline.setWB(register.getGeneralReg(r));
			String result = Integer.toString(register.getGeneralReg(r));
			OperatorConsole.printConsole(result);
			System.out.println("Printing " + result + " to console");
		}
	}
	/**
	 * Chk instruction - Check Device Status to Register
	 * @param r holds the data for output
	 * @param device
	 */
	public static void chk(int r, int device) {
		pipeline.setEXE(device);
		switch(device) {
		case 0: 
			// Console Keyboard
			register.setGeneralReg(r, OperatorConsole.keyboardStatus);
			break;
		case 1:
			// Console Printer 
			register.setGeneralReg(r, OperatorConsole.printerStatus);
			break;
		case 2:
			// Card Reader
			register.setGeneralReg(r, CardReader.getStatus());
			break;	
		}
		pipeline.setWB(register.getGeneralReg(r));
	}

	// Immediate arithmetic instructions added for index registers
	/**
	 * Add immediate to Index Register
	 * @param x the index register to alter
	 * @param immed the immediate to add to index register
	 */
	public static void addImmedToX(int x, int immed) {

		if (immed != 0) {
			int result = register.getIndexReg(x) + immed;
			pipeline.setEXE(result);

			if (result > 32767) {
				register.setCC(register.getCC() | 8);
				System.out.println("OVERFLOW");
			} else if (result < -32768) {
				register.setCC(register.getCC() | 4);
				System.out.println("UNDERFLOW");
			} else
				register.setIndexReg(x, result);
			pipeline.setWB(result);
		}
		
	}

	/**
	 * Subtract immediate from index register
	 * @param x the index register to alter
	 * @param immed the immediate to subtract from the index register
	 */
	public static void subImmedFromX(int x, int immed) {
		if (immed != 0) {
			int result = register.getIndexReg(x) - immed;
			pipeline.setEXE(result);
			if (result > 32767) {
				register.setCC(register.getCC() | 8);
				System.out.println("OVERFLOW");
			} else if (result < -32768) {
				register.setCC(register.getCC() | 4);
				System.out.println("UNDERFLOW");
			} else
				register.setIndexReg(x, result);
			pipeline.setWB(result);
		}
	}

	// Trap instruction
	public static void trap(int trapCode) {
		// setting MFR for illegal trap code
		pipeline.setEXE(trapCode + cache.loadCache(0));
		if(cache.loadCache(trapCode + cache.loadCache(0)) == 0) {
			CPU cpu = new CPU();
			cpu.machineFault(1);
		}
		else {
			// storing PC+1 in memory[2] and setting PC value to the index of the
			// table(trapCode+memory[0])
			pipeline.setMEM(cache.loadCache(trapCode + cache.loadCache(0)));
			cache.writeCache(2, register.getPC());
			register.setPC(cache.loadCache(trapCode + cache.loadCache(0)));
		}
	}

	/**
	 * resetting the value of an index register
	 * @param x the index register to be reset
	 */
	public static void resetIndex(int x) {
		pipeline.setWB(0);
		register.setIndexReg(x, 0);
	}

	/**
	 * Copies the value of an index register into a general register
	 * @param r the register to hold the value
	 * @param x the index register whose value is to be copied into r
	 */
	public static void copyIndexToReg(int r, int x) {
		pipeline.setEXE(register.getIndexReg(x));
		
		register.setGeneralReg(r, register.getIndexReg(x));
		
		pipeline.setWB(register.getGeneralReg(r));
	}
	
	
	
	//Floating point and Vector operations
	/**
	 * Adding 2 vectors stored in memory
	 * @param fr store the length of the vectors
	 * @param ea store the address of the vectors or the address of where the address is
	 * @param i determines if the address is c(EA) or c(c(EA))
	 */
	public static void vectorAdd(int fr, int ea, int i) {
		int v1 = 0;
		int v2 = 0;
		
		//if I = 0, v1 = c(EA), v2 = c(EA + 1)
		v1 = cache.loadCache(ea);

		v2 = cache.loadCache(ea + 1);
		System.out.println("Vector 1 address:" + v1 + "\nVector 2 address: " + v2);
		
		
		// if I = 1, v1 = c(c(EA)), v2 = c(c(EA+1))
		if(i == 1) {
			v1 = cache.loadCache(v1);
			v2 = cache.loadCache(v2);
		}
		pipeline.setEXE(v1);
		
		for(int j = 0; j < register.getFloat(fr); j++) {
			cache.writeCache(v1, cache.loadCache(v1) + cache.loadCache(v2));
			pipeline.setMEM(cache.loadCache(v1));
			v1++;
			v2++;
		}
		
	}

	/**
	 * Subtracting 2 vectors stored in memory
	 * @param fr store the length of the vectors
	 * @param ea store the address of the vectors or the address of where the address is
	 * @param i determines if the address is c(EA) or c(c(EA))
	 */
	public static void vectorSub(int fr, int ea, int i) {
		int v1 = 0;
		int v2 = 0;
		
		//if I = 0, v1 = c(EA), v2 = c(EA + 1)
		v1 = cache.loadCache(ea);
		v2 = cache.loadCache(ea + 1);
		
		// if I = 1, v1 = c(c(EA)), v2 = c(c(EA+1))
		if(i == 1) {
			v1 = cache.loadCache(v1);
			v2 = cache.loadCache(v2);
		}
		
		pipeline.setEXE(v1);
		
		for(int j = 0; j < register.getFloat(fr); j++) {
			cache.writeCache(v1, cache.loadCache(v1) - cache.loadCache(v2));
			
			pipeline.setMEM(cache.loadCache(v1));
			
			v1++;
			v2++;
		}
	}

	
	/**
	 * converting a fixed number to a floating point number
	 * @param r the register to store the new number
	 * @param ea the address of the pre-converted number
	 */
	public static void convertToFixedFloat(int r, int ea) {
		int F = register.getGeneralReg(r);
		pipeline.setEXE(ea);
		//since the exponent is 7 bits Bias = 0111111
		int num = cache.loadCache(ea);
		pipeline.setMEM(num);
		//convert floating to fixed
		if (F == 0) {
			double floatNum = Helper.floatFormatToDec(num);
			
			System.out.println(floatNum);
			String result = "";
			
			if(floatNum < 0) {
				result = "1";
				floatNum = -floatNum;
			}
			else
			{
				result = "0";
			}
			String integer = Integer.toBinaryString((int)floatNum);

			
			while(integer.length() < 7) {
				integer = "0" + integer;
			}
			
			if(integer.length() > 7) {
				register.setCC(register.getCC() | 8);
				System.out.println("OVERFLOW");
				
				//since it's overflow, the value does not matter and is inaccurate
				integer = integer.substring(0,7);
			}
			System.out.println(integer);
			result += integer;
			
			
			result += Helper.fractionToString(floatNum - (int)floatNum);
			
			System.out.println(result);
			
			register.setGeneralReg(r, Helper.strToNum(result));
			pipeline.setWB(register.getGeneralReg(r));
			
		}
		//convert fixed to floating
		else if (F == 1) {
			register.setFloat(0, Helper.decToFloatFormat(Helper.fixedToDec(num)));
			pipeline.setWB(register.getFloat(0));
		}
		
	}
	
	
	// Floating Add Memory To Register
	/**
	 * Floating add
	 * @param fr the floating point register to add to
	 * @param ea contains the address of the value to add
	 * @param I whether direct or indirect
	 */
	public static void floatAdd(int fr, int ea, int I) {
		pipeline.setEXE(ea);
		if(fr == 0 || fr == 1) {
			
			int memVal = cache.loadCache(ea);
			pipeline.setMEM(memVal);
			
			double frVal = Helper.floatFormatToDec(register.getFloat(fr));
			if(I==1)
				memVal = cache.loadCache(cache.loadCache(ea));
			double result = frVal + Helper.floatFormatToDec(memVal);
			
			register.setFloat(fr, Helper.decToFloatFormat(result));
			pipeline.setWB(register.getFloat(fr));
		}
	}
	
	// Floating Subtract Memory From Register 
	/**
	 * Floating subtract
	 * @param fr the floating point register to subtract from to
	 * @param ea contains the address of the value to subtract
	 * @param I whether direct or indirect
	 */
	public static void floatSub(int fr, int ea, int I) {
		pipeline.setEXE(ea);
		if(fr == 0 || fr == 1) {
			
			int memVal = cache.loadCache(ea);
			pipeline.setMEM(memVal);
			
			double frVal = Helper.floatFormatToDec(register.getFloat(fr));
			if(I==1)
				memVal = cache.loadCache(memVal);
			
			double result = frVal - Helper.floatFormatToDec(memVal);
		
			register.setFloat(fr, Helper.decToFloatFormat(result));
			pipeline.setWB(register.getFloat(fr));
			
		}
	}
	
	// Load Floating Register From Memory
	/**
	 * Loading floating register from memory
	 * @param fr the floating register to load
	 * @param ea the address in memory
	 * @param I direct or indirect
	 */
	public static void loadFR(int fr, int ea, int I) {
		pipeline.setEXE(ea);
		int memVal = cache.loadCache(ea);
		if(I==1) {
			pipeline.setEXE(memVal);
			memVal = cache.loadCache(memVal);
		}
		pipeline.setMEM(memVal);
		
		register.setFloat(fr, memVal);
		pipeline.setWB(register.getFloat(fr));
		
	}
	
	// Store Floating Register To Memory
	/**
	 * Storing floating register to memory
	 * @param fr the floating register to store
	 * @param ea the address in memory
	 * @param I direct or indirect
	 */
	public static void storeFR(int fr, int ea, int I) {
		if(I==1) {
			ea = cache.loadCache(ea);
		}
		pipeline.setEXE(ea);
		
		cache.writeCache(ea, register.getFloat(fr));
		pipeline.setMEM(cache.loadCache(ea));
	}
	
	
}