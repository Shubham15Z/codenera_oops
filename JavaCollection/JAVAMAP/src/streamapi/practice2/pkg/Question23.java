/*
Q23. Write a program to create a stream of numbers from 1 to 100 and find the sum of squares of all even numbers.
 */

package streamapi.practice2.pkg;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question23 
{
	public static void main(String[] args) 
	{
		int sumEvenSquare = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).map(a -> a*a).sum();
		
		System.out.println(sumEvenSquare);
	}
}
