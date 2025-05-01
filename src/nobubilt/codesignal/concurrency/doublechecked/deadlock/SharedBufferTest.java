package nobubilt.codesignal.concurrency.doublechecked.deadlock;

/**
 * The Producer-Consumer problem involves two main actors: the producer, which 
 * generates data and places it in a buffer, and the consumer, which retrieves 
 * data from the buffer for processing. The challenge is to ensure that producers
 *  don’t add items to a full buffer, and consumers don’t try to consume from an 
 *  empty buffer.

In this scenario, producers must wait when the buffer is full, and consumers must 
wait when the buffer is empty. This ensures that resources are efficiently managed 
and threads do not conflict with each other.
The Producer-Consumer problem is essential for several reasons:

Efficient Resource Management: It demonstrates how producers and consumers can 
coordinate to share a buffer without overwriting or consuming empty spaces.
Thread Synchronization: The use of locks and wait/notifyAll() ensures that threads 
interact in a safe and synchronized manner, preventing race conditions and deadlocks.
Real-World Applications: This model is widely used in real systems like managing job 
queues on servers, handling data pipelines, and real-time processing tasks.
Understanding the Producer-Consumer problem equips you with the skills necessary to 
solve concurrency challenges when multiple threads need to coordinate resource sharing efficiently.
 * 
 *
 */
public class SharedBufferTest {
    public static void main(String[] args) {
        int capacity = 5;
        int maxItems = 10;
        SharedBuffer buffer = new SharedBuffer(capacity, maxItems);
        Object lock = new Object();

        BufferProducer producer = new BufferProducer(buffer, lock);
        BufferConsumer consumer = new BufferConsumer(buffer, lock);

        Thread producerThread = new Thread(producer, "Producer");
        Thread consumerThread = new Thread(consumer, "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}
