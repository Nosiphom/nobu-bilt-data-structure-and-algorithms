package nobubilt.codesignal.concurrency.collections.hashandlist;
/**
 * Synchronized collections are part of Java's approach to provide thread-safe 
 * data structures, enabling safe operations in concurrent applications. 
 * They serve as wrappers around standard collections, like lists and maps, 
 * offering built-in mechanisms to synchronize method access. 
 * This synchronization ensures that only one thread can access the data 
 * structure at a time, preventing issues from concurrent modifications.

Using synchronized collections is crucial in scenarios where multiple 
threads read from and write to the same collection. Without synchronization,
 simultaneous modifications by multiple threads can lead to data inconsistency 
 or corruption. Synchronized collections mitigate these risks by ensuring each 
 operation on the collection is atomic, meaning it completes without interruption.
 * 
 *
 */
public class SynchronizedMapTest {
    public static void main(String[] args) {
        SynchronizedMap map = new SynchronizedMap();
        map.increment("key1");
        map.increment("key2");
        map.increment("key1");
        System.out.println(map.getMap()); // {key1=2, key2=1}
    
        map.updateAll(5);
        System.out.println(map.getMap()); // {key1=7, key2=6}
        
    }
}
