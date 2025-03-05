/*
3.enter a string by user and convert it in upper case
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question3 
{
	void upperCase(String s1)
	{
		System.out.println(s1.toUpperCase());
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1 = sc.nextLine();
		
		Question3 q3 = new Question3();
		q3.upperCase(s1);
	}
}
