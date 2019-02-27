package org.gdpi.montreal.collection.list;

import org.gdpi.montreal.collection.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo5_ArrayList_Equal {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(new Person("a",1));
        list.add(new Person("a",1));
        list.add(new Person("b",2));
        list.add(new Person("b",2));
        list.add(new Person("c",3));
        list.add(new Person("c",3));
//        ArrayList equalsList= arrayListEquals(list);
//        System.out.println(equalsList);
        list.remove(new Person("a",1));
        System.out.println(list);
    }

    public static ArrayList arrayListEquals(ArrayList list){
        ArrayList newList=new ArrayList();
        Iterator it=list.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            if(!newList.contains(obj)){
                newList.add(obj);
            }
        }
        return  newList;
    }
}
