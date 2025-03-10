/*
Q16.Wap enter a string and print substring of any given range.
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question16
{
	void printSubstring(String s1)
	{
		System.out.println(s1.substring(2,8));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s1 = sc.nextLine();
		
		Question16 q16 = new Question16();
		q16.printSubstring(s1);
	}
}
