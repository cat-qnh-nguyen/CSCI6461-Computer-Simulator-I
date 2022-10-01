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
}
