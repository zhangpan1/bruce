package com.zhang.bruce.java8;

import com.zhang.bruce.easyexcel.TDomesticMecReqMonth;
import org.apache.commons.compress.utils.Lists;

import java.util.List;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/21 22:07
 * @Description:
 */
public class TestOO {
    public static void main(String[] args) {
        List<TDomesticMecReqMonth> list = buildList();
        list.stream().filter(x -> x.getPayWay().equals("NULL")).forEach(x -> x.setPayWay(null));
        System.out.println(list.size());
        for (TDomesticMecReqMonth reqMonth : list) {
            System.out.println(reqMonth);
        }
    }

    private static List<TDomesticMecReqMonth> buildList() {
        List<TDomesticMecReqMonth> list = Lists.newArrayList();
        for (int i = 0; i < 5; i ++){
            TDomesticMecReqMonth tDomesticMecReqMonth = new TDomesticMecReqMonth();
            tDomesticMecReqMonth.setProd("DD");
            tDomesticMecReqMonth.setPayWay("NULL");
            list.add(tDomesticMecReqMonth);
        }
        return list;
    }
}
