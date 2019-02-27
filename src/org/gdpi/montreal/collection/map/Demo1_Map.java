package org.gdpi.montreal.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1_Map {
    public static void main(String[] args) {
//        mapKeySet();
        mapEntrySet();
    }

    public static void mapKeySet(){
        Map<String,Integer>map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        Set<String> keySet=map.keySet();
        Iterator<String>it=keySet.iterator();

        while (it.hasNext()){
            String key=it.next();
            Integer value=map.get(key);
            System.out.println(key+"---"+value);
        }

        for (String key:map.keySet()) {
            Integer value=map.get(key);
            System.out.println(key+"---"+value);
        }
    }

    public static void mapEntrySet(){
        Map<String,Integer>map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);

//        Set<Map.Entry<String, Integer>> entrySet=TestMap.entrySet();
//        Iterator<Map.Entry<String,Integer>>it=entrySet.iterator();
//        while (it.hasNext()){
//            Map.Entry<String,Integer>entry=it.next();
//            String key=entry.getKey();
//            Integer value=entry.getValue();
//            System.out.println(key+"==="+value);
//        }

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
    }


}
