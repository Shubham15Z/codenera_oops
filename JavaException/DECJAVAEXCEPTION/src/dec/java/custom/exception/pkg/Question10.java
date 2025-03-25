/*
10. Write a program that throws a NegativeSalaryException if a salary input is negative.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class NegativeSalaryException extends Exception
{
	public NegativeSalaryException(String message) {
		super(message);
	}
}

public class Question10 
{
	public static void checkSal(double sal) throws NegativeSalaryException
	{
		if(sal < 0)
		{
			throw new NegativeSalaryException("Please check your salary input...");
		}
		else
			System.out.println("Valid Salary");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a salary : ");
		double sal = sc.nextDouble();
		
		try
		{
			checkSal(sal);
		}
		catch(NegativeSalaryException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
