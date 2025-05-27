/*
7. Convert Strings to Uppercase  
   - Question: Convert a list of strings to uppercase using a lambda expression.
   - Input: ["apple", "banana", "cherry"]
   - Output: ["APPLE", "BANANA", "CHERRY"]
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry"));
		
		List<String> upper = list1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upper);
	}
}
