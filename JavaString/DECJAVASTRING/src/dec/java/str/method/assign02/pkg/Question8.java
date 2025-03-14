/*
Q8.Wap enter a string and print most repeated character in string.
 */

package dec.java.str.method.assign02.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Question8 
{
	private String s1;
	
	Question8()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		this.s1 = sc.nextLine();
		
		sc.close();
	}
	
	char mostRepeatedChar()
	{
		char mostRep = '\0';
		int maxCount = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			int count = 0;
			char currentChar = s1.charAt(i);
			
			for(int j = 0; j < s1.length(); j++)
			{
				if(s1.charAt(j) == currentChar)
				{
					count++;
				}
			}
			if(count > maxCount)
			{
				maxCount = count;
				mostRep = currentChar;
			}
		}
		return mostRep;
	}
	
	void display()
	{
		char c1 = mostRepeatedChar();
		
		System.out.println("Most Repeating character is : "+c1);
	}
	
	public static void main(String[] args) 
	{
		Question8 q8 = new Question8();
		q8.display();
	}
}
