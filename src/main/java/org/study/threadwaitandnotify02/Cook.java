package org.study.threadwaitandnotify02;

import org.study.threadwaitandnotify01.Desk;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author houlijia
 * @Date 2023-06-23 21:14
 * @Desc
 **/
public class Cook extends Thread{

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }

    @Override
    public void run() {

        while(true){
            try {
                queue.put("面条");//这里不需要写锁，源码里加了锁
                System.out.println("厨师放了一碗面条了");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
