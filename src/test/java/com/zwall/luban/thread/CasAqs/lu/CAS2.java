package com.zwall.luban.thread.CasAqs.lu;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-04 13:01
 **/
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class CAS2 {
    private static volatile int m = 0;
    private static AtomicInteger atomicI = new AtomicInteger(100);
    private static AtomicStampedReference asr = new AtomicStampedReference(100, 1);

    public CAS2() {
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            System.out.println(atomicI.compareAndSet(100, 110));
        });
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2L);
            } catch (InterruptedException var1) {
                var1.printStackTrace();
            }

            System.out.println(atomicI.compareAndSet(110, 100));
        });
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3L);
            } catch (InterruptedException var1) {
                var1.printStackTrace();
            }

            System.out.println(atomicI.compareAndSet(100, 120));
        });
        System.out.println("==========================================");
        Thread tf1 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2L);
            } catch (InterruptedException var1) {
                var1.printStackTrace();
            }

            System.out.println(asr.compareAndSet(100, 110, asr.getStamp(), asr.getStamp() + 1));
            System.out.println(asr.compareAndSet(110, 100, asr.getStamp(), asr.getStamp() + 1));
        });
        Thread tf2 = new Thread(() -> {
            int stamp = asr.getStamp();

            try {
                TimeUnit.SECONDS.sleep(4L);
            } catch (InterruptedException var2) {
                var2.printStackTrace();
            }

            System.out.println(asr.compareAndSet(100, 120, stamp, stamp + 1));
        });
        tf1.start();
        tf2.start();
    }
}
