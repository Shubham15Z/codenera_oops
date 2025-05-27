package sz.recursion.pkg;

import java.util.Scanner;

public class SumNumber
{
	public static int findSum(int n)
	{
		if(n > 0)
		{
			return n+findSum(n-1);
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
		int n = sc.nextInt();
		
		int res = findSum(n);
		
		System.out.println("The sum is : "+res);
	}
}
