/*
4. Create a thread using the Thread class to transpose a matrix in parallel  
 */

package dec.java.runnable2.pkg;

class MyThread4 extends Thread
{
	private int[][] A1;
	private int[][] T1;
	
	public MyThread4(int[][] A1, int[][] T1) 
	{
		this.A1 = A1;
		this.T1 = T1;
	}

	public void makeTranspose()
	{
		for (int i = 0; i < A1.length; i++) {
            for (int j = 0; j < A1[0].length; j++) {
                T1[j][i] = A1[i][j];
            }
        }
	}
	
	public void run()
	{
		makeTranspose();
	}
}
public class Question4 
{
	public static void main(String[] args) {
		int[][] A1 = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };
		
		int rows = A1.length;
        int cols = A1[0].length;
        int[][] T1 = new int[cols][rows];
        
        MyThread4 t4 = new MyThread4(A1, T1);
        t4.start();
        
        System.out.println("Transposed Matrix:");
        for(int i = 0; i < cols; i++)
		{
			for(int j = 0; j < rows; j++)
			{
				System.out.print(T1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
