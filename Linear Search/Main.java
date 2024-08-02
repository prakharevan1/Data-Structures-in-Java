public class Main {
    public static void main(String[] args) {
        /*
        linear search = Iterate through a collection one element at a time
            runtime complexity = O(n)

            Disadvantages:
            Slow for large data sets

            Advantages:

            fast for searches of small to medium data sets
            Does not need to be sorted
            Useful for data structures that do not have random access(LinkedList)
         */

        int[] array = {1, 2, 4, 3, 6, 8, 7, 5, 9};

        int index = linearsearch(array, 5);

        if(index != -1){
            System.out.println("The element has been found at index: " + index);
        }
        else {
            System.out.println("The element was not found :(");
        }
    }

    private static int linearsearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
