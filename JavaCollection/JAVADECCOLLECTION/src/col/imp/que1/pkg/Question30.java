/*
30. Check for Palindromic Strings  
    - Question: Check if a list of strings contains any palindromic string.
    - Input: ["apple", "level", "banana"]
    - Output: true
 */


package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question30 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("apple", "level", "banana"));
		
		boolean res = list1.stream().anyMatch(s -> {
			String rev = "";
			for(int i = s.length()-1; i >= 0; i--)
			{
				rev += s.charAt(i);
			}
			
			return rev.equals(s);
		});
		
		System.out.println(res);
	}
}
