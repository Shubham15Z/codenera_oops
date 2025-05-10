/*
11. Count Words Starting with a Specific Letter: 
Given a list of words, use a lambda expression to count how many words start with a specific letter (e.g., 'A').
 */

package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface CountWord
{
	public int countWord(List<String> ls1);
}
public class Question11
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("Vishal", "Mayur","Ajay","Nayan","Akshay","Raj","Amit"));
		char ch = 'A';
		
		CountWord c1 = (List<String> l1) -> {
			int count = 0;
			for(String word : l1)
			{
				if(word.charAt(0)== ch)
					count++;
			}
			return count;
		};
		
		int res = c1.countWord(list1);
		System.out.println(res);
	}
}
