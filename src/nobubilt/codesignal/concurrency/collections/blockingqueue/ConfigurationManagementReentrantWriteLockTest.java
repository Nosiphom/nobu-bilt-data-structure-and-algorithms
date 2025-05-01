package nobubilt.codesignal.concurrency.collections.blockingqueue;
/**
 * Today, we'll build on that foundation with the concept of thread-safe management 
 * of configurations using ReentrantReadWriteLock.

In multi-threaded systems, it's common for configurations to be read frequently and 
updated occasionally. To optimize performance, we can allow multiple threads to read 
configurations concurrently while ensuring that only one thread can write (update) 
at a time. This is where ReentrantReadWriteLock comes in.
 * 
 *
 */
public class ConfigurationManagementReentrantWriteLockTest {

	  public static void main(String[] args) throws InterruptedException {
		  ConfigurationManagementReentrantWriteLock configManager = 
				  new ConfigurationManagementReentrantWriteLock();

	        Thread writer = new Thread(() -> {
	            configManager.setProperty("URL", "http://example.com");
	            configManager.setProperty("Timeout", "5000");
	        });

	        Thread reader1 = new Thread(() -> {
	            String url = configManager.getProperty("URL");
	            System.out.println("Reader1 read URL: " + url);
	        });

	        Thread reader2 = new Thread(() -> {
	            String timeout = configManager.getProperty("Timeout");
	            System.out.println("Reader2 read Timeout: " + timeout);
	        });

	        Thread reader3 = new Thread(() -> {
	            // Added an extra reader to check for a non-existing key
	            String mode = configManager.getProperty("Mode");
	            System.out.println("Reader3 read Mode: " + mode);
	        });

	        writer.start();
	        writer.join();

	        reader1.start();
	        reader2.start();
	        reader3.start();

	        reader1.join();
	        reader2.join();
	        reader3.join();
	    }
	}
