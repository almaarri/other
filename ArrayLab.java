package test;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLab {

	public static void main(String[] args) {
		//declare array
		int array[] = new int[10];
		//array = new int[10];
		
		//populate array with random integers
		Random rand = new Random();
		System.out.println("Unsorted array:");
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextInt(101);
			}//for
		System.out.println(Arrays.toString(array));

		//find average
		System.out.print("Average is: ");
		System.out.println(average(array));
		
		//sort ascending
		Arrays.sort(array);
		System.out.println("Sorted array (low to high):");
		System.out.println(Arrays.toString(array));

		//find min and max
		minmax(array); //call min and max function
		
		//sort descending
		reverse(array);
		System.out.println("Reversed array (high to low):");
		System.out.println(Arrays.toString(array));
	}// end main
	
	public static double average(int[] myArray) {
		int sum = 0;
		double avg;
		for (int i=0; i<10; i++) {
			sum = sum+myArray[i];
		}
		avg = sum/10;
		return avg;
	}//end average
	
	public static void minmax(int[] myArray) {
		int min, max;
		Arrays.sort(myArray);
		min = myArray[0];
		max = myArray[9];
		System.out.print("Minimum is: ");
		System.out.println(min);
		System.out.print("Maximum is: ");
		System.out.println(max);
	} //end minmax
	
	public static void reverse(int[] myArray) {
		int size = myArray.length;
		int i, j, temp;
		for(i=0; i<(size-1); i++) {
			for(j=0; j<size-i-1;j++)
			{
				if (less(myArray[j],myArray[j+1])){
				temp = myArray[j];
				myArray[j] = myArray[j+1];
				myArray[j+1] = temp;
				}// end if
			}	//end j
			} //end i
		} //reverse function using bubble sort
	
	public static boolean less(int value1, int value2) {
		return value1 < value2;
	}//comparator function for sort
}//end ArrayLab class

