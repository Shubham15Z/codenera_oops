/*
Arrays 1D - Online Game
Problem
Submissions
Leaderboard
Discussions
You are playing an online game. In the game, a list of N numbers is given. The player has to arrange the numbers so 
that all the odd numbers on the list come after the even numbers. Write an algorithm to arrange the given list such that
 all the odd numbers of the list come after the even numbers.

Input Format

The first line of the input consists of an integer num, representing the size of the list(N). The second line of the 
input consists of N space-separated integers representing the values of the list.

Constraints

NA

Output Format

Print N space-separated integers such that all the odd numbers of the list comes after the even numbers

Sample Input 0

8
10 98 3 33 12 22 21 11
Sample Output 0

Array after Segregation
10 98 22 12 33 3 21 11
Sample Input 1

5
73 4 63 23 65
Sample Output 1

Array after Segregation
4 73 63 23 65
 */

package dec.java.dsa.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Question4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int[] result = new int[n];
		int even = 0;
		int odd = n-1;
		
		for(int i = 0; i < n; i++)
		{
			if(a[i] % 2 == 0)
			{
				result[even] = a[i];
				even++;
			}
			else
			{
				result[odd] = a[i];
				odd--;
			}
		}
		
		System.out.println(Arrays.toString(result));
		
	}
}
