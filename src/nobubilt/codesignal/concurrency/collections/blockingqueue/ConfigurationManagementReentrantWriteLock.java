package nobubilt.codesignal.concurrency.collections.blockingqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/**
 * Understanding ReentrantReadWriteLock
Before we dive into the implementation, let’s take a closer look at ReentrantReadWriteLock.

ReentrantReadWriteLock is a specialized lock that provides two types of locks:
Read Lock: Multiple threads can hold the read lock simultaneously. This allows for 
concurrent reads without blocking each other, enhancing performance when reading data frequently.

Write Lock: Only one thread can hold the write lock at a time. This ensures that no other 
thread can read or write to the data while the write lock is held, preserving data integrity 
during modifications.

Unlike a simple ReentrantLock, which provides a single lock for both reading and writing,
 ReentrantReadWriteLock distinguishes between read and write operations. This allows for 
greater concurrency in read-heavy systems while still ensuring exclusive access when writing data.

The general behavior of ReentrantReadWriteLock is as follows:

Read Lock: Can be held by multiple threads as long as no thread holds the write lock.
Write Lock: Can be held by only one thread at a time, and no threads can hold the read lock 
while the write lock is active.
This dual-lock mechanism helps achieve an optimal balance between performance and safety 
in applications where reading occurs frequently, but writing happens occasionally.
 * 
 *
 */
public class ConfigurationManagementReentrantWriteLock {

    private final Map<String, String> config = new HashMap<>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void setProperty(String key, String value) {
        lock.writeLock().lock();
        try {
            config.put(key, value);
            System.out.println("Set " + key + " = " + value);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public String getProperty(String key) {
        lock.readLock().lock();
        try {
    // TODO: Modify this line to return a default value "UNKNOWN" if key is not found
            if(!config.containsKey(key))
            {
                return "UNKNOWN";
            }
            return config.get(key);
        } finally {
            lock.readLock().unlock();
        }
    }
}
