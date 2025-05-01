package nobubilt.codesignal.concurrency.collections.hashandlist;
/**
 * In earlier lessons, we focused on synchronized collections, which guarantee thread 
 * safety by using locks to control access. While effective for ensuring safe access,
 *  synchronized collections can slow down performance under heavy load due to their 
 *  reliance on locking the entire collection.

Concurrent collections, like ConcurrentHashMap, solve this issue by enabling concurrent 
reads and writes without locking the entire collection. This results in much better 
performance under high contention and offers a more scalable solution for 
multi-threaded applications.
 * 
 */
public class ConcurrentMapExampleTest {

	  public static void main(String[] args) throws InterruptedException {
	        ConcurrentMapExample map = new ConcurrentMapExample();

	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) {
	                map.incrementCount("apple");
	            }
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) {
	                map.incrementCount("banana");
	            }
	        });

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        // TODO: Safely remove "banana" from the map after threads have completed their updates.
	        map.removeKey("banana");
	        map.displayMap();
	    }
	}
