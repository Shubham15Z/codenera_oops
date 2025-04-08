/*
7. Create a thread that prints "Processing..." every second for 5 times.  
 */

package dec.java.threadmethodpractice1.pkg;

class MyThread7 extends Thread
{
	public void printMessage()
	{
		for(int i = 1; i <= 5; i++)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Processing...");
		}
		
	}
	public void run()
	{
		printMessage();
	}
}
public class Question7 
{
	public static void main(String[] args) {
		MyThread7 t7 = new MyThread7();
		t7.start();
	}
}
