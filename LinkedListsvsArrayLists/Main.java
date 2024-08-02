import java.util.ArrayList;
import java.util.LinkedList;
//importing required classes

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> linkedlist = new LinkedList<Integer>(); //declaring lists
    ArrayList<Integer> arraylist = new ArrayList<Integer>();

    for(int i = 0; i < 1000000; i++){
      linkedlist.add(i);
      arraylist.add(i);
      //adding all the numbers to the lists
    }

    //*******LinkedLists*******
    long starttime = System.nanoTime();
    /*
    linkedlist.remove(0);
    linkedlist.remove(999999);
    linkedlist.remove(500000);
    linkedlist.add(0);
    linkedlist.add(999999);
    linkedlist.add(500000);
    linkedlist.get(0);
    linkedlist.get(999999)
    linkedlist.get(500000);
    */
    linkedlist.add(500000, 500000);
    /*adding at last index, middle index, and
    last index to see difference between
    complimation speeds ^^^
    */
    long endtime = System.nanoTime();
    //measures time in nanoseconds

    long elapsedtime = endtime-starttime;
    /*
    do nanosecond tests to compare speed ^^^^^^
    */
    System.out.println("NanoSeconds:LinkedLists: " + elapsedtime);

    //*******ArrayLists*******
    starttime = System.nanoTime();
    /*
    arraylist.remove(0);
    arraylist.remove(999999);
    arraylist.remove(500000);
    arraylist.add(0);
    arraylist.add(999999);
    arraylist.add(500000);
    arraylist.get(0);
    arraylist.get(999999)
    arraylist.get(500000);
    */
    arraylist.add(500000, 500000);

    endtime = System.nanoTime();

    elapsedtime = endtime - starttime;

    System.out.println("NanoSeconds:ArrayLists: " + elapsedtime);
  }
}
