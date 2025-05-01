package nobubilt.codesignal.concurrency.doublechecked;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceAllocator {

	  // TODO: Create a ReentrantLock instance to manage the shared resource
    private final Lock lock = new ReentrantLock();
    public void accessResource(String threadName) {
        // TODO: Acquire the lock to manage access to the shared resource
        lock.lock();
        try {
            // TODO: Print a message indicating that the thread has acquired the lock
            System.out.println(threadName + " thread has acquired the lock");
            // Simulate resource usage
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            // TODO: Print a message indicating that the thread is releasing the lock
            System.out.println(threadName + " thread releasing the lock");
        } finally {
            // TODO: Release the lock after accessing the resource
            lock.unlock();
        }
    }
}
