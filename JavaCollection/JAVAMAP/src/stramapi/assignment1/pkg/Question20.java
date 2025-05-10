/*
Q20. Implement a program to find the longest string in a list using streams.
 */
package stramapi.assignment1.pkg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question20 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("apple", "banana", "kiwi", "cherry", "watermelon");
		
		Optional<String> res = list.stream().max(Comparator.comparingInt(String::length));
		
		System.out.println(res.get());
	}
}
