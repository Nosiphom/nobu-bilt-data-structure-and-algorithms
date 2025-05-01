package nobubilt.codesignal.concurrency.doublechecked.deadlock;

import java.util.concurrent.atomic.AtomicReference;
/**
 * next is an AtomicReference to the next node in the queue. By 
 * using an atomic reference, we ensure thread safety when updating this 
 * pointer, allowing multiple threads to enqueue or dequeue elements 
 * concurrently without corrupting the queue structure.
 * 
 *
 * @param <T>
 */
public class LockFreeNode<T> {
    final T value;
    final AtomicReference<LockFreeNode<T>> next;

    LockFreeNode(T value) {
        this.value = value;
        this.next = new AtomicReference<>(null);
    }
}
