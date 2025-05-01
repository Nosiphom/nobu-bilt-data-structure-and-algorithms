package nobubilt.codesignal.concurrency.doublechecked;
/**
 * This program involves two BankAccount objects and two threads, each making 
 * repeated transfers between these accounts. Proper synchronization is used to 
 * ensure that each transaction is conducted safely without race conditions or deadlocks.
 * 
 *
 */
public class BankAccount {

	  private final int id;
	    private int balance;

	    public BankAccount(int id, int balance) {
	        this.id = id;
	        this.balance = balance;
	    }

	    public int getId() {
	        return id;
	    }

	    public void deposit(int amount) {
	        balance += amount;
	    }

	    public boolean withdraw(int amount) {
	        if (balance < amount) return false;
	        balance -= amount;
	        return true;
	    }

	    public static void transfer(BankAccount from, BankAccount to, int amount) {
	    	/**
	        * The first step in the transfer method is preventing deadlock by ensuring that locks on the 
	        * BankAccount objects are acquired in a consistent order. We do this by comparing the IDs
	        *  of the accounts involved in the transfer. 
	        * The account with the lower ID is always locked first, followed by the account with the 
	        * higher ID.

This approach prevents circular waiting, which is a condition that can lead to deadlock. By always 
acquiring locks in a consistent order, we ensure that no deadlock will occur.
	        */
	    	BankAccount first = from.getId() < to.getId() ? from : to;
	        BankAccount second = from.getId() < to.getId() ? to : from;
/**
 *  the first synchronized block locks the first bank account (the one with the lower ID), and 
 *  the second synchronized block locks the second bank account. By using nested synchronization, 
 *  we guarantee that no two threads can simultaneously modify the same accounts during a transfer.

 */
	        synchronized (first) {

	            try {
	                Thread.sleep(100);  // Simulate some work
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }

	            synchronized (second) {
	                if (from.withdraw(amount)) {
	                    to.deposit(amount);
	                    System.out.println("Transferred " + amount + " from Account " + 
	                    from.getId() + " to Account " + to.getId());
	                } else {
	                    System.out.println("Insufficient funds in Account " + from.getId());
	                }
	            }
	        }
	    }
	    
	    public static void reverseTransfer(BankAccount from, BankAccount to, int amount)
	    {
	    	BankAccount first = from.getId() < to.getId() ? from : to;
	    	BankAccount second= from.getId() < to.getId() ? to : from;
	        
	        synchronized(first)
	        {
	            try
	            {
	                Thread.sleep(100);
	            }
	            catch(InterruptedException e)
	            {
	                e.printStackTrace();
	            }
	            synchronized(second)
	            {
	                if(to.withdraw(amount))
	                {
	                    from.deposit(amount);
	                    System.out.println("Reverse transfer successful from account "+ to.id +
	                    		" to account" + from.id);
	                }
	                else
	                {
	                    System.out.println("Not enough balance in account "+ to.id + 
	                    		" to reverse transfer");
	                }
	            }
	        }
	    }
	}
