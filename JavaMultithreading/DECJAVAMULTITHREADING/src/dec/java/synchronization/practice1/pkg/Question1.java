/*
Create a thread that prints numbers from 1 to 5 with a 1-second delay. Use synchronized block inside the loop.
 */

package dec.java.synchronization.practice1.pkg;

class MyThread extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			synchronized (this) 
			{
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}

public class Question1
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.start();
	}
}
