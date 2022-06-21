//package com.zhang.bruce.risktest.utils;
//
//
//import com.alibaba.fastjson.JSON;
//
//import java.util.*;
//
///**
// * 门神开关工具类
// * @author songwenbin
// *
// */
//public final class DoorgodSwitchUtil {
////	private static final Logger logger = LogUtil.getLogger(DoorgodSwitchUtil.class);
//
//	private static String dataEncryKey = "";
//
////	/**
////	 * 是否切换到新的限额优化
////	 * 	true：用新的限额实现
////	 * 	false：用旧的限额实现
////	 * @return
////	 */
////	@SuppressWarnings("unchecked")
////	public static boolean isTradelimitOptimize(){
////		String isSwitch = "0";
////		try{
////			ConfigParam<String> configParam = (ConfigParam<String>) ConfigurationUtils.getSysConfigParam(RcConstants.DOORGOD_TRADELIMIT_OPTIMIZE);
////			isSwitch = configParam.getValue();
////		}catch(Exception ex){
////			logger.error("", ex);
////			isSwitch = "0";
////		}
////		return "1".equals(isSwitch);
////	}
////
////	/**
////	 * 是否用主流水表
////	 * @return
////	 */
////	@SuppressWarnings("unchecked")
////	public static boolean isUseMainSync(){
////		String isSwitch = "1";
////		try{
////			ConfigParam<String> configParam = (ConfigParam<String>) ConfigurationUtils.getSysConfigParam(DoorgodStandardConstants.DOORGOD_REQINFO_BACKUP_SWITCH);
////			isSwitch = configParam.getValue();
////		}catch(Exception ex){
////			logger.error("", ex);
////			isSwitch = "1";
////		}
////		return "1".equals(isSwitch);
////	}
//
//	@SuppressWarnings("unchecked")
//	public static List<String> getSensitivePropList(){
//		List<String> result = new ArrayList<String>();
////		try{
////			ConfigParam<List<String>> configParam = (ConfigParam<List<String>>) ConfigurationUtils.getSysConfigParam(DoorgodStandardConstants.DOORGOD_SENSITIVE_INFO_PROPLIST );
////			result = configParam.getValue();
////		}catch(Exception ex){
////			logger.error("", ex);
////		}
//		if(result == null||result.size()==0){
//			result = new ArrayList<String>();
//			result.add("bankCardName");
//			result.add("bankCardNo");
//			result.add("idNo");
//			result.add("userPhone");
//			result.add("goodsName");
//			result.add("RecevierMobileNo");
//			result.add("RecevierName");
//			result.add("RecevierAddress");
//			result.add("Shop_Phone");
//			result.add("transPhone");
//			result.add("email");
//			result.add("accountName");
//			result.add("recevierIdNo");
//			result.add("recevierTelNo");
//			result.add("recevierMail");
//			result.add("recevierMobileNo");
//			result.add("registMail");
//			result.add("examName");
//			result.add("examIdNo");
//			result.add("examPhone");
//			result.add("merchantAddress");
//			result.add("registeredAddress");
//			result.add("legalName");
//			result.add("legalIdNo");
//			result.add("accountNo");
//			result.add("userRegisterMobile");
//			result.add("userRegisterCardNo");
//			result.add("userRegisterIdNo");
//			result.add("recevierName");
//			result.add("recevierAddress");
//			result.add("shopPhone");
//			result.add("userName");
//			result.add("backupContactName");
//			result.add("backupContackMobile");
//			result.add("passengerCardNum");
//			result.add("cardHolder");
//			result.add("predeterminePhone");
//			result.add("contactName");
//			result.add("memberName");
//			result.add("memberIDNo");
//			result.add("memberPhone");
//			result.add("personIDNo");
//			result.add("person05EmgContact");
//			result.add("person05EmgContactNo");
//			result.add("personPhone");
//			result.add("personName");
//			result.add("personEmail");
//			result.add("memberBalanceCard");
//			result.add("memberBalanceName");
//			result.add("person05EnglishName");
//			result.add("person03Passport");
//			result.add("contactPhone");
//			result.add("contactAddress");
//			result.add("contactMail");
//			result.add("registName");
//			result.add("customerName");
//			result.add("customerIdNo");
//			result.add("customerEmail");
//			result.add("customerPhone");
//			result.add("customerEmgContact");
//			result.add("customerEmgContactNo");
//			result.add("Goods_Name");
//			result.add("BANKCARDNO");
//			result.add("bankcardno");
//			result.add("Goods_Name");
//			result.add("rechargeProvCity");
//			result.add("shopName");
//			result.add("personMail");
//			result.add("Email");
//			result.add("idcrdNo");
//			result.add("passengerCrdNum");
//			result.add("IDNO");
//			result.add("passengerMp");
//			result.add("usrMp");
//			result.add("contcatMp");
//			result.add("preMp");
//			result.add("telPhoneNo");
//			result.add("USERPHONE");
//			result.add("Trans_Phone");
//			result.add("linePhoneBl");
//			result.add("userPhoneBl");
//			result.add("idNoBl");
//			result.add("bankCardNoBl");
//			result.add("bankNo");
//			result.add("mobileNo");
//			result.add("docCode");
//			result.add("legDocCode");
//			result.add("contPhone");
//			result.add("cusEmail");
//			result.add("outServiceCardCode");
//			result.add("outServiceLegCardCode");
//			result.add("recBankNo");
//			result.add("payeeMail");
//			result.add("passengerPhone");
//			result.add("payToPhone");
//			result.add("personIdNo");
//			result.add("telPhone");
//			result.add("idCard");
//		}
//		return result;
//	}
//
////	/**
////	 * 从统一配置中获取密钥后半部分
////	 * @return
////	 */
////	@SuppressWarnings("unchecked")
////	public static String getDataEncrykeySuffix(){
////		String encrykeySuffix = "";
////		try{
////			ConfigParam<String> configParam = (ConfigParam<String>) ConfigurationUtils.getSysConfigParam(DoorgodStandardConstants.DOOROGD_SENSITIVE_INFO_DATA_ENCRYKEY_SUFFIX);
////			encrykeySuffix = configParam.getValue();
////		}catch(Exception ex){
////			logger.error("", ex);
////			encrykeySuffix = "";
////		}
////		return encrykeySuffix;
////	}
//
//	/**
//	 * 获取数据加密的key
//	 * @return
//	 */
//	public static String getDataEncryKey(){
//		if(StringUtils.isBlank(dataEncryKey)){
//			String dataEncryKeySuffix = com.yeepay.util.DoorgodAESUtils.decode(com.yeepay.util.DoorgodAESUtils.DOOROGD_SENSITIVE_INFO_DATA_ENCRYKEY_SUFFIX , com.yeepay.util.DoorgodAESUtils.DOORGOD_KEY_ENCRYKEY);
//			String dataEncryKeyPrefix = com.yeepay.util.DoorgodAESUtils.decode(com.yeepay.util.DoorgodAESUtils.DOOROGD_SENSITIVE_INFO_DATA_ENCRYKEY_PREFIX, com.yeepay.util.DoorgodAESUtils.DOORGOD_KEY_ENCRYKEY);
//			dataEncryKey = dataEncryKeyPrefix+dataEncryKeySuffix;
//		}
//		return dataEncryKey;
//	}
//
//	/**
//	 * 对map进行解密
//	 * @param params
//	 * @return
//	 */
//	public static Map<String,Object> decodeMap(Map<String,Object> params){
//		List<String> sensitivePropList = getSensitivePropList();
//		if(params !=null && params.size()>0){
//			Set<String> keySet = params.keySet();
//			Iterator<String> keyIter = keySet.iterator();
//			while(keyIter.hasNext()){
//				String key = keyIter.next();
//				if(sensitivePropList.contains(key)){
//					//敏感信息
//					Object value = params.get(key);
//					if(value != null && value instanceof String){
//						String valueString = (String)value;
//						params.put(key, com.yeepay.util.DoorgodAESUtils.decode(valueString, getDataEncryKey()));
//					}
//				}
//			}
//		}
//		return params;
//	}
//
//	/**
//	 * 对goods_if字段中的敏感信息解密
//	 * @param params
//	 * @return
//	 */
//	public static String decodeGoodsinfo(Map<String,Object> params){
//		Map<String,Object> goodsinfoMap = decodeMap(params);
//		if(goodsinfoMap == null || goodsinfoMap.size()==0){
//			return "";
//		}
//		return JSON.toJSONString(goodsinfoMap);
//	}
//
//	/**
//	 * 对req_if字段中的敏感信息解密
//	 * @param params
//	 * @return
//	 */
//	public static String decodeReqinfo(Map<String,Object> params){
//		Map<String,Object> reqinfoMap = decodeMap(params);
//		if(reqinfoMap == null || reqinfoMap.size()==0){
//			return "";
//		}
//		StringBuilder reqinfoBuilder = new StringBuilder();
//		Set<String> keySet = params.keySet();
//		Iterator<String> keyIter = keySet.iterator();
//		while(keyIter.hasNext()){
//			String key = keyIter.next();
//			Object value = params.get(key);
//			reqinfoBuilder.append(key+"="+value+",");
//		}
//		String result = reqinfoBuilder.toString();
//		if(result.length()>0){
//			result = result.substring(0, result.length()-1);
//		}
//		return result;
//	}
//
//	/**
//	 * 对map进行加密
//	 * @param params
//	 * @return
//	 */
//	private static Map<String,Object> encodeMap(Map<String,Object> params){
//		List<String> sensitivePropList = getSensitivePropList();
//		if(params !=null && params.size()>0){
//			Set<String> keySet = params.keySet();
//			Iterator<String> keyIter = keySet.iterator();
//			while(keyIter.hasNext()){
//				String key = keyIter.next();
//				if(sensitivePropList.contains(key)){
//					//敏感信息
//					Object value = params.get(key);
//					if(value != null && value instanceof String){
//						String valueString = (String)value;
//						params.put(key, com.yeepay.util.DoorgodAESUtils.encode(valueString, getDataEncryKey()));
//					}
//				}
//			}
//		}
//		return params;
//	}
//	/**
//	 * 对单个字段进行解密
//	 * @param parmas
//	 * @return
//	 */
//	public static String decode(String parmas){
//		String result ="";
//		result= com.yeepay.util.DoorgodAESUtils.decode(parmas, getDataEncryKey());
//		return result;
//	}
//	/**
//	 * 对goods_if字段中的敏感信息加密
//	 * @param params
//	 * @return
//	 */
//	public static String encodeGoodsinfo(Map<String,Object> params){
//		Map<String,Object> goodsinfoMap = encodeMap(params);
//		if(goodsinfoMap == null || goodsinfoMap.size()==0){
//			return "";
//		}
//		return JSON.toJSONString(goodsinfoMap);
//	}
//
//	/**
//	 * 对req_if字段中的敏感信息加密
//	 * @param params
//	 * @return
//	 */
//	public static String encodeReqinfo(Map<String,Object> params){
//		Map<String,Object> reqinfoMap = encodeMap(params);
//		if(reqinfoMap == null || reqinfoMap.size()==0){
//			return "";
//		}
//		StringBuilder reqinfoBuilder = new StringBuilder();
//		Set<String> keySet = params.keySet();
//		Iterator<String> keyIter = keySet.iterator();
//		while(keyIter.hasNext()){
//			String key = keyIter.next();
//			Object value = params.get(key);
//			reqinfoBuilder.append(key+"="+value+",");
//		}
//		String result = reqinfoBuilder.toString();
//		if(result.length()>0){
//			result = result.substring(0, result.length()-1);
//		}
//		return result;
//	}
//	public static void main(String[] args) {
//		String str = "userIp=119.161.147.101,bizOrder=,rmSequence=b1fe5522-1e68-4650-9ac7-072a24efabb8,bankAccountNoArea=,virtualTerminalId=,production=YJZF,bankCardNo=2b12d6adc3ceacdffed03a1336cca5a7,userType=,terminalIdentifyCode=,amount=0.01,idnoArea=,firstPay=,merchantUserIpArea=,refer=,authLevel=,bindCardId=,merchantIp=,userId=10001,userPhone=7ee06f12927b1b04f38e385c81e25575,mobileArea=,idNo=4dedb7da97da4cbf2f06bbd8cd0838d0,orderType=,terminalType=,subProductId=,goodsCode=10,companyName=,useChannel=,shopman=,sessionId=,merchantBindWebSite=,merchantIpArea=,merchantNo=10040008099,sequenceId=sensitiveinfo_reqsync_11,noshopman=,goodsName=4dedb7da97da4cbf2f06bbd8cd0838d0,useTool=API,idType=,industryCode=,userAgent=,paymentId=sensitiveinfo_reqsync_11,mac=,merchantUserIp=,occurTime=2017-04-18 19:50:05,bankChannelId=,merchantLevel=,userIpArea=,serverId=,bankCardType=CREDIT,requestId=sensitiveinfo_reqsync_11,productId=NOCARDPAY,bankId=ICBC,bankCardName=4dedb7da97da4cbf2f06bbd8cd0838d0";
////		Map<String,Object> goodsInfo = new HashMap<String, Object>();
////		JSONObject json = (JSONObject) JSON.parse(str);
////		json.remove("personList");
////		Map<String,String> terminalMap = new HashMap<String, String>();
////		if(json.get("terminalinfo")!=null){
////			terminalMap=(Map<String, String>) JSON.parse(json.get("terminalinfo").toString());
////		}
////		goodsInfo = (Map<String, Object>) JSON.parse(json.toJSONString());
////		goodsInfo.putAll(terminalMap);
////	  System.out.println(ReqinfoParseUtils.reqinfoParse(str).get("idNo"));
////	  System.out.println(DoorgodAESUtils.encode("null",  getDataEncryKey()));
//		System.out.println(new String("WHlI0ta/E8tOIXlSE62ciAc5yScEnlwbDjeAB+jasnpZDiNGqU").length());
//	  System.out.println(com.yeepay.util.DoorgodAESUtils.decode("WHlI0ta/E8tOIXlSE62ciAc5yScEnlwbDjeAB+jasnpZDiNGqU", getDataEncryKey()));
////	   System.out.println( decodeReqinfo(ReqinfoParseUtils.reqinfoParse(str)));
//	}
//}
//
