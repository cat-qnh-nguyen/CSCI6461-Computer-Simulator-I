/**
 *  A class to perform the loading of instructions and decoding them at the same time.
 */
public class Load {

    //Contents of the instructions
	
    public String instruction;	//Instruction in String form
    public int opcode;			//Opcode
    public int R;   			//General Register 
    public int IX;  			//Index Register
    public int I;   			//Indirect Bit
    public int address; 		//Address field in the instruction
    public int EA; 				//Effective address
    public int AorL;			//Arithmetic or Logic
    public int LorR;			//Left or Right
    public int count;			//Count to shift/rotate
    
    
    //Constructor for each object/instruction
    public Load() {}
    
    // Creating a memory and register instance
    
    //No need for memory instance since cache is implemented
    //public static Memory memory = Memory.getInstance();
    
    public static Register register = Register.getInstance();
    public static Cache cache = Cache.getInstance();
    
    //Decodes instructions and separates them into opcode, R, IX, I and Address
    public void instructionDecode(String ins) {
    	System.out.println("opcodeStr: " + ins.substring(0,6));
        opcode = Integer.parseInt(ins.substring(0, 6),2);
        R = Integer.parseInt(ins.substring(6, 8),2);
        IX = Integer.parseInt(ins.substring(8, 10), 2);
        I = Integer.parseInt(ins.substring(10, 11), 2);
        address = Integer.parseInt(ins.substring(11, 16), 2);
        
        AorL = Integer.parseInt(ins.substring(8,9),2);
        LorR = Integer.parseInt(ins.substring(9,10),2);
        count = Integer.parseInt(ins.substring(12, 16), 2);
        
        computeEA();
    }


    /**
     * Loading the instruction from the memory and returning the value in String format
     * @param address is the address to fetch the instruction from
     * @return is the instruction in form of a string
     */
    public void loadInstruction(int memAddress) {
    	
        int insInMem = cache.loadCache(memAddress);
        
        instruction = Operations.numToStr(insInMem, 16);
        System.out.println("Instruction: " + instruction);
        instructionDecode(instruction);
    }

    /**
     * Computes the EA and returns it
     * @param index register(IX), address, and indirect bit(I)
     */
    public void computeEA() {
        if (I == 0) // NO Indirect Addressing
        {         
        	if(IX == 0)
        	{
        		EA = address;
            }
        	else
        	{
        		EA = register.getIndexReg(IX) + address;
        	}
        } 
        else if (I == 1)  // indirect addressing
        {             
        	if(IX == 0)
        	{
        		EA = cache.loadCache(address);
        	}
        	else
        	{
        		EA = cache.loadCache(register.getIndexReg(IX) + address);
        	}
        }
    }
    
    /**
     * Returning the effective address whenever necessary
     * @return EA
     */
    public int getEA() {
    	return EA;
    }
    
    /**
     * Loading Operations based on Opcode
     */
    public void runInstruction() {
    	switch(opcode) {
    		// Load/Store Instructions
    		case 1: Operations.loadRegister(R, EA);						//load register from memory
    			System.out.println("---loadRegister: "+ R + " with data at memory " + EA);
    			break;
    		case 2: Operations.storeRegister(R, EA);					//store register to memory
				System.out.println("---storeRegister: "+ R + " to memory location " + EA);
    			break;
    		case 3: Operations.loadAddress(R, EA);						//load register with address
				System.out.println("---loadAddress: "+ R + " with address " + EA);
    			break;
        	// Arithmetic instructions
        	case 4: Operations.addMemToReg(R, EA); 							// registerValue += memory[EA]
        		System.out.println("---addMemoryToReg: " + R + "\tEA:" + EA);
        		break;
        	case 5: Operations.subMemFromReg(R, EA); 				// registerValue -= memory[EA]
    			System.out.println("---subtractMemoryFromRegister: " + R + "\tEA:" + EA);
    			break;
        	case 6: Operations.addImmedToReg(R, address); 				// add immediate to the register
    			System.out.println("---addImmediateToRegister: " + R + "\tImmediate:" + address);
    			break;
        	case 7: Operations.subImmedFromReg(R, address); 		// subtract immediate from the register
    			System.out.println("---subtractImmediateFromRegister: " + R + "\tImmediate:" + address);
    			break;
    		// Transfer instructions
    		case 8: Operations.jumpZero(R, EA);						//Jump if Zero
    			System.out.println("---jumpZero: " + R + "\nPC:" + register.getPC());
    			break;
    		case 9: Operations.jumpNotZero(R, EA);					//Jump Not Zero
				System.out.println("---jumpNotZero: " + R + "\nPC:" + register.getPC());
				break;
    		case 10: Operations.jumpConditionCode(R, EA);			//Jump if Condition Code, cc is at the r bits
    			System.out.println("---jumpConditionCode.");
    			break;
    		case 11: Operations.jumpAddress(EA);					//Unconditional Jump to Address
				System.out.println("---jumpAddress to:" + EA);
				break;
    		case 12: Operations.jumpSaveReturn(EA);					//Jump and Save return address
				System.out.println("---jumpSaveReturn: EA: " + EA + "PC: " + register.getPC());
				break;
    		case 13: Operations.returnFromSubroutine(address);		//Return from subroutine
				System.out.println("---returnFromSubroutine."); 		//immed is in the field address
				break;
    		case 14: Operations.subtractOneBranch(R, EA);			//subtract one and branch
    			System.out.println("---subtractOneBranch.");
    			break;
    		case 15: Operations.jumpGreaterEqual(R, EA);			//jump greater than or equal to
    			System.out.println("---jumpGreaterEqual.");
    			break;
    		// Arithmetic Instructions
    		case 16: Operations.multRegByReg(R, IX); 				// multiple the values in both the registers. Rx - R, Ry - IX .
				System.out.println("---multiplyRegister: " + R + "\tByRegister:" + IX);
				break;
    		case 17: Operations.divRegByReg(R, IX); 				// divide one register value by another register value. Rx - R, Ry - IX.
				System.out.println("---divideRegister: " + R + "\nByRegister:" + IX);
				break;
    		// Logical operations
    		case 18: Operations.testRegReg(R, IX); 		// check if two registers are equal. Rx - R, Ry - IX.
				System.out.println("---testEqualityOfRegister: " + R + "\tAndRegister:" + IX);
				break;
    		case 19: Operations.logicalAND(R, IX); 		// logical AND of two register values. Rx - R, Ry - IX.
				System.out.println("---logicalAndOfRegister: " + R + "\nAndRegister:" + IX);
				break;
    		case 20: Operations.logicalOR(R, IX); 			// logical OR of two register values. Rx - R, Ry - IX.
				System.out.println("---logicalOrOfRegister: " + R + "\nAndRegister:" + IX);
				break;	
    		case 21: Operations.logicalNot(R); 						// logical NOT of a register value.
				System.out.println("---logicalNotOfRegister: " + R);
				break;			
			// Shift Instructions
    		case 25: Operations.shiftRegByCount(R, count, LorR, AorL); 	// Shift RegisterBy Count.
				System.out.println("---shiftRegister: " + R + "\nByCount" + count);
				break;
    		case 26: Operations.rotateRegByCount(R, count, LorR); 			// Rotate Register By Count.
				System.out.println("---rotateRegisterByCount: " + R + "\nByCount" + count);
				break;	
			
			//Index register instructions
    		case 32: Operations.resetIndex(IX); 					//reset the IX to value zero
    			System.out.println("---resetIndex: " + IX + " = " + register.getIndexReg(IX));
    			break;
    		case 33: Operations.loadIndex(IX,EA);					//load index register from memory
				System.out.println("---loadIndex: "+ IX + " with data at memory location " + EA);
    			break;
    		case 34: Operations.storeIndex(IX, EA);					//store index register to memory
				System.out.println("---storeIndex: "+ IX + " into memory location " + EA);
    			break;
    			
    		//Add + subtract immediate for index registers
    		case 35: Operations.addImmedToX(IX, address);
    			System.out.println("---addImmedToX: " + IX + " immed: " + address);
    			break;
    		case 36: Operations.subImmedFromX(IX, address);
				System.out.println("---subImmedFromX: " + IX + " immed: " + address);
    			break;
    			
    		case 37: Operations.copyIndexToReg(R, IX); 				//Copies the c(X) into c(R)
    			System.out.println("---copyIndexToReg: R" + R + " = X" + IX + " = " + register.getGeneralReg(R));
    			break;
    			
    		// In/Out Instructions
    		case 49: Operations.in(R, address);						//In instruction
    			System.out.println("---in R" + R + ", Device: " + address);
    			break;
    		case 50: Operations.out(R, address);					//Out instruction
    			System.out.println("---out R" + R + ", Device: " + address);
    			break;
    		default: throw new IllegalArgumentException("Invalid instruction code.");
				register.faultTolSetMFR(4);
    			
    	}
    }
}