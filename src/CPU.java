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
		try {
			File IPL = new File("IPL.txt");
			Scanner reader = new Scanner(IPL);
			
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
				Operations.saveInstruction(line);
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		}
	}
	
	

}
