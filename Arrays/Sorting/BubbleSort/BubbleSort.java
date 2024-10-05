package DataStructures.Arrays.Sorting.BubbleSort;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        int temp, i, j; //declaration of var
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false; //nothing swapped yet
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { //if index in front of it is greater...
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void printArr(int[] arr) {
        for(int key: arr) {
            System.out.print(key + "\n");
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 2, 13, 9, 8, 29, 27};
        System.out.println("Array before: ");
        printArr(arr);
        long prevTime = System.nanoTime();
        bubbleSort(arr, arr.length);
        long currentTime = System.nanoTime();
        System.out.println("Array after: ");
        printArr(arr);
        System.out.println("Time taken (ns): " + (currentTime - prevTime));
    }
}
