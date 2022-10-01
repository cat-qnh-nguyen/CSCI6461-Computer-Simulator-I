import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CPU {
	public static Memory memory = Memory.getInstance();
	public static Register register = Register.getInstance();
	
	/**
	 * Reading IPL.txt file and saving instructions into memory
	 */
	public static void readIPL() { 	//Not sure what to pass in: need the condition for when user hit the Init button
		resetRegister();
		try {
			File IPL = new File("IPL.txt");
			Scanner reader = new Scanner(IPL);
			
			int i = 0;
			//System.out.println("MAR: " + register.getMAR() + "\nMBR: " + register.getMBR() + "\nIR: " + register.getIR());
			
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				if(i == 0) {		//Just to test out the function
					String addressStr = line.substring(0,4);
					register.setPC(Integer.parseInt(addressStr, 16));	
				}

				Operations.saveInstruction(line);
				i++;
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		}	
	}
	
	
	/**
	 * Program runs after reading file, when the user hit run or SS
	 */
	public static void run() { 			
		//Making new instruction object
		Load instruction = new Load();
		do {
			register.setMAR(register.getPC()); 
			register.setMBR(memory.load(register.getMAR()));
			register.setIR(register.getMBR());

			
			//Loading instruction from memory
			instruction.loadInstruction(register.getIR());
			
			if(instruction.opcode == 0) {
				//System.out.println("Break happened.");
				break;		//HLT
			}

			
			instruction.runInstruction();
			
			//Test code print
			System.out.println("PC: " + register.getPC());
			
			//Increment PC
			register.setPC(register.getPC() + 1);
			System.out.println("PC: "+ register.getPC());

		} while(true);
	}
	
	
	/**
	 * Single stepping through the program
	 */
	public static void singleStep() {
		//Not sure if this step should be in here
		//Might move it around
		register.setMAR(register.getPC()); 
		register.setMBR(memory.load(register.getMAR()));
		register.setIR(register.getMBR());
		
		//Increment PC
		register.setPC(register.getPC() + 1);
		
		//Create new instruction and loading it from memory
		Load instruction = new Load();
		instruction.loadInstruction(register.getMAR());
		instruction.runInstruction();
		
		//Test code print
		System.out.println("PC: " + register.getPC());
		register.setPC(register.getPC() + 1);
	}
	
	
	/**
	 * Reseting all registers when user hit Init
	 */
	public static void resetRegister() {
		register.setPC(0);
		register.setGeneralReg(0, 0);
		register.setGeneralReg(1, 0);
		register.setGeneralReg(2, 0);
		register.setGeneralReg(3, 0);
		register.setIndexReg(1, 0);
		register.setIndexReg(2, 0);
		register.setIndexReg(3, 0);
		register.setIR(0);
		register.setMAR(0);
		register.setCC(0);
		register.setMBR(0);
		register.setMFR(0);
	}

}
