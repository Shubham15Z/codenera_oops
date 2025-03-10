/*
 Q13.Write a Java program to find reverse of a string using class and object.
 */
package dec.java.str.methods;

import java.util.Scanner;

public class Question13
{
	void reverseString1(String s1)
	{
		String s2 = "";
		for(int i = s1.length()-1; i >= 0; i--)
		{
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);
		
	}
	
	public String reverseString2(String s1)
	{
		int left = 0; 
		int right = s1.length()-1;
		char [] ch = s1.toCharArray();
		
		while(left < right)
		{
			char temp = ch[right];
			ch[right] = ch[left];
			ch[left] = temp;
			right--;
			left++;
		}
		
		return new String(ch);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		
		Question13 q13 = new Question13();
		q13.reverseString1(s1);
		
		System.out.println("------------------");
		String result = q13.reverseString2(s1);
		System.out.println(result);
	}
}
