import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class OperatorConsole {
    private StringBuilder screenContent = new StringBuilder();
    private String banner = "Welcome to CISC Computer Simulator!";
    private String arrow = "\n> ";

    public OperatorConsole(){
        JFrame frame = new JFrame();
        frame.setTitle("CISC Operators Console");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
        frame.setVisible(true);
        screenContent.append(banner).append(arrow);

        JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(panel);
		panel.setLayout(null);

        JLabel txtField = new JLabel("Console Print");
        txtField.setBounds(10, 5, 95, 25);
        panel.add(txtField);

        JTextArea consolePrinter = new JTextArea("");
        consolePrinter.setBounds(5, 30, 754, 401);
        consolePrinter.setEditable(false);
        panel.add(consolePrinter);

        JTextField searchText = new JTextField("");
        searchText.setBounds(0, 517, 608, 45);
        searchText.setForeground(Color.GRAY);
        panel.add(searchText);

        JButton enterBtn = new JButton("Enter");
        enterBtn.setBounds(607, 517, 100, 45);
        panel.add(enterBtn);
    }
}
