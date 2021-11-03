package com.zhang.bruce.design.factory.methodfactory;

import com.zhang.bruce.design.factory.simplefactory.Miphone;
import com.zhang.bruce.design.factory.simplefactory.Phone;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:06
 * @Describe:
 */
public class XimiFactory implements AbstructFactory{
    @Override
    public Phone makePhone() {
        return new Miphone();
    }
}
