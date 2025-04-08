/*
4. Write a program where two threads print alternate numbers from 1 to 10 with sleep delays.  

 */

package dec.java.threadmethodpractice1.pkg;

class MyThread4_1 extends Thread
{
	public void printCount()
	{
		for(int i = 1; i<10; i+=2)
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
		printCount();
	}
}

class MyThread4_2 extends Thread
{
	public void printCount()
	{
		for(int i = 2; i <= 10; i+=2)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public void run()
	{
		printCount();
	}
}
public class Question4 
{
	public static void main(String[] args) 
	{
		MyThread4_1 t1 = new MyThread4_1();
		MyThread4_2 t2 = new MyThread4_2();
		
		t1.start();
		t2.start();
	}
}
