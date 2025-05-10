package consumer.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerWithLambda
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,2,6,9,3));

		Consumer<String> c1 = (str) -> {
			System.out.println("Consumer with Lambda : "+str);
		};
		
		Consumer<List<Integer>> c2 = (List<Integer> l1) -> {
			System.out.println(l1);
		};
		
		c1.accept("Java");
		c2.accept(list1);
	}
}
