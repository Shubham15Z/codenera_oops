/*
Q1.Wap enter a string and print it in a reverse order word by word.
 */

package dec.java.str.method.assign02.pkg;

import java.util.Scanner;

public class Question1 
{
	void printReverse(String s1)
	{
		for(int i = s1.length()-1; i >= 0; i--)
		{
			System.out.print(s1.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question1 q1 = new Question1();
		q1.printReverse(s1);
		
	}
}
