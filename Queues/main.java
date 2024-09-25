import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        /*
        Queue = Fifo data structure, First come first out (like a line irl)
        A collection structure designed for holding elements prior to linear data structure
        add = enqueue, offer()
        remove = dequeue, poll()
         */
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Chad");
        queue.offer("Chad2");
        queue.offer("Chad3");
        queue.offer("Chad4");
        //System.out.println(queue.isEmpty()); //boolean value, changes if u add code before or after offers


        //System.out.println(queue.peek()); //peeks at the FRONT of the line
        //System.out.println(queue.size()) //prints out size of queue (int)

        //System.out.println(queue.contains("Chad3")); //finds if said object is inside the line

        //queue.poll(); //removes the first member from the queue
        //queue.poll();
        //queue.poll();
        //queue.poll();
        //queue.poll(); //doesnt throw exceptions even if there is no one inside queue

        System.out.println(queue);

        /*
        Where are queues useful?
        1.Keyboard buffer (letters appear in the order they are passed)
        2.Printer queue(jobs completed in order)
        3.Used in LinkedLists, PriorityQueues, Breadth-first search
         */
    }
}
