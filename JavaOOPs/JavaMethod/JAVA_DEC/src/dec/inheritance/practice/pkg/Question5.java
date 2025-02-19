/*
Wap to perform multilevel inheritance in which 

 class parent will print the numbers from first to last  Range , range is taken from user
 class  will print the even numbers from first1 to last1  Range , range is taken from user
 class OddPrint will print the odd numbers from first3 to last3  Range , range is taken from user
and also find count and sum
 */




package dec.inheritance.practice.pkg;

import java.util.Scanner;

class PrintAllQ5
{
	void printAll(int f1, int l1)
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

class EvenPrintQ5 extends PrintAllQ5
{
	void printEven(int f2, int l2)
	{
		int sum = 0, count = 0;
		for(int i = f2; i <= l2; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+" ");
				sum = sum+i;
				count++;
			}
		}
		System.out.println();
		System.out.println("The sum is : "+sum);
		System.out.println("The count is : "+count);
	}
}

class OddPrintQ5 extends EvenPrintQ5
{
	void printOdd(int f3, int l3)
	{
		int sum = 0, count = 0;
		for(int i = f3; i <= l3; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(i+" ");
				sum = sum+i;
				count++;
			}
		}
		System.out.println();
		System.out.println("The sum is : "+sum);
		System.out.println("The count is : "+count);
	}
}
public class Question5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number for printAll class:");
		int p1 = sc.nextInt();
		System.out.println("Enter the ending number for printAll class:");
		int p2 = sc.nextInt();
		
		System.out.println("Enter the starting number for PrintEven class :");
		int c1 = sc.nextInt();
		System.out.println("Enter the ending number for PrintEven class:");
		int c2 = sc.nextInt();
		
		System.out.println("Enter the starting number for PrintOdd class :");
		int c01 = sc.nextInt();
		System.out.println("Enter the ending number for PrintOdd class:");
		int c02 = sc.nextInt();
		
		OddPrintQ5 odd = new OddPrintQ5();
		odd.printAll(p1,p2);
		System.out.println("\n---------------------------");
		odd.printEven(c1,c2);
		System.out.println("\n---------------------------");
		odd.printOdd(c01,c02);
	}
}
