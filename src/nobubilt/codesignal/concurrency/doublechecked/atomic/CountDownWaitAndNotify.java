package nobubilt.codesignal.concurrency.doublechecked.atomic;
/**
 * Understanding Thread Coordination with wait() and notify()
Thread coordination involves managing the execution order of threads, 
ensuring that they wait for specific conditions before continuing their work. 
The wait() and notify() methods allow threads to communicate with each other 
and synchronize their actions.

In this example, we’ll use a countdown mechanism to coordinate two threads: 
one that waits for the countdown to finish, and another that performs the countdown 
and notifies the waiting thread when it’s complete.

In the Countdown class, we manage a boolean flag isReady to coordinate two actions: 
waiting for a countdown and performing the countdown. The wait() method causes the 
waiting thread to pause until the countdown completes, while notify() alerts the 
waiting thread that it can now proceed.

The wait() method makes the thread release the lock on the object and pauses its 
execution until another thread calls notify() or notifyAll(). In this case, 
the waitForCountdown() method uses wait() to make the thread wait while the 
countdown is ongoing.

The notify() method wakes up a single waiting thread. It signals that the countdown
 is complete, allowing the waiting thread to proceed with its task. 
In the startCountdown() method, notify() is called after the countdown has finished, 
allowing the waiting thread to resume execution.

By using a boolean flag (isReady), we ensure that the thread only proceeds after the
 countdown is finished. This mechanism, using wait() and notify(), is essential for 
 coordinating thread actions without wasting resources by having threads check 
 for a condition in a loop.

Both the waitForCountdown() and startCountdown() methods throw InterruptedException
 because wait() and Thread.sleep() can be interrupted by other threads. Handling this 
 exception ensures that if the thread is interrupted while waiting or sleeping, it can 
 react appropriately by restoring the interrupted state or performing necessary cleanup.
 * 
 *
 */
public class CountDownWaitAndNotify {
    private boolean isReady = false;

    public synchronized void waitForCountdown() throws InterruptedException {
        while (!isReady) {
            System.out.println("Waiting for countdown...");
            wait();
        }
        System.out.println("Countdown complete! Proceeding...");
    }

    public synchronized void startCountdown() throws InterruptedException {
        System.out.println("Countdown started...");
        Thread.sleep(2000); // Simulate countdown time
        isReady = true;
        notify();
        System.out.println("Countdown finished! Notified waiting thread.");
    }
	
}
