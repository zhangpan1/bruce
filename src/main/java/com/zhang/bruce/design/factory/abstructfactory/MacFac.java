package com.zhang.bruce.design.factory.abstructfactory;

import com.zhang.bruce.design.factory.simplefactory.ApplePhone;
import com.zhang.bruce.design.factory.simplefactory.Phone;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:15
 * @Describe:
 */
public class MacFac implements AbstruceFac{
    @Override
    public Phone makePhone() {
        return new ApplePhone();
    }

    @Override
    public PC makePc() {
        return new Mac();
    }
}
