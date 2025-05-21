/*
10. Subset Check
   Given two LinkedHashSets, write a program to check if the first set is a subset of the second set.
 */

package linkedhashset.practice1.pkg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question10 
{
	public static void main(String[] args) 
	{
		Set<Integer> set1 = new LinkedHashSet<Integer>(Arrays.asList(3,4));
		Set<Integer> set2 = new LinkedHashSet<Integer>(Arrays.asList(3,4,5,6));
		
		System.out.println(set2.containsAll(set1));
	}
}
