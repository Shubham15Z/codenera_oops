/*
 19. Write a program to remove duplicate elements from a vector.
 */

package vector.pkg;

import java.util.Vector;

public class Question19 
{
	public static Vector<Integer> removeDuplicate(Vector<Integer> v1)
	{
		Vector<Integer> result = new Vector<Integer>();
		
		for(Integer n1 : v1)
		{
			if(!result.contains(n1))
			{
				result.add(n1);
			}
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(50);
		v1.add(10);
		v1.add(80);
		v1.add(50);
		
		System.out.println(v1);
		
		Vector<Integer> v2 =  removeDuplicate(v1);
		
		System.out.println(v2);
		
	}
}
