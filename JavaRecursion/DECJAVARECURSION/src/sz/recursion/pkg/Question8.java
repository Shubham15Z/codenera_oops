/*
8. How do you find the nth Fibonacci number using recursion in Java?
 */

package sz.recursion.pkg;

import java.util.Scanner;

public class Question8
{
	public static void fibonacciSeries(int n,int a, int b)
	{
		for(int i = 1; i <= n; i++)
		{
			System.out.print(a+" ");
			
			int temp = a+b;
			a = b;
			b = temp;
		}
	}
	
	public static int findNthFibonacciNum(int n)
	{
		if(n <= 1)
		{
			return n;
			
		}
		return findNthFibonacciNum(n-1) + findNthFibonacciNum(n-2);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int a = 0, b = 1;
		fibonacciSeries(num,a,b);
		System.out.println();
		int res = findNthFibonacciNum(num);
		System.out.println(res);
	}
}
