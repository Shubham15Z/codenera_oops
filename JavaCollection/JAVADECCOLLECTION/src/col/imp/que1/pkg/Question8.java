/*
 8. Find Strings Starting with a Letter  
   - Question: Filter strings that start with the letter A (case-insensitive).
   - Input: ["apple", "banana", "avocado", "cherry"]
   - Output: ["apple", "avocado"]
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana", "avocado", "cherry"));
		
		List<String> startWithA = list1.stream().filter(s -> s.toLowerCase().startsWith("a")).collect(Collectors.toList());
		
		System.out.println(startWithA);
	}
}
