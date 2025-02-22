package ar.queset9.pkg;

import java.util.Arrays;

public class MissingNumberDemo1 
{
	public static void main(String[] args) {
		int a[] = {2,4,7,9,-10,0,1,-3,-5,6,8,5};
		
		Arrays.sort(a);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int c = 1;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] <= 0)
			{
				continue;
			}
			if(a[i] == c)
			{
				c++;
			}
			else
			{
				break;
			}
		}
		
		System.out.println("The missing number is : "+c);
	}
	
}
