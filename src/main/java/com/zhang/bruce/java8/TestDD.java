package com.zhang.bruce.java8;

import com.beust.jcommander.internal.Lists;
import com.yeepay.g3.utils.common.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/1/5 3:46 下午
 */
public class TestDD {
    public static void main(String[] args) {
        List<Us> us= Lists.newArrayList();
        extracted(us);

        List<Us> cf1 = us.stream().filter(x -> (StringUtils.isBlank(x.getId()))).collect(Collectors.toList());
        List<String> cf2 = us.stream().filter(x -> (StringUtils.isNotEmpty(x.getId()))).map(Us::getId).distinct().collect(Collectors.toList());
        int total = cf1.size() + cf2.size();
        System.out.println(total);


    }

    private static void extracted(List<Us> us) {
        Us us1 = new Us();
        us1.setId("");
        us1.setUrl("aa");
        Us us2 = new Us();
        us2.setId(null);
        us2.setUrl("bb");
        Us us3 = new Us();
        us3.setId(null);
        us3.setUrl("cc");
        Us us4 = new Us();
        us4.setId("4");
        us4.setUrl("dd");
        us.add(us1);
        us.add(us2);
        us.add(us3);
        us.add(us4);
    }
}
class Us{
    String url;
    String id ;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Us{" +
                "url='" + url + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
