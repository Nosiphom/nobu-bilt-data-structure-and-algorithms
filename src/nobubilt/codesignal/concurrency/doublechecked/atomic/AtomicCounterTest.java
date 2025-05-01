package nobubilt.codesignal.concurrency.doublechecked.atomic;
/**
 * We create an instance of AtomicCounter and two threads (t1 and t2), each invoking the 
 * atomicIncrement() method 1000 times.
The threads are started, and we use join() to wait for both threads to finish execution.
The program then prints the final count using getAtomicCount(). Since AtomicInteger handles
 synchronization internally using CAS, we do not require explicit locks.
This example demonstrates how atomic variables can simplify concurrency management, making your 
code easier to read and reducing the risk of errors.
 * 
 *
 */
public class AtomicCounterTest {
	 public static void main(String[] args) throws InterruptedException {
		 AtomicCounter counter = new AtomicCounter();

	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) counter.atomicIncrement();
	        });
	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) counter.atomicIncrement();
	        });

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        // The expected output should be 2000, since both threads increment the count by 1000.
	     // Output: Final atomic count: 2000
	        System.out.println("Final atomic count: " + counter.getAtomicCount()); 
	   
	     // TODO: Demonstrate the use of the new decrement method
	        Thread t3 = new Thread(() -> {
	            for (int i = 0; i < 10; i++) counter.autoDecrement();
	        });
	        t3.start();
	        t3.join();
	        System.out.println("Final atomic count after decrementing: " + counter.getAtomicCount());
	        // TODO: Demonstrate the use of the new reset method
	        counter.reset();
	        
	        System.out.println("Final atomic count after reset: " + counter.getAtomicCount());
	    
	 
	 }
}
