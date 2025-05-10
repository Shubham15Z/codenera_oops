/*
7. Sort a List of Strings: Given a list of strings, sort it in alphabetical order using a lambda expression.
 */

package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface SortString
{
	public List<String> sortList(List<String> ls1);
}
public class Question7
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("Java", "Python", "C", "Html", "Mysql"));
		SortString s1 = (List<String> l1) -> {
			Collections.sort(l1);
			return l1;
		};
		
		System.out.println("Given List : "+list1);
		List<String> res = s1.sortList(list1);
		System.out.println("Sorted List : "+res);
		
	}
}
