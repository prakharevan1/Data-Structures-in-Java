import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<String>();
        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();

         */ //linked lists can be treated as a queue and a stack

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll(); takes away front of queue since its now being treated as such
        linkedList.add(4, "E"); //adds it at index 4 (queues start at 0)

        linkedList.remove("E"); //removes E

        System.out.println(linkedList.indexOf("F")); //finds index of letter "F"
        System.out.println(linkedList.peekFirst()); //peeks at the first node (A)
        System.out.println(linkedList.peekLast()); //peeks at the last node (F)

        linkedList.addFirst("0"); //adds as the first node
        linkedList.addLast("G"); //adds as last node

        linkedList.removeFirst(); //removes first node
        linkedList.removeLast(); //removes last node
        /*
        LinkedList = stores nodes into two parts (data and address)
        Nodes are in non-consecutive memory locations
        Elements are linked using pointers

                            Singly Linked List

             Node               Node                 Node
        [data | address] -> [data | address] -> [data | address]


                            Doubly Linked List
                     Node                           Node                          Node
           [address | data | address] <-> [address | data | address] <-> [address | data | address]


           Advantages?

            1.Dynamic Data Structure(allocated node memory while running)
            2.Insertion and deletion of nodes is easy (O(1)) = constant time
            3.No/Low memory waste

            Disadvantages?

            1.Greater memory usage(extra pointer)
            2.No random access of elements(no index i)
            3.Access/searching of elements is more time consuming (O(n)) = linear time

            Uses?
            1.Implement stacks/queues
            2.GPS navigation
            3.music playlist

         */


        System.out.println(linkedList);
    }
}
