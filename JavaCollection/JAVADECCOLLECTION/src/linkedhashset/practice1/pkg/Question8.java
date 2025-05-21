/*
8. Reverse Elements Using LinkedHashSet
   Write a program to reverse the order of elements in a LinkedHashSet by adding them to a list 
   and printing them in reverse order.
 */

package linkedhashset.practice1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question8 
{
	public static void main(String[] args) 
	{
		Set<Integer> set1 = new LinkedHashSet<Integer>(Arrays.asList(10,30,50,80,150));
		
		List<Integer> list1 = new ArrayList<Integer>(set1);
		
		Collections.reverse(list1);
		
		System.out.println("Reverse of list : "+list1);
	
	}
}
