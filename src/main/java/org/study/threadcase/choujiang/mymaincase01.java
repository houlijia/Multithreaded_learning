package org.study.threadcase.choujiang;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author houlijia
 * @Date 2023-06-24 13:21
 * @Desc 抽奖练习
 **/
public class mymaincase01 {
    public static void main(String[] args) {
        //创建奖池
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,10,5,20,50,100,200,500);

        //创建线程
        Mythreadcase01 t1 = new Mythreadcase01(list);
        Mythreadcase01 t2 = new Mythreadcase01(list);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();
    }
}
