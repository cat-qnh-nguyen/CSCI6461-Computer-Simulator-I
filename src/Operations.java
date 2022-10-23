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
	public static void saveInstruction(String hexInstruction) {
		String addressStr = hexInstruction.substring(0,4);
		String contentStr = hexInstruction.substring(5);
		
		int address = Integer.parseInt(addressStr, 16);
		int content = Integer.parseInt(contentStr, 16);
		
		memory.store(address, content);
		System.out.println("Address: " + address + " has " + memory.load(address));
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

















}
