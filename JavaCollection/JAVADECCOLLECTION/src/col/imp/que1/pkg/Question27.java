/*
27. Check if Any String Starts with Capital  
    - Question: Check if any string in the list starts with a capital letter.
    - Input: ["hello", "world", "Java"]
    - Output: true
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question27
{
	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("hello", "world", "Java"));
		
		boolean res = list1.stream().anyMatch(s -> Character.isUpperCase(s.charAt(0)));
		
		System.out.println(res);
	}
}
