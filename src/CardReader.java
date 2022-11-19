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
	 * @param address is the address that indicates the beginning of the file.
	 */
	public static void readFromFile(int address){		
		status = 1;
		
		JFileChooser cardReader = new JFileChooser();
		cardReader.setFileSelectionMode(JFileChooser.FILES_ONLY);
		File dir = new File("");
		cardReader.setCurrentDirectory(dir.getAbsoluteFile());

		int response = cardReader.showOpenDialog(null);
		if(response == JFileChooser.APPROVE_OPTION) {
			File file = new File(cardReader.getSelectedFile().getAbsolutePath());
			
			try {
				Scanner reader = new Scanner(file);

				while (reader.hasNextLine()) {
					String line = reader.nextLine();

					int length = line.length();
					
					//Store each character into memory
					for(int i = 0; i < length; i++) {
						cache.writeCache(address, (int)line.charAt(i));
						address++;
					}
					//Store the new line
					cache.writeCache(address, (int)'\n');
					address++;
				}
				//Store the indicator of end of text
				cache.writeCache(address, 0);
				
				reader.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("File not found.");
				e.printStackTrace();
			}
		}
		status = 0;
		
	}
}
