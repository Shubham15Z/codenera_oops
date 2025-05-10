/*
1. 
LinkedList(Arrays.asList(121,111,132,34,54);
 */

package linkedlist.preactice2.pkg;

import java.util.Arrays;
import java.util.LinkedList;

public class Question1 
{
	public static void printPalindrome(LinkedList<Integer> l1)
	{
		for(Integer num : l1)
		{
			int rev = 0;
			int i = num;
			while(i > 0)
			{
				int rem = i % 10;
				rev = rev*10 + rem;
				i=i/10;
			}
			if(rev == num)
			{
				System.out.print(num+" ");
			}
		}	
	}
	
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList(Arrays.asList(121,111,132,34,54));
		printPalindrome(list);
	}
}
