package org.gdpi.montreal.collection.list;

import org.gdpi.montreal.collection.bean.Person;

import java.util.ArrayList;

public class Demo10_ArrayList {
    public static void main(String[] args) {
        arrayList();
    }

    public static  void arrayList(){
        ArrayList<ArrayList<Person>>lists=new ArrayList<>();

        ArrayList<Person> first=new ArrayList<>();
        first.add(new Person("a",1));
        first.add(new Person("b",2));
        first.add(new Person("c",3));

        ArrayList<Person> second=new ArrayList<>();
        second.add(new Person("d",4));
        second.add(new Person("e",5));
        second.add(new Person("f",6));

        lists.add(first);
        lists.add(second);

        for (ArrayList<Person> plist:lists){
            for(Person p:plist){
                System.out.println(p.getName()+"----"+p.getAge());
            }
        }

    }

}
