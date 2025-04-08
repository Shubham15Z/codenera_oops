/*
8. Implement a thread that pauses execution using sleep for a random time between 1-5 seconds before printing a message.  
 */

package dec.java.threadmethodpractice1.pkg;

import java.util.Random;

class MyThread8 extends Thread
{
	public void printMessage()
	{
		Random rd = new Random();
		int randomNum = 1+rd.nextInt(5);
		try 
		{
			Thread.sleep(rd.nextLong(randomNum * 1000));
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Hello World after any random delay between 1 to 5");
	}
	public void run()
	{
		printMessage();
	}
}

public class Question8
{
	public static void main(String[] args) {
		MyThread8 t1 = new MyThread8();
		t1.start();
	}
}
