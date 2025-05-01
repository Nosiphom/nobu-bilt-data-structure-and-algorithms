package nobubilt.codesignal.concurrency.doublechecked.deadlock;
/**
 * 
 * We’ve previously covered atomic variables and CAS (compare-and-swap) operations, 
 * which are key to lock-free programming. Using atomic variables, we can avoid the 
 * blocking and delays caused by locks, allowing threads to work independently without 
 * the risk of race conditions.

Lock-free programming provides performance benefits in scenarios with high concurrency, 
as it reduces overhead caused by threads competing for locks. In this lesson, we’ll explore 
how these concepts apply to implementing a lock-free queue.
 * Lock-free queues are important because they:

Improve Performance: By avoiding locks, threads don’t block each other, reducing contention 
and boosting throughput.
Enhance Scalability: Lock-free structures allow more threads to operate concurrently, 
improving system scalability.
Handle Heavy Loads: They work well under high-load conditions, avoiding the bottlenecks 
typically caused by locking mechanisms.
Lock-free programming is essential for high-performance applications where efficiency and 
scalability are critical. Understanding how to build and use lock-free data structures, like 
queues, equips you to design systems that can handle concurrent access without the overhead 
of traditional locking mechanisms.


 * 
 *
 */
public class LockFreeQueueUsingAtomicVariablesTest {
	  public static void main(String[] args) throws InterruptedException {
		  LockFreeQueueUsingAtomicVariables<Integer> queue = new LockFreeQueueUsingAtomicVariables<>(5);

	        // Producer thread
	        Thread producer = new Thread(() -> {
	            for (int i = 0; i < 10; i++) {
	                queue.enqueue(i);
	                System.out.println("Enqueued: " + i);
	                try {
	                    Thread.sleep(50);// Simulate time taken to produce
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            }
	        });

	        // Consumer thread
	        Thread consumer = new Thread(() -> {
	            for (int i = 0; i < 10; i++) {
	                Integer value = queue.peek();
	                System.out.println("Peeked: " + value);
	                value = queue.dequeue();
	               
	                System.out.println("Dequeued: " + value);
	                try {
	                    Thread.sleep(70);// Simulate time taken to consume
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            }
	        });

	        producer.start();
	        consumer.start();

	        producer.join();
	        consumer.join();
	    }
	
}
