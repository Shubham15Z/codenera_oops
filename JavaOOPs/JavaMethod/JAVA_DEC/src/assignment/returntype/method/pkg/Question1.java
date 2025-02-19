/*
1.Wap to input a number and check it is palindrome or not
 */
package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question1 {
	
	String checkPalindrome(int n)
	{
		int rev = 0, rem;
		int i = n;
		while(i>0)
		{
			rem = i % 10;
			rev = rev*10 + rem;
			i = i/10;
		}
		
		if(rev == n)
		{
			return "Number is Palindrome";
		}
		else
		{
			return "Number is not Palindrome";
		}
	}
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		Question1 ob = new Question1();
		String result = ob.checkPalindrome(n);
		System.out.println(result);
	}
}
