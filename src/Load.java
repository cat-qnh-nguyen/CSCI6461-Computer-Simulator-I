import java.io.*;

// A class to perform the loading of instructions and decoding them at the same time.
public class Load {

    //Decoded contents of the instructions
    public String instruction;	//Instruction in String form
    public int opcode;			//Opcode
    public int R;   			//General Register 
    public int IX;  			//Index Register
    public int I;   			//Indirect Bit
    public int address; 		//Address field in the instruction
    public int EA; 				//Effective address
    
    
    //Constructor for each object/instruction
    public Load() {}
    
    // Creating a memory and register instance
    public static Memory memory = Memory.getInstance();
    public static Register register = Register.getInstance();
    
    //Decodes instructions and separates them into opcode, R, IX, I and Address
    public void instructionDecode(String ins) {
        opcode = Integer.parseInt(ins.substring(0, 6),2);
        R = Integer.parseInt(ins.substring(6, 8),2);
        IX = Integer.parseInt(ins.substring(8, 10), 2);
        I = Integer.parseInt(ins.substring(10, 11), 2);
        address = Integer.parseInt(ins.substring(11, 16), 2);
        
        computeEA();
//        System.out.println("Opcode: " + opcode);
//        System.out.println("Register number: " + R);
//        System.out.println("Index register: " + IX);
//        System.out.println("Indirect bit: " + I);
//        System.out.println("Address: " + address);
    }


    /**
     * Loading the instruction from the memory and returning the value in String format
     * @param address is the address to fetch the instruction from
     * @return is the instruction in form of a string
     */
    public void loadInstruction(int memAddress) {
        int insInMem = memory.load(memAddress);
        
        instruction = Integer.toBinaryString(insInMem);
        instruction = String.format("%16s", instruction).replaceAll(" ", "0");
        
        //System.out.println(instruction);
        
        instructionDecode(instruction);
    }

    /**
     * Computes the EA and returns it
     * @param index register(IX), address, and indirect bit(I)
     */
    public void computeEA() {
        if (I == 0) // NO Indirect Addressing
        {         
        	if(IX == 0)
        	{
        		EA = address;
            }
        	else
        	{
        		EA = register.getIndexReg(IX) + address;
        	}
            //System.out.println("EA : " + EA);
        } 
        else if (I == 1)  // indirect addressing
        {             
        	if(IX == 0)
        	{
        		EA = memory.load(address);
        	}
        	else
        	{
        		EA = memory.load(register.getIndexReg(IX) + address);
        	}

        }
    }
    
    /**
     * Returning the effective address whenever necessary
     * @return EA
     */
    public int getEA() {
    	return EA;
    }
    
    /**
     * Loading Operations based on Opcode
     * 
     */
    public void runInstruction() {
    	switch(opcode) {
    		case 1: Operations.loadRegister(R, EA);					//load register from memory
    			System.out.println("loadRegister: "+ R + "\nEA: " + EA);
    			break;
    		case 2: Operations.storeRegister(R, EA);					//store register to memory
				System.out.println("storeRegister: "+ R + "\nEA: " + EA);
    			break;
    		case 3: Operations.loadAddress(R, EA);						//load register with address
				System.out.println("loadAddress: "+ R + "\nEA: " + EA);
    			break;
    		case 33: Operations.loadIndex(IX, EA);					//load index register from memory
				System.out.println("loadIndex: "+ IX + "\nEA: " + EA);
    			break;
    		case 34: Operations.storeIndex(IX, EA);					//store index register to memory
				System.out.println("storeIndex: "+ IX + "\nEA: " + EA);
    			break;
    		default: throw new IllegalArgumentException("Invalid instruction code.");
    	}
    }
    
    
    
//  /**
//  * Loads the instruction from the cache
//  *
//  * @param key of the instruction is the address from which the instruction is to be fetched from the cache
//  * @return is the value at the given key in the cache
//  */
//
// String loadFromCache(String key) {
//     long startTime = System.nanoTime();
//     String value = "";
//     if (cache.containsKey(key)) {
//             value = cache.get(key);
//     } else {
//         //key does not exists
//         if (cache.size()==16) {
//             String temp = cache.entrySet().iterator().next().getKey();
//             cache.remove(temp);
//         }
//         value = loadFromMemeory(key);
//         cache.put(key,value);
//         //System.out.println("Size of cache----->"+cache.size());
//     }
//     long endTime = System.nanoTime();
//     //System.out.println("Time taken to load from Cache: "+(endTime - startTime) + " ns");
//     return value;
// }
//
//
// /**
//  * Stores the instruction into the cache
//  *
//  * @param key,value specifies the address and the instruction to be stored in the cache
//  */
// void storeToCache(String key, String value) {
//
//     long startTime = System.nanoTime();
//     if (cache.size()==16) {
//         String temp = cache.entrySet().iterator().next().getKey();
//         cache.remove(temp);
//     }
//
//     cache.put(key,value);
//     long endTime = System.nanoTime();
//     //System.out.println("Time taken to store to Cache: "+(endTime - startTime) + " ns");
//     //System.out.println("Size of cache in store----->"+cache.size());
// }
}