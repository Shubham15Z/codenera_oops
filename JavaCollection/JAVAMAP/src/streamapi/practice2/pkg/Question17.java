/*
Q17. Write a program to group elements of a list by their lengths using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question17 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("Java", "Python","Devops","Angular","React"));
		
		Map<Integer, List<String>> grouped = list1.stream().collect(Collectors.groupingBy(s -> s.length()));
		
		System.out.println(grouped);
		
		grouped.forEach((length, words) -> {
			System.out.println("Length "+length+" : "+words);
		});
	}
}
