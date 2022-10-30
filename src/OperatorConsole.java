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

        scrollPane1 = new JScrollPane();
        pnlPrinter.add(scrollPane1);

        txtField = new JLabel("Console Print");
        txtField.setBounds(10, 5, 95, 25);
        panel.add(txtField);

        consolePrinter = new JTextArea("");
        // consolePrinter.setBounds(5, 30, 754, 201);
        consolePrinter.setEditable(false);
        scrollPane1.setViewportView(consolePrinter);

        consoleKeyboard = new JTextField("");
        consoleKeyboard.setForeground(Color.GRAY);
        consoleKeyboard.setBounds(0, 517, 608, 45);
        panel.add(consoleKeyboard);

        enterBtn = new JButton("Enter");
        enterBtn.setBounds(607, 517, 100, 45);
        

        enterBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                if (consoleKeyboard.getText() == null || consoleKeyboard.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "type numbers in the console keyboard");

                } else {
                    printConsole("The number entered: ");
                    message = consoleKeyboard.getText();
                    
                    printConsole(message);
                    consoleKeyboard.setText("");
                }
            }
        });
 
        panel.add(enterBtn);
    }
    
    /**
     * decoding the message written by user
     * @param mes
     */
    public static int decodeMessage() {
//    	String hex = "";
//    	for(int i = 0; i < mes.length(); i++) {
//    		hex += charToHex(mes.substring(i,i+1));
//    		if (hex.length() == 4) {
//    			
//    		}
//    	}
    	message ="";
    	if(consoleKeyboard.getText() == null || consoleKeyboard.getText().length() == 0){
    		message = JOptionPane.showInputDialog(null, "Please enter the numbers in the console keyboard");

    	}
    	
    	return Integer.parseInt(message);
    	

    }
    
    public static String charToHex(String character) {
    	String result = "";
    	
    	return result;
    }

     /**
     * print a message in the console
     * @param message the message you want to print to console
     */
    public static void printConsole(String mes) {
        consolePrinter.append(mes + "\n");
    }
    
}