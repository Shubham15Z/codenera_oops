/*
 Q21. Wap enter a string and print all duplicate character.
 */
package dec.java.str.methods;

import java.util.Scanner;

public class Question21 
{
	void printDuplicate(String s1)
	{
		char [] ch = s1.toCharArray();
		for(int i = 0; i < ch.length; i++)
		{
			for(int j = i+1; j < ch.length; j++)
			{
				if(ch[i] == ch[j])
				{
					System.out.println("Duplicate character is : "+ch[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s1 = sc.nextLine();
		
		Question21 q21 = new Question21();
		q21.printDuplicate(s1);
	}
}
