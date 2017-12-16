package com.day2;

/**
 * Created by 谭杰文 on 2017/12/16.
 */
public class Demo6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print("2");
            }
        });
        t.start();

        t.join();//thread.Join把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行的线程。
       // 比如在线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
        System.out.print("1");
    }
}
