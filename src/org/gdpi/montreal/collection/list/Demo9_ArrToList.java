package org.gdpi.montreal.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo9_ArrToList {

    public static void main(String[] args) {
//        arrToList();
        listToArr();
    }


    public static void arrToList(){
        int[] arr={1,2,3,4};
        List<int []>list=new ArrayList<>();
        list= Arrays.asList(arr);
        System.out.println(list);
    }

    public static void listToArr(){
        ArrayList<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String [] arr=list.toArray(new String[0]);
        for (String string:arr) {
            System.out.println(string);
        }
        
    }
}
