package com.zhang.bruce.design.factory.abstructfactory;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:16
 * @Describe: 测试抽象工厂方法
 */
public class TestAbstruct {
    public static void main(String[] args) {
        AbstruceFac mifac = new XiaomiFac();
        AbstruceFac IFac = new MacFac();
        mifac.makePhone();
        mifac.makePc();
        IFac.makePhone();
        IFac.makePc();
    }
}
