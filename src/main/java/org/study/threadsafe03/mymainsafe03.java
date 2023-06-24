package org.study.threadsafe03;

import org.study.threadsafe02.mythreadsafe02;

/**
 * @Author houlijia
 * @Date 2023-06-23 16:18
 * @Desc 线程安全
 **/
public class mymainsafe03 {
    public static void main(String[] args) {

        mythreadsafe03 mr = new mythreadsafe03();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
