/*
2. Create a program where multiple threads print their names but pause for different durations using sleep. 
 */

package dec.java.threadmethodpractice1.pkg;

class MyThread2 extends Thread
{
	public void printName()
	{	
		System.out.println("The current thread is :"+Thread.currentThread().getName());
	}
	public void run()
	{
		printName();
	}
}

public class Question2 
{
	public static void main(String[] args) 
	{
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}
}
