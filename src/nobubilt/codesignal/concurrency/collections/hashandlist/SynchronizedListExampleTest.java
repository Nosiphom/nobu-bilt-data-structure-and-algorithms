package nobubilt.codesignal.concurrency.collections.hashandlist;
/**
 * Collections.synchronizedList() is used to wrap a List (such as ArrayList)
 *  to make it thread-safe. The synchronized list ensures that all list methods 
 *  are thread-safe, allowing safe access and modification by multiple threads. 
 *  This is particularly useful when multiple threads need to access or 
 *  modify shared data concurrently.

Your task is simple: run the provided code and observe how these common 
list methods work in a synchronized context. The code demonstrates adding, 
removing, and retrieving elements from the synchronized list, showing 
how it manages concurrent operations.
 * 
 *
 */
public class SynchronizedListExampleTest {

	   public static void main(String[] args) throws InterruptedException {
	        SynchronizedListExample example = new SynchronizedListExample();

	        // Thread 1: Add elements to the list
	        Thread t1 = new Thread(example::addElements);

	        // Thread 2: Remove an element from the list
	        Thread t2 = new Thread(example::removeElement);

	        // Thread 3: Get an element and print the list size
	        Thread t3 = new Thread(example::printListInfo);

	        // Add some initial elements
	        example.addElement("Element Alpha");
	        example.addElement("Element Beta");
	        example.addElement("Element Charlie");
	        
	     // TODO: Create a new thread to search for "Element Charlie" and print the result.
	        Thread searchThread = new Thread(()->{
	              System.out.println("Element Charlie exists: " + example.search("Element Charlie"));            
	        });

	        // TODO: Create another thread to remove "Element Beta".
	        Thread removalThread = new Thread(()->{
	             example.removeElement("Element Beta");  
	        });
	        // TODO: Start both threads and join them after completion.
	        searchThread.start();
	        removalThread.start();
	        
	        

	        // Start all threads
	        t1.start();
	        t2.start();
	        t3.start();

	        searchThread.join();
	        removalThread.join();
	        
	        
	        // Wait for all threads to finish
	        t1.join();
	        t2.join();
	        t3.join();

	        // Final list state
	        System.out.println("Final list state: " + example.getList());
	    }
	
/**
 * Thread 2 attempted to remove unexistent: Element 2
Thread 1 added: Element 0
Thread 1 added: Element 1
Thread 1 added: Element 2
Thread 1 added: Element 3
Thread 1 added: Element 4
Final list state: [Element 0, Element 1, Element 2, Element 3, Element 4]
 */
}
