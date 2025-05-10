package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		List<Integer> double1 = list1.stream().map(x -> x*2).collect(Collectors.toList());
		System.out.println("Double : "+double1);
		
		List<Integer> square = list1.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println("Square : "+square);
		
		List<Integer> triple1 = list1.stream().map(x -> x*3).collect(Collectors.toList());
		System.out.println("Triple : "+triple1);
		
		List<Integer> cube1 = list1.stream().map(x -> x*x*x).collect(Collectors.toList());
		System.out.println("Cube : "+cube1);
	}
}
