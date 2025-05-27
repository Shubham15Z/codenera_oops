/*
12. Product of Odd Numbers  
    - Question: Find the product of all odd numbers in a list.
    - Input: [1, 2, 3, 4, 5]
    - Output: 15
 */


package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question12 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		int res = list1.stream().filter(i -> i%2 != 0).reduce((a,b) -> a*b).orElse(1);
		
		System.out.println(res);
	}
}
