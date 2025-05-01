package nobubilt.codesignal.concurrency.collections.skiplist;
import java.util.concurrent.*;
public class ConcurrentSkipListMapExample {
	/**
	 * Unlike ConcurrentHashMap, the ConcurrentSkipListMap maintains a sorted order of the keys, 
	 * allowing you to see how elements are stored and displayed when multiple threads are 
	 * updating the map concurrently.
	 */
	 // TODO: Change the map implementation to use ConcurrentSkipListMap instead of ConcurrentHashMap
    private ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();

    public void incrementCount(String key) {
        map.merge(key, 1, Integer::sum);
    }

    public void displayMap() {
        map.forEach((key, count) -> System.out.println(key + ": " + count));
    }
}

