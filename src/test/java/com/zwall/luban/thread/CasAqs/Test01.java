package com.zwall.luban.thread.CasAqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-05 20:32
 **/
public class Test01 {
    // 举例 甲乙丙 三个人考试,等待(主线程 await)全部考试完成然后(主调用线程)计算三人平均成绩
    CountDownLatch countDownLatch = new CountDownLatch(10);

    // 举例 甲乙丙三人参加长跑运动会 ,需要先等待(甲乙丙线程await)甲乙丙到达起跑点然后开跑,(跑步过程,是甲乙丙三个线程同时进行)
    CyclicBarrier barrier=new CyclicBarrier(8);

    class syn extends AbstractQueuedSynchronizer{
    }
}
