package org.gdpi.montreal.collection.generic;

import org.gdpi.montreal.collection.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_Generic {
    public static void main(String[] args) {
        generic();
    }

    public static void generic(){
        ArrayList<Person> list=new ArrayList();
        list.add(new Person("a",1));
        list.add(new Person("b",2));
        Iterator <Person>it=list.iterator();
        while (it.hasNext()){
            //next方法只能调用一次，调用第二次会后移
            Person person=it.next();
            System.out.println(person.getName()+"---"+person.getAge());
        }

    }
}

