package org.study.threadcase.choujiang03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author houlijia
 * @Date 2023-06-24 13:21
 * @Desc
 **/
public class Mythreadcase03 extends Thread{

    ArrayList<Integer> list;

    public Mythreadcase03(ArrayList<Integer> list) {
        this.list = list;
    }


    @Override
    public void run(){
        //利用了线程栈，每个线程栈里都有自己的arraylist
        ArrayList<Integer> boxlist =new ArrayList<Integer>();
        while(true){
            synchronized (Mythreadcase03.class){
                if(list.size()==0){
                    System.out.println(getName()+boxlist);
                    break;
                }else{
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    boxlist.add(prize);
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
