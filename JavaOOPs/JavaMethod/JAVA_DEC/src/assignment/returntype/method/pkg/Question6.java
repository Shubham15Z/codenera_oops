/*
6.Check if a year is leap
 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question6 {
	String checkLeapYear(int year)
	{
		int n = year;
		if(n % 100 == 0)
		{
			if(n % 400 == 0)
			{
				return "It is leap year";
			}
			else
			{
				return "It is not leap year";
			}
		}
		else
		{
			if(n % 4 == 0)
			{
				return "It is leap year";
			}
			else
			{
				return "It is not leap year";
			}
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int n = sc.nextInt();
		
		Question6 ob = new Question6();
		String result = ob.checkLeapYear(n);
		System.out.println(result);
	}
}
