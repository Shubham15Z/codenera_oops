/*
7. Write a program that reads an integer from the user using Scanner and handles InputMismatchException 
if the user enters a non-integer value. 
 */

package dec.java.throwskeyword.pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question7 
{
	public void print() throws InputMismatchException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n1 = sc.nextInt();
		System.out.println(n1);
	}
	
	public void m1()
	{
		try
		{
			print();
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException handled....");
		}
	}
	
	public static void main(String[] args) 
	{
		Question7 q7 = new Question7();
		q7.m1();
	}
}
