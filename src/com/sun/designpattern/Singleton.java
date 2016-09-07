package com.sun.designpattern;

/**
 * Created by Chris on 2016/9/7.
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}

    /**
     * lazy instantiaze 懒汉式
     * */
    public synchronized Singleton getInstance() {//加同步锁，但是每次想要得到实例的时候都要同步，降低了效率
        if (instance == null)
            instance = new Singleton();
        return instance;// == null ? new Singleton() : instance;
    }

}
class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private Singleton2(){}
    /**
     * eagerly 饥汉式
     * */
    public static Singleton2 getInstance() {
        return instance;
    }
}

class Sington3 {
    private static Sington3 instance;
    private Sington3(){}
    /**
     * double-checked locking: 双重检查加锁
     * */
    public static Sington3 getInstance() {
        if (instance == null) {
            synchronized (Sington3.class) {
                if (instance == null)
                    instance = new Sington3();
            }
        }
        return instance;
    }
}
