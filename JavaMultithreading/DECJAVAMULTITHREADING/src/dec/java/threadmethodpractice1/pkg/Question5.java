/*
5. Implement a program that simulates a progress bar using sleep where a dot is printed every second.  
 */
package dec.java.threadmethodpractice1.pkg;

class MyThread5 extends Thread
{
	public void PrintProgressBar()
	{
		System.out.print("Loading");
		for(int i = 1; i <= 10; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println("\nDone!");
	}
	public void run()
	{
		PrintProgressBar();
	}
}

public class Question5 
{
	public static void main(String[] args) 
	{
		MyThread5 t5 = new MyThread5();
		t5.start();
	}
}
