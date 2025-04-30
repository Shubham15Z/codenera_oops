/*
Create a class Counter with a method increment() that increases a counter. Make it thread-safe.
 */


package dec.java.synchronization.practice1.pkg;

class Counter extends Thread
{
	
	public static void increment()
	{
		System.out.println("Count is : ");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
	
	public void run()
	{
		increment();
	}
}

public class Question3 
{
	public static void main(String[] args) 
	{
		Counter t1 = new Counter();
		t1.start();
	}
}
