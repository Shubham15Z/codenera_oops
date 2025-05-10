/*
11. Sum of Even Numbers  
    - Question: Find the sum of all even numbers in a list.
    - Input: [1, 2, 3, 4, 5, 6]
    - Output: 12
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Question11 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		int sum = list1.stream().filter(i -> i%2 == 0).mapToInt(i -> i).sum();
		
		System.out.println("Sum of even numbers in list is : "+sum);
		
	}
}
