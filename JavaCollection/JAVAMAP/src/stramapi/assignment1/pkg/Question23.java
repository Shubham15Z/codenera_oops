/*
Q23. Write a program to create a stream of numbers from 1 to 100 and find the sum of squares 
of all even numbers.
 */
package stramapi.assignment1.pkg;

import java.util.stream.IntStream;

public class Question23
{
	public static void main(String[] args) 
	{
		int sum = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .sum();
		
		System.out.println(sum);
	}
}
