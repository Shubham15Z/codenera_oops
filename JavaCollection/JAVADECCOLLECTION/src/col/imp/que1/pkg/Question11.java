/*
11. Sum of Even Numbers  
    - Question: Find the sum of all even numbers in a list.
    - Input: [1, 2, 3, 4, 5, 6]
    - Output: 12
 */
package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question11 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
//		int sum = list1.stream().filter(i -> i%2 == 0).reduce((a,b) -> a+b).orElse(0);
		
		int sum =list1.stream().filter(i -> i%2 == 0).collect(Collectors.summingInt(i -> i));
		
		System.out.println("Even Sum : "+sum);
	}
}
