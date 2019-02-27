package org.gdpi.montreal.collection;

import org.gdpi.montreal.collection.bean.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2_collection {

    public static void main(String[] args) {
        collectionMethod();
    }

    public static void collectionAndArrayList(){
        Collection c=new ArrayList();

        boolean b1=c.add("a");
        boolean b2=c.add(1);
        boolean b3=c.add(new Student("zhansan",13));
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3 );

        System.out.println(c.toString());
    }

    public static void collectionMethod(){
        Collection c =new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);

        System.out.println(c.remove(1));
        System.out.println(c.contains(1));
        c.clear();
        System.out.println(c.isEmpty());
    }


}
