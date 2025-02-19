/*
Wap to perform inheritance in which 

parent class print () method will print number from 1 to 100
Child 1 class print () method will print number from101 to 200
Child 2 class print () method will print number from 201 to 300
 */

package dec.inheritance.practice.pkg;

class Parent1
{
	void print1()
	{
		int i = 0;
		while(i <= 100)
		{
			System.out.print(i+" ");
			i++;
		}
	}
}

class Child1 extends Parent1
{
	void print2()
	{
		for(int i = 101; i <= 200; i++)
		{
			System.out.print(i+" ");
		}
	}
}

class Child2 extends Child1
{
	void print3()
	{
		for(int i = 201; i <= 300; i++)
		{
			System.out.print(i+" ");
		}
	}
}

public class Question1 
{
	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		ch2.print1();
		System.out.println("\n--------");
		ch2.print2();
		System.out.println("\n--------");
		ch2.print3();
	}
}
