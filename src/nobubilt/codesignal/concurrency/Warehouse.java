package nobubilt.codesignal.concurrency;

public class Warehouse {
/**
 * 
Imagine we have a class representing a warehouse inventory. In this task, your goal is to add a
 new synchronized method to the Warehouse class that modifies multiple shared variables 
 representing inventory counts. This method should safely update both the stock count and the 
 total value of items, ensuring that only one thread can access these critical sections at any time.

Here's what you need to do:
Add a new method to safely update the itemCount and totalValue in the Warehouse class.
Add a new method to safely return the totalValue.
Make sure all of the methods are using a synchronized block 
(instead of synchronizing the whole method) to ensure that only the critical sections of code 
that modify or access shared variables are synchronized, allowing for more fine-grained control 
over the synchronization and potentially increasing performance.

This task will give you practical experience in synchronizing complex operations involving 
multiple shared variables.
 */
	    private int itemCount = 0;
	    private int totalValue = 0;

	    // Existing method to add items to inventory
	    public synchronized void addItem(int value) {
	        itemCount++;
	        totalValue += value;
	    }
	    /**
	     * 
Locks are mechanisms used to synchronize access to shared resources in multi-threaded programs. 
When a thread acquires a lock, it prevents other threads from accessing the locked resource 
until it is released. The synchronized keyword is Java’s built-in mechanism for managing these 
intrinsic locks.
Types of Locks in Java:
Object Locks (synchronized(this) or synchronized(someObject)): These are associated with an 
individual instance of an object. Only one thread can execute any synchronized method of that 
instance at a time. synchronized(this), where the current instance of the class serves as 
the monitor object or lock. This is a type of intrinsic lock, meaning that every object in 
Java has an implicit lock. 
Class Locks (synchronized(ClassName.class)): These are used to lock at the class level, 
preventing multiple threads from executing static synchronized methods simultaneously.

Using locks correctly can help manage access to shared resources, but it also comes with the 
risk of deadlocks if not used properly.
	
A deadlock occurs when two or more threads are blocked forever, each waiting for a resource 
that another thread holds. This creates a situation where no thread can proceed, leading to 
a halt in the program.

// TODO: Add a new method `updateInventory` that takes two arguments, `items` (int) and 
//	    `valuePerItem` (int).
// Use a synchronized block to ensure only one thread can modify `itemCount` and `totalValue`
	    at a time.
// The method should update `itemCount` by adding the `items` and update `totalValue` by 
 * adding `items * valuePerItem`.
 */
	    public void updateInventory(int items, int valuePerItem)
	    {
	        synchronized(this)
	        {
	            itemCount += items;
	            totalValue += (items * valuePerItem);
	        }
	    }

	    public int getItemCount() {
	        synchronized (this) {
	            return itemCount;
	        }
	    }

	    // TODO: Add a synchronized block to safely return the total value
	    public int getTotalValue()
	    {
	        synchronized(this)
	        {
	            return totalValue;
	        }
	    }
	}
