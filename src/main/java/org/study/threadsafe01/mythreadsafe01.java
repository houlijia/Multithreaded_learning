package org.study.threadsafe01;

/**
 * @Author houlijia
 * @Date 2023-06-23 16:02
 * @Desc
 **/
public class mythreadsafe01 extends Thread{
    //加上static 表示这个类所有的对象，都共享ticket数据
    static int ticket=0;

    @Override
    public void run() {
        while(true){
            if(ticket<50){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticket++;
                System.out.println(getName()+"正在卖第"+ticket+"票！");
            }else{
                break;
            }
        }

    }
}
