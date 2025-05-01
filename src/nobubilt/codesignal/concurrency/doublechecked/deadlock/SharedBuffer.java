package nobubilt.codesignal.concurrency.doublechecked.deadlock;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
	  private final Queue<Integer> queue;
	    private final int capacity;
	    private final int maxItems;
	    private int producedCount = 0; // Track produced items
	    private int consumedCount = 0; // Track consumed items

	    public SharedBuffer(int capacity, int maxItems) {
	        this.queue = new LinkedList<>();
	        this.capacity = capacity;
	        this.maxItems = maxItems;
	    }

	    public void put(int item) {
	        queue.offer(item);
	        producedCount++;
	    }

	    public int get() {
	        consumedCount++;
	        return queue.poll();
	    }

	    public boolean isFull() {
	        return queue.size() == capacity;
	    }

	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }

	    public boolean hasProducedEnough() {
	        return producedCount >= maxItems;
	    }

	    public boolean hasConsumedEnough() {
	        return consumedCount >= maxItems;
	    }
	
}
