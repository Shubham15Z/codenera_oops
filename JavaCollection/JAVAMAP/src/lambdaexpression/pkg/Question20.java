/*
20. Sum of Squares of Even Numbers: Given a list of integers, use a lambda expression to filter even numbers, 
square them, and calculate the sum of these squares.
 */

package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface CalSum
{
	public int findSum(List<Integer> l1);
}
public class Question20 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2,5,8,3,9,6));
		
		CalSum cl1 = (List<Integer> l1) -> {
			int sum = 0;
			for(int num : l1)
			{
				if(num % 2 == 0)
				{
					sum += num*num;
				}
			}
			return sum;
		};
		
		int res = cl1.findSum(list1);
		System.out.println(res);
		
	}
}
