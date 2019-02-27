package org.gdpi.montreal.collection.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_Generic {
    public static void main(String[] args) {
        genericIterator();
    }

    public static void genericIterator(){
        ArrayList<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
