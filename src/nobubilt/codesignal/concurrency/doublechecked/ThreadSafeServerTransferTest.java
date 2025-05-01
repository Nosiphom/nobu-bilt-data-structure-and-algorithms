package nobubilt.codesignal.concurrency.doublechecked;

public class ThreadSafeServerTransferTest {
/**
 * Your task is to implement a thread-safe system for transferring data between servers. You will be creating a Server class with methods to manage data storage and perform transfers securely using synchronized blocks. Ensure that your implementation prevents concurrency issues, such as data corruption when multiple threads are active.


 * @param args
 */
	  public static void main(String[] args) {
	        // TODO: Initialize two Server objects with IDs and initial data storage amounts
		  ThreadSafeServerTransfer server1 = new ThreadSafeServerTransfer(1, 100);
		  ThreadSafeServerTransfer server2 = new ThreadSafeServerTransfer(2, 100);
	        // TODO: Create two threads to simulate data transfers between the servers concurrently
	        Thread t1 = new Thread(()-> {
	            for(int inx = 0; inx < 5; inx++)
	            {
	            	ThreadSafeServerTransfer.transferData(server1, server2, 10);
	            }
	        });
	         Thread t2 = new Thread(()-> {
	            for(int inx = 0; inx < 5; inx++)
	            {
	            	ThreadSafeServerTransfer.transferData(server2, server1, 10);
	            }
	        });
	        
	        t1.start();
	        t2.start();
	        
	        try
	        {
	            t1.join();
	            t2.join();
	        }catch(InterruptedException e){e.printStackTrace();}
	        
	        System.out.println("Final storage on server 1 " + server1.getDataStorage());
	        System.out.println("Final storage on server 2 " + server2.getDataStorage());
	        // TODO: Start both threads to perform the data transfers
	    }
	}