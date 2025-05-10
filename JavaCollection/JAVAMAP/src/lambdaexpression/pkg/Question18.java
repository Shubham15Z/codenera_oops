/*
18. Concatenate Two Strings: Create a lambda expression that takes two strings and concatenates them.
 */

package lambdaexpression.pkg;

@FunctionalInterface
interface ConcatTwoString
{
	public void concatString(String s1, String s2);
}
public class Question18 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = "Lambda";
		
		ConcatTwoString c1 = (a1,a2) -> System.out.println(a1+" "+a2);
		
		c1.concatString(s1, s2);
	}
}
