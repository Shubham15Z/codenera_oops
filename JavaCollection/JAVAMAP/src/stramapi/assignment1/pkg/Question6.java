/*
Q6. Implement a program to convert a list of strings to uppercase using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question6 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("Java", "Python", "Devops", "Dotnet"));
		
		List<String> uppercase = list1.stream().map(s1 -> s1.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(list1);
		System.out.println(uppercase);
	}
}
