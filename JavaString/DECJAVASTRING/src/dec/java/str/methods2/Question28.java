/*
28. Write a program to split a string into words and print each word separately. 
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question28 
{
	void splitString(String s1)
	{
		String[] words = s1.split("\\s+");
		
		System.out.println("Words in string are : ");
		
		for(String word : words)
		{
			System.out.println(word);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question28 q28 = new Question28();
		q28.splitString(s1);
	}
}
