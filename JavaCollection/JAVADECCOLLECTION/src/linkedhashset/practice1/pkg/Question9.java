/*
9. Convert LinkedHashSet to Array
   Write a program to convert a LinkedHashSet of strings into an array and print the array.
 */

package linkedhashset.practice1.pkg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question9 
{
	public static void main(String[] args)
	{
		Set<String> set1 = new LinkedHashSet<String>(Arrays.asList("Ajay","Vishal","Mayur","Kirti","Pooja"));
		
		String[] arr = new String[set1.size()];
		
		int i = 0;
		for(String word : set1)
		{
			arr[i] = word;
			i++;
		}
		
		String[] arr2 = set1.toArray(new String[0]);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}
}
