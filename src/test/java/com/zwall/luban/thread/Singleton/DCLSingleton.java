package com.zwall.luban.thread.Singleton;


/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-04 11:28
 **/
//double check locking
    //懒加载
public class DCLSingleton {
    //private static DCLSingleton instance;
    // todo 重排序问题还得研究下,目前还没重现
    // volatile 避免重排序,导致空指针问题
    // A a = new A(); 1
    // B a = new B(); 2
    private static volatile DCLSingleton instance; // 3
    private DCLSingleton(){

    }
    public static DCLSingleton getInstance(){
        if(instance == null){
            synchronized (DCLSingleton.class){
                if(instance == null){
                    instance  = new DCLSingleton();
                }

            }
        }
        return instance;
    }
}
