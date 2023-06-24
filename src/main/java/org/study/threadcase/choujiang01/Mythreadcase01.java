package org.study.threadcase.choujiang01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author houlijia
 * @Date 2023-06-24 13:21
 * @Desc
 **/
public class Mythreadcase01 extends Thread{

    ArrayList<Integer> list;

    public Mythreadcase01(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run(){
        while(true){
            synchronized (Mythreadcase01.class){
                if(list.size()==0){
                    //System.out.println("奖项已经抽完");
                    break;
                }else{
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    System.out.println(getName()+"又产生了"+prize+"元的奖项");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
