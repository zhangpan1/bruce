package com.zhang.bruce.risk.xml;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.StringJoiner;

/**
 * 回执信息
 *
 * @author lijunhao
 * @date 2021/12/27 10:09 上午
 */
public class ReceiptInfo {

    /**
     * 错误定位
     */
    private String position;

    /**
     * 原因
     */
    private String reason;


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    public List<String> getPositionNodes() {
        if (StringUtils.isBlank(position)) {
            return Lists.newArrayList();
        }
        List<String> list = Lists.newArrayList();
        String[] split = StringUtils.split(position, "/");
        for (String s : split) {
            int start = StringUtils.indexOf(s, "[");
            list.add(StringUtils.substring(s, 0, start == -1 ? s.length() : start));
        }
        return list;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", ReceiptInfo.class.getSimpleName() + "[", "]")
                .add("position='" + position + "'")
                .add("reason='" + reason + "'")
                .toString();
    }
}
/**
 * <result column="id" property="id"/>
 *         <result column="req_id" property="requestid"/>
 *         <result column="seq_id" property="sequenceid"/>
 *         <result column="RID" property="riskId"/>
 *         <result column="prod" property="productId"/>
 *         <result column="biz" property="production"/>
 *         <result column="use_tool" property="usetool"/>
 *         <result column="bnk_id" property="bankid"/>
 *         <result column="cRd_no" property="bankcardno"/>
 *         <result column="crd_area" property="bankcardarea"/>
 *         <result column="crd_typ" property="bankcardtype"/>
 *         <result column="amt" property="amount"/>
 *         <result column="mobile" property="mobile"/>
 *         <result column="mobile_area" property="mobilearea"/>
 *         <result column="usr_id" property="userid"/>
 *         <result column="pay_id" property="paymentid"/>
 *         <result column="meC_no" property="merchantno"/>
 *         <result column="usr_ip" property="userip"/>
 *         <result column="usr_ip_area" property="useriparea"/>
 *         <result column="ct_tm" jdbcType="TIMESTAMP" property="createtime"/>
 *         <result column="occ_tm" jdbcType="TIMESTAMP" property="occurTime"/>
 *         <result column="tools_if" property="toolsinfo"/>
 *         <result column="GOODS_IF" property="goodsinfo"/>
 *         <result column="req_if" property="requestinfo"/>
 *         <result column="rts_retdesc" property="tradelimitResult"/>
 *         <result column="rts_tm" property="tradelimitTime"/>
 *         <result column="rlsb_retdesc" property="blackResult"/>
 *         <result column="rlsb_tm" property="blackTime"/>
 *         <result column="rlsw_tm" property="whiteTime"/>
 *         <result column="rlsw_retdesc" property="whiteResult"/>
 *         <!-- <result column="yeerule_score" property="yeeruleScore" /> -->
 *         <result column="rds_tm" property="yeeruleTime"/>
 *         <result column="rds_retdesc" property="yeeruleResult"/>
 *         <result column="rlsg_retdesc" property="grayResult"/>
 *         <result column="rlsg_tm" property="grayTime"/>
 *         <result column="rgs_retdesc" property="gruleResult"/>
 *         <result column="rgs_tm" property="gruleTime"/>
 *         <result column="doorgod_tm" property="doorgodTime"/>
 *         <result column="doorgod_retcode" property="doorgodResult"/>
 *         <result column="doorgod_retdesc" property="doorgodDesc"/>
 *         <result column="prepare_tm" property="prepareTime"/>
 *         <result column="chk_tm" property="checkTime"/>
 *         <result column="rk_ip" property="riskIp"/>
 *         <result column="sub_sys" property="subSystem"/>
 *         <result column="mf_tm" property="modifyTime"/>
 *         <result column="chk_retdesc" property="checkResult"/>
 *         <result column="prepare_retdesc" property="prepareResult"/>
 *         <result column="first_pay" property="firstPay"/>
 *         <result column="GOODS_NM" property="goodsName"/>
 *         <result column="SUB_PROD_ID" property="subProductId"/>
 *         <result column="RBS_RETDESC" property="bSResult"/>
 *         <result column="RBS_TM" property="bSTime"/>
 *         <result column="RET_Switch" property="resultSwitch"/>
 *         <result column="RETCODE" property="retCode"/>
 *         <result column="BANGSUN_TRIGERRULE" property="bsTrigRule"/>
 *         <result column="PAYWAY" property="payWay"/>
 *         <result column="TRADE_SRC" property="tradeSource"/>
 *         <result column="PARAM_TYP" property="paramType"/>
 *         <result column="MERCHANT_RETCODE" property="merchantRetCode"/>
 *         <result column="IF_ENCRY" property="ifEncry"/>
 *
 *         <result column="PAY_RESULT" property="payresult" jdbcType="VARCHAR"/>
 *
 *         <result column="IP_COUNTRY" property="ipCountry" jdbcType="VARCHAR"/>
 *         <result column="IP_PROVINCE" property="ipProvince" jdbcType="VARCHAR"/>
 *
 *         <result column="bank_orderno" property="bankOrderNo"/>
 *         <result column="FRP_CODE" property="frpCode"/>
 *         <result column="order_type" property="orderType"/>
 *
 *         <result column="pay_tid" property="paymentid"/>
 *         <result column="rts_result" property="tradelimitResult"/>
 *         <result column="wl_tm" property="whiteTime"/>
 *         <result column="wl_result" property="whiteResult"/>
 *         <result column="rds_result" property="yeeruleResult"/>
 *         <result column="doorgod_result" property="doorgodResult"/>
 *         <result column="pay_tm" property="paytime"/>
 *         <result column="pay_cd" property="paycode"/>
 *         <result column="SYN_CON_TM" property="synConsumeTime"/>
 *         <result column="SYN_ERR_CD" property="synErrorCode"/>
 *         <result column="BIZORDER" property="bizOrder"/>
 *         <result column="bank_seq" property="bankSeq"/>
 *
 *         <result column="PRE_PHONE" property="prePhone"/>
 *         <result column="CONTACT_PHONE" property="contactPhone"/>
 *         <result column="agency_no" property="agencyNo"/>
 *         <result column="PASSENGER_PHONE" property="passengerPhone"/>
 *         <result column="CUSTOMERIDNO" property="customerIdNo"/>
 *         <result column="RBS_RETDESC" property="rbsRetdesc"/>
 *         <result column="idNo" property="idNo"/>
 *
 *         <result column="TARGET_MERCHANT_NO" property="targetMerchantNo"/>
 *         <result column="REQUEST_MERCHANT_NO" property="requestMerchantNo"/>
 *         <result column="USER_TYPE" property="userType"/>
 *         <result column="TARGET_USER_TYPE" property="targetUserType"/>
 *         <result column="ID_NO_DIGEST" property="idNoDigest"/>
 *         <result column="CRD_NO_DIGEST" property="bankcardNoDigest"/>
 *         <result column="MOBILE_DIGEST" property="mobileDigest"/>
 */
