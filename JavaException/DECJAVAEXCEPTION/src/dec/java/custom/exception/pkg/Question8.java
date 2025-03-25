/*
8. Implement a SpeedLimitExceededException that is thrown when vehicle speed exceeds 100 km/h.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class SpeedLimitExceedException extends Exception
{
	public SpeedLimitExceedException(String message) {
		super(message);
	}
}

public class Question8 
{
	public static void checkProduct(double speed) throws SpeedLimitExceedException
	{
		if(speed > 100)
		{
			throw new SpeedLimitExceedException("Your vehicle speed is greater than 100. Please slow down...");
		}
		else
			System.out.println("Speed is in Limit...");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a speed : ");
		double speed = sc.nextDouble();
		
		try
		{
			checkProduct(speed);
		}
		catch(SpeedLimitExceedException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
