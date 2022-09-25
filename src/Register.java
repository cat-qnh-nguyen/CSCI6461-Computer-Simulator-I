
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
	short value;
	int bitSize; //number of bits in the register

	//Constructors:
	public Register() {}
	public Register(short newValue, int newBitSize) {
		this.value = newValue;
		this.bitSize = newBitSize;
	}
	
	public short getValue() {
		return this.value;
	}
	
	public void setValue (short value) {
		this.value = value;
	}
	
	
	public int getSize() {
		return this.bitSize;
	}
	
	public void setSize(int size) {
		this.bitSize = size;
	}

	


	
}
