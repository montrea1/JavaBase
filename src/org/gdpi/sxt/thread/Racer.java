package org.gdpi.sxt.thread;

/**
 * @program: idea
 * @description: run game
 * @author: montreal
 * @create: 2019-02-27 20:48
 **/
public class Racer implements  Runnable {
    private String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(Thread.currentThread().getName().equals("rabbit")&&i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            boolean flag=gameOver(i);
            if(flag){
                break;
            }
        }
    }

    private boolean gameOver(int steps){
        if (winner!=null){
            return true;
        }else {
            if(steps==100){
                winner=Thread.currentThread().getName();
                System.out.println("winner==>"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Racer r=new Racer();
        new Thread(r,"tortoise").start();
        new Thread(r,"rabbit").start();
    }

}
