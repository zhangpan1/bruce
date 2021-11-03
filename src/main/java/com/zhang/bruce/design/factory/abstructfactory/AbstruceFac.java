package com.zhang.bruce.design.factory.abstructfactory;

import com.zhang.bruce.design.factory.simplefactory.Phone;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:14
 * @Describe:
 */
public interface AbstruceFac {
    Phone makePhone();
    PC makePc();
}
