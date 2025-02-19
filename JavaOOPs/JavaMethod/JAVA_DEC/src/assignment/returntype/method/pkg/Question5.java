/*
 5, WAP TO PRINT FACTORIAL OF A NUMBER
 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question5 {
	
	 int factorialNum(int n)
	 {
		 int i = n;
		 int fact = 1;
		 while(i > 0)
		 {
			 fact = fact*i;
			 i--;
		 }
		 return fact;
	 }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		Question5 ob = new Question5();
		int result = ob.factorialNum(n);
		System.out.println("The factorial is : "+result);
	}
}
