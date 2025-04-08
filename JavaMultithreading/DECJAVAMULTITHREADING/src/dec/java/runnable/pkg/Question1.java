/*
7. Check if Two Strings are Isomorphic
   Problem Description:  
   Write a Java program to check if two strings are isomorphic using a HashMap. 
   Two strings are isomorphic if the characters in one string can be replaced to get the other string.

   Input: Two strings.  
   Output: true or false.

   Example:
   - Input: "foo", "bar"
   - Output: false

   - Input: "egg", "add"
   - Output: true
 */

package dec.java.runnable.pkg;

import java.util.Scanner;

class MyThread01 implements Runnable
{
	public boolean checkIsomorphic()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String s1 = sc.nextLine();
		System.out.println("Enter second string : ");
		String s2 = sc.nextLine();
		
		if(s1.length() != s2.length())
			return false;
		
		
		return false;
	}

	@Override
	public void run() 
	{
		
	}
}
public class Question1 {

}
