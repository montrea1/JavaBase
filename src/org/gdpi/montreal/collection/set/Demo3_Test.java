package org.gdpi.montreal.collection.set;

import java.util.*;

public class Demo3_Test {
    public static void main(String[] args) {
//        scanner();
        ArrayList<String>list=new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        clear(list);
        System.out.println(list);
    }

    public static void random(){
        Random random=new Random();
        HashSet<Integer>hs=new HashSet<>();
        for (int i=0;i<20;i++){
            hs.add(random.nextInt(20)+1);
        }
        for (Integer integer:hs) {
            System.out.println(integer);
        }
    }

    public static void scanner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入:");
        HashSet<Character>hs=new HashSet<>();
        String line=sc.nextLine();

        char[] arr=line.toCharArray();
        for (char c:arr) {
            hs.add(c);
        }
        for (Character ch:hs) {
            System.out.println(ch);
        }
    }

    public static void clear(List<String> list){
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        linkedHashSet.addAll(list);
        list.clear();
        list.addAll(linkedHashSet);
    }
}
