package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * Implementing the Producer-Consumer pattern with BlockingQueue is essential for:

Efficient Task Management: The producer-consumer pattern helps manage workloads 
efficiently by balancing the production and consumption of tasks, ensuring that one part 
of the system does not overwhelm the other.

Simplified Synchronization: BlockingQueue eliminates the need for explicit locks or 
complex synchronization, making your code cleaner and easier to maintain.

Real-World Applications: This pattern is widely used in real-world systems, from task 
scheduling and job queues to streaming data and request processing.

Understanding how to implement and manage a producer-consumer system using BlockingQueue
 equips you with the tools needed to build scalable, efficient, and thread-safe applications.


 * 
 *
 */
public class ProducerConsumerBQtest {
	  public static void main(String[] args) {
	        // Initialize a LinkedBlockingQueue with a capacity of 5
	        BlockingQueue<String> queue = new LinkedBlockingQueue<>(5);

	        // Create Producer and Consumer instances
	        ProducerBQProcessor producer = new ProducerBQProcessor(queue, 10);
	        ConsumerBQProcessor consumer = new ConsumerBQProcessor(queue);

	        // Initialize Threads
	        Thread producerThread = new Thread(producer, "Producer-Thread");
	        Thread consumerThread = new Thread(consumer, "Consumer-Thread");

	        // Start Threads
	        producerThread.start();
	        consumerThread.start();

	        // Wait for Threads to Finish
	        try {
	            producerThread.join();
	            consumerThread.join();
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            System.err.println("Main thread interrupted.");
	        }

	        System.out.println("Producer-Consumer execution completed.");
	    }
	
}
