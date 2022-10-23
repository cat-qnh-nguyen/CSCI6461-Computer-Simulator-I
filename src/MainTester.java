
public class MainTester {
	public static Register register = Register.getInstance();
	public static void main(String[] args) {

		
		printAll();
		
		Operations.jumpSaveReturn(15);
		printAll();
		
		Operations.returnFromSubroutine(18);
		printAll();
		
		Operations.subtractOneBranch(3, 25);
		printAll();
		
		Operations.jumpGreaterEqual(3, 10);
		printAll();
		
//		register.setGeneralReg(2, -3);
//		Operations.jumpGreaterEqual(2, 22);
//		printAll();
//		
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
