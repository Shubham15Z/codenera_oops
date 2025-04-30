package vector.pkg;


import java.util.Random;
import java.util.Vector;
public class QUestion29
{
	public static void main(String[] args) 
	{
	        Vector<Integer> v1 = new Vector<>();
	        Random num = new Random();

	        int numberOfElements = 10; 

	        for (int i = 0; i < numberOfElements; i++) {
	            int randomNum = num.nextInt(100); 
	            v1.add(randomNum);
	        }

	        System.out.println("Vector filled with random numbers: \n" + v1);
	}

}
