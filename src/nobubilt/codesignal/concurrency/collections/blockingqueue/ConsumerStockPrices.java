package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerStockPrices implements Runnable {
    private final BlockingQueue<String> queue;

    public ConsumerStockPrices(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // TODO: Implement the logic to retrieve and process updates from the queue
        // - Wait for updates and process them
        // - Break the loop upon receiving the "DONE" signal
        try
        {
            while(true)
            {
                String stockPrice = queue.take();
                if(stockPrice.equals("DONE"))
                {
                    break;
                }
                System.out.println("Stock Price: " + stockPrice);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    
}