package org.gdpi.montreal.collection.map;

import org.gdpi.montreal.collection.bean.Student;

import java.util.HashMap;

public class Demo5_clear {

    public static void main(String[] args) {
        String string ="aaaaabbbccccaaadddccdcc ";
//        count(string);
        nest();
    }

    public static  void count(String string){
        char[] arr= string.toCharArray();
        HashMap<Character ,Integer>hs=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
//            if(hs.get(arr[i])==null){
//                hs.put(arr[i],1);
//            }else{
//                Integer count= hs.get(arr[i])+1;
//                hs.put(arr[i],count);
//            }
            hs.put(arr[i],!hs.containsKey(arr[i])?1:hs.get(arr[i])+1);
        }
        for (Character key:hs.keySet()) {
            System.out.println(key+"="+hs.get(key));
        }
    }

    public static void nest(){
        HashMap<Student,String>hm88=new HashMap<>();
        hm88.put(new Student("a",1),"beijing");
        hm88.put(new Student("b",2),"shanghai");
        HashMap<Student,String>hm89=new HashMap<>();
        hm89.put(new Student("c",3),"guangzhou");
        hm89.put(new Student("d",4),"shenzhen");
        
        HashMap<HashMap,String >hm=new HashMap<>();
        hm.put(hm88,"88");
        hm.put(hm89,"89");

        for (HashMap<Student,String> h:hm.keySet()) {
            String batch=hm.get(h);
            for(Student student:h.keySet()){
                String address=h.get(student);
                System.out.println(student+"--"+address+"--"+batch);
            }
        }
        
    }
}


