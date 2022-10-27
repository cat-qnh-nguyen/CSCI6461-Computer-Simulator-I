public class Memory {
    /**
    * Memory of 2048 words, expandable to 4096 words
    * Each word is 2 bytes, which is the size of short in Java
    */
	// The size of the memory can be changed later to 4096 
	
	//Creating an Instance to ensure only one memory object is created
	private static Memory INSTANCE = new Memory();
	
	//Because Java does not have unsigned data types
	//we will use int and limit the value of data
	private int[] memory = new int[2048];
	
	//Max value is 2^16 which is 65535
	public final int MAX_16 = 32768;
	public final int MIN_16 = -32768;
	
	
	private Memory() {}
	private Memory(int size) {
		memory = new int[size];
	}
	
	//Singleton function to access the class
	public static Memory getInstance() {
		if(INSTANCE == null)
			INSTANCE = new Memory(2048);
		return INSTANCE;
	}
	
	/**
	 * load value from memory
	 * @param index the memory address
	 * @return value in memory[index]
	 */
	public int load(int index) {
		System.out.println("Load: memory[" + index + "] = " + memory[index] + "\n");
		return memory[index];
	}
	/**
	 * store value into memory
	 * @param index: the memory address
	 * @param content: value to be stored in memory
	 */
	public void store(int index, int content) {
		//Because we are only using 16 bits of the 32 bits of type int
		//we are not expecting any negative values
		if(content > MAX_16 || content < MIN_16)
			throw new IllegalArgumentException("Invalid Value.");
		
		memory[index] = content;
		System.out.println("Save: memory[" + index + "] = " + memory[index] +"\n");
	}
}