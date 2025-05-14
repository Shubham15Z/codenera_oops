/*
Q7. Write a program to sort a list of strings in ascending order using streams.
 */


package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("Java", "Python","Devops","Angular","React"));
		
		List<String> list2 = list1.stream().sorted().collect(Collectors.toList());
		
		System.out.println(list2);
	}
}
