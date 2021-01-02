package com.example.hello.service.thead;

/**
 * @Message:
 * @Author:zhaoshaojie
 * @Date:2020/7/2322:42
 */
public class MyThread1 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run"+i);
        }
    }
}
