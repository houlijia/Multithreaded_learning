package org.study.thread02;

/**
 * @Author houlijia
 * @Date 2023-06-23 16:02
 * @Desc
 **/
public class mythread02 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName()+"--实现Runable方法");
        }
    }
}
