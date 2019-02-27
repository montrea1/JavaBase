package org.gdpi.montreal.collection.list;
/**
 * LinkedList模拟栈结构
 */
public class Demo7_LinkedList {

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.in("a");
        stack.in("b");
        stack.in("c");
        stack.in("d");
        while (!stack.isEmpty()){
            System.out.println(stack.out());
        }
    }

}
