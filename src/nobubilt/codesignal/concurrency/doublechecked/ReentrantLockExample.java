package nobubilt.codesignal.concurrency.doublechecked;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Using ReentrantLock as an Alternate Solution
Java also provides a more advanced locking mechanism with the ReentrantLock class, 
part of the java.util.concurrent.locks package. Unlike the synchronized keyword, 
ReentrantLock offers greater flexibility, such as the ability to try acquiring a 
lock without blocking forever or to interrupt a thread waiting for a lock.
 * 
 * To illustrate the flexibility and control provided by ReentrantLock, here’s an 
 * example of managing locks explicitly in a multi-threaded context
 * 
 * In this example, we use ReentrantLock instead of synchronized to explicitly 
 * control the locking process.

Acquiring the Lock: The lock() method acquires the lock for the current thread, 
preventing others from entering the critical section.
Releasing the Lock: The unlock() method releases the lock, allowing other threads 
to acquire it.
Consistent Lock Order: We still acquire lock1 before lock2, ensuring that 
deadlocks do not occur.

Importance of Deadlock Prevention
Deadlocks are dangerous because they can cause a program to halt without throwing 
an error, making them challenging to debug and fix. Proper use of locks and 
advanced mechanisms like ReentrantLock can help prevent these issues.

Key points to remember:

Avoid Deadlocks: Use consistent lock ordering and advanced locking techniques 
to prevent deadlocks.
Better Control with Locks: Using ReentrantLock provides more control, including 
interruptibility and the ability to try acquiring locks.
Efficient Resource Management: Proper use of locks ensures that threads do not 
get stuck indefinitely, allowing for better resource utilization.
 * 
 *
 */

public class ReentrantLockExample {

	    private final Lock lock1 = new ReentrantLock();
	    private final Lock lock2 = new ReentrantLock();

	    public void methodOne() {
	        lock1.lock();
	        try {
	            System.out.println("Thread 1 acquired lock1");
	            try { Thread.sleep(50); } catch (InterruptedException e) {}

	            lock2.lock();
	            try {
	                System.out.println("Thread 1 acquired lock2");
	            } finally {
	                lock2.unlock();
	            }
	        } finally {
	            lock1.unlock();
	        }
	    }

	    public void methodTwo() {
	        lock1.lock(); // Consistent lock order
	        try {
	            System.out.println("Thread 2 acquired lock1");
	            try { Thread.sleep(50); } catch (InterruptedException e) {}

	            lock2.lock();
	            try {
	                System.out.println("Thread 2 acquired lock2");
	            } finally {
	                lock2.unlock();
	            }
	        } finally {
	            lock1.unlock();
	        }
	    }
	    
	    /**
	     * One additional benefit of ReentrantLock is its tryLock() method. 
	     * This method attempts to acquire the lock without blocking the thread 
	     * indefinitely. If the lock is not available, the thread can perform 
	     * other tasks rather than waiting:
	     
	     *The tryLock() method is useful in situations where a thread should 
	     *avoid waiting indefinitely for a lock. If the lock is available, the 
	     *thread acquires it and proceeds; otherwise, it skips the critical 
	     *section or takes an alternate action.
	     */
	    public void methodThree()
	    {
	    	if (lock1.tryLock()) {
	    	    try {
	    	        // Critical section
	    	    } finally {
	    	        lock1.unlock();
	    	    }
	    	} else {
	    	    System.out.println("Could not acquire lock1");
	    	}
	    }
	
}
