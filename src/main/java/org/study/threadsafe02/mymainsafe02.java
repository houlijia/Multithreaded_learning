package org.study.threadsafe02;

import org.study.threadsafe03.mythreadsafe03;

/**
 * @Author houlijia
 * @Date 2023-06-23 16:18
 * @Desc 线程安全
 *      出现的问题：1.相同的票出现多次
 *                2.出现了超出范围的票
 **/
public class mymainsafe02 {
    public static void main(String[] args) {
        mythreadsafe02 t1 = new mythreadsafe02();
        mythreadsafe02 t2 = new mythreadsafe02();
        mythreadsafe02 t3 = new mythreadsafe02();

        t1.setPriority(3);
        t2.setPriority(8);
        t3.setPriority(7);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
