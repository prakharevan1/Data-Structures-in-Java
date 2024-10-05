package DataStructures.Arrays.Searching.LinearSearch;

public class LinearSearch {
    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 15, 17, 22, 35, 36, 39, 42, 45, 53};
        int num = 35;
        long prevTime = System.nanoTime();
        int result = linearSearch(arr, num);
        long currentTime = System.nanoTime();
        System.out.println("Index: " + result);
        System.out.println("Time taken(ns): " + (currentTime - prevTime));
    }
}
