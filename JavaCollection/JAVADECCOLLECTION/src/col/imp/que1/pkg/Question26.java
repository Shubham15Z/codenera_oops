/*
26. Check if All Even  
    - Question: Check if all elements in a list of integers are even.
    - Input: [2, 4, 6, 8]
    - Output: true
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question26 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2,4,6,8));
		
		boolean res = list1.stream().allMatch(i -> i%2 == 0);
		
		System.out.println(res);
	}
}
