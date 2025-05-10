/*
Q25. Write a program to convert a list of strings to a map where the key is the length of 
the string and the value is a list of strings of that length using streams.
 */


package stramapi.assignment1.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question25
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("apple", "banana", "kiwi", "cherry", "mango", "pear");

        Map<Integer, List<String>> groupedByLength = list.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength);
	}
}
