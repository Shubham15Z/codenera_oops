/*
9. Find the Average of Elements in an ArrayList
   - Task: Write a program to calculate and print the average of elements in an ArrayList<Integer>.
   java
   ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
 */

package arraylist.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class Question9 
{
	public static double findAverage(ArrayList<Integer> l1)
	{
		int sum = 0;
		for(Integer num : l1)
		{
			sum += num;
		}
		return sum/l1.size();
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		double avg = findAverage(list);
		System.out.println("Average of list element is : "+avg);
	}
}
