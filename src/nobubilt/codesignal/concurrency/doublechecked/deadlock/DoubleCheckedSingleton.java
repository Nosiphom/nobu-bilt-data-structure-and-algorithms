package nobubilt.codesignal.concurrency.doublechecked.deadlock;
/**
 * Double-Checked Locking involves several key elements:

The volatile declaration ensures that the instance variable is always read from main 
memory. This prevents issues like partially constructed objects becoming visible to 
other threads, which can happen if the JVM reorders instructions.
The first check (if (instance == null)) happens without synchronization. This means
 that once the Singleton is created, accessing it will be very efficient since no 
 locking is required. The synchronized block only comes into play when instance is 
 null, ensuring that only one thread can create the Singleton instance.
The second check (if (instance == null)) within the synchronized block is crucial. 
This is to ensure that if multiple threads reach the synchronized block at the same time, 
only one will actually create the instance.

Double-Checked Locking optimizes performance by minimizing the use of synchronization, 
which is only needed during the initial instance creation.
 * 
 *
 */
public class DoubleCheckedSingleton {

	 private static volatile DoubleCheckedSingleton instance;

	    private DoubleCheckedSingleton() {
	        // Initialization code
	    }

	    public static DoubleCheckedSingleton getInstance() {
	        if (instance == null) { // First check without synchronization
	            synchronized (DoubleCheckedSingleton.class) { // Synchronized block
	                if (instance == null) { // Second check with synchronization
	                    instance = new DoubleCheckedSingleton(); // Create the instance
	                }
	            }
	        }
	        return instance;
	    }
	}
