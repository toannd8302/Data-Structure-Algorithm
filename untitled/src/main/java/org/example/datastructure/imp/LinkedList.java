package org.example.datastructure.imp;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        //Node value taking
        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        this.length = 1;
    }

    //Print all Node value of likedlist
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    //Get head

    public void getHead() {
        try {
            if (head == null) {
                System.out.println("Head = null");
            } else {
                System.out.println("Head: " + head.value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Get tail
    public void getTail() {
        try {
            if (tail == null) {
                System.out.println("Tail = null");
            } else {
                System.out.println("Tail: " + tail.value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Get length
    public void getLength() {
        System.out.println("Length: " + length);
    }

    //append -->  O(1)
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; //pointer
            tail = newNode;
        }
        length++;
    }

    //Remove last node --> O(n)
    public Node removeLast() {
        //Empty LinkedList
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    //Prepend
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
}
