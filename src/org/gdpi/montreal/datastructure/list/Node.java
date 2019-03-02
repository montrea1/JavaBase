package org.gdpi.montreal.datastructure.list;

/**
 * @program: idea
 * @description:
 * @author: montreal
 * @create: 2019-03-01 18:14
 **/
public class Node {

    public Object Data;
    public Node next;

    public Node() {
    }
    public Node(Object data) {
        Data = data;
    }

    public Node(Object data, Node next) {
        Data = data;
        this.next = next;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
