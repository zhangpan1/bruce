//package com.zhang.bruce.springchain.chain;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//
///**
// * @description: some desc
// * @email: pan.zhang@yeepay.com
// * @date: 2022/10/14 11:40 上午
// */
//@Configuration
//public class InitProcessChain {
//    @Autowired
//    private List<ProcessChain> processChainsList;
//
//    @PostConstruct
//    private void InitProcessChain() {
//        int size = processChainsList.size();
//        for (int i = 0; i < size; i++) {
//            if(i == size -1 ){
//                processChainsList.get(i).setNext(null);
//            }else{
//                processChainsList.get(i).setNext(processChainsList.get(i+1));
//            }
//        }
//    }
//}
