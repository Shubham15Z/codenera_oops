/*
29. All Strings Have Length Greater Than N  
    - Question: Check if all strings in a list have a length greater than n.
    - Input: ["apple", "banana", "cherry"], n = 4
    - Output: true
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question29 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry"));
		int n = 4;
		boolean res = list1.stream().allMatch(s -> s.length() > n);
		
		System.out.println(res);
	}
}
