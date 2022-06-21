//package com.zhang.bruce.risktest.utils;
//
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//import net.sf.json.xml.XMLSerializer;
//import org.apache.commons.lang.StringUtils;
//import org.apache.log4j.Logger;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
//public class JsonXmlUtil {
//	private static final Logger log = Logger.getLogger(JsonXmlUtil.class);
//
//	public static boolean isRightSingleRule(JSONObject ruleJson){
//		if(ruleJson.containsKey("inFieldName")&&ruleJson.containsKey("inType")&&ruleJson.containsKey("outFieldName")){
//			String inFieldName = ruleJson.getString("inFieldName");
//			String inType = ruleJson.getString("inType");
//			String outFieldName= ruleJson.getString("outFieldName");
//			if(StringUtils.isNotBlank(inFieldName)&&StringUtils.isNotBlank(outFieldName)&&("json".equalsIgnoreCase(inType)||"req".equalsIgnoreCase(inType))){
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public static boolean isRightRule(String ruleJsonString){
//		try{
//			JSONArray jsonArray = JSONArray.fromObject(ruleJsonString);
//			for(int i = 0;i < jsonArray.size();i++){
//				JSONObject jsonRule = jsonArray.getJSONObject(i);
//				boolean flag = isRightSingleRule(jsonRule);
//				//如果有一个规则正确则该规则可以使用
//				if(flag){
//					return flag;
//				}
//			}
//		}catch(Exception e){
//			log.error("规则解析出错");
//			return false;
//		}
//
//		return false;
//	}
//
//	public static Map<String, JSONObject> analysisRule(String ruleJsonString){
//		Map<String, JSONObject> resultMap = new HashMap<String, JSONObject>();
//		try{
//			JSONArray jsonArray = JSONArray.fromObject(ruleJsonString);
//			for(int i = 0;i < jsonArray.size();i++){
//				JSONObject jsonRule = jsonArray.getJSONObject(i);
//				if(isRightSingleRule(jsonRule)){
//					resultMap.put(jsonRule.getString("inFieldName"), jsonRule);
//				}
//			}
//		}catch(Exception e){
//			log.error("规则解析出错");
//		}
//
//		return resultMap;
//	}
//
//
//	public static String jsonToXML(String json) {
//		XMLSerializer xmlSerializer = new XMLSerializer();
//        // 根节点名称
//        xmlSerializer.setRootName("xml");
//        // 不对类型进行设置
//        xmlSerializer.setTypeHintsEnabled(false);
//        xmlSerializer.setRootName("root");
//        xmlSerializer.setElementName("el");
//		if(null == json||json.isEmpty()||"null".equalsIgnoreCase(json)){
//			JSONObject obj = new JSONObject();
//			return xmlSerializer.write(obj);
//		}
//        String xmlStr = "";
//        if (json.substring(0, 1).contains("[") && json.substring(json.length()-1, json.length()).contains("]")) {
//            // jsonArray
//            JSONArray jobj = JSONArray.fromObject(json);
//            xmlStr = xmlSerializer.write(jobj);
//        } else {
//            // jsonObject
//            JSONObject jobj = JSONObject.fromObject(json);
//            xmlStr = xmlSerializer.write(jobj);
//        }
//        return xmlStr;
//    }
//
//	public static String reqIftoXML(String reqIf){
////		if(Strings.isNullOrEmpty(reqIf)||"null".equalsIgnoreCase(reqIf)){
////			return "";
////		}
////		String[] reqIfArray = reqIf.split(",");
////		JSONObject json = new JSONObject();
////		if (null != reqIfArray){
////		    for(String ri:reqIfArray){
////		        String[] splitArr = ri.split("=");
////		        String key = splitArr[0];
////		        String value = "";
////		        if (splitArr.length > 1)
////		            value = splitArr[1];
////
////		        json.put(key.trim(), value.trim());
////		    }
////		}
//		Map<String,Object> resultMap = reqinfoParse(reqIf);
//		JSONObject jsonObject = JSONObject.fromObject(resultMap);
//		return jsonToXML(jsonObject.toString());
//	}
//
//	public static Map<String, Object> reqinfoParse(String reqInfo) {
//		Map<String, Object> result = new HashMap<String, Object>();
//		if (null == reqInfo||reqInfo.isEmpty()||"null".equalsIgnoreCase(reqInfo)) {
//			return result;
//		}
//		reqInfo = filterJsonFromReqInfo(reqInfo, "goodsInfo=");
//		reqInfo = filterJsonFromReqInfo(reqInfo, "toolsInfo=");
//		String[] reqInfoArray = reqInfo.split(",");
//		if(reqInfoArray!=null&&reqInfoArray.length>0){
//			for(String req : reqInfoArray){
//				String[] reqFactorArray = new String[2];
//				if(null != req&&!req.isEmpty()){
//					if(req.indexOf("=")>0){
//					String str1 = req.substring(0,req.indexOf("="));
//					String str2 = req.substring(req.indexOf("=")+1,req.length());
//					reqFactorArray[0]=str1;
//					reqFactorArray[1]=str2;
//					if(reqFactorArray!=null && reqFactorArray.length>0){
//						if(reqFactorArray.length==2){
//							result.put(reqFactorArray[0].trim(), reqFactorArray[1].trim());
//						}else{
//							result.put(reqFactorArray[0].trim(), "");
//						}
//					}
//					}
//				}
//			}
//		}
//		return result;
//	}
//
//	/**
//	 *
//	 * @param reqInfo
//	 *            直传属性
//	 * @param jsonKey
//	 *            需要过滤的json的key ",goodsInfo="
//	 * @return
//	 */
//	private static String filterJsonFromReqInfo(String reqInfo, String jsonKey) {
//		String result = "";
//		int goodsinfoIdx = reqInfo.indexOf(jsonKey);
//		if (goodsinfoIdx > 0) {
//			String goodsInfoPrefix = reqInfo.substring(0, goodsinfoIdx);
//			String goodsInfoSuffix = reqInfo.substring(goodsinfoIdx
//					+ jsonKey.length());
//			if (goodsInfoSuffix.length() > 0) {
//				if ("{".equals(goodsInfoSuffix.substring(0, 1))) {
//					goodsInfoSuffix = goodsInfoSuffix.substring(1);
//					int goodsinfoEndIdx = goodsInfoSuffix.indexOf("}");
//					if (goodsinfoEndIdx >= 0) {
//						goodsInfoSuffix = goodsInfoSuffix
//								.substring(goodsinfoEndIdx + 1);
//						result = goodsInfoPrefix + goodsInfoSuffix;
//					} else {
//						// 不需要过滤
//						result = reqInfo;
//					}
//				} else {
//					// 不需要过滤
//					result = reqInfo;
//				}
//			} else {
//				// 不需要过滤
//				result = reqInfo;
//			}
//		} else {
//			// 不需要过滤
//			result = reqInfo;
//		}
//		return result;
//	}
//
//
//	public static void main(String args[]){
//		String reqif = "userIp=223.87.42.28,bizOrder=411807296227109026,rmSequence=d85b2ef1-56cd-4ab5-ad18-55ea35804a39,bankAccountNoArea=,virtualTerminalId=YJZF-WAP-USUAL,production=YJZF,authResult=,synErrorCode=,bankCardNo=3olgKVH3AIKvUqti/gFpTtwJUph54yirT6sRTU0c1Sg=,userType=MERCHANT,terminalIdentifyCode=,amount=0.75,idnoArea=,firstPay=,merchantUserIpArea=,bankSeq=521807291720034368078,refer=,authLevel=,bindCardId=,merchantIp=,bankError=00,userId=501480163318,userPhone=tUi2rZgCgqM+G0PzHiBCdg==,mobileArea=,idNo=2WSqOol9qOleDOSIPWQK/vPjmsf0FDCTbPHUrfbIyVo=,orderType=SALE,terminalType=,subProductId=,goodsCode=7995,companyName=北京博乐互动科技有限公司,useChannel=,shopman=,sessionId=,merchantBindWebSite=,merchantIpArea=,noshopman=,merchantNo=10018042662,sequenceId=23982787641782693,goodsName=SnidVSyilWmXbOgFhjVxyw==,useTool=NCCASHIER,idType=IDCARD,industryCode=7993,userAgent=,paymentId=101807296238541023,tradeResult=1,mac=,merchantUserIp=,occurTime=2018-07-29 17:19:45,bankChannelId=XM_UNIONPAY_FASTPAY_BM8016,merchantLevel=,userIpArea=,bankMsg=成功[0000000],serverId=nc-pay-hessian-3548613386-m9754,bankCardType=CREDIT,bankOrderNo=20180729172004705991431504,requestId=3180729171751459299,tradeError=,frpCode=XM_UNIONPAY_FASTPAY_BM8016,bankId=CCB,productId=NOCARDPAY,isSendSms=true,smsSendType=YEEPAY,bankCardName=gP2geDG6pxw1R8NsgFQhUA==,completeTime=2018-07-29 17:20:05,synConsumeTime=,tradeMsg=";
//		//String rule = "[{\"inFieldName\":\"GOODS_IF\",\"inType\":\"json\",\"outFieldName\":\"GOODS_IF_XML\"},{\"inFieldName\":\"REQ_IF\",\"inType\":\"req\",\"outFieldName\":\"REQ_IF_XML\"}]";
////		if(isRightRule(rule)){
////			System.out.println(true);
////		}else{
////			System.out.println(false);
////		}
//
//		String reqString = reqIftoXML(reqif);
//		System.out.print(reqString);
//	}
//
//
//}
