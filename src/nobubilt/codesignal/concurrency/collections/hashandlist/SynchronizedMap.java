package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/**
 * Map Initialization: Using Collections.synchronizedMap() ensures thread-safe 
 * operations on the map. It prevents data corruption when multiple threads read 
 * from or write to the map simultaneously through internal synchronization.

Increment Method: The combined operations of put and get require explicit 
synchronization to prevent race conditions. The synchronized block ensures 
only one thread can execute the increment logic at a time, preserving data integrity.

The Importance of Synchronized Collections
Understanding synchronized collections is crucial for several reasons:
Ensuring Thread Safety: In real-world applications, data is often shared among
 multiple threads, making it essential to maintain data consistency and integrity.

Performance Considerations: While synchronized collections simplify achieving 
thread safety, they can introduce performance bottlenecks due to their locking mechanisms.

Scalability Challenges: As concurrent data access volumes rise, synchronized 
collections may struggle to scale effectively, prompting the need for advanced 
concurrent collections.

Synchronized collections are fundamental to Java’s concurrency model. They 
provide developers with essential tools to write robust multi-threaded 
applications, ensuring safe interaction between threads and maintaining data integrity.


 * 
 *
 */
public class SynchronizedMap {
   private Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());

    public void increment(String key) {
        synchronized (map) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
    }
    
    // TODO: Implement a thread-safe method to update all values in the map by a given increment.
    public void updateAll(int num)
    {
        synchronized(map)
        {
            for(String key : map.keySet())
            {
                map.put(key, map.getOrDefault(key, 0)+ num);
            }
        }
    }

    public Map<String, Integer> getMap() {
        return map;
    }
}
