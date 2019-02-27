package org.gdpi.montreal.collection.set;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String>   link=new LinkedHashSet();
        link.add("a");
        link.add("a");
        link.add("b");
        link.add("b");
        link.add("c");
        link.add("c");
        System.out.println(link.toString());
    }
}
