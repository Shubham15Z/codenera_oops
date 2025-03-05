/*
2.enter a string by user and convert it in lower case
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question2 
{
	public void lowerCase(String s1)
	{
		System.out.println(s1.toLowerCase());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question2 q2 = new Question2();
		q2.lowerCase(s1);
	}
}
