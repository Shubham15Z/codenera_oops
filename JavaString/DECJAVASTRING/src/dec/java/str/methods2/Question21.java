/*
21. Write a program to check if a string is a palindrome. 
*/

package dec.java.str.methods2;

import java.util.Scanner;

public class Question21 
{
	void checkPalindrome(String s1)
	{
		String s2 = "";
		
		for(int i = s1.length()-1; i >= 0; i--)
		{
			s2 = s2+s1.charAt(i);
		}
		
		if(s1.equals(s2))
		{
			System.out.println("It is palindrome...");
		}
		else
		{
			System.out.println("It is not palindrome...");
		}		
	}
	
	boolean isPalinddrome(String s1)
	{
		int left = 0; 
		int right = s1.length()-1;
		
		while(left < right)
		{
			if(s1.charAt(left) != s1.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string 1 :");
		String s1 = sc.nextLine();	
		
		Question21 q21 = new Question21();
//		q21.checkPalindrome(s1);
		boolean result = q21.isPalinddrome(s1);
		if(result == true)
		{
			System.out.println("It is palindrome...");
		}
		else
			System.out.println("It is not palindrome..");
	}
}
