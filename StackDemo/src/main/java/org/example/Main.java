package org.example;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        stack.printStack();
        //push 1 element
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.printStack();

    }
}