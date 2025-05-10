/*
Q22. Implement a program to find the intersection of two lists using streams.
 */

package stramapi.assignment1.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QUestion22 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 70);

        List<Integer> intersection = list1.stream().filter(list2::contains) .collect(Collectors.toList());
        
        System.out.println(intersection);
                                          
                                         
	}
}
