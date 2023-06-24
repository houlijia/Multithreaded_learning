package org.study.threadwaitandnotify02;

import org.study.threadwaitandnotify01.Desk;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author houlijia
 * @Date 2023-06-23 21:15
 * @Desc
 **/
public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }

    @Override
    public void run(){
        while(true){
            try {
                String food = queue.take();//take底层加了锁，也不需要加锁了
                System.out.println(food);  //打印结果放在了锁的外面，并不会对数据造成什么影响
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
