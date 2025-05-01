package nobubilt.codesignal.concurrency.jmm;
/**
 * Great job on understanding the differences between volatile and synchronized! 
 * Now, let's solidify that understanding by further by making some modifications 
 * to the current code.

The current implementation uses a synchronized block to manage visibility 
between threads, which adds unnecessary overhead for simple read and write 
operations. Your task is to replace the synchronized block with the volatile 
keyword for the counter variable to ensure visibility between threads without using locks.
 * 
 *
 */
public class JmmReplaceSyncWithVolaTest {
    public static void main(String[] args) {
    	JmmReplaceSyncWithVola example = new JmmReplaceSyncWithVola();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) example.incrementCounter();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) example.incrementCounter();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + example.getCounter());
    }
}
