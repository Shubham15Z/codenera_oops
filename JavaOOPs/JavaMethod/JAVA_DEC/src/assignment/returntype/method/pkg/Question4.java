/*
4.Wap to print the reverse of number
 */
package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question4 {
	int reverseNumber(int n)
	{
		
		int rev = 0, rem;
		int i = n;
		while(i > 0)
		{
			rem = i % 10;
			rev = rev*10+rem;
			i = i/10;
		}
		return rev;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		Question4 ob = new Question4();
		int result = ob.reverseNumber(n);
		System.out.println("The reverse is : "+result);
	}
}
