package org.example.main;

import org.example.datastructure.imp.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList myLinkList = new LinkedList(5);
//        //myLinkList.getHead();
//        //myLinkList.getTail();
//        myLinkList.getLength();
//        myLinkList.printList();
//        //append 1 Node
//        myLinkList.append(1);
//        myLinkList.getLength();
//        myLinkList.printList();
//        //remove last node
//        myLinkList.removeLast();
//        myLinkList.getLength();
//        myLinkList.printList();
//        //remove all nodes
//        myLinkList.removeLast();
//        myLinkList.getLength(); // --> 0
//        myLinkList.getHead(); // --> null
//        myLinkList.getTail(); // --> null
//        myLinkList.printList();
//        //prepend 1 Node
//        myLinkList.append(1);
//        myLinkList.getLength();
//        myLinkList.printList();
//        myLinkList.prepend(2);
//        myLinkList.getLength();
//        myLinkList.printList();
//        // remove first node
//        myLinkList.removeFirst();
//        myLinkList.getLength();
//        myLinkList.printList();
////        myLinkList.removeFirst();
////        myLinkList.getLength();
////        myLinkList.printList();
////        myLinkList.removeFirst();
////        myLinkList.getLength();
////        myLinkList.printList();
//        myLinkList.append(1);
//        myLinkList.append(2);
//        myLinkList.append(3);
//        myLinkList.printList();
//        myLinkList.getLength();
//        System.out.println(myLinkList.get(2).value);
        myLinkList.append(1);
        myLinkList.append(2);
        myLinkList.append(3);
        myLinkList.append(4);
        myLinkList.append(5);
        myLinkList.append(6);
        System.out.println(myLinkList.findMiddleNode().value);
        myLinkList.createLoop(3);
        System.out.println( myLinkList.hasLoop());

    }
}