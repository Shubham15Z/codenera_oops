/*
4.enter a string by user and search particular character and print its no
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question4 
{
	void findIndex(String s1, char c1)
	{
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == c1)
			{
				System.out.print("Character "+c1+" is present at index : "+i);
			}	
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a character to search :");
		char c1 = sc.next().charAt(0);
		
		Question4 q4 = new Question4();
		q4.findIndex(s1,c1);
	}
}
