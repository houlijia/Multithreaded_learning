package org.study.threadcase.hongbao01;

import java.util.Random;

/**
 * @Author houlijia
 * @Date 2023-06-24 11:05
 * @Desc
 **/
public class Mythreadcase01 extends Thread{

    //共享数据
    static double money=100;  //要建多个线程，保证共享同一数据，加上static
    //红包数量
    static int count=3;
    //最小中奖金额
    static final double MIN=0.01;

    @Override
    public void run(){
        //同步代码块
        synchronized (Mythreadcase01.class){
            if(count==0){
                //判断，共享数据是否达到了末尾
                System.out.println(getName()+"-没有抢到红包.");
            }else{
                double prize=0;
                if(count==1){
                    //表示最后一个红包
                    prize=money;
                }else{
                    //表示第一次和第二次随机时
                    Random r = new Random();
                    double bounds =money-(count-1)*MIN;
                    prize=r.nextDouble(bounds);
                    if(prize<0){
                        prize=MIN;
                    }
                }

                money=money-prize;
                count--;
                System.out.println(getName()+"抢到了"+prize+"元");
            }
        }
    }
}
