/*
 Write a program to count the number of vowels in a string.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question7 
{
	public int countVowels(String s1)
	{
		String s2 = "aeiouAEIOU";
		int count = 0;
//		for(int i = 0; i < s1.length(); i++)
//		{
//			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u' ||
//			   s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O' || s1.charAt(i) == 'U')
//			{
//				count++;
//			}
//		}
		
		for(int i = 0; i < s1.length(); i++)
		{
			for(int j = 0; j < s2.length(); j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question7 q7 = new Question7();
		int result = q7.countVowels(s1);
		System.out.println("Count of vowels is : "+result);
	}
}
