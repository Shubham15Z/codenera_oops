/*
Write a lambda expression to square a number.
 */

package com.lambda.practice1.pkg;

@FunctionalInterface
interface SquareNumber
{
	int  findSquare(int number);
}

public class Question1 
{
	public static void main(String[] args) 
	{
		SquareNumber square = (number) -> number * number ;
		
		int res = square.findSquare(5);
		
		System.out.println(res);
	}
}
