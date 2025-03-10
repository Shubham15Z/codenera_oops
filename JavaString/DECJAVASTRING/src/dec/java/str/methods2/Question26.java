/*
 26. Write a program to swap the first and last character of a string. 
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question26 
{
	void swapFirstLast(String s1)
	{
		char first = s1.charAt(0);
		char last = s1.charAt(s1.length()-1);
		
		String s2 = last + s1.substring(1,s1.length()-1) + first; 
		
		System.out.println(s2);
	}
	
	void swapFirstLast1(String s1)
	{
		char[] ch = s1.toCharArray();
		
		char temp = ch[0];
		ch[0] = ch[ch.length-1];
		ch[ch.length-1] = temp;
		
		String res = new String(ch);
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question26 q26 = new Question26();
//		q26.swapFirstLast(s1);
		q26.swapFirstLast1(s1);
	}
}
