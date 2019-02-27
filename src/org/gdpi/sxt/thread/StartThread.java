package org.gdpi.sxt.thread;

/**
 * Thread
 */
public class StartThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("listing");
        }
    }

    public static void main(String[] args) {
        StartThread st=new StartThread();
        for (int i = 0; i < 20; i++) {
            System.out.println("gaming");
        }
        st.start();//不保证立即进行。在start()方法之前，单线程，之后多线程。

    }
}
