/*
6. Write a program where a thread sleeps for 3 seconds and then prints a message.
 */

package dec.java.threadmethodpractice1.pkg;

class MyThread6 extends Thread
{
	public void printMessage()
	{
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Hello World after 3 sec...");
	}
	public void run()
	{
		printMessage();
	}
}

public class Question6 
{
	public static void main(String[] args) 
	{
		MyThread6 t1 = new MyThread6();
		t1.start();
	}
}
