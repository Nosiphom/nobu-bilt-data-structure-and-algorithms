package nobubilt.codesignal.concurrency;

public class BankAccount {

   private int balance;
    public synchronized void deposit(int amount)
    {
        balance += amount;
    }
    
    public synchronized void withdraw(int amount)
    {
        if(balance > amount)
        {
            balance -= amount;
        }
    }
    
    public synchronized int getBalance()
    {
        return balance;
    }
}
