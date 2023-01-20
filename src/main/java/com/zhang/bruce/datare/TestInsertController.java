package com.zhang.bruce.datare;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/21 18:34
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/save")
public class TestInsertController {
    @Resource
    private DataService userService;
    @Resource
    private DeclareService declareService;

    @Resource RemitService remitService;
    @Resource RechargeService rechargeService;

    @Resource ExchangeService exchangeService;
    // 交易明细
    @PostMapping("/testSaveB")
    public void importUser() throws IOException {
        userService.saveDataBusines();
    }
    @PostMapping("/testSaveT")
    public void importTOrder() throws IOException {
        userService.saveDataTldb();
    }
    // 申报明细
    @PostMapping("/testSaveD")
    public void testSaveD() throws IOException {
        declareService.saveDataBusines();
    }
    @PostMapping("/testSaveF")
    public void testSaveF() throws IOException {
        declareService.saveDataTldb();
    }
    // 出款查询
    @PostMapping("/testSaveG")
    public void testSaveG() throws IOException {
        remitService.saveDataBusines();
    }
    @PostMapping("/testSaveH")
    public void testSaveH() throws IOException {
        remitService.saveDataTldb();
    }
    // 充值交易
    @PostMapping("/testSaveY")
    public void testSaveY() throws IOException {
        rechargeService.saveDataBusines();
    }
    @PostMapping("/testSaveZ")
    public void testSaveZ() throws IOException {
        rechargeService.saveDataTldb();
    }


    // 换汇交易
    @PostMapping("/testSaveM")
    public void testSaveM() throws IOException {
        exchangeService.saveDataBusines();
    }
    @PostMapping("/testSaveN")
    public void testSaveN() throws IOException {
        exchangeService.saveDataTldb();
    }
}
