/*
11. Write a method to check whether a given number is positive, negative, or zero

 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question11 {
	String checkNumber(int num)
	{
		if(num > 0)
		{
			return "Number is positive";
		}
		else if(num == 0)
		{
			return "number is zero";
		}
		else
		{
			return "Number is negative";
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Question11 ob = new Question11();
		
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		
		String result = ob.checkNumber(n);
		System.out.println(result);
	}
}
