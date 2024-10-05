package DataStructures.Arrays.Deletion.LinearDeletion;

public class LinearDeletion {
    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return i;
        }
        return -1;
    }
    public static void linearDeletion(int[] arr, int num) {
        int result = linearSearch(arr, num);
        for (int i = result; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 15, 17, 22, 35, 36, 39, 42, 45, 53};
        int num = 35;
        long prevTime = System.nanoTime();
        linearDeletion(arr, 35);
        long currentTime = System.nanoTime();
        System.out.println("Time taken(ns): " + (currentTime - prevTime));
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == arr.length - 2) {
                System.out.print(arr[i]);
            } else System.out.print(arr[i] + ", ");
        }
    }
}
