package dec.java.daemonthread.pkg;

class MyDaemon extends Thread
{
	public void run()
	{
		System.out.println("Daemon thread running....");
	}
}

public class DaemonThreadDemo 
{
	public static void main(String[] args) 
	{
		MyDaemon d1 = new MyDaemon();
		
		System.out.println(d1.isDaemon());
		d1.setDaemon(true);
		System.out.println(d1.isDaemon());
		
		d1.start();
		System.out.println(d1.isDaemon());
	}
}
