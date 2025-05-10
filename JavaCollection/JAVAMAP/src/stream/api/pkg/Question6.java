/*
6. Filter Strings by Length  
   - Question: Given a list of strings, filter out strings with more than 3 characters.
   - Input: ["cat", "dog", "lion", "fox"]
   - Output: ["cat", "dog", "fox"]
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question6 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("cat", "dog", "lion", "fox"));
		
		List<String> result =  list1.stream().filter(s1 -> s1.length() <= 3).collect(Collectors.toList());
		
		System.out.println(result);
		
	}
}
