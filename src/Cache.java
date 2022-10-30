public class Cache {
    /**
    * Class to implement Cache memory
    */
	
	//Creating an Instance to ensure only one memory object is created
	private static Cache INSTANCE = new Cache();
   
    public static int[] cache_tag = new int [16];
    public static int[] cache_valid = new int [16];
    public static int[][] cache_data = new int [16][4]; 
    public static int tag;
    public static int block;
    public static int cache_pointer=0;

    
    public static int LoadCache(int address)
    {   
        //Check for space in cache, and if foun full, we reset the pointer to 0 thereby implementing a FIFO
        if(cache_pointer == 16)
        {
            cache_pointer = 0;
        }

        //Exteracting the data from memory
        String add=Operations.numToStr(address);
        tag=Operations.strToNum(add.substring(0,14));
        block=Operations.strToNum(add.substring(14,16));
        //Search for the existence of tag in the cache 
        for(int i=0; i<16; i++)
        {    
            //If tag is found and has a valid ID
            if((cache_tag[i] == tag)&&(cache_valid==1))
            {    
                // return the data bit
                return cache_data[i][block]
            }  

            //if tag is found and does not have a valid ID
            else if((cache_tag[i] == tag)&&(cache_valid==0))
            {
                //retrieve the data and update the valid bit value
                cache_valid[i]=1;
                cache_data[i][block]=memory.load(address);
                return cache_data[i][block]
            }

            //If tag is not found in the cache at all
            else
            {
                //Store the tag in cache
                cache_tag[cache_pointer]=tag;
                cache_valid[cache_pointer]=1;
                for(i=0;i<4;i++)
                {
                    int data_address;
                    data_address=Operations.strToNum(tag + Operations.numToStr(i));
                    cache_data[cache_pointer][i]=memory.load(data_address);
                }
                cache_pointer++;
                return cache_data[cache_pointer][block];
            }
        }       
    }    

    public static int WriteCache(int address,int data)
    {
        //Check for space in cache, and if founf full, we reset the pointer to 0 thereby implementing a FIFO
        if(cache_pointer==16)
        {
            cache_pointer=0;
        }

        //Exteracting the data from memory
        String add=Operations.numToStr(address);
        tag=Operations.strToNum(add.substring(0,14));
        block=Operations.strToNum(add.substring(14,16));

        //Store the tag in cache
        cache_tag[cache_pointer]=tag;
        cache_valid[cache_pointer]=1;
        for(i=0;i<4;i++)
        {
            int data_address;
            data_address=Operations.strToNum(tag + Operations.numToStr(i));
            cache_data[cache_pointer][i]=memory.load(data_address);
        }
        cache_pointer++;
    }
	
	
}