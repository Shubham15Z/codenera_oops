/*
 14. Sort List by String Length: Sort a list of strings by their lengths in ascending order using a lambda expression.
 */

package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface SortStringByLength
{
	public void sortString(List<String> ls1);
	
}

class SortStringLength implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1.toString().length() > o2.toString().length())
			return 1;
		else if(o1.toString().length() < o2.toString().length())
			return -1;
		else
			return 0;
	}
	
}

public class Question14 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<>(Arrays.asList("Vishal", "Mayur","Ajay","Nayan","Akshay","Raj","Amit"));
		
		SortStringByLength s1 = ( l1) -> {
			
			l1.sort(( str1,  str2) ->{
				return Integer.compare(str1.length(), str2.length());
			});
//			Collections.sort(l1, new SortStringLength());
		};
		
		s1.sortString(list1);
		System.out.println(list1);
	}
}
