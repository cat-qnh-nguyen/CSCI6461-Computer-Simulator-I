//Tester
//Will be deleted
import java.io.*;

public class MainTester {
	//A tester class to test operations
	//to invoke the singular memory object for the whole project
	//public static 
	
	public static Register systemReg = new Register();
	
	public static void main(String[] args) {
		
		String testInstruction = "0001 004F";
		
		int location = 01;
		short value = 79;
		
		int genReg = 2;
		

		
		saveInstruction("0001 019A");
		saveInstruction(testInstruction);
		
	}
	
	public static void saveInstruction(String instruction) {
		String addressStr = instruction.substring(0,4);
		String contentStr = instruction.substring(5);
		int address = Integer.parseInt(addressStr, 16);
		short content = Short.parseShort(contentStr, 16);
		
		Memory myMemory = Memory.getInstance();
		
		myMemory.store(address, content);
		System.out.println(myMemory.load(address));
		
	}
	
}
