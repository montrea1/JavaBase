package org.gdpi.montreal.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo4_collection {
    public static void main(String[] args) {
        collectionAll();
    }

    public static  void collectionAll(){
        Collection c1=new ArrayList() ;
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);

        Collection c2=new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        c2.add("d");

        Collection c3=new ArrayList();
        c3.add(1);
        c3.add(2);
        c3.add("a");
        c3.add("b");

//        c1.addAll( c2);//将几何c2的所有元素添加到c1
//        System.out.println(c1);
//        c1.add(c2);//将集合c2添加到集合c1
//        System.out.println(c1);
//
//        boolean b1 =c1.removeAll(c2);//只能删除addAll，不能删除add
//        System.out.println(b1);
//        System.out.println(c1);

        boolean b2=c1.retainAll(c3);//获取c1、c3交集
        System.out.println(b2);
        System.out.println(c1); //c1、c3交集

    }
}
