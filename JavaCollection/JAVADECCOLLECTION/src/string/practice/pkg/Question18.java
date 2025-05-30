/*
Q18. Ordering of strings (walmart)
You will be given N number of strings. You have to find the lexicographically smallest string and
the lexicographically largest string among these strings.
Example 1:
Input:
N = 3
strings = w , ab ,b, abc
Output: a abc
Explanation: Lexicographically smallest is
"a" and lexicographically largest is
"abc".
 */


package string.practice.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question18 
{
	public static void main(String[] args) 
	{
		List<String> l1 = Arrays.asList("a","ab","abc");
		
		String minString =  l1.stream().min((s1,s2) -> s1.compareTo(s2)).orElse(null);
		System.out.println(minString);
		
		String maxString = l1.stream().max((s1,s2) -> s1.compareTo(s2)).orElse(null);
		System.out.println(maxString);
	}
}
