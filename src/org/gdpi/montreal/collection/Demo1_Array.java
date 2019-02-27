package org.gdpi.montreal.collection;

import org.gdpi.montreal.collection.bean.Student;

public class Demo1_Array {
    public static void main(String[] args) {
        Student[] arr=new Student[3];
        arr[0]=new Student("张三",13);
        arr[1]=new Student("李四",14);
        arr[2]=new Student("李四",14);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
