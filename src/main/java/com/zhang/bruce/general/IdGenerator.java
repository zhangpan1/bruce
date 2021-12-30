package com.zhang.bruce.general;


import com.zhang.bruce.general.test.SequenceFactory;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;
@Component
public class IdGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(IdGenerator.class);
    public static final String ID_CREATE_FAIL = "id create fail";
    //声明一个静态的属性（加上注解@Autowired）
    @Autowired
    private SequenceFactory getSequenceFactory1;

    //声明一个非静态的属性
    private static SequenceFactory sequenceFactory;

    @PostConstruct
    public void init(){
        sequenceFactory = getSequenceFactory1;
    }



    private static final String PREFIX = "SHENGYU_ID";

    public static String getNextId(IdEnum idEnum) {
        try {
            return idEnum.getModuleNo() + DateFormatUtils.format(new Date(), DateUtils.FORMAT_DATE_8) + idEnum.getAttribute() + getSequence(idEnum);
        } catch (Exception e) {
            LOGGER.error(ID_CREATE_FAIL, e);
            return idEnum.getModuleNo() + DateFormatUtils.format(new Date(), DateUtils.FORMAT26) + idEnum.getAttribute() + getSequence(idEnum);
        }
    }

    public static String getCcbRequestSn(IdEnum idEnum) {
        try {
            return DateFormatUtils.format(new Date(), DateUtils.FORMAT27) + idEnum.getAttribute() + getSequence(idEnum);
        } catch (Exception e) {
            LOGGER.error(ID_CREATE_FAIL, e);
            return DateFormatUtils.format(new Date(), DateUtils.FORMAT27) + idEnum.getAttribute() + getSequence(idEnum);
        }
    }

    public static String getCcbBillsRelationId(IdEnum idEnum) {
        try {
            return DateFormatUtils.format(new Date(), DateUtils.FORMAT26) + getSequence(idEnum);
        } catch (Exception e) {
            LOGGER.error(ID_CREATE_FAIL, e);
            return DateFormatUtils.format(new Date(), DateUtils.FORMAT26) + getSequence(idEnum);
        }
    }

    public static  String getSequence(IdEnum idEnum) {
        String field = ":" + idEnum.getModuleNo() + ":" + idEnum.getAttribute();
        Long value = sequenceFactory.generate(PREFIX+field);
        // Long value = stringRedisTemplate.opsForValue().increment(PREFIX+field);
        System.out.println(value);
        return String.format("%0" + 5 + "d", value);
    }


}
