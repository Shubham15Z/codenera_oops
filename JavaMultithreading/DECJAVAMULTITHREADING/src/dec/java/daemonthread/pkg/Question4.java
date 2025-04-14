/*
4. Create a daemon thread that prints numbers from 1 to 5 in an infinite loop while the main thread sleeps.
 */

package dec.java.daemonthread.pkg;

class MyDaemon4 extends Thread
{
	public void printNumber()
	{
		while(true)
		{
			for(int i = 1; i <= 5; i++)
			{
				System.out.println("Daemon Thread prints :"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	public void run()
	{
		printNumber();
	}
}
public class Question4 
{
	public static void main(String[] args) 
	{
		MyDaemon4 d1 = new MyDaemon4();
		d1.setDaemon(true);
		d1.start();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread finished. Daemon thread will terminate automatically.");
	}
}
