/*
3. Implement a thread that simulates a countdown timer from 10 to 1, with a 500ms delay between numbers.  
 */

package dec.java.threadmethodpractice1.pkg;

class MyThread3 extends Thread
{
	public void printCount()
	{
		for(int i = 10; i > 0; i--)
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

public class Question3 
{
	public static void main(String[] args)
	{
		MyThread3 t1 = new MyThread3();
		t1.start();
	}
}
