/*
14. Write a Java program to retrieve and remove the first element of a tree set.
15. Write a Java program to retrieve and remove the last element of a tree set.
16. Write a Java program to remove a given element from a tree set.
 */

package treeset.practice1.pkg;

import java.util.TreeSet;

public class Question14 
{
	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet();
		t1.add(20);
		t1.add(3);
		t1.add(8);
		t1.add(15);
		t1.add(6);
		t1.add(35);
		t1.add(4);
		t1.add(2);
		
		System.out.println(t1);
		
		System.out.println(t1.removeFirst());
		System.out.println(t1);
		
		System.out.println(t1.removeLast());
		System.out.println(t1);
		
		System.out.println(t1.remove(15));
		System.out.println(t1);
	}
}
