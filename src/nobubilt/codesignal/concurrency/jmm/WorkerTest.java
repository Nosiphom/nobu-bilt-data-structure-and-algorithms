package nobubilt.codesignal.concurrency.jmm;
/**
 * In this task, you will implement a Worker Thread that can be controlled externally 
 * using a volatile flag. The goal is to demonstrate how the volatile keyword ensures
 *  visibility between threads and allows you to safely signal a thread to stop.

Here's what you'll do:
Add a new volatile boolean variable called shouldStop to signal when the worker 
thread should stop.
Implement a worker thread that continuously prints a message until it reads true 
from the volatile flag.
This example will help you understand how volatile can effectively coordinate actions 
between threads, ensuring all changes are instantly visible across them.
 * 
 *
 */
public class WorkerTest {
    public static void main(String[] args) throws InterruptedException {
    	WorkerController workerController = new WorkerController();
        // TODO: Create a new Thread instance using the Worker class and start it.
        Thread t1 = new Thread(new Worker(workerController), "Thread-Alpha");
        Thread t2 = new Thread(new Worker(workerController), "Thread-Beta");
        Thread t3 = new Thread(new Worker(workerController), "Thread-Charlie");
        t1.start();
        t2.start();
        t3.start();
        // Allow the worker to run for a few seconds
        Thread.sleep(3000);
        // TODO: Use WorkerController.setShouldStop() to signal the worker to stop.
         workerController.setShouldStop(true);
        System.out.println("Signaled worker to stop");

        // TODO: Use join() to ensure the main thread waits for the worker to finish.
         t1.join();
         t2.join();
         t3.join();
    }
}
