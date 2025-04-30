/*
Print even and odd numbers using two synchronized methods called by two threads.
 */

package dec.java.synchronization.practice1.pkg;

class MyThread04 extends Thread
{
	public synchronized void printEven()
	{
		System.out.println("Even numbers are");
		for(int i = 1; i <= 10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public synchronized void printOdd()
	{
		System.out.println("Odd numbers are");
		for(int i = 1; i <= 10; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void run()
	{
		printEven();
		printOdd();
	}
}

public class Question4 
{
	public static void main(String[] args) 
	{
		MyThread04 t1 = new MyThread04();
		t1.start();
	}
}
