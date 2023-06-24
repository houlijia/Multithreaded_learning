package org.study.thread01;

/**
 * @Author houlijia
 * @Date 2023-06-23 14:50
 * @Desc
 **/
public class Mythread01 extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName()+"--hello--"+i);
        }
    }
}
