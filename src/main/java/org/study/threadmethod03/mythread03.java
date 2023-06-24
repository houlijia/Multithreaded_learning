package org.study.threadmethod03;

import org.study.threadmethod02.MyThreadMethod02;

/**
 * @Author houlijia
 * @Date 2023-06-23 15:16
 * @Desc  当其他的非守护线程执行完毕后，守护线程会陆续结束
 *          当女神线程结束侯，备胎线程也没有存在的必要了
 **/
public class mythread03 {
    public static void main(String[] args) {
        MyThreadMethod031 t1 = new MyThreadMethod031();
        MyThreadMethod032 t2 = new MyThreadMethod032();

        t1.setName("女神");
        t2.setName("备胎");
        //将第二个线程设置为守护线程（备胎线程）
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
