package nobubilt.codesignal.concurrency.doublechecked;

public class ThreadSafeServerTransfer {
	 private final int id;
	    private int dataStorage;

	    // TODO:Implement the constructor to set id and dataStorage
	    public ThreadSafeServerTransfer(int id, int storage)
	    {
	        this.id = id;
	        this.dataStorage = storage;
	    }
	    // TODO: Implement getId method to return the server ID
	    public int getId()
	    {
	        return id;
	    }
	    
	    public int getDataStorage()
	    {
	        return dataStorage;
	    }
	    // TODO: Implement addData method to add data to the server
	    public void addData(int storage)
	    {
	        dataStorage += storage;
	    }
	    // TODO: Implement removeData method to remove data from the server, ensuring data is available
	    public boolean removeData(int storage)
	    {
	        if(dataStorage > storage)
	        {
	            dataStorage -= storage;
	            return true;
	        }
	        return false;
	    }
	    public static void transferData(ThreadSafeServerTransfer from, ThreadSafeServerTransfer to, int amount)
	    {
	    	ThreadSafeServerTransfer first = from.id < to.id ? from : to;
	    	ThreadSafeServerTransfer second = from.id < to.id ? to : from;
	        synchronized(first)
	        {
	            try
	            {
	                Thread.sleep(100);
	            }catch(InterruptedException e){e.printStackTrace();}
	            synchronized(second)
	            {
	                if(first.removeData(amount))
	                {
	                    second.addData(amount);
	                    System.out.println("Successfully transfered data from server "+ from.id + " to server " + to.id);
	                }
	                else
	                {
	                    System.out.println("Unsuccesful data transfer from server "+ from.id);
	                }
	            }
	        }
	    }

	    // TODO: Implement the transferData method to transfer data between two servers in a thread-safe manner
	
}
