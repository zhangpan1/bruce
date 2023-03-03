package com.zhang.bruce.datare;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/3/1 8:25 下午
 */
@RestController
@RequestMapping("/insert")
public class TestSaveController {
    @Resource
    BossDetailService bossDetailService;
    // 交易明细
    @PostMapping("/testSave")
    public void importUser() throws IOException {
        bossDetailService.saveDataTldb();
    }
    // 清洗双重加密数据
    @PostMapping("/fushData")
    public void fushData() throws IOException {
        bossDetailService.fushData();
    }
}
