public class Memory {
    /*
    * Memory of 2048 words, expandable to 4096 words
    * Each word is 2 bytes, which is the size of short in Java
    */
	// The size of the memory can be changed later to 4096 
	
	//Creating an Instance to ensure only one memory object is created
	private static Memory INSTANCE = new Memory();
	private short[] memory = new short[2048];
	
	private Memory() {}
	private Memory(int size) {
		memory = new short[size];
	}
	
	//Singleton function to access the class
	public static Memory getInstance() {
		if(INSTANCE == null)
			INSTANCE = new Memory(2048);
		return INSTANCE;
	}
	
	//load and store into memory
	public short load(int index) {
		return memory[index];
	}
	
	public void store(int index, short content) {
		memory[index] = content;
	}
}
