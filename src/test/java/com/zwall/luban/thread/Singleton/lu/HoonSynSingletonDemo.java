package com.zwall.luban.thread.Singleton.lu;

public class HoonSynSingletonDemo {
    private static HoonSynSingletonDemo instance=null;
    private HoonSynSingletonDemo(){
    }

    public  static HoonSynSingletonDemo getInstance(){
        if(null==instance)
            synchronized (HoonSynSingletonDemo.class){
                instance=new HoonSynSingletonDemo();
            }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                System.out.println(HoonSynSingletonDemo.getInstance());
            }).start();
        }
    }
}
