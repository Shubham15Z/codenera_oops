/*1. Write a Java program to create a daemon thread and check if it is a daemon thread using isDaemon().  

 */

package dec.java.daemonthread.pkg;

class MyDaemon1 extends Thread
{
	public void run()
	{
		System.out.println("Daemon thread running....");
	}
}
public interface Question1 
{
	public static void main(String[] args) 
	{
		MyDaemon1 d1 = new MyDaemon1();
		
		System.out.println(d1.isDaemon());
		d1.setDaemon(true);
		System.out.println(d1.isDaemon());
		
		d1.start();
	}
}
