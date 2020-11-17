package com.zwall.luban.thread.syn.mpk1;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-01 13:31
 **/
public class RunTask implements Runnable {
    @Override
    public void run() {
        synchronized (ThreadTest1.class){
            System.out.println("线程进入"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程结束"+Thread.currentThread().getName());
        }
    }
}
