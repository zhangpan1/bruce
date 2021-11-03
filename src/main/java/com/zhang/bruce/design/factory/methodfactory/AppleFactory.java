package com.zhang.bruce.design.factory.methodfactory;

import com.zhang.bruce.design.factory.simplefactory.ApplePhone;
import com.zhang.bruce.design.factory.simplefactory.Phone;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:06
 * @Describe:
 */
public class AppleFactory implements AbstructFactory{
    @Override
    public Phone makePhone() {
        return new ApplePhone();
    }
}
