package nobubilt.codesignal.concurrency.jmm;

public class JmmVola {
/**
 * When a variable is declared as volatile, it ensures that:

No Caching: Every time a thread reads a volatile variable, it reads directly from 
the main memory (RAM), ensuring that it sees the latest value.
Visibility Guarantee: Writes to a volatile variable are immediately written to 
the main memory, making them visible to all other threads. The volatile keyword is 
ideal for situations where you need to ensure that threads always have the most 
up-to-date value of a variable but without requiring the overhead of full synchronization.
  
In this code, the variable stop is declared as volatile, ensuring that any update 
made by one thread (in this case, the main thread) is immediately visible to the 
other threads (e.g., the worker thread).

The worker thread runs a loop, continuously checking the value of stop. Since stop 
is marked as volatile, the worker thread reads it directly from the main memory each 
time it accesses the variable. This guarantees that when the main thread changes 
stop to true, the worker thread sees the change immediately and stops executing the loop.
Without volatile, the value of stop could be cached in the local cache of the worker 
thread's CPU, resulting in a scenario where the worker thread does not see the updated 
value set by the main thread, leading to the loop running indefinitely.
This example ties directly back to the Java Memory Model (JMM) we discussed earlier. 
The JMM allows each thread to have a cached version of shared variables, which can 
lead to visibility problems if the variable's updates are not propagated correctly. 
By declaring stop as volatile, we ensure that all reads and writes occur directly 
with the main memory, thus maintaining consistency between the worker and main threads.

The use of the volatile keyword here helps us avoid caching-related visibility issues, 
thereby ensuring correct program behavior. It also avoids the heavier cost of using
 synchronization, making it a more efficient solution for simpler visibility requirements.
The volatile keyword is another way to solve visibility issues for single-read and
single-write operations, ensuring that changes made by one thread are immediately visible to others.


In this task, you'll introduce another worker thread that also stops when the 
stop variable is set to true. This exercise will help you observe how the volatile keyword 
ensures visibility across multiple threads, ensuring all workers stop when instructed.

Make sure both threads see the updated value of stop and correctly end their execution.
 */
	private static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        // Existing worker thread
        Thread worker1 = new Thread(() -> {
            int i = 0;
            while (!stop) {
                i++;
            }
            System.out.println("Worker 1 stopped at i = " + i);
        });

        // TODO: Add another worker thread similar to worker1, and ensure it also
        //stops when stop is set to true.
        Thread worker2 = new Thread(() -> {
            int i = 0;
            while (!stop) {
                i++;
            }
            System.out.println("Worker 2 stopped at i = " + i);
        });
        worker1.start();
        worker2.start();
        // TODO: Start the second worker thread.

        Thread.sleep(1000);
        stop = true;
        System.out.println("stop set to true");

        // TODO: Join the second worker thread along with worker1 to ensure both 
        //finish execution before the program ends.
        worker1.join();
        worker2.join();
	    
	}
}
