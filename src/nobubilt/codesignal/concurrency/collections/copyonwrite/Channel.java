package nobubilt.codesignal.concurrency.collections.copyonwrite;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * Designing a thread-safe messaging system using CopyOnWriteArrayList offers 
 * several important benefits:

Efficiency for Reads: Since the collection optimizes reads, subscribers can 
access messages quickly, even when multiple threads are interacting with the channel.
Simplicity: Using CopyOnWriteArrayList removes the need for explicit locking 
mechanisms, which simplifies the code and avoids potential concurrency issues.
Real-World Use Cases: This design pattern is applicable in many real-world 
systems, such as notification services, real-time messaging platforms, and 
any system where read-heavy operations dominate.
 * 
 *
 */
public class Channel {
  private final List<String> messages = new CopyOnWriteArrayList<>();

    public void postMessage(String message) {
    	   // TODO: Prevent duplicate messages from being added to the list
        if(!messages.contains(message))
        {
            messages.add(message);
            System.out.println(Thread.currentThread().getName() + " posted: " + message);            
        }
    }

    public boolean removeMessage(String message) {
        boolean removed = messages.remove(message);
        if (removed) {
            System.out.println(Thread.currentThread().getName() + " removed: " + message);
        }
        return removed;
    }

    // TODO: Modify this method to return the messages in reverse order
    public List<String> getMessages() {
        List<String> reverseList = new CopyOnWriteArrayList<>(messages);
        
        Collections.reverse(reverseList);
        return reverseList;
    }
    
    // TODO: Implement the clearMessages() method
    public void clearMessages()
    {
        messages.clear();
        System.out.println("All messages cleared as list size: " +messages.size());
    }
}
