package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * A Blocking Queue, such as LinkedBlockingQueue, is a queue that controls thread execution 
 * by blocking operations when certain conditions are met. A thread attempting to remove an 
 * element from an empty queue will block until an element is available. Similarly, if the 
 * queue has a fixed capacity, a thread trying to add an element to a full queue will block 
 * until space becomes available. This behavior ensures efficient task management without 
 * overwhelming system resources.
 * 
 * 
 * This example highlights how LinkedBlockingQueue prevents excessive task production and 
 * enforces controlled task execution, making it ideal for managing workload distribution 
 * in multi-threaded environments.
 *
 */
public class TaskQueue {
	// Queue with a fixed capacity of 2
	   private BlockingQueue<String> taskQueue = new LinkedBlockingQueue<>(2); 

	    public void addTask(String task) throws InterruptedException {
//If the queue is full, the thread blocks until space is available, preventing task overflow.
	    	taskQueue.put(task); // Blocks if the queue is full
	        System.out.println("Task added: " + task);
	    }

	    public void executeTasks() throws InterruptedException {
	        while (!taskQueue.isEmpty()) {
//retrieve and execute tasks. If the queue is empty, it blocks until a task is available,
	        	// efficient resource utilization.
  	
	            String task = taskQueue.take(); // Blocks if the queue is empty
	            System.out.println("Executing: " + task);
	        }
	    }
	    
	 // TODO: Implement cancelTask(String task) to safely remove a task from the queue
	    // Ensure that task removal is thread-safe and that it can only cancel tasks 
	    //that haven't been executed yet.
	    public void cancelTask(String task) 
	    {
	        if(taskQueue.remove(task))
	        {
	            System.out.println("Task removed: " + task);    
	            return;        
	        }
	        System.out.println("Failed to remove task: " + task);
	    }
}

