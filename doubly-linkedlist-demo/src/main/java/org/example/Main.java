package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DoublyLinkedList myDll = new DoublyLinkedList(7);
        myDll.getHead();
        myDll.getTail();
        myDll.getLength();

        DoublyLinkedList mDLL1 = new DoublyLinkedList(1);
        mDLL1.append(2);
        mDLL1.append(3);
        mDLL1.printList();
        mDLL1.removeLast();
        System.out.println("After removeing: ");
        mDLL1.printList();
        //================================================================
        mDLL1.prepend(3);
        System.out.println("After prepend value 3: ");
        mDLL1.printList();
    }
}