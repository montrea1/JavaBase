package org.gdpi.montreal.collection.list;

import java.util.LinkedList;

public class Demo6_LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addLast(5);
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
    }
}
