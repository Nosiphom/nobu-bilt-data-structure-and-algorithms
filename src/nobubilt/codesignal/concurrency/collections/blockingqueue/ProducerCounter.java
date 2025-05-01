package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class ProducerCounter implements Runnable {
    private final BlockingQueue<String> queue;
    private final int messageCount;

    public ProducerCounter(BlockingQueue<String> queue, int messageCount) {
        this.queue = queue;
        this.messageCount = messageCount;
    }

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
