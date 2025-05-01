package nobubilt.codesignal.concurrency.doublechecked;

public class SharedResourceAllocatorTest {
	 public static void main(String[] args) {
	        // TODO: Create an instance of SharedResourceAllocator
		 SharedResourceAllocator sharedResourceAllocator = new SharedResourceAllocator();
	        // TODO: Create and start multiple threads to access the shared resource
	        // Each thread should call the accessResource() method and pass its name as a parameter
	        Thread t1 = new Thread(()->{sharedResourceAllocator.accessResource("Alpha");});
	        Thread t2 = new Thread(()->{sharedResourceAllocator.accessResource("Beta");});
	        Thread t3 = new Thread(()->{sharedResourceAllocator.accessResource("Charlie");});
	        // TODO: Use join() to ensure all threads complete before exiting
	        t1.start();
	        t2.start();
	        t3.start();
	        
	        try
	        {
	            t1.join();
	            t2.join();
	            t3.join();
	        }
	        catch(InterruptedException e)
	        {
	            e.printStackTrace();
	        }
	    }
}
