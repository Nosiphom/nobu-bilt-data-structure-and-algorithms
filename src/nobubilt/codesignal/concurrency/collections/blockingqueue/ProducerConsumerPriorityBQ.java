package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.PriorityBlockingQueue;

public class ProducerConsumerPriorityBQ {
	  public static void main(String[] args) throws InterruptedException{
	        // TODO: Initialize a PriorityBlockingQueue
	        PriorityBlockingQueue<PriorityTask> priorityQueue = new PriorityBlockingQueue<>();
	        
	        PriorityProducer producer = new PriorityProducer(priorityQueue, 10);
	        PriorityConsumer consumer = new PriorityConsumer(priorityQueue);

	        Thread producerThread = new Thread(producer, "Producer");        
	        Thread consumerThread = new Thread(consumer, "Consumer");

	        producerThread.start();
	        consumerThread.start();
	        // TODO: Create Producer and Consumer instances
	        producerThread.join();
	        consumerThread.join();
	        // TODO: Initialize threads for Producer and Consumer

	        // TODO: Start the threads

	        // TODO: Wait for the threads to finish using join
	    }
}
