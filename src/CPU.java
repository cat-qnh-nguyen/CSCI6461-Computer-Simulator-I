import java.util.Scanner;


public class CPU {
	// 4 general purpose registers: R0-3, 16 bits
	public Register R0;
	public Register R1;
	public Register R2;
	public Register R3;
	
	// 3 index registers: X1-3, 16 bits
	public Register X1;
	public Register X2;
	public Register X3;
	
	// Program counter: address of the next instruction to be executed
	// Need to limit the PC to 12 bits: 4096 max
	public Register PC;
	
	// Condition Code: 4 bits, need to limit to 4 bits only
	public Register CC;
	
	// Instruction Register: Holds the instruction to be executed
	public Register IR;
	
	// Memory Address Register: holds the address of the word to be fetched from memory
	// 12 bits only
	public Register MAR;
	
	// Memory Buffer Register: holds the word just fetched from or the word to be/last stored into memory
	public Register MBR;
	
	// Machine Fault Register: contains the ID code if a machine fault after it occurs
	// 4 bits
	public Register MFR;
	
	
	
}
