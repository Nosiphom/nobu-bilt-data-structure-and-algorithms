package nobubilt.codesignal.concurrency.doublechecked.deadlock;

public class DeadLockPreventionTrafficSignalController {
/**
 * The northBound thread simulates vehicles crossing from north to south. It 
 * continuously calls the crossNorthSouth method, simulating vehicles crossing 
 * one by one with a brief pause between crossings (Thread.sleep(200)).
 * @param args
 * @throws InterruptedException
 */
    public static void main(String[] args) throws InterruptedException {
        Intersection intersection = new Intersection();

        // Create the northBound thread
        Thread northBound = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    intersection.crossNorthSouth("Car North");
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                // Exit the loop if interrupted
                System.out.println("North-South traffic stopped.");
                Thread.currentThread().interrupt();
            }
        });

        // Create the eastBound thread
        Thread eastBound = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    intersection.crossEastWest("Car East");
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                // Exit the loop if interrupted
                System.out.println("East-West traffic stopped.");
                Thread.currentThread().interrupt();
            }
        });

        // Start both threads
        northBound.start();
        eastBound.start();

        // Let the simulation run for 5 seconds
        Thread.sleep(5000);

        // Interrupt both threads to stop the simulation
        northBound.interrupt();
        eastBound.interrupt();

        // Wait for both threads to finish execution
        northBound.join();
        eastBound.join();

        System.out.println("Simulation stopped after 10 seconds.");
    }
}
