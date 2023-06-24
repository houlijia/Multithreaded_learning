package org.study.threadmethod05;

/**
 * @Author houlijia
 * @Date 2023-06-23 14:59
 * @Desc
 **/

public class MyThreadMethod05 extends Thread{
    public MyThreadMethod05() {
    }

    public MyThreadMethod05(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
