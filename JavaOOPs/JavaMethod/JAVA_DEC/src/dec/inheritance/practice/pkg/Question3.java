/*
Wap to perform multilevel inheritance in which 

 class PrintAll will print the numbers from 1 to 100 Range 
 class EvenPrint will print the even numbers from the same range
 class OddPrint will print the odd numbers from the same range
 */

package dec.inheritance.practice.pkg;


class PrintAll
{
	void printAll()
	{
		for(int i = 0; i <= 100; i++)
		{
			System.out.print(i+" ");
		}
	}
}

class EvenPrint extends PrintAll
{
	void printEven()
	{
		for(int i = 0; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+" ");
			}
		}
	}
}

class OddPrint extends EvenPrint
{
	void printOdd()
	{
		for(int i = 0; i <= 100; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
public class Question3 
{
	public static void main(String[] args) 
	{
		OddPrint odd = new OddPrint();
		odd.printAll();
		System.out.println("\n---------------------------");
		odd.printEven();
		System.out.println("\n---------------------------");
		odd.printOdd();
	}
}
