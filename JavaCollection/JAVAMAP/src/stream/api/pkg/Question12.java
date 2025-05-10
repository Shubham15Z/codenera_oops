/*
12. Product of Odd Numbers  
    - Question: Find the product of all odd numbers in a list.
    - Input: [1, 2, 3, 4, 5]
    - Output: 15
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class Question12
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		int result = list1.stream().filter(i -> i%2 !=0).reduce(1, (n1,n2) -> n1*n2);
		
		System.out.println(result);
	}
}
