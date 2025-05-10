/*
15. Filter Strings by Length: Given a list of strings, filter and print only those strings
 whose lengths are greater than a given number.
 */

package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface FilterString
{
	public void fileterString(List<String> ls1, int k);
}
public class Question15
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<>(Arrays.asList("Vishal", "Mayur","Ajay","Nayan","Akshay","Raj","Amit"));
		int k = 5;
		
		FilterString f1 = (List<String> l1, int len) -> {
			for(String word : l1)
			{
				if(word.length() > len)
				{
					System.out.print(word+" ");
				}
			}
		};
		
		f1.fileterString(list1, k);
	}
}
