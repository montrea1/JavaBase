package org.gdpi.sxt.collection.set;


import java.util.HashMap;

/**
 * @program: idea
 * @description: HashSet
 * @author: montreal
 * @create: 2019-03-01 15:27
 **/
public class HashSet {
    HashMap map;

    private static final Object PRESENT=new Object();

    public HashSet() {
        map=new HashMap();
    }

    public int size(){
        return map.size();
    }

    public void add(Object o){
        map.put(o,PRESENT);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append('{');
        for (Object key:map.keySet()) {
            sb.append(key+",");
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }



    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add("a");
        set.add("a");
        set.add("b");
        System.out.println(set.toString());
    }


}
