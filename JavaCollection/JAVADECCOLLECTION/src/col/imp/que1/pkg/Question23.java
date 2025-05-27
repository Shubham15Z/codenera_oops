/*
23. Concatenate Strings with Prefix  
    - Question: Concatenate strings with a prefix and suffix.
    - Input: ["apple", "banana", "cherry"], prefix="", suffix=""
    - Output: "apple, banana, cherry"
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question23 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry"));
		String prefix = "";
		String suffix = "";
		String delimiter = ", ";
	
		String res = list1.stream().collect(Collectors.joining(delimiter, prefix, suffix));
		
		System.out.println(res);
	}
}
