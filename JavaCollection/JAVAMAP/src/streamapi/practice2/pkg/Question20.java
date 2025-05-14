/*
Q20. Implement a program to find the longest string in a list using streams.
 */


package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question20
{
	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("Java", "Python","Devops","Angular","React"));
		
		String max = list1.stream().max((s1,s2) -> s1.length()-s2.length()).orElse(null);
		System.out.println(max);
		
		List<String> list2 = list1.stream().sorted((s1,s2) -> s2.length()-s1.length()).collect(Collectors.toList());
		System.out.println(list2);
		System.out.println(list2.get(0));
	}
}
