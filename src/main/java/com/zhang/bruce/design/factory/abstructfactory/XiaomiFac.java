package com.zhang.bruce.design.factory.abstructfactory;

import com.zhang.bruce.design.factory.simplefactory.Miphone;
import com.zhang.bruce.design.factory.simplefactory.Phone;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:15
 * @Describe:
 */
public class XiaomiFac implements AbstruceFac{
    @Override
    public Phone makePhone() {
        return new Miphone();
    }

    @Override
    public PC makePc() {
        return new MiPc();
    }
}
