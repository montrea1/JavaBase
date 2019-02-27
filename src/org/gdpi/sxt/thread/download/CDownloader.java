package org.gdpi.sxt.thread.download;

import java.util.concurrent.*;

/**
 * @program: idea
 * @description: callable Thread
 * @author: montreal
 * @create: 2019-02-27 21:05
 **/
public class CDownloader implements Callable<Boolean> {
    private  String url;
    private String name;

    public CDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }
    @Override
    public Boolean call() throws Exception {
        WebDownloader wd=new WebDownloader();
        System.out.println(name);
        wd.download(url,name);
        return true;
    }

    public static void main(String[] args) {
        CDownloader cd1=new CDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551874936&di=56b4833012655ecb0a96175c78db9734&imgtype=jpg&er=1&src=http%3A%2F%2Fh.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Fd1160924ab18972b83474beeedcd7b899e510a90.jpg","bed.jpg");
        CDownloader cd2=new CDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551874834&di=5c26b70401777747b90703f5aec1ffee&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.ph.126.net%2FRCC5BQWsRB4nQsvtZA5rDg%3D%3D%2F649081296311594384.jpg","big.jpg");
        CDownloader cd3=new CDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551874814&di=afa6dc4b362cbd6136728192bf567005&imgtype=jpg&er=1&src=http%3A%2F%2Fscimg.jb51.net%2Fallimg%2F170109%2F106-1F109120J9646.jpg","classroom.jpg");

        ExecutorService ser= Executors.newFixedThreadPool(3);
        Future<Boolean>r1=ser.submit(cd1);
        Future<Boolean>r2=ser.submit(cd2);
        Future<Boolean>r3=ser.submit(cd3);
        ser.shutdown();
    }


}
