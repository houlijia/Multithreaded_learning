package org.study.threadmethod05;

/**
 * @Author houlijia
 * @Date 2023-06-23 15:16
 * @Desc  礼让线程
 **/
public class mythread05 {
    public static void main(String[] args) throws InterruptedException {

        //public final void join()   插队线程

        MyThreadMethod05 t1 = new MyThreadMethod05();
        t1.setName("土豆");
        t1.start();

        //表示把t1这个线程，插入到当前线程之前
        //这个线程是指：t1
        //当前线程：main线程
        t1.join();

        //执行在main线程当中的
        for (int i = 1; i <= 10; i++) {
            System.out.println("main线程"+i);
        }
    }
}
