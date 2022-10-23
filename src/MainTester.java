
public class MainTester {
	public static Register register = Register.getInstance();
	public static void main(String[] args) {
		int num1 = (int)Math.pow(2,14);
		int bit = 12;
		System.out.println("After in " + bit + "-bit format: " + numToStr(3, bit));
	
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
	
	
	
	public static String numToStr(int num, int bit) {
		String result = Integer.toBinaryString(num);
		System.out.println("Before:" + result);
		if(num >= 0) {
			if(bit == 16) {
		        result = String.format("%16s", result).replaceAll(" ", "0");
			}
			else if(bit == 12) {
		        result = String.format("%12s", result).replaceAll(" ", "0");
			}
			else if(bit == 4) {
		        result = String.format("%4s", result).replaceAll(" ", "0");
			}
		}
		else {
			if(bit == 16) {
		        result = result.substring(result.length()-16);
			}
			else if(bit == 12) {
		        result = result.substring(result.length()-12);
			}
			else if(bit == 4) {
		        result = result.substring(result.length()-4);
			}
		}
		System.out.println("Length of string: " + result.length());
		return result;
	}
}
