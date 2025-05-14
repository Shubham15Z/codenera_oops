/*
Q25. Write a program to convert a list of strings to a map 
where the key is the length of the string and the value is a list of strings of that length using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question25 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("Java", "Python","Devops","Angular","React"));
		
		Map<Integer, List<String>> grouped = list1.stream().collect(Collectors.groupingBy(s->s.length()));
		
		System.out.println(grouped);
	}
}
