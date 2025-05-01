package nobubilt.codesignal.concurrency.collections.copyonwrite;

public class ChannelTest {
	 public static void main(String[] args) throws InterruptedException {
	        Channel channel = new Channel();

	        // Publisher thread
	        Thread publisher = new Thread(() -> {
	            channel.postMessage("Welcome!");
	            channel.postMessage("Today's topic is Java Concurrency.");
	            channel.postMessage("Welcome!");// Attempting to post a duplicate message
	        }, "Publisher");
	        

	        // Subscriber 1 thread
	        Thread subscriber1 = new Thread(() -> {
	            for (String message : channel.getMessages()) {
	                System.out.println("Subscriber1 reads: " + message);
	            }
	        }, "Subscriber1");

	        // Subscriber 2 thread
	        Thread subscriber2 = new Thread(() -> {
	            for (String message : channel.getMessages()) {
	                System.out.println("Subscriber2 reads: " + message);
	            }
	        }, "Subscriber2");

	        // Start publisher thread
	        publisher.start();
	        publisher.join();  // Ensure the publisher posts the messages first

	        // Start subscriber threads
	        subscriber1.start();
	        subscriber2.start();

	        subscriber1.join();
	        subscriber2.join();
	        
	     // TODO: Add functionality to clear all messages
	        channel.clearMessages();
	    }
	
}
