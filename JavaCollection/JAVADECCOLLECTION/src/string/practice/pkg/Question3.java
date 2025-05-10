/*
Q3. Extract the integers (Zoho)
Input:
s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
3: Rishabh Gupta56"
Output: 1 2 3 56
Explanation:
1, 2, 3, 56 are the integers present in s.
 */

package string.practice.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question3 
{
	public static void main(String[] args) 
	{
		String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";
		
//		Pattern pattern = Pattern.compile("\\d+");
//		Matcher matcher = pattern.matcher(s);
//		
//		while(matcher.find())
//		{
//			System.out.print(matcher.group()+" ");
//		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		String number = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch))
			{
				number += ch;
			}
			else
			{
				if(!number.isEmpty())
				{
					numbers.add(Integer.parseInt(number));
					number="";
				}
			}
		}
		
		if(!number.isEmpty())
		{
			numbers.add(Integer.parseInt(number));
		}
		
		System.out.println(numbers);
		
	}
}
