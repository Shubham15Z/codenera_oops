package random.number.pkg;

import java.util.Arrays;
import java.util.Random;

public class ShuffleElement {
	int [] shuffleArrayElements(int a[])
	{
		Random rd = new Random();
		
		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i < a.length; i++)
		{
			int n = rd.nextInt(a.length);
			
			int temp = a[i];
			a[i] = a[n];
			a[n] = temp;
		}
		
		return a;
	}
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9};
		ShuffleElement ob = new ShuffleElement();
		int a1[] = ob.shuffleArrayElements(a);
		System.out.println(Arrays.toString(a1));
	}
}
