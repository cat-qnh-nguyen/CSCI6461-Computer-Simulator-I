import java.io.*;

// A class to perform the loading of instructions and decoding them at the same time.
public class load {

    //Decoded contents of the instructions
    String opcode;
    String R;
    String IX;
    String I;
    String Address;

    //Decodes instructions and seperates them into opcode, R, IX, I and Address
    public void DecodeInstructions(String ins) {

        opcode = ins.substring(0, 6);
        R = ins.substring(6, 8);
        IX = ins.substring(8, 10);
        I = ins.substring(10, 11);
        Address = ins.substring(11, 16);

        /*System.out.println(" Instruction decoded: " + opcode);
        *System.out.println(" Instruction decoded: " + R);
        *System.out.println(" Instruction decoded: " + IX);
        *System.out.println(" Instruction decoded: " + I);
        *System.out.println(" Instruction decoded: " + Address);
        */
    }


    /**
     * Loading the instruction from the memory and returning the value in String format
     * @param address is the address to fetch the instruction from
     * @return is the value at the given address
     */
    String LoadFromMemeory(String address) {
        String value = "";
        //System.out.println("Loading the " + address);

        for (int i = 0; i < 16; i++) {

            value = value + memory[Integer.valueOf(address)][i];
        }
        return value;
    }


    /**
     * Stores instruction into memory
     * @param address,value specifies the instruction and the address to be stored in the memory
     */
    void StoreIntoMemory(String address, String value) {

        int intAddress = Integer.parseInt(address, 2);
        //System.out.println("Address " + intAddress);
        //System.out.println("Value " + value.length());

        for (int i = 0; i < 16; i++) {
            //System.out.println("Value " + value);
            memory[intAddress][i] = Integer.parseInt(value.substring(0, 1));
            value = value.substring(1, value.length());

        }
    }


    /**
     * Loads the instruction from the cache
     *
     * @param key of the instruction is the address from which the instruction is to be fetched from the cache
     * @return is the value at the given key in the cache
     */

    String loadFromCache(String key) {
        long startTime = System.nanoTime();
        String value = "";
        if (cache.containsKey(key)) {
                value = cache.get(key);
        } else {
            //key does not exists
            if (cache.size()==16) {
                String temp = cache.entrySet().iterator().next().getKey();
                cache.remove(temp);
            }
            value = loadFromMemeory(key);
            cache.put(key,value);
            //System.out.println("Size of cache----->"+cache.size());
        }
        long endTime = System.nanoTime();
        //System.out.println("Time taken to load from Cache: "+(endTime - startTime) + " ns");
        return value;
    }


    /**
     * Stores the instruction into the cache
     *
     * @param key,value specifies the address and the instruction to be stored in the cache
     */
    void storeToCache(String key, String value) {

        long startTime = System.nanoTime();
        if (cache.size()==16) {
            String temp = cache.entrySet().iterator().next().getKey();
            cache.remove(temp);
        }

        cache.put(key,value);
        long endTime = System.nanoTime();
        //System.out.println("Time taken to store to Cache: "+(endTime - startTime) + " ns");
        //System.out.println("Size of cache in store----->"+cache.size());
    }

    /**
     *
     * Computes the EA and returns it
     */
    String computeEA() {
        //System.out.println(" IN EA : ");
        //System.out.println(" IN EA : I= " + I);

        String EA = "";

        if (I.equals("0")) {          // NO Indirect Addressing
            //System.out.println(" IN EA : I=0");

            switch (IX) {
                case "01":
                    EA = String.format("%12s", Integer.toBinaryString(Integer.parseInt(x1.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0');
                    break;
                case "10":
                    EA = String.format("%12s", Integer.toBinaryString(Integer.parseInt(x2.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0');
                    break;
                case "11":
                    EA = String.format("%12s", Integer.toBinaryString(Integer.parseInt(x3.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0');
                    break;
                default:
                    EA = Address;
                    break;
            }

            //System.out.println("EA : " + EA);

        } else if (I.equals("1")) {              // indirect addressing

            switch (IX) {
                case "01": 			// both indirect addressing and indexing
                    EA = loadFromCache(String.format("%12s", Integer.toBinaryString(Integer.parseInt(x1.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0'));
                    break;
                case "10": 			// both indirect addressing and indexing
                    EA = loadFromCache(String.format("%12s", Integer.toBinaryString(Integer.parseInt(x2.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0'));
                    break;
                case "11": 			// both indirect addressing and indexing
                    EA = Address;


                    break;
                default:  			// indirect addressing, but NO indexing
                    EA = loadFromCache(String.format("%12s", Integer.toBinaryString(Integer.parseInt(x3.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0'));
                    EA = Address;

                    break;
            }

        }
        return String.valueOf(Integer.valueOf(EA, 2));

    }

}