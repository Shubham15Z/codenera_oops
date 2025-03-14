/*
 Q7.Wap enter a string and check it is anagram or not using constructor and  class and object.
 */

package dec.java.str.method.assign02.pkg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Question7 
{
	private String s1;
	private String s2;
	
	Question7()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first String : ");
		this.s1 = sc.nextLine();
		
		System.out.println("Enter a second String : ");
		this.s2 = sc.nextLine();
		
		sc.close();
	}
	
	boolean isAnagram()
	{
		if(s1.length() != s2.length())
			return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}
	
	void display()
	{
		if(isAnagram())
			System.out.println("The strings are anagram...");
		else
			System.out.println("The strings are not anagram...");
	}
	
	public static void main(String[] args) 
	{
		Question7 q7 = new Question7();
		q7.display();
	}
}
