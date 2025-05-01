package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * The ConcurrentLinkedQueue is a non-blocking, thread-safe queue that works well for 
 * scenarios where you don’t want threads to wait when accessing the queue. It allows multiple 
 * threads to add and remove elements simultaneously without locking.
 * 
 *
 */
public class ConcurrentTaskQueue {

	 private Queue<String> taskQueue = new ConcurrentLinkedQueue<>();

	    public void addTask(String task) {
	   // a non-blocking queue, the method returns immediately, allowing multiple 
	   //threads to add tasks concurrently.
	        taskQueue.add(task); // Adds task to the non-blocking concurrent queue
	        System.out.println("Task added: " + task);
	    }

	    public void executeTasks() {
	        while (!taskQueue.isEmpty()) {
	  //retrieves and removes the head of the queue, and the operation completes 
	     //immediately even if the queue is empty, unlike take() in the blocking queue.
	            String task = taskQueue.poll(); // Retrieves and removes the head of the queue
	            System.out.println("Executing: " + task);
	        }
	    }
	}
