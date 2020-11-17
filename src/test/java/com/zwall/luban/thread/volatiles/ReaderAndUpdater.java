package com.zwall.luban.thread.volatiles;

import java.util.concurrent.TimeUnit;

public class ReaderAndUpdater {

    final static int MAX=50;
    static volatile int init_value=0;

    public static void main(String[] args) {
        new Thread(()->{
                int localValue=init_value;
                while(localValue<MAX){
                    if(localValue!=init_value){
                        System.out.println("Reader:"+init_value);
                        localValue=init_value;
                    }
                }
        },"Reader").start();
        new Thread(()->{
            int localValue=init_value  ;
            while(localValue<MAX){
                System.out.println("updater:"+(++localValue));
                init_value=localValue;
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Updater").start();
    }
}
