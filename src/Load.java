import java.io.*;

// A class to perform the loading of instructions and decoding them at the same time.
public class load {

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
}