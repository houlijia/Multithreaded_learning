package org.study.threadwaitandnotify01;

/**
 * @Author houlijia
 * @Date 2023-06-23 21:16
 * @Desc
 **/
public class Desk {
    /**
     * 作用：用于控制生产者和消费者执行
     */
    //是否有面条  0:没有面条   1:有面条
    public static int foodflag=0;

    //总个数
    public static int count=10;

    //锁对象
    public static Object lock=new Object();
}
