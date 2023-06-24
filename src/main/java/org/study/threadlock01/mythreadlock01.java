package org.study.threadlock01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author houlijia
 * @Date 2023-06-23 16:02
 * @Desc
 **/
public class mythreadlock01 extends Thread{
    static int ticket=0;
   //在main中创建了多个mythreadlock01，会造成lock锁有多个，需要在前面加上static，表示所有对象共享同一把锁
   static Lock lock=new ReentrantLock();

    @Override
    public void run() {
        //1.循环
        while(true){
            lock.lock();
            try {
                //2.同步代码块
                if(ticket==50) {
                     break;
                }else{
                    Thread.sleep(100);
                    ticket++;
                    System.out.println(getName()+" 在卖第 "+ticket+" 张票");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();      //使用finally修饰最终一定会被执行，就算执行了break也会执行finally中的代码
            }
        }
    }
}
