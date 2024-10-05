package DataStructures.Arrays.Searching.FibonacciSearch;

public class FibSearch {
    public static int fibSearch(int[] arr, int num) {
        int fibMm2 = 0;
        int fibMm1 = 1;
        int fibM = fibMm1 + fibMm2;

        while (fibM < arr.length) {
            fibMm2 = fibMm1;
            fibMm1 = fibM;
            fibM = fibMm1 + fibMm2;
        }
        int offset = -1;

        while (fibM > 1) {
            int i = Math.min(fibMm2 + offset, arr.length - 1);
            if (arr[i] < num) {
                fibM = fibMm1;
                fibMm1 = fibMm2;
                fibMm2 = fibM - fibMm1;
                offset = i;
            } else if (arr[i] > num) {
                fibM = fibMm2;
                fibMm1 = fibMm1 - fibMm2;
                fibMm2 = fibM - fibMm1;
            } else return i; //index found
        }
        if (fibM == 1 && arr[arr.length - 1] == num) {
            return arr.length - 1;
        } else return -1; //index not found
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 15, 17, 22, 35, 36, 39, 42, 45, 53};
        int num = 35;
        long prevTime = System.nanoTime();
        int result = fibSearch(arr, num);
        long currentTime = System.nanoTime();
        System.out.println("Index: " + result);
        System.out.println("Time taken(ns): " + (currentTime - prevTime));
    }
}