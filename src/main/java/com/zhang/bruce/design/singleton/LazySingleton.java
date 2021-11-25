package com.zhang.bruce.design.singleton;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/11/25 17:25
 */
public class LazySingleton {
    private LazySingleton(){

    }
    private volatile static LazySingleton instance;
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
