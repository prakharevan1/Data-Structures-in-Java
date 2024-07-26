import java.util.*;

public class Main {
    public static void main(String[] args){
        /*
        A FIFO data structure that serves elements with the highest priority
        before elements with lower priority
         */
        Queue<String> queue = new PriorityQueue<>();
        //reverses order of list, so lowest to highest

        queue.offer("B");
        queue.offer("A");
        queue.offer("F");
        queue.offer("C");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        /*
        prority queues important for anything that requires sorting
         */
    }
}
