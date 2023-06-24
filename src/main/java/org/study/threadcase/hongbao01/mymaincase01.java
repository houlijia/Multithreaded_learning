package org.study.threadcase.hongbao01;

/**
 * @Author houlijia
 * @Date 2023-06-24 11:04
 * @Desc 微信抢红包，假设100块，分成3个红包，现在5个人去抢
 *       其中红包是共享数据，5个人5条线程
 **/
public class mymaincase01 {
    public static void main(String[] args) {
        Mythreadcase01 t1 = new Mythreadcase01();
        Mythreadcase01 t2 = new Mythreadcase01();
        Mythreadcase01 t3 = new Mythreadcase01();
        Mythreadcase01 t4 = new Mythreadcase01();
        Mythreadcase01 t5 = new Mythreadcase01();
        Mythreadcase01 t6 = new Mythreadcase01();

        t1.setName("人1");
        t2.setName("人2");
        t3.setName("人3");
        t4.setName("人4");
        t5.setName("人5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
