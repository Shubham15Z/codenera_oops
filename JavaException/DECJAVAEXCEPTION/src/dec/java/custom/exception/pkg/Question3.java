/*
3. Define a LowMarksException that gets thrown if a student's marks are below 40. 
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class LowMarkException extends RuntimeException
{
	public LowMarkException(String message) {
		super(message);
	}
}


public class Question3 
{
	public static void checkMark(int mark) throws LowMarkException
	{
		if(mark < 40)
		{
			throw new LowMarkException("Yor have got marks below 40...");
		}
		else
		{
			System.out.println("you have got marks above 40");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a marks : ");
		int marks  = sc.nextInt();
		
		try {
			checkMark(marks);
		} catch (LowMarkException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
