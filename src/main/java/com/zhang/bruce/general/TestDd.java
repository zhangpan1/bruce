package com.zhang.bruce.general;

import com.zhang.bruce.risktest.utils.StringUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/1/7 20:36
 * @Description:
 */
public class TestDd {
    public static void main(String[] args) {
        String ruleCodes = "MEC_D_Unintelligent_001,MEC_D_RE_002,MEC_D_RE_001,MEC_D_RE_00,mEC";
        if (ruleCodes.contains("MEC_D_Unintelligent_001")){
            System.out.println("你是个猪");
        }
        if (ruleCodes.contains("MEC_D_RE_002")){
            System.out.println("你是个小老虎");
        }
        if (ruleCodes.contains("MEC_D_RE_001")){
            System.out.println("你是个小东西");
        }
    }
}
