package nobubilt.codesignal.concurrency.doublechecked.deadlock;

import java.util.concurrent.atomic.AtomicInteger;

public class DiningPhilosopher implements Runnable {
    private final Object leftFork;
    private final Object rightFork;
    private final int id;
    private AtomicInteger eatingCounter;
    
    public DiningPhilosopher(int id, Object leftFork, Object rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.eatingCounter = new AtomicInteger(0);
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking");
        Thread.sleep((long) (Math.random() * 100));
    }

    private void eat() throws InterruptedException {
        System.out.println("Philosopher " + id + " is eating");
        Thread.sleep((long) (Math.random() * 100));
        eatingCounter.incrementAndGet();
    }
    public int getEatingCounter()
    {
        return eatingCounter.get();
    }
/**
 * We introduce a strategy where each philosopher first decides which fork 
 * to pick up by comparing the identity hash codes of the forks.
If the left fork has a higher hash code than the right fork, the philosopher 
will pick up the right fork first instead. This ensures that forks are always 
picked up in the same order, preventing deadlock.
This simple ordering guarantees that philosophers can never create a circular 
wait, which is the condition that leads to deadlock. By picking up forks in a 
consistent order, we ensure that all philosophers will eventually be able to 
eat without getting stuck.

 * 
 */
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                // Philosopher starts thinking
                think();
                
                // Determine the order of picking up forks to avoid deadlock
                Object firstFork = leftFork;
                Object secondFork = rightFork;
                if (System.identityHashCode(leftFork) > System.identityHashCode(rightFork)) {
                    firstFork = rightFork;
                    secondFork = leftFork;
                }
                
                // Philosopher picks up the first fork
                synchronized (firstFork) {
                    System.out.println("Philosopher " + id + " picked up the first fork");
                    
                    // Philosopher picks up the second fork
                    synchronized (secondFork) {
                        System.out.println("Philosopher " + id + " picked up the second fork");
                        
                        // Philosopher starts eating
                        eat();
                        
                        // Philosopher puts down the second fork
                        System.out.println("Philosopher " + id + " put down the second fork");
                    }
                    
                    // Philosopher puts down the first fork
                    System.out.println("Philosopher " + id + " put down the first fork");
                }
                
                // Back to thinking
                System.out.println("Philosopher " + id + " goes back to thinking");
            }
        } catch (InterruptedException e) {
            System.out.println("Philosopher " + id + " was interrupted and is stopping.");
            Thread.currentThread().interrupt(); // Restore the interrupt status.
        }
    }
}
