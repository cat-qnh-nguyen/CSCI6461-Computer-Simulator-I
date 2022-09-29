import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {
	  private JPanel panel;
	  
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
		  setBounds(100, 100, 800, 650);
		  
		  JPanel panel = new JPanel();
		  panel.setBackground(Color.blue);
		  panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		  setContentPane(panel);
		  panel.setLayout(null);
		  
		  //Labels for GPR
		  JLabel lblGPR_0 = new JLabel("GPR 0");
		  lblGPR_0.setBounds(20, 20, 41, 16);
		  panel.add(lblGPR_0);
		  
		  JTextField lblGPR_0_textfield_1 = new JTextField();
		  lblGPR_0_textfield_1.setBounds(65, 20, 15, 16);
		  lblGPR_0_textfield_1.setBackground(Color.black);
		  panel.add(lblGPR_0_textfield_1);
		  
		  JTextField lblGPR_0_textfield_2 = new JTextField();
		  lblGPR_0_textfield_2.setBounds(85, 20, 15, 16);
		  lblGPR_0_textfield_2.setBackground(Color.black);
		  panel.add(lblGPR_0_textfield_2);
		  
		  JTextField lblGPR_0_textfield_3 = new JTextField();
		  lblGPR_0_textfield_3.setBounds(105, 20, 15, 16);
		  lblGPR_0_textfield_3.setBackground(Color.black);
		  panel.add(lblGPR_0_textfield_3);
		  
		  JTextField lblGPR_0_textfield_4 = new JTextField();
		  lblGPR_0_textfield_4.setBounds(125, 20, 15, 16);
		  lblGPR_0_textfield_4.setBackground(Color.black);
		  panel.add(lblGPR_0_textfield_4);
		  
		  JTextField lblGPR_0_textfield_5 = new JTextField();
		  lblGPR_0_textfield_5.setBounds(145, 20, 15, 16);
		  lblGPR_0_textfield_5.setBackground(Color.black);
		  panel.add(lblGPR_0_textfield_5);
		  
		  JTextField lblGPR_0_textfield_6 = new JTextField();
		  lblGPR_0_textfield_6.setBounds(165, 20, 15, 16);
		  lblGPR_0_textfield_6.setBackground(Color.black);
		  panel.add(lblGPR_0_textfield_6);
		  
		  JTextField lblGPR_0_textfield_7 = new JTextField();
		  lblGPR_0_textfield_7.setBounds(185, 20, 15, 16);
		  lblGPR_0_textfield_7.setBackground(Color.black);
		  panel.add(lblGPR_0_textfield_7);
		  
		  JButton lblGPR_0_loadBtn = new JButton("LD");
		  lblGPR_0_loadBtn.setBounds(205, 20, 55, 16);
		  panel.add(lblGPR_0_loadBtn);
		  
		  JLabel lblGPR_1 = new JLabel("GPR 1");
		  lblGPR_1.setBounds(20, 40, 41, 16);
		  panel.add(lblGPR_1);
		  
		  JTextField lblGPR_1_textfield_1 = new JTextField();
		  lblGPR_1_textfield_1.setBounds(65, 40, 15, 16);
		  lblGPR_1_textfield_1.setBackground(Color.black);
		  panel.add(lblGPR_1_textfield_1);
		  
		  JTextField lblGPR_1_textfield_2 = new JTextField();
		  lblGPR_1_textfield_2.setBounds(85, 40, 15, 16);
		  lblGPR_1_textfield_2.setBackground(Color.black);
		  panel.add(lblGPR_1_textfield_2);
		  
		  JTextField lblGPR_1_textfield_3 = new JTextField();
		  lblGPR_1_textfield_3.setBounds(105, 40, 15, 16);
		  lblGPR_1_textfield_3.setBackground(Color.black);
		  panel.add(lblGPR_1_textfield_3);
		  
		  JTextField lblGPR_1_textfield_4 = new JTextField();
		  lblGPR_1_textfield_4.setBounds(125, 40, 15, 16);
		  lblGPR_1_textfield_4.setBackground(Color.black);
		  panel.add(lblGPR_1_textfield_4);
		  
		  JTextField lblGPR_1_textfield_5 = new JTextField();
		  lblGPR_1_textfield_5.setBounds(145, 40, 15, 16);
		  lblGPR_1_textfield_5.setBackground(Color.black);
		  panel.add(lblGPR_1_textfield_5);
		  
		  JTextField lblGPR_1_textfield_6 = new JTextField();
		  lblGPR_1_textfield_6.setBounds(165, 40, 15, 16);
		  lblGPR_1_textfield_6.setBackground(Color.black);
		  panel.add(lblGPR_1_textfield_6);
		  
		  JTextField lblGPR_1_textfield_7 = new JTextField();
		  lblGPR_1_textfield_7.setBounds(185, 40, 15, 16);
		  lblGPR_1_textfield_7.setBackground(Color.black);
		  panel.add(lblGPR_1_textfield_7);
		  
		  JButton lblGPR_1_loadBtn = new JButton("LD");
		  lblGPR_1_loadBtn.setBounds(205, 40, 55, 16);
		  panel.add(lblGPR_1_loadBtn);
		  
		  JLabel lblGPR_2 = new JLabel("GPR 2");
		  lblGPR_2.setBounds(20, 60, 41, 16);
		  panel.add(lblGPR_2);
		  
		  JTextField lblGPR_2_textfield_1 = new JTextField();
		  lblGPR_2_textfield_1.setBounds(65, 60, 15, 16);
		  lblGPR_2_textfield_1.setBackground(Color.black);
		  panel.add(lblGPR_2_textfield_1);
		  
		  JTextField lblGPR_2_textfield_2 = new JTextField();
		  lblGPR_2_textfield_2.setBounds(85, 60, 15, 16);
		  lblGPR_2_textfield_2.setBackground(Color.black);
		  panel.add(lblGPR_2_textfield_2);
		  
		  JTextField lblGPR_2_textfield_3 = new JTextField();
		  lblGPR_2_textfield_3.setBounds(105, 60, 15, 16);
		  lblGPR_2_textfield_3.setBackground(Color.black);
		  panel.add(lblGPR_2_textfield_3);
		  
		  JTextField lblGPR_2_textfield_4 = new JTextField();
		  lblGPR_2_textfield_4.setBounds(125, 60, 15, 16);
		  lblGPR_2_textfield_4.setBackground(Color.black);
		  panel.add(lblGPR_2_textfield_4);
		  
		  JTextField lblGPR_2_textfield_5 = new JTextField();
		  lblGPR_2_textfield_5.setBounds(145, 60, 15, 16);
		  lblGPR_2_textfield_5.setBackground(Color.black);
		  panel.add(lblGPR_2_textfield_5);
		  
		  JTextField lblGPR_2_textfield_6 = new JTextField();
		  lblGPR_2_textfield_6.setBounds(165, 60, 15, 16);
		  lblGPR_2_textfield_6.setBackground(Color.black);
		  panel.add(lblGPR_2_textfield_6);
		  
		  JTextField lblGPR_2_textfield_7 = new JTextField();
		  lblGPR_2_textfield_7.setBounds(185, 60, 15, 16);
		  lblGPR_2_textfield_7.setBackground(Color.black);
		  panel.add(lblGPR_2_textfield_7);
		  
		  JButton lblGPR_2_loadBtn = new JButton("LD");
		  lblGPR_2_loadBtn.setBounds(205, 60, 55, 16);
		  panel.add(lblGPR_2_loadBtn);
		  
		  JLabel lblGPR_3 = new JLabel("GPR 3");
		  lblGPR_3.setBounds(20, 80, 41, 16);
		  panel.add(lblGPR_3);
		  
		  JTextField lblGPR_3_textfield_1 = new JTextField();
		  lblGPR_3_textfield_1.setBounds(65, 80, 15, 16);
		  lblGPR_3_textfield_1.setBackground(Color.black);
		  panel.add(lblGPR_3_textfield_1);
		  
		  JTextField lblGPR_3_textfield_2 = new JTextField();
		  lblGPR_3_textfield_2.setBounds(85, 80, 15, 16);
		  lblGPR_3_textfield_2.setBackground(Color.black);
		  panel.add(lblGPR_3_textfield_2);
		  
		  JTextField lblGPR_3_textfield_3 = new JTextField();
		  lblGPR_3_textfield_3.setBounds(105, 80, 15, 16);
		  lblGPR_3_textfield_3.setBackground(Color.black);
		  panel.add(lblGPR_3_textfield_3);
		  
		  JTextField lblGPR_3_textfield_4 = new JTextField();
		  lblGPR_3_textfield_4.setBounds(125, 80, 15, 16);
		  lblGPR_3_textfield_4.setBackground(Color.black);
		  panel.add(lblGPR_3_textfield_4);
		  
		  JTextField lblGPR_3_textfield_5 = new JTextField();
		  lblGPR_3_textfield_5.setBounds(145, 80, 15, 16);
		  lblGPR_3_textfield_5.setBackground(Color.black);
		  panel.add(lblGPR_3_textfield_5);
		  
		  JTextField lblGPR_3_textfield_6 = new JTextField();
		  lblGPR_3_textfield_6.setBounds(165, 80, 15, 16);
		  lblGPR_3_textfield_6.setBackground(Color.black);
		  panel.add(lblGPR_3_textfield_6);
		  
		  JTextField lblGPR_3_textfield_7 = new JTextField();
		  lblGPR_3_textfield_7.setBounds(185, 80, 15, 16);
		  lblGPR_3_textfield_7.setBackground(Color.black);
		  panel.add(lblGPR_3_textfield_7);
		  
		  JButton lblGPR_3_loadBtn = new JButton("LD");
		  lblGPR_3_loadBtn.setBounds(205, 80, 55, 16);
		  panel.add(lblGPR_3_loadBtn);
		  
		  //Labels for IXR
		  JLabel lblIXR_1 = new JLabel("IXR 1");
		  lblIXR_1.setBounds(20, 120, 41, 16);
		  panel.add(lblIXR_1);
		  
		  JTextField lblIXR_1_textfield_1 = new JTextField();
		  lblIXR_1_textfield_1.setBounds(65, 120, 15, 16);
		  lblIXR_1_textfield_1.setBackground(Color.black);
		  panel.add(lblIXR_1_textfield_1);
		  
		  JTextField lblIXR_1_textfield_2 = new JTextField();
		  lblIXR_1_textfield_2.setBounds(85, 120, 15, 16);
		  lblIXR_1_textfield_2.setBackground(Color.black);
		  panel.add(lblIXR_1_textfield_2);
		  
		  JTextField lblIXR_1_textfield_3 = new JTextField();
		  lblIXR_1_textfield_3.setBounds(105, 120, 15, 16);
		  lblIXR_1_textfield_3.setBackground(Color.black);
		  panel.add(lblIXR_1_textfield_3);
		  
		  JTextField lblIXR_1_textfield_4 = new JTextField();
		  lblIXR_1_textfield_4.setBounds(125, 120, 15, 16);
		  lblIXR_1_textfield_4.setBackground(Color.black);
		  panel.add(lblIXR_1_textfield_4);
		  
		  JTextField lblIXR_1_textfield_5 = new JTextField();
		  lblIXR_1_textfield_5.setBounds(145, 120, 15, 16);
		  lblIXR_1_textfield_5.setBackground(Color.black);
		  panel.add(lblIXR_1_textfield_5);
		  
		  JTextField lblIXR_1_textfield_6 = new JTextField();
		  lblIXR_1_textfield_6.setBounds(165, 120, 15, 16);
		  lblIXR_1_textfield_6.setBackground(Color.black);
		  panel.add(lblIXR_1_textfield_6);
		  
		  JTextField lblIXR_1_textfield_7 = new JTextField();
		  lblIXR_1_textfield_7.setBounds(185, 120, 15, 16);
		  lblIXR_1_textfield_7.setBackground(Color.black);
		  panel.add(lblIXR_1_textfield_7);
		  
		  JButton lblIXR_1_loadBtn = new JButton("LD");
		  lblIXR_1_loadBtn.setBounds(205, 120, 55, 16);
		  panel.add(lblIXR_1_loadBtn);
		  
		  JLabel lblIXR_2 = new JLabel("IXR 2");
		  lblIXR_2.setBounds(20, 140, 41, 16);
		  panel.add(lblIXR_2);
		  
		  JTextField lblIXR_2_textfield_1 = new JTextField();
		  lblIXR_2_textfield_1.setBounds(65, 140, 15, 16);
		  lblIXR_2_textfield_1.setBackground(Color.black);
		  panel.add(lblIXR_2_textfield_1);
		  
		  JTextField lblIXR_2_textfield_2 = new JTextField();
		  lblIXR_2_textfield_2.setBounds(85, 140, 15, 16);
		  lblIXR_2_textfield_2.setBackground(Color.black);
		  panel.add(lblIXR_2_textfield_2);
		  
		  JTextField lblIXR_2_textfield_3 = new JTextField();
		  lblIXR_2_textfield_3.setBounds(105, 140, 15, 16);
		  lblIXR_2_textfield_3.setBackground(Color.black);
		  panel.add(lblIXR_2_textfield_3);
		  
		  JTextField lblIXR_2_textfield_4 = new JTextField();
		  lblIXR_2_textfield_4.setBounds(125, 140, 15, 16);
		  lblIXR_2_textfield_4.setBackground(Color.black);
		  panel.add(lblIXR_2_textfield_4);
		  
		  JTextField lblIXR_2_textfield_5 = new JTextField();
		  lblIXR_2_textfield_5.setBounds(145, 140, 15, 16);
		  lblIXR_2_textfield_5.setBackground(Color.black);
		  panel.add(lblIXR_2_textfield_5);
		  
		  JTextField lblIXR_2_textfield_6 = new JTextField();
		  lblIXR_2_textfield_6.setBounds(165, 140, 15, 16);
		  lblIXR_2_textfield_6.setBackground(Color.black);
		  panel.add(lblIXR_2_textfield_6);
		  
		  JTextField lblIXR_2_textfield_7 = new JTextField();
		  lblIXR_2_textfield_7.setBounds(185, 140, 15, 16);
		  lblIXR_2_textfield_7.setBackground(Color.black);
		  panel.add(lblIXR_2_textfield_7);
		  
		  JButton lblIXR_2_loadBtn = new JButton("LD");
		  lblIXR_2_loadBtn.setBounds(205, 140, 55, 16);
		  panel.add(lblIXR_2_loadBtn);
		  
		  JLabel lblIXR_3 = new JLabel("IXR 3");
		  lblIXR_3.setBounds(20, 160, 41, 16);
		  panel.add(lblIXR_3);
		  
		  JTextField lblIXR_3_textfield_1 = new JTextField();
		  lblIXR_3_textfield_1.setBounds(65, 160, 15, 16);
		  lblIXR_3_textfield_1.setBackground(Color.black);
		  panel.add(lblIXR_3_textfield_1);
		  
		  JTextField lblIXR_3_textfield_2 = new JTextField();
		  lblIXR_3_textfield_2.setBounds(85, 160, 15, 16);
		  lblIXR_3_textfield_2.setBackground(Color.black);
		  panel.add(lblIXR_3_textfield_2);
		  
		  JTextField lblIXR_3_textfield_3 = new JTextField();
		  lblIXR_3_textfield_3.setBounds(105, 160, 15, 16);
		  lblIXR_3_textfield_3.setBackground(Color.black);
		  panel.add(lblIXR_3_textfield_3);
		  
		  JTextField lblIXR_3_textfield_4 = new JTextField();
		  lblIXR_3_textfield_4.setBounds(125, 160, 15, 16);
		  lblIXR_3_textfield_4.setBackground(Color.black);
		  panel.add(lblIXR_3_textfield_4);
		  
		  JTextField lblIXR_3_textfield_5 = new JTextField();
		  lblIXR_3_textfield_5.setBounds(145, 160, 15, 16);
		  lblIXR_3_textfield_5.setBackground(Color.black);
		  panel.add(lblIXR_3_textfield_5);
		  
		  JTextField lblIXR_3_textfield_6 = new JTextField();
		  lblIXR_3_textfield_6.setBounds(165, 160, 15, 16);
		  lblIXR_3_textfield_6.setBackground(Color.black);
		  panel.add(lblIXR_3_textfield_6);
		  
		  JTextField lblIXR_3_textfield_7 = new JTextField();
		  lblIXR_3_textfield_7.setBounds(185, 160, 15, 16);
		  lblIXR_3_textfield_7.setBackground(Color.black);
		  panel.add(lblIXR_3_textfield_7);
		  
		  JButton lblIXR_3_loadBtn = new JButton("LD");
		  lblIXR_3_loadBtn.setBounds(205, 160, 55, 16);
		  panel.add(lblIXR_3_loadBtn);
		  
		  
		  //Labels for PC, MAR, MBR, IR, MFR, Privileged
		  JLabel PClbl = new JLabel("PC");
		  PClbl.setBounds(335, 20, 25, 16);
		  panel.add(PClbl);
		  
		  JTextField textPc_1 = new JTextField();
		  textPc_1.setBounds(375, 20, 15, 16);
		  textPc_1.setBackground(Color.black);
		  panel.add(textPc_1);
		  
		  JTextField textPc_2 = new JTextField();
		  textPc_2.setBounds(395, 20, 15, 16);
		  textPc_2.setBackground(Color.black);
		  panel.add(textPc_2);
		  
		  JTextField textPc_3 = new JTextField();
		  textPc_3.setBounds(415, 20, 15, 16);
		  textPc_3.setBackground(Color.black);
		  panel.add(textPc_3);
		  
		  JTextField textPc_4 = new JTextField();
		  textPc_4.setBounds(435, 20, 15, 16);
		  textPc_4.setBackground(Color.black);
		  panel.add(textPc_4);
		  
		  JTextField textPc_5 = new JTextField();
		  textPc_5.setBounds(455, 20, 15, 16);
		  textPc_5.setBackground(Color.black);
		  panel.add(textPc_5);
		  
		  JTextField textPc_6 = new JTextField();
		  textPc_6.setBounds(475, 20, 15, 16);
		  textPc_6.setBackground(Color.black);
		  panel.add(textPc_6);
		  
		  JTextField textPc_7 = new JTextField();
		  textPc_7.setBounds(495, 20, 15, 16);
		  textPc_7.setBackground(Color.black);
		  panel.add(textPc_7);
		  
		  JTextField textPc_8 = new JTextField();
		  textPc_8.setBounds(515, 20, 15, 16);
		  textPc_8.setBackground(Color.black);
		  panel.add(textPc_8);
		  
		  JTextField textPc_9 = new JTextField();
		  textPc_9.setBounds(535, 20, 15, 16);
		  textPc_9.setBackground(Color.black);
		  panel.add(textPc_9);
		  
		  JTextField textPc_10 = new JTextField();
		  textPc_10.setBounds(555, 20, 15, 16);
		  textPc_10.setBackground(Color.black);
		  panel.add(textPc_10);
		  
		  JTextField textPc_11 = new JTextField();
		  textPc_11.setBounds(575, 20, 15, 16);
		  textPc_11.setBackground(Color.black);
		  panel.add(textPc_11);
		  
		  JTextField textPc_12 = new JTextField();
		  textPc_12.setBounds(595, 20, 15, 16);
		  textPc_12.setBackground(Color.black);
		  panel.add(textPc_12);
		  
		  JButton PCbtn = new JButton("LD");
		  PCbtn.setBounds(615, 20, 55, 16);
		  panel.add(PCbtn);
		  
		  JLabel MARlbl = new JLabel("MAR");
		  MARlbl.setBounds(335, 40, 30, 16);
		  panel.add(MARlbl);
		  
		  JTextField textMar_1 = new JTextField();
		  textMar_1.setBounds(375, 40, 15, 16);
		  textMar_1.setBackground(Color.black);
		  panel.add(textMar_1);
		  
		  JTextField textMar_2 = new JTextField();
		  textMar_2.setBounds(395, 40, 15, 16);
		  textMar_2.setBackground(Color.black);
		  panel.add(textMar_2);
		  
		  JTextField textMar_3 = new JTextField();
		  textMar_3.setBounds(415, 40, 15, 16);
		  textMar_3.setBackground(Color.black);
		  panel.add(textMar_3);
		  
		  JTextField textMar_4 = new JTextField();
		  textMar_4.setBounds(435, 40, 15, 16);
		  textMar_4.setBackground(Color.black);
		  panel.add(textMar_4);
		  
		  JTextField textMar_5 = new JTextField();
		  textMar_5.setBounds(455, 40, 15, 16);
		  textMar_5.setBackground(Color.black);
		  panel.add(textMar_5);
		  
		  JTextField textMar_6 = new JTextField();
		  textMar_6.setBounds(475, 40, 15, 16);
		  textMar_6.setBackground(Color.black);
		  panel.add(textMar_6);
		  
		  JTextField textMar_7 = new JTextField();
		  textMar_7.setBounds(495, 40, 15, 16);
		  textMar_7.setBackground(Color.black);
		  panel.add(textMar_7);
		  
		  JTextField textMar_8 = new JTextField();
		  textMar_8.setBounds(515, 40, 15, 16);
		  textMar_8.setBackground(Color.black);
		  panel.add(textMar_8);
		  
		  JTextField textMar_9 = new JTextField();
		  textMar_9.setBounds(535, 40, 15, 16);
		  textMar_9.setBackground(Color.black);
		  panel.add(textMar_9);
		  
		  JTextField textMar_10 = new JTextField();
		  textMar_10.setBounds(555, 40, 15, 16);
		  textMar_10.setBackground(Color.black);
		  panel.add(textMar_10);
		  
		  JTextField textMar_11 = new JTextField();
		  textMar_11.setBounds(575, 40, 15, 16);
		  textMar_11.setBackground(Color.black);
		  panel.add(textMar_11);
		  
		  JTextField textMar_12 = new JTextField();
		  textMar_12.setBounds(595, 40, 15, 16);
		  textMar_12.setBackground(Color.black);
		  panel.add(textMar_12);
		  
		  JButton MARbtn = new JButton("LD");
		  MARbtn.setBounds(615, 40, 55, 16);
		  panel.add(MARbtn);
		  
		  JLabel MBRlbl = new JLabel("MBR");
		  MBRlbl.setBounds(335, 61, 30, 15);
		  panel.add(MBRlbl);
		  
		  JTextField textMbr_1 = new JTextField();
		  textMbr_1.setBounds(375, 61, 15, 16);
		  textMbr_1.setBackground(Color.black);
		  panel.add(textMbr_1);
		  
		  JTextField textMbr_2 = new JTextField();
		  textMbr_2.setBounds(395, 61, 15, 16);
		  textMbr_2.setBackground(Color.black);
		  panel.add(textMbr_2);
		  
		  JTextField textMbr_3 = new JTextField();
		  textMbr_3.setBounds(415, 61, 15, 16);
		  textMbr_3.setBackground(Color.black);
		  panel.add(textMbr_3);
		  
		  JTextField textMbr_4 = new JTextField();
		  textMbr_4.setBounds(435, 61, 15, 16);
		  textMbr_4.setBackground(Color.black);
		  panel.add(textMbr_4);
		  
		  JTextField textMbr_5 = new JTextField();
		  textMbr_5.setBounds(455, 61, 15, 16);
		  textMbr_5.setBackground(Color.black);
		  panel.add(textMbr_5);
		  
		  JTextField textMbr_6 = new JTextField();
		  textMbr_6.setBounds(475, 61, 15, 16);
		  textMbr_6.setBackground(Color.black);
		  panel.add(textMbr_6);
		  
		  JTextField textMbr_7 = new JTextField();
		  textMbr_7.setBounds(495, 61, 15, 16);
		  textMbr_7.setBackground(Color.black);
		  panel.add(textMbr_7);
		  
		  JTextField textMbr_8 = new JTextField();
		  textMbr_8.setBounds(515, 61, 15, 16);
		  textMbr_8.setBackground(Color.black);
		  panel.add(textMbr_8);
		  
		  JTextField textMbr_9 = new JTextField();
		  textMbr_9.setBounds(535, 61, 15, 16);
		  textMbr_9.setBackground(Color.black);
		  panel.add(textMbr_9);
		  
		  JTextField textMbr_10 = new JTextField();
		  textMbr_10.setBounds(555, 61, 15, 16);
		  textMbr_10.setBackground(Color.black);
		  panel.add(textMbr_10);
		  
		  JTextField textMbr_11 = new JTextField();
		  textMbr_11.setBounds(575, 61, 15, 16);
		  textMbr_11.setBackground(Color.black);
		  panel.add(textMbr_11);
		  
		  JTextField textMbr_12 = new JTextField();
		  textMbr_12.setBounds(595, 61, 15, 16);
		  textMbr_12.setBackground(Color.black);
		  panel.add(textMbr_12);
		  
		  JButton MBRbtn = new JButton("LD");
		  MBRbtn.setBounds(615, 61, 55, 16);
		  panel.add(MBRbtn);
		  
		  
		  JLabel IRlbl = new JLabel("IR");
		  IRlbl.setBounds(335, 80, 25, 16);
		  panel.add(IRlbl);
		  
		  JTextField textIR_1 = new JTextField();
		  textIR_1.setBounds(375, 80, 15, 16);
		  textIR_1.setBackground(Color.black);
		  panel.add(textIR_1);
		  
		  JTextField textIR_2 = new JTextField();
		  textIR_2.setBounds(395, 80, 15, 16);
		  textIR_2.setBackground(Color.black);
		  panel.add(textIR_2);
		  
		  JTextField textIR_3 = new JTextField();
		  textIR_3.setBounds(415, 80, 15, 16);
		  textIR_3.setBackground(Color.black);
		  panel.add(textIR_3);
		  
		  JTextField textIR_4 = new JTextField();
		  textIR_4.setBounds(435, 80, 15, 16);
		  textIR_4.setBackground(Color.black);
		  panel.add(textIR_4);
		  
		  JTextField textIR_5 = new JTextField();
		  textIR_5.setBounds(455, 80, 15, 16);
		  textIR_5.setBackground(Color.black);
		  panel.add(textIR_5);
		  
		  JTextField textIR_6 = new JTextField();
		  textIR_6.setBounds(475, 80, 15, 16);
		  textIR_6.setBackground(Color.black);
		  panel.add(textIR_6);
		  
		  JTextField textIR_7 = new JTextField();
		  textIR_7.setBounds(495, 80, 15, 16);
		  textIR_7.setBackground(Color.black);
		  panel.add(textIR_7);
		  
		  JTextField textIR_8 = new JTextField();
		  textIR_8.setBounds(515, 80, 15, 16);
		  textIR_8.setBackground(Color.black);
		  panel.add(textIR_8);
		  
		  JTextField textIR_9 = new JTextField();
		  textIR_9.setBounds(535, 80, 15, 16);
		  textIR_9.setBackground(Color.black);
		  panel.add(textIR_9);
		  
		  JTextField textIR_10 = new JTextField();
		  textIR_10.setBounds(555, 80, 15, 16);
		  textIR_10.setBackground(Color.black);
		  panel.add(textIR_10);
		  
		  JTextField textIR_11 = new JTextField();
		  textIR_11.setBounds(575, 80, 15, 16);
		  textIR_11.setBackground(Color.black);
		  panel.add(textIR_11);
		  
		  JTextField textIR_12 = new JTextField();
		  textIR_12.setBounds(595, 80, 15, 16);
		  textIR_12.setBackground(Color.black);
		  panel.add(textIR_12);
		  
		  JLabel MFRlbl = new JLabel("MFR");
		  MFRlbl.setBounds(443, 101, 30, 16);
		  panel.add(MFRlbl);
		  
		  JTextField MFRlbl_textfield_1 = new JTextField();
		  MFRlbl_textfield_1.setBounds(477, 101, 15, 16);
		  MFRlbl_textfield_1.setBackground(Color.black);
		  panel.add(MFRlbl_textfield_1);
		  
		  JTextField MFRlbl_textfield_2 = new JTextField();
		  MFRlbl_textfield_2.setBounds(497, 101, 15, 16);
		  MFRlbl_textfield_2.setBackground(Color.black);
		  panel.add(MFRlbl_textfield_2);
		  
		  JTextField MFRlbl_textfield_3 = new JTextField();
		  MFRlbl_textfield_3.setBounds(517, 101, 15, 16);
		  MFRlbl_textfield_3.setBackground(Color.black);
		  panel.add(MFRlbl_textfield_3);
		  
		  JTextField MFRlbl_textfield_4 = new JTextField();
		  MFRlbl_textfield_4.setBounds(537, 101, 15, 16);
		  MFRlbl_textfield_4.setBackground(Color.black);
		  panel.add(MFRlbl_textfield_4);
		  
		  JLabel Privlbl = new JLabel("Privileged");
		  Privlbl.setBounds(407, 120, 66, 16);
		  panel.add(Privlbl);
		  
		  JTextField Privlbl_textfield = new JTextField();
		  Privlbl_textfield.setBounds(477, 120, 15, 16);
		  Privlbl_textfield.setBackground(Color.black);
		  panel.add(Privlbl_textfield);
		  
		    //Buttons for instruction 0-15
			//User cannot click these buttons for now. 
			JButton btnNewButton = new JButton("15");
			btnNewButton.setBounds(20, 250, 48, 45);
			panel.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("14");
			btnNewButton_1.setBounds(65, 250, 48, 45);
			panel.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("13");
			btnNewButton_2.setBounds(110, 250, 48, 45);
			panel.add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("12");
			btnNewButton_3.setBounds(150, 250, 48, 45);
			panel.add(btnNewButton_3);
			
			JButton btnNewButton_4 = new JButton("11");
			btnNewButton_4.setBounds(190, 250, 48, 45);
			panel.add(btnNewButton_4);
			
			JButton btnNewButton_5 = new JButton("10");
			btnNewButton_5.setBounds(235, 250, 48, 45);
			panel.add(btnNewButton_5);
			
			JButton btnNewButton_5_1 = new JButton("9");
			btnNewButton_5_1.setBounds(300, 250, 48, 45);
			panel.add(btnNewButton_5_1);
			
			JButton btnNewButton_5_2 = new JButton("8");
			btnNewButton_5_2.setBounds(345, 250, 48, 45);
			panel.add(btnNewButton_5_2);
			
			JButton btnNewButton_5_2_1 = new JButton("7");
			btnNewButton_5_2_1.setBounds(400, 250, 48, 45);
			panel.add(btnNewButton_5_2_1);
			
			JButton btnNewButton_5_2_2 = new JButton("6");
			btnNewButton_5_2_2.setBounds(445, 250, 48, 45);
			panel.add(btnNewButton_5_2_2);
			
			JButton btnNewButton_5_2_3 = new JButton("5");
			btnNewButton_5_2_3.setBounds(500, 250, 48, 45);
			panel.add(btnNewButton_5_2_3);
			
			JButton btnNewButton_5_2_4 = new JButton("4");
			btnNewButton_5_2_4.setBounds(560, 250, 48, 45);
			panel.add(btnNewButton_5_2_4);
			
			JButton btnNewButton_5_2_4_1 = new JButton("3");
			btnNewButton_5_2_4_1.setBounds(600, 250, 48, 45);
			panel.add(btnNewButton_5_2_4_1);
			
			JButton btnNewButton_5_2_4_2 = new JButton("2");
			btnNewButton_5_2_4_2.setBounds(640, 250, 48, 45);
			panel.add(btnNewButton_5_2_4_2);
			
			JButton btnNewButton_5_2_4_3 = new JButton("1");
			btnNewButton_5_2_4_3.setBounds(680, 250, 48, 45);
			panel.add(btnNewButton_5_2_4_3);
			
			JButton btnNewButton_5_2_4_4 = new JButton("0");
			btnNewButton_5_2_4_4.setBounds(720, 250, 48, 45);
			panel.add(btnNewButton_5_2_4_4);
			
			//Labels for Operation, GPR, IXR, I, Address
			JLabel lblNewLabel = new JLabel("Operation");
			lblNewLabel.setBounds(100, 307, 66, 16);
			panel.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("GPR");
			lblNewLabel_1.setBounds(345, 307, 30, 16);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("IXR");
			lblNewLabel_2.setBounds(440, 307, 25, 16);
			panel.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("I");
			lblNewLabel_3.setBounds(525, 307, 9, 16);
			panel.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Address");
			lblNewLabel_4.setBounds(640, 307, 65, 16);
			panel.add(lblNewLabel_4);
			
		  //Store,St+,Load,Init Buttons
		  JButton storeBtn = new JButton("Store");
		  storeBtn.setBounds(245, 362, 75, 30);
		  panel.add(storeBtn);
		  
		  JButton stBtn = new JButton("St+");
		  stBtn.setBounds(335, 362, 75, 30);
		  panel.add(stBtn);
		  
		  JButton loadBtn = new JButton("Load");
		  loadBtn.setBounds(435, 362, 75, 30);
		  panel.add(loadBtn);
		  
		  JButton initBtn = new JButton("Init");
		  initBtn.setBounds(535, 362, 75, 30);
		  initBtn.setBackground(Color.red);
		  panel.add(initBtn);
		  
		  JButton ssBtn = new JButton("SS");
		  ssBtn.setBounds(330, 405, 50, 45);
		  panel.add(ssBtn);
		  
		  JButton runBtn = new JButton("Run");
		  runBtn.setBounds(415, 405, 60, 45);
		  panel.add(runBtn);
		  
		  JLabel haltlbl = new JLabel("Halt");
		  haltlbl.setBounds(546, 405, 25, 26);
		  panel.add(haltlbl);
		  
		  JTextField textfield_1 = new JTextField();
		  textfield_1.setBounds(575, 405, 25, 26);
		  textfield_1.setBackground(Color.black);
		  panel.add(textfield_1);
		  
		  JLabel runlbl = new JLabel("Run");
		  runlbl.setBounds(546, 435, 25,26);
		  panel.add(runlbl);
		  
		  JTextField textfield_2 = new JTextField();
		  textfield_2.setBounds(575, 435, 25, 26);
		  textfield_2.setBackground(Color.black);
		  panel.add(textfield_2);
		  
	  }
}