package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * enhance the system by modifying the consumer's behavior. Instead of printing 
 * each message immediately after consuming it, the consumer should aggregate 
 * tasks (e.g., counting the total number of messages) and output a summary once 
 * all tasks are processed.

Your task is to write the Consumer class from scratch, which will accumulate the 
number of messages processed and print the final count when all tasks are done.

The provided starter code includes the Producer and Main classes, but the Consumer 
class will be left for you to implement.
 * 
 *
 */
public class CounterProducerConsumerTest {
	  public static void main(String[] args) {
	        // Initialize a LinkedBlockingQueue with a capacity of 5
	        BlockingQueue<String> queue = new LinkedBlockingQueue<>(5);

	        // Create Producer instance
	        ProducerCounter producer = new ProducerCounter(queue, 10);

	        // TODO: Implement the Consumer class to aggregate messages and print a summary
	        ConsumerCounter consumer = new ConsumerCounter(queue);
	        // Initialize Threads
	        Thread producerThread = new Thread(producer, "Producer-Thread");

	        // TODO: Create a thread for the new Consumer class
	        Thread consumerThread = new Thread(consumer, "Consumer-Thread");
	        // Start Threads
	        producerThread.start();
	        consumerThread.start();
	        // TODO: Start the consumer thread

	        // Wait for Threads to Finish
	        try {
	            producerThread.join();
	            consumerThread.join();
	            // TODO: Ensure the consumer thread finishes
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            System.err.println("Main thread interrupted.");
	        }

	        System.out.println("Producer-Consumer execution completed.");
	    }
	
}
