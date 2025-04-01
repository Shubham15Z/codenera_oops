/*
Wap to take a matrix from user and then perform following :
2.Print it without using predefine methos
 */

package dec.java.multithreading.pkg;

import java.util.Arrays;
import java.util.Scanner;

class MyMatrix2 extends Thread
{
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix : ");
		int row = sc.nextInt();
		int col = row;
		
		int[][] A1 = new int[row][col];
		
		System.out.println("Enter the elements in matrix : ");
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				A1[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.print(A1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class Question2
{
	public static void main(String[] args) {
		MyMatrix2 m2 = new MyMatrix2();
		m2.start();
	}
	
	
}
