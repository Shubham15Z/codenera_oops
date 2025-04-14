/*
5. Demonstrate that a daemon thread terminates when the main thread ends. 
 */

package dec.java.daemonthread.pkg;

class MyDaemon5 extends Thread
{
	public void countNumber()
	{
		int count = 1;
		while(true)
		{
			System.out.println("Daemon Thread prints :"+ count++);				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	public void run()
	{
		countNumber();
	}
}
public class Question5 
{
	public static void main(String[] args) 
	{
		MyDaemon5 d1 = new MyDaemon5();
		d1.setDaemon(true);
		d1.start();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread finished. Daemon thread will terminate after 8 sec.");
	}
}
