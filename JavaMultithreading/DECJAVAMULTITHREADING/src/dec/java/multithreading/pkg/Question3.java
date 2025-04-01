/*
Wap to take a matrix from user and then perform following :
3.Rotate it 90 Degree and store it in another matrix and then print it
 */

package dec.java.multithreading.pkg;

import java.util.Scanner;

class MyMatrix3 extends Thread
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

		System.out.println("The given matrix is : ");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
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
}
public class Question3
{
	public static void main(String[] args) {
		MyMatrix3 m3 = new MyMatrix3();
		m3.start();
	}
}
