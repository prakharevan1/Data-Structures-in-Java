

public class Main{

	/*
binary search = Search algorithm that finds the position
of a target value within a sorted array.
Half of the array is eliminated during each "step"
	*/
	public static void main(String[] args) {

		int array[] = new int[1000000];
		int target = 777777;

		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		//int index = Arrays.binarySearch(array, target); this is the binarysearch function
		int index = binarySearch(array, target);

		if(index == -1) {
			System.out.println(target + " not found");
		}
		else {
			System.out.println("Element found at: " + index);
		}

	}

	private static int binarySearch(int[] array, int target) {

		int low = 0;
		int high = array.length - 1;

		while(low <= high) {

			int middle = low + (high - low) / 2; //binarysearch formula
			int value = array[middle];

			System.out.println("middle: " + value);
			if(value < target) low = middle + 1; //going lower in the array if its less than the middle value
			else if(value > target) high = middle - 1; //going higher in the array if its higher than the middle value
			else return middle; //target found
		}

		return -1; //if its not found, return -1
	}
}