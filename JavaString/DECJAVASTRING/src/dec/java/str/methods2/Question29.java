/*
 29. Write a program to find the frequency of a given character in a string. 
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question29 
{
	void frequencyOfChar(String s1, char c1)
	{
		int freq = 0;
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == c1)
			{
				freq++;
			}
		}
		System.out.println("Frequency of char "+c1+" is : "+freq);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a Character : ");
		char c1 = sc.next().charAt(0);
		
		Question29 q29 = new Question29();
		q29.frequencyOfChar(s1,c1);
	}
}
