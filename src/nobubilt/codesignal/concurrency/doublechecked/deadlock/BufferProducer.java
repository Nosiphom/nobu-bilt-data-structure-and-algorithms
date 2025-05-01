package nobubilt.codesignal.concurrency.doublechecked.deadlock;

public class BufferProducer implements Runnable {
	  private final SharedBuffer buffer;
	    private final Object lock;
	    private int value = 0;

	    public BufferProducer(SharedBuffer buffer, Object lock) {
	        this.buffer = buffer;
	        this.lock = lock;
	    }

	    @Override
	    public void run() {
	        while (true) {
	            try {
	                synchronized (lock) {
	                    if (buffer.hasProducedEnough()) {
	                        break; // Stop producing after reaching max items
	                    }
	                    produce(value++);
	                    Thread.sleep(500); // Simulate time taken to produce an item
	                }
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	                break;
	            }
	        }
	    }
/**
 * Inside this method, a synchronized block ensures that only one thread 
 * (either producer or consumer) can access the buffer at a time. If the buffer is full, 
 * the producer waits using lock.wait(). Once an item is successfully added to the buffer, 
 * the producer calls lock.notifyAll() to signal the consumer that an item is available.
 * @param i
 * @throws InterruptedException
 */
	    private void produce(int i) throws InterruptedException {
	        synchronized (lock) {
	            while (buffer.isFull()) {
	                System.out.println("Queue is full, producer is waiting...");
	                lock.wait();
	            }
	            buffer.put(i);
	            System.out.println("Produced: " + i);
	            lock.notifyAll();
	        }
	    }
}
