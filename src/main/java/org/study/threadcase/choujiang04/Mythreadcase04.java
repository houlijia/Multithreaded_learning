package org.study.threadcase.choujiang04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

/**
 * @Author houlijia
 * @Date 2023-06-24 13:21
 * @Desc
 **/
public class Mythreadcase04 implements Callable<Integer> {

    ArrayList<Integer> list;

    public Mythreadcase04(ArrayList<Integer> list) {
        this.list = list;
    }
    @Override
    public Integer call() throws Exception {

        //利用了线程栈，每个线程栈里都有自己的arraylist
        ArrayList<Integer> boxlist =new ArrayList<Integer>();
        while(true){
            synchronized (Mythreadcase04.class){
                if(list.size()==0){
                    System.out.println(Thread.currentThread().getName()+boxlist);
                    break;
                }else{
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    boxlist.add(prize);
                }
            }
                Thread.sleep(10);
        }

        //获取集合最大值
        if(boxlist.size()==0){
            return null;
        }else{
            return Collections.max(boxlist);
        }

    }
}
