package arrayreturn.pkg;

import java.util.Arrays;

public class ArrayReturn {
	
	int[] printArray(int a[])
	{
		return a;
	}
	
	int[] reverseArray(int a[])
	{
		int c[] = new int [a.length];
		int x = 0;
		for(int i = a.length-1; i >= 0; i--)
		{
			c[x] = a[i];
			x++;
		}
		return c;
	}
	
	char[] characterArray(char ch[])
	{
		return ch;
	}
	
	
	
	public static void main(String args[])
	{
		ArrayReturn ob = new ArrayReturn();
		int b[] = {1,2,3,4,5};
		char ch[] = {'d','e','i','p'};
		
		int a1[] = ob.printArray(b);
		System.out.println(Arrays.toString(a1));
		
		int c1[] = ob.reverseArray(b);
		System.out.println("The reverse array is : ");
		System.out.println(Arrays.toString(c1));
		
		char ch1[] = ob.characterArray(ch);
		System.out.println("The character array is : ");
		System.out.println(Arrays.toString(ch1));
	}
}
