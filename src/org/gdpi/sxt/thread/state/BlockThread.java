package org.gdpi.sxt.thread.state;

/**
 * @program: idea
 * @description: sleep state
 * @author: montreal
 * @create: 2019-02-28 20:20
 **/
public class BlockThread implements Runnable{
    private int ticketNums=99;

    @Override
    public void run() {
        while (true){
            if(ticketNums<0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--->"+ticketNums--);
        }
    }

    public static void main(String[] args) {
        BlockThread blockThread=new BlockThread();
        new Thread(blockThread,"a").start();
        new Thread(blockThread,"b").start();
        new Thread(blockThread,"c").start();

    }
}
