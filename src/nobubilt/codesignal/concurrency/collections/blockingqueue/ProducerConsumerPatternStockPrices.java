package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * You will create a system where the Producer class generates stock price 
 * updates at random intervals and the Consumer class processes these updates. 
 * The updates should include stock symbols and their new prices, with both 
 * components interacting through a LinkedBlockingQueue.
 * 
 *
 */
public class ProducerConsumerPatternStockPrices {
	  public static void main(String[] args) throws InterruptedException {
	        // TODO: Implement the main method to run the Producer-Consumer system
	        // - Initialize LinkedBlockingQueue with a specified capacity
	        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
	        
	        ProducerStockPrices producer = new ProducerStockPrices(queue, 20);
	        ConsumerStockPrices consumer = new ConsumerStockPrices(queue);
	        
	        Thread consumerThread = new Thread(consumer, "Consumer");
	        Thread producerThread = new Thread(producer, "Producer");
	        
	        producerThread.start();
	        consumerThread.start();
	        
	        producerThread.join();
	        consumerThread.join();
	        // - Create Producer and Consumer instances
	        // - Start and join the threads to ensure proper execution
	    }
	
}
