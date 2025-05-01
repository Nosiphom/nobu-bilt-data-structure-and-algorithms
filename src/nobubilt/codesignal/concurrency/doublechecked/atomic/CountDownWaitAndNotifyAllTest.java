package nobubilt.codesignal.concurrency.doublechecked.atomic;
/**
 * In this task, we’ll use notifyAll() to wake up all waiting threads instead of just one. 
 * While notify() wakes up only a single thread that is waiting on an object's monitor, 
 * notifyAll() ensures that every thread waiting on the monitor is notified and 
 * allowed to proceed. This ensures that no thread is left behind when the countdown completes.

This exercise will help you practice using notifyAll() to handle multiple 
waiting threads efficiently.

 * 
 *
 */
public class CountDownWaitAndNotifyAllTest {
	public static void main(String[] args) throws InterruptedException {
		CountDownWaitAndNotify countdown = new CountDownWaitAndNotify();

		 // Thread that waits for the countdown
        Thread waiter1 = new Thread(() -> {
            try {
                countdown.waitForCountdown();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Waiter1");

        // TODO: Add two more threads similar to waiter1 below and name them appropriately
        Thread waiter2 = new Thread(()->{
            try
            {
                countdown.waitForCountdown();
            }
            catch(InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }, "Waiter 2");
        Thread waiter3 = new Thread(()->{
            try
            {
                countdown.waitForCountdown();
            }
            catch(InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }, "Waiter 3");

        // Thread that performs the countdown
        Thread notifier = new Thread(() -> {
            try {
                countdown.startCountdown();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        waiter1.start();
        // TODO: Start the additional waiter threads here
        waiter2.start();
        waiter3.start();
        Thread.sleep(1000); // Ensure the waiting threads start first
        notifier.start();

        waiter1.join();
        waiter2.join();
        waiter3.join();
        // TODO: Join the additional waiter threads here
        notifier.join();
    }
}