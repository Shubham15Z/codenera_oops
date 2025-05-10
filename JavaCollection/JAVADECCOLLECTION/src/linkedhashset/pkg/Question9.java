/*
9.Given a list of numbers with duplicates, use a LinkedHashSet to remove duplicates and maintain insertion order.
 */

package linkedhashset.pkg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question9 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(10,40,20,67,10,30,20,33);
		
		Set<Integer> uniqueNumbers = new LinkedHashSet(numbers);
		
		System.out.println("Given : "+numbers);
		System.out.println("Unique : "+uniqueNumbers);
	}
}
