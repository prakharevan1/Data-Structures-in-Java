package DataStructures.Arrays.Searching.BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int low, int high, int num) {
        if (low > high) return -1;
        int mid = (high + low) / 2;

        if (arr[mid] < num) {
            return binarySearch(arr, mid + 1, high, num);
        } else if (arr[mid] > num) {
            return binarySearch(arr, low, mid - 1, num);
        } else if (arr[mid] == num) return mid;

        return -1;
        /*
        * How it works:
        * it looks through a (SORTED) array, and if the element
        * it is looking for is greater/less than the middle, it looks through
        * the top/bottom half. O(log(n)) runtime
        */
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 15, 17, 22, 35, 36, 39, 42, 45, 53};
        int num = 35;
        long prevTime = System.nanoTime();
        int result = binarySearch(arr, 0, arr.length, num);
        long currentTime = System.nanoTime();
        System.out.println("Index: " + result);
        System.out.println("Time taken(ns): " + (currentTime - prevTime));
    }
}
