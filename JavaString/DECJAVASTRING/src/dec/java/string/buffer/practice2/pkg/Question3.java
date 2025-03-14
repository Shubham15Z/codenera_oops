/*
3. Create a class that accepts an array of student names, sorts them alphabetically using a string-based approach, 
and prints the sorted list. 
 */

package dec.java.string.buffer.practice2.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 
{
	void sortNames(String[] s1)
	{
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
	}
	
	void sort2(String[] s1)
	{
		for(int i = 0; i < s1.length; i++)
		{
			for(int j = i+1; j < s1.length; j++)
			{
				if(s1[i].compareTo(s1[j]) > 0)
				{
					String temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
					
			}
		}
		
		System.out.println(Arrays.toString(s1));
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of String array :");
		int size = sc.nextInt();
		String[] s1 = new String[size];
		
		System.out.println("Enter the Name of Students : ");
		for(int i = 0; i < s1.length; i++)
		{
			s1[i] = sc.next();
		}
		Question3 q3 = new Question3();
//		q3.sortNames(s1);
		q3.sort2(s1);
	}
}
