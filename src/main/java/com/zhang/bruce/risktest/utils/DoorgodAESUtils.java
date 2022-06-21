//package com.zhang.bruce.risktest.utils;
//
//
//import com.yeepay.g3.utils.common.encrypt.AES;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// * AES工具类
// * @author songwenbin
// *
// */
//public final class DoorgodAESUtils {
//	static Logger logger = LoggerFactory.getLogger(DoorgodAESUtils.class);
//	//对秘钥加密的key
//	public static final String DOORGOD_KEY_ENCRYKEY = "OPLte6rXr(H3t4c%";
//
//	//对数据加密的密钥前半部分
//	public static final String DOOROGD_SENSITIVE_INFO_DATA_ENCRYKEY_PREFIX = "7xiBvb+FYadUzqXRTBsrrw==";
//	//存储到统一配置中
//	public static final String DOOROGD_SENSITIVE_INFO_DATA_ENCRYKEY_SUFFIX = "6DjgwnSJ5LGitGXXfiMdnQ==";
//
//	private final static int DOORGOD_AES_BIT = 128;
//
//	/**
//	 * 加密
//	 * @param message：需要加密的字符串
//	 * @param password：加密需要的密钥
//	 * @return
//	 */
//	public static String encode(String message,String password) {
//		if(StringUtils.isBlank(message)){
//			return message;
//		}
//		return AES.encryptToBase64(message, password);
////		try {
////			SecretKey secretKey = generateKey(password);
////			byte[] enCodeFormat = secretKey.getEncoded();
////			SecretKeySpec keySpec = new SecretKeySpec(enCodeFormat, "AES");
////
////			Cipher cipherEncoder = Cipher.getInstance("AES");
////			cipherEncoder.init(Cipher.ENCRYPT_MODE, keySpec);
////
////			byte[] result = cipherEncoder.doFinal(message.getBytes());
////			return HexUtils.bytesToHex(result);
////		} catch (Exception e) {
////			logger.error("password="+password, e);
////			throw new RuntimeException(e.getMessage());
////		}
//
//	}
//
//	/**
//	 * 解密
//	 * @param message：需要解密的字符串
//	 * @param password：解密需要的秘钥(从统一配置中获取)
//	 * @return
//	 */
//	public static String decode(String message,String password) {
//		if(StringUtils.isBlank(message)){
//			return message;
//		}
//		try{
//			return AES.decryptFromBase64(message, password);
//		}catch(Exception e){
//			logger.error("aes decode error,data:"+message, e);
//			throw new RuntimeException(e.getMessage());
//		}
////		try {
////			SecretKey secretKey = generateKey(password);
////			byte[] enCodeFormat = secretKey.getEncoded();
////			SecretKeySpec keySpec = new SecretKeySpec(enCodeFormat, "AES");
////
////			Cipher cipherDecoder = Cipher.getInstance("AES");
////			cipherDecoder.init(Cipher.DECRYPT_MODE, keySpec);
////
////			byte[] result = cipherDecoder.doFinal(HexUtils.hexToBytes(message));
////			return HexUtils.hexToStr(HexUtils.bytesToHex(result));
////		} catch (Exception e) {
////			logger.error("password="+password, e);
////			throw new RuntimeException(e.getMessage());
////		}
//	}
//
////	private static SecretKey generateKey(String secretKey)
////			throws NoSuchAlgorithmException, InvalidKeyException,
////			InvalidKeySpecException {
////		KeyGenerator _generator = KeyGenerator.getInstance("AES");
////		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
////		secureRandom.setSeed(secretKey.getBytes());
////		_generator.init(DOORGOD_AES_BIT, secureRandom);
////		return _generator.generateKey();
////	}
//
//
//
//	public static void main(String[] args) {
////		String password = DOORGOD_KEY_ENCRYKEY;
////		DoorgodAESUtils aesUtils = DoorgodAESUtils.getInstance(password);
////		String content = DOOROGD_DATA_ENCRYKEY;
////		String hexMsg = HexUtils.bytesToHex(aesUtils.encode(content, password));
////		System.out.println(hexMsg);
////		byte[] decodeMsg = aesUtils.decode(HexUtils.hexToBytes(hexMsg), password);
////		System.out.println("AES 解密后为：" + new String(decodeMsg));
//
////		byte[] encodeMsg = aesUtils.encode(content, password);
////		// 1bffec376bd04c6728142e06884f9574
////		String hexMsg = HexUtils.bytesToHex(encodeMsg);
////		System.out.println("AES 加密后为：" + hexMsg);
////		byte[] decodeMsg = aesUtils.decode(HexUtils.hexToBytes(hexMsg), password);
////		System.out.println("AES 解密后为：" + new String(decodeMsg));
//
////		String msg = DoorgodAESUtils.encode("12312312312312", "14f07830ec2ee95e221ef48d0610e35935b763b427efb943cb47ffdc5197c352");
////		System.out.println("encode:"+msg);
////		String msgDecode = DoorgodAESUtils.decode(msg, "14f07830ec2ee95e221ef48d0610e35935b763b427efb943cb47ffdc5197c352");
////		System.out.println("decode:"+msgDecode);
//
////		String DOORGOD_DATA_ENCRYKEY_PREFIX = DoorgodAESUtils.decode(DOOROGD_SENSITIVE_INFO_DATA_ENCRYKEY_PREFIX, DOORGOD_KEY_ENCRYKEY);
////		String DOORGOD_DATA_ENCRYKEY_SUFFIX = DoorgodAESUtils.decode("14f07830ec2ee95e221ef48d0610e35935b763b427efb943cb47ffdc5197c352",DOORGOD_KEY_ENCRYKEY);
////		String DOORGOD_DATA_ENCRYKEY = DOORGOD_DATA_ENCRYKEY_PREFIX+DOORGOD_DATA_ENCRYKEY_SUFFIX;
////		String data = DoorgodAESUtils.encode("qw12ewrwrerqew3", DOORGOD_DATA_ENCRYKEY);
////		System.out.println(data);
////		System.out.println(DoorgodAESUtils.decode(data, DOORGOD_DATA_ENCRYKEY));
//		String DOORGOD_KEY_ENCRYKEY = "OPLte6rXr(H3t4c%";
//		System.out.println(DOORGOD_KEY_ENCRYKEY.length());
//		String keyKey = DoorgodAESUtils.encode("OPLte6rXr(H3t4c%", DOORGOD_KEY_ENCRYKEY);
//		System.out.println("keyKey="+keyKey);
//		System.out.println("keyKey="+DoorgodAESUtils.decode(keyKey, DOORGOD_KEY_ENCRYKEY));
//		String dataKeyPrefix = DoorgodAESUtils.encode("BiRw.mhv", DOORGOD_KEY_ENCRYKEY);
//		System.out.println("dataKeyPrefix="+dataKeyPrefix);
//		System.out.println("dataKeyPrefix="+DoorgodAESUtils.decode(dataKeyPrefix, DOORGOD_KEY_ENCRYKEY));
//		String dataKeySuffix = DoorgodAESUtils.encode("4Eq^E6We", DOORGOD_KEY_ENCRYKEY);
//		System.out.println("dataKeySuffix="+dataKeySuffix);
//		System.out.println("dataKeySuffix="+DoorgodAESUtils.decode(dataKeySuffix, DOORGOD_KEY_ENCRYKEY));
//		System.out.println(DoorgodAESUtils.decode("WHlI0ta/E8tOIXlSE62ciAc5yScEnlwbDjeAB+jasnpZDiNGqU", "BiRw.mhv4Eq^E6We"));
//
////		System.out.println(dataKeyPrefix+"======="+DoorgodAESUtils.decode(dataKeyPrefix, DOORGOD_KEY_ENCRYKEY));
////		System.out.println();
////		String dataKeySuffix = DoorgodAESUtils.encode("Ck~7RA9@m^ndEV4u4(Rr.+bc2kQ8$G", DOORGOD_KEY_ENCRYKEY);
////		System.out.println(dataKeySuffix+"======="+DoorgodAESUtils.decode(dataKeySuffix, DOORGOD_KEY_ENCRYKEY));
////		System.out.println();
////		System.out.println("6217002870041384056".length());
////		String crdnoData = DoorgodAESUtils.encode("6217002870041384056", "BiRw.mhv4Eq^E6WeWrOpygG_GXa#6dCk~7RA9@m^ndEV4u4(Rr.+bc2kQ8$G");
////		System.out.println(crdnoData.length());
////		String mobileData = DoorgodAESUtils.encode("13810580722", "BiRw.mhv4Eq^E6WeWrOpygG_GXa#6dCk~7RA9@m^ndEV4u4(Rr.+bc2kQ8$G");
////		System.out.println(mobileData.length());
////		String goodsinfoData = DoorgodAESUtils.encode("{\"userRegisterIdType\":\"\",\"userIp\":\"\",\"sTime\":\"2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-18 08:55:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00;2017-10-22 19:00:00\",\"flightCabin\":\"Y;Y\",\"isSameCustomer\":\"\",\"carLease\":\"\",\"flightSingle\":\"1;1\",\"carGear\":\"\",\"customerEmail\":\"null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null\",\"customerPhone\":\"null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null\",\"customerEmgContact\":\"\",\"carSeatnum\":\"\",\"sProvince\":\"\",\"firstPay\":\"\",\"sCity\":\"PVG;LHW\",\"loginTime30Often\":\"\",\"priskTerminalCode\":\"\",\"isBindMail\":\"\",\"customerIdType\":\"IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD;IDCARD\",\"registerTerminalIdentifyCode\":\"\",\"sCountry\":\"\",\"purchaseCnt7\":\"\",\"longitude\":\"\",\"registIP\":\"\",\"isVerified\":\"\",\"resultSwitch\":\"doorgod\",\"customerIdNo\":\"310111195802121657;310104197004122036;310225197709222819;310106196805032418;310102197611031213;310107196110063257;310109198207232012;05500473;310111195512261619;31010619580618403X;310109196611144015;310104197407262420;310101196109293671;310111195802121657;310104197004122036;310225197709222819;310106196805032418;310102197611031213;310107196110063257;310109198207232012;05500473;310111195512261619;31010619580618403X;310109196611144015;310104197407262420;310101196109293671\",\"bizcatName\":\"商旅\",\"registAuthMode\":\"\",\"terminalType\":\"\",\"eTime\":\"2017-10-18 12:15:00;2017-10-22 21:45:00\",\"flightPnr\":\"MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW;MX9EEW\",\"goodsNum\":\"\",\"isBindMobile\":\"\",\"purchaseBiggestAmt\":\"\",\"contactName\":\"匿名先生\",\"isMember\":\"2\",\"latitude\":\"\",\"isBindBankCard\":\"\",\"predeterminePhone\":\"18916821158\",\"goodsName\":\"\",\"customerNation\":\"\",\"contactAddress\":\"\",\"eCountry\":\"\",\"isAudit\":\"\",\"customerGender\":\"\",\"carDisplacement\":\"\",\"initMode\":\"VOS\",\"merchantRetCode\":\"0000\",\"bizcatCode\":\"032\",\"flightInterval\":\"19\",\"firstTradeTime\":\"\",\"purchaseAveAMT\":\"\",\"carType\":\"\",\"tradeSource\":\"2GEPOS\",\"eCity\":\"LHW;SHA\",\"loginDuration30Ave\":\"\",\"flightNo\":\"HO1027;HO1060\",\"registerLongitude\":\"\",\"registName\":\"\",\"customerName\":\"毕志翔;耿芥;郭卫峰;蒋伟强;瞿浏伟;徐光庆;叶晨;游腾达;张建伟;章学农;詹红卫;周璟;周文武;毕志翔;耿芥;郭卫峰;蒋伟强;瞿浏伟;徐光庆;叶晨;游腾达;张建伟;章学农;詹红卫;周璟;周文武\",\"contactPhone\":\"18916821158\",\"isUploadPhoto\":\"\",\"subBizcatName\":\"航空公司\",\"customerType\":\"00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00;00\",\"userRegisterIdNo\":\"\",\"goodsPersonNum\":\"\",\"carBrand\":\"\",\"purchaseCnt30\":\"\",\"subBizcatCode\":\"032006\",\"carSeries\":\"\",\"purchaseAmt30\":\"\",\"source\":\"\",\"registerLatitude\":\"\",\"userRegisterMobile\":\"\",\"customerEmgContactNo\":\"\",\"loginCnt30Total\":\"\",\"registTime\":\"\",\"eProvince\":\"\"}"
////				, "BiRw.mhv4Eq^E6WeWrOpygG_GXa#6dCk~7RA9@m^ndEV4u4(Rr.+bc2kQ8$G");
////		System.out.println(goodsinfoData.length());
////		String reqIf = "productId=NETPAY,production=NETPAY,amount=10000.0,merchantNo=10013243998,requestId=R39703935,sequenceId=risk_r_1502344504817,occurTime=2017-08-10 13:55:04,rmSequence=3334ced4-ea0b-4bb3-bf5d-b982748d23c6, goodsCode=, merchantName=哥们网科技有限公司, salesName=许倩, salesRegion=北京, merchantLevel=B+, merchantBusiness=网络虚拟服务, bankId=ICBC, bankChannelId=, bankChannelType=B2C, merchantBindWebSite=, refer=http://pay.game2.cn/gotochannel/?postUrl=%7B%22method%22%3A%22POST%22%2C%22charset%22%3A%22gbk%22%2C%22redirect%22%3A%221%22%2C%22url%22%3A%22https%253A%252F%252Fwww.yeepay.com%252Fapp-merchant-proxy%252Fnode%22%7D&postData=%7B%22p0_Cmd%22%3A%22Buy%22%2C%22p1_MerId%22%3A%2210013243998%22%2C%22p2_Order%22%3A%22R39703935%22%2C%22p3_Amt%22%3A%2210000%22%2C%22p4_Cur%22%3A%22CNY%22%2C%22p5_Pid%22%3A%22%25BE%25C5%25D2%25F5%25BE%25F8%25D1%25A7-%255B4884%25B7%25FE%255D%25B5%25DA4884%25B7%25FE%2520%25B3%25E4%25D6%25B5%22%2C%22p6_Pcat%22%3A%22%22%2C%22p7_Pdesc%22%3A%22%25B3%25E4%25D6%25B5%22%2C%22p8_Url%22%3A%22http%253A%252F%252Fapi.pay.game2.cn%252Fpaygateway%252Fop%252FtoReturn%252Fpayment%252Fyeepay%252F%22%2C%22p9_SAF%22%3A%220%22%2C%22pa_MP%22%3A%22wutiejun9%22%2C%22pd_FrpId%22%3A%22ICBC-NET-B2C%22%2C%22pr_NeedResponse%22%3A%221%22%2C%22hmac%22%3A%22f0cf138a6b7bd0037ba98a1a507f7b1e%22%7D&sign=5c322a0dbb24e88bab8c2dd9811d92fb&, merchantIp=49.114.78.163, merchantIpArea=新疆, userIp=, userIpArea=null, serverId=sjsa-yptxp02, sessionId=9123E6D219899AE806D95BAD7F088D5F.node1, mac=, cookies=null";
////		System.out.println("=="+reqIf.length());
////		String reqifData = DoorgodAESUtils.encode(reqIf
////				, "BiRw.mhv4Eq^E6WeWrOpygG_GXa#6dCk~7RA9@m^ndEV4u4(Rr.+bc2kQ8$G");
////		System.out.println(reqifData.length());
////
////		String idnoData = DoorgodAESUtils.decode("8f5302ef9846af1724a9f67250357392", "BiRw.mhv4Eq^E6WeWrOpygG_GXa#6dCk~7RA9@m^ndEV4u4(Rr.+bc2kQ8$G");
////		System.out.println(idnoData);
//	}
//
//}
