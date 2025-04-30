/*
 Print All Prime Numbers from an ArrayList
   - Task: Given an ArrayList<Integer>, write a program to print all prime numbers.
   java
   ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));
 */

package arraylist.pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class printPrime 
{
	public static void printPrime(ArrayList<Integer> l1)
	{
		for (int i = 0; i < l1.size(); i++) 
		{
			int num = l1.get(i);
			int count = 0;
			for(int j = 1; j <= num; j++)
			{
				if(num % j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(num+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));
		printPrime(list);
	}
}
