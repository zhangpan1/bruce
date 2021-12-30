package com.zhang.bruce.general;

import com.zhang.bruce.general.mysql.SysSerialNumMapper;
import com.zhang.bruce.general.test.SequenceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用redis生成自增序列
 */
@RestController
public class TestController {

    @Autowired
    private SequenceFactory sequenceFactory;

    @Autowired
    private SysSerialNumMapper serialNumMapper;

    /**
     * 自增序列号
     *

     * @return
     */
    @RequestMapping("/SeqGenerator")
    public String SeqGenerator() {
        String orderId = IdGenerator.getNextId(IdEnum.SHENGYUOMS_ORDERID);
        System.out.println(orderId);
        return orderId;
    }
    @RequestMapping("/TestMysql")
    public String TestMysql() {
        SysSerialNum serialNum = new SysSerialNum();
        serialNum.setDataWidth(5);
        int s = serialNumMapper.insert(serialNum);
        System.out.println(s);
        Long id = serialNum.getId();
        return String.valueOf(id);
    }

}


