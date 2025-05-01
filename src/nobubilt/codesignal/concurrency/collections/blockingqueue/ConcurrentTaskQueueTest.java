package nobubilt.codesignal.concurrency.collections.blockingqueue;

public class ConcurrentTaskQueueTest {
/**
 * Highlighting Key Differences
While both LinkedBlockingQueue and ConcurrentLinkedQueue are thread-safe, they operate differently:

Blocking vs. Non-Blocking: LinkedBlockingQueue blocks threads when the queue is empty (or full),
 ensuring tasks are processed as soon as possible but requiring threads to wait. On the other hand, 
 ConcurrentLinkedQueue never blocks; it simply returns null if no task is available, allowing 
 threads to move on without waiting.

Use Cases: LinkedBlockingQueue is ideal when you need precise coordination between threads, 
such as ensuring tasks are processed in a specific order with waits. ConcurrentLinkedQueue, 
however, is more suitable for high-throughput scenarios where tasks can be processed as they 
come in without strict ordering or waiting.

The Importance of Blocking and Non-Blocking Queues
Understanding blocking and non-blocking queues enhances your ability to design efficient, 
thread-safe systems. Here’s why this knowledge is vital:

Inter-Thread Communication: Blocking queues like the LinkedBlockingQueue are key when you 
need to manage communication and task flow between different threads, making them perfect 
for scenarios requiring threads to wait for each other.

Thread Safety Without Locks: Non-blocking queues like the ConcurrentLinkedQueue allow 
concurrent access without the need for traditional locking mechanisms, improving performance 
in high-throughput applications and reducing the potential for thread contention.

Scalability: Both queue types contribute to scalable applications that can handle numerous 
concurrent operations, which is pivotal in modern software architectures such as microservices 
and real-time data processing.


 * @throws InterruptedException
 */
  public static void main(String[] args) throws InterruptedException {
        // Example with LinkedBlockingQueue
        System.out.println("Using LinkedBlockingQueue:");
        TaskQueue blockingQueue = new TaskQueue();
        blockingQueue.addTask("Task 1 (LinkedBlockingQueue)");
        blockingQueue.addTask("Task 2 (LinkedBlockingQueue)");

        System.out.println("Queue is full. The next task will block...");

        new Thread(() -> {
            try {
                System.out.println("Attempting to add Task 3 (LinkedBlockingQueue)...");
             // This will block until space is available
                blockingQueue.addTask("Task 3 (LinkedBlockingQueue)"); 
            } catch (InterruptedException e) {
                System.out.println("Interrupted while waiting to add Task 3 (LinkedBlockingQueue).");
            }
        }).start();

        Thread.sleep(2000); // Simulating delay before consuming tasks

       
        System.out.println("Removing a task...");
        
        
        blockingQueue.executeTasks(); // This will unblock the producer thread

        
        blockingQueue.addTask("Task 4 (LinkedBlockingQueue)");
        blockingQueue.addTask("Task 5 (LinkedBlockingQueue)");

        // TODO: Cancel a task before it gets executed
        blockingQueue.cancelTask("Task 4 (LinkedBlockingQueue)");

        blockingQueue.executeTasks(); // This will unblock the producer thread
        
        // Example with ConcurrentLinkedQueue
        System.out.println("Using ConcurrentLinkedQueue:");
        ConcurrentTaskQueue concurrentQueue = new ConcurrentTaskQueue();
        concurrentQueue.addTask("Task 1 (ConcurrentLinkedQueue)");
        concurrentQueue.addTask("Task 2 (ConcurrentLinkedQueue)");
        concurrentQueue.executeTasks();
    }
	
}
