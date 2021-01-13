package com.example.freemarkdemo;

/**
 * @Message:
 * @Author:zhaoshaojie
 * @Date:2020/7/2322:32
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
     /*   MyThread thread = new MyThread();
        thread.start();
        for (int i=0;i<10;i++){
            Thread.sleep(10);
            System.out.println("mainrun:"+i);
        }*/

        /*MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1);
        thread.start();
        for (int i=0;i<10;i++){
            Thread.sleep(10);
            System.out.println("mainrun:"+i);
        }*/

        System.out.println(Thread.currentThread().getName()+"   Start");
    }
}
