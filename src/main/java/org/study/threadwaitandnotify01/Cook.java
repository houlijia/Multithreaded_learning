package org.study.threadwaitandnotify01;

/**
 * @Author houlijia
 * @Date 2023-06-23 21:14
 * @Desc
 **/
public class Cook extends Thread{
    @Override
    public void run(){
        while(true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    //判断桌子上是否有食物
                    if(Desk.foodflag==1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        System.out.println("厨师做了一碗面条");
                        Desk.foodflag=1;
                        Desk.lock.notify();
                    }
                }
            }
        }
    }
}
