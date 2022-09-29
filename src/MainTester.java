//Tester
//Will be deleted
import java.io.*;

public class MainTester {
	//A tester class to test operations
	//to invoke the singular memory object for the whole project
	//public static 
	
	//Register myRegister = Register.getInstance();
	public static Memory myMemory = Memory.getInstance();
	public static Register myRegister = Register.getInstance();
	
	public static void main(String[] args) {
		
		String testInstruction = "0001 093F";
		
		int location = 01;
		short value = 89;
		
		int genReg = 2;

		//store 89 to memory[31]
		myMemory.store(31, value);
		
		Operations.loadRegister(3, 0, 31);
		
		myRegister.setIndexReg(1, 2);
		
		System.out.println("Mem[31]: " + myMemory.load(31));
		System.out.println("R0: " + myRegister.getGeneralReg(0));
		System.out.println("R3: " + myRegister.getGeneralReg(3));
		//saveInstruction("0001 019A");
		saveInstruction(testInstruction);
		
		//Creating a 

		Load instruction1 = new Load();
		
		String ins1 = Load.loadInstruction(1);
		instruction1.instructionDecode(ins1);
		
		System.out.println("The effective address is: "+ instruction1.computeEA());
	}
	
	
	//For reading the file with address and instruction in one line
	public static void saveInstruction(String instruction) {
		String addressStr = instruction.substring(0,4);
		String contentStr = instruction.substring(5);
		
		int address = Integer.parseInt(addressStr, 16);
		int content = Integer.parseInt(contentStr, 16);
		
		//Memory myMemory = Memory.getInstance();
		
		myMemory.store(address, content);
		System.out.println("Address: " + address + " has " + myMemory.load(address));
		
	}
	
}
