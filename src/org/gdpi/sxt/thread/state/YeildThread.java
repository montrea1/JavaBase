package org.gdpi.sxt.thread.state;

/**
 * @program: idea
 * @description: yeild
 * @author: montreal
 * @create: 2019-02-28 20:46
 **/
public class YeildThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"  start");
        Thread.yield();//线程礼让。直接进入就绪状态，不是阻塞状态.避免线程占用过久
        System.out.println(Thread.currentThread().getName()+"  end");
    }

    public static void main(String[] args) {
//        YeildThread yt=new YeildThread();
//        new Thread(yt,"a").start();
//        new Thread(yt,"b").start();
//        new Thread(yt,"c").start();
//        new Thread(yt,"d").start();

        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("lambda..."+i);
            } 
        }).start();

        for (int i = 0; i < 100; i++) {
            if(i%20==0){
                Thread.yield();
            }
            System.out.println("main..."+i);
        }
    }
}

