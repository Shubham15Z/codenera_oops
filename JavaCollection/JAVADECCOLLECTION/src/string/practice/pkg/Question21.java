/*
Q21. Last Match
Given two strings A and B, you need to find the last occurrence ( 1 based indexing) of string B in
string A.
Example 1:
Input:
A = abcdefghijklghifghsd
B = ghi
Output:
13
Explanation:
ghi occurs at position 13 for the
last time in string A.
 */

package string.practice.pkg;

public class Question21
{
	public static void main(String[] args) 
	{
		String A = "abcdefghijklghifghsd";
		
		String B = "ghi";
		
		System.out.println(A.lastIndexOf(B)+1);
	}
}
