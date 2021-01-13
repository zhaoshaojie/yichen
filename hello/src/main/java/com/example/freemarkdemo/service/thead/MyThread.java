package com.example.freemarkdemo.service.thead;

/**
 * @Message:
 * @Author:zhaoshaojie
 * @Date:2020/7/23 22:29
 */
public class MyThread extends Thread{

    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run:"+i);
        }
    }
}
