/*
 3.Write a Java program where this is used to invoke a constructor within the same class
 */

package thiskeyword.superkeyword.practice.pkg;

public class Question3 
{
	Question3() {
		this("Hello");
		System.out.println("This is non para constructor");
	}
	
	Question3(String a)
	{
		System.out.println("String para constructor");
	}
	public static void main(String[] args) 
	{
		Question3 ob = new Question3();
	}
}
