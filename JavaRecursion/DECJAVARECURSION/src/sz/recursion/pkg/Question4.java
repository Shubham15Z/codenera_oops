/*
4. Write a Java method to count the number of digits in an integer using recursion.
 */

package sz.recursion.pkg;

import java.util.Scanner;

public class Question4 
{
	public static int countDigit(int n)
	{
		if(n > 0)
		{
			return 1 + countDigit(n/10);
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		int res = Question4.countDigit(num);
		System.out.println(res);
	}
}
