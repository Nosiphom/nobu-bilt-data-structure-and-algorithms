package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityConsumer implements Runnable{

	 private final PriorityBlockingQueue<PriorityTask> queue;

	    public PriorityConsumer(PriorityBlockingQueue<PriorityTask> queue) {
	        this.queue = queue;
	    }

	    @Override
	    public void run() {
	        try {
	            while (true) {
	                // TODO: Retrieve the task from the queue
	            	PriorityTask task = queue.take();
	                if(task.getContent().equals("DONE"))
	                {
	                    break;
	                }
	                // TODO: Check for the "DONE" signal task to break the loop
	                System.out.println(Thread.currentThread().getName() + " consumed: Task");
	                Thread.sleep(150); // Simulate processing time
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            System.err.println("Consumer interrupted.");
	        }
	    }
	}
