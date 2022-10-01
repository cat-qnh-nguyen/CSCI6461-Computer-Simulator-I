import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.StringJoiner;

import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {
	private JPanel panel;
	public static CPU CPU = new CPU();

	String data[] = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUI() {
		setTitle("User Interface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 650);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);

		// Labels for GPR0
		JLabel lblGPR_0 = new JLabel("GPR 0");
		lblGPR_0.setBounds(20, 20, 41, 16);
		panel.add(lblGPR_0);

		JTextField GPR_0_TF1 = new JTextField("0");
		GPR_0_TF1.setBounds(65, 20, 20, 16);
		panel.add(GPR_0_TF1);

		JTextField GPR_0_TF2 = new JTextField("0");
		GPR_0_TF2.setBounds(85, 20, 20, 16);
		panel.add(GPR_0_TF2);

		JTextField GPR_0_TF3 = new JTextField("0");
		GPR_0_TF3.setBounds(105, 20, 20, 16);
		panel.add(GPR_0_TF3);

		JTextField GPR_0_TF4 = new JTextField("0");
		GPR_0_TF4.setBounds(125, 20, 20, 16);
		panel.add(GPR_0_TF4);

		JTextField GPR_0_TF5 = new JTextField("0");
		GPR_0_TF5.setBounds(145, 20, 20, 16);
		panel.add(GPR_0_TF5);

		JTextField GPR_0_TF6 = new JTextField("0");
		GPR_0_TF6.setBounds(165, 20, 20, 16);
		panel.add(GPR_0_TF6);

		JTextField GPR_0_TF7 = new JTextField("0");
		GPR_0_TF7.setBounds(185, 20, 20, 16);
		panel.add(GPR_0_TF7);

		JTextField GPR_0_TF8 = new JTextField("0");
		GPR_0_TF8.setBounds(205, 20, 20, 16);
		panel.add(GPR_0_TF8);

		JTextField GPR_0_TF9 = new JTextField("0");
		GPR_0_TF9.setBounds(225, 20, 20, 16);
		panel.add(GPR_0_TF9);

		JTextField GPR_0_TF10 = new JTextField("0");
		GPR_0_TF10.setBounds(245, 20, 20, 16);
		panel.add(GPR_0_TF10);

		JTextField GPR_0_TF11 = new JTextField("0");
		GPR_0_TF11.setBounds(265, 20, 20, 16);
		panel.add(GPR_0_TF11);

		JTextField GPR_0_TF12 = new JTextField("0");
		GPR_0_TF12.setBounds(285, 20, 20, 16);
		panel.add(GPR_0_TF12);

		JTextField GPR_0_TF13 = new JTextField("0");
		GPR_0_TF13.setBounds(305, 20, 20, 16);
		panel.add(GPR_0_TF13);

		JTextField GPR_0_TF14 = new JTextField("0");
		GPR_0_TF14.setBounds(325, 20, 20, 16);
		panel.add(GPR_0_TF14);

		JTextField GPR_0_TF15 = new JTextField("0");
		GPR_0_TF15.setBounds(345, 20, 20, 16);
		panel.add(GPR_0_TF15);

		JTextField GPR_0_TF16 = new JTextField("0");
		GPR_0_TF16.setBounds(365, 20, 20, 16);
		panel.add(GPR_0_TF16);

		JButton GPR_0_loadBtn = new JButton("LD");
		GPR_0_loadBtn.setBounds(395, 20, 55, 16);
		panel.add(GPR_0_loadBtn);

		// GPR1
		JLabel lblGPR_1 = new JLabel("GPR 1");
		lblGPR_1.setBounds(20, 40, 41, 16);
		panel.add(lblGPR_1);

		JTextField GPR_1_TF1 = new JTextField("0");
		GPR_1_TF1.setBounds(65, 40, 20, 16);
		panel.add(GPR_1_TF1);

		JTextField GPR_1_TF2 = new JTextField("0");
		GPR_1_TF2.setBounds(85, 40, 20, 16);
		panel.add(GPR_1_TF2);

		JTextField GPR_1_TF3 = new JTextField("0");
		GPR_1_TF3.setBounds(105, 40, 20, 16);
		panel.add(GPR_1_TF3);

		JTextField GPR_1_TF4 = new JTextField("0");
		GPR_1_TF4.setBounds(125, 40, 20, 16);
		panel.add(GPR_1_TF4);

		JTextField GPR_1_TF5 = new JTextField("0");
		GPR_1_TF5.setBounds(145, 40, 20, 16);
		panel.add(GPR_1_TF5);

		JTextField GPR_1_TF6 = new JTextField("0");
		GPR_1_TF6.setBounds(165, 40, 20, 16);
		panel.add(GPR_1_TF6);

		JTextField GPR_1_TF7 = new JTextField("0");
		GPR_1_TF7.setBounds(185, 40, 20, 16);
		panel.add(GPR_1_TF7);

		JTextField GPR_1_TF8 = new JTextField("0");
		GPR_1_TF8.setBounds(205, 40, 20, 16);
		panel.add(GPR_1_TF8);

		JTextField GPR_1_TF9 = new JTextField("0");
		GPR_1_TF9.setBounds(225, 40, 20, 16);
		panel.add(GPR_1_TF9);

		JTextField GPR_1_TF10 = new JTextField("0");
		GPR_1_TF10.setBounds(245, 40, 20, 16);
		panel.add(GPR_1_TF10);

		JTextField GPR_1_TF11 = new JTextField("0");
		GPR_1_TF11.setBounds(265, 40, 20, 16);
		panel.add(GPR_1_TF11);

		JTextField GPR_1_TF12 = new JTextField("0");
		GPR_1_TF12.setBounds(285, 40, 20, 16);
		panel.add(GPR_1_TF12);

		JTextField GPR_1_TF13 = new JTextField("0");
		GPR_1_TF13.setBounds(305, 40, 20, 16);
		panel.add(GPR_1_TF13);

		JTextField GPR_1_TF14 = new JTextField("0");
		GPR_1_TF14.setBounds(325, 40, 20, 16);
		panel.add(GPR_1_TF14);

		JTextField GPR_1_TF15 = new JTextField("0");
		GPR_1_TF15.setBounds(345, 40, 20, 16);
		panel.add(GPR_1_TF15);

		JTextField GPR_1_TF16 = new JTextField("0");
		GPR_1_TF16.setBounds(365, 40, 20, 16);
		panel.add(GPR_1_TF16);

		JButton GPR_1_loadBtn = new JButton("LD");
		GPR_1_loadBtn.setBounds(395, 40, 55, 16);
		panel.add(GPR_1_loadBtn);

		// GPR2
		JLabel lblGPR_2 = new JLabel("GPR 2");
		lblGPR_2.setBounds(20, 60, 41, 16);
		panel.add(lblGPR_2);

		JTextField GPR_2_TF1 = new JTextField("0");
		GPR_2_TF1.setBounds(65, 60, 20, 16);
		panel.add(GPR_2_TF1);

		JTextField GPR_2_TF2 = new JTextField("0");
		GPR_2_TF2.setBounds(85, 60, 20, 16);
		panel.add(GPR_2_TF2);

		JTextField GPR_2_TF3 = new JTextField("0");
		GPR_2_TF3.setBounds(105, 60, 20, 16);
		panel.add(GPR_2_TF3);

		JTextField GPR_2_TF4 = new JTextField("0");
		GPR_2_TF4.setBounds(125, 60, 20, 16);
		panel.add(GPR_2_TF4);

		JTextField GPR_2_TF5 = new JTextField("0");
		GPR_2_TF5.setBounds(145, 60, 20, 16);
		panel.add(GPR_2_TF5);

		JTextField GPR_2_TF6 = new JTextField("0");
		GPR_2_TF6.setBounds(165, 60, 20, 16);
		panel.add(GPR_2_TF6);

		JTextField GPR_2_TF7 = new JTextField("0");
		GPR_2_TF7.setBounds(185, 60, 20, 16);
		panel.add(GPR_2_TF7);

		JTextField GPR_2_TF8 = new JTextField("0");
		GPR_2_TF8.setBounds(205, 60, 20, 16);
		panel.add(GPR_2_TF8);

		JTextField GPR_2_TF9 = new JTextField("0");
		GPR_2_TF9.setBounds(225, 60, 20, 16);
		panel.add(GPR_2_TF9);

		JTextField GPR_2_TF10 = new JTextField("0");
		GPR_2_TF10.setBounds(245, 60, 20, 16);
		panel.add(GPR_2_TF10);

		JTextField GPR_2_TF11 = new JTextField("0");
		GPR_2_TF11.setBounds(265, 60, 20, 16);
		panel.add(GPR_2_TF11);

		JTextField GPR_2_TF12 = new JTextField("0");
		GPR_2_TF12.setBounds(285, 60, 20, 16);
		panel.add(GPR_2_TF12);

		JTextField GPR_2_TF13 = new JTextField("0");
		GPR_2_TF13.setBounds(305, 60, 20, 16);
		panel.add(GPR_2_TF13);

		JTextField GPR_2_TF14 = new JTextField("0");
		GPR_2_TF14.setBounds(325, 60, 20, 16);
		panel.add(GPR_2_TF14);

		JTextField GPR_2_TF15 = new JTextField("0");
		GPR_2_TF15.setBounds(345, 60, 20, 16);
		panel.add(GPR_2_TF15);

		JTextField GPR_2_TF16 = new JTextField("0");
		GPR_2_TF16.setBounds(365, 60, 20, 16);
		panel.add(GPR_2_TF16);

		JButton lblGPR_2_loadBtn = new JButton("LD");
		lblGPR_2_loadBtn.setBounds(395, 60, 55, 16);
		panel.add(lblGPR_2_loadBtn);

		JLabel lblGPR_3 = new JLabel("GPR 3");
		lblGPR_3.setBounds(20, 80, 41, 16);
		panel.add(lblGPR_3);

		JTextField GPR_3_TF1 = new JTextField("0");
		GPR_3_TF1.setBounds(65, 80, 20, 16);
		panel.add(GPR_3_TF1);

		JTextField GPR_3_TF2 = new JTextField("0");
		GPR_3_TF2.setBounds(85, 80, 20, 16);
		panel.add(GPR_3_TF2);

		JTextField GPR_3_TF3 = new JTextField("0");
		GPR_3_TF3.setBounds(105, 80, 20, 16);
		panel.add(GPR_3_TF3);

		JTextField GPR_3_TF4 = new JTextField("0");
		GPR_3_TF4.setBounds(125, 80, 20, 16);
		panel.add(GPR_3_TF4);

		JTextField GPR_3_TF5 = new JTextField("0");
		GPR_3_TF5.setBounds(145, 80, 20, 16);
		panel.add(GPR_3_TF5);

		JTextField GPR_3_TF6 = new JTextField("0");
		GPR_3_TF6.setBounds(165, 80, 20, 16);
		panel.add(GPR_3_TF6);

		JTextField GPR_3_TF7 = new JTextField("0");
		GPR_3_TF7.setBounds(185, 80, 20, 16);
		panel.add(GPR_3_TF7);

		JTextField GPR_3_TF8 = new JTextField("0");
		GPR_3_TF8.setBounds(205, 80, 20, 16);
		panel.add(GPR_3_TF8);

		JTextField GPR_3_TF9 = new JTextField("0");
		GPR_3_TF9.setBounds(225, 80, 20, 16);
		panel.add(GPR_3_TF9);

		JTextField GPR_3_TF10 = new JTextField("0");
		GPR_3_TF10.setBounds(245, 80, 20, 16);
		panel.add(GPR_3_TF10);

		JTextField GPR_3_TF11 = new JTextField("0");
		GPR_3_TF11.setBounds(265, 80, 20, 16);
		panel.add(GPR_3_TF11);

		JTextField GPR_3_TF12 = new JTextField("0");
		GPR_3_TF12.setBounds(285, 80, 20, 16);
		panel.add(GPR_3_TF12);

		JTextField GPR_3_TF13 = new JTextField("0");
		GPR_3_TF13.setBounds(305, 80, 20, 16);
		panel.add(GPR_3_TF13);

		JTextField GPR_3_TF14 = new JTextField("0");
		GPR_3_TF14.setBounds(325, 80, 20, 16);
		panel.add(GPR_3_TF14);

		JTextField GPR_3_TF15 = new JTextField("0");
		GPR_3_TF15.setBounds(345, 80, 20, 16);
		panel.add(GPR_3_TF15);

		JTextField GPR_3_TF16 = new JTextField("0");
		GPR_3_TF16.setBounds(365, 80, 20, 16);
		panel.add(GPR_3_TF16);

		JButton lblGPR_3_loadBtn = new JButton("LD");
		lblGPR_3_loadBtn.setBounds(395, 80, 55, 16);
		panel.add(lblGPR_3_loadBtn);

		// Labels for IXR
		JLabel lblIXR_1 = new JLabel("IXR 1");
		lblIXR_1.setBounds(20, 120, 41, 16);
		panel.add(lblIXR_1);

		JTextField IXR_1_TF1 = new JTextField("0");
		IXR_1_TF1.setBounds(65, 120, 20, 16);
		panel.add(IXR_1_TF1);

		JTextField IXR_1_TF2 = new JTextField("0");
		IXR_1_TF2.setBounds(85, 120, 20, 16);
		panel.add(IXR_1_TF2);

		JTextField IXR_1_TF3 = new JTextField("0");
		IXR_1_TF3.setBounds(105, 120, 20, 16);
		panel.add(IXR_1_TF3);

		JTextField IXR_1_TF4 = new JTextField("0");
		IXR_1_TF4.setBounds(125, 120, 20, 16);
		panel.add(IXR_1_TF4);

		JTextField IXR_1_TF5 = new JTextField("0");
		IXR_1_TF5.setBounds(145, 120, 20, 16);
		panel.add(IXR_1_TF5);

		JTextField IXR_1_TF6 = new JTextField("0");
		IXR_1_TF6.setBounds(165, 120, 20, 16);
		panel.add(IXR_1_TF6);

		JTextField IXR_1_TF7 = new JTextField("0");
		IXR_1_TF7.setBounds(185, 120, 20, 16);
		panel.add(IXR_1_TF7);

		JTextField IXR_1_TF8 = new JTextField("0");
		IXR_1_TF8.setBounds(205, 120, 20, 16);
		panel.add(IXR_1_TF8);

		JTextField IXR_1_TF9 = new JTextField("0");
		IXR_1_TF9.setBounds(225, 120, 20, 16);
		panel.add(IXR_1_TF9);

		JTextField IXR_1_TF10 = new JTextField("0");
		IXR_1_TF10.setBounds(245, 120, 20, 16);
		panel.add(IXR_1_TF10);

		JTextField IXR_1_TF11 = new JTextField("0");
		IXR_1_TF11.setBounds(265, 120, 20, 16);
		panel.add(IXR_1_TF11);

		JTextField IXR_1_TF12 = new JTextField("0");
		IXR_1_TF12.setBounds(285, 120, 20, 16);
		panel.add(IXR_1_TF12);

		JTextField IXR_1_TF13 = new JTextField("0");
		IXR_1_TF13.setBounds(305, 120, 20, 16);
		panel.add(IXR_1_TF13);

		JTextField IXR_1_TF14 = new JTextField("0");
		IXR_1_TF14.setBounds(325, 120, 20, 16);
		panel.add(IXR_1_TF14);

		JTextField IXR_1_TF15 = new JTextField("0");
		IXR_1_TF15.setBounds(345, 120, 20, 16);
		panel.add(IXR_1_TF15);

		JTextField IXR_1_TF16 = new JTextField("0");
		IXR_1_TF16.setBounds(365, 120, 20, 16);
		panel.add(IXR_1_TF16);

		JButton IXR_1_loadBtn = new JButton("LD");
		IXR_1_loadBtn.setBounds(395, 120, 55, 16);
		panel.add(IXR_1_loadBtn);

		JLabel lblIXR_2 = new JLabel("IXR 2");
		lblIXR_2.setBounds(20, 140, 41, 16);
		panel.add(lblIXR_2);

		JTextField IXR_2_TF1 = new JTextField("0");
		IXR_2_TF1.setBounds(65, 140, 20, 16);
		panel.add(IXR_2_TF1);

		JTextField IXR_2_TF2 = new JTextField("0");
		IXR_2_TF2.setBounds(85, 140, 20, 16);
		panel.add(IXR_2_TF2);

		JTextField IXR_2_TF3 = new JTextField("0");
		IXR_2_TF3.setBounds(105, 140, 20, 16);
		panel.add(IXR_2_TF3);

		JTextField IXR_2_TF4 = new JTextField("0");
		IXR_2_TF4.setBounds(125, 140, 20, 16);
		panel.add(IXR_2_TF4);

		JTextField IXR_2_TF5 = new JTextField("0");
		IXR_2_TF5.setBounds(145, 140, 20, 16);
		panel.add(IXR_2_TF5);

		JTextField IXR_2_TF6 = new JTextField("0");
		IXR_2_TF6.setBounds(165, 140, 20, 16);
		panel.add(IXR_2_TF6);

		JTextField IXR_2_TF7 = new JTextField("0");
		IXR_2_TF7.setBounds(185, 140, 20, 16);
		panel.add(IXR_2_TF7);

		JTextField IXR_2_TF8 = new JTextField("0");
		IXR_2_TF8.setBounds(205, 140, 20, 16);
		panel.add(IXR_2_TF8);

		JTextField IXR_2_TF9 = new JTextField("0");
		IXR_2_TF9.setBounds(225, 140, 20, 16);
		panel.add(IXR_2_TF9);

		JTextField IXR_2_TF10 = new JTextField("0");
		IXR_2_TF10.setBounds(245, 140, 20, 16);
		panel.add(IXR_2_TF10);

		JTextField IXR_2_TF11 = new JTextField("0");
		IXR_2_TF11.setBounds(265, 140, 20, 16);
		panel.add(IXR_2_TF11);

		JTextField IXR_2_TF12 = new JTextField("0");
		IXR_2_TF12.setBounds(285, 140, 20, 16);
		panel.add(IXR_2_TF12);

		JTextField IXR_2_TF13 = new JTextField("0");
		IXR_2_TF13.setBounds(305, 140, 20, 16);
		panel.add(IXR_2_TF13);

		JTextField IXR_2_TF14 = new JTextField("0");
		IXR_2_TF14.setBounds(325, 140, 20, 16);
		panel.add(IXR_2_TF14);

		JTextField IXR_2_TF15 = new JTextField("0");
		IXR_2_TF15.setBounds(345, 140, 20, 16);
		panel.add(IXR_2_TF15);

		JTextField IXR_2_TF16 = new JTextField("0");
		IXR_2_TF16.setBounds(365, 140, 20, 16);
		panel.add(IXR_2_TF16);

		JButton IXR_2_loadBtn = new JButton("LD");
		IXR_2_loadBtn.setBounds(395, 140, 55, 16);
		panel.add(IXR_2_loadBtn);

		JLabel lblIXR_3 = new JLabel("IXR 3");
		lblIXR_3.setBounds(20, 160, 41, 16);
		panel.add(lblIXR_3);

		JTextField IXR_3_TF1 = new JTextField("0");
		IXR_3_TF1.setBounds(65, 160, 20, 16);
		panel.add(IXR_3_TF1);

		JTextField IXR_3_TF2 = new JTextField("0");
		IXR_3_TF2.setBounds(85, 160, 20, 16);
		panel.add(IXR_3_TF2);

		JTextField IXR_3_TF3 = new JTextField("0");
		IXR_3_TF3.setBounds(105, 160, 20, 16);
		panel.add(IXR_3_TF3);

		JTextField IXR_3_TF4 = new JTextField("0");
		IXR_3_TF4.setBounds(125, 160, 20, 16);
		panel.add(IXR_3_TF4);

		JTextField IXR_3_TF5 = new JTextField("0");
		IXR_3_TF5.setBounds(145, 160, 20, 16);
		panel.add(IXR_3_TF5);

		JTextField IXR_3_TF6 = new JTextField("0");
		IXR_3_TF6.setBounds(165, 160, 20, 16);
		panel.add(IXR_3_TF6);

		JTextField IXR_3_TF7 = new JTextField("0");
		IXR_3_TF7.setBounds(185, 160, 20, 16);
		panel.add(IXR_3_TF7);

		JTextField IXR_3_TF8 = new JTextField("0");
		IXR_3_TF8.setBounds(205, 160, 20, 16);
		panel.add(IXR_3_TF8);

		JTextField IXR_3_TF9 = new JTextField("0");
		IXR_3_TF9.setBounds(225, 160, 20, 16);
		panel.add(IXR_3_TF9);

		JTextField IXR_3_TF10 = new JTextField("0");
		IXR_3_TF10.setBounds(245, 160, 20, 16);
		panel.add(IXR_3_TF10);

		JTextField IXR_3_TF11 = new JTextField("0");
		IXR_3_TF11.setBounds(265, 160, 20, 16);
		panel.add(IXR_3_TF11);

		JTextField IXR_3_TF12 = new JTextField("0");
		IXR_3_TF12.setBounds(285, 160, 20, 16);
		panel.add(IXR_3_TF12);

		JTextField IXR_3_TF13 = new JTextField("0");
		IXR_3_TF13.setBounds(305, 160, 20, 16);
		panel.add(IXR_3_TF13);

		JTextField IXR_3_TF14 = new JTextField("0");
		IXR_3_TF14.setBounds(325, 160, 20, 16);
		panel.add(IXR_3_TF14);

		JTextField IXR_3_TF15 = new JTextField("0");
		IXR_3_TF15.setBounds(345, 160, 20, 16);
		panel.add(IXR_3_TF15);

		JTextField IXR_3_TF16 = new JTextField("0");
		IXR_3_TF16.setBounds(365, 160, 20, 16);
		panel.add(IXR_3_TF16);

		JButton IXR_3_loadBtn = new JButton("LD");
		IXR_3_loadBtn.setBounds(395, 160, 55, 16);
		panel.add(IXR_3_loadBtn);

		// Labels for PC, MAR, MBR, IR, MFR, Privileged
		JLabel PClbl = new JLabel("PC");
		PClbl.setBounds(500, 20, 25, 16);
		panel.add(PClbl);

		JTextField textPc_1 = new JTextField("0");
		textPc_1.setBounds(545, 20, 20, 16);
		panel.add(textPc_1);

		JTextField textPc_2 = new JTextField("0");
		textPc_2.setBounds(565, 20, 20, 16);
		panel.add(textPc_2);

		JTextField textPc_3 = new JTextField("0");
		textPc_3.setBounds(585, 20, 20, 16);
		panel.add(textPc_3);

		JTextField textPc_4 = new JTextField("0");
		textPc_4.setBounds(605, 20, 20, 16);
		panel.add(textPc_4);

		JTextField textPc_5 = new JTextField("0");
		textPc_5.setBounds(625, 20, 20, 16);
		panel.add(textPc_5);

		JTextField textPc_6 = new JTextField("0");
		textPc_6.setBounds(645, 20, 20, 16);
		panel.add(textPc_6);

		JTextField textPc_7 = new JTextField("0");
		textPc_7.setBounds(665, 20, 20, 16);
		panel.add(textPc_7);

		JTextField textPc_8 = new JTextField("0");
		textPc_8.setBounds(685, 20, 20, 16);
		panel.add(textPc_8);

		JTextField textPc_9 = new JTextField("0");
		textPc_9.setBounds(705, 20, 20, 16);
		panel.add(textPc_9);

		JTextField textPc_10 = new JTextField("0");
		textPc_10.setBounds(725, 20, 20, 16);
		panel.add(textPc_10);

		JTextField textPc_11 = new JTextField("0");
		textPc_11.setBounds(745, 20, 20, 16);
		panel.add(textPc_11);

		JTextField textPc_12 = new JTextField("0");
		textPc_12.setBounds(765, 20, 20, 16);
		panel.add(textPc_12);

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

				Register.getInstance().setPC(Integer.parseInt(joiner.toString(), 2));
			}
		});
		panel.add(PCbtn);

		// MAR
		JLabel MARlbl = new JLabel("MAR");
		MARlbl.setBounds(500, 40, 30, 16);
		panel.add(MARlbl);

		JTextField textMar_1 = new JTextField("0");
		textMar_1.setBounds(545, 40, 20, 16);
		panel.add(textMar_1);

		JTextField textMar_2 = new JTextField("0");
		textMar_2.setBounds(565, 40, 20, 16);
		panel.add(textMar_2);

		JTextField textMar_3 = new JTextField("0");
		textMar_3.setBounds(585, 40, 20, 16);
		panel.add(textMar_3);

		JTextField textMar_4 = new JTextField("0");
		textMar_4.setBounds(605, 40, 20, 16);
		panel.add(textMar_4);

		JTextField textMar_5 = new JTextField("0");
		textMar_5.setBounds(625, 40, 20, 16);
		panel.add(textMar_5);

		JTextField textMar_6 = new JTextField("0");
		textMar_6.setBounds(645, 40, 20, 16);
		panel.add(textMar_6);

		JTextField textMar_7 = new JTextField("0");
		textMar_7.setBounds(665, 40, 20, 16);
		panel.add(textMar_7);

		JTextField textMar_8 = new JTextField("0");
		textMar_8.setBounds(685, 40, 20, 16);
		panel.add(textMar_8);

		JTextField textMar_9 = new JTextField("0");
		textMar_9.setBounds(705, 40, 20, 16);
		panel.add(textMar_9);

		JTextField textMar_10 = new JTextField("0");
		textMar_10.setBounds(725, 40, 20, 16);
		panel.add(textMar_10);

		JTextField textMar_11 = new JTextField("0");
		textMar_11.setBounds(745, 40, 20, 16);
		panel.add(textMar_11);

		JTextField textMar_12 = new JTextField("0");
		textMar_12.setBounds(765, 40, 20, 16);
		panel.add(textMar_12);

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

				Register.getInstance().setMAR(Integer.parseInt(joiner.toString(), 2));
			}
		});
		panel.add(MARbtn);

		// MBR
		JLabel MBRlbl = new JLabel("MBR");
		MBRlbl.setBounds(500, 61, 30, 15);
		panel.add(MBRlbl);

		JTextField textMbr_1 = new JTextField("0");
		textMbr_1.setBounds(545, 61, 20, 16);
		panel.add(textMbr_1);

		JTextField textMbr_2 = new JTextField("0");
		textMbr_2.setBounds(565, 61, 20, 16);
		panel.add(textMbr_2);

		JTextField textMbr_3 = new JTextField("0");
		textMbr_3.setBounds(585, 61, 20, 16);
		panel.add(textMbr_3);

		JTextField textMbr_4 = new JTextField("0");
		textMbr_4.setBounds(605, 61, 20, 16);
		panel.add(textMbr_4);

		JTextField textMbr_5 = new JTextField("0");
		textMbr_5.setBounds(625, 61, 20, 16);
		panel.add(textMbr_5);

		JTextField textMbr_6 = new JTextField("0");
		textMbr_6.setBounds(645, 61, 20, 16);
		panel.add(textMbr_6);

		JTextField textMbr_7 = new JTextField("0");
		textMbr_7.setBounds(665, 61, 20, 16);
		panel.add(textMbr_7);

		JTextField textMbr_8 = new JTextField("0");
		textMbr_8.setBounds(685, 61, 20, 16);
		panel.add(textMbr_8);

		JTextField textMbr_9 = new JTextField("0");
		textMbr_9.setBounds(705, 61, 20, 16);
		panel.add(textMbr_9);

		JTextField textMbr_10 = new JTextField("0");
		textMbr_10.setBounds(725, 61, 20, 16);
		panel.add(textMbr_10);

		JTextField textMbr_11 = new JTextField("0");
		textMbr_11.setBounds(745, 61, 20, 16);
		panel.add(textMbr_11);

		JTextField textMbr_12 = new JTextField("0");
		textMbr_12.setBounds(765, 61, 20, 16);
		panel.add(textMbr_12);

		JTextField textMbr_13 = new JTextField("0");
		textMbr_13.setBounds(785, 61, 20, 16);
		panel.add(textMbr_13);

		JTextField textMbr_14 = new JTextField("0");
		textMbr_14.setBounds(805, 61, 20, 16);
		panel.add(textMbr_14);

		JTextField textMbr_15 = new JTextField("0");
		textMbr_15.setBounds(825, 61, 20, 16);
		panel.add(textMbr_15);

		JTextField textMbr_16 = new JTextField("0");
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

				Register.getInstance().setMBR(Integer.parseInt(joiner.toString(), 2));
			}
		});
		panel.add(MBRbtn);

		// IR
		JLabel IRlbl = new JLabel("IR");
		IRlbl.setBounds(500, 80, 25, 16);
		panel.add(IRlbl);

		JTextField textIR_1 = new JTextField("0");
		textIR_1.setBounds(545, 80, 20, 16);
		panel.add(textIR_1);

		JTextField textIR_2 = new JTextField("0");
		textIR_2.setBounds(565, 80, 20, 16);
		panel.add(textIR_2);

		JTextField textIR_3 = new JTextField("0");
		textIR_3.setBounds(585, 80, 20, 16);
		panel.add(textIR_3);

		JTextField textIR_4 = new JTextField("0");
		textIR_4.setBounds(605, 80, 20, 16);
		panel.add(textIR_4);

		JTextField textIR_5 = new JTextField("0");
		textIR_5.setBounds(625, 80, 20, 16);
		panel.add(textIR_5);

		JTextField textIR_6 = new JTextField("0");
		textIR_6.setBounds(645, 80, 20, 16);
		panel.add(textIR_6);

		JTextField textIR_7 = new JTextField("0");
		textIR_7.setBounds(665, 80, 20, 16);
		panel.add(textIR_7);

		JTextField textIR_8 = new JTextField("0");
		textIR_8.setBounds(685, 80, 20, 16);
		panel.add(textIR_8);

		JTextField textIR_9 = new JTextField("0");
		textIR_9.setBounds(705, 80, 20, 16);
		panel.add(textIR_9);

		JTextField textIR_10 = new JTextField("0");
		textIR_10.setBounds(725, 80, 20, 16);
		panel.add(textIR_10);

		JTextField textIR_11 = new JTextField("0");
		textIR_11.setBounds(745, 80, 20, 16);
		panel.add(textIR_11);

		JTextField textIR_12 = new JTextField("0");
		textIR_12.setBounds(765, 80, 20, 16);
		panel.add(textIR_12);

		JTextField textIR_13 = new JTextField("0");
		textIR_13.setBounds(785, 80, 20, 16);
		panel.add(textIR_13);

		JTextField textIR_14 = new JTextField("0");
		textIR_14.setBounds(805, 80, 20, 16);
		panel.add(textIR_14);

		JTextField textIR_15 = new JTextField("0");
		textIR_15.setBounds(825, 80, 20, 16);
		panel.add(textIR_15);

		JTextField textIR_16 = new JTextField("0");
		textIR_16.setBounds(845, 80, 20, 16);
		panel.add(textIR_16);

		// MFR
		JLabel MFRlbl = new JLabel("MFR");
		MFRlbl.setBounds(500, 101, 30, 16);
		panel.add(MFRlbl);

		JTextField MFR_TF1 = new JTextField("0");
		MFR_TF1.setBounds(545, 101, 20, 16);
		panel.add(MFR_TF1);

		JTextField MFR_TF2 = new JTextField("0");
		MFR_TF2.setBounds(565, 101, 20, 16);
		panel.add(MFR_TF2);

		JTextField MFR_TF3 = new JTextField("0");
		MFR_TF3.setBounds(585, 101, 20, 16);
		panel.add(MFR_TF3);

		JTextField MFR_TF4 = new JTextField("0");
		MFR_TF4.setBounds(605, 101, 20, 16);
		panel.add(MFR_TF4);

		// Privileged
		// JLabel Privlbl = new JLabel("Privileged");
		// Privlbl.setBounds(470, 120, 66, 16);
		// panel.add(Privlbl);
		//
		// JTextField Privlbl_textfield = new JTextField("0");
		// Privlbl_textfield.setBounds(545, 120, 20, 16);
		// panel.add(Privlbl_textfield);

		// Buttons for instruction 0-15
		// User cannot click these buttons for now.

		// String data = "0000000000000000" ;
		// int btnLeftSideGap = 20;
		//
		// for(int i=15; i>=0; i--) {
		// JButton btnNewButton = new JButton("15");
		// btnNewButton.setBounds(btnLeftSideGap, 250, 48, 45);
		// btnNewButton.setText("0");
		//
		// btnNewButton.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// // TODO Auto-generated method stub
		// if(btnNewButton.getText()=="0") {
		// btnNewButton.setText("1");
		// }
		// else{
		// btnNewButton.setText("0");
		// }
		// data = getDataValue();
		// }
		// });
		//
		// panel.add(btnNewButton);
		//
		// if(i==10 || i==8 || i==6 || i==5) {
		// btnLeftSideGap += 54;
		// }
		// else {
		// btnLeftSideGap += 44;
		// }
		//
		// }

		JButton btnNewButton_15 = new JButton("15");
		btnNewButton_15.setBounds(20, 250, 48, 45);
		btnNewButton_15.setText("0");
		btnNewButton_15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_15.getText() == "0") {
					btnNewButton_15.setText("1");
					data[0] = "1";
				} else {
					btnNewButton_15.setText("0");
					data[0] = "0";
				}

			}

		});
		panel.add(btnNewButton_15);

		JButton btnNewButton_14 = new JButton("14");
		btnNewButton_14.setBounds(64, 250, 48, 45);
		btnNewButton_14.setText("0");
		btnNewButton_14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_14.getText() == "0") {
					btnNewButton_14.setText("1");
					data[1] = "1";
				} else {
					btnNewButton_14.setText("0");
					data[1] = "0";
				}
			}

		});
		panel.add(btnNewButton_14);

		JButton btnNewButton_13 = new JButton("13");
		btnNewButton_13.setBounds(108, 250, 48, 45);
		btnNewButton_13.setText("0");
		btnNewButton_13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_13.getText() == "0") {
					btnNewButton_13.setText("1");
					data[2] = "1";
				} else {
					btnNewButton_13.setText("0");
					data[2] = "0";
				}
			}

		});
		panel.add(btnNewButton_13);

		JButton btnNewButton_12 = new JButton("12");
		btnNewButton_12.setBounds(152, 250, 48, 45);
		btnNewButton_12.setText("0");
		btnNewButton_12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_12.getText() == "0") {
					btnNewButton_12.setText("1");
					data[3] = "1";
				} else {
					btnNewButton_12.setText("0");
					data[3] = "0";
				}
				// data[3] = btnNewButton_15.getText();
			}

		});
		panel.add(btnNewButton_12);

		JButton btnNewButton_11 = new JButton("11");
		btnNewButton_11.setBounds(196, 250, 48, 45);
		btnNewButton_11.setText("0");
		btnNewButton_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_11.getText() == "0") {
					btnNewButton_11.setText("1");
					data[4] = "1";
				} else {
					btnNewButton_11.setText("0");
					data[4] = "0";
				}
			}

		});
		panel.add(btnNewButton_11);

		JButton btnNewButton_10 = new JButton("10");
		btnNewButton_10.setBounds(240, 250, 48, 45);
		btnNewButton_10.setText("0");
		btnNewButton_10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_10.getText() == "0") {
					btnNewButton_10.setText("1");
					data[5] = "1";
				} else {
					btnNewButton_10.setText("0");
					data[5] = "0";
				}
			}

		});
		panel.add(btnNewButton_10);

		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBounds(294, 250, 48, 45);
		btnNewButton_9.setText("0");
		btnNewButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_9.getText() == "0") {
					btnNewButton_9.setText("1");
					data[6] = "1";
				} else {
					btnNewButton_9.setText("0");
					data[6] = "0";
				}
			}

		});
		panel.add(btnNewButton_9);

		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setBounds(338, 250, 48, 45);
		btnNewButton_8.setText("0");
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_8.getText() == "0") {
					btnNewButton_8.setText("1");
					data[7] = "1";
				} else {
					btnNewButton_8.setText("0");
					data[7] = "0";
				}
			}

		});
		panel.add(btnNewButton_8);

		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBounds(392, 250, 48, 45);
		btnNewButton_7.setText("0");
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_7.getText() == "0") {
					btnNewButton_7.setText("1");
					data[8] = "1";
				} else {
					btnNewButton_7.setText("0");
					data[8] = "0";
				}
			}

		});
		panel.add(btnNewButton_7);

		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBounds(436, 250, 48, 45);
		btnNewButton_6.setText("0");
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_6.getText() == "0") {
					btnNewButton_6.setText("1");
					data[9] = "1";
				} else {
					btnNewButton_6.setText("0");
					data[9] = "0";
				}
			}

		});
		panel.add(btnNewButton_6);

		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBounds(490, 250, 48, 45);
		btnNewButton_5.setText("0");
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_5.getText() == "0") {
					btnNewButton_5.setText("1");
					data[10] = "1";
				} else {
					btnNewButton_5.setText("0");
					data[10] = "0";
				}
			}

		});
		panel.add(btnNewButton_5);

		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBounds(544, 250, 48, 45);
		btnNewButton_4.setText("0");
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_4.getText() == "0") {
					btnNewButton_4.setText("1");
					data[11] = "1";
				} else {
					btnNewButton_4.setText("0");
					data[11] = "0";
				}
			}

		});
		panel.add(btnNewButton_4);

		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBounds(588, 250, 48, 45);
		btnNewButton_3.setText("0");
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_3.getText() == "0") {
					btnNewButton_3.setText("1");
					data[12] = "1";
				} else {
					btnNewButton_3.setText("0");
					data[12] = "0";
				}
			}

		});
		panel.add(btnNewButton_3);

		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBounds(632, 250, 48, 45);
		btnNewButton_2.setText("0");
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_2.getText() == "0") {
					btnNewButton_2.setText("1");
					data[13] = "1";
				} else {
					btnNewButton_2.setText("0");
					data[13] = "0";
				}
			}

		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(676, 250, 48, 45);
		btnNewButton_1.setText("0");
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_1.getText() == "0") {
					btnNewButton_1.setText("1");
					data[14] = "1";
				} else {
					btnNewButton_1.setText("0");
					data[14] = "0";
				}
			}

		});
		panel.add(btnNewButton_1);

		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.setBounds(720, 250, 48, 45);
		btnNewButton_0.setText("0");
		btnNewButton_0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_0.getText() == "0") {
					btnNewButton_0.setText("1");
					data[15] = "1";
				} else {
					btnNewButton_0.setText("0");
					data[15] = "0";
				}
			}

		});
		panel.add(btnNewButton_0);

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
		// lblNewLabel_3.setFont(new Font("", Font.BOLD, 15));
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setBounds(630, 307, 65, 16);
		panel.add(lblNewLabel_4);

		// Store
		JButton storeBtn = new JButton("Store");
		storeBtn.setBounds(245, 362, 75, 30);
		storeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Memory.getInstance().store(Register.getInstance().getMAR(), Register.getInstance().getMBR());
				// System.out.println("Memory address " +
				// Memory.getInstance().load(Register.getInstance().getMAR()));
			}

		});
		panel.add(storeBtn);

		// St+
		JButton stBtn = new JButton("St+");
		stBtn.setBounds(335, 362, 75, 30);
		stBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// storing the value MBR in MAR
				Memory.getInstance().store(Register.getInstance().getMAR(), Register.getInstance().getMBR());
				// System.out.println("Memory address " +
				// Memory.getInstance().load(Register.getInstance().getMAR()));
				// Incrementing the MAR and changing the string array - dataValue
				String MAR = Integer.toBinaryString(Register.getInstance().getMAR() + 1);

				String[] dataValue = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

				for (int i = 0; i < MAR.length(); i++) {
					dataValue[12 - MAR.length() + i] = MAR.substring(i, i + 1);
				}

				// setting the new incremented MAR value
				Register.getInstance().setMAR(Integer.parseInt(MAR.toString(), 2));

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

		});
		panel.add(stBtn);

		// Load
		JButton loadBtn = new JButton("Load");
		loadBtn.setBounds(435, 362, 75, 30);
		loadBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = Integer.toBinaryString(Memory.getInstance().load(Register.getInstance().getMAR()));

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

				Register.getInstance().setMBR(Integer.parseInt(joiner.toString(), 2));
			}

		});
		panel.add(loadBtn);

		// SS
		JButton ssBtn = new JButton("SS");
		ssBtn.setBounds(330, 405, 50, 45);
		ssBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// load and run the instruction
				CPU cpu = new CPU();
				cpu.singleStep();
				Load loadInst = new Load();
				loadInst.loadInstruction(Register.getInstance().getMAR());
				loadInst.runInstruction();

				// get MAR
				String MARVal = Integer.toBinaryString(Register.getInstance().getMAR());
				MARVal = String.format("%12s", MARVal).replaceAll(" ", "0");
				System.out.println("MARVal" + MARVal);
				String[] MARValArr = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

				for (int i = 0; i < MARVal.length(); i++) {
					MARValArr[i] = MARVal.substring(i, i + 1);
				}

				// display MAR
				textMar_1.setText(MARValArr[0]);
				textMar_2.setText(MARValArr[1]);
				textMar_3.setText(MARValArr[2]);
				textMar_4.setText(MARValArr[3]);
				textMar_5.setText(MARValArr[4]);
				textMar_6.setText(MARValArr[5]);
				textMar_7.setText(MARValArr[6]);
				textMar_8.setText(MARValArr[7]);
				textMar_9.setText(MARValArr[8]);
				textMar_10.setText(MARValArr[9]);
				textMar_11.setText(MARValArr[10]);
				textMar_12.setText(MARValArr[11]);

				// get IR
				String instruction = Integer.toBinaryString(Register.getInstance().getIR());
				instruction = String.format("%16s", instruction).replaceAll(" ", "0");
				String[] instArr = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

				for (int i = 0; i < instruction.length(); i++) {
					instArr[i] = instruction.substring(i, i + 1);
				}

				// displaying in the IR field
				textIR_1.setText(instArr[0]);
				textIR_2.setText(instArr[1]);
				textIR_3.setText(instArr[2]);
				textIR_4.setText(instArr[3]);
				textIR_5.setText(instArr[4]);
				textIR_6.setText(instArr[5]);
				textIR_7.setText(instArr[6]);
				textIR_8.setText(instArr[7]);
				textIR_9.setText(instArr[8]);
				textIR_10.setText(instArr[9]);
				textIR_11.setText(instArr[10]);
				textIR_12.setText(instArr[11]);
				textIR_13.setText(instArr[12]);
				textIR_14.setText(instArr[13]);
				textIR_15.setText(instArr[14]);
				textIR_16.setText(instArr[15]);

				// display instruction output in GPR
				String GPRVal = Integer.toBinaryString(Register.getInstance().getGeneralReg(loadInst.R));
				String[] dataValue = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
				for (int i = 0; i < GPRVal.length(); i++) {
					dataValue[16 - GPRVal.length() + i] = GPRVal.substring(i, i + 1);
				}
				switch (loadInst.R) {
					case 0:
						// display in GPR0
						GPR_0_TF1.setText(dataValue[0]);
						GPR_0_TF2.setText(dataValue[1]);
						GPR_0_TF3.setText(dataValue[2]);
						GPR_0_TF4.setText(dataValue[3]);
						GPR_0_TF5.setText(dataValue[4]);
						GPR_0_TF6.setText(dataValue[5]);
						GPR_0_TF7.setText(dataValue[6]);
						GPR_0_TF8.setText(dataValue[7]);
						GPR_0_TF9.setText(dataValue[8]);
						GPR_0_TF10.setText(dataValue[9]);
						GPR_0_TF11.setText(dataValue[10]);
						GPR_0_TF12.setText(dataValue[11]);
						GPR_0_TF13.setText(dataValue[12]);
						GPR_0_TF14.setText(dataValue[13]);
						GPR_0_TF15.setText(dataValue[14]);
						GPR_0_TF16.setText(dataValue[15]);
						break;

					case 1:
						// display in GPR1
						GPR_1_TF1.setText(dataValue[0]);
						GPR_1_TF2.setText(dataValue[1]);
						GPR_1_TF3.setText(dataValue[2]);
						GPR_1_TF4.setText(dataValue[3]);
						GPR_1_TF5.setText(dataValue[4]);
						GPR_1_TF6.setText(dataValue[5]);
						GPR_1_TF7.setText(dataValue[6]);
						GPR_1_TF8.setText(dataValue[7]);
						GPR_1_TF9.setText(dataValue[8]);
						GPR_1_TF10.setText(dataValue[9]);
						GPR_1_TF11.setText(dataValue[10]);
						GPR_1_TF12.setText(dataValue[11]);
						GPR_1_TF13.setText(dataValue[12]);
						GPR_1_TF14.setText(dataValue[13]);
						GPR_1_TF15.setText(dataValue[14]);
						GPR_1_TF16.setText(dataValue[15]);
						break;

					case 2:
						// display in GPR2
						GPR_2_TF1.setText(dataValue[0]);
						GPR_2_TF2.setText(dataValue[1]);
						GPR_2_TF3.setText(dataValue[2]);
						GPR_2_TF4.setText(dataValue[3]);
						GPR_2_TF5.setText(dataValue[4]);
						GPR_2_TF6.setText(dataValue[5]);
						GPR_2_TF7.setText(dataValue[6]);
						GPR_2_TF8.setText(dataValue[7]);
						GPR_2_TF9.setText(dataValue[8]);
						GPR_2_TF10.setText(dataValue[9]);
						GPR_2_TF11.setText(dataValue[10]);
						GPR_2_TF12.setText(dataValue[11]);
						GPR_2_TF13.setText(dataValue[12]);
						GPR_2_TF14.setText(dataValue[13]);
						GPR_2_TF15.setText(dataValue[14]);
						GPR_2_TF16.setText(dataValue[15]);
						break;

					case 3:
						// display in GPR3
						GPR_3_TF1.setText(dataValue[0]);
						GPR_3_TF2.setText(dataValue[1]);
						GPR_3_TF3.setText(dataValue[2]);
						GPR_3_TF4.setText(dataValue[3]);
						GPR_3_TF5.setText(dataValue[4]);
						GPR_3_TF6.setText(dataValue[5]);
						GPR_3_TF7.setText(dataValue[6]);
						GPR_3_TF8.setText(dataValue[7]);
						GPR_3_TF9.setText(dataValue[8]);
						GPR_3_TF10.setText(dataValue[9]);
						GPR_3_TF11.setText(dataValue[10]);
						GPR_3_TF12.setText(dataValue[11]);
						GPR_3_TF13.setText(dataValue[12]);
						GPR_3_TF14.setText(dataValue[13]);
						GPR_3_TF15.setText(dataValue[14]);
						GPR_3_TF16.setText(dataValue[15]);
						break;

				}

				// display inst value in MBR
				textMbr_1.setText(dataValue[0]);
				textMbr_2.setText(dataValue[1]);
				textMbr_3.setText(dataValue[2]);
				textMbr_4.setText(dataValue[3]);
				textMbr_5.setText(dataValue[4]);
				textMbr_6.setText(dataValue[5]);
				textMbr_7.setText(dataValue[6]);
				textMbr_8.setText(dataValue[7]);
				textMbr_9.setText(dataValue[8]);
				textMbr_10.setText(dataValue[9]);
				textMbr_11.setText(dataValue[10]);
				textMbr_12.setText(dataValue[11]);
				textMbr_13.setText(dataValue[12]);
				textMbr_14.setText(dataValue[13]);
				textMbr_15.setText(dataValue[14]);
				textMbr_16.setText(dataValue[15]);

				// get incremented PC
				String PCVal = Integer.toBinaryString(Register.getInstance().getPC());
				PCVal = String.format("%12s", PCVal).replaceAll(" ", "0");
				System.out.println(PCVal);
				String[] PCValArr = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

				for (int i = 0; i < PCVal.length(); i++) {
					PCValArr[i] = PCVal.substring(i, i + 1);
				}

				// display PC
				textPc_1.setText(PCValArr[0]);
				textPc_2.setText(PCValArr[1]);
				textPc_3.setText(PCValArr[2]);
				textPc_4.setText(PCValArr[3]);
				textPc_5.setText(PCValArr[4]);
				textPc_6.setText(PCValArr[5]);
				textPc_7.setText(PCValArr[6]);
				textPc_8.setText(PCValArr[7]);
				textPc_9.setText(PCValArr[8]);
				textPc_10.setText(PCValArr[9]);
				textPc_11.setText(PCValArr[10]);
				textPc_12.setText(PCValArr[11]);

				// increment MAR
				Register.getInstance().setMAR(Register.getInstance().getMAR() + 1);

			}

		});
		panel.add(ssBtn);

		// Run
		JButton runBtn = new JButton("Run");
		runBtn.setBounds(415, 405, 60, 45);
		panel.add(runBtn);

		runBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Register register = Register.getInstance();
				Memory memory = Memory.getInstance();
				// load and run the instruction
				do {
					register.setMAR(register.getPC());
					register.setMBR(memory.load(register.getMAR()));
					register.setIR(register.getMBR());
					
					Load loadInst = new Load();
					loadInst.loadInstruction(Register.getInstance().getMAR());
					if (loadInst.opcode == 0) {
						// System.out.println("Instruction Halt.");
						break; // HLT
					}
					loadInst.runInstruction();
	
					// get MAR
					String MARVal = Integer.toBinaryString(Register.getInstance().getMAR());
					MARVal = String.format("%12s", MARVal).replaceAll(" ", "0");
					System.out.println("MARVal" + MARVal);
					String[] MARValArr = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	
					for (int i = 0; i < MARVal.length(); i++) {
						MARValArr[i] = MARVal.substring(i, i + 1);
					}
	
					// display MAR
					textMar_1.setText(MARValArr[0]);
					textMar_2.setText(MARValArr[1]);
					textMar_3.setText(MARValArr[2]);
					textMar_4.setText(MARValArr[3]);
					textMar_5.setText(MARValArr[4]);
					textMar_6.setText(MARValArr[5]);
					textMar_7.setText(MARValArr[6]);
					textMar_8.setText(MARValArr[7]);
					textMar_9.setText(MARValArr[8]);
					textMar_10.setText(MARValArr[9]);
					textMar_11.setText(MARValArr[10]);
					textMar_12.setText(MARValArr[11]);
	
					// get IR
					String instruction = Integer.toBinaryString(Register.getInstance().getIR());
					instruction = String.format("%16s", instruction).replaceAll(" ", "0");
					String[] instArr = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	
					for (int i = 0; i < instruction.length(); i++) {
						instArr[i] = instruction.substring(i, i + 1);
					}
	
					// displaying in the IR field
					textIR_1.setText(instArr[0]);
					textIR_2.setText(instArr[1]);
					textIR_3.setText(instArr[2]);
					textIR_4.setText(instArr[3]);
					textIR_5.setText(instArr[4]);
					textIR_6.setText(instArr[5]);
					textIR_7.setText(instArr[6]);
					textIR_8.setText(instArr[7]);
					textIR_9.setText(instArr[8]);
					textIR_10.setText(instArr[9]);
					textIR_11.setText(instArr[10]);
					textIR_12.setText(instArr[11]);
					textIR_13.setText(instArr[12]);
					textIR_14.setText(instArr[13]);
					textIR_15.setText(instArr[14]);
					textIR_16.setText(instArr[15]);
	
					// display instruction output in GPR
					String GPRVal = Integer.toBinaryString(Register.getInstance().getGeneralReg(loadInst.R));
					String[] dataValue = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
					for (int i = 0; i < GPRVal.length(); i++) {
						dataValue[16 - GPRVal.length() + i] = GPRVal.substring(i, i + 1);
					}
					switch (loadInst.R) {
						case 0:
							// display in GPR0
							GPR_0_TF1.setText(dataValue[0]);
							GPR_0_TF2.setText(dataValue[1]);
							GPR_0_TF3.setText(dataValue[2]);
							GPR_0_TF4.setText(dataValue[3]);
							GPR_0_TF5.setText(dataValue[4]);
							GPR_0_TF6.setText(dataValue[5]);
							GPR_0_TF7.setText(dataValue[6]);
							GPR_0_TF8.setText(dataValue[7]);
							GPR_0_TF9.setText(dataValue[8]);
							GPR_0_TF10.setText(dataValue[9]);
							GPR_0_TF11.setText(dataValue[10]);
							GPR_0_TF12.setText(dataValue[11]);
							GPR_0_TF13.setText(dataValue[12]);
							GPR_0_TF14.setText(dataValue[13]);
							GPR_0_TF15.setText(dataValue[14]);
							GPR_0_TF16.setText(dataValue[15]);
							break;
	
						case 1:
							// display in GPR1
							GPR_1_TF1.setText(dataValue[0]);
							GPR_1_TF2.setText(dataValue[1]);
							GPR_1_TF3.setText(dataValue[2]);
							GPR_1_TF4.setText(dataValue[3]);
							GPR_1_TF5.setText(dataValue[4]);
							GPR_1_TF6.setText(dataValue[5]);
							GPR_1_TF7.setText(dataValue[6]);
							GPR_1_TF8.setText(dataValue[7]);
							GPR_1_TF9.setText(dataValue[8]);
							GPR_1_TF10.setText(dataValue[9]);
							GPR_1_TF11.setText(dataValue[10]);
							GPR_1_TF12.setText(dataValue[11]);
							GPR_1_TF13.setText(dataValue[12]);
							GPR_1_TF14.setText(dataValue[13]);
							GPR_1_TF15.setText(dataValue[14]);
							GPR_1_TF16.setText(dataValue[15]);
							break;
	
						case 2:
							// display in GPR2
							GPR_2_TF1.setText(dataValue[0]);
							GPR_2_TF2.setText(dataValue[1]);
							GPR_2_TF3.setText(dataValue[2]);
							GPR_2_TF4.setText(dataValue[3]);
							GPR_2_TF5.setText(dataValue[4]);
							GPR_2_TF6.setText(dataValue[5]);
							GPR_2_TF7.setText(dataValue[6]);
							GPR_2_TF8.setText(dataValue[7]);
							GPR_2_TF9.setText(dataValue[8]);
							GPR_2_TF10.setText(dataValue[9]);
							GPR_2_TF11.setText(dataValue[10]);
							GPR_2_TF12.setText(dataValue[11]);
							GPR_2_TF13.setText(dataValue[12]);
							GPR_2_TF14.setText(dataValue[13]);
							GPR_2_TF15.setText(dataValue[14]);
							GPR_2_TF16.setText(dataValue[15]);
							break;
	
						case 3:
							// display in GPR3
							GPR_3_TF1.setText(dataValue[0]);
							GPR_3_TF2.setText(dataValue[1]);
							GPR_3_TF3.setText(dataValue[2]);
							GPR_3_TF4.setText(dataValue[3]);
							GPR_3_TF5.setText(dataValue[4]);
							GPR_3_TF6.setText(dataValue[5]);
							GPR_3_TF7.setText(dataValue[6]);
							GPR_3_TF8.setText(dataValue[7]);
							GPR_3_TF9.setText(dataValue[8]);
							GPR_3_TF10.setText(dataValue[9]);
							GPR_3_TF11.setText(dataValue[10]);
							GPR_3_TF12.setText(dataValue[11]);
							GPR_3_TF13.setText(dataValue[12]);
							GPR_3_TF14.setText(dataValue[13]);
							GPR_3_TF15.setText(dataValue[14]);
							GPR_3_TF16.setText(dataValue[15]);
							break;
	
					}
	
					// display inst value in MBR
					textMbr_1.setText(dataValue[0]);
					textMbr_2.setText(dataValue[1]);
					textMbr_3.setText(dataValue[2]);
					textMbr_4.setText(dataValue[3]);
					textMbr_5.setText(dataValue[4]);
					textMbr_6.setText(dataValue[5]);
					textMbr_7.setText(dataValue[6]);
					textMbr_8.setText(dataValue[7]);
					textMbr_9.setText(dataValue[8]);
					textMbr_10.setText(dataValue[9]);
					textMbr_11.setText(dataValue[10]);
					textMbr_12.setText(dataValue[11]);
					textMbr_13.setText(dataValue[12]);
					textMbr_14.setText(dataValue[13]);
					textMbr_15.setText(dataValue[14]);
					textMbr_16.setText(dataValue[15]);
	
					//Increment PC
					register.setPC(register.getPC() + 1);
					
					// get incremented PC
					String PCVal = Integer.toBinaryString(Register.getInstance().getPC());
					PCVal = String.format("%12s", PCVal).replaceAll(" ", "0");
					System.out.println(PCVal);
					String[] PCValArr = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	
					for (int i = 0; i < PCVal.length(); i++) {
						PCValArr[i] = PCVal.substring(i, i + 1);
					}
	
					// display PC
					textPc_1.setText(PCValArr[0]);
					textPc_2.setText(PCValArr[1]);
					textPc_3.setText(PCValArr[2]);
					textPc_4.setText(PCValArr[3]);
					textPc_5.setText(PCValArr[4]);
					textPc_6.setText(PCValArr[5]);
					textPc_7.setText(PCValArr[6]);
					textPc_8.setText(PCValArr[7]);
					textPc_9.setText(PCValArr[8]);
					textPc_10.setText(PCValArr[9]);
					textPc_11.setText(PCValArr[10]);
					textPc_12.setText(PCValArr[11]);
	
					// increment MAR
					Register.getInstance().setMAR(Register.getInstance().getMAR() + 1);
	
				} while(true);
			}
		});
		panel.add(ssBtn);
		// Halt
		JLabel haltlbl = new JLabel("Halt");
		haltlbl.setBounds(546, 405, 25, 26);
		panel.add(haltlbl);

		JTextField textfield_1 = new JTextField();
		textfield_1.setBounds(575, 405, 25, 26);
		textfield_1.setBackground(Color.black);
		panel.add(textfield_1);

		JLabel runlbl = new JLabel("Run");
		runlbl.setBounds(546, 435, 25, 26);
		panel.add(runlbl);

		JTextField textfield_2 = new JTextField();
		textfield_2.setBounds(575, 435, 25, 26);
		textfield_2.setBackground(Color.black);
		panel.add(textfield_2);

		// Init
		JButton initBtn = new JButton("Init");
		initBtn.setBounds(535, 362, 75, 30);
		initBtn.setBackground(Color.red);
		initBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int halt = Init_button();
				String GPR_0 = Integer.toBinaryString(get_number(1));

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
				String GPR_1 = Integer.toBinaryString(get_number(2));

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
				String GPR_2 = Integer.toBinaryString(get_number(3));

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
				String GPR_3 = Integer.toBinaryString(get_number(4));

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
				String IXR_1 = Integer.toBinaryString(get_number(5));

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
				String IXR_2 = Integer.toBinaryString(get_number(6));

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
				String IXR_3 = Integer.toBinaryString(get_number(7));

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
				String PC = Integer.toBinaryString(get_number(8));

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
				String MAR = Integer.toBinaryString(get_number(9));
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
				String MBR = Integer.toBinaryString(get_number(10));
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
				String IR = Integer.toBinaryString(get_number(11));
				String[] irValue = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };

				for (int i = 0; i < IR.length(); i++) {
					irValue[12 - IR.length() + i] = IR.substring(i, i + 1);
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
				String MFR = Integer.toBinaryString(get_number(12));
				String[] mfrValue = { "0", "0", "0", "0" };

				for (int i = 0; i < IR.length(); i++) {
					mfrValue[4 - IR.length() + i] = IR.substring(i, i + 1);
				}
				MFR_TF1.setText(mfrValue[0]);
				MFR_TF2.setText(mfrValue[1]);
				MFR_TF3.setText(mfrValue[2]);
				MFR_TF4.setText(mfrValue[3]);
				// textfield_1.setBackground(Color.WHITE);
				// textfield_2.setBackground(Color.GREEN);

			}
		});
		panel.add(initBtn);

	}

	public static int Init_button() {
		CPU.readIPL();
		return CPU.halt;
	}

	public int get_number(int index) {
		switch (index) {
			case 1:
				return Register.getInstance().getGeneralReg(0);
			case 2:
				return Register.getInstance().getGeneralReg(1);
			case 3:
				return Register.getInstance().getGeneralReg(2);
			case 4:
				return Register.getInstance().getGeneralReg(3);
			case 5:
				return Register.getInstance().getIndexReg(1);
			case 6:
				return Register.getInstance().getIndexReg(2);
			case 7:
				return Register.getInstance().getIndexReg(3);
			case 8:
				return Register.getInstance().getPC();
			case 9:
				return Register.getInstance().getMAR();
			case 10:
				return Register.getInstance().getMBR();
			case 11:
				return Register.getInstance().getIR();
			case 12:
				return Register.getInstance().getMFR();
		}
		return 0;
	}

}