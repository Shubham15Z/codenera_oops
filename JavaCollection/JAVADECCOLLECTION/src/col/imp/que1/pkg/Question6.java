/*
6. Filter Strings by Length  
   - Question: Given a list of strings, filter out strings with more than 3 characters.
   - Input: ["cat", "dog", "lion", "fox"]
   - Output: ["cat", "dog", "fox"]
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question6 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("cat", "dog", "lion", "fox"));
		
		List<String> result = list1.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
		
		System.out.println(result);
	}
}
