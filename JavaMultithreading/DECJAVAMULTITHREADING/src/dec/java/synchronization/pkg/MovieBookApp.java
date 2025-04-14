package dec.java.synchronization.pkg;

class BookTheaterSeat
{
	int total_seats = 10;
	synchronized void bookSeat(int seats)
	{
		if(total_seats >= seats)
		{
			System.out.println(seats+" seats booked successfully");
			total_seats = total_seats - seats;
			System.out.println("Seats Left : "+total_seats);
		}
		else
		{
			System.out.println("Sorry seats can not be Booked....!!");
			System.out.println("Seats Left : "+total_seats);
		}
	}
}

public class MovieBookApp extends Thread
{
	static BookTheaterSeat b;
	int seats;
	public void run()
	{
		b.bookSeat(seats);
	}
	public static void main(String[] args) 
	{
		b = new BookTheaterSeat();
		
		MovieBookApp ajay = new MovieBookApp();
		ajay.seats = 7;
		ajay.start();
		
		MovieBookApp sham = new MovieBookApp();
		sham.seats = 6;
		sham.start();
	}	
}
