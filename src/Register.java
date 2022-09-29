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
	//Creating an Instance to ensure only one memory object is created
	private static Register INSTANCE = new Register();
	
	private Register() {}
	
	//Singleton function to access the class' singular object
	public static Register getInstance() {
		if(INSTANCE == null)
			INSTANCE = new Register();
		return INSTANCE;
	}
	
	
// 4 general purpose registers: R0-3, 16 bits
	private short R0;
	private short R1;
	private short R2;
	private short R3;
	
	public short getGeneralReg(int reg) {
		switch(reg) {
			case 0: return R0;
			case 1: return R1;
			case 2: return R2;
			case 3: return R3;
			default: throw new IllegalArgumentException("Invalid General Register.");
		}
	}
	
	public void setGeneralReg(int reg, short value) {
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
	private short X1;
	private short X2;
	private short X3;
	
	public short getIndexReg(int reg) {
		switch(reg) {
			case 1: return X1;
			case 2: return X2;
			case 3: return X3;
			default: throw new IllegalArgumentException("Invalid Index Register.");
		}
	}
	
	public void setIndexReg(int reg, short value) {
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
	// Need to limit the PC to 12 bits: 4095 max
	private short PC;
	
	private short getPC() {
		return PC;
	}
	public void setPC(short value) {
		//Because PC is 12 bits, its value cannot be more than 4095
		//Java does not have unsigned data type
		if(value > 4095) {
			throw new IllegalArgumentException("Invalid PC value.");			
		}
		else {
			PC = value;
		}
	}
	
// Condition Code: 4 bits, need to limit to 4 bits only
	private byte CC;
	
	public byte getCC() {
		return CC;
	}
	public void setCC(byte value) {
		//Since CC can only be 4 bits, it cannot be bigger than 15
		if(value > 15) {
			throw new IllegalArgumentException("Invalid CC value.");			
		}
		else {
			CC = value;
		}
	}
	
	
// Instruction Register: Holds the instruction to be executed, 16 bits
	private short IR;
	
	public short getIR() {
		return IR;
	}
	public void setIR(short value) {
		IR = value;
	}
	
// Memory Address Register: holds the address of the word to be fetched from memory
	// 12 bits only
	private short MAR;
	
	public short getMAR() {
		return MAR;
	}
	
	public void setMAR(short value) {
		//Because MAR is 12 bits, its value cannot be > 4095
		//Since our memory size is 2048
		if(value > 2048 || value < 0) {
			throw new IllegalArgumentException("Invalid MAR value.");			
		}
		else {
			MAR = value;
		}
	}
	
	// Memory Buffer Register: holds the word just fetched from or the word to be/last stored into memory
	//16 bits
	public short MBR;
	
	public short getMBR() {
		return MBR;
	}
	public void setMBR(short value) {
		MBR = value;
	}
	
	// Machine Fault Register: contains the ID code if a machine fault after it occurs
	// 4 bits
	public byte MFR;
	
	public byte getMFR() {
		return MFR;
	}
	public void setMFR(byte value) {
		//Since CC can only be 4 bits, value has to be between 7 and -8
		if(value > 7 || value < -8) {
			throw new IllegalArgumentException("Invalid MFR value.");			
		}
		else {
			MFR = value;
		}
	}
	
	
}
