/*
1)Write a program to print the trapezium pattern.

Input Format

Input consists of one integer that represents the number of rows.

Constraints

NA

Output Format

Output prints the pattern

Sample Input 0

4
Sample Output 0

1*2*3*4*17*18*19*20
--5*6*7*14*15*16
----8*9*12*13
------10*11
Sample Input 1

2
Sample Output 1

1*2*5*6
--3*4
 */

package dec.java.dsa.pkg;
import java.util.*;
public class Pattern1 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of n :");
		int n = sc.nextInt();
		
		int a = 1;
		
		int b = n*n+1;
		
		for(int i = n; i >= 1; i--)
		{
			for(int j = 0; j < n-i; j++)
			{
				System.out.print("--");
			}

			for(int j = 0; j < i; j++)
			{
				System.out.print(a++ +"*");
			}
			
			for(int j = 0; j < i-1; j++)
			{
				System.out.print(b++ +"*");
			}
			System.out.println(b);
			b= b-2 * (i-1);
		}
		
	}
}
