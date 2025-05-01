package nobubilt.codesignal.concurrency.collections.copyonwrite;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StockPriceMonitor {
	   private final List<String> stockPrices = new CopyOnWriteArrayList<>();

	    // TODO: Implement the updatePrice method to allow adding new stock prices
	    // Use stockPrices.add() and print the thread's name and the price added
	    public void updatePrice(String price)
	    {
	        stockPrices.add(price);
	        System.out.println(Thread.currentThread().getName()+ " added stock price: " + price);
	    }
	    public boolean removePrice(String price)
	    {
	        if(stockPrices.remove(price))
	        {
	            System.out.println(Thread.currentThread().getName()+ " removed stock price: " + price);
	            return true;
	        }
	        System.out.println(Thread.currentThread().getName()+ " failed to remove stock price: " + price);
	        return false;
	    }
	    public List<String> getPrices()
	    {
	        return stockPrices;
	    }

	    // TODO: Implement the removePrice method to safely remove a stock price
	    // Return true if removed, print the thread's name and the price removed

	    // TODO: Implement the getPrices method to return a copy of the current prices
	    // Use new CopyOnWriteArrayList<>(stockPrices) for concurrency safety
	}
