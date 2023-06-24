package org.study.threadmethod03;

/**
 * @Author houlijia
 * @Date 2023-06-23 14:59
 * @Desc
 **/

public class MyThreadMethod032 extends Thread{
    public MyThreadMethod032() {
    }

    public MyThreadMethod032(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
