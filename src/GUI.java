import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.StringJoiner;

import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {
	public static CPU CPU = new CPU();
	public JTextField GPR_0_TF1;
	public JTextField GPR_0_TF2;
	public JTextField GPR_0_TF3;
	public JTextField GPR_0_TF4;
	public JTextField GPR_0_TF5;
	public JTextField GPR_0_TF6;
	public JTextField GPR_0_TF7;
	public JTextField GPR_0_TF8;
	public JTextField GPR_0_TF9;
	public JTextField GPR_0_TF10;
	public JTextField GPR_0_TF11;
	public JTextField GPR_0_TF12;
	public JTextField GPR_0_TF13;
	public JTextField GPR_0_TF14;
	public JTextField GPR_0_TF15;
	public JTextField GPR_0_TF16;
	public JTextField GPR_1_TF1;
	public JTextField GPR_1_TF2;
	public JTextField GPR_1_TF3;
	public JTextField GPR_1_TF4;
	public JTextField GPR_1_TF5;
	public JTextField GPR_1_TF6;
	public JTextField GPR_1_TF7;
	public JTextField GPR_1_TF8;
	public JTextField GPR_1_TF9;
	public JTextField GPR_1_TF10;
	public JTextField GPR_1_TF11;
	public JTextField GPR_1_TF12;
	public JTextField GPR_1_TF13;
	public JTextField GPR_1_TF14;
	public JTextField GPR_1_TF15;
	public JTextField GPR_1_TF16;
	public JTextField GPR_2_TF1;
	public JTextField GPR_2_TF2;
	public JTextField GPR_2_TF3;
	public JTextField GPR_2_TF4;
	public JTextField GPR_2_TF5;
	public JTextField GPR_2_TF6;
	public JTextField GPR_2_TF7;
	public JTextField GPR_2_TF8;
	public JTextField GPR_2_TF9;
	public JTextField GPR_2_TF10;
	public JTextField GPR_2_TF11;
	public JTextField GPR_2_TF12;
	public JTextField GPR_2_TF13;
	public JTextField GPR_2_TF14;
	public JTextField GPR_2_TF15;
	public JTextField GPR_2_TF16;
	public JTextField GPR_3_TF1;
	public JTextField GPR_3_TF2;
	public JTextField GPR_3_TF3;
	public JTextField GPR_3_TF4;
	public JTextField GPR_3_TF5;
	public JTextField GPR_3_TF6;
	public JTextField GPR_3_TF7;
	public JTextField GPR_3_TF8;
	public JTextField GPR_3_TF9;
	public JTextField GPR_3_TF10;
	public JTextField GPR_3_TF11;
	public JTextField GPR_3_TF12;
	public JTextField GPR_3_TF13;
	public JTextField GPR_3_TF14;
	public JTextField GPR_3_TF15;
	public JTextField GPR_3_TF16;
	public JTextField IXR_1_TF1;
	public JTextField IXR_1_TF2;
	public JTextField IXR_1_TF3;
	public JTextField IXR_1_TF4;
	public JTextField IXR_1_TF5;
	public JTextField IXR_1_TF6;
	public JTextField IXR_1_TF7;
	public JTextField IXR_1_TF8;
	public JTextField IXR_1_TF9;
	public JTextField IXR_1_TF10;
	public JTextField IXR_1_TF11;
	public JTextField IXR_1_TF12;
	public JTextField IXR_1_TF13;
	public JTextField IXR_1_TF14;
	public JTextField IXR_1_TF15;
	public JTextField IXR_1_TF16;
	public JTextField IXR_2_TF1;
	public JTextField IXR_2_TF2;
	public JTextField IXR_2_TF3;
	public JTextField IXR_2_TF4;
	public JTextField IXR_2_TF5;
	public JTextField IXR_2_TF6;
	public JTextField IXR_2_TF7;
	public JTextField IXR_2_TF8;
	public JTextField IXR_2_TF9;
	public JTextField IXR_2_TF10;
	public JTextField IXR_2_TF11;
	public JTextField IXR_2_TF12;
	public JTextField IXR_2_TF13;
	public JTextField IXR_2_TF14;
	public JTextField IXR_2_TF15;
	public JTextField IXR_2_TF16;
	public JTextField IXR_3_TF1;
	public JTextField IXR_3_TF2;
	public JTextField IXR_3_TF3;
	public JTextField IXR_3_TF4;
	public JTextField IXR_3_TF5;
	public JTextField IXR_3_TF6;
	public JTextField IXR_3_TF7;
	public JTextField IXR_3_TF8;
	public JTextField IXR_3_TF9;
	public JTextField IXR_3_TF10;
	public JTextField IXR_3_TF11;
	public JTextField IXR_3_TF12;
	public JTextField IXR_3_TF13;
	public JTextField IXR_3_TF14;
	public JTextField IXR_3_TF15;
	public JTextField IXR_3_TF16;
	public JTextField textPc_1;
	public JTextField textPc_2;
	public JTextField textPc_3;
	public JTextField textPc_4;
	public JTextField textPc_5;
	public JTextField textPc_6;
	public JTextField textPc_7;
	public JTextField textPc_8;
	public JTextField textPc_9;
	public JTextField textPc_10;
	public JTextField textPc_11;
	public JTextField textPc_12;
	public JTextField textMar_1;
	public JTextField textMar_2;
	public JTextField textMar_3;
	public JTextField textMar_4;
	public JTextField textMar_5;
	public JTextField textMar_6;
	public JTextField textMar_7;
	public JTextField textMar_8;
	public JTextField textMar_9;
	public JTextField textMar_10;
	public JTextField textMar_11;
	public JTextField textMar_12;
	public JTextField textMar_13;
	public JTextField textMar_14;
	public JTextField textMar_15;
	public JTextField textMar_16;
	public JTextField textMbr_1;
	public JTextField textMbr_2;
	public JTextField textMbr_3;
	public JTextField textMbr_4;
	public JTextField textMbr_5;
	public JTextField textMbr_6;
	public JTextField textMbr_7;
	public JTextField textMbr_8;
	public JTextField textMbr_9;
	public JTextField textMbr_10;
	public JTextField textMbr_11;
	public JTextField textMbr_12;
	public JTextField textMbr_13;
	public JTextField textMbr_14;
	public JTextField textMbr_15;
	public JTextField textMbr_16;
	public JTextField textIR_1;
	public JTextField textIR_2;
	public JTextField textIR_3;
	public JTextField textIR_4;
	public JTextField textIR_5;
	public JTextField textIR_6;
	public JTextField textIR_7;
	public JTextField textIR_8;
	public JTextField textIR_9;
	public JTextField textIR_10;
	public JTextField textIR_11;
	public JTextField textIR_12;
	public JTextField textIR_13;
	public JTextField textIR_14;
	public JTextField textIR_15;
	public JTextField textIR_16;
	public JTextField textFR_0_1;
	public JTextField textFR_0_2;
	public JTextField textFR_0_3;
	public JTextField textFR_0_4;
	public JTextField textFR_0_5;
	public JTextField textFR_0_6;
	public JTextField textFR_0_7;
	public JTextField textFR_0_8;
	public JTextField textFR_0_9;
	public JTextField textFR_0_10;
	public JTextField textFR_0_11;
	public JTextField textFR_0_12;
	public JTextField textFR_0_13;
	public JTextField textFR_0_14;
	public JTextField textFR_0_15;
	public JTextField textFR_0_16;
	public JTextField textFR_1_1;
	public JTextField textFR_1_2;
	public JTextField textFR_1_3;
	public JTextField textFR_1_4;
	public JTextField textFR_1_5;
	public JTextField textFR_1_6;
	public JTextField textFR_1_7;
	public JTextField textFR_1_8;
	public JTextField textFR_1_9;
	public JTextField textFR_1_10;
	public JTextField textFR_1_11;
	public JTextField textFR_1_12;
	public JTextField textFR_1_13;
	public JTextField textFR_1_14;
	public JTextField textFR_1_15;
	public JTextField textFR_1_16;
	public JTextField MFR_TF1;
	public JTextField MFR_TF2;
	public JTextField MFR_TF3;
	public JTextField MFR_TF4;
	public JButton btnNewButton_15;
	public JButton btnNewButton_14;
	public JButton btnNewButton_13;
	public JButton btnNewButton_12;
	public JButton btnNewButton_11;
	public JButton btnNewButton_10;
	public JButton btnNewButton_9;
	public JButton btnNewButton_8;
	public JButton btnNewButton_7;
	public JButton btnNewButton_6;
	public JButton btnNewButton_5;
	public JButton btnNewButton_4;
	public JButton btnNewButton_3;
	public JButton btnNewButton_2;
	public JButton btnNewButton_1;
	public JButton btnNewButton_0;
	public JButton commonbtn;
	
	
	 String op_bit0;
	 String op_bit1;
	 String op_bit2;
	 String op_bit3;
	 String op_bit4;
	 String op_bit5;
	 String gpr_bit1;
	 String gpr_bit0;
	 String ixr_bit1;
	 String ixr_bit0;
	 String i;
	 String ip_add_4_bit;
	 String ip_add_3_bit;
	 String ip_add_2_bit;
	 String ip_add_1_bit;
	 String ip_add_0_bit;
	 String instruction, operation, address, gpr, ixr;

	public Register register = Register.getInstance();
	
	//No need for memory instance now that cache is implemented
	//public Memory memory = Memory.getInstance();
	
	public Cache cache = Cache.getInstance();
	
	String data[] = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
					//Opening the Console at the same time the GUI is opened
					OperatorConsole OperatorConsole = new OperatorConsole();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//The user interface
	public GUI() {
		setTitle("User Interface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 650);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);

		//Buttons for the input field
		btnNewButton_15 = new JButton("15");
		btnNewButton_15.setBounds(20, 250, 48, 45);
		btnNewButton_15.setText("0");
		btnNewButton_15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_15;
				setBtnvalue(0);

			}
		});
		panel.add(btnNewButton_15);

		btnNewButton_14 = new JButton("14");
		btnNewButton_14.setBounds(64, 250, 48, 45);
		btnNewButton_14.setText("0");
		btnNewButton_14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_14;
				setBtnvalue(1);
			}
		});
		panel.add(btnNewButton_14);

		btnNewButton_13 = new JButton("13");
		btnNewButton_13.setBounds(108, 250, 48, 45);
		btnNewButton_13.setText("0");
		btnNewButton_13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_13;
				setBtnvalue(2);
			}
		});
		panel.add(btnNewButton_13);

		btnNewButton_12 = new JButton("12");
		btnNewButton_12.setBounds(152, 250, 48, 45);
		btnNewButton_12.setText("0");
		btnNewButton_12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_12;
				setBtnvalue(3);
			}
		});
		panel.add(btnNewButton_12);

		btnNewButton_11 = new JButton("11");
		btnNewButton_11.setBounds(196, 250, 48, 45);
		btnNewButton_11.setText("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_11;
				setBtnvalue(4);
			}
		});
		panel.add(btnNewButton_11);

		btnNewButton_10 = new JButton("10");
		btnNewButton_10.setBounds(240, 250, 48, 45);
		btnNewButton_10.setText("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_10;
				setBtnvalue(5);
			}
		});
		panel.add(btnNewButton_10);

		btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBounds(294, 250, 48, 45);
		btnNewButton_9.setText("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_9;
				setBtnvalue(6);
			}
		});
		panel.add(btnNewButton_9);

		btnNewButton_8 = new JButton("8");
		btnNewButton_8.setBounds(338, 250, 48, 45);
		btnNewButton_8.setText("0");
		btnNewButton_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_8;
				setBtnvalue(7);
			}
		});
		panel.add(btnNewButton_8);

		btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBounds(392, 250, 48, 45);
		btnNewButton_7.setText("0");
		btnNewButton_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_7;
				setBtnvalue(8);
			}
		});
		panel.add(btnNewButton_7);

		btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBounds(436, 250, 48, 45);
		btnNewButton_6.setText("0");
		btnNewButton_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_6;
				setBtnvalue(9);
			}
		});
		panel.add(btnNewButton_6);

		btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBounds(490, 250, 48, 45);
		btnNewButton_5.setText("0");
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_5;
				setBtnvalue(10);
			}
		});
		panel.add(btnNewButton_5);

		btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBounds(544, 250, 48, 45);
		btnNewButton_4.setText("0");
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_4;
				setBtnvalue(11);
			}
		});
		panel.add(btnNewButton_4);

		btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBounds(588, 250, 48, 45);
		btnNewButton_3.setText("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_3;
				setBtnvalue(12);
			}
		});
		panel.add(btnNewButton_3);

		btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBounds(632, 250, 48, 45);
		btnNewButton_2.setText("0");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_2;
				setBtnvalue(13);
			}
		});
		panel.add(btnNewButton_2);

		btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(676, 250, 48, 45);
		btnNewButton_1.setText("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_1;
				setBtnvalue(14);
			}
		});
		panel.add(btnNewButton_1);

		btnNewButton_0 = new JButton("0");
		btnNewButton_0.setBounds(720, 250, 48, 45);
		btnNewButton_0.setText("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				commonbtn = btnNewButton_0;
				setBtnvalue(15);
			}
		});
		panel.add(btnNewButton_0);

		// Labels for GPR0
		JLabel lblGPR_0 = new JLabel("GPR 0");
		lblGPR_0.setBounds(20, 20, 41, 16);
		panel.add(lblGPR_0);

		GPR_0_TF1 = new JTextField("0");
		GPR_0_TF1.setBounds(65, 20, 20, 16);
		panel.add(GPR_0_TF1);

		GPR_0_TF2 = new JTextField("0");
		GPR_0_TF2.setBounds(85, 20, 20, 16);
		panel.add(GPR_0_TF2);

		GPR_0_TF3 = new JTextField("0");
		GPR_0_TF3.setBounds(105, 20, 20, 16);
		panel.add(GPR_0_TF3);

		GPR_0_TF4 = new JTextField("0");
		GPR_0_TF4.setBounds(125, 20, 20, 16);
		panel.add(GPR_0_TF4);

		GPR_0_TF5 = new JTextField("0");
		GPR_0_TF5.setBounds(145, 20, 20, 16);
		panel.add(GPR_0_TF5);

		GPR_0_TF6 = new JTextField("0");
		GPR_0_TF6.setBounds(165, 20, 20, 16);
		panel.add(GPR_0_TF6);

		GPR_0_TF7 = new JTextField("0");
		GPR_0_TF7.setBounds(185, 20, 20, 16);
		panel.add(GPR_0_TF7);

		GPR_0_TF8 = new JTextField("0");
		GPR_0_TF8.setBounds(205, 20, 20, 16);
		panel.add(GPR_0_TF8);

		GPR_0_TF9 = new JTextField("0");
		GPR_0_TF9.setBounds(225, 20, 20, 16);
		panel.add(GPR_0_TF9);

		GPR_0_TF10 = new JTextField("0");
		GPR_0_TF10.setBounds(245, 20, 20, 16);
		panel.add(GPR_0_TF10);

		GPR_0_TF11 = new JTextField("0");
		GPR_0_TF11.setBounds(265, 20, 20, 16);
		panel.add(GPR_0_TF11);

		GPR_0_TF12 = new JTextField("0");
		GPR_0_TF12.setBounds(285, 20, 20, 16);
		panel.add(GPR_0_TF12);

		GPR_0_TF13 = new JTextField("0");
		GPR_0_TF13.setBounds(305, 20, 20, 16);
		panel.add(GPR_0_TF13);

		GPR_0_TF14 = new JTextField("0");
		GPR_0_TF14.setBounds(325, 20, 20, 16);
		panel.add(GPR_0_TF14);

		GPR_0_TF15 = new JTextField("0");
		GPR_0_TF15.setBounds(345, 20, 20, 16);
		panel.add(GPR_0_TF15);

		GPR_0_TF16 = new JTextField("0");
		GPR_0_TF16.setBounds(365, 20, 20, 16);
		panel.add(GPR_0_TF16);

		JButton GPR_0_loadBtn = new JButton("LD");
		  GPR_0_loadBtn.setBounds(395, 20, 55, 16);
		  GPR_0_loadBtn.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				GPRloadBtn();	
				LD_button(instruction, 1);
				display();
			  }
		  });
		  panel.add(GPR_0_loadBtn);

		// GPR1
		JLabel lblGPR_1 = new JLabel("GPR 1");
		lblGPR_1.setBounds(20, 40, 41, 16);
		panel.add(lblGPR_1);

		GPR_1_TF1 = new JTextField("0");
		GPR_1_TF1.setBounds(65, 40, 20, 16);
		panel.add(GPR_1_TF1);

		GPR_1_TF2 = new JTextField("0");
		GPR_1_TF2.setBounds(85, 40, 20, 16);
		panel.add(GPR_1_TF2);

		GPR_1_TF3 = new JTextField("0");
		GPR_1_TF3.setBounds(105, 40, 20, 16);
		panel.add(GPR_1_TF3);

		GPR_1_TF4 = new JTextField("0");
		GPR_1_TF4.setBounds(125, 40, 20, 16);
		panel.add(GPR_1_TF4);

		GPR_1_TF5 = new JTextField("0");
		GPR_1_TF5.setBounds(145, 40, 20, 16);
		panel.add(GPR_1_TF5);

		GPR_1_TF6 = new JTextField("0");
		GPR_1_TF6.setBounds(165, 40, 20, 16);
		panel.add(GPR_1_TF6);

		GPR_1_TF7 = new JTextField("0");
		GPR_1_TF7.setBounds(185, 40, 20, 16);
		panel.add(GPR_1_TF7);

		GPR_1_TF8 = new JTextField("0");
		GPR_1_TF8.setBounds(205, 40, 20, 16);
		panel.add(GPR_1_TF8);

		GPR_1_TF9 = new JTextField("0");
		GPR_1_TF9.setBounds(225, 40, 20, 16);
		panel.add(GPR_1_TF9);

		GPR_1_TF10 = new JTextField("0");
		GPR_1_TF10.setBounds(245, 40, 20, 16);
		panel.add(GPR_1_TF10);

		GPR_1_TF11 = new JTextField("0");
		GPR_1_TF11.setBounds(265, 40, 20, 16);
		panel.add(GPR_1_TF11);

		GPR_1_TF12 = new JTextField("0");
		GPR_1_TF12.setBounds(285, 40, 20, 16);
		panel.add(GPR_1_TF12);

		GPR_1_TF13 = new JTextField("0");
		GPR_1_TF13.setBounds(305, 40, 20, 16);
		panel.add(GPR_1_TF13);

		GPR_1_TF14 = new JTextField("0");
		GPR_1_TF14.setBounds(325, 40, 20, 16);
		panel.add(GPR_1_TF14);

		GPR_1_TF15 = new JTextField("0");
		GPR_1_TF15.setBounds(345, 40, 20, 16);
		panel.add(GPR_1_TF15);

		GPR_1_TF16 = new JTextField("0");
		GPR_1_TF16.setBounds(365, 40, 20, 16);
		panel.add(GPR_1_TF16);

		JButton GPR_1_loadBtn = new JButton("LD");
		GPR_1_loadBtn.setBounds(395, 40, 55, 16);
		GPR_1_loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GPRloadBtn();
				LD_button(instruction, 2);
				display();
			}
		});
		panel.add(GPR_1_loadBtn);

		// GPR2
		JLabel lblGPR_2 = new JLabel("GPR 2");
		lblGPR_2.setBounds(20, 60, 41, 16);
		panel.add(lblGPR_2);

		GPR_2_TF1 = new JTextField("0");
		GPR_2_TF1.setBounds(65, 60, 20, 16);
		panel.add(GPR_2_TF1);

		GPR_2_TF2 = new JTextField("0");
		GPR_2_TF2.setBounds(85, 60, 20, 16);
		panel.add(GPR_2_TF2);

		GPR_2_TF3 = new JTextField("0");
		GPR_2_TF3.setBounds(105, 60, 20, 16);
		panel.add(GPR_2_TF3);

		GPR_2_TF4 = new JTextField("0");
		GPR_2_TF4.setBounds(125, 60, 20, 16);
		panel.add(GPR_2_TF4);

		GPR_2_TF5 = new JTextField("0");
		GPR_2_TF5.setBounds(145, 60, 20, 16);
		panel.add(GPR_2_TF5);

		GPR_2_TF6 = new JTextField("0");
		GPR_2_TF6.setBounds(165, 60, 20, 16);
		panel.add(GPR_2_TF6);

		GPR_2_TF7 = new JTextField("0");
		GPR_2_TF7.setBounds(185, 60, 20, 16);
		panel.add(GPR_2_TF7);

		GPR_2_TF8 = new JTextField("0");
		GPR_2_TF8.setBounds(205, 60, 20, 16);
		panel.add(GPR_2_TF8);

		GPR_2_TF9 = new JTextField("0");
		GPR_2_TF9.setBounds(225, 60, 20, 16);
		panel.add(GPR_2_TF9);

		GPR_2_TF10 = new JTextField("0");
		GPR_2_TF10.setBounds(245, 60, 20, 16);
		panel.add(GPR_2_TF10);

		GPR_2_TF11 = new JTextField("0");
		GPR_2_TF11.setBounds(265, 60, 20, 16);
		panel.add(GPR_2_TF11);

		GPR_2_TF12 = new JTextField("0");
		GPR_2_TF12.setBounds(285, 60, 20, 16);
		panel.add(GPR_2_TF12);

		GPR_2_TF13 = new JTextField("0");
		GPR_2_TF13.setBounds(305, 60, 20, 16);
		panel.add(GPR_2_TF13);

		GPR_2_TF14 = new JTextField("0");
		GPR_2_TF14.setBounds(325, 60, 20, 16);
		panel.add(GPR_2_TF14);

		GPR_2_TF15 = new JTextField("0");
		GPR_2_TF15.setBounds(345, 60, 20, 16);
		panel.add(GPR_2_TF15);

		GPR_2_TF16 = new JTextField("0");
		GPR_2_TF16.setBounds(365, 60, 20, 16);
		panel.add(GPR_2_TF16);

		JButton GPR_2_loadBtn = new JButton("LD");
		GPR_2_loadBtn.setBounds(395, 60, 55, 16);
		GPR_2_loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GPRloadBtn();
				LD_button(instruction, 3);
				display();
			}
		});
		panel.add(GPR_2_loadBtn);

		JLabel lblGPR_3 = new JLabel("GPR 3");
		lblGPR_3.setBounds(20, 80, 41, 16);
		panel.add(lblGPR_3);

		GPR_3_TF1 = new JTextField("0");
		GPR_3_TF1.setBounds(65, 80, 20, 16);
		panel.add(GPR_3_TF1);

		GPR_3_TF2 = new JTextField("0");
		GPR_3_TF2.setBounds(85, 80, 20, 16);
		panel.add(GPR_3_TF2);

		GPR_3_TF3 = new JTextField("0");
		GPR_3_TF3.setBounds(105, 80, 20, 16);
		panel.add(GPR_3_TF3);

		GPR_3_TF4 = new JTextField("0");
		GPR_3_TF4.setBounds(125, 80, 20, 16);
		panel.add(GPR_3_TF4);

		GPR_3_TF5 = new JTextField("0");
		GPR_3_TF5.setBounds(145, 80, 20, 16);
		panel.add(GPR_3_TF5);

		GPR_3_TF6 = new JTextField("0");
		GPR_3_TF6.setBounds(165, 80, 20, 16);
		panel.add(GPR_3_TF6);

		GPR_3_TF7 = new JTextField("0");
		GPR_3_TF7.setBounds(185, 80, 20, 16);
		panel.add(GPR_3_TF7);

		GPR_3_TF8 = new JTextField("0");
		GPR_3_TF8.setBounds(205, 80, 20, 16);
		panel.add(GPR_3_TF8);

		GPR_3_TF9 = new JTextField("0");
		GPR_3_TF9.setBounds(225, 80, 20, 16);
		panel.add(GPR_3_TF9);

		GPR_3_TF10 = new JTextField("0");
		GPR_3_TF10.setBounds(245, 80, 20, 16);
		panel.add(GPR_3_TF10);

		GPR_3_TF11 = new JTextField("0");
		GPR_3_TF11.setBounds(265, 80, 20, 16);
		panel.add(GPR_3_TF11);

		GPR_3_TF12 = new JTextField("0");
		GPR_3_TF12.setBounds(285, 80, 20, 16);
		panel.add(GPR_3_TF12);

		GPR_3_TF13 = new JTextField("0");
		GPR_3_TF13.setBounds(305, 80, 20, 16);
		panel.add(GPR_3_TF13);

		GPR_3_TF14 = new JTextField("0");
		GPR_3_TF14.setBounds(325, 80, 20, 16);
		panel.add(GPR_3_TF14);

		GPR_3_TF15 = new JTextField("0");
		GPR_3_TF15.setBounds(345, 80, 20, 16);
		panel.add(GPR_3_TF15);

		GPR_3_TF16 = new JTextField("0");
		GPR_3_TF16.setBounds(365, 80, 20, 16);
		panel.add(GPR_3_TF16);

		JButton GPR_3_loadBtn = new JButton("LD");
		GPR_3_loadBtn.setBounds(395, 80, 55, 16);
		GPR_3_loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GPRloadBtn();
				LD_button(instruction, 4);
				display();
			}
		});
		panel.add(GPR_3_loadBtn);

		// Labels for IXR
		JLabel lblIXR_1 = new JLabel("IXR 1");
		lblIXR_1.setBounds(20, 120, 41, 16);
		panel.add(lblIXR_1);

		IXR_1_TF1 = new JTextField("0");
		IXR_1_TF1.setBounds(65, 120, 20, 16);
		panel.add(IXR_1_TF1);

		IXR_1_TF2 = new JTextField("0");
		IXR_1_TF2.setBounds(85, 120, 20, 16);
		panel.add(IXR_1_TF2);

		IXR_1_TF3 = new JTextField("0");
		IXR_1_TF3.setBounds(105, 120, 20, 16);
		panel.add(IXR_1_TF3);

		IXR_1_TF4 = new JTextField("0");
		IXR_1_TF4.setBounds(125, 120, 20, 16);
		panel.add(IXR_1_TF4);

		IXR_1_TF5 = new JTextField("0");
		IXR_1_TF5.setBounds(145, 120, 20, 16);
		panel.add(IXR_1_TF5);

		IXR_1_TF6 = new JTextField("0");
		IXR_1_TF6.setBounds(165, 120, 20, 16);
		panel.add(IXR_1_TF6);

		IXR_1_TF7 = new JTextField("0");
		IXR_1_TF7.setBounds(185, 120, 20, 16);
		panel.add(IXR_1_TF7);

		IXR_1_TF8 = new JTextField("0");
		IXR_1_TF8.setBounds(205, 120, 20, 16);
		panel.add(IXR_1_TF8);

		IXR_1_TF9 = new JTextField("0");
		IXR_1_TF9.setBounds(225, 120, 20, 16);
		panel.add(IXR_1_TF9);

		IXR_1_TF10 = new JTextField("0");
		IXR_1_TF10.setBounds(245, 120, 20, 16);
		panel.add(IXR_1_TF10);

		IXR_1_TF11 = new JTextField("0");
		IXR_1_TF11.setBounds(265, 120, 20, 16);
		panel.add(IXR_1_TF11);

		IXR_1_TF12 = new JTextField("0");
		IXR_1_TF12.setBounds(285, 120, 20, 16);
		panel.add(IXR_1_TF12);

		IXR_1_TF13 = new JTextField("0");
		IXR_1_TF13.setBounds(305, 120, 20, 16);
		panel.add(IXR_1_TF13);

		IXR_1_TF14 = new JTextField("0");
		IXR_1_TF14.setBounds(325, 120, 20, 16);
		panel.add(IXR_1_TF14);

		IXR_1_TF15 = new JTextField("0");
		IXR_1_TF15.setBounds(345, 120, 20, 16);
		panel.add(IXR_1_TF15);

		IXR_1_TF16 = new JTextField("0");
		IXR_1_TF16.setBounds(365, 120, 20, 16);
		panel.add(IXR_1_TF16);

		JButton IXR_1_loadBtn = new JButton("LD");
		IXR_1_loadBtn.setBounds(395, 120, 55, 16);
		IXR_1_loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GPRloadBtn();
				LD_button(instruction, 5);
				display();
			}
		});
		panel.add(IXR_1_loadBtn);

		//Labels for IXR2
		JLabel lblIXR_2 = new JLabel("IXR 2");
		lblIXR_2.setBounds(20, 140, 41, 16);
		panel.add(lblIXR_2);

		IXR_2_TF1 = new JTextField("0");
		IXR_2_TF1.setBounds(65, 140, 20, 16);
		panel.add(IXR_2_TF1);

		IXR_2_TF2 = new JTextField("0");
		IXR_2_TF2.setBounds(85, 140, 20, 16);
		panel.add(IXR_2_TF2);

		IXR_2_TF3 = new JTextField("0");
		IXR_2_TF3.setBounds(105, 140, 20, 16);
		panel.add(IXR_2_TF3);

		IXR_2_TF4 = new JTextField("0");
		IXR_2_TF4.setBounds(125, 140, 20, 16);
		panel.add(IXR_2_TF4);

		IXR_2_TF5 = new JTextField("0");
		IXR_2_TF5.setBounds(145, 140, 20, 16);
		panel.add(IXR_2_TF5);

		IXR_2_TF6 = new JTextField("0");
		IXR_2_TF6.setBounds(165, 140, 20, 16);
		panel.add(IXR_2_TF6);

		IXR_2_TF7 = new JTextField("0");
		IXR_2_TF7.setBounds(185, 140, 20, 16);
		panel.add(IXR_2_TF7);

		IXR_2_TF8 = new JTextField("0");
		IXR_2_TF8.setBounds(205, 140, 20, 16);
		panel.add(IXR_2_TF8);

		IXR_2_TF9 = new JTextField("0");
		IXR_2_TF9.setBounds(225, 140, 20, 16);
		panel.add(IXR_2_TF9);

		IXR_2_TF10 = new JTextField("0");
		IXR_2_TF10.setBounds(245, 140, 20, 16);
		panel.add(IXR_2_TF10);

		IXR_2_TF11 = new JTextField("0");
		IXR_2_TF11.setBounds(265, 140, 20, 16);
		panel.add(IXR_2_TF11);

		IXR_2_TF12 = new JTextField("0");
		IXR_2_TF12.setBounds(285, 140, 20, 16);
		panel.add(IXR_2_TF12);

		IXR_2_TF13 = new JTextField("0");
		IXR_2_TF13.setBounds(305, 140, 20, 16);
		panel.add(IXR_2_TF13);

		IXR_2_TF14 = new JTextField("0");
		IXR_2_TF14.setBounds(325, 140, 20, 16);
		panel.add(IXR_2_TF14);

		IXR_2_TF15 = new JTextField("0");
		IXR_2_TF15.setBounds(345, 140, 20, 16);
		panel.add(IXR_2_TF15);

		IXR_2_TF16 = new JTextField("0");
		IXR_2_TF16.setBounds(365, 140, 20, 16);
		panel.add(IXR_2_TF16);

		JButton IXR_2_loadBtn = new JButton("LD");
		IXR_2_loadBtn.setBounds(395, 140, 55, 16);
		IXR_2_loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GPRloadBtn();
				LD_button(instruction, 6);
				display();
			}
		});
		panel.add(IXR_2_loadBtn);

		JLabel lblIXR_3 = new JLabel("IXR 3");
		lblIXR_3.setBounds(20, 160, 41, 16);
		panel.add(lblIXR_3);

		IXR_3_TF1 = new JTextField("0");
		IXR_3_TF1.setBounds(65, 160, 20, 16);
		panel.add(IXR_3_TF1);

		IXR_3_TF2 = new JTextField("0");
		IXR_3_TF2.setBounds(85, 160, 20, 16);
		panel.add(IXR_3_TF2);

		IXR_3_TF3 = new JTextField("0");
		IXR_3_TF3.setBounds(105, 160, 20, 16);
		panel.add(IXR_3_TF3);

		IXR_3_TF4 = new JTextField("0");
		IXR_3_TF4.setBounds(125, 160, 20, 16);
		panel.add(IXR_3_TF4);

		IXR_3_TF5 = new JTextField("0");
		IXR_3_TF5.setBounds(145, 160, 20, 16);
		panel.add(IXR_3_TF5);

		IXR_3_TF6 = new JTextField("0");
		IXR_3_TF6.setBounds(165, 160, 20, 16);
		panel.add(IXR_3_TF6);

		IXR_3_TF7 = new JTextField("0");
		IXR_3_TF7.setBounds(185, 160, 20, 16);
		panel.add(IXR_3_TF7);

		IXR_3_TF8 = new JTextField("0");
		IXR_3_TF8.setBounds(205, 160, 20, 16);
		panel.add(IXR_3_TF8);

		IXR_3_TF9 = new JTextField("0");
		IXR_3_TF9.setBounds(225, 160, 20, 16);
		panel.add(IXR_3_TF9);

		IXR_3_TF10 = new JTextField("0");
		IXR_3_TF10.setBounds(245, 160, 20, 16);
		panel.add(IXR_3_TF10);

		IXR_3_TF11 = new JTextField("0");
		IXR_3_TF11.setBounds(265, 160, 20, 16);
		panel.add(IXR_3_TF11);

		IXR_3_TF12 = new JTextField("0");
		IXR_3_TF12.setBounds(285, 160, 20, 16);
		panel.add(IXR_3_TF12);

		IXR_3_TF13 = new JTextField("0");
		IXR_3_TF13.setBounds(305, 160, 20, 16);
		panel.add(IXR_3_TF13);

		IXR_3_TF14 = new JTextField("0");
		IXR_3_TF14.setBounds(325, 160, 20, 16);
		panel.add(IXR_3_TF14);

		IXR_3_TF15 = new JTextField("0");
		IXR_3_TF15.setBounds(345, 160, 20, 16);
		panel.add(IXR_3_TF15);

		IXR_3_TF16 = new JTextField("0");
		IXR_3_TF16.setBounds(365, 160, 20, 16);
		panel.add(IXR_3_TF16);

		JButton IXR_3_loadBtn = new JButton("LD");
		IXR_3_loadBtn.setBounds(395, 160, 55, 16);
		IXR_3_loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GPRloadBtn();
				LD_button(instruction, 7);
				display();
			}
		});
		panel.add(IXR_3_loadBtn);

		//FR
		JLabel lblFR_0 = new JLabel("FR 0");
		lblFR_0.setBounds(20, 200, 41, 16);
		panel.add(lblFR_0);

		textFR_0_1 = new JTextField("0");
		textFR_0_1.setBounds(65, 200, 20, 16);
		panel.add(textFR_0_1);

		textFR_0_2 = new JTextField("0");
		textFR_0_2.setBounds(85, 200, 20, 16);
		panel.add(textFR_0_2);

		textFR_0_3 = new JTextField("0");
		textFR_0_3.setBounds(105, 200, 20, 16);
		panel.add(textFR_0_3);

		textFR_0_4 = new JTextField("0");
		textFR_0_4.setBounds(125, 200, 20, 16);
		panel.add(textFR_0_4);

		textFR_0_5 = new JTextField("0");
		textFR_0_5.setBounds(145, 200, 20, 16);
		panel.add(textFR_0_5);

		textFR_0_6 = new JTextField("0");
		textFR_0_6.setBounds(165, 200, 20, 16);
		panel.add(textFR_0_6);

		textFR_0_7 = new JTextField("0");
		textFR_0_7.setBounds(185, 200, 20, 16);
		panel.add(textFR_0_7);

		textFR_0_8 = new JTextField("0");
		textFR_0_8.setBounds(205, 200, 20, 16);
		panel.add(textFR_0_8);

		textFR_0_9 = new JTextField("0");
		textFR_0_9.setBounds(225, 200, 20, 16);
		panel.add(textFR_0_9);

		textFR_0_10 = new JTextField("0");
		textFR_0_10.setBounds(245, 200, 20, 16);
		panel.add(textFR_0_10);

		textFR_0_11 = new JTextField("0");
		textFR_0_11.setBounds(265, 200, 20, 16);
		panel.add(textFR_0_11);

		textFR_0_12 = new JTextField("0");
		textFR_0_12.setBounds(285, 200, 20, 16);
		panel.add(textFR_0_12);

		textFR_0_13 = new JTextField("0");
		textFR_0_13.setBounds(305, 200, 20, 16);
		panel.add(textFR_0_13);

		textFR_0_14 = new JTextField("0");
		textFR_0_14.setBounds(325, 200, 20, 16);
		panel.add(textFR_0_14);

		textFR_0_15 = new JTextField("0");
		textFR_0_15.setBounds(345, 200, 20, 16);
		panel.add(textFR_0_15);

		textFR_0_16 = new JTextField("0");
		textFR_0_16.setBounds(365, 200, 20, 16);
		panel.add(textFR_0_16);

		JButton textFR_0_loadBtn = new JButton("LD");
		textFR_0_loadBtn.setBounds(395, 200, 55, 16);
		textFR_0_loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GPRloadBtn();
				LD_button(instruction, 8);
				display();
			}
		});
		panel.add(textFR_0_loadBtn);

		JLabel lblFR_1 = new JLabel("FR 1");
		lblFR_1.setBounds(20, 220, 41, 16);
		panel.add(lblFR_1);

		textFR_1_1 = new JTextField("0");
		textFR_1_1.setBounds(65, 220, 20, 16);
		panel.add(textFR_1_1);

		textFR_1_2 = new JTextField("0");
		textFR_1_2.setBounds(85, 220, 20, 16);
		panel.add(textFR_1_2);

		textFR_1_3 = new JTextField("0");
		textFR_1_3.setBounds(105, 220, 20, 16);
		panel.add(textFR_1_3);

		textFR_1_4 = new JTextField("0");
		textFR_1_4.setBounds(125, 220, 20, 16);
		panel.add(textFR_1_4);

		textFR_1_5 = new JTextField("0");
		textFR_1_5.setBounds(145, 220, 20, 16);
		panel.add(textFR_1_5);

		textFR_1_6 = new JTextField("0");
		textFR_1_6.setBounds(165, 220, 20, 16);
		panel.add(textFR_1_6);

		textFR_1_7 = new JTextField("0");
		textFR_1_7.setBounds(185, 220, 20, 16);
		panel.add(textFR_1_7);

		textFR_1_8 = new JTextField("0");
		textFR_1_8.setBounds(205, 220, 20, 16);
		panel.add(textFR_1_8);

		textFR_1_9 = new JTextField("0");
		textFR_1_9.setBounds(225, 220, 20, 16);
		panel.add(textFR_1_9);

		textFR_1_10 = new JTextField("0");
		textFR_1_10.setBounds(245, 220, 20, 16);
		panel.add(textFR_1_10);

		textFR_1_11 = new JTextField("0");
		textFR_1_11.setBounds(265, 220, 20, 16);
		panel.add(textFR_1_11);

		textFR_1_12 = new JTextField("0");
		textFR_1_12.setBounds(285, 220, 20, 16);
		panel.add(textFR_1_12);

		textFR_1_13 = new JTextField("0");
		textFR_1_13.setBounds(305, 220, 20, 16);
		panel.add(textFR_1_13);

		textFR_1_14 = new JTextField("0");
		textFR_1_14.setBounds(325, 220, 20, 16);
		panel.add(textFR_1_14);

		textFR_1_15 = new JTextField("0");
		textFR_1_15.setBounds(345, 220, 20, 16);
		panel.add(textFR_1_15);

		textFR_1_16 = new JTextField("0");
		textFR_1_16.setBounds(365, 220, 20, 16);
		panel.add(textFR_1_16);

		JButton textFR_1_loadBtn = new JButton("LD");
		textFR_1_loadBtn.setBounds(395, 220, 55, 16);
		textFR_1_loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GPRloadBtn();
				LD_button(instruction, 9);
				display();
			}
		});
		panel.add(textFR_1_loadBtn);		

		// Labels for PC
		JLabel PClbl = new JLabel("PC");
		PClbl.setBounds(500, 20, 25, 16);
		panel.add(PClbl);

		textPc_1 = new JTextField("0");
		textPc_1.setBounds(545, 20, 20, 16);
		panel.add(textPc_1);

		textPc_2 = new JTextField("0");
		textPc_2.setBounds(565, 20, 20, 16);
		panel.add(textPc_2);

		textPc_3 = new JTextField("0");
		textPc_3.setBounds(585, 20, 20, 16);
		panel.add(textPc_3);

		textPc_4 = new JTextField("0");
		textPc_4.setBounds(605, 20, 20, 16);
		panel.add(textPc_4);

		textPc_5 = new JTextField("0");
		textPc_5.setBounds(625, 20, 20, 16);
		panel.add(textPc_5);

		textPc_6 = new JTextField("0");
		textPc_6.setBounds(645, 20, 20, 16);
		panel.add(textPc_6);

		textPc_7 = new JTextField("0");
		textPc_7.setBounds(665, 20, 20, 16);
		panel.add(textPc_7);

		textPc_8 = new JTextField("0");
		textPc_8.setBounds(685, 20, 20, 16);
		panel.add(textPc_8);

		textPc_9 = new JTextField("0");
		textPc_9.setBounds(705, 20, 20, 16);
		panel.add(textPc_9);

		textPc_10 = new JTextField("0");
		textPc_10.setBounds(725, 20, 20, 16);
		panel.add(textPc_10);

		textPc_11 = new JTextField("0");
		textPc_11.setBounds(745, 20, 20, 16);
		panel.add(textPc_11);

		textPc_12 = new JTextField("0");
		textPc_12.setBounds(765, 20, 20, 16);
		panel.add(textPc_12);

		//Load button for PC
		JButton PCbtn = new JButton("LD");
		PCbtn.setBounds(875, 20, 55, 16);
		PCbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				textPc_1.setText(data[4]);
				textPc_2.setText(data[5]);
				textPc_3.setText(data[6]);
				textPc_4.setText(data[7]);
				textPc_5.setText(data[8]);
				textPc_6.setText(data[9]);
				textPc_7.setText(data[10]);
				textPc_8.setText(data[11]);
				textPc_9.setText(data[12]);
				textPc_10.setText(data[13]);
				textPc_11.setText(data[14]);
				textPc_12.setText(data[15]);

				StringJoiner joiner = new StringJoiner("");
				for (int i = 4; i < data.length; i++) {
					joiner.add(data[i]);
				}

				register.setPC(Operations.strToNum(joiner.toString()));
			}
		});
		panel.add(PCbtn);

		// MAR
		JLabel MARlbl = new JLabel("MAR");
		MARlbl.setBounds(500, 40, 30, 16);
		panel.add(MARlbl);

		textMar_1 = new JTextField("0");
		textMar_1.setBounds(545, 40, 20, 16);
		panel.add(textMar_1);

		textMar_2 = new JTextField("0");
		textMar_2.setBounds(565, 40, 20, 16);
		panel.add(textMar_2);

		textMar_3 = new JTextField("0");
		textMar_3.setBounds(585, 40, 20, 16);
		panel.add(textMar_3);

		textMar_4 = new JTextField("0");
		textMar_4.setBounds(605, 40, 20, 16);
		panel.add(textMar_4);

		textMar_5 = new JTextField("0");
		textMar_5.setBounds(625, 40, 20, 16);
		panel.add(textMar_5);

		textMar_6 = new JTextField("0");
		textMar_6.setBounds(645, 40, 20, 16);
		panel.add(textMar_6);

		textMar_7 = new JTextField("0");
		textMar_7.setBounds(665, 40, 20, 16);
		panel.add(textMar_7);

		textMar_8 = new JTextField("0");
		textMar_8.setBounds(685, 40, 20, 16);
		panel.add(textMar_8);

		textMar_9 = new JTextField("0");
		textMar_9.setBounds(705, 40, 20, 16);
		panel.add(textMar_9);

		textMar_10 = new JTextField("0");
		textMar_10.setBounds(725, 40, 20, 16);
		panel.add(textMar_10);

		textMar_11 = new JTextField("0");
		textMar_11.setBounds(745, 40, 20, 16);
		panel.add(textMar_11);

		textMar_12 = new JTextField("0");
		textMar_12.setBounds(765, 40, 20, 16);
		panel.add(textMar_12);

		//Load button for MAR
		JButton MARbtn = new JButton("LD");
		MARbtn.setBounds(875, 40, 55, 16);
		MARbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				textMar_1.setText(data[4]);
				textMar_2.setText(data[5]);
				textMar_3.setText(data[6]);
				textMar_4.setText(data[7]);
				textMar_5.setText(data[8]);
				textMar_6.setText(data[9]);
				textMar_7.setText(data[10]);
				textMar_8.setText(data[11]);
				textMar_9.setText(data[12]);
				textMar_10.setText(data[13]);
				textMar_11.setText(data[14]);
				textMar_12.setText(data[15]);

				StringJoiner joiner = new StringJoiner("");
				for (int i = 4; i < data.length; i++) {
					joiner.add(data[i]);
				}

				register.setMAR(Operations.strToNum(joiner.toString()));
			}
		});
		panel.add(MARbtn);

		// MBR
		JLabel MBRlbl = new JLabel("MBR");
		MBRlbl.setBounds(500, 61, 30, 15);
		panel.add(MBRlbl);

		textMbr_1 = new JTextField("0");
		textMbr_1.setBounds(545, 61, 20, 16);
		panel.add(textMbr_1);

		textMbr_2 = new JTextField("0");
		textMbr_2.setBounds(565, 61, 20, 16);
		panel.add(textMbr_2);

		textMbr_3 = new JTextField("0");
		textMbr_3.setBounds(585, 61, 20, 16);
		panel.add(textMbr_3);

		textMbr_4 = new JTextField("0");
		textMbr_4.setBounds(605, 61, 20, 16);
		panel.add(textMbr_4);

		textMbr_5 = new JTextField("0");
		textMbr_5.setBounds(625, 61, 20, 16);
		panel.add(textMbr_5);

		textMbr_6 = new JTextField("0");
		textMbr_6.setBounds(645, 61, 20, 16);
		panel.add(textMbr_6);

		textMbr_7 = new JTextField("0");
		textMbr_7.setBounds(665, 61, 20, 16);
		panel.add(textMbr_7);

		textMbr_8 = new JTextField("0");
		textMbr_8.setBounds(685, 61, 20, 16);
		panel.add(textMbr_8);

		textMbr_9 = new JTextField("0");
		textMbr_9.setBounds(705, 61, 20, 16);
		panel.add(textMbr_9);

		textMbr_10 = new JTextField("0");
		textMbr_10.setBounds(725, 61, 20, 16);
		panel.add(textMbr_10);

		textMbr_11 = new JTextField("0");
		textMbr_11.setBounds(745, 61, 20, 16);
		panel.add(textMbr_11);

		textMbr_12 = new JTextField("0");
		textMbr_12.setBounds(765, 61, 20, 16);
		panel.add(textMbr_12);

		textMbr_13 = new JTextField("0");
		textMbr_13.setBounds(785, 61, 20, 16);
		panel.add(textMbr_13);

		textMbr_14 = new JTextField("0");
		textMbr_14.setBounds(805, 61, 20, 16);
		panel.add(textMbr_14);

		textMbr_15 = new JTextField("0");
		textMbr_15.setBounds(825, 61, 20, 16);
		panel.add(textMbr_15);

		textMbr_16 = new JTextField("0");
		textMbr_16.setBounds(845, 61, 20, 16);
		panel.add(textMbr_16);

		JButton MBRbtn = new JButton("LD");
		MBRbtn.setBounds(875, 61, 55, 16);
		MBRbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textMbr_1.setText(data[0]);
				textMbr_2.setText(data[1]);
				textMbr_3.setText(data[2]);
				textMbr_4.setText(data[3]);
				textMbr_5.setText(data[4]);
				textMbr_6.setText(data[5]);
				textMbr_7.setText(data[6]);
				textMbr_8.setText(data[7]);
				textMbr_9.setText(data[8]);
				textMbr_10.setText(data[9]);
				textMbr_11.setText(data[10]);
				textMbr_12.setText(data[11]);
				textMbr_13.setText(data[12]);
				textMbr_14.setText(data[13]);
				textMbr_15.setText(data[14]);
				textMbr_16.setText(data[15]);

				StringJoiner joiner = new StringJoiner("");
				for (int i = 0; i < data.length; i++) {
					joiner.add(data[i]);
				}

				register.setMBR(Operations.strToNum(joiner.toString()));
			}
		});
		panel.add(MBRbtn);

		// IR
		JLabel IRlbl = new JLabel("IR");
		IRlbl.setBounds(500, 80, 25, 16);
		panel.add(IRlbl);

		textIR_1 = new JTextField("0");
		textIR_1.setBounds(545, 80, 20, 16);
		panel.add(textIR_1);

		textIR_2 = new JTextField("0");
		textIR_2.setBounds(565, 80, 20, 16);
		panel.add(textIR_2);

		textIR_3 = new JTextField("0");
		textIR_3.setBounds(585, 80, 20, 16);
		panel.add(textIR_3);

		textIR_4 = new JTextField("0");
		textIR_4.setBounds(605, 80, 20, 16);
		panel.add(textIR_4);

		textIR_5 = new JTextField("0");
		textIR_5.setBounds(625, 80, 20, 16);
		panel.add(textIR_5);

		textIR_6 = new JTextField("0");
		textIR_6.setBounds(645, 80, 20, 16);
		panel.add(textIR_6);

		textIR_7 = new JTextField("0");
		textIR_7.setBounds(665, 80, 20, 16);
		panel.add(textIR_7);

		textIR_8 = new JTextField("0");
		textIR_8.setBounds(685, 80, 20, 16);
		panel.add(textIR_8);

		textIR_9 = new JTextField("0");
		textIR_9.setBounds(705, 80, 20, 16);
		panel.add(textIR_9);

		textIR_10 = new JTextField("0");
		textIR_10.setBounds(725, 80, 20, 16);
		panel.add(textIR_10);

		textIR_11 = new JTextField("0");
		textIR_11.setBounds(745, 80, 20, 16);
		panel.add(textIR_11);

		textIR_12 = new JTextField("0");
		textIR_12.setBounds(765, 80, 20, 16);
		panel.add(textIR_12);

		textIR_13 = new JTextField("0");
		textIR_13.setBounds(785, 80, 20, 16);
		panel.add(textIR_13);

		textIR_14 = new JTextField("0");
		textIR_14.setBounds(805, 80, 20, 16);
		panel.add(textIR_14);

		textIR_15 = new JTextField("0");
		textIR_15.setBounds(825, 80, 20, 16);
		panel.add(textIR_15);

		textIR_16 = new JTextField("0");
		textIR_16.setBounds(845, 80, 20, 16);
		panel.add(textIR_16);

		// MFR
		JLabel MFRlbl = new JLabel("MFR");
		MFRlbl.setBounds(500, 101, 30, 16);
		panel.add(MFRlbl);

		MFR_TF1 = new JTextField("0");
		MFR_TF1.setBounds(545, 101, 20, 16);
		panel.add(MFR_TF1);

		MFR_TF2 = new JTextField("0");
		MFR_TF2.setBounds(565, 101, 20, 16);
		panel.add(MFR_TF2);

		MFR_TF3 = new JTextField("0");
		MFR_TF3.setBounds(585, 101, 20, 16);
		panel.add(MFR_TF3);

		MFR_TF4 = new JTextField("0");
		MFR_TF4.setBounds(605, 101, 20, 16);
		panel.add(MFR_TF4);

		// Labels for Operation, GPR, IXR, I, Address
		JLabel lblNewLabel = new JLabel("Operation");
		lblNewLabel.setBounds(120, 307, 66, 16);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("GPR");
		lblNewLabel_1.setBounds(330, 307, 30, 16);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("IXR");
		lblNewLabel_2.setBounds(430, 307, 25, 16);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("I");
		lblNewLabel_3.setBounds(510, 307, 9, 16);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setBounds(630, 307, 65, 16);
		panel.add(lblNewLabel_4);
		
		// Halt
		JLabel haltlbl = new JLabel("Halt");
		haltlbl.setBounds(546, 405, 25, 26);
		panel.add(haltlbl);

		JButton textfield_1 = new JButton();
		textfield_1.setBounds(575, 405, 25, 26);
		textfield_1.setBackground(Color.red);
		panel.add(textfield_1);

		JLabel runlbl = new JLabel("Run");
		runlbl.setBounds(546, 435, 25, 26);
		panel.add(runlbl);

		JButton textfield_2 = new JButton();
		textfield_2.setBounds(575, 435, 25, 26);
		panel.add(textfield_2);

		// Store button implementation
		// Clicking button will store data in MBR into memory[MAR]
		JButton storeBtn = new JButton("Store");
		storeBtn.setBounds(245, 362, 75, 30);
		storeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// setting MFR for illegal Memory Address to Reserved Locations 
				if(register.getMAR()>=0 && register.getMAR()<=5)
					CPU.machineFault(0);
				else 
					cache.writeCache(register.getMAR(), register.getMBR());
				
			}
		});
		panel.add(storeBtn);

		// St+ button
		// Clicking button will store data in MBR into memory[MAR] and increment MAR
		JButton stBtn = new JButton("St+");
		stBtn.setBounds(335, 362, 75, 30);
		stBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// setting MFR for illegal Memory Address to Reserved Locations 
				if(register.getMAR()>=0 && register.getMAR()<=5)
					CPU.machineFault(0);
				else {
					// storing the value MBR in MAR
					cache.writeCache(register.getMAR(), register.getMBR());

					String MAR = Integer.toBinaryString(register.getMAR() + 1);
					
					String[] dataValue = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

					for (int i = 0; i < MAR.length(); i++) {
						dataValue[12 - MAR.length() + i] = MAR.substring(i, i + 1);
					}

					// setting the new incremented MAR value
					register.setMAR(Integer.parseInt(MAR.toString(), 2));

					// displaying on the MAR field
					textMar_1.setText(dataValue[0]);
					textMar_2.setText(dataValue[1]);
					textMar_3.setText(dataValue[2]);
					textMar_4.setText(dataValue[3]);
					textMar_5.setText(dataValue[4]);
					textMar_6.setText(dataValue[5]);
					textMar_7.setText(dataValue[6]);
					textMar_8.setText(dataValue[7]);
					textMar_9.setText(dataValue[8]);
					textMar_10.setText(dataValue[9]);
					textMar_11.setText(dataValue[10]);
					textMar_12.setText(dataValue[11]);
				}
			}
		});
		panel.add(stBtn);

		// Load button
		//Clicking button will load memory[MAR] into MBR
		JButton loadBtn = new JButton("Load");
		loadBtn.setBounds(435, 362, 75, 30);
		loadBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = Integer.toBinaryString(cache.loadCache(register.getMAR()));

				for (int i = 0; i <= 15 - str.length(); i++) {
					data[i] = "0";
				}

				for (int i = 0; i < str.length(); i++) {
					data[16 - str.length() + i] = str.substring(i, i + 1);
				}

				textMbr_1.setText(data[0]);
				textMbr_2.setText(data[1]);
				textMbr_3.setText(data[2]);
				textMbr_4.setText(data[3]);
				textMbr_5.setText(data[4]);
				textMbr_6.setText(data[5]);
				textMbr_7.setText(data[6]);
				textMbr_8.setText(data[7]);
				textMbr_9.setText(data[8]);
				textMbr_10.setText(data[9]);
				textMbr_11.setText(data[10]);
				textMbr_12.setText(data[11]);
				textMbr_13.setText(data[12]);
				textMbr_14.setText(data[13]);
				textMbr_15.setText(data[14]);
				textMbr_16.setText(data[15]);

				StringJoiner joiner = new StringJoiner("");
				for (int i = 0; i < data.length; i++) {
					joiner.add(data[i]);
				}
				
				register.setMBR(Operations.strToNum(joiner.toString()));
			}
		});
		panel.add(loadBtn);
		
		// SS (single step) button
		// Single step button that steps through program instruction by instruction
		JButton ssBtn = new JButton("SS");
		ssBtn.setBounds(330, 405, 50, 45);
		ssBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("\n ---------------------------------------------- \n");
				// load and run the instruction
				register.setMAR(register.getPC());
				register.setMBR(cache.loadCache(register.getMAR()));
				register.setIR(register.getMBR());
				//Increment PC
				register.setPC(register.getPC() + 1);
				
				Load loadInst = new Load();
				loadInst.loadInstruction(register.getMAR());
				
				if(loadInst.opcode != 0) {

					textfield_1.setBackground(Color.white);
					textfield_2.setBackground(Color.green);
					
					loadInst.runInstruction();
					display();

				
				}
				textfield_1.setBackground(Color.red);
				textfield_2.setBackground(Color.white);
			}
		});
		panel.add(ssBtn);

		// Run button
		// Program runs to the end when user hits Run button
		JButton runBtn = new JButton("Run");
		runBtn.setBounds(415, 405, 60, 45);
		runBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// load and run the instruction
				do {
					System.out.println("\n ---------------------------------------------- \n");
					
					register.setMAR(register.getPC());
					register.setMBR(cache.loadCache(register.getMAR()));
					register.setIR(register.getMBR());
					
					//Increment PC
					register.setPC(register.getPC() + 1);
			
					
					Load loadInst = new Load();
					loadInst.loadInstruction(register.getMAR());
					
					if (loadInst.opcode == 0) {
						textfield_1.setBackground(Color.red);
						textfield_2.setBackground(Color.white);
						break; // HLT
					}
					
					loadInst.runInstruction();
					// increment MAR
					display();
	
				} while(true);
			}
		});
		panel.add(runBtn);


		// Init button
		// Clicking button will load IPL.txt file into memory
		JButton initBtn = new JButton("Init");
		initBtn.setBounds(535, 362, 75, 30);
		initBtn.setBackground(Color.red);
		initBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				textfield_1.setBackground(Color.white);
				textfield_2.setBackground(Color.green);
				int halt = Init_button();
				display();
				OperatorConsole.printConsole("Intial load is completed.\n");
			}
		});
		panel.add(initBtn);

	}
	
	//Display the values in GPR, IXR, PC, MAR, MBR, IR, MFR
	public void display() {
		String GPR_0 = Operations.numToStr(get_number(1), 16);

		String[] gpr0Value = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < GPR_0.length(); i++) {
			gpr0Value[16 - GPR_0.length() + i] = GPR_0.substring(i, i + 1);
		}
		GPR_0_TF1.setText(gpr0Value[0]);
		GPR_0_TF2.setText(gpr0Value[1]);
		GPR_0_TF3.setText(gpr0Value[2]);
		GPR_0_TF4.setText(gpr0Value[3]);
		GPR_0_TF5.setText(gpr0Value[4]);
		GPR_0_TF6.setText(gpr0Value[5]);
		GPR_0_TF7.setText(gpr0Value[6]);
		GPR_0_TF8.setText(gpr0Value[7]);
		GPR_0_TF9.setText(gpr0Value[8]);
		GPR_0_TF10.setText(gpr0Value[9]);
		GPR_0_TF11.setText(gpr0Value[10]);
		GPR_0_TF12.setText(gpr0Value[11]);
		GPR_0_TF13.setText(gpr0Value[12]);
		GPR_0_TF14.setText(gpr0Value[13]);
		GPR_0_TF15.setText(gpr0Value[14]);
		GPR_0_TF16.setText(gpr0Value[15]);
		
		String GPR_1 = Operations.numToStr(get_number(2), 16);

		String[] gpr1Value = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < GPR_1.length(); i++) {
			gpr1Value[16 - GPR_1.length() + i] = GPR_1.substring(i, i + 1);
		}
		GPR_1_TF1.setText(gpr1Value[0]);
		GPR_1_TF2.setText(gpr1Value[1]);
		GPR_1_TF3.setText(gpr1Value[2]);
		GPR_1_TF4.setText(gpr1Value[3]);
		GPR_1_TF5.setText(gpr1Value[4]);
		GPR_1_TF6.setText(gpr1Value[5]);
		GPR_1_TF7.setText(gpr1Value[6]);
		GPR_1_TF8.setText(gpr1Value[7]);
		GPR_1_TF9.setText(gpr1Value[8]);
		GPR_1_TF10.setText(gpr1Value[9]);
		GPR_1_TF11.setText(gpr1Value[10]);
		GPR_1_TF12.setText(gpr1Value[11]);
		GPR_1_TF13.setText(gpr1Value[12]);
		GPR_1_TF14.setText(gpr1Value[13]);
		GPR_1_TF15.setText(gpr1Value[14]);
		GPR_1_TF16.setText(gpr1Value[15]);
		
		String GPR_2 = Operations.numToStr(get_number(3), 16);

		String[] gpr2Value = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < GPR_2.length(); i++) {
			gpr2Value[16 - GPR_2.length() + i] = GPR_2.substring(i, i + 1);
		}
		GPR_2_TF1.setText(gpr2Value[0]);
		GPR_2_TF2.setText(gpr2Value[1]);
		GPR_2_TF3.setText(gpr2Value[2]);
		GPR_2_TF4.setText(gpr2Value[3]);
		GPR_2_TF5.setText(gpr2Value[4]);
		GPR_2_TF6.setText(gpr2Value[5]);
		GPR_2_TF7.setText(gpr2Value[6]);
		GPR_2_TF8.setText(gpr2Value[7]);
		GPR_2_TF9.setText(gpr2Value[8]);
		GPR_2_TF10.setText(gpr2Value[9]);
		GPR_2_TF11.setText(gpr2Value[10]);
		GPR_2_TF12.setText(gpr2Value[11]);
		GPR_2_TF13.setText(gpr2Value[12]);
		GPR_2_TF14.setText(gpr2Value[13]);
		GPR_2_TF15.setText(gpr2Value[14]);
		GPR_2_TF16.setText(gpr2Value[15]);
		
		String GPR_3 = Operations.numToStr(get_number(4), 16);

		String[] gpr3Value = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < GPR_3.length(); i++) {
			gpr3Value[16 - GPR_3.length() + i] = GPR_3.substring(i, i + 1);
		}
		GPR_3_TF1.setText(gpr3Value[0]);
		GPR_3_TF2.setText(gpr3Value[1]);
		GPR_3_TF3.setText(gpr3Value[2]);
		GPR_3_TF4.setText(gpr3Value[3]);
		GPR_3_TF5.setText(gpr3Value[4]);
		GPR_3_TF6.setText(gpr3Value[5]);
		GPR_3_TF7.setText(gpr3Value[6]);
		GPR_3_TF8.setText(gpr3Value[7]);
		GPR_3_TF9.setText(gpr3Value[8]);
		GPR_3_TF10.setText(gpr3Value[9]);
		GPR_3_TF11.setText(gpr3Value[10]);
		GPR_3_TF12.setText(gpr3Value[11]);
		GPR_3_TF13.setText(gpr3Value[12]);
		GPR_3_TF14.setText(gpr3Value[13]);
		GPR_3_TF15.setText(gpr3Value[14]);
		GPR_3_TF16.setText(gpr3Value[15]);
		
		String IXR_1 = Operations.numToStr(get_number(5), 16);

		String[] ixr1Value = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < IXR_1.length(); i++) {
			ixr1Value[16 - IXR_1.length() + i] = IXR_1.substring(i, i + 1);
		}
		IXR_1_TF1.setText(ixr1Value[0]);
		IXR_1_TF2.setText(ixr1Value[1]);
		IXR_1_TF3.setText(ixr1Value[2]);
		IXR_1_TF4.setText(ixr1Value[3]);
		IXR_1_TF5.setText(ixr1Value[4]);
		IXR_1_TF6.setText(ixr1Value[5]);
		IXR_1_TF7.setText(ixr1Value[6]);
		IXR_1_TF8.setText(ixr1Value[7]);
		IXR_1_TF9.setText(ixr1Value[8]);
		IXR_1_TF10.setText(ixr1Value[9]);
		IXR_1_TF11.setText(ixr1Value[10]);
		IXR_1_TF12.setText(ixr1Value[11]);
		IXR_1_TF13.setText(ixr1Value[12]);
		IXR_1_TF14.setText(ixr1Value[13]);
		IXR_1_TF15.setText(ixr1Value[14]);
		IXR_1_TF16.setText(ixr1Value[15]);
		
		String IXR_2 = Operations.numToStr(get_number(6), 16);

		String[] ixr2Value = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < IXR_2.length(); i++) {
			ixr2Value[16 - IXR_2.length() + i] = IXR_2.substring(i, i + 1);
		}
		IXR_2_TF1.setText(ixr2Value[0]);
		IXR_2_TF2.setText(ixr2Value[1]);
		IXR_2_TF3.setText(ixr2Value[2]);
		IXR_2_TF4.setText(ixr2Value[3]);
		IXR_2_TF5.setText(ixr2Value[4]);
		IXR_2_TF6.setText(ixr2Value[5]);
		IXR_2_TF7.setText(ixr2Value[6]);
		IXR_2_TF8.setText(ixr2Value[7]);
		IXR_2_TF9.setText(ixr2Value[8]);
		IXR_2_TF10.setText(ixr2Value[9]);
		IXR_2_TF11.setText(ixr2Value[10]);
		IXR_2_TF12.setText(ixr2Value[11]);
		IXR_2_TF13.setText(ixr2Value[12]);
		IXR_2_TF14.setText(ixr2Value[13]);
		IXR_2_TF15.setText(ixr2Value[14]);
		IXR_2_TF16.setText(ixr2Value[15]);
		
		String IXR_3 = Operations.numToStr(get_number(7), 16);

		String[] ixr3Value = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < IXR_3.length(); i++) {
			ixr3Value[16 - IXR_3.length() + i] = IXR_3.substring(i, i + 1);
		}
		IXR_3_TF1.setText(ixr3Value[0]);
		IXR_3_TF2.setText(ixr3Value[1]);
		IXR_3_TF3.setText(ixr3Value[2]);
		IXR_3_TF4.setText(ixr3Value[3]);
		IXR_3_TF5.setText(ixr3Value[4]);
		IXR_3_TF6.setText(ixr3Value[5]);
		IXR_3_TF7.setText(ixr3Value[6]);
		IXR_3_TF8.setText(ixr3Value[7]);
		IXR_3_TF9.setText(ixr3Value[8]);
		IXR_3_TF10.setText(ixr3Value[9]);
		IXR_3_TF11.setText(ixr3Value[10]);
		IXR_3_TF12.setText(ixr3Value[11]);
		IXR_3_TF13.setText(ixr3Value[12]);
		IXR_3_TF14.setText(ixr3Value[13]);
		IXR_3_TF15.setText(ixr3Value[14]);
		IXR_3_TF16.setText(ixr3Value[15]);

		String FP_0 = Operations.numToStr(get_number(8), 16);

		String[] fp0Value = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < FP_0.length(); i++) {
			fp0Value[16 - FP_0.length() + i] = FP_0.substring(i, i + 1);
		}
		textFR_0_1.setText(fp0Value[0]);
		textFR_0_2.setText(fp0Value[1]);
		textFR_0_3.setText(fp0Value[2]);
		textFR_0_4.setText(fp0Value[3]);
		textFR_0_5.setText(fp0Value[4]);
		textFR_0_6.setText(fp0Value[5]);
		textFR_0_7.setText(fp0Value[6]);
		textFR_0_8.setText(fp0Value[7]);
		textFR_0_9.setText(fp0Value[8]);
		textFR_0_10.setText(fp0Value[9]);
		textFR_0_11.setText(fp0Value[10]);
		textFR_0_12.setText(fp0Value[11]);
		textFR_0_13.setText(fp0Value[12]);
		textFR_0_14.setText(fp0Value[13]);
		textFR_0_15.setText(fp0Value[14]);
		textFR_0_16.setText(fp0Value[15]);

		String FP_1 = Operations.numToStr(get_number(9), 16);

		String[] fp1Value = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < FP_1.length(); i++) {
			fp1Value[16 - FP_1.length() + i] = FP_1.substring(i, i + 1);
		}
		textFR_1_1.setText(fp1Value[0]);
		textFR_1_2.setText(fp1Value[1]);
		textFR_1_3.setText(fp1Value[2]);
		textFR_1_4.setText(fp1Value[3]);
		textFR_1_5.setText(fp1Value[4]);
		textFR_1_6.setText(fp1Value[5]);
		textFR_1_7.setText(fp1Value[6]);
		textFR_1_8.setText(fp1Value[7]);
		textFR_1_9.setText(fp1Value[8]);
		textFR_1_10.setText(fp1Value[9]);
		textFR_1_11.setText(fp1Value[10]);
		textFR_1_12.setText(fp1Value[11]);
		textFR_1_13.setText(fp1Value[12]);
		textFR_1_14.setText(fp1Value[13]);
		textFR_1_15.setText(fp1Value[14]);
		textFR_1_16.setText(fp1Value[15]);
		
		String PC = Operations.numToStr(get_number(10), 12);

		String[] dataValue = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < PC.length(); i++) {
			dataValue[12 - PC.length() + i] = PC.substring(i, i + 1);
		}
		textPc_1.setText(dataValue[0]);
		textPc_2.setText(dataValue[1]);
		textPc_3.setText(dataValue[2]);
		textPc_4.setText(dataValue[3]);
		textPc_5.setText(dataValue[4]);
		textPc_6.setText(dataValue[5]);
		textPc_7.setText(dataValue[6]);
		textPc_8.setText(dataValue[7]);
		textPc_9.setText(dataValue[8]);
		textPc_10.setText(dataValue[9]);
		textPc_11.setText(dataValue[10]);
		textPc_12.setText(dataValue[11]);
		
		String MAR = Operations.numToStr(get_number(11), 12);
		String[] marValue = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < MAR.length(); i++) {
			marValue[12 - MAR.length() + i] = MAR.substring(i, i + 1);
		}
		textMar_1.setText(marValue[0]);
		textMar_2.setText(marValue[1]);
		textMar_3.setText(marValue[2]);
		textMar_4.setText(marValue[3]);
		textMar_5.setText(marValue[4]);
		textMar_6.setText(marValue[5]);
		textMar_7.setText(marValue[6]);
		textMar_8.setText(marValue[7]);
		textMar_9.setText(marValue[8]);
		textMar_10.setText(marValue[9]);
		textMar_11.setText(marValue[10]);
		textMar_12.setText(marValue[11]);
		
		
		String MBR = Operations.numToStr(get_number(12), 16);
		String[] mbrValue = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

		for (int i = 0; i < MBR.length(); i++) {
			mbrValue[16 - MBR.length() + i] = MBR.substring(i, i + 1);
		}
		textMbr_1.setText(mbrValue[0]);
		textMbr_2.setText(mbrValue[1]);
		textMbr_3.setText(mbrValue[2]);
		textMbr_4.setText(mbrValue[3]);
		textMbr_5.setText(mbrValue[4]);
		textMbr_6.setText(mbrValue[5]);
		textMbr_7.setText(mbrValue[6]);
		textMbr_8.setText(mbrValue[7]);
		textMbr_9.setText(mbrValue[8]);
		textMbr_10.setText(mbrValue[9]);
		textMbr_11.setText(mbrValue[10]);
		textMbr_12.setText(mbrValue[11]);
		textMbr_13.setText(mbrValue[12]);
		textMbr_14.setText(mbrValue[13]);
		textMbr_15.setText(mbrValue[14]);
		textMbr_16.setText(mbrValue[15]);
		
		String IR = Operations.numToStr(get_number(13), 16);
		String[] irValue = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};

		for (int i = 0; i < IR.length(); i++) {
			irValue[16 - IR.length() + i] = IR.substring(i, i + 1);
		}
		textIR_1.setText(irValue[0]);
		textIR_2.setText(irValue[1]);
		textIR_3.setText(irValue[2]);
		textIR_4.setText(irValue[3]);
		textIR_5.setText(irValue[4]);
		textIR_6.setText(irValue[5]);
		textIR_7.setText(irValue[6]);
		textIR_8.setText(irValue[7]);
		textIR_9.setText(irValue[8]);
		textIR_10.setText(irValue[9]);
		textIR_11.setText(irValue[10]);
		textIR_12.setText(irValue[11]);		
		textIR_13.setText(mbrValue[12]);
		textIR_14.setText(mbrValue[13]);
		textIR_15.setText(mbrValue[14]);
		textIR_16.setText(mbrValue[15]);
	
		String MFR = Operations.numToStr(get_number(14), 4);
		String[] mfrValue = { "0", "0", "0", "0" };

		for (int i = 0; i < MFR.length(); i++) {
			mfrValue[4 - MFR.length() + i] = MFR.substring(i, i + 1);
		}
		MFR_TF1.setText(mfrValue[0]);
		MFR_TF2.setText(mfrValue[1]);
		MFR_TF3.setText(mfrValue[2]);
		MFR_TF4.setText(mfrValue[3]);
	}

	// Load Button Function to set values in the register
	public void LD_button(String InputofBin, int index) {
		int Input = Operations.strToNum(InputofBin);
		switch (index) {
		case 1:
			 register.setGeneralReg(0,Input);
			 break;
		case 2:
			 register.setGeneralReg(1,Input);
			 break;
		case 3:
			 register.setGeneralReg(2,Input);
			 break;
		case 4:
			 register.setGeneralReg(3,Input);
			 break;
		case 5:
			 register.setIndexReg(1, Input);
			 break;
		case 6:
			 register.setIndexReg(2, Input);
			 break;
		case 7:
			 register.setIndexReg(3, Input);
			 break;
		case 8:
		     register.setFloat(0, Input);
			 break;
		case 9:
		     register.setFloat(1, Input);
			 break;
		case 10:
			 register.setPC(Input);
			 break;
		case 11:
			 register.setMAR(Input);
			 break;
		case 12:
			 register.setMBR(Input);
			 break;
		}
	}

	//Init button call for readIPL
	public static int Init_button() {
		CPU.readIPL();
		return CPU.halt;
	}

	/**
	 * Getting the data in any registers
	 * @param index
	 * @return data in register corresponding to number
	 */
	public int get_number(int index) {
		switch (index) {
			case 1:
				return register.getGeneralReg(0);
			case 2:
				return register.getGeneralReg(1);
			case 3:
				return register.getGeneralReg(2);
			case 4:
				return register.getGeneralReg(3);
			case 5:
				return register.getIndexReg(1);
			case 6:
				return register.getIndexReg(2);
			case 7:
				return register.getIndexReg(3);
			case 8:
			     return register.getFloat(0);
			case 9:
			    return register.getFloat(1);
			case 10:
				return register.getPC();
			case 11:
				return register.getMAR();
			case 12:
				return register.getMBR();
			case 13:
				return register.getIR();
			case 14:
				return register.getMFR();
		}
		return 0;
	}
    
	/**
	 * Setting the data in any registers
	 * @param index
	 */
	public void setBtnvalue(int index){
		if (commonbtn.getText() == "0") {
			commonbtn.setText("1");
			data[index] = "1";
		} else {
			commonbtn.setText("0");
			data[index] = "0";
		}
	}

	//GPR Load Button Functionality
	public void GPRloadBtn() {
		op_bit0 = btnNewButton_15.getText();
		op_bit1 = btnNewButton_14.getText();
		op_bit2 = btnNewButton_13.getText();
		op_bit3 = btnNewButton_12.getText();
		op_bit4 = btnNewButton_11.getText();
		op_bit5 = btnNewButton_10.getText();
		gpr_bit1 = btnNewButton_9.getText();
		gpr_bit0 = btnNewButton_8.getText();
		ixr_bit1 = btnNewButton_7.getText();
		ixr_bit0 = btnNewButton_6.getText();
		i = btnNewButton_5.getText();
		ip_add_4_bit = btnNewButton_4.getText();
		ip_add_3_bit = btnNewButton_3.getText();
		ip_add_2_bit = btnNewButton_2.getText();
		ip_add_1_bit = btnNewButton_1.getText();
		ip_add_0_bit = btnNewButton_0.getText();
			
		address =  ip_add_4_bit + ip_add_3_bit + ip_add_2_bit + ip_add_1_bit + ip_add_0_bit;
		ixr = ixr_bit1 + ixr_bit0;
		gpr = gpr_bit1 + gpr_bit0;
		operation = op_bit0 +  op_bit1 + op_bit2 + op_bit3 + op_bit4 + op_bit5;
		instruction = operation + gpr + ixr + i + address;
	}
}