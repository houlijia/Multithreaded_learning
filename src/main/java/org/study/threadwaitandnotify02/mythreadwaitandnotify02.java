package org.study.threadwaitandnotify02;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author houlijia
 * @Date 2023-06-23 22:07
 * @Desc
 **/
public class mythreadwaitandnotify02 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        c.start();
        f.start();


    }
}
