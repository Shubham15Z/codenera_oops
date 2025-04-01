/*
Wap to take a matrix from user and then perform following :
1. Print it by using predefine method

 */

package dec.java.multithreading.pkg;

import java.util.Arrays;
import java.util.Scanner;

class MyMatrix1 extends Thread
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
		
		System.out.println(Arrays.deepToString(A1));
	}
}
public class Question1 
{
	public static void main(String[] args) 
	{
		MyMatrix1 m1 = new MyMatrix1();
		m1.start();
	}
}
