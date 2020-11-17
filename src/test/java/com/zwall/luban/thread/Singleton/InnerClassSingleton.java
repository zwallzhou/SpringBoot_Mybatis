package com.zwall.luban.thread.Singleton;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-04 11:33
 **/
// 使用静态内部类
public class InnerClassSingleton {
    private InnerClassSingleton (){

    }
    public static class Inner { //内部内延迟加载
       public static InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }
    public static InnerClassSingleton getInstance (){
        return Inner.innerClassSingleton;
    }

}
