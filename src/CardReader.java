//A class the simulates a card reader, or a file reader
//IN r, 2 (card reader) means that the register will hold the first address of the file
import java.util.concurrent.CountDownLatch;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;


public class CardReader {
	
	public static Memory memory = Memory.getInstance();
	public static Cache cache = Cache.getInstance();	
	public static Register register = Register.getInstance();
	public static Pipeline pipeline = Pipeline.getInstance();
	
	public static boolean saveStr = false; //saveStr = false: IN; saveStr = true: INS
	public static int status = 0; //status 0 means free, 1 means busy
	
	
	/**
	 * @return the status of the device
	 */
	public static int getStatus() {
		return status;
	}
	
	public static void setStatus(int newStatus) {
		status = newStatus;
	}
	
	/**
	 * Reading from the file and storing it into memory
	 * @param r is the address that indicates the beginning of the file or the register number
	 * @param mode indicates whether to save into the register or into memory
	 */
	public static void readFromFile(int r, boolean mode){		
		status = 1;
		saveStr = mode;
		
		JFileChooser cardReader = new JFileChooser();
		cardReader.setFileSelectionMode(JFileChooser.FILES_ONLY);
		File dir = new File("");
		cardReader.setCurrentDirectory(dir.getAbsoluteFile());

		int response = cardReader.showOpenDialog(null);
		if(response == JFileChooser.APPROVE_OPTION) {
			File file = new File(cardReader.getSelectedFile().getAbsolutePath());
			
			try {
				Scanner reader = new Scanner(file);
				//saveStr = true means save to memory and rOrAdd serves as a memory address
				if(saveStr) {
					int add = register.getGeneralReg(r);
					pipeline.setEXE(add);
					
					while (reader.hasNextLine()) {
						String line = reader.nextLine();
	
						int length = line.length();
						

						//Store each character into memory
						for(int i = 0; i < length; i++) {
							cache.writeCache(add, (int)line.charAt(i));
							pipeline.setMEM((int)line.charAt(i));
							add++;
						}
						//Store the new line
						cache.writeCache(add, (int)'\n');
						add++;
					}
					//Store the indicator of end of text
					cache.writeCache(add, 0);
					
				}
				
				//if not the first character is saved into the register
				else {
					String line = reader.nextLine();
					register.setGeneralReg(r, (int)line.charAt(0));
					pipeline.setWB(register.getGeneralReg(r));
				}
				
				reader.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("File not found.");
				e.printStackTrace();
			}
		}
		status = 0;	
	}
	

}
