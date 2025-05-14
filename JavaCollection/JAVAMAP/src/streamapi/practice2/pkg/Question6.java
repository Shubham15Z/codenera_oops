/*
Q6. Implement a program to convert a list of strings to uppercase using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question6
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("Java", "Python","Devops","Angular","React"));
		
		List<String> uppercase = list1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Uppercase : "+uppercase);
	}
}
