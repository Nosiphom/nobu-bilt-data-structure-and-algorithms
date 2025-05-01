package nobubilt.codesignal.concurrency.doublechecked;
/**
 * In this task, you'll convert the existing BankAccount class, which uses synchronized methods, 
 * to use ReentrantLock instead. This change will provide you with finer control over how and when 
 * locks are acquired and released, allowing you to see the difference between automatic and 
 * manual lock management.

You got this—let's make these improvements and bring more flexibility to our code!
 * 
 *
 */
public class BankAccountReentrantLockTest {
	 public static void main(String[] args) throws InterruptedException {
		 BankAccountReentrantLock account = new BankAccountReentrantLock();

	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                account.deposit(100);
	            }
	        }, "Thread-1");

	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                account.withdraw(50);
	            }
	        }, "Thread-2");

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        System.out.println("Final balance: " + account.getBalance());
	    }
/**
 * expected
 * Thread-1 deposited 100.0. New balance: 100.0
Thread-1 deposited 100.0. New balance: 200.0
Thread-1 deposited 100.0. New balance: 300.0
Thread-1 deposited 100.0. New balance: 400.0
Thread-1 deposited 100.0. New balance: 500.0
Thread-2 withdrew 50.0. New balance: 450.0
Thread-2 withdrew 50.0. New balance: 400.0
Thread-2 withdrew 50.0. New balance: 350.0
Thread-2 withdrew 50.0. New balance: 300.0
Thread-2 withdrew 50.0. New balance: 250.0
Final balance: 250.0
 */
}

