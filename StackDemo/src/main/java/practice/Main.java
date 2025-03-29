package practice;


public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.Push(1);
        stack.Push(2);
        stack.printStack();
        stack.Pop();
        stack.printStack();
    }
}