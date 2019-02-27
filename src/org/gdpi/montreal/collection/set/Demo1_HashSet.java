package org.gdpi.montreal.collection.set;

import org.gdpi.montreal.collection.bean.Person;

import java.util.HashSet;

public class Demo1_HashSet {

    public static void main(String[] args) {
        hash();
    }

    public static void hash(){
        HashSet<Person>hs=new HashSet<>();
        hs.add(new Person("a",1));
        hs.add(new Person("a",1));
        hs.add(new Person("b",2));
        hs.add(new Person("b",2));
        hs.add(new Person("c",3));
        hs.add(new Person("c",3));
        System.out.println(hs.size());
    }

}
