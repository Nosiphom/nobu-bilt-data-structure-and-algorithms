package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.util.concurrent.ConcurrentHashMap;
/**
 * The ConcurrentHashMap is initialized to provide a high-performance map for 
 * thread-safe operations. Unlike traditional synchronized maps, ConcurrentHashMap 
 * allows concurrent reads and updates without locking the entire map, 
 * improving scalability.

The incrementCount method safely increments the count for a given key using 
the merge method, which ensures atomic updates by handling concurrency internally:

If the key does not exist, it initializes the value to 1.
If the key already exists, it retrieves the current value and applies 
Integer::sum, adding 1 to it.
This update occurs in a single atomic operation, preventing lost updates when 
multiple threads modify the same key.
Thread-safe reads and writes are guaranteed in ConcurrentHashMap. It allows 
multiple threads to read and write simultaneously without blocking, unlike 
traditional synchronized maps. Updates to individual keys do not require 
locking the entire map, which ensures better performance and scalability, 
especially in highly concurrent environments.

The Importance of Concurrent Collections
Transitioning to concurrent collections is significant for several reasons:
Performance Efficiency: By reducing the need for locks and enabling multiple 
access points, concurrent collections minimize performance bottlenecks.

Enhanced Scalability: These collections scale better under high concurrency, 
making them ideal for real-world applications involving numerous threads.

Simplified Code: With built-in thread safety, concurrent collections reduce 
the complexity of code by eliminating the need for explicit synchronization in many scenarios.

Concurrent collections are invaluable tools for building robust software systems,
 ensuring that applications remain efficient even as workloads and concurrency 
 levels increase. They empower you to write performant, scalable multi-threaded 
 programs without the need for extensive synchronization, streamlining the 
 development process in modern software engineering.



 * 
 *
 */
public class ConcurrentMapExample {
	   private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

	    public void incrementCount(String key) {
	        map.merge(key, 1, Integer::sum);
	    }
/**
 * While ConcurrentHashMap is thread-safe, the current implementation manually 
 * increments a value using getOrDefault followed by put. This approach can cause 
 * lost updates when multiple threads try to update the same key concurrently.
map.put(key, map.getOrDefault(key, 0)+1) leads to missed updates. So merge works better.
Your task is to modify the incrementCount method to prevent race conditions and 
ensure that no updates are lost when multiple threads are incrementing the count at the same time.
*/

	    public void displayMap() {
	        map.forEach((key, count) -> System.out.println(key + ": " + count));
	    }

// TODO: Implement a method called 'removeKey' that safely removes an element 
//from the map based on its key.
// Use the map's remove() method to ensure thread-safe removal.

	    public void removeKey(String key)
	    {
	        map.remove(key);
	    }

}
