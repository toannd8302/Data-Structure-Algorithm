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
        System.out.println("Head: " + head.value);
    }

    //Get tail
    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    //Get length
    public void getLength() {
        System.out.println("Length: " + length);
    }

    //append
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode; //pointer
            tail = newNode;
        }
        length++;
    }
}
