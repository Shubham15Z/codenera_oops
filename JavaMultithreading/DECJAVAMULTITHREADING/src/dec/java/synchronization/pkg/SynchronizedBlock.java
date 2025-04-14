package dec.java.synchronization.pkg;

class BookTheaterSeat1
{
	int total_seats = 10;
	void bookSeat(int seats)
	{
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		
		synchronized(this)
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
		
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
	}
}

public class SynchronizedBlock extends Thread
{
	static BookTheaterSeat1 b;
	int seats;
	public void run()
	{
		b.bookSeat(seats);
	}
	public static void main(String[] args) 
	{
		b = new BookTheaterSeat1();
		
		SynchronizedBlock ajay = new SynchronizedBlock();
		ajay.seats = 7;
		ajay.start();
		
		SynchronizedBlock sham = new SynchronizedBlock();
		sham.seats = 6;
		sham.start();
	}	
}

//public class SynchronizedBlock 
//{
//
//}
