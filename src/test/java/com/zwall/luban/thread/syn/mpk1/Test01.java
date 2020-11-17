package com.zwall.luban.thread.syn.mpk1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-04 13:38
 **/
public class Test01 {

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            new Thread(Test01::run1).start();
        }
        System.out.println("555");
    }

    public static void run1(){
        new Thread(()->{
            System.out.println("a1");
            try {
                TimeUnit.SECONDS.sleep(3L);
                System.out.println("a2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
        ).start();
        new Thread(()->{
            System.out.println("b1");
            try {
                TimeUnit.SECONDS.sleep(1L);
                System.out.println("b2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
        ).start();
    }
}
