package DataStructures.Arrays.Searching.FibonacciSearch;

public class FibSearch {
    public static int fibSearch(int[] arr, int num) {
        int fibMm2 = 0; //(m-2)'th number in fib sequence
        int fibMm1 = 1; //(m-1)'th number in fib sequence
        int fibM = fibMm1 + fibMm2; //sum of two numbers

        while (fibM < arr.length) { //finding the highest possible number of fibonacci sequence
            fibMm2 = fibMm1;
            fibMm1 = fibM;
            fibM = fibMm1 + fibMm2;
        }
        int offset = -1;

        while (fibM > 1) {
            int i = Math.min(fibMm2 + offset, arr.length - 1); //seeing if FibMm2 is a real index
            if (arr[i] < num) {
                fibM = fibMm1; //going down one element
                fibMm1 = fibMm2;
                fibMm2 = fibM - fibMm1;
                offset = i; //increasing offset
            } else if (arr[i] > num) {
                fibM = fibMm2; //going down much farther
                fibMm1 = fibMm1 - fibMm2;
                fibMm2 = fibM - fibMm1;
            } else return i; //index found
        }
        if (fibM == 1 && arr[arr.length - 1] == num) { //comparing with last element in array
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