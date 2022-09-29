public class Operations {
	//Creating a memory object that points to the singleton
	public static Memory myMemory = Memory.getInstance();
	
	//Creating a register object that points to the singleton
	public static Register myRegister = Register.getInstance();
	
	
	/**
	 * Loading the content of an address in memory to a general register
	 * @param the register number, index register, address, indirect bit
	 */
	//Regular method with Indirect bit
	public static void loadRegister(int reg, int indexReg, int effAddress, int indirect)
	{
		myRegister.setGeneralReg(reg, myMemory.load(effAddress));
	}
	
	//Overloading method without Indirect bit
	public static void loadRegister(int reg, int indexReg, int effAddress)
	{
		System.out.println("R0: " + myRegister.getGeneralReg(0));
	}
	
	
	/**
	 * Storing the content of a register into memory
	 * @param the register number, index register, address, indirect bit
	 */
	public static void storeRegister(int reg, int indexReg, int effAddress, int indirect)
	{
		myMemory.store(effAddress, myRegister.getGeneralReg(reg));
	}
	
	//Overloaded method without indirect bit
	public static void storeRegister(int reg, int indexReg, int effAddres) 
	{
		myMemory.store(effAddres, myRegister.getGeneralReg(reg));
	}
	
	
	/**
	 * Load register with the address (r <- EA)
	 * @param register number, index register, address, indirect bit
	 */
	public static void loadAddress(int reg, int indexReg, int effAddress, int indirect)
	{
		myRegister.setGeneralReg(reg, myMemory.load(effAddress));
	}
	
	//Overloaded method without indirect bit
	public static void loadAddress(int reg, int indexReg, int effAddress)
	{
		myRegister.setGeneralReg(reg, myMemory.load(effAddress));
	}
	
	
	/*
	 * Load index register from memory
	 * @param register number, index number, address, indirect bit
	 */
	public static void loadIndex(int reg, int indexReg, int effAddress, int indirect)
	{
		//myRegister.setIndexReg(reg, );
	}
}
