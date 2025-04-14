/*
6. Write a Java program where a non-daemon thread continues execution after the main thread exits.  
 */

package dec.java.daemonthread.pkg;

class MyDaemon6 extends Thread
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
class MyThread6 extends Thread
{
	public void countNumber1()
	{
		int count = 1;
		while(count <= 6)
		{
			System.out.println("Non Daemon Thread prints :"+ count++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	public void run()
	{
		countNumber1();
	}
}
public class Question6
{
	public static void main(String[] args) 
	{
		MyDaemon6 d1 = new MyDaemon6();
		MyThread6 d2 = new MyThread6();
		d1.setDaemon(true);
		d1.start();
		d2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread finished. Daemon thread will terminate after 8 sec.");
	}
}
