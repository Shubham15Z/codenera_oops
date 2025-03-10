/*
 Q18.Wap enter a string and use endwith() and startwith() method.
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question18 
{
	void checkStringStartEnd(String s)
	{
		System.out.println(s.startsWith("I"));
		System.out.println(s.startsWith("i"));

		System.out.println(s.endsWith("p"));
		System.out.println(s.endsWith("e"));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s1 = sc.nextLine();
		
		Question18 q18 = new Question18();
		q18.checkStringStartEnd(s1);
	}
}
