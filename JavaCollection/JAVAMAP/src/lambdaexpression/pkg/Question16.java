/*
16. Multiply Each Element by 2: Given a list of integers, use a lambda expression to multiply 
each element by 2 and return the modified list.
 */

package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MultiplyNumber
{
	public List<Integer> multiplyByNum(List<Integer> l1, int mult);
}

public class Question16 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,30,50,20));
		
		int mult = 2;
		
		MultiplyNumber m1 = (List<Integer> l1, int mult1) -> {
			List<Integer> list2 = new ArrayList<Integer>();
			
			for(int num : l1)
			{
				list2.add(num*mult1);
			}
			return list2;
		};
		
		List<Integer> res = m1.multiplyByNum(list1, mult);
		System.out.println(res);
	}
}
