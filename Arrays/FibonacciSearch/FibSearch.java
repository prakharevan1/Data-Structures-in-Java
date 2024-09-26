package DataStructures.Arrays.FibonacciSearch;// Java program of the above approach
import java.util.*; // adding util packages

class FibSearch {
    // Function to find the minimum of two elements
    public static int minimum(int x, int y)
    {
        return Math.min(x, y);
    }

    /* Returns the index of x if present, else returns -1 */
    public static int fibonacciSearch(int arr[], int x,
                                      int n)
    {
        /* Initialize Fibonacci numbers */
        int fibMMm2 = 0; // (m-2)'th Fibonacci number
        int fibMMm1 = 1; // (m-1)'th Fibonacci number
        int fibM
                = fibMMm2 + fibMMm1; // m'th Fibonacci number

        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm1 + fibMMm2;
        }
        int offset = -1;
        while (fibM > 1) {
            int i = minimum(fibMMm2 + offset, n - 1);
            if (arr[i] < x) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            } else if (x < arr[i]) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            } else return i; //index found
        }
        if (fibM == 1 && arr[n - 1] == x) return n - 1;

        return -1; //index not found
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 10, 22, 35, 40, 45,  50,
                80, 82, 85, 90, 100, 235 };
        int n = 12;
        int x = 235;
        double currentTime = System.nanoTime();
        int index = fibonacciSearch(arr, x, n);
        double presentTime = System.nanoTime();
        if (index >= 0) {
            System.out.print("Element found at index: " + index + "\n");
            System.out.println("Time taken(ns): " + (presentTime - currentTime));
        } else {
            System.out.print(
                    x + " isn't present in the array");
            System.out.println("Time taken(ns): " + (presentTime - currentTime));
        }
    }
}