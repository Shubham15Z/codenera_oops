package method.java.pkg;

import java.util.Scanner;

public class SearchArrayElement {
	public static void main(String args[])
	{
		SearchArrayElement ob =  new SearchArrayElement();
		ob.searchArrayElement();
	}
	
	void searchArrayElement() 
	{	
		Scanner sc = new Scanner(System.in);
		int a[] = {10,40,30,50,20,90};
		System.out.println("The array elements are :");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the element to search from array : ");
		int ele = sc.nextInt();
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == ele)
			{
				System.out.println("The element "+ele+" is present at index : "+i);
			}
		}
	}
}
