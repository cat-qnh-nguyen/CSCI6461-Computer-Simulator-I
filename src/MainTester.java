import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import javax.swing.*;

public class MainTester {
	public static Memory memory = Memory.getInstance();
	public static Register register = Register.getInstance();
	public static Cache cache = Cache.getInstance();
	
	
	public static void main(String[] args) {
		/**
		 * For making instructions
		 */
	
		printInstruction();

		
		/**
		 * For printing out letters in hex
		 */
//		String prompt = "\n>>The closest number is: ";
//		convertCharStr(prompt);

		
		
		/**
		 * For printing out address in hex
		 */
//		int[] address = {250,278};
//		for (int i = address[0]; i <= address[1]; i++) {
//			System.out.println(decToHex(i));
//		}
		
		/**
		 * For printing some numbers in hex
//		 */
//		int[] num = {100, 28, 3, 33, 99};
//		for(int i = 0; i < num.length; i++) {
//			System.out.println(decToHex(num[i]));
//		}
		
		
		//register.setGeneralReg(0, 1); //Fixed to Floating
		register.setGeneralReg(1, 0); // Floating to Fixed
		
		
		//cache.writeCache(0, Helper.strToNum("0000101111010000"));	//Fixed: value: 11.8125
		cache.writeCache(1, Helper.strToNum("1100000011010000"));	//Float: value: -3.625
		
		
		//Operations.convertToFixedFloat(0, 0);
		//System.out.println(Helper.floatFormatToDec(register.getFloat(0)));
		
	}

	
	public static void printInstruction() {
		boolean stop = false;
		int op, r, ix, i, address;
		while(!stop) {
    		op = Integer.parseInt(JOptionPane.showInputDialog(null,"opcode"));
    		r = Integer.parseInt(JOptionPane.showInputDialog(null,"r"));
    		ix = Integer.parseInt(JOptionPane.showInputDialog(null,"ix"));
    		i = Integer.parseInt(JOptionPane.showInputDialog(null,"i"));
    		address = Integer.parseInt(JOptionPane.showInputDialog(null,"address"));
    		
    		makeInstruction(op, r, ix, i, address);
    		
    		if(JOptionPane.showConfirmDialog(null,"Continue?", null, JOptionPane.YES_NO_OPTION) == 1) {
    			stop = true;
    		}
		}
	}
	public static void convertCharStr(String str) {
		int length = str.length();
		int[] result = new int[length + 1];
		for(int i = 0; i < length; i++) {
			result[i] = (int)str.charAt(i);
			//System.out.println(result[i]);
		}
		result[length] = 0;
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(decToHex(result[i]));
		}
	}
	
	public static String decToHex(int dec) {
		String result = Integer.toHexString(dec).toUpperCase();
		while(result.length() < 4) {
			result = "0" + result;
		}
		
		return result;
	}
	
	//Stuff for writing program 1 and 2
	public static String binToHex(String bin) {
		String result = "";
		if(bin.length()%4 == 0) {
			int length = bin.length()/4;
			
			for(int i = 0; i < length; i++) {
				result += Integer.toHexString(Integer.parseInt(bin.substring(i*4, i*4 + 4),2)).toUpperCase();
			}
		}
		return result;
	}
	
	
	public static void makeInstruction(int op, int r, int ix, int i, int address) {
		String opcode = Integer.toBinaryString(op);
		int add = 6 - opcode.length();
		for(int j = 0; j < add; j++) {

			opcode = "0" + opcode;
		}

		String R = Integer.toBinaryString(r);
		add = 2 - R.length();
		for(int j = 0; j < add; j++) {
			R = "0" + R;
		}
		
		String IX = Integer.toBinaryString(ix);
		add = 2 - IX.length();
		for(int j = 0; j < add; j++) {
			IX = "0" + IX;
		}
		
		String I = Integer.toBinaryString(i);
		
		String ADD = Integer.toBinaryString(address);
		add = 5 - ADD.length();
		for(int j = 0; j < add; j++) {
			ADD = "0" + ADD;
		}
		
		String instruction = opcode + R + IX + I + ADD;
		//System.out.println(instruction);
		System.out.println(binToHex(instruction));
	}
	
	

	public static void printAll() {
		System.out.println("General Registers: ");
		for(int i =0; i < 4; i++) {
			System.out.println("R"+i+": " + register.getGeneralReg(i));
		}
		System.out.println("Index Registers: ");
		for(int i = 1; i < 4; i++) {
			System.out.println("I" + i + ": " + register.getIndexReg(i));
		}
		System.out.println("Others: ");
		System.out.println("PC: " + register.getPC());
		System.out.println("CC: " + register.getCC() + "\n");
		
//		System.out.println("IR: " + register.getIR());
//		System.out.println("MAR: " + register.getMAR());
//		System.out.println("MBR: " + register.getMBR());
//		System.out.println("MFR: " + register.getMFR());
	}
}