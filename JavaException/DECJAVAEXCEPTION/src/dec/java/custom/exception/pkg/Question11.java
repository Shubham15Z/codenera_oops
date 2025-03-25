/*
11. Create a TemperatureOutOfRangeException and throw it if the temperature exceeds 50°C or drops below -10°C.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;


class TemperatureOutOfRangeException extends Exception
{
	public TemperatureOutOfRangeException(String message) {
		super(message);
	}
}

public class Question11 
{
	public static void checkSal(double temp) throws TemperatureOutOfRangeException
	{
		if(temp < -10 || temp > 50)
		{
			throw new TemperatureOutOfRangeException("Temperature is out of range...");
		}
		else
			System.out.println("Valid temperature");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature : ");
		double sal = sc.nextDouble();
		
		try
		{
			checkSal(sal);
		}
		catch(TemperatureOutOfRangeException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
