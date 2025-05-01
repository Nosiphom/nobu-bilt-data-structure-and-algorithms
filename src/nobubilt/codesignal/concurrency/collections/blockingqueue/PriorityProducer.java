package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityProducer implements Runnable {
    private final PriorityBlockingQueue<PriorityTask> queue;
    private final int messageCount;

    public PriorityProducer(PriorityBlockingQueue<PriorityTask> queue, int messageCount) {
        this.queue = queue;
        this.messageCount = messageCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= messageCount; i++) {
                // TODO: Create a Task object with varying priorities
            	PriorityTask task = new PriorityTask("message"+ i, i);
                queue.put(task);
                // TODO: Insert task into the queue
                System.out.println(Thread.currentThread().getName() + " produced: Task " + i);
                Thread.sleep(100); // Simulate production time
            }
            PriorityTask doneTask = new PriorityTask("DONE", 100);
            {
                queue.add(doneTask);
            }
            // TODO: Insert a special "DONE" task to signal completion
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Producer interrupted.");
        }
    }
}