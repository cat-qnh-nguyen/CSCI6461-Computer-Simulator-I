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
        String addressStr = Helper.numToStr(address,16);      

        tag = Helper.strToNum(addressStr.substring(0,14));
        
        //Using parseInt because these values do not need to be negative
        block = Integer.parseInt(addressStr.substring(14,16),2);

        
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
        	//System.out.println("Cache hit");
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
        	addressStr = Helper.numToStr(tag,14) + Helper.numToStr(j,2);
        	int memAdd = Helper.strToNum(addressStr);
        	
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
        String addressStr = Helper.numToStr(address,16);
        
        tag = Helper.strToNum(addressStr.substring(0,14));
        
        //Using parseInt because these values do not need to be negative
        block = Integer.parseInt(addressStr.substring(14,16),2);
        
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
        	cache_data[i][block] = data;
        	memory.store(address, data);
        	//System.out.println("Write cache hit.");
        }
        else
        {
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
	        	addressStr = Helper.numToStr(tag,14) + Helper.numToStr(j,2);
	        	int memAdd = Helper.strToNum(addressStr);     	
	        	cache_data[i][j] = memory.load(memAdd);
	        }
	        
	        //Now update the memory and cache in that block that needs writing to
	        cache_data[i][block] = data;
	    	memory.store(address, data); 
        }
    }
	
}