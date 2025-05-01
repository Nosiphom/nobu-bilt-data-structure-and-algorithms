package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerCounter implements Runnable {
    private final BlockingQueue<String> queue;
    // TODO: Add a variable to count the messages
    private int counter;
    public ConsumerCounter(BlockingQueue<String> queue) {
        this.queue = queue;
        this.counter = 0;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // TODO: Take messages from the queue
                  String msg = queue.take();
                  if(msg.equals("DONE"))
                  {
                    break;
                  }
                // TODO: Check for the "DONE" signal and break the loop if received
                ++counter;
                Thread.sleep(100);
                // TODO: Increment the message count

                // TODO: Simulate processing time with Thread.sleep()
            }
            System.out.println("Final count of messages: " + counter);
            // TODO: Output the final count of messages
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Consumer interrupted.");
        }
    }
}
