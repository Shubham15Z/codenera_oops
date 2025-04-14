/*
7. Create a daemon thread that prints "Hello from Daemon Thread" continuously until the main thread sleeps for 2 seconds. 
 */

package dec.java.daemonthread.pkg;

class MyDaemon7 extends Thread
{
	public void printHello()
	{
		while(true)
		{
			System.out.println("Hello from Daemon Thread");				
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	public void run()
	{
		printHello();
	}
}
public class Question7 
{
	public static void main(String[] args) 
	{
		MyDaemon7 d1 = new MyDaemon7();
		d1.setDaemon(true);
		d1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread finished. Daemon thread will terminate after 2 sec.");
	}
}
