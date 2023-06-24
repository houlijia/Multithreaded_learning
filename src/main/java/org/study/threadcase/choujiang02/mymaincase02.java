package org.study.threadcase.choujiang02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author houlijia
 * @Date 2023-06-24 13:21
 * @Desc 抽奖练习
 *         改进，抽完奖后不立马打印，最终打印出抽奖箱1中奖项，最高奖项以及总金额
 **/
public class mymaincase02 {
    public static void main(String[] args) {
        //创建奖池
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建线程
        Mythreadcase02 t1 = new Mythreadcase02(list);
        Mythreadcase02 t2 = new Mythreadcase02(list);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();
    }
}
