/*
4. Create a DivisionByZeroException and throw it when a number is divided by zero. 
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class DivisionByZero extends RuntimeException
{
	public DivisionByZero(String message)
	{
		super();
	}
}


public class Question4 
{
	public static void checkDivisible(int num, int den) throws DivisionByZero
	{
		if(den == 0)
		{
			throw new DivisionByZero("You can not divide by zero...");
		}
		else
		{
			System.out.println("res: "+(double)(num/den));
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numerator : ");
		int n  = sc.nextInt();
		
		System.out.println("Enter a denominator : ");
		int d  = sc.nextInt();
		
		try {
			checkDivisible(n,d);
		} catch (DivisionByZero e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
