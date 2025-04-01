package dec.java.multithreading.pkg;

class MyThread extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i+" ");
		}
	}
	
	public void run(int j)
	{
		for(int i = j; i <= 100; i++)
		{
			System.out.print(i+" ");
		}
	}
}
public class MultiThreadingDemo 
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.start();
		t1.run(5);
	}
}
