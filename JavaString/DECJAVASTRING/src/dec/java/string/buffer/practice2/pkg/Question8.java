/*
8. Create a class that takes an array of strings and removes duplicate words using StringBuffer and OOP principles. 
 */

package dec.java.string.buffer.practice2.pkg;

import java.util.Arrays;

public class Question8 
{
	void removeDuplicateWords(String[] s1)
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < s1.length; i++)
		{
			boolean isDuplicate = false;
			
			String[] parts = sb.toString().split(" ");
			
			for(String part : parts)
			{
				if(part.equalsIgnoreCase(s1[i]))
				{
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate)
			{
				sb.append(s1[i]).append(" ");
			}
		}
		
		System.out.println("Array after removing duplicate words is : ");
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		String[] s1 = {"Hello", "java", "is", "Hello", "I", "am", "java", "fine", "Is"};

		Question8 q8 = new Question8();
		q8.removeDuplicateWords(s1);
	}
}
