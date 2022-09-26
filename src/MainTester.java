//Tester
//Will be deleted
import java.io.*;

public class MainTester {
	//A tester class to test operations
	public static void main(String[] args) {
		
		String testInstruction = "0001 004F";
		
		int location = 0;
		short value = 79;
		
		int genReg = 2;
		
		Register.setGeneralReg(genReg, value);
		//Register.setIndexReg(location, value);
		//System.out.println(hexStringToInt("12BA"));	
		
		decodeInstruction("0001 019A");
		
	}
	
	public static void decodeInstruction(String instruction) {
		String addressStr = instruction.substring(0,4);
		String contentStr = instruction.substring(5);
		int address = Integer.parseInt(addressStr, 16);
		short content = Short.parseShort(contentStr, 16);
		
		Memory.store(address, content);
		System.out.println(Memory.load(address));
	}
	
	//Probably won't need this function but will put here for now
	public static short hexStringToInt (String hex) {
		return Short.parseShort(hex, 16);
	}
}
