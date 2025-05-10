/*
8. Find Strings Starting with a Letter  
   - Question: Filter strings that start with the letter A (case-insensitive).
   - Input: ["apple", "banana", "avocado", "cherry"]
   - Output: ["apple", "avocado"]
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana", "avocado", "cherry"));
		char ch = 'A';
		List<String> words = list1.stream().filter(s1 -> s1.toUpperCase().charAt(0) ==ch).collect(Collectors.toList());
		System.out.println("Words start with A : "+words);
	}
}
