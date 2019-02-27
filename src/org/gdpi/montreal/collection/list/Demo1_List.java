package org.gdpi.montreal.collection.list;

import org.gdpi.montreal.collection.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo1_List {

    public static void main(String[] args) {
        ListMethod();
//        listIterator();
//        listIteratorObject();
    }


    public static  void ListMethod(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        list.add(10,10);
        list.add(3,33);//index<=size且index>=0都不会报异常
        System.out.println(list.toString());
        System.out.println("remove:"+list.remove(1));
        System.out.println(list.get(1));
        System.out.println(list.set(1,"a"));//返回被替换的元素
        System.out.println(list);
    }

    public static  void listIterator(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void listIteratorObject(){
        List list=new ArrayList();
        list.add(new Student("a",1));
        list.add(new Student("b",2));
        list.add(new Student("c",3));
        list.add(new Student("d",4));
        for (int i = 0; i < list.size(); i++) {
            Student s= (Student) list.get(i);
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }

}
