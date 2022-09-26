import java.io.InvalidObjectException;
public class Register {
	/*
	 * 4 General Purpose Registers (GPRs) – each 16 bits in length
	 * 3 Index Registers – 16 bits in length 
	 * PC - 12 bits - Short
	 * CC - 4 - Byte
	 * IR -16 - Short
	 * MAR - 12 - Short
	 * MBR - 16 - Short
	 * MFR -4 - Byte 
	 */

	//Constructors:
//	public Register() {}
//	public Register(short newValue, int newBitSize) {
//		this.value = newValue;
//		this.bitSize = newBitSize;
//	}
	
	
// 4 general purpose registers: R0-3, 16 bits
	public static short R0;
	public static short R1;
	public static short R2;
	public static short R3;
	
	public static short getGeneralReg(int reg) {
		switch(reg) {
			case 0: return R0;
			case 1: return R1;
			case 2: return R2;
			case 3: return R3;
			default: throw new IllegalArgumentException("Invalid General Register.");
		}
	}
	
	public static void setGeneralReg(int reg, short value) {
		switch(reg) {
			case 0: R0 = value; 
				break;
			case 1: R1 = value;
				break;
			case 2: R2 = value;
				break;
			case 3: R3 = value;
				break;
			default: throw new IllegalArgumentException("Invalid General Register.");
		}
	}
	
// 3 index registers: X1-3, 16 bits
	public static short X1;
	public static short X2;
	public static short X3;
	
	public static short getIndexReg(int reg) {
		switch(reg) {
			case 1: return X1;
			case 2: return X2;
			case 3: return X3;
			default: throw new IllegalArgumentException("Invalid Index Register.");
		}
	}
	
	public static void setIndexReg(int reg, short value) {
		switch(reg) {
			case 1: X1 = value;
				break;
			case 2: X2 = value;
				break;
			case 3: X3 = value;
				break;
			default: throw new IllegalArgumentException("Invalid Index Register.");
		}
	}
	
// Program counter: address of the next instruction to be executed
	// Need to limit the PC to 12 bits: 4096 max
	public static short PC;
	
	public static short getPC() {
		return PC;
	}
	public static void setPC(short value) {
		//Because PC is 12 bits, its value has to be between 2047 and -2048
		//Java does not have unsigned data type
		if(value > 2047 || value < -2048) {
			throw new IllegalArgumentException("Invalid PC value.");			
		}
		else {
			PC = value;
		}
	}
	
// Condition Code: 4 bits, need to limit to 4 bits only
	public static byte CC;
	
	public static byte getCC() {
		return CC;
	}
	public static void setCC(byte value) {
		//Since CC can only be 4 bits, value has to be between 7 and -8
		if(value > 7 || value < -8) {
			throw new IllegalArgumentException("Invalid CC value.");			
		}
		else {
			CC = value;
		}
	}
	
	
// Instruction Register: Holds the instruction to be executed, 16 bits
	public static short IR;
	
	public static short getIR() {
		return IR;
	}
	public static void setIR(short value) {
		IR = value;
	}
	
// Memory Address Register: holds the address of the word to be fetched from memory
	// 12 bits only
	public static short MAR;
	
	public static short getMAR() {
		return MAR;
	}
	
	public static void setMAR(short value) {
		//Because MAR is 12 bits, its value has to be between 2047 and -2048
		//Java does not have unsigned data type
		if(value > 2047 || value < -2048) {
			throw new IllegalArgumentException("Invalid MAR value.");			
		}
		else {
			MAR = value;
		}
	}
	
	// Memory Buffer Register: holds the word just fetched from or the word to be/last stored into memory
	//16 bits
	public static short MBR;
	
	public static short getMBR() {
		return MBR;
	}
	public static void setMBR(short value) {
		MBR = value;
	}
	
	// Machine Fault Register: contains the ID code if a machine fault after it occurs
	// 4 bits
	public static byte MFR;
	
	public static byte getMFR() {
		return MFR;
	}
	public static void setMFR(byte value) {
		//Since CC can only be 4 bits, value has to be between 7 and -8
		if(value > 7 || value < -8) {
			throw new IllegalArgumentException("Invalid MFR value.");			
		}
		else {
			MFR = value;
		}
	}


	
	
}
