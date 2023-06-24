package org.study.threadpool01;

/**
 * @Author houlijia
 * @Date 2023-06-24 15:22
 * @Desc
 **/
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---");
    }
}
