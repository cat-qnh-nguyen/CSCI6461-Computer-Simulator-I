public class Cache {
    /**
    * Class to implement Cache memory
    */
	
	//Creating an Instance to ensure only one memory object is created
	private static Cache INSTANCE = new Cache();
	
	
	/*Singleton function to access the cache class
	public static Cache getInstance() {
		if(INSTANCE == null)
			INSTANCE = new Cache(2048);
		return INSTANCE;
	}*/


    /**
     * Loads the instruction from the cache
     *
     * @param key of the instruction is the address from which the instruction is to be fetched from the cache
     * @return is the value at the given key in the cache
     */

    String loadFromCache(String key) {
        long startTime = System.nanoTime();
        String value = "";
        if (cache.containsKey(key)) 
        {
            value = cache.get(key);
        } 
        else //key does not exists
        {
            if (cache.size()==16) {
                String temp = cache.entrySet().iterator().next().getKey();
                cache.remove(temp);
            }
            value = loadFromMemeory(key);
            cache.put(key,value);
            //System.out.println("Size of cache----->"+cache.size());
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken to load from Cache: "+(endTime - startTime) + " ns");
        return value;
    }

    /**
     * Stores the instruction into the cache
     *
     * @param key,value specifies the address and the instruction to be stored in the cache
     */
    void storeToCache(String key, String value) {

        long startTime = System.nanoTime();
        if (cache.size()==16) {
            String temp = cache.entrySet().iterator().next().getKey();
            cache.remove(temp);
        }

        cache.put(key,value);
        long endTime = System.nanoTime();
        System.out.println("Time taken to store to Cache: "+(endTime - startTime) + " ns");
        //System.out.println("Size of cache in store----->"+cache.size());
    }

	
	
}