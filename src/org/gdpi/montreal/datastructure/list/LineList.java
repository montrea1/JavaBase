package org.gdpi.montreal.datastructure.list;

/**
 * @program: idea
 * @description:
 * @author: montreal
 * @create: 2019-03-01 18:15
 **/
public class LineList implements List{

    private Node head=new Node();//头节点
    private int size; //节点个数

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        checkRange(index);
        Node temp=head;
        for (int i = 0; i <=index ; i++) {
            temp=temp.next;
        }
        return temp.Data;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(Object e) {
        this.add(size,e);
    }

    @Override
    public void add(int index, Object e) {
        checkRange(index);
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        Node newNode =new Node();
        newNode.Data=e;
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int index) {
        checkRange(index);
        if(index==size){
            throw new  RuntimeException("非法索引"+index);
        }

        Node temp= head;
        Node removed=new Node();
        for (int i = 0;i < size; i++) {
            if(i==index){
                removed=temp.next;
                temp.next=temp.next.next;
            }else {
               temp=temp.next;
            }
        }
        size--;
        return removed.Data;
    }

    @Override
    public Object repalce(int index, Object e) {
        return null;
    }

    public void checkRange(int index){
        if (index<0||index>size){
            throw new RuntimeException("非法索引 "+index);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append('{');
        Node temp=head;
        for (int i = 0; i < size; i++) {
            temp=temp.next;
            sb.append(temp.Data+",");
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }
}
