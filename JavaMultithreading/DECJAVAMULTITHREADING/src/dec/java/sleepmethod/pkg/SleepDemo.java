package dec.java.sleepmethod.pkg;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread has started");
		for(int i = 1; i <= 5; i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
}
public class SleepDemo 
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.start();
	}
}
