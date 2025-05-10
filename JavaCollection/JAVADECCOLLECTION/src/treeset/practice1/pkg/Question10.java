/*
10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
11. Write a Java program to get the element in a tree set less than or equal to the given element.
12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
13. Write a Java program to get an element in a tree set that has a lower value than the given element.
 */

package treeset.practice1.pkg;

import java.util.TreeSet;

public class Question10 
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
		
		System.out.println("Ceiling : "+t1.ceiling(16));
		
		System.out.println("Floor : "+t1.floor(7));
		
		System.out.println("Strictly greater than i.e. Higher : "+t1.higher(20));
		
		System.out.println("Lower : "+t1.lower(6));
		
	}
}
