package nobubilt.codesignal.concurrency.doublechecked.deadlock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class LockFreeQueueUsingAtomicVariables<T> {
    private final AtomicReference<LockFreeNode<T>> head, tail;
    private int maximumSize;
    private AtomicInteger currentSize;
/**
 * We need a head and tail pointer to track the front and back of the queue. Both will be 
 * initialized to point to a dummy node, which simplifies the management of edge cases 
 * (like an empty queue). Both pointers are initialized to a dummy node to simplify 
 * enqueueing and dequeuing operations.
 */
    public LockFreeQueueUsingAtomicVariables(int capacity) {
        LockFreeNode<T> dummy = new LockFreeNode<>(null);
        head = new AtomicReference<>(dummy);
        tail = new AtomicReference<>(dummy);
        this.maximumSize = capacity;
        this.currentSize = new AtomicInteger(0);
    }

    public void enqueue(T value) {
        LockFreeNode<T> newNode = new LockFreeNode<>(value);
        while (true) {
            LockFreeNode<T> last = tail.get();// Get the current tail of the queue
            LockFreeNode<T> next = last.next.get();// Get the next node after the tail.
            //This will be null if the tail is the actual end of the queue.
            
            if(last == tail.get() && currentSize.get() < maximumSize) {
//If next is null, it means the tail is in the correct place, and we can try to append our new node.
                if(next == null) 
                {//Try to link the new node to the tail's next position
                	if (last.next.compareAndSet(null, newNode)) {
                		// Successfully linked the new node
                		// Update tail to point to the new node
                        tail.compareAndSet(last, newNode);
                        currentSize.incrementAndGet();
                        return;
                    }
                } else {// If next is not null, the tail is outdated, so update it. 
//it means another thread already added a node to the queue, so we update the tail and try again.
                    tail.compareAndSet(last, next);
                }
            }
        }
    }

    public T dequeue() {
        while (true) {
        	LockFreeNode<T> first = head.get(); // Get the current head of the queue
        	LockFreeNode<T> last = tail.get();   // Get the current tail of the queue
        	LockFreeNode<T> next = first.next.get(); // Get the next node after the head

            if (first == head.get()) {   // Ensure the head hasn't changed
                if (first == last) {     // Check if the queue is empty
                    if (next == null) {
                        return null; // Queue is empty
                    }
                    // Tail is outdated, try to update it
                    tail.compareAndSet(last, next);
                    currentSize.decrementAndGet();
                } else {
                    T value = next.value; // Get the value to dequeue
                    if (head.compareAndSet(first, next)) {
                    	currentSize.decrementAndGet();
                        return value; // Successfully dequeued
                    }
                }
            }
        }
    }
    
    public T peek()
    {
    	LockFreeNode<T> first = head.get();
    	LockFreeNode<T> next = first.next.get();
    	if(first == head.get())
    	{
    		if(next == null)
    		{
    			return null;
    		}
    		return next.value;
    	}
    	return first.value;
    }
	
}
