package nobubilt.codesignal.concurrency.doublechecked.deadlock;

public class BufferConsumer implements Runnable{
    private final SharedBuffer buffer;
    private final Object lock;

    public BufferConsumer(SharedBuffer buffer, Object lock) {
        this.buffer = buffer;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (lock) {
                    if (buffer.hasConsumedEnough()) {
                        break; // Stop consuming after reaching max items
                    }
                    consume();
                    Thread.sleep(1000); // Simulate time taken to consume an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
/**
 * In the consume() method, the synchronized block ensures that only one thread 
 * (either producer or consumer) can access the buffer at a time. If the buffer is empty, 
 * the consumer waits using lock.wait(). After consuming an item, the consumer calls 
 * lock.notifyAll() to notify the producer that there is now space in the buffer.
 * @throws InterruptedException
 */
    private void consume() throws InterruptedException {
        synchronized (lock) {
            while (buffer.isEmpty()) {
                System.out.println("Queue is empty, consumer is waiting...");
                lock.wait();
            }
            int item = buffer.get();
            System.out.println("Consumed: " + item);
            lock.notifyAll();
        }
    }
}
