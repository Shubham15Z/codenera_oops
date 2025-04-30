/*
Use synchronized(this) block to protect a shared resource.
 */

package dec.java.synchronization.practice1.pkg;

class BankAccount 
{
    private int balance = 1000;  

    public void withdraw(String name, int amount) 
    {
        synchronized (this) 
        {
            if (balance >= amount) 
            {
                System.out.println(name + " is processing withdrawal...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                balance -= amount;
                System.out.println(name + " successfully withdrew Rs" + amount);
            }
            else 
            {
                System.out.println(name + " - Insufficient funds!!");
            }
            System.out.println("Remaining balance: Rs" + balance + "\n");
        }
    }
}


public class Question7 
{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();  

        Runnable r1 = () -> account.withdraw("Thread-1", 400);
        Runnable r2 = () -> account.withdraw("Thread-2", 300);
        Runnable r3 = () -> account.withdraw("Thread-3", 500);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
}
