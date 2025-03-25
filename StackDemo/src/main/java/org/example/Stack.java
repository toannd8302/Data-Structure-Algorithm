package org.example;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node tmp = top;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
    public void getTop(){
        System.out.println("Top: " + top);
    }
    public void getHeight(){
        System.out.println("Height: " + height);
    }
    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0){
            top = newNode;
        }else {
        newNode.next = top;
        top = newNode;
        }
        height++;
    }
    public Node pop(){
        if (height == 0) return null;
        Node tmp = top;
        top = top.next;
        tmp.next = null;
        height--;
        return tmp;
    }
}
