package com.zhang.bruce.espool;

import com.yeepay.g3.utils.common.CommonUtils;
import com.yeepay.g3.utils.common.StringUtils;
import com.yeepay.g3.utils.common.log.Logger;
import com.yeepay.g3.utils.common.log.LoggerFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

import java.util.Map;

/**
 * @Title : 链接池化技术
 * @Description :
 * @Company : 易宝支付(Yeepay)
 * @Author : jiafu.wu
 * @Since: 2022/8/1
 * @Version : 1.0.0
 */
public class EsClientPoolFactory implements PooledObjectFactory<RestHighLevelClient> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EsClientPoolFactory.class);

    private static EsConfig esConfig;

    static{
        doInit();
    }


    @Override
    public PooledObject<RestHighLevelClient> makeObject() throws Exception {
        RestHighLevelClient client = null;
        try {
            final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(esConfig.getUsername(), esConfig.getPassword()));
            RestClientBuilder restClientBuilder = RestClient.builder(esConfig.getHttpHosts())
                    .setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
                        @Override
                        public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpAsyncClientBuilder) {
                            return httpAsyncClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
                        }
                    });

            client = new RestHighLevelClient(restClientBuilder);

        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("链接池被创建了"+client);
        return new DefaultPooledObject<RestHighLevelClient>(client);
    }

    private static void doInit() {
        LOGGER.info("开始初始化es配置文件");
        try {
            esConfig = new EsConfig();
            Map<String, String> props = CommonUtils.loadProps("runtimecfg/es.properties");
            String address = props.get("address");
            String username = props.get("username");
            String password = props.get("password");

            if (StringUtils.isBlank(address) || StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
                throw new RuntimeException("配置文件中address/username/password有空值,初始化失败");
            }
            String[] addrs = address.split(";");
            HttpHost[] httpHosts = new HttpHost[addrs.length];
            int i = 0;
            for (String configStr : addrs) {
                String[] split = configStr.split("[:]");
                httpHosts[i] = new HttpHost(split[0], Integer.parseInt(split[1]));
                i ++;
            }

            esConfig.setHttpHosts(httpHosts);
            esConfig.setUsername(username);
            esConfig.setPassword(password);

        } catch (Exception e) {
            LOGGER.error("加载es-host失败,未找到文件:runtimecfg/es.properties!", e);
        }
    }

    @Override
    public void destroyObject(PooledObject<RestHighLevelClient> p) throws Exception {
        RestHighLevelClient restHighLevelClient = p.getObject();
        restHighLevelClient.close();
        LOGGER.info("链接池对象被销毁了"+restHighLevelClient);
    }

    @Override
    public boolean validateObject(PooledObject<RestHighLevelClient> p) {
        return true;
    }

    @Override
    public void activateObject(PooledObject<RestHighLevelClient> p) throws Exception {
    }

    @Override
    public void passivateObject(PooledObject<RestHighLevelClient> p) throws Exception {
    }
}
