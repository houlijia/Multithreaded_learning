package org.study.threadmethod02;

/**
 * @Author houlijia
 * @Date 2023-06-23 14:59
 * @Desc
 **/

public class MyThreadMethod02 extends Thread{
    public MyThreadMethod02() {
    }

    public MyThreadMethod02(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
