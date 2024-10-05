package DataStructures.Arrays.Deletion.BinaryDeletion;

public class BinaryDeletion {
    public static int binarySearch(int arr[], int low, int high, int num) {
        // O(log (n) time complexity
        int mid = (low + high) / 2;
        if (arr[mid] == num) return mid;
        if (num > arr[mid]) {
            return binarySearch(arr, mid + 1, high, num);
        } if (num < arr[mid]) {
            return binarySearch(arr, low, mid - 1, num);
        }
        return -1;
    }
    public static void deleteElement(int[] arr, int num) {
        int index = binarySearch(arr, 0, arr.length, num);
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        //O(N log(n)) runtime
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 15, 17, 22, 35, 36, 39, 42, 45, 53};
        int num = 35;
        long prevTime = System.nanoTime();
        deleteElement(arr, num);
        long currentTime = System.nanoTime();
        System.out.println("Time taken(ns): " + (currentTime - prevTime));
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == arr.length - 2) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
    }
}
