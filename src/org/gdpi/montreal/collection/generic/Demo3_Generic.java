package org.gdpi.montreal.collection.generic;

import org.gdpi.montreal.collection.bean.Student;
import org.gdpi.montreal.collection.bean.Tool;

public class Demo3_Generic {
    public static void main(String[] args) {
        genericT();
    }

    public  static void genericT(){
        Tool<String>t=new Tool<>();
        t.show(true);
    }


    public  static  void generic(){
        Tool<Student> t = new Tool<>();
        t.setQ(new Student("a",1));
        System.out.println(t.getQ());
//        tool.setObj(new Student("a",1));
//        tool.setObj(new Worker("b",2));
//        Worker w= (Worker) tool.getObj();
//        System.out.println(w);
    }
}
