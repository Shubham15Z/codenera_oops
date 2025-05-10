/*
 Q21. Write a program to remove duplicate elements from a list using streams.
 */

package stramapi.assignment1.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question21
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10, 20, 10, 30, 40, 20, 50);

        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        
        System.out.println(uniqueList);
	}
}
