/*
3. Write a program where a daemon thread runs in the background while the main thread performs a task.  
 */

package dec.java.daemonthread.pkg;

class MyDaemon3 extends Thread
{
	public void run()
	{
		System.out.println("Daemon thread running....");
	}
}
public class Question3 
{
	public static void main(String[] args) 
	{
		MyDaemon3 d1 = new MyDaemon3();
		d1.setDaemon(true);
		d1.start();
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Main thread working : "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
