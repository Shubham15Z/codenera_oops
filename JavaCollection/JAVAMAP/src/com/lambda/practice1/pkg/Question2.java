/*
Create a lambda function to check if a given number is even or odd.
 */

package com.lambda.practice1.pkg;

interface EvenOdd
{
	boolean checkNumber(int number);
}

public class Question2 
{
	public static void main(String[] args) 
	{
		int input = 11;
		EvenOdd num = (number) -> number % 2 == 0;
		
		if(num.checkNumber(input))
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
