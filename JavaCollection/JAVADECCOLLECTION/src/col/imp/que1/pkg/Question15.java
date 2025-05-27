/*
15. Group by First Character  
    - Question: Group a list of strings by their first character.
    - Input: ["apple", "avocado", "banana", "blueberry", "cherry"]
    - Output: {a=[apple, avocado], b=[banana, blueberry], c=[cherry]}
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question15 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("apple", "avocado", "banana", "blueberry", "cherry"));
		
		Map<Character, List<String>> m1 = list1.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
		
		System.out.println(m1);
	}
}
