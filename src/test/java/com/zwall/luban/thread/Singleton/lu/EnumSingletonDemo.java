package com.zwall.luban.thread.Singleton.lu;

public class EnumSingletonDemo {
    private EnumSingletonDemo(){
    }
    //延迟加载
    private enum EnumHolder{
        INSTANCE;
        private  EnumSingletonDemo instance=null;
        EnumHolder(){
            instance=new EnumSingletonDemo();
        }
        private EnumSingletonDemo getInstance(){
            return instance;
        }
    }//懒加载
    public static EnumSingletonDemo  getInstance(){
        return EnumHolder.INSTANCE.instance;
    }

}
