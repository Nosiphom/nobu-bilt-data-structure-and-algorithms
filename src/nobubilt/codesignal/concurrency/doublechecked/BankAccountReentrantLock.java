package nobubilt.codesignal.concurrency.doublechecked;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountReentrantLock {
    private double balance;

    // TODO: Change this class to use ReentrantLock instead of synchronized
    private final Lock lock1 = new ReentrantLock();

    public void deposit(double amount) {
        lock1.lock();
        try
        {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
        }
        finally
        {
            lock1.unlock();
        }
    }

    public void withdraw(double amount) {
        lock1.lock();
        try
        {
             if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient funds.");
            }
        }
        finally
        {
            lock1.unlock();
        }
       
    }

    public  double getBalance() {
        lock1.lock();
        try
        {
            return balance;
        }
        finally
        {
            lock1.unlock();
        }
        
    }
}
