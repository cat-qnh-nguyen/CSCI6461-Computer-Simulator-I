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
			
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				//System.out.println(line);
				Operations.saveInstruction(line);
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
		register.setPC(1);
		
		
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
