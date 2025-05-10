/*
10. Concatenate Strings  
    - Question: Concatenate all strings in a list separated by commas.
    - Input: ["apple", "banana", "cherry"]
    - Output: "apple, banana, cherry"
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Question10 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana","cherry"));
		
		String result = list1.stream().collect(Collectors.joining(", "));
		
		System.out.println(result);
	}
}
