package org.gdpi.sxt.collection;

public class Node {

    Node previos; //上一个节点
    Node next;  //下一个节点
    Object element; //元素数据

    public Node(Node previos, Node next, Object element) {
        super();
        this.previos = previos;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        super();
        this.element = element;
    }
}
