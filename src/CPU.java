import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class CPU {
	public static Register register = Register.getInstance();
	public int halt = 0;

	/**
	 * Reading IPL.txt file and saving instructions into memory
	 */
	public static void readIPL() { 
		resetRegister();
		JFileChooser fileChooser = new JFileChooser();
		String pwd = System.clearProperty("user.dir");
		fileChooser.setCurrentDirectory(new File(pwd));
		int response = fileChooser.showOpenDialog(null);
		if(response == JFileChooser.APPROVE_OPTION) {
			File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
			try {
				Scanner reader = new Scanner(file);

				while (reader.hasNextLine()) {
					String line = reader.nextLine();
					Operations.saveInstructionFromText(line);
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

}
