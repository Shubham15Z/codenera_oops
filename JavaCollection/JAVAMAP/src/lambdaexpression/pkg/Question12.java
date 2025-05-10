/*
12. Calculate Average of a List: Given a list of integers, use a lambda expression to calculate their average.

 */

package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface CalculateAverage
{
	public double calcAvg(List<Integer> l1);
}
public class Question12 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,30,50,20));
		
		CalculateAverage c1 = (List<Integer> li1) -> {
			int sum = 0;
			for(int num : li1)
			{
				sum += num;
			}
			return sum/li1.size();
		};
		
		double res = c1.calcAvg(list1);
		System.out.println("Average is : "+res);
	}
}
