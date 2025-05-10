/*
Q5. Uncommon characters (Zoho)
Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation:

The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
are either present in A or B, but not in both.
 */

package string.practice.pkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question5 
{
	public static String findUncommon(String A, String B)
	{
		 Set<Character> setA = new HashSet<Character>();
		 Set<Character> setB = new HashSet<Character>();
		 
		 for(char ch : A.toCharArray())
		 {
			 setA.add(ch);
		 }
		 
		 for(char ch : B.toCharArray())
		 {
			 setB.add(ch);
		 }
		 
		 Set<Character> result = new TreeSet<Character>();
		 
		 for(char ch : setA)
		 {
			 if(!setB.contains(ch))
			 {
				 result.add(ch);
			 }
		 }
		 
		 for(char ch : setB)
		 {
			 if(!setA.contains(ch))
			 {
				 result.add(ch);
			 }
		 }
		 
		 StringBuilder sb = new StringBuilder();
		 for(char ch : result)
		 {
			 sb.append(ch);
		 }
		return sb.toString();
	}
	public static void main(String[] args) 
	{
//		String A = "geeksforgeeks";
//		String B = "geeksquiz";
		
		String A = "aacdb";
		String B = "gafd";
		
		String output = findUncommon(A,B);
		System.out.println("Output : "+output);
	}
}
