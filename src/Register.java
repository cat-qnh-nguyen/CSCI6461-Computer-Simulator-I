
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
	
	// 4 general purpose registers: R0-3
	public short R0;
	public short R1;
	public short R2;
	public short R3;
	
	// 3 index registers: X1-3
	public short X1;
	public short X2;
	public short X3;
	
	// Program counter: address of the next instruction to be executed
	// Need to limit the PC to 12 bits: 4096 max
	public short PC;
	
	// Condition Code: 4 bits, need to limit to 4 bits only
	public byte CC;
	
	// Instruction Register: Holds the instruction to be executed
	public short IR;
	
	// Memory Address Register: holds the address of the word to be fetched from memory
	// 12 bits only
	public short MAR;
	
	// Memory Buffer Register: holds the word just fetched from or the word to be/last stored into memory
	public short MBR;
	
	// Machine Fault Register: contains the ID code if a machine fault after it occurs
	// 4 bits
	public byte MFR;
	
	// Constructor (? not sure if needed yet)
	public Register() {};
	
}
