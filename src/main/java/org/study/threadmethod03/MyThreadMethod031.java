package org.study.threadmethod03;

/**
 * @Author houlijia
 * @Date 2023-06-23 14:59
 * @Desc
 **/

public class MyThreadMethod031 extends Thread{
    public MyThreadMethod031() {
    }

    public MyThreadMethod031(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
