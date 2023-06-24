package org.study.thread03;

import java.util.concurrent.Callable;

/**
 * @Author houlijia
 * @Date 2023-06-23 13:49
 * @Desc
 **/
public class MyCallable  implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
