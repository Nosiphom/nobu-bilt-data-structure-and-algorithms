package nobubilt.codesignal.concurrency;

public class SynchronizedBlockCounter {
/**
 * Using Synchronized Blocks: A Practical Example
Synchronized blocks allow you to specify which object acts as the "monitor" or "lock."
 In the example below, "this" is used as the monitor, meaning the current instance of 
 the class is locked while executing the critical section. This ensures that only one 
 thread at a time can execute the synchronized block on a given instance.

 *the increment method synchronizes only the critical section where the shared variable 
 *count is updated, instead of locking the entire method. This can improve performance 
 *when other parts of the method do not require synchronization.

The this keyword is used to indicate that the current instance serves as the monitor. 
Before a thread can enter the synchronized block, it must acquire the lock on the instance. 
By using a synchronized block, we ensure that updates to count are made safely, while 
allowing other parts of the class to remain unsynchronized, thus improving efficiency.

Similarly, the getCount method uses a synchronized block to protect access to count, 
ensuring it reads a consistent value without risking partially updated data.
 */
    private int count = 0;

    public void increment() {
        synchronized (this) { // Synchronize only the critical section using this as the monitor
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }

}
