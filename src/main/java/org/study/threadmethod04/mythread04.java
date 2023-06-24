package org.study.threadmethod04;

import org.study.threadmethod03.MyThreadMethod031;
import org.study.threadmethod03.MyThreadMethod032;

/**
 * @Author houlijia
 * @Date 2023-06-23 15:16
 * @Desc  礼让线程
 **/
public class mythread04 {
    public static void main(String[] args) {

        //public static void yield()   礼让线程

        MyThreadMethod04 t1 = new MyThreadMethod04();
        MyThreadMethod04 t2 = new MyThreadMethod04();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();
    }
}
