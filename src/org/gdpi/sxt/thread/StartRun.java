package org.gdpi.sxt.thread;

/**
 * @program: idea
 * @description: Thread runable
 * @author: montreal
 * @create: 2019-02-27 20:32
 **/
public class StartRun implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("listing");
        }
    }

    public static void main(String[] args) {
        StartRun st=new StartRun();
        Thread t=new Thread(st);
        t.start();
        for (int i = 0; i < 32; i++) {
            System.out.println("coding");
        }
    }

}
