package org.gdpi.montreal.datastructure.list;

/**
 * @program: idea
 * @description: my list
 * @author: montreal
 * @create: 2019-02-28 23:37
 **/
public interface List {
    //返回元素个数
    public int size();

    //获取指定序号的元素
    public Object get(int index);

    //线性表是否为空判断
    public boolean isEmpty();

    //查看线性表是否包含指定元素
    public boolean contains(Object e);

    //返回元素索引
    public int indexOf(Object e);

    //添加注定元素
    public void add( Object e);

    //指定索引添加元素
    public void add( int index,Object e);

    //在指定元素前添加元素
    public boolean addBefore(Object obj,Object e);

    //在指定元素后添加元素
    public boolean addAfter(Object obj,Object e);

    //根据索引删除元素
    public Object remove(int index);

    //替换元素
    public Object repalce(int index,Object e);

}
