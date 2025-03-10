/*
Q15.Wap enter a string and and remove last character and print final string.
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question15 
{
	void removeLastCharacter(String s1)
	{
		System.out.println("Before : "+s1);
		System.out.println("After : "+s1.substring(0, (s1.length()-1)));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question15 q15 = new Question15();
		q15.removeLastCharacter(s1);
	}
}
