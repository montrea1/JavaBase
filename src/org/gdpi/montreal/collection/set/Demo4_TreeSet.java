package org.gdpi.montreal.collection.set;

import org.gdpi.montreal.collection.bean.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo4_TreeSet {

    public static void main(String[] args) {
        compare();
    }

    public static void compare(){
        TreeSet<Person>ts=new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int num= o1.getName().length()-o2.getName().length();
                return num==0?o1.getName().compareTo(o2.getName()):num;
            }
        });
        ts.add(new Person("a",1));
        ts.add(new Person("aaaa",1));
        ts.add(new Person("b",2));
        ts.add(new Person("b",1));
        ts.add(new Person("cc",13));
        System.out.println(ts);
    }

}
