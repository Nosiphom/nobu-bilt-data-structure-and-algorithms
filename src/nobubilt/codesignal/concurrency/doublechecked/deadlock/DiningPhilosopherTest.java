package nobubilt.codesignal.concurrency.doublechecked.deadlock;
/**
 * You've studied the Dining Philosophers problem and learned how synchronization prevents 
 * deadlocks. Now, it's time to see it in action with a Java simulation.

In this practice, philosophers alternate between thinking and eating, sharing limited forks. 
The Philosopher.java class manages each philosopher’s behavior, using synchronized blocks to 
control access to forks, preventing deadlocks by ensuring philosophers pick up forks in a 
specific order.

The Main.java class initializes philosophers and forks, starting each philosopher in a 
separate thread. In this version, the program will run for 5 seconds before all threads 
are interrupted and stopped. This prevents the simulation from running indefinitely, giving 
you a controlled way to observe the behavior.

Run the program to see how philosophers take turns eating without encountering deadlocks.
 * 
 *
 */
public class DiningPhilosopherTest {

    public static void main(String[] args) throws InterruptedException {
        int numPhilosophers = 5;
        DiningPhilosopher[] philosophers = new DiningPhilosopher[numPhilosophers];
        Object[] forks = new Object[numPhilosophers];
        Thread[] threads = new Thread[numPhilosophers];

        // Initialize forks
        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Object();
        }

        // Initialize philosophers and start threads
        for (int i = 0; i < numPhilosophers; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % numPhilosophers];
         // Philosopher IDs from 1 to 5
            philosophers[i] = new DiningPhilosopher(i + 1, leftFork, rightFork); 
         // Adjust thread names as well
            threads[i] = new Thread(philosophers[i], "Philosopher " + (i + 1)); 
            threads[i].start();
        }

        // Let the philosophers run for a while (e.g., 2 seconds)
        Thread.sleep(2000);

        // Interrupt all philosopher threads to stop them
        for (Thread thread : threads) {
            thread.interrupt();
        }

        // Wait for all philosopher threads to finish
        for (Thread thread : threads) {
            thread.join();
        }
        
        // TODO: Print the meal count report after the simulation ends
        for(DiningPhilosopher philosopher : philosophers )
        {
        System.out.println("meal count "  + philosopher.getEatingCounter());            
        }


        System.out.println("All philosophers have finished.");
    }
}
