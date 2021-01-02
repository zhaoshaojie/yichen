package com.example.hello.service.thead;

import java.util.Collection;
import java.util.concurrent.Callable;

/**
 * @Message:
 * @Author:zhaoshaojie
 * @Date:2020/7/2322:45
 */
public class MyThread2  implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run"+i);
        }
        return 10000;
    }
}
