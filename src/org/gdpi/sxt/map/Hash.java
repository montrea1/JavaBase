package org.gdpi.sxt.map;

/**
 * @program: idea
 * @description: hash
 * @author: montreal
 * @create: 2019-02-28 13:11
 **/
public class Hash {
    public static void main(String[] args) {
        int h=123456;
        int length=16;
        myHash(h,length);
    }

    public static int myHash(int h,int lenght){
        System.out.println(h&(lenght-1));
        System.out.println(h%lenght);
        return h&(lenght-1);
    }
}
