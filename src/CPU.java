import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class CPU {
	public static Register register = Register.getInstance();
	public int halt = 0;
	public static Cache cache = Cache.getInstance();
	/**
	 * Reading IPL.txt file and saving instructions into memory
	 */
	public static void readIPL() { 
		resetRegister();
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		File dir = new File("");
		fileChooser.setCurrentDirectory(dir.getAbsoluteFile());
//		String pwd = System.clearProperty("user.dir");
//		fileChooser.setCurrentDirectory(new File(pwd));
		
		int response = fileChooser.showOpenDialog(null);
		if(response == JFileChooser.APPROVE_OPTION) {
			File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
			try {
				Scanner reader = new Scanner(file);

				while (reader.hasNextLine()) {
					String line = reader.nextLine();
					Helper.saveInstructionFromText(line);
				}

				reader.close();
			} catch (FileNotFoundException e) {
				System.out.println("File not found.");
				e.printStackTrace();
			}
		}

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

	public void machineFault(int ID) {
		switch(ID) {
		case 0: //Illegal memory address to reserved locations
			register.setMFR(1);
			break;
		case 1: //Illegal TRAP code
			register.setMFR(2);
			break;
		case 2: //Illegal Operation Code
			register.setMFR(4);
			break;
		case 3: //Illegal Memory Address beyond 2048 (memory installed)
			register.setMFR(8);
			break;
		}
		
		//Not sure about this part, but professor said it's this
		cache.writeCache(1, register.getMFR());
		
		cache.writeCache(4, register.getPC() + 1);
		
		register.setPC(cache.loadCache(1));
	}
}
