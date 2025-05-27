/*
7. How do you calculate the factorial of a number using recursion in Java?
 */

package sz.recursion.pkg;

import java.util.Scanner;

public class Question7
{
	public static int findFactorial(int n)
	{
		if(n > 0)
		{
			return n * findFactorial(n-1);
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int res = Question7.findFactorial(num);
		System.out.println(res);
	}
}
