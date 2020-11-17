package com.zwall.luban.thread.Singleton;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-04 11:45
 **/
public class EnumSingleTon {
    private EnumSingleTon(){

    }
    //延迟加载
    public enum Inner{
        INNER;
        private EnumSingleTon instance;
        private EnumSingleTon getInstance(){
            instance =  new EnumSingleTon();
            return instance;
        }
    }
    public static EnumSingleTon getInstance(){
        return Inner.INNER.instance;
    }
}
