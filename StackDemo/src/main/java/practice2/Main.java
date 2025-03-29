package practice2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void sortStack(Stack<Integer> stack) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            list.add(stack.Pop());
        }
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            stack.Push(list.get(i));
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.Push(3);
        stack.Push(1);
        stack.Push(4);
        stack.Push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }

}