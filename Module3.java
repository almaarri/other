package school;
import java.util.Random;

public class Module3 {
	public static void main(String args[]) {
		int randomSize = 10000;
		int myList[] = {5, 4, 3, 2, 1};
		myList = repeatingIntegers();
		//myList = generateRandom(randomSize);
		//myList = ascendingDescending();
		
		System.out.println("Unsorted:");
		for(int x: myList)
			System.out.printf("%s ", x);
		System.out.println();

		//timing 
		long startTime = System.nanoTime();  //Current System Time at start
		myList = quicksortcaller(myList);
		//myList = mergeSortCaller(myList);
		//myList = insertionSort(myList);
		long endTime = System.nanoTime(); //Current system Time at end
		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds
		System.out.println("Sorted:");
		for(int x: myList)
			System.out.printf("%s ", x);
		System.out.println();
		System.out.println("Sorted:");

		System.out.println("Duration is " + duration);

		
	}//main
	
	//part 1 - create lists of random numbers
	public static int[] generateRandom(int randomSize) {
		int randomList[];
		randomList = new int[randomSize];
		Random generator = new Random();
		for(int counter = 0; counter < randomSize; counter++) 
			randomList[counter]=generator.nextInt();
		return randomList;
	} //generateRandom
	
	//part 2a ascending/descending integers
	public static int[] ascendingDescending() {
		int listSize = 100;
		int list2[];
		list2 = new int[listSize];
		for(int counter = 0; counter < listSize; counter++)
			list2[counter] = listSize-counter;
		return list2;
	}//ascendingDescending
	
	//part 2b repeating integers
	public static int[] repeatingIntegers() {
		int listSize = 10000;
		int shortlist[], longlist[];
		shortlist = new int[10];
		longlist = new int[listSize];
		Random generator = new Random();
		for(int counter = 0; counter < 10; counter++)
			shortlist[counter] = generator.nextInt(10);
		for(int counter = 0; counter < listSize; counter++) {
			if (counter <10)
				longlist[counter] = shortlist[counter];
			else 
				longlist[counter] = shortlist[counter%10];
		}
		return longlist;
	}//repeating integers
	
	public static boolean more (int value1, int value2) {
		return value1 > value2;
	}//more
	
	public static int[] insertionSort(int[] array) {
		for(int i=1; i < array.length; i++) {
			int current = array[i];
			int j = i-1;
			while(j>=0 && current < array[j]) {
				array[j+1] = array[j];
				j--;
			}//while
			array[j+1] = current;
		}//for
	return array;
	}//insertionSort
	
	public static int[] mergeSortCaller(int[] arr) {
		int size = arr.length;
		int[] tempArray = new int[size];
		arr = mergeSortinner(arr, tempArray, 0, size-1);
		return arr;
	}//mergeSortouter
	
	public static int[] mergeSortinner(int[] arr, int[] tempArray, int lowerIndex, int upperIndex) {
		if (lowerIndex >= upperIndex) {
			return arr;
		}//if
		int middleIndex = (lowerIndex+upperIndex)/2;
		mergeSortinner(arr, tempArray, lowerIndex, middleIndex);
		mergeSortinner(arr, tempArray, middleIndex+1, upperIndex);
		
		//merge code
		int lowerStart = lowerIndex;
		int lowerStop = middleIndex;
		int upperStart = middleIndex +1;
		int upperStop = upperIndex;
		int count = lowerIndex;
		while (lowerStart <= lowerStop && upperStart <= upperStop) {
			if (arr[lowerStart] < arr[upperStart]){
				tempArray[count++] = arr[lowerStart++];
			}//if
			else {
				tempArray[count++] = arr[upperStart++];
			}//else
		}//while
		while (lowerStart <= lowerStop) {
			tempArray[count++] = arr[lowerStart++];
		}//while
		while (upperStart <= upperStop) {
			tempArray[count++] = arr[upperStart++];
		}//while
		for (int i = lowerIndex; i <= upperIndex; i++) {
			arr[i] = tempArray[i];
		}//for
		return arr;
	} //mergeSort
	
	public static int[] quicksortcaller(int[] arr) {
		int size = arr.length;
		arr = quicksort(arr, 0, size-1);
		return arr;
	}//quicksortcaller
	
	public static int[] quicksort(int arr[], int lower, int upper) {
		if (upper <= lower)
			return arr;
		int pivot = arr[lower];
		int start = lower; 
		int stop = upper;
		
		while (lower < upper) {
			while (arr[lower] <= pivot && lower < upper) {
				lower++;
			}
			while (arr[upper] > pivot && lower <= upper) {
				upper--;
			}	
			if (lower < upper) {
				swap (arr, upper, lower);
			}
		}
		swap (arr, upper, start);
		quicksort(arr, start, upper-1);
		quicksort(arr, upper+1, stop);
		return arr;
	} //quicksort
	
	public static void swap(int arr[], int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}//swap
	
}//Module3
