/*
28. Delete the last character of a StringBuffer dynamically and print the result. 
 */

package dec.java.string.buffer.pkg;

import java.util.Scanner;

public class Question28 
{
	void deleteLastChar(StringBuffer sb1)
	{
		sb1.deleteCharAt(sb1.length()-1);
		
		System.out.println(sb1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		StringBuffer sb1 = new StringBuffer(s1);
		
		Question28 q28 = new Question28();
		q28.deleteLastChar(sb1);
	}
}
