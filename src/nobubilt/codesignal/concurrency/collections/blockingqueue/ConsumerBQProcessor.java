package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;
/**
 * a BlockingQueue acts as a buffer or intermediary for data between the 
 * producers and consumers. The BlockingQueue solves several problems at once:
 * Blocking Operations: Producers can insert elements using put(), and 
 * consumers retrieve elements using take(). These operations block if the queue
 *  is full (for put()) or empty (for take()), ensuring a balanced workflow 
 *  between producers and consumers.

Thread Safety: BlockingQueue is designed for concurrent use, ensuring multiple 
producers and consumers can safely interact without requiring explicit 
synchronization mechanisms like synchronized blocks.

Automatic Synchronization: It internally handles the synchronization necessary 
to allow safe data exchange between producers and consumers, making code 
simpler and avoiding potential concurrency bugs. * 
 * 
 *
 */
public class ConsumerBQProcessor  implements Runnable {
    private final BlockingQueue<String> queue;

    public ConsumerBQProcessor(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = queue.take(); // Blocks if the queue is empty
                if ("DONE".equals(message)) {
                    System.out.println(Thread.currentThread().getName() + " received DONE signal.");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " consumed: " + message);
                Thread.sleep(150); // Simulate processing time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Consumer interrupted.");
        }
    }
}
