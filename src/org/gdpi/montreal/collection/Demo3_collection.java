package org.gdpi.montreal.collection;

import org.gdpi.montreal.collection.bean.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Demo3_collection {
    public static void main(String[] args) {
//        collectionIteratorToArray();
        collectionIteratorToArrayCast();
    }
    public static  void collectionIteratorToArray(){
        Collection c=new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        Object[] arr=c.toArray();
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public static void collectionIteratorToArrayCast(){
        Collection c=new ArrayList();
        c.add(new Student("a",1));
        c.add(new Student("b",2));
        c.add(new Student("c",3));
        c.add(new Student("d",4));

        Object[] arr=c.toArray();
        for (int i = 0; i < arr.length; i++) {
            Student s= (Student) arr[i];
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
