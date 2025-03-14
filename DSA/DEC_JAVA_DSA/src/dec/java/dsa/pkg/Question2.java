/*
Arrays 1D - Same or Not

The Modern World Cinderella was happy to meet Prince Charming at the ballroom and she danced with him happily. 
While she was dancing, Prince wanted to check whether Cinderella is a perfect match for him. He asked her a question 
to check her knowledge of Arrays. Can you help Cinderella to write a program to find whether the two arrays are the 
same or not?

Note: Two arrays are said to be the same if the sum of both arrays is the same and the size of the arrays is the same.

Input Format

Input consists of 2 integers and 2 arrays. The integers should correspond to the size of the arrays.

Constraints

NA

Output Format

If two arrays are the same, display "Same" else display "Not Same"

Sample Input 0

4
4
1
2
3
4
1
2
3
4
Sample Output 0

Same
Explanation 0

Here, the sum and size of both arrays are the same. Hence it prints "Same".

Sample Input 1

3
3
1
2
1
2
3
6
Sample Output 1

Not Same
Explanation 1

Here, the sum and size of both arrays are not the same. Hence it prints "Not Same".
 */

package dec.java.dsa.pkg;

import java.util.Scanner;

public class Question2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st array : ");
		int s1 = sc.nextInt();
		
		System.out.println("Enter size of 2nd array : ");
		int s2 = sc.nextInt();
		
		int[] a1 = new int[s1];
		int[] a2 = new int[s2];
		
		System.out.println("Enter the elements in 1st array");
		for(int i = 0; i < a1.length; i++)
		{
			a1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element in 2nd array");
		for(int i = 0; i < a2.length; i++)
		{
			a2[i] = sc.nextInt();
		}
		
		
		if(a1.length == a2.length)
		{
			int sum1 = 0, sum2 = 0;
			
			for(int i = 0; i < a1.length; i++)
			{
				sum1 = sum1+a1[i];
				sum2 = sum2+a2[i];
			}
			
			if(sum1 == sum2)
				System.out.println("Same");
			else
				System.out.println("Not same");
		}
		else
		{
			System.out.println("Not same");
		}
	}
}
