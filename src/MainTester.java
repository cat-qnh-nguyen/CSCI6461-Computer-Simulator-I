//Tester
//Will be deleted
import java.io.*;

public class MainTester {
	//A tester class to test operations
	public static void main(String[] args) {
		
		String testInstruction = "0001 004F";
		
		int location = 01;
		short value = 79;
		
		int genReg = 2;
		
		Register.setGeneralReg(genReg, value);
		Register.setIndexReg(location, value);
		Register.R0 = 2;
		System.out.println(Register.R0);	
		
		decodeInstruction("0001 019A");
		decodeInstruction(testInstruction);
		
	}
	
	public static void decodeInstruction(String instruction) {
		String addressStr = instruction.substring(0,4);
		String contentStr = instruction.substring(5);
		int address = Integer.parseInt(addressStr, 16);
		short content = Short.parseShort(contentStr, 16);
		
		Memory.store(address, content);
		System.out.println(Memory.load(address));
	}
	
}
