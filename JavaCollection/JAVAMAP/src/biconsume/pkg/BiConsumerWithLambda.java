package biconsume.pkg;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerWithLambda 
{
	public static void main(String[] args)
	{
		BiConsumer<String, String> b1 = (String s1, String s2) -> {
			System.out.println(s1+" "+s2);
		};
		
		b1.accept("Hello", "ByLambda");
		b1.accept("Fruit", "Apple");
		
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("Apple", 200);
		mp.put("Mango", 300);
		
		mp.forEach((s1,s2) -> System.out.println(s1+" "+s2));
	}
}
