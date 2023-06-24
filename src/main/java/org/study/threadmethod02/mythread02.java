package org.study.threadmethod02;

/**
 * @Author houlijia
 * @Date 2023-06-23 15:16
 * @Desc
 **/
public class mythread02 {
    public static void main(String[] args) {
        MyThreadMethod02 t1 = new MyThreadMethod02("飞机");
        MyThreadMethod02 t2 = new MyThreadMethod02("坦克");

        t1.setPriority(1);
        t2.setPriority(10);

        //开启线程
        t1.start();
        t2.start();

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
