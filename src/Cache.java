public class Cache {
    /**
    * Class to implement Cache memory
    */
	
	//Creating an Instance to ensure only one memory object is created
	private static Cache INSTANCE = new Cache();
   
    private int[] cache_tag = new int [16];
    private int[] cache_valid = new int [16];
    private int[][] cache_data = new int [16][4]; 
    private int tag;
    private int block;
    private int cache_pointer = 0;

    public static Memory memory = Memory.getInstance();
    
    private Cache() {}
    
    //Singleton function to access Cache
    public static Cache getInstance() {
    	if(INSTANCE == null) {
    		INSTANCE = new Cache();
    	}
    	return INSTANCE;
    }
    
    /**
     * loading data from cache
     * @param address the memory address that user wants to get data from
     * @return the data at that memory address stored in cache
     */
    public int loadCache(int address)
    {   
        //Check for space in cache, and if found full, we reset the 
    	//pointer to 0 thereby implementing a FIFO data structure
        if(cache_pointer == 16)
        {
            cache_pointer = 0;
        }

        //addressStr stores the address given in string
        String addressStr = Operations.numToStr(address,16);
        
        System.out.println("Address: " + addressStr + 
        		"\nTag: " + addressStr.substring(0,14));
        

        tag = Operations.strToNum(addressStr.substring(0,14));
        System.out.println("Tag num: " + tag);
        
        //Using parseInt because these values do not need to be negative
        block = Integer.parseInt(addressStr.substring(14,16),2);
        System.out.println("Block is: " + block);
        
        boolean foundTag = false;
        int i = 0;
        
        //Search for the existence of tag in the cache 
        while(!foundTag && i < 16) {
        	if(cache_tag[i] == tag) {
        		foundTag = true;
        	}
        	else {
        		i++;
        	}
        }
              
        //if tag is found and valid is 1
        if(foundTag && cache_valid[i] == 1) {
        	System.out.println("Cache hit");
        	return cache_data[i][block];
        }
        
        //if tag is not found at all
        if(!foundTag) {
        	//set i as the cache_pointer so we can appropriately add data
        	i = cache_pointer;
        	cache_pointer++;
        }
        
        cache_tag[i] = tag;
        cache_valid[i] = 1;
        
        for(int j = 0; j < 4; j++) {
        	addressStr = Operations.numToStr(tag,14) + Operations.numToStr(j,2);
        	int memAdd = Operations.strToNum(addressStr);
        	
        	
        	
    		System.out.println("\nAddress: " + address +"\nTag as string: " + Operations.numToStr(tag,14) +
    				"\nTag as num: " + tag  + "\nBlock string: " + Operations.numToStr(j,2)
    				+"\nBlock num: " + j + "\nBlock converted back: " +
    				"\nPut back together: " + addressStr + "\nAddress num is: " +
    				memAdd);
    				
        	

        	System.out.println("Address in cache to pass to mem " + addressStr + " is " + memAdd);
        	cache_data[i][j] = memory.load(memAdd);
        }
        
        return cache_data[i][block];
        
    }    

    public void writeCache(int address,int data)
    {
        //Check for space in cache, and if found full, we reset the pointer to 0 thereby implementing a FIFO
        if(cache_pointer==16)
        {
            cache_pointer=0;
        }

        //Extracting the data from memory
        //add stores the address given in string
        String add = Operations.numToStr(address,16);
        
        tag = Operations.strToNum(add.substring(0,14));
        
        //Using parseInt because these values do not need to be negative
        block = Integer.parseInt(add.substring(14,16),2);
        
        boolean foundTag = false;
        int i = 0;
        
        //Search for the existence of tag in the cache 
        while(!foundTag && i < 16) {
        	if(cache_tag[i] == tag) {
        		foundTag = true;
        	}
        	i++;
        }
              
        //if tag is found and valid is 1
        if(foundTag && cache_valid[i] == 1) {
        	cache_data[i][block] = data;
        	memory.store(address, data);
        }
        
        //if tag is not found at all
        if(!foundTag) {
        	//set i as the cache_pointer so we can appropriately add data
        	i = cache_pointer;
        	cache_pointer++;
        }
        
        //both situations where valid bit is 0
        cache_tag[i] = tag;
        cache_valid[i] = 1;
        
        //Updating cache so it has the same memory block in memory
        for(int j = 0; j < 4; j++) {
        	add = Operations.numToStr(tag,14) + Operations.numToStr(j,2);
        	int memAdd = Operations.strToNum(add);     	
        	cache_data[i][j] = memory.load(memAdd);
        }
        
        //Now update the memory and cache in that block that needs writing to
        cache_data[i][block] = data;
    	memory.store(address, data); 
    }
	
}