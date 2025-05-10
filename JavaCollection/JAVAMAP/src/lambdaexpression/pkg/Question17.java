/*
17. Check If List Contains Odd Numbers: Write a lambda expression to check if a list of integers contains any odd numbers.
 */

package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface CheckOdd
{
	public boolean checkOdd(List<Integer> l1);
}

public class Question17
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,30,50,20,5));
		
		CheckOdd c1 = (List<Integer> l1) -> {
			for(int num : l1)
			{
				if(num % 2 != 0)
					return true;
			}
			return false;
		};
		
		boolean res = c1.checkOdd(list1);
		System.out.println(res);
	}
}
