/*
Q1.Write a program to create a stream from a list of integers and print each element.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,40,30,90,50));
		
		list1.stream().forEach(i -> System.out.print(i+" "));
	}
}
