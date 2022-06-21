//package com.zhang.bruce.risktest.utils;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//import com.yeepay.dp.etl.dto.AsBankCardInfo;
//import com.yeepay.dp.etl.dto.AsIdNoInfo;
//import com.yeepay.dp.etl.dto.AsIpInfo;
//import com.yeepay.dp.etl.dto.AsPhoneInfo;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//public class DoorgodDataAsUtil {
//
//	private String dataAsService = "http://192.168.95.1";
//
//	private String dataAsPort = "10888";
//
//	//数据解析URL
//    //身份证Id归属地解析地址
//    public static final String AS_IDLOCATION_URL = "/idcard/location";
//    //银行卡信息解析地址
//    public static final String AS_BANKAREA_URL = "/bankcard/location";
//    //IP地址归属地解析
//    public static final String AS_IPLOCATION_URL = "/ip/location";
//    //手机号归属地解析
//    public static final String AS_PHONELOCATION_URL = "/phone/location";
//
//    public final static Map<String,String> airportName2City = new HashMap<String,String>();
//
//	public DoorgodDataAsUtil(String dataAsService,String dataAsPort) {
//		airportName2City.put("HRB","黑龙江哈尔滨");
//        airportName2City.put("NDG","黑龙江齐齐哈尔");
//        airportName2City.put("MDG","黑龙江牡丹江");
//        airportName2City.put("JMU","黑龙江佳木斯");
//        airportName2City.put("HEK","黑龙江黑河市");
//        airportName2City.put("YLN","黑龙江依兰市");
//        airportName2City.put("CGQ","吉林长春");
//        airportName2City.put("YNJ","吉林延吉");
//        airportName2City.put("JIL","吉林吉林");
//        airportName2City.put("DLC","辽宁大连");
//        airportName2City.put("SHE","辽宁沈阳");
//        airportName2City.put("JNZ","辽宁锦州");
//        airportName2City.put("DDG","辽宁丹东");
//        airportName2City.put("CHG","辽宁朝阳市");
//        airportName2City.put("IOB","辽宁鞍山市");
//        airportName2City.put("CNI","辽宁长海市");
//        airportName2City.put("HET","内蒙古呼和浩特");
//        airportName2City.put("BAV","内蒙古包头");
//        airportName2City.put("HLH","内蒙古乌兰浩特市");
//        airportName2City.put("HLD","内蒙古海拉尔");
//        airportName2City.put("XIL","内蒙古锡林浩特市");
//        airportName2City.put("CIF","内蒙古赤峰市");
//        airportName2City.put("TGO","内蒙古通辽市");
//        airportName2City.put("WUA","内蒙古乌海市");
//        airportName2City.put("DSN","内蒙古鄂尔多斯市");
//        airportName2City.put("PEK","北京北京首都");
//        airportName2City.put("NAY","北京北京南苑");
//        airportName2City.put("TSN","天津天津滨海");
//        airportName2City.put("SJW","河北石家庄");
//        airportName2City.put("SHP","河北秦皇岛");
//        airportName2City.put("TYN","山西太原");
//        airportName2City.put("DAT","山西大同");
//        airportName2City.put("CIH","山西长治");
//        airportName2City.put("YCU","山西运城");
//        airportName2City.put("CGO","河南郑州");
//        airportName2City.put("LYA","河南洛阳");
//        airportName2City.put("NNY","河南南阳");
//        airportName2City.put("AYN","河南安阳");
//        airportName2City.put("WUH","湖北武汉");
//        airportName2City.put("SHS","湖北荆州");
//        airportName2City.put("XFN","湖北襄樊");
//        airportName2City.put("YIH","湖北宜昌");
//        airportName2City.put("ENH","湖北恩施");
//        airportName2City.put("DYG","湖南张家界");
//        airportName2City.put("CSX","湖南长沙");
//        airportName2City.put("CGD","湖南常德");
//        airportName2City.put("HNY","湖南衡阳市");
//        airportName2City.put("HJJ","湖南怀化");
//        airportName2City.put("LLF","湖南永州");
//        airportName2City.put("CAN","广东广州");
//        airportName2City.put("MXZ","广东梅县市");
//        airportName2City.put("ZUH","广东珠海");
//        airportName2City.put("SWA","广东汕头");
//        airportName2City.put("SZX","广东深圳");
//        airportName2City.put("ZHA","广东湛江市");
//        airportName2City.put("HUZ","广东惠州");
//        airportName2City.put("ZCP","广东佛山");
//        airportName2City.put("XIN","广东兴宁");
//        airportName2City.put("HAK","海南海口");
//        airportName2City.put("SYX","海南三亚");
//        airportName2City.put("NNG","广西南宁");
//        airportName2City.put("KWL","广西桂林");
//        airportName2City.put("BHY","广西北海");
//        airportName2City.put("LZH","广西柳州");
//        airportName2City.put("YUZ","广西梧州");
//        airportName2City.put("AEB","广西百色");
//        airportName2City.put("TNA","山东济南");
//        airportName2City.put("WEH","山东威海");
//        airportName2City.put("TAO","山东青岛");
//        airportName2City.put("WEF","山东潍坊");
//        airportName2City.put("YNT","山东烟台");
//        airportName2City.put("LYI","山东临沂市");
//        airportName2City.put("SUB","山东泗水");
//        airportName2City.put("JNG","山东济宁市");
//        airportName2City.put("DOY","山东东营");
//        airportName2City.put("KHN","江西南昌");
//        airportName2City.put("JIU","江西九江");
//        airportName2City.put("JDZ","江西景德镇");
//        airportName2City.put("KOW","江西赣州");
//        airportName2City.put("JGS","江西井冈山");
//        airportName2City.put("TXN","安徽黄山屯");
//        airportName2City.put("HFE","安徽合肥");
//        airportName2City.put("AQG","安徽安庆");
//        airportName2City.put("FUG","安徽阜阳");
//        airportName2City.put("HGH","浙江杭州");
//        airportName2City.put("WNZ","浙江温州");
//        airportName2City.put("HSN","浙江舟山");
//        airportName2City.put("NGB","浙江宁波");
//        airportName2City.put("YIW","浙江义乌市");
//        airportName2City.put("HYN","浙江台州");
//        airportName2City.put("JUZ","浙江衢州市");
//        airportName2City.put("NKG","江苏南京");
//        airportName2City.put("XUZ","江苏徐州");
//        airportName2City.put("LYG","江苏连云港");
//        airportName2City.put("YNZ","江苏盐城市");
//        airportName2City.put("CZX","江苏常州");
//        airportName2City.put("NTG","江苏南通");
//        airportName2City.put("WUX","江苏无锡");
//        airportName2City.put("SHA","上海上海虹桥");
//        airportName2City.put("PVG","上海上海浦东");
//        airportName2City.put("XMN","福建厦门");
//        airportName2City.put("FOC","福建福州");
//        airportName2City.put("JJN","福建晋江市");
//        airportName2City.put("WUS","福建武夷山");
//        airportName2City.put("LCX","福建连城市");
//        airportName2City.put("KMG","云南昆明");
//        airportName2City.put("LJG","云南丽江");
//        airportName2City.put("JHG","云南西双版纳");
//        airportName2City.put("DLU","云南大理市");
//        airportName2City.put("LUM","云南芒市");
//        airportName2City.put("DIG","云南迪庆");
//        airportName2City.put("SYM","云南思茅市");
//        airportName2City.put("BSD","云南保山市");
//        airportName2City.put("ZAT","云南昭通市");
//        airportName2City.put("LNJ","云南临沧");
//        airportName2City.put("YUA","云南元谋");
//        airportName2City.put("LXA","西藏拉萨");
//        airportName2City.put("BPX","西藏昌都");
//        airportName2City.put("LZY","西藏林芝");
//        airportName2City.put("CTU","四川成都");
//        airportName2City.put("MIG","四川绵阳");
//        airportName2City.put("YBP","四川宜宾");
//        airportName2City.put("LZO","四川泸州");
//        airportName2City.put("JZH","四川九寨沟");
//        airportName2City.put("PZI","四川攀枝花");
//        airportName2City.put("XIC","四川西昌");
//        airportName2City.put("DAX","四川达县");
//        airportName2City.put("NAO","四川南充");
//        airportName2City.put("GHN","四川广汉市");
//        airportName2City.put("GYS","四川广元");
//        airportName2City.put("KGT","四川康定");
//        airportName2City.put("CKG","重庆重庆江北");
//        airportName2City.put("WXN","重庆重庆万州");
//        airportName2City.put("LIA","重庆万县");
//        airportName2City.put("KWE","贵州贵阳");
//        airportName2City.put("TEN","贵州铜仁");
//        airportName2City.put("ZYI","贵州遵义市");
//        airportName2City.put("AVA","贵州安顺");
//        airportName2City.put("ACX","贵州兴义");
//        airportName2City.put("XIY","陕西西安");
//        airportName2City.put("SIA","陕西西安");
//        airportName2City.put("HZG","陕西汉中");
//        airportName2City.put("ENY","陕西延安");
//        airportName2City.put("AKA","陕西安康");
//        airportName2City.put("UYN","陕西榆林");
//        airportName2City.put("LHW","甘肃兰州");
//        airportName2City.put("DNH","甘肃敦煌市");
//        airportName2City.put("JGN","甘肃嘉峪关市");
//        airportName2City.put("IQN","甘肃庆阳");
//        airportName2City.put("CHW","甘肃酒泉");
//        airportName2City.put("XNN","青海西宁");
//        airportName2City.put("GOQ","青海格尔木市");
//        airportName2City.put("INC","宁夏银川");
//        airportName2City.put("URC","新疆乌鲁木齐");
//        airportName2City.put("HTN","新疆和田市");
//        airportName2City.put("YIN","新疆伊宁市");
//        airportName2City.put("KRY","新疆克拉玛依市");
//        airportName2City.put("TCG","新疆塔城市");
//        airportName2City.put("AAT","新疆阿勒泰市");
//        airportName2City.put("AKU","新疆阿克苏市");
//        airportName2City.put("KRL","新疆库尔勒市");
//        airportName2City.put("KCA","新疆库车市");
//        airportName2City.put("KHG","新疆喀什市");
//        airportName2City.put("IQM","新疆且末市");
//        airportName2City.put("HMI","新疆哈密市");
//        airportName2City.put("FYN","新疆富蕴市");
//        airportName2City.put("NLT","新疆那拉提");
//        airportName2City.put("AUH","阿联酋阿布扎比");
//        airportName2City.put("DXB","阿联酋迪拜");
//        airportName2City.put("SHJ","阿联酋沙迦");
//        airportName2City.put("MCT","阿曼马斯喀特");
//        airportName2City.put("ISB","巴基斯坦伊斯兰堡");
//        airportName2City.put("KHI","巴基斯坦卡拉奇");
//        airportName2City.put("FNJ","朝鲜平壤");
//        airportName2City.put("CEB","菲律宾宿务");
//        airportName2City.put("MNL","菲律宾马尼拉");
//        airportName2City.put("ALA","哈萨克斯坦阿拉木图");
//        airportName2City.put("CJU","韩国济洲岛");
//        airportName2City.put("ICN","韩国仁川");
//        airportName2City.put("PUS","韩国釜山");
//        airportName2City.put("SEL","韩国汉城");
//        airportName2City.put("TAE","韩国大丘");
//        airportName2City.put("PNH","柬埔寨金边");
//        airportName2City.put("DOH","卡塔尔多哈");
//        airportName2City.put("KWI","科威特科威特");
//        airportName2City.put("MLE","马尔代夫马累");
//        airportName2City.put("KUL","马来西亚吉隆坡");
//        airportName2City.put("LGK","马来西亚兰卡威");
//        airportName2City.put("PEN","马来西亚槟城");
//        airportName2City.put("ULN","蒙古乌兰巴托");
//        airportName2City.put("RGN","缅甸仰光");
//        airportName2City.put("KTM","尼泊尔加德满都");
//        airportName2City.put("CTS","日本札幌");
//        airportName2City.put("FUK","日本福冈");
//        airportName2City.put("HIJ","日本广岛");
//        airportName2City.put("KIX","日本大坂");
//        airportName2City.put("NGS","日本长崎");
//        airportName2City.put("NRT","日本东京成田机场");
//        airportName2City.put("OKA","日本冲绳");
//        airportName2City.put("OKJ","日本冈山");
//        airportName2City.put("OSA","日本大阪");
//        airportName2City.put("SDJ","日本仙台");
//        airportName2City.put("SPK","日本札幌");
//        airportName2City.put("TYO","日本东京首都机场");
//        airportName2City.put("RUH","沙特阿拉伯利雅得");
//        airportName2City.put("CMB","斯里兰卡科伦坡");
//        airportName2City.put("BKK","泰国曼谷");
//        airportName2City.put("HKT","泰国普吉岛");
//        airportName2City.put("IST","土尔其伊斯坦布尔");
//        airportName2City.put("SIN","新加坡新加坡");
//        airportName2City.put("THR","伊朗德黑兰");
//        airportName2City.put("TLV","以色列特拉维夫");
//        airportName2City.put("BOM","印度孟买");
//        airportName2City.put("CCU","印度加尔各答");
//        airportName2City.put("DEL","印度新德里");
//        airportName2City.put("JKT","印尼雅加达");
//        airportName2City.put("MES","印尼棉兰");
//        airportName2City.put("SUB","印尼泗水");
//        airportName2City.put("HAN","越南河内");
//        airportName2City.put("SGN","越南胡志明市");
//        airportName2City.put("HKG","中国香港");
//        airportName2City.put("MFM","中国澳门");
//        airportName2City.put("KHH","中国台湾高雄");
//        airportName2City.put("TPE","中国台湾台北");
//        airportName2City.put("ADL","澳大利亚阿德莱德");
//        airportName2City.put("BNE","澳大利亚布里斯班");
//        airportName2City.put("CBR","澳大利亚堪培拉");
//        airportName2City.put("MEL","澳大利亚墨尔本");
//        airportName2City.put("PER","澳大利亚珀斯");
//        airportName2City.put("SYD","澳大利亚悉尼");
//        airportName2City.put("AKL","新西兰奥克兰");
//        airportName2City.put("CHC","新西兰基督城");
//        airportName2City.put("WLG","新西兰惠灵顿");
//        airportName2City.put("DUB","爱尔兰都柏林");
//        airportName2City.put("VIE","奥地利维也纳");
//        airportName2City.put("BRU","比利时布鲁塞尔");
//        airportName2City.put("WAW","波兰华沙");
//        airportName2City.put("CPH","丹麦哥本哈根");
//        airportName2City.put("BER","德国柏林");
//        airportName2City.put("CGN","德国科隆");
//        airportName2City.put("DUS","德国杜塞尔多夫");
//        airportName2City.put("HAJ","德国汉诺威");
//        airportName2City.put("HAM","德国汉堡");
//        airportName2City.put("MUC","德国慕尼黑");
//        airportName2City.put("NUE","德国纽伦堡");
//        airportName2City.put("STR","德国斯图加特");
//        airportName2City.put("SXF","德国柏林舍讷费尔德机场");
//        airportName2City.put("TXL","德国柏林");
//        airportName2City.put("FRA","德国法兰克福");
//        airportName2City.put("IKT","俄罗斯伊尔库次克");
//        airportName2City.put("KHV","俄罗斯哈巴罗夫斯克");
//        airportName2City.put("LED","俄罗斯圣彼得堡");
//        airportName2City.put("MOW","俄罗斯莫斯科");
//        airportName2City.put("OVB","俄罗斯新西伯利亚");
//        airportName2City.put("VVO","俄罗斯苻拉迪沃斯托克");
//        airportName2City.put("PAR","法国巴黎戴高乐机场");
//        airportName2City.put("CDG","法国巴黎戴高乐机场");
//        airportName2City.put("LYS","法国里昂");
//        airportName2City.put("MRS","法国马赛");
//        airportName2City.put("NCE","法国尼斯");
//        airportName2City.put("ORY","法国巴黎奥利机场");
//        airportName2City.put("HEL","芬兰赫尔辛基");
//        airportName2City.put("AMS","荷兰阿姆斯特丹");
//        airportName2City.put("PRG","捷克布拉格");
//        airportName2City.put("LUX","卢森堡卢森堡");
//        airportName2City.put("BUH","罗马尼亚布加勒斯特");
//        airportName2City.put("BEG","南斯拉夫贝尔格莱德");
//        airportName2City.put("SJJ","波黑萨拉热窝");
//        airportName2City.put("OSL","挪威奥斯陆");
//        airportName2City.put("LIS","葡萄牙里斯本");
//        airportName2City.put("STO","瑞典斯德哥尔摩");
//        airportName2City.put("ARN","瑞典斯德哥尔摩");
//        airportName2City.put("GVA","瑞士日内瓦");
//        airportName2City.put("ZRH","瑞士苏黎士");
//        airportName2City.put("KBP","乌克兰基辅");
//        airportName2City.put("BCN","西班牙巴塞罗那");
//        airportName2City.put("MAD","西班牙马德里");
//        airportName2City.put("ATH","希腊雅典");
//        airportName2City.put("BUD","匈牙利布达佩斯");
//        airportName2City.put("MIL","意大利米兰");
//        airportName2City.put("MXP","意大利米兰马尔本萨机场");
//        airportName2City.put("FCO","意大利罗马");
//        airportName2City.put("ROM","意大利罗马");
//        airportName2City.put("VCE","意大利威尼斯");
//        airportName2City.put("FCO","意大利罗马达芬奇机场");
//        airportName2City.put("EDI","英国爱丁堡");
//        airportName2City.put("LGW","英国伦敦盖特威克机场");
//        airportName2City.put("LHR","英国伦敦希思罗机场");
//        airportName2City.put("MAN","英国曼彻斯特");
//        airportName2City.put("NCL","英国纽卡斯尔");
//        airportName2City.put("ADD","埃塞俄比亚亚的斯亚贝巴");
//        airportName2City.put("CAI","埃及开罗");
//        airportName2City.put("CPT","南非开普敦");
//        airportName2City.put("JNB","南非约翰内斯堡");
//        airportName2City.put("KRT","苏丹喀土穆");
//        airportName2City.put("MRU","毛里求斯毛里求斯");
//        airportName2City.put("NBO","肯尼亚内罗毕");
//        airportName2City.put("TUN","突尼斯突尼斯");
//        airportName2City.put("EZE","阿根廷布宜诺斯艾利斯");
//        airportName2City.put("BUE","阿根廷布宜诺斯艾利斯");
//        airportName2City.put("SAO","巴西圣保罗");
//        airportName2City.put("GRU","巴西圣保罗");
//        airportName2City.put("RIO","巴西里约热内卢");
//        airportName2City.put("YEG","加拿大埃德蒙顿");
//        airportName2City.put("YUL","加拿大蒙特利尔");
//        airportName2City.put("YMQ","加拿大蒙特利尔");
//        airportName2City.put("YOW","加拿大渥太华");
//        airportName2City.put("YQB","加拿大魁北克");
//        airportName2City.put("YVR","加拿大温哥华");
//        airportName2City.put("YWG","加拿大温尼伯");
//        airportName2City.put("YXY","加拿大怀特霍斯");
//        airportName2City.put("YYC","加拿大卡尔加里");
//        airportName2City.put("YTO","加拿大多伦多");
//        airportName2City.put("YYZ","加拿大多伦多");
//        airportName2City.put("ANC","美国安克雷奇");
//        airportName2City.put("ATL","美国亚特兰大");
//        airportName2City.put("BOS","美国波士顿");
//        airportName2City.put("CHI","美国芝加哥");
//        airportName2City.put("DEN","美国丹佛");
//        airportName2City.put("DFW","美国达拉斯");
//        airportName2City.put("DTW","美国底特律");
//        airportName2City.put("EWR","美国纽约纽瓦克机场");
//        airportName2City.put("HNL","美国夏威夷（檀香山、火奴鲁鲁）");
//        airportName2City.put("IAD","美国华盛顿达拉斯机场");
//        airportName2City.put("HOU","美国休斯顿");
//        airportName2City.put("IAH","美国休斯顿");
//        airportName2City.put("NYC","美国纽约肯尼迪机场");
//        airportName2City.put("JFK","美国纽约肯尼迪机场");
//        airportName2City.put("LAS","美国拉斯维加斯");
//        airportName2City.put("LAX","美国洛杉矶");
//        airportName2City.put("MCI","美国堪萨斯城");
//        airportName2City.put("MCO","美国奥兰多国际机场");
//        airportName2City.put("MEM","美国孟斐斯");
//        airportName2City.put("MIA","美国迈阿密");
//        airportName2City.put("MSP","美国明尼阿波利斯");
//        airportName2City.put("NYC","美国纽约");
//        airportName2City.put("CHI","美国芝加哥");
//        airportName2City.put("ORD","美国芝加哥");
//        airportName2City.put("PDX","美国波特兰");
//        airportName2City.put("PHL","美国费城");
//        airportName2City.put("PHX","美国凤凰城");
//        airportName2City.put("SAN","美国圣迭哥");
//        airportName2City.put("SEA","美国西雅图");
//        airportName2City.put("SFO","美国旧金山");
//        airportName2City.put("SPN","美国塞班岛");
//        airportName2City.put("WAS","美国华盛顿");
//        airportName2City.put("MEX","墨西哥墨西哥城");
//        airportName2City.put("CCS","委内瑞拉加斯拉斯");
//        airportName2City.put("MVD","乌拉圭蒙得维的亚");
//        airportName2City.put("SCL","智利圣地亚哥");
//        airportName2City.put("CNX","泰国清迈");
//        airportName2City.put("TSA","中国台湾台北松山");
//        airportName2City.put("USM","泰国苏梅岛");
//        airportName2City.put("HND","日本东京羽田机场");
//        airportName2City.put("YOK","日本横滨");
//        airportName2City.put("KMJ","日本熊本");
//        airportName2City.put("NGO","日本名古屋");
//        airportName2City.put("BKI","马来西亚亚庇");
//        airportName2City.put("REP","柬埔寨暹粒");
//        airportName2City.put("IEV","乌克兰基辅");
//        airportName2City.put("ESB","土耳其安卡拉");
//        airportName2City.put("AER","俄罗斯索契");
//        airportName2City.put("BHX","英国伯明翰");
//        airportName2City.put("GLA","英国格拉斯哥");
//        airportName2City.put("RAK","摩洛哥马拉喀什");
//        airportName2City.put("RKV","冰岛雷克雅未克");
//        airportName2City.put("VVO","俄罗斯符拉迪沃斯托克");
//        airportName2City.put("CNS","澳大利亚凯恩斯");
//        airportName2City.put("ROR","帕劳科罗尔");
//        airportName2City.put("CMN","卡萨布兰卡摩洛哥");
//        airportName2City.put("WMT","贵州遵义");
//        airportName2City.put("JIQ","重庆重庆");
//        airportName2City.put("ZHY","宁夏中卫");
//        airportName2City.put("YZY","甘肃张掖");
//        airportName2City.put("ZQZ","河北张家口");
//        airportName2City.put("JAI","印度斋浦尔");
//        airportName2City.put("YUS","青海玉树");
//        airportName2City.put("EUG","美国尤金");
//        airportName2City.put("YKH","辽宁营口");
//        airportName2City.put("IND","美国印第安纳波利斯");
//        airportName2City.put("INN","奥地利因斯布鲁克");
//        airportName2City.put("YIC","江西宜春");
//        airportName2City.put("LDS","黑龙江伊春");
//        airportName2City.put("CGK","印度尼西亚雅加达");
//        airportName2City.put("CVG","美国辛辛那提");
//        airportName2City.put("TAK","日本香川");
//        airportName2City.put("YYG","加拿大夏洛特城");
//        airportName2City.put("SYR","美国锡拉丘兹");
//        airportName2City.put("SBZ","罗马尼亚锡比乌");
//        airportName2City.put("POS","特立尼达和多巴哥西班牙港");
//        airportName2City.put("UPG","印度尼西亚乌戎潘当");
//        airportName2City.put("UUD","俄罗斯乌兰乌德");
//        airportName2City.put("UCB","内蒙古乌兰察布");
//        airportName2City.put("WNH","云南文山");
//        airportName2City.put("WDH","纳米比亚温得和克");
//        airportName2City.put("VRN","意大利维罗纳");
//        airportName2City.put("VLI","瓦努阿图维拉港");
//        airportName2City.put("YYJ","加拿大维多利亚");
//        airportName2City.put("VTE","老挝万象");
//        airportName2City.put("VLC","西班牙瓦伦西亚");
//        airportName2City.put("TLQ","新疆吐鲁番");
//        airportName2City.put("TUS","美国图森");
//        airportName2City.put("TLS","法国图鲁兹");
//        airportName2City.put("TNH","吉林通化");
//        airportName2City.put("THQ","甘肃天水");
//        airportName2City.put("TCZ","云南腾冲");
//        airportName2City.put("TRD","挪威特隆赫姆");
//        airportName2City.put("TVS","河北唐山");
//        airportName2City.put("TAM","墨西哥坦皮科");
//        airportName2City.put("TPA","美国坦帕");
//        airportName2City.put("RMQ","台湾台中");
//        airportName2City.put("TAS","乌兹别克斯坦塔什干");
//        airportName2City.put("TNR","马达加斯加塔那那利佛");
//        airportName2City.put("TUL","美国塔尔萨");
//        airportName2City.put("SOF","保加利亚索非亚");
//        airportName2City.put("URT","泰国素叻他尼");
//        airportName2City.put("YSQ","吉林松原");
//        airportName2City.put("SVG","挪威斯塔万格");
//        airportName2City.put("SPU","克罗地亚斯普利特");
//        airportName2City.put("BWN","文莱斯里巴加湾");
//        airportName2City.put("GMP","韩国首尔");
//        airportName2City.put("TLN","法国士伦");
//        airportName2City.put("ISG","日本石垣");
//        airportName2City.put("SHF","新疆石河子");
//        airportName2City.put("WDS","湖北十堰");
//        airportName2City.put("YYT","加拿大圣约翰");
//        airportName2City.put("SAL","萨尔瓦多圣萨尔瓦多");
//        airportName2City.put("SJC","美国圣何塞");
//        airportName2City.put("SJO","哥斯达黎加圣何塞");
//        airportName2City.put("TMS","圣多美和普林西比圣多美和普琳西比");
//        airportName2City.put("SAT","美国圣安东尼奥");
//        airportName2City.put("HPG","湖北神农架");
//        airportName2City.put("UKB","日本神户");
//        airportName2City.put("SHV","美国什里夫波特");
//        airportName2City.put("WGN","湖南邵阳");
//        airportName2City.put("SQD","江西上饶");
//        airportName2City.put("QSZ","新疆莎车");
//        airportName2City.put("ZNZ","坦桑尼亚桑给巴尔");
//        airportName2City.put("XYI","海南三沙");
//        airportName2City.put("SQJ","福建三明");
//        airportName2City.put("SVQ","西班牙塞维利亚");
//        airportName2City.put("YXE","加拿大萨斯卡通");
//        airportName2City.put("ZAG","克罗地亚萨格勒布");
//        airportName2City.put("SAV","美国萨凡纳");
//        airportName2City.put("SSA","巴西萨尔瓦多");
//        airportName2City.put("SZG","奥地利萨尔斯堡");
//        airportName2City.put("RQA","新疆若羌");
//        airportName2City.put("RIZ","山东日照");
//        airportName2City.put("RKZ","西藏日喀则");
//        airportName2City.put("CXR","越南庆和");
//        airportName2City.put("CJJ","韩国清州");
//        airportName2City.put("CEI","泰国清莱");
//        airportName2City.put("BPE","河北秦皇岛");
//        airportName2City.put("JRO","坦桑尼亚乞力马扎罗");
//        airportName2City.put("PUB","美国普韦布洛");
//        airportName2City.put("JMJ","云南普洱");
//        airportName2City.put("POL","莫桑比克彭巴");
//        airportName2City.put("PNA","西班牙潘普洛纳");
//        airportName2City.put("PPT","法属波利尼西亚帕皮提");
//        airportName2City.put("TYS","美国诺克斯维尔");
//        airportName2City.put("APL","莫桑比克楠普拉");
//        airportName2City.put("BNA","美国纳什维尔");
//        airportName2City.put("YCD","加拿大纳奈莫");
//        airportName2City.put("OHE","黑龙江漠河");
//        airportName2City.put("SVO","俄罗斯莫斯科");
//        airportName2City.put("VKO","俄罗斯莫斯科");
//        airportName2City.put("MSQ","白俄罗斯明斯克");
//        airportName2City.put("BGY","意大利米兰");
//        airportName2City.put("DAC","孟加拉国孟加拉达卡");
//        airportName2City.put("FMO","德国蒙斯特");
//        airportName2City.put("YQM","加拿大蒙古顿");
//        airportName2City.put("DMK","泰国曼谷");
//        airportName2City.put("MDL","缅甸曼德勒");
//        airportName2City.put("NZH","内蒙古满洲里");
//        airportName2City.put("AGP","西班牙马拉加");
//        airportName2City.put("BDJ","印度尼西亚马辰港");
//        airportName2City.put("LLV","山西吕梁");
//        airportName2City.put("STN","英国伦敦");
//        airportName2City.put("STL","美国露伊斯");
//        airportName2City.put("LNL","甘肃陇南");
//        airportName2City.put("LPF","贵州六盘水");
//        airportName2City.put("LFQ","山西临汾");
//        airportName2City.put("NLH","云南丽江");
//        airportName2City.put("GIG","巴西里约热内卢");
//        airportName2City.put("RNO","美国里诺");
//        airportName2City.put("YQR","加拿大里贾纳");
//        airportName2City.put("RIX","拉脱维亚里加");
//        airportName2City.put("HZH","贵州黎平");
//        airportName2City.put("RNS","法国雷恩");
//        airportName2City.put("FLL","美国劳德代尔堡");
//        airportName2City.put("LPQ","老挝琅勃拉邦");
//        airportName2City.put("ZQN","新西兰昆士敦");
//        airportName2City.put("CLE","美国克利夫兰");
//        airportName2City.put("CFE","法国克莱蒙费朗");
//        airportName2City.put("CRK","菲律宾克拉克");
//        airportName2City.put("YKA","加拿大坎卢普斯");
//        airportName2City.put("CUN","墨西哥坎昆");
//        airportName2City.put("KJH","贵州凯里");
//        airportName2City.put("CTA","意大利卡塔尼亚");
//        airportName2City.put("KJI","新疆喀纳斯");
//        airportName2City.put("HSG","日本九州");
//        airportName2City.put("FSZ","日本静冈");
//        airportName2City.put("JIC","甘肃金昌");
//        airportName2City.put("JAX","美国杰克逊维尔");
//        airportName2City.put("DJB","印度尼西亚贾姆比");
//        airportName2City.put("JGD","内蒙古加格达奇");
//        airportName2City.put("YLW","加拿大基洛纳");
//        airportName2City.put("UIO","厄瓜多尔基多");
//        airportName2City.put("JXA","黑龙江鸡西");
//        airportName2City.put("HBA","澳大利亚霍巴特");
//        airportName2City.put("HIA","江苏淮安");
//        airportName2City.put("DCA","美国华盛顿");
//        airportName2City.put("HDY","泰国合艾");
//        airportName2City.put("HKD","日本函馆");
//        airportName2City.put("HDG","河北邯郸");
//        airportName2City.put("HYD","印度海德拉巴");
//        airportName2City.put("HAV","古巴哈瓦那");
//        airportName2City.put("YHZ","加拿大哈里法克斯");
//        airportName2City.put("HRE","津巴布韦哈拉雷");
//        airportName2City.put("GMQ","青海果洛州");
//        airportName2City.put("GUM","美国关岛");
//        airportName2City.put("GDL","墨西哥瓜达拉哈拉");
//        airportName2City.put("GYU","宁夏固原");
//        airportName2City.put("GRZ","奥地利格拉茨");
//        airportName2City.put("CMH","美国哥伦布");
//        airportName2City.put("CAE","美国哥伦比亚");
//        airportName2City.put("GOT","瑞典哥德堡");
//        airportName2City.put("DCY","四川甘孜");
//        airportName2City.put("GXH","甘肃甘南");
//        airportName2City.put("TOY","日本富山");
//        airportName2City.put("FYJ","黑龙江抚远");
//        airportName2City.put("YFC","加拿大弗雷德里顿");
//        airportName2City.put("RIC","美国弗吉尼亚");
//        airportName2City.put("FLR","意大利佛罗伦萨");
//        airportName2City.put("ERL","内蒙古二连浩特");
//        airportName2City.put("EBB","乌干达恩德培");
//        airportName2City.put("YTZ","加拿大多伦多");
//        airportName2City.put("DYU","塔吉克斯坦杜尚别");
//        airportName2City.put("DBV","克罗地亚杜布罗夫尼克");
//        airportName2City.put("TRN","意大利都灵");
//        airportName2City.put("TSR","罗马尼亚蒂米什瓦拉");
//        airportName2City.put("TBS","格鲁吉亚第比里斯");
//        airportName2City.put("TIA","阿尔巴尼亚地拉那");
//        airportName2City.put("TRS","意大利的里雅斯特");
//        airportName2City.put("HXD","青海德令哈");
//        airportName2City.put("DRS","德国德累斯顿");
//        airportName2City.put("IKA","伊朗德黑兰");
//        airportName2City.put("DUR","南非德班");
//        airportName2City.put("DSM","美国得梅因");
//        airportName2City.put("DQA","黑龙江大庆");
//        airportName2City.put("ITM","日本大阪");
//        airportName2City.put("DMM","沙特阿拉伯达曼");
//        airportName2City.put("DAR","坦桑尼亚达累斯萨拉姆");
//        airportName2City.put("DAL","美国达拉斯");
//        airportName2City.put("DRW","澳大利亚达尔文");
//        airportName2City.put("DBO","澳大利亚达博");
//        airportName2City.put("HTA","俄罗斯赤塔");
//        airportName2City.put("JUH","安徽池州");
//        airportName2City.put("CDE","河北承德");
//        airportName2City.put("CWJ","云南沧源");
//        airportName2City.put("BDS","意大利布林迪西");
//        airportName2City.put("BRS","英国布里斯托尔");
//        airportName2City.put("BUF","美国布法罗");
//        airportName2City.put("BRE","德国不莱梅");
//        airportName2City.put("BZN","美国博兹曼");
//        airportName2City.put("BOI","美国博伊西");
//        airportName2City.put("BLQ","意大利博罗尼亚");
//        airportName2City.put("BPL","新疆博乐");
//        airportName2City.put("BRN","瑞士伯尔尼");
//        airportName2City.put("POZ","波兰波兹南");
//        airportName2City.put("PWM","美国波特兰");
//        airportName2City.put("BOG","哥伦比亚波哥大");
//        airportName2City.put("BOD","法国波尔多");
//        airportName2City.put("BFJ","贵州毕节");
//        airportName2City.put("BIO","西班牙毕尔巴鄂");
//        airportName2City.put("PSA","意大利比萨");
//        airportName2City.put("BLL","丹麦比隆德");
//        airportName2City.put("BEW","莫桑比克贝拉");
//        airportName2City.put("BGO","挪威卑尔根");
//        airportName2City.put("BLR","印度班加罗尔");
//        airportName2City.put("NBS","吉林白山");
//        airportName2City.put("DBC","吉林白城");
//        airportName2City.put("BSB","巴西巴西利亚");
//        airportName2City.put("BSL","法国巴塞尔");
//        airportName2City.put("PTY","巴拿马巴拿马城");
//        airportName2City.put("BAH","巴林巴林");
//        airportName2City.put("BRI","意大利巴里");
//        airportName2City.put("DPS","印度尼西亚巴厘");
//        airportName2City.put("PMO","意大利巴勒莫");
//        airportName2City.put("YBG","加拿大巴戈特维尔");
//        airportName2City.put("BWI","美国巴尔的摩");
//        airportName2City.put("AUS","美国奥斯汀");
//        airportName2City.put("AAR","丹麦奥胡斯");
//        airportName2City.put("AOG","辽宁鞍山");
//        airportName2City.put("AMM","约旦安曼");
//        airportName2City.put("AOI","意大利安科纳");
//        airportName2City.put("AVV","澳大利亚爱华隆");
//        airportName2City.put("AMD","印度艾哈迈达巴德");
//        airportName2City.put("CBO","菲律宾阿旺");
//        airportName2City.put("TSE","哈萨克斯坦阿斯塔纳");
//        airportName2City.put("ASB","土库曼斯坦阿什哈巴德");
//        airportName2City.put("ALC","西班牙阿里坎特");
//        airportName2City.put("YIE","内蒙古阿尔山");
//        airportName2City.put("ALG","阿尔及利亚阿尔及尔");
//        airportName2City.put("ABQ","美国阿尔伯克基");
//        airportName2City.put("AHJ","四川阿坝");
//        airportName2City.put("WRO","波兰WROCLAW");
//        airportName2City.put("WVB","纳米比亚WALVISBAYROO");
//        airportName2City.put("UTP","泰国UTAPAO");
//        airportName2City.put("UME","瑞典UMEAA");
//        airportName2City.put("TOS","挪威TROMSO");
//        airportName2City.put("TRV","印度TRIVANDRUMI");
//        airportName2City.put("TET","莫桑比克TETEMATUNDA");
//        airportName2City.put("TLH","美国TALLAHASS");
//        airportName2City.put("SKZ","巴基斯坦SUKKUR");
//        airportName2City.put("SCE","美国STATECOLLEGE");
//        airportName2City.put("SOQ","印度尼西亚SORONGJEFMAN");
//        airportName2City.put("SAF","美国SNATAFE");
//        airportName2City.put("SBA","美国SANTABARBARA");
//        airportName2City.put("SLC","美国SALTLAKE");
//        airportName2City.put("SMF","美国SACRAMENTO");
//        airportName2City.put("ROC","美国ROCHESTERNY");
//        airportName2City.put("RST","美国ROCHESTERMN");
//        airportName2City.put("RDU","美国RALEIGHDURHA");
//        airportName2City.put("RAI","佛得角PRAIAF.MENDE");
//        airportName2City.put("PNQ","印度POONALOHEGAO");
//        airportName2City.put("PQC","越南PHUQUOCDUONG");
//        airportName2City.put("PSP","美国PALMSPRINGS");
//        airportName2City.put("SAW","土耳其MARQUETTEKIS");
//        airportName2City.put("SUF","意大利LAMEZIA-TERM");
//        airportName2City.put("YCG","加拿大CASTLEGAR");
//        airportName2City.put("YVO","加拿大BOURLAMAQ");
//        airportName2City.put("TKG","印度尼西亚BANDARLAMPUN");
//
//		this.dataAsService = dataAsService;
//		this.dataAsPort = dataAsPort;
//	}
//
//	public Map<String,AsIpInfo> ipArrAnalysis(String ipArr){
//		String url = dataAsService+":"+dataAsPort + AS_IPLOCATION_URL;
//		String param = "querylist="+ipArr;
//
//		Map<String,AsIpInfo> ipMap = new HashMap<String, AsIpInfo>();
//		String result = HttpUtil.sendGet(url,param);
//        JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
//        if (null != returnData.get("status_code")
//                &&"0".equals(returnData.get("status_code").getAsString())){
//        	JsonArray jsonArray = returnData.get("data").getAsJsonArray();
//        	for(int i = 0;i < jsonArray.size();i++) {
//        		JsonObject data = jsonArray.get(i).getAsJsonObject();
//        		AsIpInfo asIpInfo = new AsIpInfo();
//        		if (null != data
//                        &&(data.has("province")||data.has("city")
//                        ||data.has("country")||data.has("organization"))
//                        &&!data.get("country").isJsonNull()
//                        &&!data.get("province").isJsonNull()
//                        &&!data.get("city").isJsonNull()){
//        			asIpInfo.setIpCountry(data.get("country").getAsString());
//                    asIpInfo.setIpCity(data.get("city").getAsString());
//                    asIpInfo.setIpProvince(data.get("province").getAsString());
//                    asIpInfo.setIp(data.get("key").getAsString());
//                    ipMap.put(asIpInfo.getIp(),asIpInfo);
//        		}
//        	}
//        }
//        return ipMap;
//	}
//
//	public AsIpInfo ipInfoAnalysis(String ip) {
//		String url = dataAsService+":"+dataAsPort + AS_IPLOCATION_URL;
//		String param = "querylist="+ip;
//
//		String result = HttpUtil.sendGet(url,param);
//        JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
//        AsIpInfo asIpInfo = new AsIpInfo();
//        if (null != returnData.get("status_code")
//                &&"0".equals(returnData.get("status_code").getAsString())){
//
//            JsonObject data = returnData.get("data").getAsJsonArray().get(0).getAsJsonObject();
//            if (null != data
//                    &&(data.has("province")||data.has("city")
//                    ||data.has("country")||data.has("organization"))
//                    &&!data.get("country").isJsonNull()
//                    &&!data.get("province").isJsonNull()
//                    &&!data.get("city").isJsonNull()){
//
////                ipArea = data.get("country").getAsString()+data.get("province").getAsString()
////                        + data.get("city").getAsString();
//                asIpInfo.setIpCountry(data.get("country").getAsString());
//                asIpInfo.setIpCity(data.get("city").getAsString());
//                asIpInfo.setIpProvince(data.get("province").getAsString());
//                asIpInfo.setIp(ip);
//                return asIpInfo;
//            }else if (null != data && (data.has("organization")) && !data.get("organization").isJsonNull()){
//                asIpInfo.setIpOrganization(data.get("organization").getAsString());
//            }
//
//        }
//        return null;
//
//	}
//
//
//	public AsBankCardInfo cardAnalysis(String cardNo) {
//        String url = dataAsService+":"+dataAsPort + AS_BANKAREA_URL;
//        String param = "querylist="+cardNo;
//
//        String result = HttpUtil.sendGet(url,param);
//        JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
//
//        AsBankCardInfo asBankCardInfo = new AsBankCardInfo();
//        if (null != returnData.get("status_code")
//                &&"0".equals(returnData.get("status_code").getAsString())){
//
//            JsonObject data = returnData.get("data").getAsJsonArray().get(0).getAsJsonObject();
//            if (null != data){
//                asBankCardInfo.setCardNo(cardNo);
//                if (data.has("bank_name")&&!data.get("bank_name").isJsonNull())
//                    asBankCardInfo.setBankName(data.get("bank_name").getAsString());
//                if (data.has("province")&&!data.get("province").isJsonNull())
//                    asBankCardInfo.setProvince(data.get("province").getAsString());
//                if (data.has("city")&&!data.get("city").isJsonNull())
//                    asBankCardInfo.setCity(data.get("city").getAsString());
//                return asBankCardInfo;
//            }
//        }
//        return null;
//    }
//	public static void main(String[] args) {
//		String cardNo="6222021202038146966;1223;444";
//		String url="http://10.151.31.12:10888/bankcard/location";
//		String param="querylist="+cardNo;
//		String result ="";
//		 JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
//		System.out.println(result);
//	}
//	public Map<String,AsBankCardInfo> cardListAnalysis(String cardNoArr){
//		String url = dataAsService+":"+dataAsPort + AS_BANKAREA_URL;
//        String param = "querylist="+cardNoArr;
//        Map<String,AsBankCardInfo> cardInfoMap = new HashMap<String, AsBankCardInfo>();
//        String result = HttpUtil.sendGet(url,param);
//        	if (StringUtils.isBlank(result)) {
//        		return cardInfoMap;
//        	}
//        JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
//
//        if (null != returnData.get("status_code")
//                &&"0".equals(returnData.get("status_code").getAsString())){
//        	JsonArray jsonArray = returnData.get("data").getAsJsonArray();
//        	for(int i = 0;i < jsonArray.size();i++) {
//        		AsBankCardInfo asBankCardInfo = new AsBankCardInfo();
//
//        		JsonObject data = jsonArray.get(i).getAsJsonObject();
//        		if (null != data &&(data.has("province")||data.has("city"))
//                        &&!data.get("province").isJsonNull()
//                        &&!data.get("city").isJsonNull()) {
//        			String idNo = data.get("key").getAsString();
//        			if (data.has("bank_name")&&!data.get("bank_name").isJsonNull())
//                        asBankCardInfo.setBankName(data.get("bank_name").getAsString());
//                    if (data.has("province")&&!data.get("province").isJsonNull())
//                        asBankCardInfo.setProvince(data.get("province").getAsString());
//                    if (data.has("city")&&!data.get("city").isJsonNull())
//                        asBankCardInfo.setCity(data.get("city").getAsString());
//
//                    cardInfoMap.put(idNo, asBankCardInfo);
//        		}
//        	}
//        }
//        return cardInfoMap;
//
//	}
//
//
//	public AsIdNoInfo idNoLoacationAnalysis(String idNo) {
//        AsIdNoInfo asIdNoInfo = new AsIdNoInfo();
//        asIdNoInfo.setZodiac(zodiacAnalysis(idNo));
//        asIdNoInfo.setSex(sexAnalysis(idNo));
//        	asIdNoInfo.setAge(getAgeByIDNumber(idNo));
//
//        String url = dataAsService+":"+dataAsPort + AS_IDLOCATION_URL;
//        String param = "querylist=" + idNo;
//
//        String result = HttpUtil.sendGet(url,param);
//        	if (StringUtils.isBlank(result)) {
//        		return asIdNoInfo;
//        	}
//        try {
//			JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
//			if (null != returnData.get("status_code")
//			        &&"0".equals(returnData.get("status_code").getAsString())){
//			    JsonObject data = returnData.get("data").getAsJsonArray().get(0).getAsJsonObject();
//			    if (null != data){
//			        if (data.has("province")&&!data.get("province").isJsonNull())
//			            asIdNoInfo.setProvince(data.get("province").getAsString());
//			        if (data.has("city")&&!data.get("city").isJsonNull())
//			            asIdNoInfo.setCity(data.get("city").getAsString());
//			    }
//			}
//		} catch (Exception e) {
//			 return asIdNoInfo;
//		}
//        return asIdNoInfo;
//    }
//
//	public Map<String,AsIdNoInfo> idNoArrAnalysis(String idNoArr){
//		String url = dataAsService+":"+dataAsPort + AS_IDLOCATION_URL;
//        String param = "querylist="+idNoArr;
//
//        Map<String,AsIdNoInfo> idNoMap = new HashMap<String, AsIdNoInfo>();
//
//        String result = HttpUtil.sendGet(url,param);
//        if(StringUtils.isBlank(result)) {
//        	return idNoMap;
//        }
//        JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
//        if (null != returnData.get("status_code")
//                &&"0".equals(returnData.get("status_code").getAsString())){
//        	JsonArray jsonArray = returnData.get("data").getAsJsonArray();
//        	for(int i = 0;i < jsonArray.size();i++) {
//        		AsIdNoInfo asIdNoInfo = new AsIdNoInfo();
//
//        		JsonObject data = jsonArray.get(i).getAsJsonObject();
//        		if (null != data &&(data.has("province")||data.has("city"))
//                        &&!data.get("province").isJsonNull()
//                        &&!data.get("city").isJsonNull()) {
//                	String idNo = data.get("key").getAsString();
//                	asIdNoInfo.setZodiac(zodiacAnalysis(idNo));
//                    asIdNoInfo.setSex(sexAnalysis(idNo));
//                    if (null != data){
//                        if (data.has("province")&&!data.get("province").isJsonNull())
//                            asIdNoInfo.setProvince(data.get("province").getAsString());
//                        if (data.has("city")&&!data.get("city").isJsonNull())
//                            asIdNoInfo.setCity(data.get("city").getAsString());
//                    }
//                	idNoMap.put(data.get("key").getAsString(),asIdNoInfo);
//                }
//        	}
//        }
//        return idNoMap;
//	}
//
//	public AsPhoneInfo phoneAreaAnalysis(String phoneNumber) {
//        String url = dataAsService+":"+dataAsPort + AS_PHONELOCATION_URL;
//        String param = "querylist="+phoneNumber;
//
//        AsPhoneInfo asPhoneInfo = new AsPhoneInfo();
//
//        String result = HttpUtil.sendGet(url,param);
//        JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
//        if (null != returnData.get("status_code")
//                &&"0".equals(returnData.get("status_code").getAsString())){
//
//            JsonObject data = returnData.get("data").getAsJsonArray().get(0).getAsJsonObject();
//            if (null != data &&(data.has("province")||data.has("city"))
//                    &&!data.get("province").isJsonNull()
//                    &&!data.get("city").isJsonNull()) {
//
//                asPhoneInfo.setPhone(phoneNumber);
//            	asPhoneInfo.setPhoneCity(data.get("city").getAsString());
//            	asPhoneInfo.setPhoneProvince(data.get("province").getAsString());
//            	asPhoneInfo.setPhoneCompany(data.get("company").getAsString());
//            	return asPhoneInfo;
//            }
//        }
//        return null;
//    }
//
//	public Map<String,AsPhoneInfo> phoneArrAreaAnalysis(String phoneArr){
//		String url = dataAsService+":"+dataAsPort + AS_PHONELOCATION_URL;
//        String param = "querylist="+phoneArr;
//
//        Map<String,AsPhoneInfo> phoneMap = new HashMap<String, AsPhoneInfo>();
//
//        String result = HttpUtil.sendGet(url,param);
//        JsonObject returnData = new JsonParser().parse(result).getAsJsonObject();
//        if (null != returnData.get("status_code")
//                &&"0".equals(returnData.get("status_code").getAsString())){
//        	JsonArray jsonArray = returnData.get("data").getAsJsonArray();
//        	for(int i = 0;i < jsonArray.size();i++) {
//        		AsPhoneInfo asPhoneInfo = new AsPhoneInfo();
//
//        		JsonObject data = jsonArray.get(i).getAsJsonObject();
//        		if (null != data &&(data.has("province")||data.has("city"))
//                        &&!data.get("province").isJsonNull()
//                        &&!data.get("city").isJsonNull()) {
//
//                    asPhoneInfo.setPhone(data.get("key").getAsString());
//                	asPhoneInfo.setPhoneCity(data.get("city").getAsString());
//                	asPhoneInfo.setPhoneProvince(data.get("province").getAsString());
//                	asPhoneInfo.setPhoneCompany(data.get("company").getAsString());
//                	phoneMap.put(data.get("key").getAsString(),asPhoneInfo);
//                }
//        	}
//        }
//        return phoneMap;
//	}
//
//	public String airportAs(String airportCode) {
//		if(StringUtils.isNotBlank(airportCode)&&airportName2City.containsKey(airportCode)) {
//			return airportName2City.get(airportCode);
//		}
//		return "";
//	}
//
//
//
//	public String zodiacAnalysis(String idNo) {
//        if(idNo.length() != 18)
//            return null;
//        try {
//			String SX[]={  "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗","猪" };
//			int year=Integer.parseInt(idNo.substring(6,10));
//			int x=(year-4)%12;
//			String ret;
//			ret=SX[x];
//			return ret;
//		} catch (NumberFormatException e) {
//			return null;
//		}
//    }
//
//    public String sexAnalysis(String idNo) {
//        if(idNo.length() != 18)
//            return null;
//
//        String sGender;
//        String sCardNum = idNo.substring(16, 17);
//        if (Integer.parseInt(sCardNum) % 2 != 0) {
//            sGender = "男";//男
//        } else {
//            sGender = "女";//女
//        }
//        return sGender;
//    }
//
//    public int getAgeByIDNumber(String idNumber) {
//    	  if (StringUtils.isBlank(idNumber)) return 0;
//    	  String dateStr;
//    	  if (idNumber.length() == 15) {
//    	    dateStr = "19" + idNumber.substring(6, 12);
//    	  } else if (idNumber.length() == 18) {
//    	    dateStr = idNumber.substring(6, 14);
//    	  } else {//默认是合法身份证号，但不排除有意外发生
//    	    return 0;
//    	  }
//    	  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
//    	  try {
//    	    Date birthday = simpleDateFormat.parse(dateStr);
//    	    Calendar calendar = Calendar.getInstance();
//    	    //calendar.before()有的点bug
//    	    if (calendar.getTimeInMillis() - birthday.getTime() < 0L) {
//    	      return 0;
//    	    }
//    	    int yearNow = calendar.get(Calendar.YEAR);
//    	    int monthNow = calendar.get(Calendar.MONTH);
//    	    int dayOfMonthNow = calendar.get(Calendar.DAY_OF_MONTH);
//    	    calendar.setTime(birthday);
//    	    int yearBirthday = calendar.get(Calendar.YEAR);
//    	    int monthBirthday = calendar.get(Calendar.MONTH);
//    	    int dayOfMonthBirthday = calendar.get(Calendar.DAY_OF_MONTH);
//    	    int age = yearNow - yearBirthday;
//    	    if (monthNow <= monthBirthday && monthNow == monthBirthday && dayOfMonthNow < dayOfMonthBirthday || monthNow < monthBirthday) {
//    	      age--;
//    	    }
//    	    return age--;
//    	  } catch (Exception e) {
//    	    return 0;
//    	  }
//    	}
//}
