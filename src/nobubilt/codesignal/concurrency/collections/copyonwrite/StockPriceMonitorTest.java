package nobubilt.codesignal.concurrency.collections.copyonwrite;
/**
 * implementing a real-time stock price monitoring system. Your job is to create a 
 * StockPriceMonitor class that allows multiple threads to update and view live 
 * stock prices concurrently.

Make sure to use the CopyOnWriteArrayList to handle live stock data updates 
efficiently and safely, allowing multiple threads to post and read prices
 without needing explicit locks.
 * 
 *
 */
public class StockPriceMonitorTest {
	 public static void main(String[] args) throws InterruptedException {
	        StockPriceMonitor stockMonitor = new StockPriceMonitor();

	        Thread updaterThread1 = new Thread(()-> {
	            stockMonitor.updatePrice("TSLA: $50");
	            stockMonitor.updatePrice("GOC: $20");
	            stockMonitor.updatePrice("VIN: $100");
	            stockMonitor.updatePrice("UCL: $80");
	        });
	            Thread updaterThread2 = new Thread(()-> {
	            stockMonitor.updatePrice("GOOGL: $500");
	            stockMonitor.updatePrice("JPMC: $120");
	            stockMonitor.updatePrice("AMX: $1000");
	            stockMonitor.updatePrice("CAP: $800");
	        });
	        // TODO: Create and start two updater threads, each updating different stock prices
	        // Use stockMonitor.updatePrice() within each thread
	        // Ensure threads have unique names like "Updater1", "Updater2"
	            updaterThread1.start();
	            updaterThread2.start();
	            
	             updaterThread1.join();
	            updaterThread2.join();
	            
	            System.out.println("All stocks in stock monitor:");
	            Thread readerThread = new Thread(()->{
	                 stockMonitor.getPrices().forEach(rec -> System.out.println(rec));                
	            });

	        // TODO: Create and start a reader thread to print all current stock prices
	        // Use stockMonitor.getPrices() in the reader thread
	        readerThread.start();
	        readerThread.join();
	        // TODO: Use join() to ensure the right execution order for thread operations
	    }
	
}
