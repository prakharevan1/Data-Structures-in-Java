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
    }
}