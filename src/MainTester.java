
public class MainTester {
	public static Memory memory = Memory.getInstance();
	public static Register register = Register.getInstance();
	
	public static void main(String[] args) {
		int num1 =  -20;

		//System.out.println("After in " + bit + "-bit format: " + Operations.numToStr(3, bit));
		register.setCC(2);
		memory.store(7, 32768);
		register.setGeneralReg(0, -3200);
		register.setGeneralReg(2, 2500);
		
		String str = "01234567";
		
        System.out.println(str.substring(0, 4));
		
		//Operations.shiftRegByCount(0, 4, 1, 0); //shift left logical
        
//		String line = "000A 8447";
//		Operations.saveInstructionFromText(line);
//		Load load = new Load();
//		load.loadInstruction(10);
//		System.out.println("LR: " + load.AorL);
//		load.runInstruction();
		
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