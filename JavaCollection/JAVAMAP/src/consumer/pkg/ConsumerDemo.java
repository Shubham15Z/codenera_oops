package consumer.pkg;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<String>
{
	@Override
	public void accept(String s1) 
	{
		System.out.println("This is consumer demo : "+s1);
	}
	
	public static void main(String[] args)
	{
		ConsumerDemo c1 = new ConsumerDemo();
		c1.accept("Java");
	}	
}
