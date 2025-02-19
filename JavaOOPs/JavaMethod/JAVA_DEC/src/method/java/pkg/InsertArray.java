package method.java.pkg;

import java.util.Scanner;

public class InsertArray {
	
	
	public static void main(String arg[]) {
		InsertArray ob = new InsertArray();
		ob.insertArray();
	}
	
	void insertArray() {
		Scanner sc = new Scanner(System.in);
		int a [] = {10,20,30,40};
		System.out.println("The array elements are :");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("Enter the array element to insert in array : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the array index to insert in array : ");
		int index = sc.nextInt();
		
		a[index] = b;
		System.out.println("The new array elements are :");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
