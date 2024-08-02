public class Main {

/*
        bubble sort = pairs of adjacent elements are compared, and the elements are swapped
        if they are not in order.

        Quadratic time: O(n^2)
        small data sets: okay-ish
        big data sets: bad
*/
    public static void main(String[] args) {
        int array[] = {9, 1, 2, 4, 6, 7, 5, 3, 8};

        BubbleSort(array);

        for(int i : array){
            System.out.print(i);
        }

    }

    private static void BubbleSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
