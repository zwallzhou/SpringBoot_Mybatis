package com.zwall.luban.thread.Singleton.lu;

public class HoonSynSingleton {
    private static HoonSynSingleton instance=null;
    private HoonSynSingleton(){
    }

    public synchronized static HoonSynSingleton getInstance(){
        if(null==instance)
            instance=new HoonSynSingleton();
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                System.out.println(HoonSynSingleton.getInstance());
            }).start();
        }
    }
}
