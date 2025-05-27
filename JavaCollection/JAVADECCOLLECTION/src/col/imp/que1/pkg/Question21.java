/*
21. Count Words in a List  
    - Question: Count occurrences of each word in a list.
    - Input: ["apple", "banana", "apple", "cherry", "banana"]
    - Output: {apple=2, banana=2, cherry=1}
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question21
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("apple", "banana", "apple", "cherry", "banana"));
		
		Map<String, Long> m1 = list1.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		
		System.out.println(m1);
	}
}
