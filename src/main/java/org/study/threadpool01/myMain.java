package org.study.threadpool01;

import java.util.concurrent.*;

/**
 * @Author houlijia
 * @Date 2023-06-24 15:23
 * @Desc  线程池
 **/
public class myMain {

    // public static ExecutorService newCachedThreadPool()                创建一个没有上限的线程池
    // public static ExecutorService newFixedThreadPool(int nThread)      创建一个固定数量的线程池
    // ThreadPoolExecutor  threadpoolExecutor=new ThreadPoolExecutor（)    自定义线程池
    public static void main(String[] args) throws InterruptedException {
        //获取线程池对象
        //ExecutorService pool1 = Executors.newCachedThreadPool();
        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, //核心线程池数量
                6, //最大线程池数量
                60,//空闲线程最大存活时间
                TimeUnit.SECONDS,//存活时间单位
                new ArrayBlockingQueue<Runnable>(3),  //任务队列
                Executors.defaultThreadFactory(),//创建线程池工厂
                new ThreadPoolExecutor.AbortPolicy()//默认拒绝策略
        );

        //pool.submit(new MyRunnable());   //提交任务


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
