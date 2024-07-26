import java.util.Stack;

public class Main {
    public static void main(String[] args){
        /*
        stack = LIFO data structure, (Last In First Out).
        stores objects into a "vertical tower"
        push() to add from the top
        pop() to remove from the top
         */
        Stack<String> stack = new Stack<String>(); //creating a stack

        //System.out.println(stack.empty());

        stack.push("Minecraft"); //pushing it into the stack
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Elden Ring");
        stack.push("FFVII");

        //String myFavGame = stack.pop(); //declaring the popped item
        //System.out.println(stack.peek()); //peeking at top of stack
        //System.out.println(stack.search(1)); //searching for item in stack, starts at 1 (suprisingly)


        /*
        uses of stacks?
        1.undo/redo features in text editors
        2.moving back/forward through browsing history
        3.backtracking algorithims (maze, file directories)
        4.calling functions(call stack)
         */


    }
}
