package org.study.threadcase.choujiang04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author houlijia
 * @Date 2023-06-24 13:21
 * @Desc 抽奖练习
 *         改进，抽完奖后不立马打印，最终打印出抽奖箱1中奖项，最高奖项以及总金额
 **/
public class mymaincase04 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建奖池
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建线程
        Mythreadcase04 t = new Mythreadcase04(list);
        //创建多线程运行结果管理者对象
        FutureTask<Integer> ft1 = new FutureTask<Integer>(t);
        FutureTask<Integer> ft2 = new FutureTask<Integer>(t);
        //创建线程对象
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

        Integer max1 = ft1.get();
        Integer max2 = ft2.get();

        System.out.println("抽奖箱1的最大奖项："+max1);
        System.out.println("抽奖箱2的最大奖项："+max2);

    }
}
