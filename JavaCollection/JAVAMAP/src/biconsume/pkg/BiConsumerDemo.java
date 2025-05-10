package biconsume.pkg;

import java.util.function.BiConsumer;

public class BiConsumerDemo implements BiConsumer<String, String>
{

	@Override
	public void accept(String t, String u) {
		System.out.println(t+" "+u);
	}
	
	public static void main(String[] args) {
		BiConsumerDemo d1 = new BiConsumerDemo();
		d1.accept("Hello", "Java");
	}
	
}
