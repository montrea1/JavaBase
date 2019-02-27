package org.gdpi.sxt.collection;

/***
 * 自定义链表
 * */
public class LinkedList {
    private  Node first; //第一个节点
    private Node last; //最后一个节点

    private  int size; //长度

    //检查索引
    private void checkRange(int index){
        if(index<0||index>size-1){
            throw  new RuntimeException("非法索引"+index);
        }
    }

    //获取节点
    public Node getNode(int index){
        checkRange(index);
        Node temp=null ;

        if(index<=(size>>1)){
            temp=first;
            for (int i=0;i<index;i++){
                temp=temp.next;
            }
        }else {
            temp=last;
            for (int i=size-1;i>index;i--){
                temp=temp.previos;
            }
        }
        return temp;
    }

    //插入节点
    private  void  add(int index,Object obj){
        checkRange(index);

        Node newNode=new Node(obj);
        Node temp=getNode(index);

        //a  c→a b c
        //a.next←b  n.pre←a   b.next←c   c.pre←b
        if(temp!=null){
            Node pre=temp.previos;
            pre.next=newNode;
            newNode.previos=pre;

            newNode.next=temp;
            temp.previos=newNode;
        }
        size++;
    }

    //添加元素
    private void  add(Object obj){
        Node node=new Node(obj);
        if(first==null){
            first=node;
            last=node;
        }else{
            node.previos=last;
            node.next=null;
            last.next=node;
            last=node;
        }
        size++;
    }

    //查询元素
    public Object get(int index){
        checkRange(index);
        Node temp=getNode(index);
       return temp!=null?temp.element:null;
    }

    //删除
    public void remove(int index){
        checkRange(index);
        Node temp=getNode(index);

        if(temp!=null){
            Node pre=temp.previos;
            Node suffix=temp.next;
            if (pre!=null){
                pre.next=suffix;
            }
            if (suffix!=null){
                suffix.previos=pre;
            }
            if(index==0){
                first=suffix;
            }
            if (index==size-1){
                last=pre;
            }
            size--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        Node temp=first;
        while (temp!=null){
            sb.append(temp.element+",");
            temp=temp.next;
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }



    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");

        list.add(1,"d");

        System.out.println(list);
    }
}
