package nobubilt.codesignal.concurrency.doublechecked;
/**
 * Building a thread-safe bank account transfer system is a valuable skill in concurrent 
 * programming. It ensures that data remains consistent, prevents race conditions, and 
 * avoids deadlocks, which are crucial for creating robust, high-performance applications.

Data consistency: Synchronization guarantees that the account balance is always correct, 
even with concurrent access.
Deadlock prevention: Using an ordered locking mechanism prevents deadlocks from occurring.
Concurrency: This system allows multiple threads to safely interact with the same shared 
resources (bank accounts).

 * 
 *
 */
public class BankAccountTest {

	  public static void main(String[] args) throws InterruptedException  {
		  BankAccount account1 = new BankAccount(1, 500);
		  BankAccount account2 = new BankAccount(2, 500);

	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 10; i++) {
	            	BankAccount.transfer(account1, account2, 10);
	            }
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 4; i++) {
	            	BankAccount.transfer(account2, account1, 10);
	            }
	        });
	        
	        Thread t3 = new Thread(()-> {
	            for(int inx = 0; inx < 10; inx++)
	            {
	            	BankAccount.reverseTransfer(account2, account1, 10);
	            }
	        });

	        t1.start();
	        t2.start();
	        t3.start();
	        
	        t1.join();
	        t2.join();
	        t3.join();
	    }
	}
