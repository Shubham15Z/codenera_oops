package sz.recursion.pkg;

import java.util.Scanner;

public class FactorialNumber
{
	public static int findFact(int n)
	{
		if(n > 0)
		{
			return n * findFact(n-1);
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
		int n = sc.nextInt();
		
		int res = findFact(n);
		
		System.out.println("Factorial is : "+res);
	}
}
