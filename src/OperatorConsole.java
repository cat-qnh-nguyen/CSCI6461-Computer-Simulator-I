import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class OperatorConsole {
    public JFrame frame;
    public JPanel panel;
    public JPanel pnlPrinter;
    public JScrollPane scrollPane1;
    public JLabel txtField;
    public JPanel pnlKeyboard;
    public static JTextArea consolePrinter;
    public static JTextField consoleKeyboard;
    public JButton enterBtn;
    public static String message;
    
    public static int keyboardStatus = 0;
    public static int printerStatus = 0;
 
    //The Console User Interface
    public OperatorConsole(){
        frame = new JFrame();
        frame.setTitle("CISC Operators Console");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
        frame.setVisible(true);

        panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(panel);
		panel.setLayout(null);

        pnlPrinter = new JPanel();
        pnlPrinter.setBounds(5, 30, 754, 401);
        pnlPrinter.setLayout(new BoxLayout(pnlPrinter, BoxLayout.Y_AXIS));
        panel.add(pnlPrinter);

        //Scroll Panel for Console Printer
        scrollPane1 = new JScrollPane();
        pnlPrinter.add(scrollPane1);

        txtField = new JLabel("Console Print");
        txtField.setBounds(10, 5, 95, 25);
        panel.add(txtField);

        consolePrinter = new JTextArea("");
        consolePrinter.setEditable(false);
        scrollPane1.setViewportView(consolePrinter);

        consoleKeyboard = new JTextField("");
        consoleKeyboard.setForeground(Color.GRAY);
        panel.add(consoleKeyboard);
    }
    
    /**
     * decoding the message written by user
     * @param mes
     */
    public static String decodeMessage() {
    	keyboardStatus = 1;
    	message ="";
    	if(consoleKeyboard.getText() == null || consoleKeyboard.getText().length() == 0){
    		message = JOptionPane.showInputDialog(null);

    	}
    	keyboardStatus = 0;
    	return message;
    }
    
    /**
     * converting the char to hex
     * @param character
     */
    public static String charToHex(String character) {
    	String result = "";	
    	return result;
    }

     /**
     * print a message in the console
     * @param message the message you want to print to console
     */
    public static void printConsole(String mes) {
    	printerStatus = 0;
        consolePrinter.append(mes);
        printerStatus = 1;
    }  
}