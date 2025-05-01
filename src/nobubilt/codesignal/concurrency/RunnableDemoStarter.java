package nobubilt.codesignal.concurrency;

public class RunnableDemoStarter {

	 public static void main(String[] args) throws InterruptedException {
	        Thread t1 = new Thread(new RunnableDemo("Thread-1"));
	        Thread t2 = new Thread(new RunnableDemo("Thread-2"));

	        // TODO: Print initial states of t1 and t2
	        System.out.println("Initial State of t1: " + t1.getState());
	        System.out.println("Initial State of t2: " + t2.getState());
	        // TODO: Start both threads
	        t1.start();
	        t2.start();
	        // TODO: Implement a loop that iterates several times, 
	        // during which it prints the current state of each thread (t1 and t2) 
	        // using the getState() method. 
	        // Include a short sleep interval within the loop to allow 
	        // for observable state changes.
	        for(int counter =0; counter < 10; counter++)
	        {
	            System.out.println("Current State of t1: " + t1.getState());
	            Thread.sleep(1000);
	           
	            System.out.println("Current State of t2: " + t2.getState());
	        }
	        // TODO: Use join to wait for both threads to finish
	            t1.join();
	           t2.join();
	        // TODO: Print final states of t1 and t2
	           System.out.println("final State of t1: " + t1.getState());
	           System.out.println("final State of t2: " + t2.getState());
	    
	    }
	}
