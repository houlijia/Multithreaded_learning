package org.study.threadsafe02;

/**
 * @Author houlijia
 * @Date 2023-06-23 16:02
 * @Desc
 **/
public class mythreadsafe02 extends Thread{
    //加上static 表示这个类所有的对象，都共享ticket数据
    static int ticket=0;

    //锁对象，一定要是唯一的！！！！，加上static就可以了
    static Object obj=new Object();

    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (obj){   //mythreadsafe02.class   可以使用字节码文件
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
}
