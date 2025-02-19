/*
9. Write a method to find the greatest of three numbers.
 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question9 {
	
	int gereatestNumber(int n1, int n2, int n3)
	{
		if(n1 > n2 && n1 > n3)
		{
			return n1;
		}
		else if(n2 > n3)
		{
			return n2;
		}
		else
		{
			return n3;
		}
	}
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		Question9 ob = new Question9();
		
		System.out.println("Enter the three numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int number = ob.gereatestNumber(n1, n2, n3);
		System.out.println("The greates number is : "+number);
		
	}
}
