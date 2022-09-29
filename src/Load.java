import java.io.*;

// A class to perform the loading of instructions and decoding them at the same time.
public class Load {

    //Decoded contents of the instructions
    public int opcode;		//Opcode
    public int R;   		//General Register 
    public int IX;  		//Index Register
    public int I;   		//Indirect Bit
    public int address; 	//Address
    
    //Constructor for each object/instruction
    public Load() {}
    
    
    // Creating a memory and register instance
    public static Memory myMemory = Memory.getInstance();
    public static Register myRegister = Register.getInstance();
    
    //Decodes instructions and separates them into opcode, R, IX, I and Address
    public void instructionDecode(String ins) 
    {
        opcode = Integer.parseInt(ins.substring(0, 6),2);
        R = Integer.parseInt(ins.substring(6, 8),2);
        IX = Integer.parseInt(ins.substring(8, 10), 2);
        I = Integer.parseInt(ins.substring(10, 11), 2);
        address = Integer.parseInt(ins.substring(11, 16), 2);

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
    public static String loadInstruction(int address) {
        int instruction = myMemory.load(address);
        
        String result = Integer.toBinaryString(instruction);
        result = String.format("%16s", result).replaceAll(" ", "0");
        
        //System.out.println(result);
        return result;

    }

//    /**
//     * Stores instruction into memory
//     * @param address,value specifies the instruction and the address to be stored in the memory
//     */
//    public static void storeInstruction(int address, int value) {
//
//        int intAddress = Integer.parseInt(address, 2);
//        //System.out.println("Address " + intAddress);
//        //System.out.println("Value " + value.length());
//
//        for (int i = 0; i < 16; i++) {
//            //System.out.println("Value " + value);
//            memory[intAddress][i] = Integer.parseInt(value.substring(0, 1));
//            value = value.substring(1, value.length());
//
//        }
//    }


    /**
     * Computes the EA and returns it
     * @param index register(IX), address, and indirect bit(I)
     */
    public int computeEA() 
    {
        int EA = 0;

        if (I == 0) // NO Indirect Addressing
        {         
        	if(IX == 0)
        	{
        		EA = address;
            }
        	else
        	{
        		EA = myRegister.getIndexReg(IX) + address;
        	}
            //System.out.println("EA : " + EA);
        } 
        else if (I == 1)  // indirect addressing
        {             
        	if(IX == 0)
        	{
        		EA = myMemory.load(address);
        	}
        	else
        	{
        		EA = myMemory.load(myRegister.getIndexReg(IX) + address);
        	}

        }
        return EA;
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