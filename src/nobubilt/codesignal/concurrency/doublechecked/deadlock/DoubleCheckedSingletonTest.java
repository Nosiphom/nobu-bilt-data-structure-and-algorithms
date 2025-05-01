package nobubilt.codesignal.concurrency.doublechecked.deadlock;
/**
 * Double-Checked Locking in action in a multi-threaded environment:
 * we create four threads (t1, t2, t3, t4) that concurrently call Singleton.getInstance(). 
 * Each thread attempts to access the Singleton instance, and Double-Checked Locking ensures 
 * that only one instance is created without redundant locking overhead.

The Runnable Definition defines a task that calls Singleton.getInstance() and prints the 
instance reference.
Thread Creation and Execution: Each thread runs the task concurrently, showing that even 
with multiple threads attempting to create the Singleton, only one instance is created.
Thread Join: The join() method ensures that the main thread waits for all threads to complete execution.
Why Double-Checked Locking Matters
Double-Checked Locking provides a balance between performance and correctness. Here’s why it is an 
important pattern in Java concurrency:
Performance Improvement: The use of synchronized blocks is minimized, reducing the performance 
bottleneck associated with full synchronization.
Thread Safety: It ensures that multiple threads do not create separate instances of the Singleton, 
preventing concurrency issues.
Efficient Resource Management: This pattern is ideal for managing resources that should only have 
one point of access—like database connections or configuration settings—ensuring that the application
 runs efficiently without sacrificing correctness.
Mastering the Double-Checked Locking pattern equips you to optimize your multi-threaded applications, 
ensuring both efficiency and safety. This pattern is a powerful addition to your Java concurrency 
toolbox, particularly for scenarios where resource management is critical.
 * 
 * 
 *
 */
public class DoubleCheckedSingletonTest {
    public static void main(String[] args) {
        Runnable singletonTest = () -> {
        	DoubleCheckedSingleton instance = DoubleCheckedSingleton.getInstance();
            System.out.println("Singleton instance: " + instance);
        };
//only one instance of the singleton is created even when multiple threads try to access it concurrently.
        Thread t1 = new Thread(singletonTest);
        Thread t2 = new Thread(singletonTest);
        Thread t3 = new Thread(singletonTest);
        Thread t4 = new Thread(singletonTest);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
