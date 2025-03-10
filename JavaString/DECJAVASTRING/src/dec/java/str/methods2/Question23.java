/*
23. Write a program to print each character of a string separately. 
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question23 
{
	void printString(String s1)
	{
		for(int i = 0; i < s1.length(); i++)
		{
			System.out.print(s1.charAt(i)+", ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question23 q23 = new Question23();
		q23.printString(s1);
	}
}
