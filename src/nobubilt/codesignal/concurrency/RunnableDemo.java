package nobubilt.codesignal.concurrency;

public class RunnableDemo implements Runnable {
    private String threadName;

    public RunnableDemo(String name) {
        threadName = name;
    }

    // TODO: Implement the run() method:
    // - Print a message indicating the start of thread execution.
    // - Simulate some work by using Thread.sleep().
    // - Print a message indicating the end of thread execution.
    public void run() {
        try
        {
            // TODO: Add code here to simulate some work, e.g., using Thread.sleep()
            System.out.println("start of thread execution: " + threadName);
            Thread.sleep(2000);
            System.out.println("end of thread execution: " + threadName);
        }
        catch(InterruptedException e)
        {
            System.out.println("interrupted thread execution: "+ threadName);
        }
        
    }
}