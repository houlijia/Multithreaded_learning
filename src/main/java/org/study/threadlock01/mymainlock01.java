package org.study.threadlock01;

/**
 * @Author houlijia
 * @Date 2023-06-23 16:18
 * @Desc 加锁
 **/
public class mymainlock01 {
    public static void main(String[] args) {
        mythreadlock01 t1 = new mythreadlock01();
        mythreadlock01 t2 = new mythreadlock01();
        mythreadlock01 t3 = new mythreadlock01();


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
