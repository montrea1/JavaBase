package org.gdpi.montreal.collection.map;

import org.gdpi.montreal.collection.bean.Student;

import java.util.HashMap;

public class Demo3_HashMap {
    public static void main(String[] args) {
        HashMap<Student,String>hm=new HashMap<>();
        hm.put(new Student("a",1),"shanghai");
        hm.put(new Student("b",2),"beijing");
        hm.put(new Student("c",3),"shenzhen");
        hm.put(new Student("d",4),"guangzhou");
        System.out.println(hm);
    }

}
