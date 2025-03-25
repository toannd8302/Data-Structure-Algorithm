package org.example;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int vale) {
        Node newNode = new Node(vale);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node tmp = tail;
        tail = tmp.prev;
        tail.next = null;
        tmp.prev = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return tmp;
    }

    public void prepend(int vale) {
        Node newNode = new Node(vale);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        Node temp = head;
        if (length == 0) return null;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        return temp;
    }
    public void swapFirstLast(){
        if (length < 2) return;
        else{
            int temp = head.value;
            head.value = tail.value;
            tail.value = temp;
        }
    }
}
