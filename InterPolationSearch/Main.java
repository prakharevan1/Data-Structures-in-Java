public class Main {
    public static void main(String[] args) {
        /*
        interpolation search = improvvement over binary search best used for "uniformly" distributed "guesses" where a value
        might be based on calculated probe results; if probe is incorrect, search area is narrowed, and a new probe is called
        average case: O(log(log(n)))
        worst case: O(n) [values increase exponentially]
         */
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2056};

        int index = interpolationSearch(array, 256);

        if(index == -1) System.out.println("The value was not found");

        else System.out.println("The probe was found at index: " + index);
    }


        private static int interpolationSearch(int[] array, int value){

        int high = array.length - 1; //high = lenght of array starting from index 0
        int low = 0;

        while(value >= array[low]  && value <= array[high] && low <= high){

            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]); //formula that is very accurate on finding index

            System.out.println("probe:" + probe);

            if(array[probe] == value) return probe;

            else if(array[probe] < value) low = probe + 1;

            else high = probe - 1;
        }

        return -1; //return -1 if not found
    }
}
