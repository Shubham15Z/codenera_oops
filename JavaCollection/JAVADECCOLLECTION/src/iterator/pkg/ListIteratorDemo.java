package iterator.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorDemo 
{
	public static void main(String[] args) 
	{
		ArrayList l1 = new ArrayList(Arrays.asList(10,40,20,50,30,90));
		
		ListIterator li = l1.listIterator();
		
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println("------------------");
		System.out.println(li.previous());
		System.out.println(li.previous());
		System.out.println(li.previous());
		
		System.out.println("------------------");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}
