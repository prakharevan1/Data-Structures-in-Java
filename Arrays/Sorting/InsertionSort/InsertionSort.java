package DataStructures.Arrays.Sorting.InsertionSort;

public class InsertionSort {
    public static void insertionSort(int[] arr) { //arr = {2, 9, 5, 4, 3, 11, 8}
        final int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
        /*
        * How this works:
        * It takes an array, and if one of the elements is greater, it saves the lower element and makes the
        * element above it equal to the element below it
        * O(n) time complexity
        */
    }
    public static void printArr(int[] arr) {
        for (int key: arr) {
            System.out.print(key + "\n");
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 2, 13, 9, 8, 29, 27};
        System.out.println("Array before: ");
        printArr(arr);
        long prevTime = System.nanoTime();
        insertionSort(arr);
        long currentTime = System.nanoTime();
        System.out.println("Array after: ");
        printArr(arr);
        System.out.println("Time taken (ns): " + (currentTime - prevTime));
    }
}