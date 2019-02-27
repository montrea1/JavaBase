package org.gdpi.montreal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo8_ForEach {
    public static void main(String[] args) {
//        listForRemove();
        IteratorRemove();

    }

    public static void listForRemove(){
        ArrayList<String >list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");

        for (int i = 0; i <list.size(); i++) {
            if("b".equals(list.get(i))){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    public static void IteratorRemove(){
        ArrayList<String >list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");

//        Iterator lit=list.iterator();
//        while (lit.hasNext()){
//            if("b".equals(lit.next())){
//                lit.remove();
//            }
//        }

        for(Iterator<String>it2=list.iterator();it2.hasNext();){
            if("b".equals(it2.next())){
                it2.remove();
            }
        }
        System.out.println(list.toString());
    }

    public static void forEachEemove(){
        ArrayList<String >list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");

        for(String  string :list){
            if ("b".equals(string)){
               //list.remove();//foreach不能删除只能遍历
            }
        }
        System.out.println(list);
    }
    
}
