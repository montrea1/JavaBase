package org.gdpi.sxt.thread.state;

/**
 * @program: idea
 * @description: joing thread 合并线程，插队
 * @author: montreal
 * @create: 2019-02-28 20:53
 **/
public class JoinThread {

    public static void main(String[] args) throws InterruptedException {
//        Thread t=new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                System.out.println("join thread...."+i);
//            }
//        });
//        t.start();
//        for (int i = 0; i <100; i++) {
//            if (i==20){
//                System.out.println("t.join()");
//                t.join();//插队。main被阻塞
//            }
//            System.out.println("main"+i);
//        }

        new Thread(new f()).start();

    }
}

class f extends Thread{
    @Override
    public void run() {
        System.out.println("water");
        Thread t=new Thread(new s());
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("get water");
    }
}

class s extends Thread{
    @Override
    public void run() {
        System.out.println("go..");
        try {
            System.out.println("gaming");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("back");
    }
}