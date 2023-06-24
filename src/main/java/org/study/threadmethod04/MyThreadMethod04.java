package org.study.threadmethod04;

/**
 * @Author houlijia
 * @Date 2023-06-23 14:59
 * @Desc
 **/

public class MyThreadMethod04 extends Thread{
    public MyThreadMethod04() {
    }

    public MyThreadMethod04(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+"@"+i);
            //表示让出当前CPU的执行权，从新去抢夺CPu执行权
            Thread.yield();
        }
    }
}
