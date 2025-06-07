/*
Write a lambda expression to check given number is prime or not
 */

package com.lambda.practice1.pkg;

interface PrimeNumber
{
	boolean isPrime(int num);
}
public class Question9 
{
	public static void main(String[] args) 
	{
		int input = 14;
		
		PrimeNumber checkPrime = (n1) -> {
			int count = 0;
			for(int i = 1; i <= n1; i++)
			{
				if(n1 % i == 0)
				{
					count++;
				}
			}
			
			if(count == 2)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		
		boolean res = checkPrime.isPrime(input);
		System.out.println(res);
		
	}
}
