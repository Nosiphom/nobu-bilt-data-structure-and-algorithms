package nobubilt.codesignal.concurrency.doublechecked.atomic;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * Atomic operations are indivisible operations, meaning they happen entirely at once, 
 * without any other thread intervening in the middle.

A fundamental mechanism behind atomic operations is Compare-And-Swap (CAS). CAS is an 
atomic instruction that operates directly at the hardware level to ensure that updates 
happen only if the value has not changed since it was last read. 
Here's how CAS works conceptually:

M: The memory location to be updated.
A: The expected value.
B: The new value.
The CAS operation updates the value in M to B, but only if the existing value in M 
matches A. If the values do not match, no update occurs. This ensures that the 
operation is atomic, as no other thread can modify the value between the time it's 
read and updated.

CAS forms the backbone of Java's atomic variables, allowing them to update shared 
variables in a thread-safe manner without the use of explicit locks.
 * 
 * Atomic variables are part of the java.util.concurrent.atomic package. They 
 * support lock-free, thread-safe operations on single variables. These classes 
 * use CAS internally to perform operations without requiring explicit locks, 
 * making them highly efficient for concurrent programming.

Commonly Used Atomic Variables:

AtomicInteger: Handles integer values atomically.
AtomicLong: Similar to AtomicInteger, but for long values.
AtomicBoolean: For atomic updates to boolean values.
AtomicReference<T>: For handling atomic updates to object references.

 * 
 * Atomic Integer: We define a class AtomicCounter that contains an instance of 
 * AtomicInteger. This variable, atomicCount, acts as the counter we'll manage in 
 * a thread-safe manner.
Atomic Increment: The atomicIncrement() method uses incrementAndGet(), which 
atomically increments the current value by one and returns the updated value. 
This operation is atomic, meaning it's done in a single step without interference 
from other threads.
Get Count: The getAtomicCount() method returns the current count value.

 * 
 *
 */
public class AtomicCounter {

	 private AtomicInteger atomicCount = new AtomicInteger(0);

	    public void atomicIncrement() {
	        atomicCount.incrementAndGet();
	    }

	    public int getAtomicCount() {
	        return atomicCount.get();
	    }
	    
	    // TODO: Add a method to decrement the counter safely using atomic operations
	    public void autoDecrement()
	    {
	        atomicCount.decrementAndGet();
	    }

	    // TODO: Add a method to reset the counter to zero using atomic operations
	    public void reset()
	    {
	        atomicCount.set(0);
	    }
	}
