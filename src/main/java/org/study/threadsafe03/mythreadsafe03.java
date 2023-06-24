package org.study.threadsafe03;

/**
 * @Author houlijia
 * @Date 2023-06-23 19:15
 * @Desc
 **/
public class mythreadsafe03 implements Runnable{

    int ticket=0;

    @Override
    public void run() {
        //1.循环
        while(true){
            //2.同步代码块、同步方法
             if (method()) break;
        }
    }

    private synchronized boolean method() {
        if(ticket==50){
            return true;
        }else{
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+"--第"+ticket+"票-");
        }
        return false;
    }
}
