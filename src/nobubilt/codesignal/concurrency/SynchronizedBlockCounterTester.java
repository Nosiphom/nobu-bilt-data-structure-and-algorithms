package nobubilt.codesignal.concurrency;

public class SynchronizedBlockCounterTester {
	/**
	 * We create an instance of SynchronizedBlockCounter to be accessed by 
	 * multiple threads. Two threads (t1 and t2) increment the counter concurrently.
Using synchronized(this), only the critical sections (count++) are synchronized,
 ensuring efficient use of locks. After starting both threads, we use join() to make 
 sure the main thread waits until both have completed before printing the final count.
The expected output is 2000, as each thread increments the counter 1000 times. Using 
synchronized blocks ensures that there is no data inconsistency due to race conditions.
	 *
	 *Importance of Synchronized Blocks
Synchronized blocks are essential in managing concurrent threads effectively:

Fine-Grained Synchronization: Synchronized blocks provide more precise control over 
synchronization, locking only necessary sections of code.
Reduced Contention: Only critical sections are synchronized, which means other parts of 
the method can still run concurrently.
Flexible Locking: You can use different monitor objects, not just this, to control 
synchronization at a more precise level.
By understanding synchronized blocks, you will be better equipped to write more efficient 
and scalable multithreaded Java applications. This is particularly important for 
real-world applications where optimizing resource usage and ensuring thread safety are both critical.
	 */
 public static void main(String[] args) throws InterruptedException {
        SynchronizedBlockCounter counter = new SynchronizedBlockCounter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count with synchronized block: " + counter.getCount());
    }
}
