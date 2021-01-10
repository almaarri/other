package test;
import java.util.Random;
import java.util.Arrays;

public class MyMultiDimensionArray {
	public static void main(String[] args) {
		//declare array
		int array[][];
		array = new int[5][2];
		
		//populate with random numbers
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			for (int j =0; j <2; j++) {
			array[i][j] = rand.nextInt(101);
			}//end j	
		} // end i
		
		//print array
		System.out.println("Multidimensional array:");
		for (int i = 0; i < 5; i++) {
			System.out.print(array[i][0]);
			System.out.print(" ");
		}
		System.out.println(" ");
		for (int i = 0; i < 5; i++) {
			System.out.print(array[i][1]);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		//print sum, minimum, odd numbers
		System.out.print("Sum is: ");
		System.out.println(sum(array));
		System.out.print("Minimum is: ");
		System.out.println(findMinimum(array));
		System.out.println("Odd numbers: ");
		findOddNumbers(array);

} // end main
	
	public static int sum(int[][] myArray) {
		int arraysum = 0;
		for (int i = 0; i < 5; i++) {
			for (int j =0; j <2; j++) {
				arraysum = arraysum+myArray[i][j];
			}//end j	
		} // end i
		return arraysum;
	}// end sum
	
	public static int findMinimum(int[][] myArray) {
		int min = 101;
		for (int i = 0; i < 5; i++) {
			for (int j =0; j <2; j++) {
				if (myArray[i][j] < min) min = myArray[i][j];
			}//end j	
		} // end i
		return min;
	} // end findMinimum
		
	public static void findOddNumbers(int[][] myArray) {
		for (int i = 0; i < 5; i++) {
			for (int j =0; j <2; j++) {
				if (myArray[i][j]%2 != 0)
					System.out.println(myArray[i][j]+" @ ["+i+"]["+j+"]");
			}//end j	
		} // end i
	}//end findOddNumbers
} // end class

