package nobubilt.codesignal.concurrency.jmm;

public class Worker implements Runnable {
    
    private WorkerController workerController;
    public Worker(WorkerController wc)
    {
        this.workerController = wc;
    }
    @Override
    public void run() {
        // TODO: Continuously print "Worker is running..." until shouldStop is true.
        // Use WorkerController.getShouldStop() to check the flag.
        // The below try-catch block should be inside the new while loop
        try {
            while(!workerController.getShouldStop())
            {
                System.out.println(Thread.currentThread().getName() +  " - Worker is running...");
                Thread.sleep(500); // Simulate some work
            }  
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() +  " - Worker has stopped.");
    }
}
