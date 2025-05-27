/*
6. Create a Java method to calculate the sum of digits of a positive integer using recursion.
 */

package sz.recursion.pkg;

import java.util.Scanner;

public class Question6 
{
	public static int sumPositive(int n)
	{
		if(n > 0)
		{
			return n%10 + sumPositive(n/10);
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int res = Question6.sumPositive(num);
		System.out.println(res);
		
	}
}
