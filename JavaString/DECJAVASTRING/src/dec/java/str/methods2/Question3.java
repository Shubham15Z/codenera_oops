/*
Write a program to concatenate two strings without using the concat() method.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question3 
{
	void lengthString(String s1,String s2)
	{
		System.out.println(s1+s2);
//		System.out.println(s1.concat(s2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		System.out.println("Enter a string :");
		String s2 = sc.nextLine();
		
		Question3 q3 = new Question3();
		q3.lengthString(s1,s2);
	}
}
