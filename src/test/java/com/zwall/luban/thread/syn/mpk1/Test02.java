package com.zwall.luban.thread.syn.mpk1;

import java.util.concurrent.TimeUnit;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-04 18:48
 **/
public class Test02 {
    public static void main(String[] args) {
        new Thread(Test02::run02).start();
        System.out.println("main结束");

    }

    public static void run02(){
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("4444");
        }).start();

        System.out.println("ooo");

    }
}
