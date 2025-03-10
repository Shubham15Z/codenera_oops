/*
12.Wap to show 1-1 example of these string methods:
charAt
CompareTo
CompareToignore
Concat
Contains
trim
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question12
{
	void charAtMethod(String s1)
	{
		System.out.println("charAt method : ");
		for(int i = 0; i < s1.length(); i++)
		{
			System.out.print(s1.charAt(i)+",");
		}
	}
	
	void compareToMethod(String s1)
	{
		System.out.println();
		String s2 = new String("Rahul");
		System.out.println(s1.compareTo(s2));
	}
	
	void compareToIgnoreMethod(String s1)
	{
		System.out.println();
		String s2 = "Rahul";
		System.out.println(s1.compareToIgnoreCase(s2));
	}
	
	void concatMethod(String s1)
	{
		String s2 = "Hi ";
		System.out.println(s2.concat(s1));
	}
	
	void containsMethod(String s1)
	{
		System.out.println(s1.contains("rah"));
	}
	
	void trimMethod(String s1)
	{
		System.out.println(s1.trim());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question12 q12 = new Question12();
		q12.charAtMethod(s1);
		System.out.println();
		System.out.println("----------------");
		q12.compareToMethod(s1);
		System.out.println("----------------");
		q12.compareToIgnoreMethod(s1);
		System.out.println();
		System.out.println("----------------");
		q12.concatMethod(s1);
		System.out.println();
		System.out.println("----------------");
		q12.containsMethod(s1);
		System.out.println();
		System.out.println("----------------");
		q12.trimMethod(s1);
	}
}
