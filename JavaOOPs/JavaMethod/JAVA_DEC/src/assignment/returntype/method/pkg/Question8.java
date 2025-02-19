/*
8. Calculate perimeter of triangle, rectangle, square
 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question8 {
	int periTriangle(int s1, int s2, int s3)
	{
		return s1+s2+s3;
	}
	
	int periRectangle(int length, int breadth)
	{
		return 2*(length+breadth);
	}
	
	int periSquare(int side)
	{
		return 4*side;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Question8 ob = new Question8();
		
		System.out.println("Enter the 1st side of triangle : ");
		int s1 = sc.nextInt();
		System.out.println("Enter the 2nd side of triangle : ");
		int s2 = sc.nextInt();
		System.out.println("Enter the 3rd side of triangle : ");
		int s3 = sc.nextInt();
		int periTriangle = ob.periTriangle(s1,s2,s3);
		System.out.println("The perimeter of triangle is : "+periTriangle);
		
		System.out.println("Enter the length of rectangle : ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle : ");
		int breadth = sc.nextInt();
		int periRect = ob.periRectangle(length, breadth);
		System.out.println("The perimeter of Rectangle is : "+periRect);
		
		System.out.println("Enter the side of square : ");
		int s = sc.nextInt();
		int periSquare = ob.periSquare(s);
		System.out.println("The area of square is : "+periSquare);
		
		
	}
}
