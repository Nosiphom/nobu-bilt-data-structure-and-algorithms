package nobubilt.codesignal.concurrency.doublechecked.atomic;
/**
 * Two threads are created: one that waits (waiter) and one that performs 
 * the countdown (notifier). A short delay (Thread.sleep(1000)) ensures that the 
 * waiter starts before the countdown begins, ensuring correct order of execution.
The join() method is used to ensure both threads finish before the program terminates, 
ensuring a clean and controlled shutdown.
 * 
 * Thread waiter starts first and immediately calls the waitForCountdown() method. 
 * Since isReady is false, the wait() method is called, causing the thread to wait.
After a brief delay of 1 second, thread notifier starts and calls the startCountdown()
 method. It simulates a countdown by sleeping for 2 seconds, then sets isReady to true 
 and calls notify() to wake the waiting thread.
Once the waiting thread is notified, it resumes, completing its task and printing 
"Countdown complete! Proceeding...".
This setup demonstrates the power of thread coordination using wait() and notify(). 
The waiting thread only proceeds when it is signaled, ensuring proper synchronization 
between the two threads.
 * 
 * expected:
 * Waiting for countdown...
Countdown started...
Countdown finished! Notified waiting thread.
Countdown complete! Proceeding...
 * 
 * 
 * Why It Matters
Understanding and using wait() and notify() is essential for managing inter-thread 
communication in multithreaded programs. These methods help you control the execution 
flow of threads, ensuring that threads wait for necessary conditions before proceeding.

Here’s why these concepts are important:

Efficient Communication: wait() and notify() allow threads to communicate efficiently, 
reducing CPU usage by avoiding busy-waiting or continuous polling.
Prevention of Resource Contention: By coordinating thread actions, we prevent race conditions 
and resource conflicts, ensuring that shared resources are used efficiently and safely.
Improved System Performance: Proper synchronization improves the overall performance of
 your application, reducing the chances of deadlock, race conditions, or bottlenecks.
Mastering thread coordination techniques like these enables you to develop robust, 
high-performance, and scalable multithreaded applications.
 * 
 *
 */
public class CountDownWaitAndNotifyTest {
	public static void main(String[] args) throws InterruptedException {
		CountDownWaitAndNotify countdown = new CountDownWaitAndNotify();

        // Thread that waits for the countdown
        Thread waiter = new Thread(() -> {
            try {
                countdown.waitForCountdown();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Thread that performs the countdown
        Thread notifier = new Thread(() -> {
            try {
                countdown.startCountdown();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        waiter.start();
        Thread.sleep(1000); // Ensure the waiting thread starts first
        notifier.start();

        waiter.join();
        notifier.join();
    }
}
