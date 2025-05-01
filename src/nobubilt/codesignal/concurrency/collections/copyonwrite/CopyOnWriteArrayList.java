package nobubilt.codesignal.concurrency.collections.copyonwrite;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * The design of the CopyOnWriteArrayList ensures thread safety without requiring 
 * synchronization. Each time a method like add() or remove() is called, the 
 * current content of the list is copied into a new array. This ensures read 
 * consistency because readers use the old array, while modifications are done 
 * on the new one.

This approach is ideal for situations that are read-heavy with only 
occasional writes or updates.
 * Removing Elements During Iteration
While CopyOnWriteArrayList allows you to add elements safely during iteration, 
removing elements during iteration will throw an UnsupportedOperationException.

public void sendNewsletter(String message) {
    for (String subscriber : subscribers) {
        System.out.println("Sending message to " + subscriber);
        subscribers.remove(subscriber); // This will throw UnsupportedOperationException
    }
}
In this code, trying to remove an element from the list during iteration will 
result in an UnsupportedOperationException. This happens because the CopyOnWriteArrayList 
disallows modifications (like removing elements) during iteration to prevent 
unexpected behavior. The iterator holds a snapshot of the list at the time of its 
creation, and modifying that snapshot directly isn't supported.

Why CopyOnWrite Collections Matter
Understanding CopyOnWrite collections will help you write efficient and safe 
concurrent programs. Here’s why they’re important:

Thread Safety without Synchronization: By copying data for write operations, 
CopyOnWriteArrayList ensures thread safety without the need for locks, simplifying 
multi-threaded code.

Ideal for Read-Heavy Workloads: These collections are optimized for environments 
where reads far outnumber writes, making them perfect for maintaining subscriber 
lists or configuration settings.

Cleaner Concurrent Code: CopyOnWrite collections eliminate the need for manual 
synchronization, leading to cleaner and more maintainable code.

In conclusion, CopyOnWrite collections provide a simple yet powerful way to manage
 shared data in read-heavy, multi-threaded environments. 
 * 
 * 
 *
 */
public class CopyOnWriteArrayList {
	  private List<String> subscribers = new CopyOnWriteArrayList<>();
	    
	    public void addSubscriber(String subscriber) {
	        subscribers.add(subscriber);
	    }
	    
	    public void removeSubscriber(String subscriber) {
	        subscribers.remove(subscriber);
	    }
	    
	    public void sendNewsletter(String message) {
	        // Create an iterator to traverse the current subscribers
	        Iterator<String> iterator = subscribers.iterator();
	        
	        while (iterator.hasNext()) {
	            String subscriber = iterator.next();
	            System.out.println("Sending message to " + subscriber);
	            // Simulate sending a message
	        }
	    }
	
}
