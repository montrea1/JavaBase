package org.gdpi.sxt.thread.proxy;

/**
 * 静态代理
 * 公共接口：
 * 1.真实角色
 * 2.代理角色
 * @program: idea
 * @description: marry
 * @author: montreal
 * @create: 2019-02-27 21:13
 **/
public class StaticProxy {
    public static void main(String[] args) {
        new Proxy(new You()).happyMary();
    }
}

interface  Marry{
    void  happyMary();
}
//真实角色
class You implements Marry{
    @Override
    public void happyMary() {
        System.out.println("marry hapapy");
    }
}

//代理角色
class Proxy implements Marry{
    //真实角色
    private Marry target;
    public Proxy(Marry target){
        this.target=target;
    }
    //织入 
    @Override
    public void happyMary() {
        ready();//增强
        this.target.happyMary();//连接点
        after();
    }
    public void ready(){
        System.out.println("ready");
    }
    public  void  after(){
        System.out.println("after");
    }
}
