package nobubilt.codesignal.concurrency.doublechecked;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * Compare-And-Swap (CAS) with compareAndSet()
The compareAndSet() method is a key feature in Java's Atomic* classes and plays a 
critical role in lock-free programming. This method allows threads to safely update
 a variable by using the Compare-And-Swap (CAS) mechanism. The key advantage of 
 using compareAndSet() is that it performs atomic updates without the need for 
 explicit locks, making your code more efficient in a multi-threaded environment.

The method works by comparing the current value of an atomic variable with an
 expected value. If they are the same, it updates the variable to a new value. 
Otherwise, it retries the operation. This mechanism ensures that no other 
thread can interfere with the update, allowing for thread-safe operations 
without the overhead of locking.

compareAndSet(expectedValue, newValue): This method checks if the current 
value of an atomic variable is equal to the expectedValue. If so, it updates 
the variable to newValue. If the current value has been modified by another thread 
in the meantime, the operation fails, and you can retry the update with the new value.
For instance, suppose two threads are trying to update the same value. One thread 
reads the value as 5, but before it can update, another thread changes it to 10. 
When the first thread attempts to update the value, the compareAndSet() method will 
fail because the current value (10) is no longer equal to the expected value (5). 
The method then retries until it successfully updates the value.

Initial Value: We initialize atomicInteger to 5.
do-while Loop: The loop continuously tries to update the value of atomicInteger. 
It reads the current value using get() and tries to set it to currentValue + 5 
using compareAndSet(). If another thread modifies the value in the meantime, 
compareAndSet() will fail, and the loop retries the operation.

Successful Update: Once compareAndSet() succeeds (i.e., no other thread modified 
the value between reading and writing), the loop exits, and the updated value is printed.

This lock-free approach ensures that our shared variable is updated safely without 
the need for explicit locks, making it efficient and scalable in multi-threaded environments.

This behavior highlights the CAS principle—only perform an update if the expected 
value matches the current value, ensuring that no race condition can interfere with 
the update, even when multiple threads are involved.

Lock-free programming offers several advantages:

Performance: Lock-free operations reduce contention between threads, allowing 
multiple threads to progress without waiting for locks to be released. This can 
significantly improve performance in high-concurrency scenarios.
Responsiveness: Applications remain responsive as threads are not blocked waiting 
for each other, which is particularly useful in systems where response time is critical.
Simplicity: With atomic variables, code becomes simpler as you don't have to manage 
locks and handle potential deadlock scenarios.
In real-world applications, lock-free programming is used in scenarios where 
high throughput is necessary, such as in trading platforms, gaming servers, or any 
system where response time is critical.


 * 
 *
 */
public class CasExample {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        boolean isUpdated;

        // Use a do-while loop to ensure the update succeeds
        do {
            int currentValue = atomicInteger.get();
            System.out.println("Current value: " + currentValue);
            isUpdated = atomicInteger.compareAndSet(currentValue, currentValue + 5);
        } while (!isUpdated);

        System.out.println("Final value after successful update: " + atomicInteger.get()); // Output: Final value after successful update: 10
    }
}
