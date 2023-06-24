package org.study.thread01;

/**
 * @Author houlijia
 * @Date 2023-06-23 14:50
 * @Desc  线程的第一种启动方式
 **/
public class mymain01 {
    public static void main(String[] args) {
        Mythread01 t1 = new Mythread01();
        Mythread01 t2 = new Mythread01();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();

    }
}
