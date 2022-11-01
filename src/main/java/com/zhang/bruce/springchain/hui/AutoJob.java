package com.zhang.bruce.springchain.hui;

import com.google.common.collect.Lists;
import com.zhang.bruce.springchain.Bula.MyFilterChain;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 3:34 下午
 */
public class AutoJob {
    @Autowired
    MyFilterChain myFilterChain;

    @GetMapping("/hello")
    public String hello() {
        List<PayBean> payBeanList = getAllBean();
        // 进行分组，得到两个list
        Map<String, List<PayBean>> newPackCoustom = payBeanList.stream().collect(Collectors.groupingBy(PayBean::getBiz));
        System.out.println(newPackCoustom);

        List<PayBean> idNoList = newPackCoustom.get("idNo");
        List<PayBean> phoneNo = newPackCoustom.get("phoneNo");

        if (CollectionUtils.isNotEmpty(idNoList)) {
          // 查询过去三个月所有的交易，去除银行卡，去重

            // 每一天构建一个参数，每次查询500条交易，一天的数据进行去重
            // 90个任务，用线程池进行 查询，提效
            // 汇总90个任务的结果，进行去重

          // 构建加灰参数--将所有银行卡号置灰

          // 遍历这些卡号，查询库中，是否有相同参数

          // 有则 ，进行更新比较逻辑，更新，无，新增
        }
        if (CollectionUtils.isNotEmpty(phoneNo)) {
            // 查出身份证类型
            // 用身份证号查询灰名单，如果已经存在，进行更新
            // 不存在，进行新增
            // 用身份证，查询过去三个月所有的交易，去除银行卡号
        }


        return "jieshu";
    }

    // 捞取前一天灰名单种类为涉黑用户的数据
    private static List<PayBean> getAllBean() {
        List<PayBean> list = Lists.newArrayList();
        PayBean payBean = new PayBean();
        payBean.setBiz("idNo");
        payBean.setType("加黑类型");
        payBean.setNo("4111251444");
        PayBean payBean1 = new PayBean();
        payBean1.setBiz("phoneNo");
        payBean1.setType("加黑类型");
        payBean1.setNo("13224242");
        list.add(payBean);
        list.add(payBean1);
        return list;
    }
    //        for (Map.Entry<String, List<PayBean>> entry : newPackCoustom.entrySet()) {
//            List<PayBean> payBeans = entry.getValue();
//            System.out.println(payBeans);
//            List<String> reportStatus = payBeans.stream().map(PayBean::getBiz).collect(Collectors.toList());
//            System.out.println(reportStatus);
//        }
    @GetMapping("/dell")
    public String dell() {
        // 查询昨日商户灰名单加灰所有的数据
        List<PayBean> payBeanList = getAllBean();
        // 遍历所有数据

        switch ("分支") {
            case "standalone":
                // 加灰前，先查询，如果有的话，更新过期时间
                // 使用500个一分页，查询全部
            case "codis":

            case "sentinel":

            default:
                //throw new BusinessCheckException("redis配置错误，请检查redis配置");
        }

        return "";

    }
}
