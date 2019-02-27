package org.gdpi.montreal.collection.generic;

public class Demo4_Generic {

}

interface  Inter<T>{
    public  void  show(T t);
}

class Demo implements  Inter<String>{
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}

class DemoInter<T> implements Inter<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}