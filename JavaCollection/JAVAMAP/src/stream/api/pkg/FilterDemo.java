package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		List<Integer> even = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even : "+even);
	}
}
