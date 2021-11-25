package com.zhang.bruce.design.singleton;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/11/25 17:29
 */
public class InnerClassSingleton {
    private static class InnerClassHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }
    private InnerClassSingleton(){

    }
    public static InnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }
}
