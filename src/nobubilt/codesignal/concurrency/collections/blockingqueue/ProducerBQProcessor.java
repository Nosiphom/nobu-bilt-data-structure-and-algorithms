package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class ProducerBQProcessor implements Runnable {
    private final BlockingQueue<String> queue;
    private final int messageCount;

    public ProducerBQProcessor(BlockingQueue<String> queue, int messageCount) {
        this.queue = queue;
        this.messageCount = messageCount;
    }
/**
 * the producer class takes a BlockingQueue and the number of messages it should 
 * generate. By using the put() method, the producer ensures that it won’t 
 * overload the queue, as the method blocks if the queue is full. This helps 
 * maintain a balance between production and consumption rates. The use of 
 * Thread.sleep(100) simulates the time taken to produce each message.
 */
    @Override
    public void run() {
        try {
            for (int i = 1; i <= messageCount; i++) {
                String message = "Message " + i;
                queue.put(message); // Blocks if the queue is full
                System.out.println(Thread.currentThread().getName() + " produced: " + message);
                Thread.sleep(100); // Simulate production time
            }
            // Indicate end of production
            queue.put("DONE");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Producer interrupted.");
        }
    }
}