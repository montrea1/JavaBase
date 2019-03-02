package org.gdpi.montreal.datastructure.list;

import java.util.Arrays;

/**
 * @program: idea
 * @description: my ArrayList
 * @author: montreal
 * @create: 2019-02-28 23:47
 **/
public class ArrayList implements List {

    //底层实现
    private Object[] elementData;

    //元素个数
    private int size;

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};

    public  ArrayList(){
        this.elementData=EMPTY_ELEMENTDATA;
    }

    /**
     * 初始化ArrayList
     * @param initialCapacity
     */
    public ArrayList(int initialCapacity) {
        if (initialCapacity<DEFAULT_CAPACITY){
            this.elementData=new Object[DEFAULT_CAPACITY];
        }else if(initialCapacity==0){
            this.elementData=EMPTY_ELEMENTDATA;
        }else {
            throw new ArrayListException("非法参数"+initialCapacity);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        checkRange(index);
        return elementData[index];
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
    public void add(Object e){
        grow(elementData.length);
        elementData[size]=e;
        size++;
    }

    @Override
    public void add(int index, Object e) {
        if(index<elementData.length){
            elementData[index]=e;
        }
        if(index==elementData.length){
            grow(elementData.length);
            elementData[index]=e;
        }
        if(index>elementData.length){

        }

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
    public Object remove(int i) {
        return null;
    }

    @Override
    public Object repalce(int i, Object e) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public void checkRange(int index){
        if(index<0||index>size-1){
            throw  new ArrayListException("非法索引 "+index);
        }
    }

    public int ensureGrow(int  Cap,int a){
        return 0;
    }

    public void grow(int oldCapacity){
        if (size>=elementData.length){
            int newCapacity = oldCapacity + (oldCapacity*2);
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
        if(elementData.length==0){
            elementData = Arrays.copyOf(elementData, elementData.length+1);
        }
    }
}
