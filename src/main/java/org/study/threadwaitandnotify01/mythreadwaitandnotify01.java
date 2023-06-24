package org.study.threadwaitandnotify01;

/**
 * @Author houlijia
 * @Date 2023-06-23 21:13
 * @Desc
 **/
public class mythreadwaitandnotify01 {
    public static void main(String[] args) {
        //创建线程对象
        Cook c = new Cook();
        Foodie f = new Foodie();
        //给线程设置名称
        c.setName("厨师");
        f.setName("吃货");
        //开启线程
        c.start();
        f.start();
    }
}
