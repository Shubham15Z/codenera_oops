/*
1. Write a program where a thread prints numbers from 1 to 5, with a 1-second delay between each print using sleep.  
 */

package dec.java.threadmethodpractice1.pkg;

class MyThread1 extends Thread
{
	public void printNumber()
	{
		for(int i = 1; i <= 5; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public void run()
	{
		printNumber();
	}
}
public class Question1 
{
	public static void main(String[] args)
	{
		MyThread1 t1 = new MyThread1();
		t1.start();
	}
}
