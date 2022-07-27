/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhang.bruce.risktest.rocketmq.quickstart;

import com.google.gson.Gson;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.math.BigDecimal;
import java.util.Date;

/**
 * This class demonstrates how to send messages to brokers using provided {@link DefaultMQProducer}.
 */
public class Producer {
    public static void main(String[] args) throws MQClientException, InterruptedException {
        RcAsyncHTBankPayAccountDto dto = buildDto();
        Gson gson = new Gson();
        String json = gson.toJson(dto);
        /*
         * Instantiate with a producer group name.
         */
        DefaultMQProducer producer = new DefaultMQProducer("fk_from_opr_htbank_pay_account_Group");

        /*
         * Specify name server addresses.
         * <p/>
         *
         * Alternatively, you may specify name server addresses via exporting environmental variable: NAMESRV_ADDR
         * <pre>
         * {@code
         * producer.setNamesrvAddr("name-server1-ip:9876;name-server2-ip:9876");
         * }
         * </pre>
         */
        producer.setNamesrvAddr("10.171.2.107:30770;10.171.2.107:30771;10.171.2.107:30772");
        /*
         * Launch the instance.
         */
        producer.start();



            try {

                /*
                 * Create a message instance, specifying topic, tag and message body.
                 */
                Message msg = new Message("riskcontrolService_externalOrder_topic" /* Topic */,
                    "TagB" /* Tag */,
                        json.getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
                );
                //messageDelayLevel=1s 5s 10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h
                msg.setDelayTimeLevel(3);
                /*
                 * Call send message to deliver message to one of brokers.
                 */
                SendResult sendResult = producer.send(msg);

                System.out.printf("%s%n", sendResult);
            } catch (Exception e) {
                e.printStackTrace();
                Thread.sleep(1000);
            }


        /*
         * Shut down once the producer instance is not longer in use.
         */
        producer.shutdown();
    }

    private static RcAsyncHTBankPayAccountDto buildDto() {
        RcAsyncHTBankPayAccountDto dto = new RcAsyncHTBankPayAccountDto();
        dto.setMerchantNo("7979872223");
        dto.setRealMerchantName("真33实姓名");
        dto.setRequestId("请求33号");
        dto.setChannelName("渠道33姓名");
        dto.setChannelOrderId("jiaoy33idingdanhao");
        dto.setAmount(new BigDecimal(232));
        dto.setPaymentAmount(new BigDecimal(333));
        dto.setOccurTime(new Date());
        dto.setCompleteTime(new Date());
        dto.setGoodsName("一堆3商品");
        dto.setMemberId("merbe3rId");
        dto.setPayWay("payWay3");
        dto.setBankCardNo("232435235");
        dto.setBankCardType("kag3sgsg");
        dto.setUserIp("111111");
        dto.setTradeType("tradeTy3pe");
        return dto;


    }
}
