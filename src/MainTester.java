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
		
		myRegister.setIndexReg(1, 2);
		
		System.out.println("Mem[31]: " + myMemory.load(31));
		System.out.println("R0: " + myRegister.getGeneralReg(0));
		System.out.println("R3: " + myRegister.getGeneralReg(3));
		//saveInstruction("0001 019A");
		Operations.saveInstruction(testInstruction);
		
		//Creating an instruction
		Load instruction1 = new Load();
		
		instruction1.loadInstruction(1);
		
		//System.out.println("The effective address is: "+ instruction1.computeEA());
				
	}
}