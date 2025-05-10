/*
10.Implement a method that accepts a List<String> and returns a LinkedHashSet<String> with duplicates removed.
 */

package linkedhashset.pkg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question10 
{
	public static LinkedHashSet<String> removeDuplicate(List<String> l1)
	{
		LinkedHashSet<String> unique = new LinkedHashSet(l1);
		return unique;
	}
	public static void main(String[] args) 
	{
		List<String> l1 = Arrays.asList("Ajay","Vishal","Ram","Ajay","Manish","Vishal");
		
		LinkedHashSet<String> res = removeDuplicate(l1);
		
		System.out.println("Gieven : "+l1);
		System.out.println("Unnique : "+res);
	}
}
