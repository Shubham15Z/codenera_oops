/*

11.Create a LinkedHashSet and sort its elements using a List.
 */

package linkedhashset.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Question11 
{
	public static void main(String[] args) 
	{
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(30);
		l1.add(20);
		l1.add(5);
		l1.add(90);
		l1.add(20);
		l1.add(2);
		
		List l2 = new ArrayList(l1);
		
		System.out.println(l1);
		Collections.sort(l2);
		System.out.println(l2);
	}
}
