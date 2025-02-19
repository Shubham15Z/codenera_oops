/*
13. Write a method to find the cube of a given number.
 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question13 {
	double cubeNumber(int num)
	{
		return num*num*num;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Question13 ob = new Question13();
		
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		
		double res = ob.cubeNumber(n);
		System.out.println("The cube is :"+res);
	}
}
