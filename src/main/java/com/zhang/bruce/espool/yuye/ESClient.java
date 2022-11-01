//package com.zhang.bruce.espool.yuye;
//
//import org.apache.http.HttpHost;
//import org.apache.http.auth.AuthScope;
//import org.apache.http.auth.UsernamePasswordCredentials;
//import org.apache.http.client.CredentialsProvider;
//import org.apache.http.impl.client.BasicCredentialsProvider;
//import org.apache.http.nio.conn.ssl.SSLIOSessionStrategy;
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestClientBuilder;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.elasticsearch.common.settings.Settings;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.X509TrustManager;
//import java.io.IOException;
//import java.security.KeyManagementException;
//import java.security.NoSuchAlgorithmException;
//import java.security.SecureRandom;
//import java.security.cert.CertificateException;
//import java.security.cert.X509Certificate;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
///**
// * Created by yp-tc-m-7163 on 2017/5/19.
// *
// */
//
//@Lazy
//@Component("esClient")
//@EnableConfigurationProperties(ElasticsearchProperties.class)
//public class ESClient {
//    private static final Logger logger = LoggerFactory.getLogger(ESClient.class);
//    private final HashMap<String, com.yeepay.logcenter.fluent.es.BulkRestHighProcessor> bulkProcessorHashMap = new HashMap<>();
//
//    private final ElasticsearchProperties elasticsearchProperties;
//    private volatile BulkRestHighProcessor defaultBulkProcessor;
//
//    @Autowired
//    public ESClient(ElasticsearchProperties elasticsearchProperties, ToKafka toKafka) {
//        System.setProperty("es.set.netty.runtime.available.processors", "false");
//        this.elasticsearchProperties = elasticsearchProperties;
//        Map<String, String[]> clusterAndIpList = elasticsearchProperties.getClusterAndIpList();
//        for (String clusterName : clusterAndIpList.keySet()) {
//            Settings settings = Settings.builder().put("client.transport.sniff", false)
//                    .put("cluster.name", clusterName)
//                    .put("client.transport.ping_timeout", 60, TimeUnit.SECONDS)
//                    .build();
//
//            String[] ipPorts = clusterAndIpList.get(clusterName);
//            HttpHost[] httpHosts = new HttpHost[ipPorts.length];
//            for (int i = 0; i < ipPorts.length; i++) {
//                String[] ipPort = ipPorts[i].split(":");
//                String ip = ipPort[0];
//                int port = Integer.parseInt(ipPort[1]);
//                httpHosts[i] = new HttpHost(ip, port, "http");
//            }
//            RestClientBuilder builder = RestClient.builder(httpHosts);
//            Map<String, String[]> clusterAndEncryptionParamList = elasticsearchProperties.getClusterAndEncryptionParamList();
//            if(clusterAndEncryptionParamList.containsKey(clusterName)){
//                builder.setHttpClientConfigCallback(initSecuredHttpClientConfigCallback(clusterAndEncryptionParamList.get(clusterName)));
//            }
//            RestHighLevelClient client = new RestHighLevelClient(builder);
//            try {
//                boolean pong = client.ping(RequestOptions.DEFAULT);
//                if (!pong) {
//                    logger.error("连接ES出错，Ping不通");
//                    System.exit(0);
//                }
//            } catch (IOException e) {
//                logger.error("连接ES出错");
//                System.exit(0);
//            }
//            BulkRestHighProcessor bulkProcessor = new BulkRestHighProcessor(client, toKafka);
//            bulkProcessorHashMap.put(clusterName, bulkProcessor);
//        }
//    }
//
//    private SecuredHttpClientConfigCallback initSecuredHttpClientConfigCallback(String[] strings) {
//        String userName = strings[0];
//        String password = strings[1];
//        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(userName, password));
//        SSLContext sc = null;
//        try {
//            sc = SSLContext.getInstance("SSL");
//            sc.init(null, trustAllCerts, new SecureRandom());
//        } catch (KeyManagementException | NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//        SSLIOSessionStrategy sessionStrategy = new SSLIOSessionStrategy(sc, new NullHostNameVerifier());
//        SecuredHttpClientConfigCallback httpClientConfigCallback = new SecuredHttpClientConfigCallback(sessionStrategy,
//                credentialsProvider);
//        return httpClientConfigCallback;
//    }
//
//
//    static TrustManager[] trustAllCerts = new TrustManager[] {
//            new X509TrustManager() {
//                @Override
//                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//                }
//
//                @Override
//                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//                }
//
//                @Override
//                public X509Certificate[] getAcceptedIssuers() {
//                    return null;
//                }
//            }
//    };
//    public HashMap<String, BulkRestHighProcessor> getBulkProcessorHashMap() {
//        return bulkProcessorHashMap;
//    }
//
//    public BulkRestHighProcessor defaultMonitorClusterBulkProcessor() {
//        if (defaultBulkProcessor == null) {
//            defaultBulkProcessor = bulkProcessorHashMap.get(elasticsearchProperties.getDefaultMonitorCluster());
//        }
//        return defaultBulkProcessor;
//    }
//
//    public void destroy() {
//        for (BulkRestHighProcessor bulkProcessor : bulkProcessorHashMap.values()) {
//            bulkProcessor.close();
//        }
//    }
//}


/**
 * put /tbl_rrs_req
 * {
 *   "mappings": {
 *     "properties": {
 *       "id": {
 *         "type": "long"
 *       },
 *       "ip_country": {
 *         "type": "keyword"
 *       },
 *       "ip_province": {
 *         "type": "keyword"
 *       },
 *       "req_id": {
 *         "type": "keyword"
 *       },
 *       "seq_id": {
 *         "type": "keyword"
 *       },
 *       "rid": {
 *         "type": "keyword"
 *       },
 *       "prod": {
 *         "type": "keyword"
 *       },
 *       "biz": {
 *         "type": "keyword"
 *       },
 *       "use_tool": {
 *         "type": "keyword"
 *       },
 *       "bnk_id": {
 *         "type": "keyword"
 *       },
 *       "crd_no": {
 *         "type": "long"
 *       },
 *       "crd_area": {
 *         "type": "keyword"
 *       },
 *       "crd_typ": {
 *         "type": "keyword"
 *       },
 *       "amt": {
 *         "type": "double"
 *       },
 *       "mobile": {
 *         "type": "keyword"
 *       },
 *       "mobile_area": {
 *         "type": "keyword"
 *       },
 *       "usr_id": {
 *         "type": "keyword"
 *       },
 *       "pay_id": {
 *         "type": "keyword"
 *       },
 *       "mec_no": {
 *         "type": "keyword"
 *       },
 *       "usr_ip": {
 *         "type": "keyword"
 *       },
 *       "usr_ip_area": {
 *         "type": "keyword"
 *       },
 *       "occ_tm": {
 *         "type": "date",
 *         "format": "yyyy-mm-dd hh:mm:ss"
 *       },
 *       "tools_if": {
 *         "type": "keyword"
 *       },
 *       "goods_if": {
 *         "type": "keyword"
 *       },
 *       "req_if": {
 *         "type": "keyword"
 *       },
 *       "rts_tm": {
 *         "type": "integer"
 *       },
 *       "rts_retdesc": {
 *         "type": "keyword"
 *       },
 *       "rlsb_tm": {
 *         "type": "integer"
 *       },
 *       "rlsb_retdesc": {
 *         "type": "keyword"
 *       },
 *       "rlsw_tm": {
 *         "type": "integer"
 *       },
 *        "rlsw_retdesc": {
 *         "type": "keyword"
 *       },
 *       "rds_tm": {
 *         "type": "integer"
 *       },
 *       "rds_retdesc": {
 *         "type": "keyword"
 *       },
 *       "doorgod_tm": {
 *         "type": "integer"
 *       },
 *       "doorgod_retdesc": {
 *         "type": "keyword"
 *       },
 *       "doorgod_retcode": {
 *         "type": "keyword"
 *       },
 *       "prepare_tm": {
 *         "type": "integer"
 *       },
 *       "chk_tm": {
 *         "type": "integer"
 *       },
 *       "rk_ip": {
 *         "type": "keyword"
 *       },
 *       "sub_sys": {
 *         "type": "keyword"
 *       },
 *        "ct_tm": {
 *         "type": "date",
 *         "format": "yyyy-mm-dd hh:mm:ss"
 *       },
 *       "mf_tm": {
 *         "type": "date",
 *         "format": "yyyy-mm-dd hh:mm:ss"
 *       },
 *       "chk_retdesc": {
 *         "type": "keyword"
 *       },
 *       "prepare_retdesc": {
 *         "type": "keyword"
 *       },
 *       "first_pay": {
 *         "type": "keyword"
 *       },
 *       "goods_nm": {
 *         "type": "keyword"
 *       },
 *       "sub_prod_id": {
 *         "type": "keyword"
 *       },
 *       "rgs_retdesc": {
 *         "type": "keyword"
 *       },
 *       "rgs_tm": {
 *         "type": "integer"
 *       },
 *       "rbs_retdesc": {
 *         "type": "keyword"
 *       },
 *       "rbs_tm": {
 *         "type": "integer"
 *       },
 *       "ret_switch": {
 *         "type": "keyword"
 *       },
 *       "rlsg_retdesc": {
 *         "type": "keyword"
 *       },
 *       "rlsg_tm": {
 *         "type": "integer"
 *       },
 *       "retcode": {
 *         "type": "keyword"
 *       },
 *       "bangsun_trigerrule": {
 *         "type": "keyword"
 *       },
 *       "payway": {
 *         "type": "keyword"
 *       },
 *       "trade_src": {
 *         "type": "keyword"
 *       },
 *       "param_typ": {
 *         "type": "keyword"
 *       },
 *       "merchant_retcode": {
 *         "type": "keyword"
 *       },
 *       "if_encry": {
 *         "type": "keyword"
 *       },
 *       "pay_result": {
 *         "type": "keyword"
 *       },
 *      "pay_tm": {
 *         "type": "date",
 *         "format": "yyyy-mm-dd hh:mm:ss"
 *       },
 *       "pay_cd": {
 *         "type": "keyword"
 *       },
 *       "syn_con_tm": {
 *         "type": "integer"
 *       },
 *       "syn_err_cd": {
 *         "type": "keyword"
 *       },
 *       "bizorder": {
 *         "type": "keyword"
 *       },
 *       "bank_seq": {
 *         "type": "keyword"
 *       },
 *       "bank_orderno": {
 *         "type": "keyword"
 *       },
 *       "order_type": {
 *         "type": "keyword"
 *       },
 *       "frp_code": {
 *         "type": "keyword"
 *       },
 *       "etltaskid": {
 *         "type": "keyword"
 *       },
 *      "idno": {
 *         "type": "keyword"
 *       },
 *       "terminalid": {
 *         "type": "keyword"
 *       },
 *       "terminal_id": {
 *         "type": "keyword"
 *       },
 *       "pre_phone": {
 *         "type": "keyword"
 *       },
 *       "contact_phone": {
 *         "type": "keyword"
 *       },
 *       "agency_no": {
 *         "type": "keyword"
 *       },
 *       "passenger_phone": {
 *         "type": "keyword"
 *       },
 *       "customeridno": {
 *         "type": "keyword"
 *       },
 *         "target_merchant_no": {
 *         "type": "keyword"
 *       },
 *       "request_merchant_no": {
 *         "type": "keyword"
 *       },
 *      "user_type": {
 *         "type": "keyword"
 *       },
 *       "target_user_type": {
 *         "type": "keyword"
 *       },
 *       "user_type1": {
 *         "type": "keyword"
 *       },
 *       "target_merchant_no1": {
 *         "type": "keyword"
 *       },
 *       "target_user_type1": {
 *         "type": "keyword"
 *       },
 *       "request_merchant_no1": {
 *         "type": "keyword"
 *       },
 *       "id_no_digest": {
 *         "type": "keyword"
 *       },
 *       "customeridno_digest": {
 *         "type": "keyword"
 *       },
 *        "crd_no_digest": {
 *         "type": "keyword"
 *       },
 *       "mobile_digest": {
 *         "type": "keyword"
 *       },
 *       "pre_phone_digest": {
 *         "type": "keyword"
 *       },
 *       "contact_phone_digest": {
 *         "type": "keyword"
 *       },
 *       "passenger_phone_digest": {
 *         "type": "keyword"
 *       }
 *     }
 *   }
 * }
 */
