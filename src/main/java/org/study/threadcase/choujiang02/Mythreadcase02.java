package org.study.threadcase.choujiang02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author houlijia
 * @Date 2023-06-24 13:21
 * @Desc
 **/
public class Mythreadcase02 extends Thread{

    ArrayList<Integer> list;

    public Mythreadcase02(ArrayList<Integer> list) {
        this.list = list;
    }

    //线程1
    ArrayList<Integer> list1 =new ArrayList<Integer>();
    //线程2
    ArrayList<Integer> list2 =new ArrayList<Integer>();
    @Override
    public void run(){
        while(true){
            synchronized (Mythreadcase02.class){
                if(list.size()==0){
                    if("抽奖箱1".equals(getName())){
                        System.out.println("抽奖箱1"+list1);
                    }else{
                        System.out.println("抽奖箱2"+list2);
                    }
                    break;
                }else{
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    if("抽奖箱1".equals(getName())){
                        list1.add(prize);
                    }else{
                        list2.add(prize);
                    }
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
