package com.zhang.bruce.design.singleton;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/11/25 17:28
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
