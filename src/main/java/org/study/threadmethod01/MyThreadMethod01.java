package org.study.threadmethod01;

/**
 * @Author houlijia
 * @Date 2023-06-23 14:59
 * @Desc
 **/

public class MyThreadMethod01 extends Thread{
    public MyThreadMethod01() {
    }

    public MyThreadMethod01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
