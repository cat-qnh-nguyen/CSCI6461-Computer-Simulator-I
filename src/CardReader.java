//A class the simulates a card reader, or a file reader
//IN r, 2 (card reader) means that the register will hold the first address of the file
import java.util.concurrent.CountDownLatch;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class CardReader {
	public void run() throws InterruptedException {
		//CountdownLatch here
		CountDownLatch IO = new CountDownLatch(1);
		
		
	}
	
	public void readFromFile() {
		JFileChooser cardReader = new JFileChooser();
		cardReader.setFileSelectionMode(JFileChooser.FILES_ONLY);
		File dir = new File("");
		cardReader.setCurrentDirectory(dir.getAbsoluteFile());
		File card = cardReader.getSelectedFile();
		if(card != null) {
			
		}
	}
}
