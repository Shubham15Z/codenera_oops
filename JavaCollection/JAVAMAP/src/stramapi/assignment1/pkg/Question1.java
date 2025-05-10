/*
 Q1.Write a program to create a stream from a list of integers and print each element.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		list1.stream().forEach(i -> System.out.print(i+" "));
	}
}
