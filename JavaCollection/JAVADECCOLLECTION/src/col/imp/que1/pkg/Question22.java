/*
22. Find Longest Word  
    - Question: Find the longest word in a list of strings.
    - Input: ["apple", "banana", "kiwi", "watermelon"]
    - Output: "watermelon"
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question22 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana", "kiwi", "watermelon"));
		
		String max = list1.stream().max(Comparator.comparingInt(s -> s.length())).orElse(null);
		
		System.out.println(max);
	}
}
