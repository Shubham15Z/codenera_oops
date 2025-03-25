/*
15. Create an InsufficientFuelException if a vehicle’s fuel is below 5 liters before a long journey.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;


class InsufficientFuelException extends Exception
{
	public InsufficientFuelException(String message) {
		super(message);
	}
}

public class Question15 
{
	public static void checkFuel(double fuel) throws InsufficientFuelException
	{
		if(fuel < 5)
		{
			throw new InsufficientFuelException("Insufficient fuel...");
		}
		else
			System.out.println("Fuel is available...");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a fuel : ");
		double sal = sc.nextDouble();
		
		try
		{
			checkFuel(sal);
		}
		catch(InsufficientFuelException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
