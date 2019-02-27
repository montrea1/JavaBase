package org.gdpi.sxt.thread.download;

/**
 * @program: idea
 * @description: 下载器
 * @author: montreal
 * @create: 2019-02-27 20:18
 **/
public class TDownloader extends Thread{
    private  String url;
    private String name;

    public TDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader wd=new WebDownloader();
        System.out.println(name);
        wd.download(url,name);
    }

    public static void main(String[] args) {
        TDownloader td1=new TDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551874936&di=56b4833012655ecb0a96175c78db9734&imgtype=jpg&er=1&src=http%3A%2F%2Fh.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Fd1160924ab18972b83474beeedcd7b899e510a90.jpg","bed.jpg");
        TDownloader td2=new TDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551874834&di=5c26b70401777747b90703f5aec1ffee&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.ph.126.net%2FRCC5BQWsRB4nQsvtZA5rDg%3D%3D%2F649081296311594384.jpg","big.jpg");
        TDownloader td3=new TDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551874814&di=afa6dc4b362cbd6136728192bf567005&imgtype=jpg&er=1&src=http%3A%2F%2Fscimg.jb51.net%2Fallimg%2F170109%2F106-1F109120J9646.jpg","classroom.jpg");
        td1.start();
        td2.start();
        td3.start();
    }
}
