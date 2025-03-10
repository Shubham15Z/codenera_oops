/*
Q19.Write a Java program to find first occurrence of a character in a given string.
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question19 {
	void findFirstOccurence(String s1, char c1)
	{
		System.out.println(s1.indexOf(c1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a Character to check first occurence : ");
		char c1 = sc.next().charAt(0);
		
		Question19 q19 = new Question19();
		q19.findFirstOccurence(s1,c1);
	}
}
