package org.gdpi.montreal.collection;

import org.gdpi.montreal.collection.bean.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo5_collection {
    public static void main(String[] args) {
//        collectionIterator();
        collectionIteratorObject();
    }


    public static  void collectionIterator(){
        Collection c=new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        Iterator it=c.iterator(); //获取迭代器
//        boolean b1=it.hasNext(); //判断集合是否为空，不为空返回true
//        Object obj1=it.next(); //获取迭代器元素
//        System.out.println(b1);
//        System.out.println(obj1);

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static  void collectionIteratorObject(){
        Collection c=new ArrayList();
        c.add(new Student("a",1));
        c.add(new Student("b",2));
        c.add(new Student("c",3));
        c.add(new Student("d",4));

        Iterator it=c.iterator();
        while (it.hasNext()){
            Student s= (Student) it.next();
            System.out.println(s.getName()+"----"+s.getAge());
        }
    }
}
