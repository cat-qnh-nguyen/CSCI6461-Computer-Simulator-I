
public class Memory {
    /*
    * Memory of 2048 words, expandable to 4096 words
    * Each word is 2 bytes, which is the size of short in Java
    */
	// The size of the memory can be changed later to 4096 
	public static short[] memory = new short[2048];
	
	public Memory() {}
	
	public short load(int index) {
		return memory[index];
	}
	
	public void store(int index, short content) {
		memory[index] = content;
	}
}
