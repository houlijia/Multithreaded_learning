package org.study.threadcase.choujiang03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author houlijia
 * @Date 2023-06-24 13:21
 * @Desc 抽奖练习
 *         改进：在此抽奖过程中，抽奖箱2产生了最大奖项，金额为800元
 **/
public class mymaincase03 {
    public static void main(String[] args) {
        //创建奖池
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建线程
        Mythreadcase03 t1 = new Mythreadcase03(list);
        Mythreadcase03 t2 = new Mythreadcase03(list);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();
    }
}
