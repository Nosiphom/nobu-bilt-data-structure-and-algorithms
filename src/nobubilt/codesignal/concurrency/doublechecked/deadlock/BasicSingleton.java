package nobubilt.codesignal.concurrency.doublechecked.deadlock;
/**
 * The Singleton pattern ensures that only one instance of a class is created 
 * throughout the lifecycle of an application. It is useful in managing shared resources 
 * like database connections or configuration settings.
This implementation uses the synchronized keyword to ensure that the getInstance() method 
is thread-safe. This works well to maintain only one instance, but it comes with a drawback:
Each time getInstance() is called, it has to acquire a lock even when the instance is 
already created. This leads to unnecessary synchronization, creating overhead that can slow 
down the performance of the application, especially when the method is frequently accessed.

To address this problem, we can use Double-Checked Locking, which ensures thread safety 
without repeatedly acquiring the lock.
 * 
 *
 */
public class BasicSingleton {
	private static BasicSingleton instance;

    private BasicSingleton() {
        // Initialization code
    }

    public static synchronized BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }
}
