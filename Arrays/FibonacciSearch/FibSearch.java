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

        /* fibM is going to store the smallest Fibonacci
        Number greater than or equal to n */
        while (fibM < n) {
            System.out.println("Fib2 = " + fibMMm2 + "; Fib 1 = " + fibMMm1 + "; fibM = " + fibM);
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
            System.out.println("Fib2 = " + fibMMm2 + "; Fib 1 = " + fibMMm1 + "; fibM = " + fibM);
        }

        // Marks the eliminated range from the front
        int offset = -1;

        /* While there are elements to be inspected.
        Note that we compare arr[fibMm2] with x.
        When fibM becomes 1, fibMm2 becomes 0 */
        while (fibM > 1) {
            // Check if fibMm2 is a valid location
            int i = minimum(offset + fibMMm2, n - 1);
            System.out.println("Minimum = " + i);
            System.out.println("Offset: " + offset);

            /* If x is greater than the value at index
            fibMm2,
            cut the subarray array from offset to i */
            if (arr[i] < x) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
                System.out.println("Fib2 = " + fibMMm2 + "; Fib 1 = " + fibMMm1 + "; fibM = " + fibM);
                System.out.println("Offset = " + i);
            }

            /* If x is less than the value at index fibMm2,
            cut the subarray after i+1 */
            else if (arr[i] > x) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                System.out.println("Fib2 = " + fibMMm2 + "; Fib 1 = " + fibMMm1 + "; fibM = " + fibM);
                System.out.println("Offset = " + i);
            }

            /* Element found. Return index */
            else
                return i;
        }

        /* Comparing the last element with x */
        if (fibMMm1 == 1 && arr[n - 1] == x)
            return n - 1;

        /* Element not found. Return -1 */
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 10, 22, 35, 40, 45,  50,
                80, 82, 85, 90, 100, 235 };
        int n = 12;
        int x = 235;
        int index = fibonacciSearch(arr, x, n);
        if (index >= 0)
            System.out.print("Element found at index: "
                    + index);
        else
            System.out.print(
                    x + " isn't present in the array");
    }
}

// This code is contributed by sourabh_jain.
