package org.gdpi.montreal.collection.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class poker {
    public static void main(String[] args) {
        ArrayList<String> pokers=pokerInit();
        HashMap<String,ArrayList<String>>dealerResult= dealer(pokers);
        showPoker(dealerResult);
    }

    public static ArrayList<String> pokerInit(){
        String[] num={"3","4","5","6","7","8","9","10","J","K","Q","A","2"};
        String[] color={"R","B","S","F"};

        ArrayList<String>pokers=new ArrayList<>();
        ArrayList<Integer>indexes=new ArrayList<>();
        int index=0;
        HashMap<Integer,String>hm=new HashMap<>();

        for (String n:num) {
            for (String c:color) {
                String poker=c.concat(n);
                pokers.add(poker);

                hm.put(index,poker);
                indexes.add(index);
                index++;
            }
        }
        pokers.add("大王");
        pokers.add(("小王"));

        hm.put(index,"小王");
        indexes.add(index);
        index++;
        hm.put(index,"大王");
        indexes.add(index);

        Collections.shuffle(pokers);
       return pokers;
    }

    public static HashMap<String, ArrayList<String>> dealer(ArrayList<String> pokers){
        ArrayList<String>one =new ArrayList<>();
        ArrayList<String>two =new ArrayList<>();
        ArrayList<String>three =new ArrayList<>();

        ArrayList<String> remainder=new ArrayList<>();
        for(int i=0;i<pokers.size();i++){
            if(i>=pokers.size()-3){
                remainder.add(pokers.get(i));
            }else if(i%3==0){
                one.add(pokers.get(i));
            }else if(i%3==1){
                two.add(pokers.get(i));
            }else {
                three.add(pokers.get(i));
            }
        }

        HashMap<String,ArrayList<String>>dealerResult=new HashMap<>();
        dealerResult.put("one",one);
        dealerResult.put("two",two);
        dealerResult.put("three",three);
        dealerResult.put("remainder",remainder);
        return dealerResult;

    }

    public static void showPoker(HashMap<String, ArrayList<String>> dealerResult){
        for (String group:dealerResult.keySet()) {
            System.out.println(group+"  "+dealerResult.get(group).toString());
        }
    }
}
