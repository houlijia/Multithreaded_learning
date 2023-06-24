package org.study.threadwaitandnotify01;

/**
 * @Author houlijia
 * @Date 2023-06-23 21:15
 * @Desc
 **/
public class Foodie extends Thread{
    @Override
    public void run(){
        /**
         *  1.循环
         *  2.同步代码块
         *  3.判断共享数据是否到了末尾（到了末尾）
         *  4.判断共享数据是否到了末尾（没有到末尾，处理核心业务逻辑）  静态变量使用：直接类名.XX调用
         */
        while(true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    //先判断桌上是否有食物
                    if(Desk.foodflag==0){
                        //如果没有就等待
                        try {
                            Desk.lock.wait();//让当前线程和锁进行绑定，底层源码是这么实现的
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        //把吃的数量-1
                        Desk.count--;
                        //如果有就开吃
                        System.out.println("吃货正在吃面条，还能再吃"+Desk.count+"碗！！");
                        //吃完之后，唤醒厨师继续做
                        Desk.lock.notify();
                        //修改桌子状态
                        Desk.foodflag=0;
                    }
                }
            }
        }
    }
}
