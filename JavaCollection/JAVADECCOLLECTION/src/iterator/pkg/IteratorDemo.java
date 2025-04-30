package iterator.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList(Arrays.asList(10,30,50,60,80));
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
//			itr.remove();
		}
		
		System.out.println(al);
	}
}
