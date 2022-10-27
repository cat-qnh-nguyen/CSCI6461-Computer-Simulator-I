
public class MainTester {
	public static Register register = Register.getInstance();
	public static void main(String[] args) {
		int num1 =  -430;
		int bit = 12;
		//System.out.println("After in " + bit + "-bit format: " + Operations.numToStr(3, bit));
		
		String str = "A130";
		
		
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
	
	/**
	 * Returning the data in integer (32 bits) form from a string of various sizes
	 * @param str the data in string form
	 * @param bits the number of bits for that particular data type (4 bits, 12 bits, or 16 bits)
	 * @return the data in int form (32 bits)
	 */
	public static int strToNum(String str) {
		int result = 0;
		String resultStr = "";
		if(str.charAt(0) == '1') {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '0') {
					resultStr += '1';
				}
				else {
					resultStr += '0';
				}
			}
			System.out.println(resultStr);
			result = -(Integer.parseInt(resultStr,2) + 1);
		}
		else {
			result = Integer.parseInt(str,2);
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
