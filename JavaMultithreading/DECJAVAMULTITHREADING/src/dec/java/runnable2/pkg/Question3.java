/*
3. Create a thread using the Thread class to rotate a square matrix 90 degrees clockwise  
 */

package dec.java.runnable2.pkg;

import java.util.Scanner;

class MyThread3 extends Thread
{
	public void rotate90()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix : ");
		int row = sc.nextInt();
		int col = row;
		
		int[][] A1 = new int[row][col];
		
		System.out.println("Enter the elements in matrix :");
		for(int i = 0; i < A1.length; i++)
		{
			for(int j = 0; j < A1.length; j++)
			{
				A1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The given matrix is : ");
		for(int i = 0; i < A1.length; i++)
		{
			for(int j = 0; j < A1.length; j++)
			{
				System.out.print(A1[i][j]+" ");
			}
			System.out.println();
		}	
		
		int[][] A2 = new int[row][col];
		
		for(int i = 0; i < row; i++)
		{
			for(int j = row-1; j >= 0; j--)
			{
				A2[i][2-j] = A1[j][i];
			}
		}
		
		System.out.println("Matrix After rotating 90 degree: ");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < row; j++)
			{
				System.out.print(A2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void run()
	{
		rotate90();
	}
}
public class Question3 
{
	public static void main(String[] args) 
	{
		
		MyThread3 t3 = new MyThread3();
		t3.start();
	}
}
