/*
7. Convert Strings to Uppercase  
   - Question: Convert a list of strings to uppercase using a lambda expression.
   - Input: ["apple", "banana", "cherry"]
   - Output: ["APPLE", "BANANA", "CHERRY"]
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 
{
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry"));
		
		List<String> uppercase = list1.stream().map(s1 -> s1.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Uppercase : "+uppercase);
		
	}
}
