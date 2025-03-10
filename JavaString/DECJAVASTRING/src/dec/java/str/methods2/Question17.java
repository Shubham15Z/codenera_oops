/*
17. Write a program to reverse a string without using built-in functions.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question17 
{
	void reverseString(String s1)
	{
		String s2 = "";
		for(int i = s1.length()-1; i >= 0; i--)
		{
			s2 = s2+s1.charAt(i);
		}
//		System.out.println(s2);
	}
	
	public String reverseString1(String s1)
	{
		char ch [] = s1.toCharArray();
		
		int left = 0; 
		int right = s1.length()-1;
		
		while(left < right)
		{
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			right--;
			left++;
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		
		Question17 q17 = new Question17();
		q17.reverseString(s1);
		String result = q17.reverseString1(s1);
		System.out.println(result);
		
	}
}
