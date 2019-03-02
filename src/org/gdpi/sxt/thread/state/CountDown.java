package org.gdpi.sxt.thread.state;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: idea
 * @description: count down
 * @author: montreal
 * @create: 2019-02-28 20:36
 **/
public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        Date endTime=new Date(System.currentTimeMillis()+1000*10);
        long end=endTime.getTime();
        while (true){
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            Thread.sleep(1000);
            endTime=new Date(endTime.getTime()-1000);
            if(end-10000>endTime.getTime()){
                break;
            }

        }

    }
}
