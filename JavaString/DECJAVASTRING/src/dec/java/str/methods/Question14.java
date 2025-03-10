/*
 Q14.Wap enter a string and and remove first character and print final string.
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question14 
{
	void removeFirstCharacter(String s1)
	{
		System.out.println(s1);
		System.out.println(s1.substring(1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question14  q14 = new Question14();
		q14.removeFirstCharacter(s1);
		
	}
}
