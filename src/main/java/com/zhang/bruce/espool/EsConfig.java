package com.zhang.bruce.espool;

import org.apache.http.HttpHost;

/**
 * @Title : com.yeepay.g3.core.opr.util
 * @Description :
 * @Company : 易宝支付(Yeepay)
 * @Author : jiafu.wu
 * @Since: 2022/8/1
 * @Version : 1.0.0
 */
public class EsConfig {

    private HttpHost[] httpHosts;

    private String username;

    private String password;

    public HttpHost[] getHttpHosts() {
        return httpHosts;
    }

    public void setHttpHosts(HttpHost[] httpHosts) {
        this.httpHosts = httpHosts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
