package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class ProducerStockPrices implements Runnable {
    private final BlockingQueue<String> queue;
    private final String[] stockSymbols = {"AAPL", "GOOGL", "MSFT", "AMZN", "TSLA"};
    private final int updateCount;

    public ProducerStockPrices(BlockingQueue<String> queue, int updateCount) {
        this.queue = queue;
        this.updateCount = updateCount;
    }

    @Override
    public void run() {
        // TODO: Implement the logic to generate stock price updates with random intervals
        // - Use stockSymbols array and generate random prices
        // - Place the updates into the queue
        // - Send a "DONE" signal at the end
        try
        {
            for(int inx = 0; inx < updateCount; inx++)
            {
                int symbolInx = ThreadLocalRandom.current().nextInt(0, stockSymbols.length);
                String symbol = stockSymbols[symbolInx];
                int price = ThreadLocalRandom.current().nextInt(200, 1000);
                String stockPrice = symbol + " : "+price;
                queue.put(stockPrice);
                Thread.sleep(ThreadLocalRandom.current().nextInt(50, 201));
            }
            queue.put("DONE");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}