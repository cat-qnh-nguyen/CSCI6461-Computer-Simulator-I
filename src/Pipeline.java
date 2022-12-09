
public class Pipeline {
	private static Pipeline INSTANCE = new Pipeline();
	
	private Pipeline() {}
	
	//Singleton function to access the class' singular object
	public static Pipeline getInstance() {
		if(INSTANCE == null) 
		{
			INSTANCE = new Pipeline();
		}
		return INSTANCE;
	}
	
	//Because Java does not have unsigned data type
	//we will limit the data value instead of having a short
	public final int MAX_16 = 32767;
	public final int MIN_16 = -32768;
	
	private int IF;
	
	public int getIF() {
		return IF;
	}
	public void setIF(int value) {
		//Because we are only using 16 bits of the 32 bits in int, we are not expecting any negative values
		if(value > MAX_16 || value < MIN_16)
			throw new IllegalArgumentException("Invalid value.");
		IF = value;
		System.out.println("IF: " + IF + " is " + Helper.numToStr(IF, 16));
	}
	
	private int ID;
	
	public int getID() {
		return ID;
	}
	public void setID(int value) {
		//Because we are only using 16 bits of the 32 bits in int, we are not expecting any negative values
		if(value > MAX_16 || value < MIN_16)
			throw new IllegalArgumentException("Invalid value.");
		ID = value;
		System.out.println("ID: " + ID + " is " + Helper.numToStr(ID, 16));
	}
	
	
	private int EXE;
	
	public int getIR() {
		return EXE;
	}
	public void setIR(int value) {
		//Because we are only using 16 bits of the 32 bits in int, we are not expecting any negative values
		if(value > MAX_16 || value < MIN_16)
			throw new IllegalArgumentException("Invalid value.");
		EXE = value;
		System.out.println("EXE: " + EXE + " is " + Helper.numToStr(EXE, 16));
	}
	
	
	private int MEM;
	
	public int getMEM() {
		return MEM;
	}
	public void setMEM(int value) {
		//Because we are only using 16 bits of the 32 bits in int, we are not expecting any negative values
		if(value > MAX_16 || value < MIN_16)
			throw new IllegalArgumentException("Invalid value.");
		MEM = value;
		System.out.println("MEM: " + MEM + " is " + Helper.numToStr(MEM, 16));
	}
	
	
	private int WB;
	
	public int getWB() {
		return WB;
	}
	public void setWB(int value) {
		//Because we are only using 16 bits of the 32 bits in int, we are not expecting any negative values
		if(value > MAX_16 || value < MIN_16)
			throw new IllegalArgumentException("Invalid value.");
		WB = value;
		System.out.println("WB: " + WB + " is " + Helper.numToStr(WB, 16));
	}
	
	
}
