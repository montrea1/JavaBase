package org.gdpi.montreal.collection.map;

import org.gdpi.montreal.collection.bean.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo4_TreeMap {
    public static void main(String[] args) {
        Comparator();
    }

    public static void tmComparator(){
        TreeMap<Student,String>tm=new TreeMap<>();
        tm.put(new Student("c",3),"guangzhou");
        tm.put(new Student("d",4),"shenzhen");
        tm.put(new Student("a",1),"beijing");
        tm.put(new Student("b",2),"shanghai");

        System.out.println(tm);
    }

    public  static  void Comparator(){
        TreeMap<Student,String>tm=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o1.getName().compareTo(o2.getName());
                return num==0?(o1.getAge()-o2.getAge()):num;
            }
        });

        tm.put(new Student("c",3),"guangzhou");
        tm.put(new Student("d",4),"shenzhen");
        tm.put(new Student("a",1),"beijing");
        tm.put(new Student("b",2),"shanghai");

        System.out.println(tm);
    }
}

