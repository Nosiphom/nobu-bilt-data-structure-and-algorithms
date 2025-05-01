package nobubilt.codesignal.concurrency.doublechecked.deadlock;
/**
 * A deadlock occurs when two or more threads are blocked forever, each waiting for a 
 * resource that another thread holds. This creates a situation where no thread can 
 * proceed, leading to a halt in the program. Essentially, it’s like two people who 
 * are each holding a key to a door that the other person needs—they're both stuck, 
 * waiting for the other to act.

Causes of Deadlocks:

Deadlocks happen because of four main conditions, which can occur simultaneously:

Mutual Exclusion: Resources involved are non-shareable, meaning only one thread 
can access the resource at a time.
Hold and Wait: A thread holds at least one resource and waits for additional 
resources held by other threads.
No Preemption: Resources cannot be forcibly taken away from a thread; they can 
only be released voluntarily.
Circular Wait: A closed chain of threads exists, where each thread holds a 
resource that the next thread needs, forming a cycle.
When these four conditions exist, the system ends up in a deadlock state, 
where threads cannot continue to execute.

In this example, there are two locks (lock1 and lock2). Thread 1 acquires lock1 
first and then tries to acquire lock2. At the same time, Thread 2 acquires lock2 
first and then tries to acquire lock1. This creates a circular dependency:

Thread 1: Holds lock1 and waits for lock2.
Thread 2: Holds lock2 and waits for lock1.
Since both threads are waiting for each other to release the resources they need,
 neither can proceed, resulting in a deadlock.

This example helps illustrate how easy it is for deadlocks to occur when multiple 
threads are acquiring multiple locks in inconsistent orders.

 * 
 *
 */
public class DeadLockExample {
	 private final Object lock1 = new Object();
	 private final Object lock2 = new Object();

    public void methodOne() {
        synchronized (lock1) {
            System.out.println("Thread 1 acquired lock1");
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            synchronized (lock2) {
                System.out.println("Thread 1 acquired lock2");
            }
        }
    }
    /// this creates a deadlock coz u access lock2 before lock1.
    public void methodTwo() {
        synchronized (lock2) {
            System.out.println("Thread 2 acquired lock2");
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            synchronized (lock1) {
                System.out.println("Thread 2 acquired lock1");
            }
        }
    }
	    
/**
 * Preventing Deadlocks by Reordering Locks
One effective way to prevent deadlocks is to always acquire locks in a 
consistent order. By ensuring that all threads acquire locks in the same order, 
you can eliminate the circular waiting condition that leads to deadlocks.

Here’s how we can modify the previous example to avoid deadlock:	    
 
 In this version:

Both methodOne and methodTwo acquire lock1 first, then lock2.
By using a consistent lock order, we eliminate the possibility of circular waiting.
This change prevents a deadlock from occurring because the threads are now acquiring 
locks in a predetermined order, avoiding the conflicting dependencies.
 public void methodTwo() {
    synchronized (lock1) { // Changed lock order to be consistent with methodOne
        System.out.println("Thread 2 acquired lock1");
        try { Thread.sleep(50); } catch (InterruptedException e) {}
        synchronized (lock2) {
            System.out.println("Thread 2 acquired lock2");
        }
    }
}
 *
 */
}
