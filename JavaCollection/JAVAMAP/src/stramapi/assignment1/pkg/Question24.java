/*
Q24. Implement a program to find the cumulative sum of elements in a list using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Question24 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = list.stream()
                                          .map(sum::addAndGet)
                                          .collect(Collectors.toList());
        
        System.out.println(cumulativeSum);
	}
}
