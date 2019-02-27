package org.gdpi.montreal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo4_ArrayList {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
       ArrayList singleList= getSingle(list);
        System.out.println(singleList.toString());
    }

    public static ArrayList getSingle(ArrayList list){
        ArrayList newList=new  ArrayList();
        Iterator it=list.iterator();
        while (it.hasNext()){
            if(!newList.contains(it.next())){
                newList.add(it.next());
            }
        }
        return  newList;
    }
}
