package org.example.main;

import org.example.datastructure.imp.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList myLinkList = new LinkedList(4);
        //myLinkList.getHead();
        //myLinkList.getTail();
        myLinkList.getLength();
        myLinkList.printList();
        //append 1 Node
        myLinkList.append(1);
        myLinkList.getLength();
        myLinkList.printList();
    }
}