package com.zhang.bruce.springchain.business;

import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/26 11:22 上午
 */
public class TestNb {
    public static void main(String[] args) {
        String s = "KYC一级,KYC一级_KYC二级,test,test_kisswentest,百货,百货_电子元器件/仪器仪表/机械设备及配件,百货_户外/运动/健身器材/安防/保健器械,百货_黄金珠宝/钻石/玉石,百货_家居用品/厨具/家纺/装修/建材/家具,百货_交通工具/配件/改装,百货_礼品/鲜花/纪念品/盆栽/苗木种植/园林绿化,百货_美妆/护肤/个人护理,百货_母婴用品/儿童玩具/计生用品,百货_其他,百货_食品生鲜/保健品,百货_实物投资（文物/拍卖/收藏品/艺术品）,百货_手表/钟表/眼镜/首饰/饰品,百货_书籍/乐器,百货_数码产品/家用电器/办公用品,百货_线下百货,百货_烟草/电子烟,保险,保险_保险公估公司,保险_保险公司,保险_保险经济公司,保险_其他,电商,电商_跨境平台类,电商_其他,电商_团购,电商_直销,电商_直销代理,电商_自营电商,电商_综合电商,公益,公益_公益,公益_其他,航旅,航旅_OTA：旅游预订网站，线上订房中心,航旅_OTA：在线机票,航旅_航（旅）意险销售平台,航旅_航空公司,航旅_火车票/船票/车票等长途交通票务,航旅_机票代理,航旅_机票分销平台/旅游服务平台,航旅_酒店/旅馆/度假村,航旅_客栈民宿,航旅_旅行社,航旅_门票/景区/度假区,航旅_其他,交通运输,交通运输_B2B同业平台,交通运输_港口经营/港口理货,交通运输_高速/ETC,交通运输_供应链金融,交通运输_海陆空运输/客运,交通运输_海运/铁路货物运输/道路运输/航空运输,交通运输_其他,交通运输_网络货运平台,交通运输_物流/快递公司,交通运输_物流快运/零担/车队,交通运输_物流系统商,交通运输_油卡充值,交通运输_租车服务/共享交通工具,教育培训,教育培训_公立院校,教育培训_留学缴费,教育培训_民办学校/私立学校,教育培训_培训机构/在线教育,教育培训_其他,教育培训_事业单位/政府机构,教育培训_协会性质,金融,金融_保理公司,绿色,其他行业,其他行业_其他,生活服务/商业服务,生活服务/商业服务_餐饮/娱乐场所,生活服务/商业服务_代理费/分润/手续费/会员费（系统商/代理）,生活服务/商业服务_法律咨询/金融咨询等（医疗咨询除外）,生活服务/商业服务_房产销售/房地产中介,生活服务/商业服务_会展/活动策划,生活服务/商业服务_加油/机动车燃料/充电桩,生活服务/商业服务_其他,生活服务/商业服务_人才中介机构/招聘/猎头,生活服务/商业服务_丧葬行业,生活服务/商业服务_社区服务/便民服务,生活服务/商业服务_生活缴费/生活充值卡类,生活服务/商业服务_数据服务,生活服务/商业服务_水电煤缴费/交通罚款等生活缴费,生活服务/商业服务_停车场/代驾/城市交通卡,生活服务/商业服务_文体生活,生活服务/商业服务_有线电视缴费/手机充值,生活服务/商业服务_招投标行业,生活服务/商业服务_咨询服务,\t数字藏品,\t数字藏品_交易平台,通信,通信_电信运营商（移动，联通，电信，铁通等）,通信_短信平台/短信服务或代理商,通信_其他,通信_通信、通讯领域相关技术开发、咨询、服务,通信_虚拟运营商（有电信牌照的）,通信_运营商的国包或省包商、技术支撑商,通信_运营商及其延伸类产品,网络媒体/计算机服务/游戏,网络媒体/计算机服务/游戏_建站/技术开发,网络媒体/计算机服务/游戏_门户/资讯/论坛/sns社区/微博,网络媒体/计算机服务/游戏_其他,网络媒体/计算机服务/游戏_社交平台,网络媒体/计算机服务/游戏_网络交友/直播,网络媒体/计算机服务/游戏_游戏/点卡/金币,文化传播,文化传播_出版社/出版公司,文化传播_其他,文化传播_音像/影视动漫周边,文化传播_影视制作,文化传播_宗教场所,文体生活,文体生活_积分换彩-纯支付模式,消费金融,消费金融_新金融,医疗服务,医疗服务_公立医院,医疗服务_其他,医疗服务_私立医院,医疗服务_药品,医疗服务_医疗器械,医疗服务_医疗咨询/挂号服务/心理咨询/体检卡,医疗服务_医药平台/医药批发,疑似CRE,疑似CRE_疑似CRE,疑似JR,疑似JR_疑似";
        String b = "ceshi 1,ceshi 1_ceshi 2,KYC一级,KYC一级_KYC二级";
        //kyc一级和二级
        Map<String, Set<String>> splitKycList = splitKycToList(b);
        List<String> kyc = new ArrayList<>(splitKycList.get("kyc"));
        List<String> kycB = new ArrayList<>(splitKycList.get("kycb"));

        System.out.println("kyc 为" + kyc);
        System.out.println("kycB 为" + kycB);
    }

    private static Map<String, Set<String>> splitKycToList(String whiteName) {
        if (whiteName == null) {
            return Collections.EMPTY_MAP;
        }
        Map<String, Set<String>> result = Maps.newHashMap();
        Set<String> kycSet = new HashSet<>();
        Set<String> kycBSet = new HashSet<>();
        if (StringUtils.isNotBlank(whiteName)) {//kyc
            if (!"全部".equals(whiteName)) {
                String[] kycCognizance = whiteName.split(",");
                for (int i = 0; i < kycCognizance.length; i++) {
                    String[] val1 = kycCognizance[i].split("_");
                    if (val1.length < 2) {
                        String kyc = kycCognizance[i].split("_")[0];
                        kycSet.add(kyc);
                    } else {
                        String kyc = kycCognizance[i].split("_")[0];
                        String kycb = kycCognizance[i].split("_")[1];
                        kycSet.add(kyc);
                        kycBSet.add(kycb);
                    }
                }
                result.put("kyc", kycSet);
                result.put("kycb", kycBSet);
                return result;
            }
        }
        return Collections.EMPTY_MAP;
    }
}
