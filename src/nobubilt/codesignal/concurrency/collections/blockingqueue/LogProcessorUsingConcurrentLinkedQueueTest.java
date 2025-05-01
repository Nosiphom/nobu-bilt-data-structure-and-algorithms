package nobubilt.codesignal.concurrency.collections.blockingqueue;

public class LogProcessorUsingConcurrentLinkedQueueTest {

	  public static void main(String[] args) throws InterruptedException {
		  LogProcessorUsingConcurrentLinkedQueue logProcessor = 
				  new LogProcessorUsingConcurrentLinkedQueue();

	        // TODO: Start the log processing thread.
	        new Thread(()-> {
	            logProcessor.processLogs();
	        }).start();
        
	        Thread t1 = new Thread(()-> {
	            logProcessor.addLog("Summer rain");
	           logProcessor.addLog("Winter blues");
	           logProcessor.addLog("Grand dance");
	           logProcessor.addLog("Virgo moon");
	           logProcessor.addLog("Bring it on"); 
	        });
	        
	           Thread t2 = new Thread(()-> {
	            logProcessor.addLog("So we pray");
	           logProcessor.addLog("Living");
	           logProcessor.addLog("Pink");
	           logProcessor.addLog("Black");
	           logProcessor.addLog("Round"); 
	        });
	        
	        t1.start();
	        t2.start();
	        
	        t1.join();
	        t2.join();
	        
	        logProcessor.stop();
	        // TODO: Simulate multiple threads adding log messages.
	        
	        // TODO: Join the threads and stop log processing after logs are processed.
	    }
	}
