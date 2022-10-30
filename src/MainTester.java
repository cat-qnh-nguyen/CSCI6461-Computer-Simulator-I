
public class MainTester {
	public static Memory memory = Memory.getInstance();
	public static Register register = Register.getInstance();
	
	public static void main(String[] args) {
		int num1 =  -20;

		//System.out.println("After in " + bit + "-bit format: " + Operations.numToStr(3, bit));
		register.setCC(2);
		memory.store(7, 32768);
		register.setGeneralReg(0, -2048);
		register.setGeneralReg(2, 2500);

//		String line = "000A 8447";
//		Operations.saveInstructionFromText(line);
//		Load load = new Load();
//		load.loadInstruction(10);
//		System.out.println("LR: " + load.AorL);
//		load.runInstruction();
		
		makeInstruction(49, 1, 0, 0, 0);
		
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
		
		System.out.println(opcode + R + IX + I + ADD);
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