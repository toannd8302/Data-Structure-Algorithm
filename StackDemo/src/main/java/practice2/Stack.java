package practice2;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public ArrayList<T> getStack() {
        return stack;
    }

    public void printStack() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void Push(T value) {
        stack.add(value);
    }

    public T Pop() {
        if (stack.isEmpty()) return null;
        return stack.remove(stack.size() - 1);
    }

   
}
