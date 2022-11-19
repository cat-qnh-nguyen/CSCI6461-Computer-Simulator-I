import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
import java.util.concurrent.CountDownLatch;

public class OperatorConsole {
    public JFrame frame;
    public static JDialog d;
    public JPanel panel;
    public JPanel pnlPrinter;
    public JScrollPane scrollPane1;
    public JScrollPane scrollPane2;
    public JLabel txtField;
    public JPanel pnlKeyboard;
    public static JTextArea consolePrinter;
    public static JTextField consoleKeyboard;
    public JButton enterBtn;
    public String temp; //the variable of the input box
    public int counter = 0;
	public static String numbers [] = new String [21];
    
    
 
    //The Console User Interface
    public OperatorConsole(){
        d = new JDialog(); 
        d.setTitle("CISC Operators Console"); 
        d.setVisible(true); 
        d.setSize(800,600); 
        d.setLocation(800,40);
        d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		d.setContentPane(panel);
		panel.setLayout(null);


        pnlPrinter = new JPanel();
        pnlPrinter.setBounds(5, 30, 754, 401);
        pnlPrinter.setLayout(new BoxLayout(pnlPrinter, BoxLayout.Y_AXIS));
        panel.add(pnlPrinter);

        pnlKeyboard = new JPanel();
        pnlKeyboard.setBounds(5, 520, 554, 41);
        pnlKeyboard.setLayout(new BoxLayout(pnlKeyboard, BoxLayout.Y_AXIS));
        panel.add(pnlKeyboard);

        //Scroll Panel for Console Printer
        scrollPane1 = new JScrollPane();
        pnlPrinter.add(scrollPane1);

        scrollPane2 = new JScrollPane();
        pnlKeyboard.add(scrollPane2);

        txtField = new JLabel("Console Print");
        txtField.setBounds(10, 5, 95, 25);
        panel.add(txtField);

        consolePrinter = new JTextArea("");
        consolePrinter.setEditable(false);
        scrollPane1.setViewportView(consolePrinter);

        consoleKeyboard = new JTextField("");
        consoleKeyboard.setForeground(Color.GRAY);
        scrollPane2.setViewportView(consoleKeyboard);

        consoleKeyboard.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    pushData();
                }
            }
        });

        enterBtn = new JButton("Enter");
        enterBtn.setBounds(561, 520, 74, 41);
        enterBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
                pushData();
			}
		});
        panel.add(enterBtn);
    }
    
    /**
     * decoding the message written by user
     * @param mes
     */
    // public static void decodeMessage() {
    // 	return Integer.parseInt(dataBuffer);
    // }
    
    public void pushData() {
        temp = consoleKeyboard.getText();
        numbers[counter] = temp;
        OperatorConsole.printConsole(numbers[counter]);
        counter = counter + 1;
        consoleKeyboard.setText("");
        if(counter == numbers.length -1){
            OperatorConsole.printConsole("Enter the number to compare");
        }
        // if(counter == numbers.length){
        //     d.dispose();
        // }
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
        consolePrinter.append(mes + "\n");
    }
}