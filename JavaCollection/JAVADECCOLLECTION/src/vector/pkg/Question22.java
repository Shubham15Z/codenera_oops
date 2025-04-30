/*
22. Write a program to create a vector of strings and check if it contains a 
specific substring.
 */

package vector.pkg;

import java.util.Vector;

public class Question22 
{
	public static void main(String[] args)
	{
		Vector<String> v1 = new Vector<String>();
		v1.add("Ajay");
		v1.add("Rahul");
		v1.add("Vishal");
		v1.add("Ram");
		v1.add("Manish");
		
		String substring = "Visy";
		boolean found = false;
		for(String name : v1)
		{
			if(name.contains(substring))
			{
				found = true;
				break;
			}
			
		}
		if(found)
		{
			System.out.println("Substring is present");
		}
		else
		{
			System.out.println("Substring not found");
		}
		
		
		
		
//		System.out.println(v1.contains("Aja"));
	}
}
