/*
19.Write a program to extract a substring from a string without using the substring() method.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question19 
{
	void printSubString(String s1,int start, int end)
	{
		String s2 = "";
		for(int i = start; i <= end; i++)
		{
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a start index :");
		int start = sc.nextInt();
		
		System.out.println("Enter a end index :");
		int end = sc.nextInt();
		
		Question19 q19 = new Question19();
		q19.printSubString(s1,start,end);
	}
}
