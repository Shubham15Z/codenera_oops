/*
9. Write a program to count the number of spaces in a string.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question9 
{
	public int countSpace(String s1)
	{
		int count = 0;
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == ' ')
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question9 q9 = new Question9();
		int result = q9.countSpace(s1);
		System.out.println("Count of Space is : "+result);
	}
}
