/*
3. 
Print the backwards directions of LinkedList 
 */

package linkedlist.preactice2.pkg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Question3 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(121,111,132,34,54));
		
		ListIterator<Integer> itr = list.listIterator();
		while(itr.hasNext())
		{
			itr.next();
		}
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+" ");
		}
	}
}
