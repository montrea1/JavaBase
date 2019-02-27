package org.gdpi.montreal.collection.set;

import java.util.*;

public class Demo5_SetTest {
    public static void main(String[] args) {
//        ArrayList<String>list=new ArrayList<>();
//        list.add("a");
//        list.add("a");
//        list.add("b");
//        list.add("bbb");
//        list.add("c");
//        list.add("c");
//        list.add("dddd");
//        list.add("ddddd");
//
//        keepAllsort(list);
//        System.out.println(list);
        Inputsort();
    }

    public static void keepAllsort(List<String> list){
        TreeSet ts=new TreeSet(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num=s1.compareTo(s2);
                return num==0?1:num;
            }
        });
        ts.addAll(list);
        list.clear();
        list.addAll(ts);
    };

    public static void Inputsort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        String line= sc.nextLine();
        char[] arr=line.toCharArray();

        TreeSet<Character>ts=new TreeSet(new Comparator<Character>() {
            @Override
            public int compare(Character s1, Character s2) {
                int num=s1.compareTo(s2);
                return num==0?1:num;
            }
        });

        for (Character ch: arr) {
            ts.add(ch);
        }
        for (Character ch:ts){
            System.out.print(ch);
        }


    }
}
