package com.zhang.bruce.general.test;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/30 17:32
 * @Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 使用redis生成自增序列
 */
@RestController
public class caoController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 自增序列号
     *
     * @param prefix    前缀
     * @param numLength 要生成多少位数字
     * @return
     */
    @RequestMapping("/SeqGenerator1")
    public String SeqGenerator(String prefix, int numLength) {
        String upperCode = "";
        Long size = redisTemplate.opsForList().size(prefix);//查找 prefix 的key值的数据长度
        if (size > 0) {//有数据
            List leve = redisTemplate.opsForList().range(prefix, 0, -1);//获取该key下面的所有值(-1 所有的值，；1下一个值
            upperCode = leve.get(leve.size() - 1).toString();//返回最后一个值
        }
        String returnCode = "";
        int Suffix;  //后缀数字 if (!StringUtil.isNullOrEmpty(upperCode)){ //有数据
        String sequence = upperCode.substring(prefix.length());//截取前缀开始的后面的数字
        Suffix = Integer.parseInt(sequence);
        Suffix++;//最后的序号加一

        returnCode = prefix + String.format("%0" + numLength + "d", Suffix);//后缀不够numLength长，前面补充0
        redisTemplate.opsForList().rightPush(prefix, returnCode);//存入Redis
        System.out.println(returnCode + "%%%");
        return returnCode;
    }
}



