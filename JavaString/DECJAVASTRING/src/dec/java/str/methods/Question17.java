/*
 Q17.Wap enter a string and check any particular string are present in it or not using contains().
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question17
{
	void checkString(String s1, String s2)
	{
		System.out.println(s1.contains(s2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a string to check :");
		String s2 = sc.nextLine();
		
		Question17 q17 = new Question17();
		q17.checkString(s1, s2);
	}
}
