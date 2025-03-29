package practice;

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

    public boolean isBalancedParentheses(String testString) {
        Stack<Character> stack = new Stack<>();
        for (Character c : testString.toCharArray()) {
            switch (c) {
                case '(':
                    stack.Push(')');
                    break;
                case '[':
                    stack.Push(']');
                    break;
                case '{':
                    stack.Push('}');
                    break;
                default:
                    if (stack.isEmpty()) return false;
                    stack.Pop();
            }
        }
        if (!stack.isEmpty()) return false;
        else return true;
    }
}
