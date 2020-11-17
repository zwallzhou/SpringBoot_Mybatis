package com.zwall.luban.thread.syn.pk1;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-03 16:04
 **/
//重排 參考: https://blog.csdn.net/pzxwhc/article/details/48984209

class ReorderExample {
    int a = 0;
    boolean flag = false;

    public static void main(String[] args) {
        ReorderExample reorderExample = new ReorderExample();
        new Thread(reorderExample::writer).start();
        new Thread(reorderExample::reader).start();
        for(int i=0;i<10;i++){
        }
    }
    public void writer() {
        a = 1;                   //1
        flag = true;             //2
        System.out.println("writer jiesu"+Thread.currentThread().getName());
    }
    public void reader() {
        System.out.println(Thread.currentThread().getName()+"a1:"+a);
        if (flag) {//3
            int i =  a * a;        //4
            System.out.println("i"+i);
        }
    }
}
//​flag变量是个标记，用来标识变量a
