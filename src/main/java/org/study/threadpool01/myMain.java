package org.study.threadpool01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author houlijia
 * @Date 2023-06-24 15:23
 * @Desc  线程池
 **/
public class myMain {

    // public static ExecutorService newCachedThreadPool()             创建一个没有上限的线程池
    // public static ExecutorService newFixedThreadPool(int nThread)   创建一个固定数量的线程池
    public static void main(String[] args) throws InterruptedException {
        //获取线程池对象
        //ExecutorService pool1 = Executors.newCachedThreadPool();
        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        //提交任务
      //  Thread.sleep(1000);
        pool1.submit(new MyRunnable());
       // Thread.sleep(1000);
        pool1.submit(new MyRunnable());
      //  Thread.sleep(1000);
        pool1.submit(new MyRunnable());
      //  Thread.sleep(1000);
        pool1.submit(new MyRunnable());
       // Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        //销毁线程池
        //pool1.shutdown();

    }
}
