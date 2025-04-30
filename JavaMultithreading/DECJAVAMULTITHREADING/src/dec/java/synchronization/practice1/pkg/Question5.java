/*
Create a class Printer with a method printTable(int n) that prints multiplication table. Synchronize that method.
 */

package dec.java.synchronization.practice1.pkg;

import java.util.Scanner;

class Printer
{
	public synchronized void printTable(int n)
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(n+" x "+i+" = "+(i*n));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class Question5 
{
	public static void main(String[] args)
	{
		Printer p = new Printer();
		Thread t1 = new Thread(() -> p.printTable(5));
		Thread t2 = new Thread(() -> p.printTable(8));
		t1.start();
		t2.start();
	}
}
