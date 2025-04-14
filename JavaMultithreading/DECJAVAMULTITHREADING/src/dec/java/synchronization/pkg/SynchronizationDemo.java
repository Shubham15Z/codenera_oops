package dec.java.synchronization.pkg;

class Shared
{
	public synchronized void print()
	{
		for(int i = 1; i <= 5; i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());	
		}
	}
}
public class SynchronizationDemo extends Thread 
{
	static Shared be;
	
	public void run()
	{
		be.print();
	}
	
	public static void main(String[] args) {
		be = new Shared();
		
		SynchronizationDemo th1 = new SynchronizationDemo();
		SynchronizationDemo th2 = new SynchronizationDemo();
		SynchronizationDemo th3 = new SynchronizationDemo();
		
		th1.start();
		th2.start();
		th3.start();
		
	}
}
