/*
18. Write a program to count the number of words in a string
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question18 
{
	void countWords(String s1)
	{
		int count = 1;
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == ' ')
			{
				count++;
			}

		}
		System.out.println("count of words is : "+count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		
		Question18 q18 = new Question18();
		q18.countWords(s1);
	}
}
