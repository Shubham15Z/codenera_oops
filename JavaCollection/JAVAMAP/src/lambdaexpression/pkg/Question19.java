/*
19. Filter and Transform List: Given a list of integers, filter only the odd numbers and then double each of 
them using a lambda expression.
 */

package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@FunctionalInterface
interface CheckOdd19
{
	public void checkOdd(List<Integer> l1);
}

public class Question19
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,3,30,13,50,20,5));
		System.out.println(list1);
		List<Integer> list2 = new ArrayList<Integer>();
		
		CheckOdd19 c1 = (List<Integer> l1) -> {
			for(int num : l1)
			{
				if(num % 2 != 0)
					list2.add(num*2);
				else
					list2.add(num);
			}
			System.out.println(list2);
		};
		
		c1.checkOdd(list1);
	}
}