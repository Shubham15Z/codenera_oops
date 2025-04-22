package dec.java.synchronization.pkg;

class Booking 
{
	static int tseats = 20;
	
	static synchronized void bookSeat(int seats)
	{
		if(tseats >= seats)
		{
			tseats = tseats - seats;
			System.out.println("Seats successfully booked\n available seats are : "+tseats);
		}
		else
		{
			System.out.println("Seats not available for booking\n available seats are : "+tseats);
		}
	}
}

class Thread1 extends Thread
{
	static Booking b;
	int seats;
	
	Thread1(Booking b, int seats)
	{
		this.b = b;
		this.seats = seats;
	}
	
	public void run()
	{
		b.bookSeat(seats);
	}
}

class Thread2 extends Thread
{
	static Booking b;
	int seats;
	
	Thread2(Booking b, int seats)
	{
		this.b = b;
		this.seats = seats;
	}
	
	public void run()
	{
		b.bookSeat(seats);
	}
}


public class StaticSynchDemo 
{
	public static void main(String[] args) 
	{
		Booking b1 = new Booking();
		Thread1 t1 = new Thread1(b1, 12);
		Thread1 t2 = new Thread1(b1, 10);
		t1.start();
		t2.start();
		
		//----------------------------------
		
		Booking b2 = new Booking();
		Thread2 t3 = new Thread2(b2, 5);
		Thread2 t4 = new Thread2(b2, 9);
		t3.start();
		t4.start();
	}
}
