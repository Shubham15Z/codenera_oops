/*
5. Find Maximum Element  
   - Question: Find the maximum element in a list of integers using a lambda expression.
   - Input: [3, 7, 2, 9, 4]
   - Output: 9
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class Question5 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3, 7, 2, 9, 4));
		
		int max = list1.stream().max((a,b) -> a-b).orElseThrow();

		System.out.println("Max : "+max);
	}
}
