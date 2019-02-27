package org.gdpi.montreal.collection.list;

import java.util.LinkedList;

public class Stack {
    private LinkedList list=new LinkedList();

    public void in(Object obj){
        list.addLast(obj);
    }

    public Object out(){
        return  list.removeLast();
    }

    boolean isEmpty(){
        return list.isEmpty();
    }

}
