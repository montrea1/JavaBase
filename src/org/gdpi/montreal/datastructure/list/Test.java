package org.gdpi.montreal.datastructure.list;

/**
 * @program: idea
 * @description: test
 * @author: montreal
 * @create: 2019-02-28 23:56
 **/
public class Test {

    public static void main(String[] args) {
        LineList l=new LineList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(1);
        l.add(5);
        System.out.println(l.toString());
        System.out.println(l.remove(0));
        System.out.println(l.toString());

    }
}
