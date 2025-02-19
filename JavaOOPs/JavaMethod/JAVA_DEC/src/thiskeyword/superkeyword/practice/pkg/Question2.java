/*
 2. Create a class with a method that returns the current class instance using this.
 */

package thiskeyword.superkeyword.practice.pkg;

public class Question2 
{
	int x=20;
	int number()
	{
		return this.x;
	}
	
	public static void main(String[] args) 
	{
		Question2 ob = new Question2();
		int result = ob.number();
		System.out.println(result);
	}
}
