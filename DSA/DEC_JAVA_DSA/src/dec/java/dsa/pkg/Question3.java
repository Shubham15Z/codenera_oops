/*
Arrays 1D - Queue
Problem

A bus stop queue has 'n' groups of people. The i-th group from the beginning has 'ai' people. Every 30 minutes an 
empty bus arrives at the bus stop, it can carry atmost 'm' people. Naturally, the people from the first group enter 
the bus first. Then goes the people from the second group and so on. Note that the order of groups in the queue never 
changes. Moreover, if some group cannot fit all of its members into the current bus, it waits for the next bus and joins
with the other groups standing after them in the queue. Your task is to determine the number of buses needed to 
transport all 'n' groups to the Jeju Island countryside.

Input Format

The first line contains two integers n and m (1 ≤ n, m ≤ 100). The next line contains 
n integers: a1, a2, ..., an (1 ≤ ai ≤ m).

Constraints

NA

Output Format

Print a single integer — the number of buses needed to transport all n groups to the Jeju Island countryside.

Sample Input 0

4 3
2 3 2 1
Sample Output 0

3
Sample Input 1

4 4
3 3 3 3
Sample Output 1

4
 */

package dec.java.dsa.pkg;

import java.util.Scanner;

public class Question3
{
	public static void main(String[] args) {
		System.out.println("Hi");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] g = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			g[i] = sc.nextInt();
		}
		
		int busCount = 0;
		int currentBusCapacity = 0;
		
		
		for(int i = 0; i < n; i++)
		{
			if(currentBusCapacity+g[i] <= m)
				currentBusCapacity += g[i];
			else
			{
				busCount++;
				currentBusCapacity = g[i];
			}
		}
		
		if(currentBusCapacity > 0)
			busCount++;
		
		System.out.println(busCount);
		sc.close();
	}

}
