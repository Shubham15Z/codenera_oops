/*
 Wap to perform multilevel inheritance in which 

 Parent class calculate factorial of 2
Child 1 calculate factorial of 3
Child 2 Calculate factorial of 4
 */

package dec.inheritance.practice.pkg;


class ParentQ8
{
	void factorialTwo()
	{
		int fact = 1;
		for(int i = 1; i <= 2; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of Two is : "+fact);
	}
}

class Child1Q8 extends ParentQ8
{
	void factThree()
	{
		int fact = 1;
		for(int i = 1; i <= 3; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of Three is : "+fact);
	}
}

class Child2Q8 extends Child1Q8
{
	void factFour()
	{
		int fact = 1;
		for(int i = 1; i <= 4; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of Four is : "+fact);
	}
}
public class Question8 
{
	public static void main(String[] args) 
	{
		Child2Q8 ob = new Child2Q8();
		ob.factFour();
		ob.factThree();
		ob.factorialTwo();
	}
}
