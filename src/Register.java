public class Register {
	/**
	 * 4 General Purpose Registers (GPRs) each 16 bits in length
	 * 3 Index Registers  16 bits in length 
	 * PC - 12 bits 
	 * CC - 4 
	 * IR -16
	 * MAR - 12 
	 * MBR - 16
	 * MFR -4 
	 */

	//Constructors:
	//Creating an Instance to ensure only one memory object is created
	private static Register INSTANCE = new Register();
	
	private Register() {}
	
	//Singleton function to access the class' singular object
	public static Register getInstance() {
		if(INSTANCE == null) 
		{
			INSTANCE = new Register();
		}
		return INSTANCE;
	}
	
	//Because Java does not have unsigned data type
	//we will limit the data value instead of having a short
	public final int MAX_16 = 32767;
	public final int MIN_16 = -32768;
	
	public final int MAX_12 = 2047;
	public final int MIN_12 = -2048;
	
	public final int MAX_4 = 15;
	public final int MIN_4 = 0;
	
	/**
	 * 4 general purpose registers: R0-3, 16 bits
	 */
	private int R0 = 0;
	private int R1 = 0;
	private int R2 = 0;
	private int R3 = 0;
	
	public int getGeneralReg(int reg) {
		switch(reg) {
			case 0: return R0;
			case 1: return R1;
			case 2: return R2;
			case 3: return R3;
			default: throw new IllegalArgumentException("Invalid General Register.");
		}
	}
	
	public void setGeneralReg(int reg, int value) {
		//Because we are only using 16 bits of the 32 bits in int, we are not expecting any negative values
		if(value > MAX_16 || value < MIN_16)
			throw new IllegalArgumentException("Invalid value.");
		switch(reg) {
			case 0: R0 = value; 
			System.out.println("SetR" + reg + "= " + value + "= " + (char)value);
				break;
			case 1: R1 = value;
			System.out.println("SetR" + reg + "= " + value + "= " + (char)value);
				break;
			case 2: R2 = value;
			System.out.println("SetR" + reg + "= " + value + "= " + (char)value);
				break;
			case 3: R3 = value;
			System.out.println("SetR" + reg + "= " + value + "= " + (char)value);
				break;
			default: throw new IllegalArgumentException("Invalid General Register.");
		}
	}
	
	/**
	 * 3 index registers: X1-3, 16 bits
	 */
	private int X1 = 0;
	private int X2 = 0;
	private int X3 = 0;
	
	public int getIndexReg(int reg) {
		switch(reg) {
			case 1: return X1;
			case 2: return X2;
			case 3: return X3;
			default: throw new IllegalArgumentException("Invalid Index Register.");
		}
	}
	
	public void setIndexReg(int reg, int value) {
		//Because we are only using 16 bits of the 32 bits in int, we are not expecting any negative values
		if(value > MAX_16 || value < MIN_16)
			throw new IllegalArgumentException("Invalid value.");
		switch(reg) {
			case 1: X1 = value;
			System.out.println("SetX" + reg + "= " + value);
				break;
			case 2: X2 = value;
			System.out.println("SetX" + reg + "= " + value);
				break;
			case 3: X3 = value;
			System.out.println("SetX" + reg + "= " + value);
				break;
			default: throw new IllegalArgumentException("Invalid Index Register.");
		}
	}
	
	/**
	 * Program counter: address of the next instruction to be executed
	 */
	// Need to limit the PC to 12 bits: 4095 max
	private int PC = 0;
	
	public int getPC() {
		return PC;
	}
	public void setPC(int value) {
		//Because PC is 12 bits, its value cannot be more than 4095
		//Java does not have unsigned data type
		if(value > MAX_12 || value < MIN_12) {
			throw new IllegalArgumentException("Invalid PC value.");			
		}
		else {
			PC = value;
			System.out.println("PC: " + PC + " is " + Operations.numToStr(PC, 12));
		}
	}
	
	/**
	 * Condition Code: 4 bits, need to limit to 4 bits only
	 * cc(0), cc(1), cc(2), cc(3). Or by the names OVERFLOW, UNDERFLOW, DIVZERO, EQUALORNOT
	 */
	private int CC = 0;
	
	public int getCC() {
		return CC;
	}
	public void setCC(int value) {
		// doubt should be unsigned (we are using 8, 4, 2, 1 for overflow, underflow, divide by zero, equal or not)
		//Since CC can only be 4 bits, it cannot be bigger than 15
		if(value > MAX_4 || value < MIN_4) {
			throw new IllegalArgumentException("Invalid CC value.");			
		}
		else {
			CC = value;
			System.out.println("CC: " + CC + " is " + Operations.numToStr(CC, 4));
		}
	}
	
	
	/**
	 * Instruction Register: Holds the instruction to be executed, 16 bits
	 */
	private int IR = 0;
	
	public int getIR() {
		return IR;
	}
	public void setIR(int value) {
		//Because we are only using 16 bits of the 32 bits in int, we are not expecting any negative values
		if(value > MAX_16 || value < MIN_16)
			throw new IllegalArgumentException("Invalid value.");
		IR = value;
		System.out.println("IR: " + IR + " is " + Operations.numToStr(IR, 16));
	}
	
	/**
	 * Memory Address Register: holds the address of the word to be fetched from memory
	 */
	// 12 bits only
	private int MAR = 0;
	
	public int getMAR() {
		return MAR;
	}
	
	public void setMAR(int value) {
		//Because MAR is 12 bits, its value cannot be > 4095

		if(value > MAX_12 || value < MIN_12) {
			throw new IllegalArgumentException("Invalid MAR value.");			
		}
		else {
			MAR = value;
			System.out.println("MAR: " + MAR + " is " + Operations.numToStr(MAR, 12));
		}		
	}
	
	/**
	 * Memory Buffer Register: holds the word just fetched from or the word to be/last stored into memory
	 */
	//16 bits
	public int MBR;
	
	public int getMBR() {
		return MBR;
	}
	public void setMBR(int value) {
		if(value > MAX_16 || value < MIN_16)
			throw new IllegalArgumentException("Invalid value.");
		MBR = value;
		System.out.println("MBR: " + MBR + " is " + Operations.numToStr(MBR, 16));
	}
	
	/**
	 * Machine Fault Register: contains the ID code if a machine fault after it occurs
	 */
	// 4 bits
	public int MFR;
	
	public int getMFR() {
		return MFR;
	}
 	
	public void setMFR(int value) {
		//Since CC can only be 4 bits, value has to be between 0 and 15
		if(value > MAX_4 || value < MIN_4) {
			throw new IllegalArgumentException("Invalid MFR value.");			
		}
		else {
			MFR = value;
			System.out.println("MFR: " + MFR + " is " + Operations.numToStr(MFR, 12));
		}
	}

	public void faultTolSetMFR(int value) {	
		//Instructions for fault tolerance procedures
		MFR = value;
	}
	
}