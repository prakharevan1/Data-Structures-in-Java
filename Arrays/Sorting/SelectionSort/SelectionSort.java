package DataStructures.Arrays.Sorting.SelectionSort;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        // O(n^2) runtime
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;

            for(int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) min_index = j;
            }

            if (min_index != i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
        /*
        * How it works:
        * it looks through an array, and if one element is greater than the other,
        * it swaps the two elements. Pretty simple :D
        */
    }
    public static void printArr(int[] arr) {
        for (int key: arr) {
            System.out.print(key + "\n");
        }
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {11, 2, 13, 9, 8, 29, 27};
        System.out.println("Array before: ");
        printArr(arr);
        long prevTime = System.nanoTime();
        selectionSort(arr);
        long currentTime = System.nanoTime();
        System.out.println("Array after: ");
        printArr(arr);
        System.out.println("Time taken (ns): " + (currentTime - prevTime));
    }
}
