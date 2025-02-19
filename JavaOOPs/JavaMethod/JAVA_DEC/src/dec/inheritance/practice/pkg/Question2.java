/*
Wap to perform multilevel inheritance in which 

parent class will print numbers from f1 to l1 and also print sum and count
Child 1 class will print from f2 to l2 and also print sum and count
Child 2 class will print f3 to l3 and also print sum and count
.................................................................
 */

package dec.inheritance.practice.pkg;

import java.util.Scanner;

class ParentQ2
{
	void printNumberSumCount_1_F1ToL1(int f1, int l1)
	{
		int sum = 0, count = 0;
		for(int i = f1; i <= l1; i++)
		{
			System.out.print(i+" ");
			sum = sum + i;
			count++;
		}
		System.out.println();
		System.out.println("The sum is : "+sum);
		System.out.println("The count is : "+count);
	}
}

class Child1Q2 extends ParentQ2
{
	void printNumberSumCount_1_F2ToL2(int f2, int l2)
	{
		int sum = 0, count = 0;
		for(int i = f2; i <= l2; i++)
		{
			System.out.print(i+" ");
			sum = sum + i;
			count++;
		}
		System.out.println();
		System.out.println("The sum is : "+sum);
		System.out.println("The count is : "+count);
	}
}

class Child2Q2 extends Child1Q2
{
	void printNumberSumCount_1_F3ToL3(int f3, int l3)
	{
		int sum = 0, count = 0;
		for(int i = f3; i <= l3; i++)
		{
			System.out.print(i+" ");
			sum = sum + i;
			count++;
		}
		System.out.println();
		System.out.println("The sum is : "+sum);
		System.out.println("The count is : "+count);
	}
}

public class Question2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number for parent class:");
		int p1 = sc.nextInt();
		System.out.println("Enter the ending number for parent class:");
		int p2 = sc.nextInt();
		
		System.out.println("Enter the starting number for child1 class :");
		int c1 = sc.nextInt();
		System.out.println("Enter the ending number for child1 class:");
		int c2 = sc.nextInt();
		
		System.out.println("Enter the starting number for child2 class :");
		int c01 = sc.nextInt();
		System.out.println("Enter the ending number for child2 class:");
		int c02 = sc.nextInt();
		
		Child2Q2 ch2 = new Child2Q2();
		ch2.printNumberSumCount_1_F1ToL1(p1, p2);
		System.out.println("-----------------------");
		ch2.printNumberSumCount_1_F2ToL2(c1, c2);
		System.out.println("-----------------------");
		ch2.printNumberSumCount_1_F3ToL3(c01, c02);
		
		
	}
}
