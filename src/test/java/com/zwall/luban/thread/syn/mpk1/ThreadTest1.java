package com.zwall.luban.thread.syn.mpk1;

import org.junit.Test;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-01 13:30
 **/
public class ThreadTest1 {
    public static void main(String[] args) {
        new Thread(new RunTask()).start();
        new Thread(new RunTask()).start();
        //TimeUnit.SECONDS.sleep(1);

    }
    @Test
    public void test1() throws InterruptedException {
        new Thread(new RunTask()).start();
        //Thread.sleep(5000);]
        System.out.println("tt");
    }
    @Test
    public void test2(){
        new Thread(new RunTask()).start();
    }

}
