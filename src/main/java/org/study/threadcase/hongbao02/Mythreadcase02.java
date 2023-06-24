package org.study.threadcase.hongbao02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * @Author houlijia
 * @Date 2023-06-24 11:05
 * @Desc
 **/
public class Mythreadcase02 extends Thread{

    //共享数据
    static BigDecimal money= BigDecimal.valueOf(100.0);  //要建多个线程，保证共享同一数据，加上static
    //红包数量
    static int count=3;
    //最小中奖金额
    static final BigDecimal MIN=BigDecimal.valueOf(0.01);

    @Override
    public void run(){
        //同步代码块
        synchronized (Mythreadcase02.class){
            if(count==0){
                //判断，共享数据是否达到了末尾
                System.out.println(getName()+"-没有抢到红包.");
            }else{
                BigDecimal prize;
                if(count==1){
                    //表示最后一个红包
                    prize= money;
                }else{
                    //表示第一次和第二次随机时
                    Random r = new Random();
                    double bounds=money.subtract(BigDecimal.valueOf(count-1).multiply(MIN)).doubleValue();
                    prize=BigDecimal.valueOf(r.nextDouble(bounds));
                }
                prize=prize.setScale(2, RoundingMode.HALF_UP);
                money=money.subtract(prize);
                count--;
                System.out.println(getName()+"抢到了"+prize+"元");
            }
        }
    }
}
