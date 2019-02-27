package org.gdpi.montreal.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo2_List {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("world");
        list.add("3");
        list.add("4");

//        Iterator it=list.listIterator();
//        while (it.hasNext()){
//            String str= (String) it.next();
//            if ("world".equals(str)){
//                list.add("javaee");
//            }
//        }
        ListIterator lit=list.listIterator();
        while (lit.hasNext()){
            String str= (String) lit.next();
            if("world".equals(str)){
                lit.add("javaee");
            }
        }
        System.out.println(list.toString());
    }
}
