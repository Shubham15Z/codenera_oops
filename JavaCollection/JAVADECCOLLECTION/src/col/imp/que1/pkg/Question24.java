/*
24. Partition by Even and Odd  
    - Question: Partition a list of integers into even and odd numbers.
    - Input: [1, 2, 3, 4, 5, 6]
    - Output: {even=[2, 4, 6], odd=[1, 3, 5]}
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question24 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		Map<Boolean, List<Integer>> partitioned = list1.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));
		
//		System.out.println("Even :"+partitioned.get(true));
//		System.out.println("Odd :"+partitioned.get(false));
		
		Map<String, List<Integer>> result = new LinkedHashMap<String, List<Integer>>();
		
		result.put("Even", partitioned.get(true));
		result.put("Odd", partitioned.get(false));
		
		System.out.println(result);
	}
}
