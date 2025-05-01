package nobubilt.codesignal.concurrency.doublechecked.deadlock;
/**
 * A deadlock occurs when two or more threads are blocked forever, each waiting for a 
 * resource that another thread holds. This creates a situation where no thread can 
 * proceed, leading to a halt in the program. Essentially, it’s like two people who 
 * are each holding a key to a door that the other person needs—they're both stuck, 
 * waiting for the other to act.

Causes of Deadlocks:

Deadlocks happen because of four main conditions, which can occur simultaneously:

Mutual Exclusion: Resources involved are non-shareable, meaning only one thread 
can access the resource at a time.
Hold and Wait: A thread holds at least one resource and waits for additional 
resources held by other threads.
No Preemption: Resources cannot be forcibly taken away from a thread; they can 
only be released voluntarily.
Circular Wait: A closed chain of threads exists, where each thread holds a 
resource that the next thread needs, forming a cycle.
When these four conditions exist, the system ends up in a deadlock state, 
where threads cannot continue to execute.


 * 
 *
 */
public class DeadLockExampleTest {
	 public static void main(String[] args) {
		 DeadLockExample example = new DeadLockExample();
	        Thread t1 = new Thread(example::methodOne);
	        Thread t2 = new Thread(example::methodTwo);
	        t1.start();
	        t2.start();
	    }
}
