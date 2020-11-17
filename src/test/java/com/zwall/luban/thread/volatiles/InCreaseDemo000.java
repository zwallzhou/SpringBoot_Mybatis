package com.zwall.luban.thread.volatiles;

public class InCreaseDemo000 {
    static volatile int m=0;

    public  static void increase(){
        m=m+1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j < 5; j++) {
                        increase();
                }
            }).start();
        }//0，分析为什么是0
        System.out.println(m);
    }
}
