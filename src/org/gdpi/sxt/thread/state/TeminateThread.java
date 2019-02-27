package org.gdpi.sxt.thread.state;

/**
 * @program: idea
 * @description: terminate thread
 * @author: montreal
 * @create: 2019-02-27 21:51
 **/
public class TeminateThread implements  Runnable{
    //1.加入标识，标记线程是否可以运行
    private boolean flag=true;
    private String name;

    public TeminateThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int i=0;
        //2.关联标识符，true→运行，flase→终止
        while (flag){
            System.out.println(name+"-->"+i++);
        }
    }
    //3.对外提供方法改变表示
    public void terminate(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TeminateThread tt=new TeminateThread("c");
        new Thread(tt).start();
        for (int i = 0; i <100 ; i++) {
            if(i==88){
                tt.terminate();//县城终止
                System.out.println("thread over");
            }
            System.out.println("main-->"+i);
        }
    }
}
