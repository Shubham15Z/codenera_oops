/*
Write a class with a method that prints “Hello” followed by a name. Synchronize this method.
 */

package dec.java.synchronization.practice1.pkg;

import java.util.Scanner;

class MyThread02 extends Thread
{
	public static synchronized void printName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Hello "+name);
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
		MyThread02 t1 = new MyThread02();
		t1.start();
	}
}
