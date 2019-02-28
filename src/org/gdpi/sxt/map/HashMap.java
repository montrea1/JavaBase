package org.gdpi.sxt.map;

import org.gdpi.montreal.HSingleton;

/**
 * @program: idea
 * @description: my hashMap
 * @author: montreal
 * @create: 2019-02-28 13:15
 **/
public class HashMap<K,V> {

    Node[] table;//位桶数组
    int size;

    public HashMap() {
        table=new Node[16];//长度一般为2的整数幂
    }

    //插入
    public  void put(K key,V value){
        Node newNode =new Node();
        newNode.hash=hash(key.hashCode(),table.length);
        newNode.key=key;
        newNode.value=value;
        newNode.next=null;

        //hash判断
        Node temp=table[newNode.hash];
        Node lastNode=null;
        boolean keyRepeat=false;

        //位桶数组该位置为空
        if(temp==null){
            //直接添加新Node
            table[newNode.hash]=newNode;
            size++;
        }else {//位桶数组该位置不为空
            while (temp!=null){
                //键相等，覆盖值
                if(temp.key.equals(key)){
                    keyRepeat=true;
                    temp.value=value;
                    size++;
                    break;
                }else {
                    //键不相等，调到下一个，直到next为空，跳出
                    lastNode=temp;
                    temp=temp.next;
                }
            }
            //键不重复，将newNode赋值到lastNode.next
            if(!keyRepeat){
                System.out.println("a");
                lastNode.next=newNode;
                size++;
            }
        }
    }

    //查找
    public  V get(K key){
        V value =null;
        int hash=hash(key.hashCode(),table.length);
        if(table[hash]!=null){
            Node temp=table[hash];
            while (temp.key!=null){
                if(temp.key.equals(key)){
                    value= (V) temp.value;
                    break;
                }else {
                    temp=temp.next;
                }
            }
        }
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append('{');
        for (int i = 0; i < table.length; i++) {
            Node temp=table[i];
            while (temp!=null){
                sb.append(temp.key+":"+temp.value+",");
                temp=temp.next;
            }
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }

    //获取hash值
    public int hash(int v,int length){
        System.out.println("hash:"+(v&(length-1)));
        return v&(length-1);
    }

    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap();
        m.put(10,"a");
        m.put(456,"ac");
        m.put(20,"ac");
        m.put(1,"b");
        System.out.println(m);
        System.out.println(m.get(1));
    }


}


