/*
5. Write a recursive Java method to compute the sum of all odd numbers up to a given number N.
 */

package sz.recursion.pkg;

import java.util.Scanner;

public class Question5
{
	public static int oddSum(int n)
	{
		if(n > 0)
		{
			if(n%2 != 0)
			{
				return n + oddSum(n-1);
			}
			else
			{
				return oddSum(n-1);
			}
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int res = Question5.oddSum(num);
		System.out.println(res);
	}
}
