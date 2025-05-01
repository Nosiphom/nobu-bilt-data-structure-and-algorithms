package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * implement a LogProcessor using ConcurrentLinkedQueue from scratch. In this task, 
 * you'll write a class that allows multiple threads to add log messages to a queue, 
 * and a separate thread will process and print the logs to the console.

Your goal is to make sure that adding log messages is non-blocking, allowing multiple
 threads to add logs simultaneously. The log processing thread should continuously 
 check the queue and print messages to the console without blocking, ensuring high throughput.
 * 
 *
 */
public class LogProcessorUsingConcurrentLinkedQueue {
	 // TODO: Declare a ConcurrentLinkedQueue to hold log messages
    private Queue<String> queue = new ConcurrentLinkedQueue<>();

    // TODO: Add a volatile boolean field to control the running state
    private volatile boolean state;
    
    public LogProcessorUsingConcurrentLinkedQueue()
    {
        this.state = true;
    }

//Implement addLog(String message) to add log messages to the queue in a thread-safe manner.
    public void addLog(String message)
    {
        queue.add(message);
        System.out.println("Adding message: " + message);
    }

//Implement processLogs() to continuously check the queue and process logs without blocking.
    public void processLogs()
    {
        while(state || !queue.isEmpty())
        {
            System.out.println("Processing: " + queue.poll());
        }
    }

    // TODO: Implement stop() to safely stop the log processing.
    public void stop()
    {
        if(state)
        {
            System.out.println("Stopping the log process with state: " + state);
           state = false;
        }
    }
}
