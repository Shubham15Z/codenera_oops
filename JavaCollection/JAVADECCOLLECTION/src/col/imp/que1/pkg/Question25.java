/*
25. Sum of Squares of Distinct Elements  
    - Question: Find the sum of squares of distinct elements in a list.
    - Input: [1, 2, 2, 3, 3]
    - Output: 14 (1^2 + 2^2 + 3^2)
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question25 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3));
		
//		int sum = list1.stream().distinct().map(i -> i*i).reduce((i1,i2) -> i1+i2).orElse(0);
		
		int sum = list1.stream().distinct().mapToInt(i -> i*i).sum();
		
		System.out.println(sum);
	}
}
