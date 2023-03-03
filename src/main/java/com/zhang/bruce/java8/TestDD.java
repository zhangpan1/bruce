package com.zhang.bruce.java8;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/1/5 3:46 下午
 */
public class TestDD {
    public static void main(String[] args) {
        System.out.println(isCorrectAmount(new BigDecimal(-1)));


    }
    public static boolean isCorrectAmount(BigDecimal bigDecimal){
        BigDecimal amountMax = new BigDecimal("9999999999999.99");
        BigDecimal amountMin = new BigDecimal("1");
        BigDecimal amount = new BigDecimal("-1");
        if(bigDecimal.compareTo(amount) == 0 || (bigDecimal.compareTo(amountMax) < 1 && bigDecimal.compareTo(amountMin) == 1 )){
            return true;
        }
        return false;
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

    Us() {
    }

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

