public class DynamicArray
{
    private int size; //not instantiated (yet)
    private int capacity = 10;
    private Object[] array;


    public DynamicArray()
    {
        this.array = new Object[capacity]; //when you call it, make a new array with capacity as its capacity:
    }
    public DynamicArray(int capacity) //if the user gives their own capacity, change it to that capacity
    {
        this.capacity = capacity;
        this.array = new Object[capacity]; //when you call it, make a new array with capacity as its capacity
    }
    public void add(Object data)
    {
        if(size >= capacity) //if the size cant hold any more elements
        {
            grow(); //if the size is greater than the capacity, grow the array to avoid any errors
        }
        array[size] = data; //the end of the array is where the data will be stored
        size++; //increasing the size
    }
    public void insert(int index, Object data)
    {
        if(size >= capacity)
        {
            grow();
        }
        for (int i = size; i > index; i--)
        {
            array[i] = array[i-1];
        }
        array[index] = data;
    }
    public Object get(int index){
        return array[index];
    }
    public void delete(Object data) //delete function
    {
        for (int i = 0; i < size; i++) //once we get to the array that we need to delete
        {
            if(array[i] == data) //if we find something in the array equal to our data...
            {
                for(int j = 0; j < (size-i-1); j++) //j needs to be less than size - 1 (because index) - i
                //so that our size - index (because it is less than size) - 1 gives us the numbers
                //we need to move to the left
                {
                    array[i + j] = array[i +j + 1]; //moving them to the left
                }
                array[size - 1] = null; //the index of the last one is now null since we deleted a element
                size--;
                if(size <=(int) (capacity/3))
                {
                    shrink(); //saves memory
                }
                break; //escapes for loop
            }
        }
    }
    public int search(Object data)
    {
        for (int i = 0; i < size; i++) { //iterating through all array
            if (array[i] == data) //if we find it...
            {
                return i; //return it
            }
        }
        return -1; //else, return -1
    }
    private void grow()
    {
        int newCapacity = (int)(capacity*2); //the (int) sorts it as an int
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size ; i++) {
            newArray[i] = array[i]; //add the new one first, and the data which you are copying from last
        }
        capacity = newCapacity;
        array = newArray;
    }
    private void shrink()
    {
        int newCapacity = (int)(capacity/2); //the (int) sorts it as an int
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size ; i++) {
            newArray[i] = array[i]; //add the new one first, and the data which you are copying from last
        }
        capacity = newCapacity;
        array = newArray;
    }
    public boolean isEmpty()
    {
        return size == 0; //if size is 0, it is empty
    }

    /*
        by the way, you need to add the tostring method to print out the elements or else you will get a bunch of nullpointer errors
    */

    public String toString() {
        String string = ""; //declaring the string

        for (int i = 0; i < capacity; i++){ //if the integer is less than the size, keep on printing out the elements
            //if it is set to less than capacity, it will print out all of it, even the null elements
            string += array[i] + ", "; //adds array to string element
        }
        if (string != "") //if there is an element there...
        {
            string = "["+ string.substring(0, string.length() - 2) + "]"; //it will remove the last two characters at the end
            //of the string, string.length = how long is the array
        }
        else //if there is no elements...
        {
            string = "[]"; //return empty square brackets
        }
        return string;
    }
}
