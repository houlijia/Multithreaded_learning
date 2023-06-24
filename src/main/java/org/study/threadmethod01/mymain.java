package org.study.threadmethod01;

/**
 * @Author houlijia
 * @Date 2023-06-23 14:50
 * @Desc
 **/
public class mymain {
    public static void main(String[] args) {
//        MyThreadMethod t1 = new MyThreadMethod("飞机");
//        MyThreadMethod t2 = new MyThreadMethod("坦克");
//
//        //开启线程
//        t1.start();
//        t2.start();

        //哪条线程执行到了这个方法，此时获取的就是哪条线程的对象
        Thread t = Thread.currentThread();
        System.out.println(t.getName());    //结果为main，是指main线程
    }
}
