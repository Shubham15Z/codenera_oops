/*
 Q20.Wap enter a string and find the count of white space.
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question20 
{	
	void findCount(String s1)
	{
		int count = 0;
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == ' ')
			{
				count++;
			}
		}
		System.out.println("Count of white space is : "+count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s1 = sc.nextLine();
		
		Question20 q20 = new Question20();
		q20.findCount(s1);
	}
}
