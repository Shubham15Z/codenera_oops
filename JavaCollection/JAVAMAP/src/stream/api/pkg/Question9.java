/*
9. Sort Strings by Length  
   - Question: Sort a list of strings by their length in ascending order.
   - Input: ["apple", "banana", "kiwi", "cherry"]
   - Output: ["kiwi", "apple", "cherry", "banana"]
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9
{
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana", "kiwi", "cherry"));
		
		List<String> sortedList = list1.stream().sorted((s1,s2) -> s1.length() - s2.length()).collect(Collectors.toList());
		
		System.out.println(sortedList);
		
	}
}
