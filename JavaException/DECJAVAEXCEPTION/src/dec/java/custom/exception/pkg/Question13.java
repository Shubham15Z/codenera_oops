/*
13. Implement a SeatFullException in a ticket booking system when no more seats are available.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class SeatFullException extends Exception
{
	public SeatFullException(String message) {
		super(message);
	}
}

public class Question13 
{
	public static void checkSeat(int seatNo) throws SeatFullException
	{
		int seatCapacity = 100;
		if(seatNo < 0 || seatNo > seatCapacity)
		{
			throw new SeatFullException("Please wait seat is full...");
		}
		else
			System.out.println("Valid seat...");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a seat number : ");
		int seatNo = sc.nextInt();
		
		try
		{
			checkSeat(seatNo);
		}
		catch(SeatFullException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
