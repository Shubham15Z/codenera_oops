/*
1.Write a Java function to print numbers from 1 to N using recursion.

 */

package sz.recursion.pkg;

import java.util.Scanner;

public class Question1 
{
	public static void printNumber(int n)
	{
		if(n > 0)
		{
			printNumber(n-1);	
			System.out.print(n+" ");
		}
		else
		{
			return ;
		}

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		printNumber(num);
	}
}
