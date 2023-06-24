package org.study.thread02;

/**
 * @Author houlijia
 * @Date 2023-06-23 16:03
 * @Desc  线程的第二种启动方式
 **/
public class mymain02 {
    /**
     * 多线程的第二种启动方式
     * 1.自己定义一个类实现Runnable接口
     * 2.重写run方法
     * 3.创建自己类的对象
     * 4.创建一个Thread线程，开启线程
     */
    public static void main(String[] args) {

        mythread02 mr = new mythread02();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
