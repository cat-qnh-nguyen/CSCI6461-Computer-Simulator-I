/**
 * A class designed to help do other operations
 * Not an instruction
 */
public class Helper {
	public static Register register = Register.getInstance();
	
	/**
	 * Changing a decimal number into an int representing the floating format
	 * @param decimal the number that we are trying to represent
	 * @return the floating point number in int 
	 */
	public static int decToFloatFormat(double decimal) {
		String f = "";
		
		//Processing sign bit
		if(decimal < 0) {
			f += "1";
		}
		else {
			f += "0";
		}
		
		
		int whole = (int)decimal;
		
		
		//Finding fractional part
		double fractional = decimal - whole;
		
		//System.out.println(fractional);
		String frac = "";
		for(int i =0; i < 8; i++) {
			fractional *= 2;
			if (fractional >= 1) {
				fractional -= (int)fractional;
				frac += "1";
			}
			else {
				frac += "0";
			}
		}
		//System.out.println(frac);
		String mantissa = Integer.toBinaryString(whole).substring(1);
		System.out.println(mantissa);
		
		//Finding exponent
		int exp = mantissa.length() + 63;
		String expStr = Integer.toBinaryString(exp);
		
		System.out.println(exp + " " + expStr);
		while(expStr.length() < 7) {
			expStr = "0" + expStr; 
		}
		
		if(exp < 0) {
			register.setCC(register.getCC() | 4);
			System.out.println("UNDERFLOW");
		}
		else if(exp > 127) {
			register.setCC(register.getCC() | 8);
			System.out.println("OVERFLOW");
		}
		
		f += expStr;
		System.out.println(f);
		f = f.substring(0,8);
		
		
		//Finding the mantissa
		mantissa += frac;
		System.out.println("String: " + mantissa);
		
		mantissa = mantissa.substring(0,8);
		
		f += mantissa;
		System.out.println(f);
		
		return strToNum(f);
	}
	
	/**
	 * changing a number in floating format into regular decimal
	 * @param value the value of float needs to be converted
	 * @return the float number in decimal format
	 */
	public static double floatFormatToDec(int value) {
		String f = numToStr(value,16);
		double decimal = 1;
		
		String sign = f.substring(0,1); //first bit indicate sign
		String expStr = f.substring(1,8);
		String mantissa = f.substring(8);
		System.out.println ("Sign: " + sign + ", Exp: " + expStr + ", Mantissa: " + mantissa);
		//Processing the mantissa first
		for(int i = 1; i <= 8; i++) {
			if(mantissa.substring(i-1,i).equals("1")) {
				System.out.print(Math.pow(2, -i) + " + ");
				
				decimal += Math.pow(2, -i);
			}
		}
		System.out.println(decimal);
		
		///Processing exponent
		int exp = Integer.parseInt(expStr, 2);
		System.out.println(exp);
		exp = exp - 63;
		decimal *= Math.pow(2,exp);
		
		if(sign.equals("1")) {
			decimal = -decimal;
		}
		return decimal;
	}

	
	// For reading the file with address and instruction in one line
	/**
	 * Storing the second hex number in the first number as the address
	 * 
	 * @param hexInstruction as a string
	 */
	public static void saveInstructionFromText(String hexInstruction) {
		String addressStr = hexInstruction.substring(0, 4);
		String contentStr = hexInstruction.substring(5);
	
		int address = Helper.hexToNum(addressStr);
		int content = Helper.hexToNum(contentStr);
	
		Operations.cache.writeCache(address, content);
	}

	/**
	 * Converting a number into an x-bit string
	 * 
	 * @param num is the number to be converted to string
	 * @param bit is the number of bits that should be formatted
	 * @return the number in x-bit string
	 */
	public static String numToStr(int num, int bit) {
		String result = Integer.toBinaryString(num);
	
		if (num >= 0) {
			if (bit == 32) {
				result = String.format("%32s", result).replaceAll(" ", "0");
			} else if (bit == 16) {
				result = String.format("%16s", result).replaceAll(" ", "0");
			} else if (bit == 14) {
				result = String.format("%14s", result).replaceAll(" ", "0");
			} else if (bit == 12) {
				result = String.format("%12s", result).replaceAll(" ", "0");
			} else if (bit == 4) {
				result = String.format("%4s", result).replaceAll(" ", "0");
			} else if (bit == 2) {
				result = String.format("%2s", result).replaceAll(" ", "0");
			}
		} else {
			if (bit == 16) {
				result = result.substring(result.length() - 16);
			} else if (bit == 14) {
				result = result.substring(result.length() - 14);
			} else if (bit == 12) {
				result = result.substring(result.length() - 12);
			}
		}
	
		return result;
	}


	/**
	 * Returning the data in integer (32 bits) form from a string of various sizes
	 * 
	 * @param str  the data in string form
	 * @param bits the number of bits for that particular data type (4 bits, 12
	 *             bits, or 16 bits)
	 * @return the data in int form (32 bits)
	 */
	public static int strToNum(String str) {
		int result = 0;
		String resultStr = "";
	
		if (str.charAt(0) == '1') {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '0') {
					resultStr += '1';
				} else {
					resultStr += '0';
				}
			}
	
			result = -(Integer.parseInt(resultStr, 2) + 1);
		}
	
		else {
			result = Integer.parseInt(str, 2);
		}
	
		//System.out.println("String " + str + " is: " + result);
		return result;
	}


	/**
	 * Converting a hex number to a number to store in memory
	 * 
	 * @param hex is the hex string
	 * @return a number converted in 2's complement
	 */
	public static int hexToNum(String hex) {
		int result;
		String total = "";
		for (int i = 0; i < hex.length(); i++) {
			int temp = Integer.parseInt(hex.substring(i, i + 1), 16);
			total += numToStr(temp, 4);
		}
		result = strToNum(total);
	
		System.out.println(hex + " is converted to: " + result);
		return result;
	
	}
}
