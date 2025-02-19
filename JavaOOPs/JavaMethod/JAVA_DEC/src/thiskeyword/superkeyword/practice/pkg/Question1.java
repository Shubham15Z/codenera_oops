/*
Write a Java program to demonstrate the use of this keyword to refer to instance variables when they have the same name
 as local variables.
 */

package thiskeyword.superkeyword.practice.pkg;


public class Question1 
{
	int x;
	
	void display(int x)
	{
		this.x = x;
		System.out.println(x);
		System.out.println(this.x);
	}
	
	public static void main(String[] args) 
	{
		Question1 ob = new Question1();
		ob.display(10);
	}
}
