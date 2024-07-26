public class Main
{
    public static void main(String[] args)
    {
        DynamicArray dynamicArray = new DynamicArray(9);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert(1, "X");

        dynamicArray.delete("C");

        System.out.println(dynamicArray);

        //I didnt do the rest of the functions, but I have tested them and they will work :-)
    }
}
