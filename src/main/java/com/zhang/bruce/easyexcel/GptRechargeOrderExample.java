package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GptRechargeOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GptRechargeOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 充值交易订单表
     *
     * @author wcyong
     *
     * @date 2023-01-18
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNull() {
            addCriterion("business_code is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNotNull() {
            addCriterion("business_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeEqualTo(String value) {
            addCriterion("business_code =", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotEqualTo(String value) {
            addCriterion("business_code <>", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThan(String value) {
            addCriterion("business_code >", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("business_code >=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThan(String value) {
            addCriterion("business_code <", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThanOrEqualTo(String value) {
            addCriterion("business_code <=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLike(String value) {
            addCriterion("business_code like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotLike(String value) {
            addCriterion("business_code not like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIn(List<String> values) {
            addCriterion("business_code in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotIn(List<String> values) {
            addCriterion("business_code not in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeBetween(String value1, String value2) {
            addCriterion("business_code between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotBetween(String value1, String value2) {
            addCriterion("business_code not between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andSequenceIdIsNull() {
            addCriterion("sequence_id is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIdIsNotNull() {
            addCriterion("sequence_id is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceIdEqualTo(String value) {
            addCriterion("sequence_id =", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotEqualTo(String value) {
            addCriterion("sequence_id <>", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdGreaterThan(String value) {
            addCriterion("sequence_id >", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("sequence_id >=", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdLessThan(String value) {
            addCriterion("sequence_id <", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdLessThanOrEqualTo(String value) {
            addCriterion("sequence_id <=", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdLike(String value) {
            addCriterion("sequence_id like", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotLike(String value) {
            addCriterion("sequence_id not like", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdIn(List<String> values) {
            addCriterion("sequence_id in", values, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotIn(List<String> values) {
            addCriterion("sequence_id not in", values, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdBetween(String value1, String value2) {
            addCriterion("sequence_id between", value1, value2, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotBetween(String value1, String value2) {
            addCriterion("sequence_id not between", value1, value2, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNull() {
            addCriterion("request_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("request_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(String value) {
            addCriterion("request_id =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(String value) {
            addCriterion("request_id <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(String value) {
            addCriterion("request_id >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("request_id >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(String value) {
            addCriterion("request_id <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(String value) {
            addCriterion("request_id <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLike(String value) {
            addCriterion("request_id like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotLike(String value) {
            addCriterion("request_id not like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<String> values) {
            addCriterion("request_id in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<String> values) {
            addCriterion("request_id not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(String value1, String value2) {
            addCriterion("request_id between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(String value1, String value2) {
            addCriterion("request_id not between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("merchant_no =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("merchant_no <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("merchant_no >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_no >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("merchant_no <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_no <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("merchant_no like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("merchant_no not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("merchant_no in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("merchant_no not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("merchant_no between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("merchant_no not between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andSignNameIsNull() {
            addCriterion("sign_name is null");
            return (Criteria) this;
        }

        public Criteria andSignNameIsNotNull() {
            addCriterion("sign_name is not null");
            return (Criteria) this;
        }

        public Criteria andSignNameEqualTo(String value) {
            addCriterion("sign_name =", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotEqualTo(String value) {
            addCriterion("sign_name <>", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameGreaterThan(String value) {
            addCriterion("sign_name >", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameGreaterThanOrEqualTo(String value) {
            addCriterion("sign_name >=", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLessThan(String value) {
            addCriterion("sign_name <", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLessThanOrEqualTo(String value) {
            addCriterion("sign_name <=", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLike(String value) {
            addCriterion("sign_name like", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotLike(String value) {
            addCriterion("sign_name not like", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameIn(List<String> values) {
            addCriterion("sign_name in", values, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotIn(List<String> values) {
            addCriterion("sign_name not in", values, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameBetween(String value1, String value2) {
            addCriterion("sign_name between", value1, value2, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotBetween(String value1, String value2) {
            addCriterion("sign_name not between", value1, value2, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameEnIsNull() {
            addCriterion("sign_name_en is null");
            return (Criteria) this;
        }

        public Criteria andSignNameEnIsNotNull() {
            addCriterion("sign_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andSignNameEnEqualTo(String value) {
            addCriterion("sign_name_en =", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnNotEqualTo(String value) {
            addCriterion("sign_name_en <>", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnGreaterThan(String value) {
            addCriterion("sign_name_en >", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("sign_name_en >=", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnLessThan(String value) {
            addCriterion("sign_name_en <", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnLessThanOrEqualTo(String value) {
            addCriterion("sign_name_en <=", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnLike(String value) {
            addCriterion("sign_name_en like", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnNotLike(String value) {
            addCriterion("sign_name_en not like", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnIn(List<String> values) {
            addCriterion("sign_name_en in", values, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnNotIn(List<String> values) {
            addCriterion("sign_name_en not in", values, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnBetween(String value1, String value2) {
            addCriterion("sign_name_en between", value1, value2, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnNotBetween(String value1, String value2) {
            addCriterion("sign_name_en not between", value1, value2, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNull() {
            addCriterion("recharge_type is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNotNull() {
            addCriterion("recharge_type is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeEqualTo(String value) {
            addCriterion("recharge_type =", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotEqualTo(String value) {
            addCriterion("recharge_type <>", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThan(String value) {
            addCriterion("recharge_type >", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_type >=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThan(String value) {
            addCriterion("recharge_type <", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThanOrEqualTo(String value) {
            addCriterion("recharge_type <=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLike(String value) {
            addCriterion("recharge_type like", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotLike(String value) {
            addCriterion("recharge_type not like", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIn(List<String> values) {
            addCriterion("recharge_type in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotIn(List<String> values) {
            addCriterion("recharge_type not in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeBetween(String value1, String value2) {
            addCriterion("recharge_type between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotBetween(String value1, String value2) {
            addCriterion("recharge_type not between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ip_address like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ip_address not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAreaIsNull() {
            addCriterion("ip_area is null");
            return (Criteria) this;
        }

        public Criteria andIpAreaIsNotNull() {
            addCriterion("ip_area is not null");
            return (Criteria) this;
        }

        public Criteria andIpAreaEqualTo(String value) {
            addCriterion("ip_area =", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaNotEqualTo(String value) {
            addCriterion("ip_area <>", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaGreaterThan(String value) {
            addCriterion("ip_area >", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaGreaterThanOrEqualTo(String value) {
            addCriterion("ip_area >=", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaLessThan(String value) {
            addCriterion("ip_area <", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaLessThanOrEqualTo(String value) {
            addCriterion("ip_area <=", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaLike(String value) {
            addCriterion("ip_area like", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaNotLike(String value) {
            addCriterion("ip_area not like", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaIn(List<String> values) {
            addCriterion("ip_area in", values, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaNotIn(List<String> values) {
            addCriterion("ip_area not in", values, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaBetween(String value1, String value2) {
            addCriterion("ip_area between", value1, value2, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaNotBetween(String value1, String value2) {
            addCriterion("ip_area not between", value1, value2, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpProxyIsNull() {
            addCriterion("ip_proxy is null");
            return (Criteria) this;
        }

        public Criteria andIpProxyIsNotNull() {
            addCriterion("ip_proxy is not null");
            return (Criteria) this;
        }

        public Criteria andIpProxyEqualTo(String value) {
            addCriterion("ip_proxy =", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyNotEqualTo(String value) {
            addCriterion("ip_proxy <>", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyGreaterThan(String value) {
            addCriterion("ip_proxy >", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyGreaterThanOrEqualTo(String value) {
            addCriterion("ip_proxy >=", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyLessThan(String value) {
            addCriterion("ip_proxy <", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyLessThanOrEqualTo(String value) {
            addCriterion("ip_proxy <=", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyLike(String value) {
            addCriterion("ip_proxy like", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyNotLike(String value) {
            addCriterion("ip_proxy not like", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyIn(List<String> values) {
            addCriterion("ip_proxy in", values, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyNotIn(List<String> values) {
            addCriterion("ip_proxy not in", values, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyBetween(String value1, String value2) {
            addCriterion("ip_proxy between", value1, value2, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyNotBetween(String value1, String value2) {
            addCriterion("ip_proxy not between", value1, value2, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andPayerTypeIsNull() {
            addCriterion("payer_type is null");
            return (Criteria) this;
        }

        public Criteria andPayerTypeIsNotNull() {
            addCriterion("payer_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayerTypeEqualTo(String value) {
            addCriterion("payer_type =", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeNotEqualTo(String value) {
            addCriterion("payer_type <>", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeGreaterThan(String value) {
            addCriterion("payer_type >", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payer_type >=", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeLessThan(String value) {
            addCriterion("payer_type <", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeLessThanOrEqualTo(String value) {
            addCriterion("payer_type <=", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeLike(String value) {
            addCriterion("payer_type like", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeNotLike(String value) {
            addCriterion("payer_type not like", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeIn(List<String> values) {
            addCriterion("payer_type in", values, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeNotIn(List<String> values) {
            addCriterion("payer_type not in", values, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeBetween(String value1, String value2) {
            addCriterion("payer_type between", value1, value2, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeNotBetween(String value1, String value2) {
            addCriterion("payer_type not between", value1, value2, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNull() {
            addCriterion("payer_name is null");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNotNull() {
            addCriterion("payer_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayerNameEqualTo(String value) {
            addCriterion("payer_name =", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotEqualTo(String value) {
            addCriterion("payer_name <>", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThan(String value) {
            addCriterion("payer_name >", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("payer_name >=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThan(String value) {
            addCriterion("payer_name <", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThanOrEqualTo(String value) {
            addCriterion("payer_name <=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLike(String value) {
            addCriterion("payer_name like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotLike(String value) {
            addCriterion("payer_name not like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameIn(List<String> values) {
            addCriterion("payer_name in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotIn(List<String> values) {
            addCriterion("payer_name not in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameBetween(String value1, String value2) {
            addCriterion("payer_name between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotBetween(String value1, String value2) {
            addCriterion("payer_name not between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestIsNull() {
            addCriterion("payer_name_digest is null");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestIsNotNull() {
            addCriterion("payer_name_digest is not null");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestEqualTo(String value) {
            addCriterion("payer_name_digest =", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestNotEqualTo(String value) {
            addCriterion("payer_name_digest <>", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestGreaterThan(String value) {
            addCriterion("payer_name_digest >", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestGreaterThanOrEqualTo(String value) {
            addCriterion("payer_name_digest >=", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestLessThan(String value) {
            addCriterion("payer_name_digest <", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestLessThanOrEqualTo(String value) {
            addCriterion("payer_name_digest <=", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestLike(String value) {
            addCriterion("payer_name_digest like", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestNotLike(String value) {
            addCriterion("payer_name_digest not like", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestIn(List<String> values) {
            addCriterion("payer_name_digest in", values, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestNotIn(List<String> values) {
            addCriterion("payer_name_digest not in", values, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestBetween(String value1, String value2) {
            addCriterion("payer_name_digest between", value1, value2, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestNotBetween(String value1, String value2) {
            addCriterion("payer_name_digest not between", value1, value2, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdIsNull() {
            addCriterion("payer_bank_card_id is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdIsNotNull() {
            addCriterion("payer_bank_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdEqualTo(String value) {
            addCriterion("payer_bank_card_id =", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdNotEqualTo(String value) {
            addCriterion("payer_bank_card_id <>", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdGreaterThan(String value) {
            addCriterion("payer_bank_card_id >", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_card_id >=", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdLessThan(String value) {
            addCriterion("payer_bank_card_id <", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_card_id <=", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdLike(String value) {
            addCriterion("payer_bank_card_id like", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdNotLike(String value) {
            addCriterion("payer_bank_card_id not like", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdIn(List<String> values) {
            addCriterion("payer_bank_card_id in", values, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdNotIn(List<String> values) {
            addCriterion("payer_bank_card_id not in", values, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdBetween(String value1, String value2) {
            addCriterion("payer_bank_card_id between", value1, value2, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdNotBetween(String value1, String value2) {
            addCriterion("payer_bank_card_id not between", value1, value2, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestIsNull() {
            addCriterion("payer_bank_card_id_digest is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestIsNotNull() {
            addCriterion("payer_bank_card_id_digest is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestEqualTo(String value) {
            addCriterion("payer_bank_card_id_digest =", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestNotEqualTo(String value) {
            addCriterion("payer_bank_card_id_digest <>", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestGreaterThan(String value) {
            addCriterion("payer_bank_card_id_digest >", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_card_id_digest >=", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestLessThan(String value) {
            addCriterion("payer_bank_card_id_digest <", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_card_id_digest <=", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestLike(String value) {
            addCriterion("payer_bank_card_id_digest like", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestNotLike(String value) {
            addCriterion("payer_bank_card_id_digest not like", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestIn(List<String> values) {
            addCriterion("payer_bank_card_id_digest in", values, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestNotIn(List<String> values) {
            addCriterion("payer_bank_card_id_digest not in", values, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestBetween(String value1, String value2) {
            addCriterion("payer_bank_card_id_digest between", value1, value2, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestNotBetween(String value1, String value2) {
            addCriterion("payer_bank_card_id_digest not between", value1, value2, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameIsNull() {
            addCriterion("payer_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameIsNotNull() {
            addCriterion("payer_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameEqualTo(String value) {
            addCriterion("payer_bank_name =", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameNotEqualTo(String value) {
            addCriterion("payer_bank_name <>", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameGreaterThan(String value) {
            addCriterion("payer_bank_name >", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_name >=", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameLessThan(String value) {
            addCriterion("payer_bank_name <", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_name <=", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameLike(String value) {
            addCriterion("payer_bank_name like", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameNotLike(String value) {
            addCriterion("payer_bank_name not like", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameIn(List<String> values) {
            addCriterion("payer_bank_name in", values, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameNotIn(List<String> values) {
            addCriterion("payer_bank_name not in", values, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBetween(String value1, String value2) {
            addCriterion("payer_bank_name between", value1, value2, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameNotBetween(String value1, String value2) {
            addCriterion("payer_bank_name not between", value1, value2, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaIsNull() {
            addCriterion("payer_bank_card_area is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaIsNotNull() {
            addCriterion("payer_bank_card_area is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaEqualTo(String value) {
            addCriterion("payer_bank_card_area =", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaNotEqualTo(String value) {
            addCriterion("payer_bank_card_area <>", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaGreaterThan(String value) {
            addCriterion("payer_bank_card_area >", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_card_area >=", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaLessThan(String value) {
            addCriterion("payer_bank_card_area <", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_card_area <=", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaLike(String value) {
            addCriterion("payer_bank_card_area like", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaNotLike(String value) {
            addCriterion("payer_bank_card_area not like", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaIn(List<String> values) {
            addCriterion("payer_bank_card_area in", values, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaNotIn(List<String> values) {
            addCriterion("payer_bank_card_area not in", values, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaBetween(String value1, String value2) {
            addCriterion("payer_bank_card_area between", value1, value2, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaNotBetween(String value1, String value2) {
            addCriterion("payer_bank_card_area not between", value1, value2, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsIsNull() {
            addCriterion("payer_bank_card_name_bs is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsIsNotNull() {
            addCriterion("payer_bank_card_name_bs is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsEqualTo(String value) {
            addCriterion("payer_bank_card_name_bs =", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsNotEqualTo(String value) {
            addCriterion("payer_bank_card_name_bs <>", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsGreaterThan(String value) {
            addCriterion("payer_bank_card_name_bs >", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_card_name_bs >=", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsLessThan(String value) {
            addCriterion("payer_bank_card_name_bs <", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_card_name_bs <=", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsLike(String value) {
            addCriterion("payer_bank_card_name_bs like", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsNotLike(String value) {
            addCriterion("payer_bank_card_name_bs not like", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsIn(List<String> values) {
            addCriterion("payer_bank_card_name_bs in", values, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsNotIn(List<String> values) {
            addCriterion("payer_bank_card_name_bs not in", values, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsBetween(String value1, String value2) {
            addCriterion("payer_bank_card_name_bs between", value1, value2, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsNotBetween(String value1, String value2) {
            addCriterion("payer_bank_card_name_bs not between", value1, value2, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsIsNull() {
            addCriterion("payer_bank_card_type_bs is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsIsNotNull() {
            addCriterion("payer_bank_card_type_bs is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsEqualTo(String value) {
            addCriterion("payer_bank_card_type_bs =", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsNotEqualTo(String value) {
            addCriterion("payer_bank_card_type_bs <>", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsGreaterThan(String value) {
            addCriterion("payer_bank_card_type_bs >", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_card_type_bs >=", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsLessThan(String value) {
            addCriterion("payer_bank_card_type_bs <", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_card_type_bs <=", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsLike(String value) {
            addCriterion("payer_bank_card_type_bs like", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsNotLike(String value) {
            addCriterion("payer_bank_card_type_bs not like", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsIn(List<String> values) {
            addCriterion("payer_bank_card_type_bs in", values, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsNotIn(List<String> values) {
            addCriterion("payer_bank_card_type_bs not in", values, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsBetween(String value1, String value2) {
            addCriterion("payer_bank_card_type_bs between", value1, value2, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsNotBetween(String value1, String value2) {
            addCriterion("payer_bank_card_type_bs not between", value1, value2, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsIsNull() {
            addCriterion("payer_bank_name_bs is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsIsNotNull() {
            addCriterion("payer_bank_name_bs is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsEqualTo(String value) {
            addCriterion("payer_bank_name_bs =", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsNotEqualTo(String value) {
            addCriterion("payer_bank_name_bs <>", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsGreaterThan(String value) {
            addCriterion("payer_bank_name_bs >", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_name_bs >=", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsLessThan(String value) {
            addCriterion("payer_bank_name_bs <", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_name_bs <=", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsLike(String value) {
            addCriterion("payer_bank_name_bs like", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsNotLike(String value) {
            addCriterion("payer_bank_name_bs not like", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsIn(List<String> values) {
            addCriterion("payer_bank_name_bs in", values, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsNotIn(List<String> values) {
            addCriterion("payer_bank_name_bs not in", values, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsBetween(String value1, String value2) {
            addCriterion("payer_bank_name_bs between", value1, value2, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsNotBetween(String value1, String value2) {
            addCriterion("payer_bank_name_bs not between", value1, value2, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeIsNull() {
            addCriterion("payer_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeIsNotNull() {
            addCriterion("payer_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeEqualTo(String value) {
            addCriterion("payer_bank_code =", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeNotEqualTo(String value) {
            addCriterion("payer_bank_code <>", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeGreaterThan(String value) {
            addCriterion("payer_bank_code >", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_code >=", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeLessThan(String value) {
            addCriterion("payer_bank_code <", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_code <=", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeLike(String value) {
            addCriterion("payer_bank_code like", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeNotLike(String value) {
            addCriterion("payer_bank_code not like", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeIn(List<String> values) {
            addCriterion("payer_bank_code in", values, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeNotIn(List<String> values) {
            addCriterion("payer_bank_code not in", values, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeBetween(String value1, String value2) {
            addCriterion("payer_bank_code between", value1, value2, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeNotBetween(String value1, String value2) {
            addCriterion("payer_bank_code not between", value1, value2, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeIsNull() {
            addCriterion("payer_bank_code_type is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeIsNotNull() {
            addCriterion("payer_bank_code_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeEqualTo(String value) {
            addCriterion("payer_bank_code_type =", value, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeNotEqualTo(String value) {
            addCriterion("payer_bank_code_type <>", value, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeGreaterThan(String value) {
            addCriterion("payer_bank_code_type >", value, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_code_type >=", value, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeLessThan(String value) {
            addCriterion("payer_bank_code_type <", value, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_code_type <=", value, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeLike(String value) {
            addCriterion("payer_bank_code_type like", value, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeNotLike(String value) {
            addCriterion("payer_bank_code_type not like", value, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeIn(List<String> values) {
            addCriterion("payer_bank_code_type in", values, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeNotIn(List<String> values) {
            addCriterion("payer_bank_code_type not in", values, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeBetween(String value1, String value2) {
            addCriterion("payer_bank_code_type between", value1, value2, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeTypeNotBetween(String value1, String value2) {
            addCriterion("payer_bank_code_type not between", value1, value2, "payerBankCodeType");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeIsNull() {
            addCriterion("payer_country_code is null");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeIsNotNull() {
            addCriterion("payer_country_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeEqualTo(String value) {
            addCriterion("payer_country_code =", value, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeNotEqualTo(String value) {
            addCriterion("payer_country_code <>", value, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeGreaterThan(String value) {
            addCriterion("payer_country_code >", value, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("payer_country_code >=", value, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeLessThan(String value) {
            addCriterion("payer_country_code <", value, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("payer_country_code <=", value, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeLike(String value) {
            addCriterion("payer_country_code like", value, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeNotLike(String value) {
            addCriterion("payer_country_code not like", value, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeIn(List<String> values) {
            addCriterion("payer_country_code in", values, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeNotIn(List<String> values) {
            addCriterion("payer_country_code not in", values, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeBetween(String value1, String value2) {
            addCriterion("payer_country_code between", value1, value2, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryCodeNotBetween(String value1, String value2) {
            addCriterion("payer_country_code not between", value1, value2, "payerCountryCode");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnIsNull() {
            addCriterion("payer_country_name_en is null");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnIsNotNull() {
            addCriterion("payer_country_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnEqualTo(String value) {
            addCriterion("payer_country_name_en =", value, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnNotEqualTo(String value) {
            addCriterion("payer_country_name_en <>", value, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnGreaterThan(String value) {
            addCriterion("payer_country_name_en >", value, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("payer_country_name_en >=", value, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnLessThan(String value) {
            addCriterion("payer_country_name_en <", value, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnLessThanOrEqualTo(String value) {
            addCriterion("payer_country_name_en <=", value, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnLike(String value) {
            addCriterion("payer_country_name_en like", value, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnNotLike(String value) {
            addCriterion("payer_country_name_en not like", value, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnIn(List<String> values) {
            addCriterion("payer_country_name_en in", values, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnNotIn(List<String> values) {
            addCriterion("payer_country_name_en not in", values, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnBetween(String value1, String value2) {
            addCriterion("payer_country_name_en between", value1, value2, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameEnNotBetween(String value1, String value2) {
            addCriterion("payer_country_name_en not between", value1, value2, "payerCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhIsNull() {
            addCriterion("payer_country_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhIsNotNull() {
            addCriterion("payer_country_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhEqualTo(String value) {
            addCriterion("payer_country_name_zh =", value, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhNotEqualTo(String value) {
            addCriterion("payer_country_name_zh <>", value, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhGreaterThan(String value) {
            addCriterion("payer_country_name_zh >", value, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("payer_country_name_zh >=", value, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhLessThan(String value) {
            addCriterion("payer_country_name_zh <", value, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhLessThanOrEqualTo(String value) {
            addCriterion("payer_country_name_zh <=", value, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhLike(String value) {
            addCriterion("payer_country_name_zh like", value, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhNotLike(String value) {
            addCriterion("payer_country_name_zh not like", value, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhIn(List<String> values) {
            addCriterion("payer_country_name_zh in", values, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhNotIn(List<String> values) {
            addCriterion("payer_country_name_zh not in", values, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhBetween(String value1, String value2) {
            addCriterion("payer_country_name_zh between", value1, value2, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryNameZhNotBetween(String value1, String value2) {
            addCriterion("payer_country_name_zh not between", value1, value2, "payerCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeIsNull() {
            addCriterion("payer_country_alph2_code is null");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeIsNotNull() {
            addCriterion("payer_country_alph2_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeEqualTo(String value) {
            addCriterion("payer_country_alph2_code =", value, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeNotEqualTo(String value) {
            addCriterion("payer_country_alph2_code <>", value, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeGreaterThan(String value) {
            addCriterion("payer_country_alph2_code >", value, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("payer_country_alph2_code >=", value, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeLessThan(String value) {
            addCriterion("payer_country_alph2_code <", value, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeLessThanOrEqualTo(String value) {
            addCriterion("payer_country_alph2_code <=", value, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeLike(String value) {
            addCriterion("payer_country_alph2_code like", value, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeNotLike(String value) {
            addCriterion("payer_country_alph2_code not like", value, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeIn(List<String> values) {
            addCriterion("payer_country_alph2_code in", values, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeNotIn(List<String> values) {
            addCriterion("payer_country_alph2_code not in", values, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeBetween(String value1, String value2) {
            addCriterion("payer_country_alph2_code between", value1, value2, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph2CodeNotBetween(String value1, String value2) {
            addCriterion("payer_country_alph2_code not between", value1, value2, "payerCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeIsNull() {
            addCriterion("payer_country_alph3_code is null");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeIsNotNull() {
            addCriterion("payer_country_alph3_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeEqualTo(String value) {
            addCriterion("payer_country_alph3_code =", value, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeNotEqualTo(String value) {
            addCriterion("payer_country_alph3_code <>", value, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeGreaterThan(String value) {
            addCriterion("payer_country_alph3_code >", value, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeGreaterThanOrEqualTo(String value) {
            addCriterion("payer_country_alph3_code >=", value, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeLessThan(String value) {
            addCriterion("payer_country_alph3_code <", value, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeLessThanOrEqualTo(String value) {
            addCriterion("payer_country_alph3_code <=", value, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeLike(String value) {
            addCriterion("payer_country_alph3_code like", value, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeNotLike(String value) {
            addCriterion("payer_country_alph3_code not like", value, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeIn(List<String> values) {
            addCriterion("payer_country_alph3_code in", values, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeNotIn(List<String> values) {
            addCriterion("payer_country_alph3_code not in", values, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeBetween(String value1, String value2) {
            addCriterion("payer_country_alph3_code between", value1, value2, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andPayerCountryAlph3CodeNotBetween(String value1, String value2) {
            addCriterion("payer_country_alph3_code not between", value1, value2, "payerCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeIsNull() {
            addCriterion("receiver_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeIsNotNull() {
            addCriterion("receiver_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeEqualTo(String value) {
            addCriterion("receiver_bank_code =", value, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeNotEqualTo(String value) {
            addCriterion("receiver_bank_code <>", value, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeGreaterThan(String value) {
            addCriterion("receiver_bank_code >", value, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_bank_code >=", value, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeLessThan(String value) {
            addCriterion("receiver_bank_code <", value, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeLessThanOrEqualTo(String value) {
            addCriterion("receiver_bank_code <=", value, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeLike(String value) {
            addCriterion("receiver_bank_code like", value, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeNotLike(String value) {
            addCriterion("receiver_bank_code not like", value, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeIn(List<String> values) {
            addCriterion("receiver_bank_code in", values, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeNotIn(List<String> values) {
            addCriterion("receiver_bank_code not in", values, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeBetween(String value1, String value2) {
            addCriterion("receiver_bank_code between", value1, value2, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCodeNotBetween(String value1, String value2) {
            addCriterion("receiver_bank_code not between", value1, value2, "receiverBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdIsNull() {
            addCriterion("receiver_bank_card_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdIsNotNull() {
            addCriterion("receiver_bank_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdEqualTo(String value) {
            addCriterion("receiver_bank_card_id =", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdNotEqualTo(String value) {
            addCriterion("receiver_bank_card_id <>", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdGreaterThan(String value) {
            addCriterion("receiver_bank_card_id >", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_bank_card_id >=", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdLessThan(String value) {
            addCriterion("receiver_bank_card_id <", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdLessThanOrEqualTo(String value) {
            addCriterion("receiver_bank_card_id <=", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdLike(String value) {
            addCriterion("receiver_bank_card_id like", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdNotLike(String value) {
            addCriterion("receiver_bank_card_id not like", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdIn(List<String> values) {
            addCriterion("receiver_bank_card_id in", values, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdNotIn(List<String> values) {
            addCriterion("receiver_bank_card_id not in", values, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdBetween(String value1, String value2) {
            addCriterion("receiver_bank_card_id between", value1, value2, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdNotBetween(String value1, String value2) {
            addCriterion("receiver_bank_card_id not between", value1, value2, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaIsNull() {
            addCriterion("receiver_bank_card_area is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaIsNotNull() {
            addCriterion("receiver_bank_card_area is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaEqualTo(String value) {
            addCriterion("receiver_bank_card_area =", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaNotEqualTo(String value) {
            addCriterion("receiver_bank_card_area <>", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaGreaterThan(String value) {
            addCriterion("receiver_bank_card_area >", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_bank_card_area >=", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaLessThan(String value) {
            addCriterion("receiver_bank_card_area <", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaLessThanOrEqualTo(String value) {
            addCriterion("receiver_bank_card_area <=", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaLike(String value) {
            addCriterion("receiver_bank_card_area like", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaNotLike(String value) {
            addCriterion("receiver_bank_card_area not like", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaIn(List<String> values) {
            addCriterion("receiver_bank_card_area in", values, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaNotIn(List<String> values) {
            addCriterion("receiver_bank_card_area not in", values, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaBetween(String value1, String value2) {
            addCriterion("receiver_bank_card_area between", value1, value2, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaNotBetween(String value1, String value2) {
            addCriterion("receiver_bank_card_area not between", value1, value2, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsIsNull() {
            addCriterion("receiver_bank_name_bs is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsIsNotNull() {
            addCriterion("receiver_bank_name_bs is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsEqualTo(String value) {
            addCriterion("receiver_bank_name_bs =", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsNotEqualTo(String value) {
            addCriterion("receiver_bank_name_bs <>", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsGreaterThan(String value) {
            addCriterion("receiver_bank_name_bs >", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_bank_name_bs >=", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsLessThan(String value) {
            addCriterion("receiver_bank_name_bs <", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsLessThanOrEqualTo(String value) {
            addCriterion("receiver_bank_name_bs <=", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsLike(String value) {
            addCriterion("receiver_bank_name_bs like", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsNotLike(String value) {
            addCriterion("receiver_bank_name_bs not like", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsIn(List<String> values) {
            addCriterion("receiver_bank_name_bs in", values, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsNotIn(List<String> values) {
            addCriterion("receiver_bank_name_bs not in", values, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsBetween(String value1, String value2) {
            addCriterion("receiver_bank_name_bs between", value1, value2, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsNotBetween(String value1, String value2) {
            addCriterion("receiver_bank_name_bs not between", value1, value2, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsIsNull() {
            addCriterion("receiver_bank_card_name_bs is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsIsNotNull() {
            addCriterion("receiver_bank_card_name_bs is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsEqualTo(String value) {
            addCriterion("receiver_bank_card_name_bs =", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsNotEqualTo(String value) {
            addCriterion("receiver_bank_card_name_bs <>", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsGreaterThan(String value) {
            addCriterion("receiver_bank_card_name_bs >", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_bank_card_name_bs >=", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsLessThan(String value) {
            addCriterion("receiver_bank_card_name_bs <", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsLessThanOrEqualTo(String value) {
            addCriterion("receiver_bank_card_name_bs <=", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsLike(String value) {
            addCriterion("receiver_bank_card_name_bs like", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsNotLike(String value) {
            addCriterion("receiver_bank_card_name_bs not like", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsIn(List<String> values) {
            addCriterion("receiver_bank_card_name_bs in", values, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsNotIn(List<String> values) {
            addCriterion("receiver_bank_card_name_bs not in", values, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsBetween(String value1, String value2) {
            addCriterion("receiver_bank_card_name_bs between", value1, value2, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsNotBetween(String value1, String value2) {
            addCriterion("receiver_bank_card_name_bs not between", value1, value2, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsIsNull() {
            addCriterion("receiver_bank_card_type_bs is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsIsNotNull() {
            addCriterion("receiver_bank_card_type_bs is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsEqualTo(String value) {
            addCriterion("receiver_bank_card_type_bs =", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsNotEqualTo(String value) {
            addCriterion("receiver_bank_card_type_bs <>", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsGreaterThan(String value) {
            addCriterion("receiver_bank_card_type_bs >", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_bank_card_type_bs >=", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsLessThan(String value) {
            addCriterion("receiver_bank_card_type_bs <", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsLessThanOrEqualTo(String value) {
            addCriterion("receiver_bank_card_type_bs <=", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsLike(String value) {
            addCriterion("receiver_bank_card_type_bs like", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsNotLike(String value) {
            addCriterion("receiver_bank_card_type_bs not like", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsIn(List<String> values) {
            addCriterion("receiver_bank_card_type_bs in", values, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsNotIn(List<String> values) {
            addCriterion("receiver_bank_card_type_bs not in", values, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsBetween(String value1, String value2) {
            addCriterion("receiver_bank_card_type_bs between", value1, value2, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsNotBetween(String value1, String value2) {
            addCriterion("receiver_bank_card_type_bs not between", value1, value2, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountIsNull() {
            addCriterion("cny_amount is null");
            return (Criteria) this;
        }

        public Criteria andCnyAmountIsNotNull() {
            addCriterion("cny_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCnyAmountEqualTo(BigDecimal value) {
            addCriterion("cny_amount =", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountNotEqualTo(BigDecimal value) {
            addCriterion("cny_amount <>", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountGreaterThan(BigDecimal value) {
            addCriterion("cny_amount >", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cny_amount >=", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountLessThan(BigDecimal value) {
            addCriterion("cny_amount <", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cny_amount <=", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountIn(List<BigDecimal> values) {
            addCriterion("cny_amount in", values, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountNotIn(List<BigDecimal> values) {
            addCriterion("cny_amount not in", values, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cny_amount between", value1, value2, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cny_amount not between", value1, value2, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyIsNull() {
            addCriterion("target_currency is null");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyIsNotNull() {
            addCriterion("target_currency is not null");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyEqualTo(String value) {
            addCriterion("target_currency =", value, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyNotEqualTo(String value) {
            addCriterion("target_currency <>", value, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyGreaterThan(String value) {
            addCriterion("target_currency >", value, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("target_currency >=", value, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyLessThan(String value) {
            addCriterion("target_currency <", value, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyLessThanOrEqualTo(String value) {
            addCriterion("target_currency <=", value, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyLike(String value) {
            addCriterion("target_currency like", value, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyNotLike(String value) {
            addCriterion("target_currency not like", value, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyIn(List<String> values) {
            addCriterion("target_currency in", values, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyNotIn(List<String> values) {
            addCriterion("target_currency not in", values, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyBetween(String value1, String value2) {
            addCriterion("target_currency between", value1, value2, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetCurrencyNotBetween(String value1, String value2) {
            addCriterion("target_currency not between", value1, value2, "targetCurrency");
            return (Criteria) this;
        }

        public Criteria andTargetAmountIsNull() {
            addCriterion("target_amount is null");
            return (Criteria) this;
        }

        public Criteria andTargetAmountIsNotNull() {
            addCriterion("target_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAmountEqualTo(BigDecimal value) {
            addCriterion("target_amount =", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountNotEqualTo(BigDecimal value) {
            addCriterion("target_amount <>", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountGreaterThan(BigDecimal value) {
            addCriterion("target_amount >", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("target_amount >=", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountLessThan(BigDecimal value) {
            addCriterion("target_amount <", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("target_amount <=", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountIn(List<BigDecimal> values) {
            addCriterion("target_amount in", values, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountNotIn(List<BigDecimal> values) {
            addCriterion("target_amount not in", values, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_amount between", value1, value2, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_amount not between", value1, value2, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountIsNull() {
            addCriterion("target_cny_amount is null");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountIsNotNull() {
            addCriterion("target_cny_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountEqualTo(BigDecimal value) {
            addCriterion("target_cny_amount =", value, "targetCnyAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountNotEqualTo(BigDecimal value) {
            addCriterion("target_cny_amount <>", value, "targetCnyAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountGreaterThan(BigDecimal value) {
            addCriterion("target_cny_amount >", value, "targetCnyAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("target_cny_amount >=", value, "targetCnyAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountLessThan(BigDecimal value) {
            addCriterion("target_cny_amount <", value, "targetCnyAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("target_cny_amount <=", value, "targetCnyAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountIn(List<BigDecimal> values) {
            addCriterion("target_cny_amount in", values, "targetCnyAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountNotIn(List<BigDecimal> values) {
            addCriterion("target_cny_amount not in", values, "targetCnyAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_cny_amount between", value1, value2, "targetCnyAmount");
            return (Criteria) this;
        }

        public Criteria andTargetCnyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_cny_amount not between", value1, value2, "targetCnyAmount");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("notify_url =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("notify_url <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("notify_url like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("notify_url not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("notify_url in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOccurTimeIsNull() {
            addCriterion("occur_time is null");
            return (Criteria) this;
        }

        public Criteria andOccurTimeIsNotNull() {
            addCriterion("occur_time is not null");
            return (Criteria) this;
        }

        public Criteria andOccurTimeEqualTo(Date value) {
            addCriterion("occur_time =", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeNotEqualTo(Date value) {
            addCriterion("occur_time <>", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeGreaterThan(Date value) {
            addCriterion("occur_time >", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("occur_time >=", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeLessThan(Date value) {
            addCriterion("occur_time <", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeLessThanOrEqualTo(Date value) {
            addCriterion("occur_time <=", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeIn(List<Date> values) {
            addCriterion("occur_time in", values, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeNotIn(List<Date> values) {
            addCriterion("occur_time not in", values, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeBetween(Date value1, Date value2) {
            addCriterion("occur_time between", value1, value2, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeNotBetween(Date value1, Date value2) {
            addCriterion("occur_time not between", value1, value2, "occurTime");
            return (Criteria) this;
        }

        public Criteria andBlackTmIsNull() {
            addCriterion("black_tm is null");
            return (Criteria) this;
        }

        public Criteria andBlackTmIsNotNull() {
            addCriterion("black_tm is not null");
            return (Criteria) this;
        }

        public Criteria andBlackTmEqualTo(String value) {
            addCriterion("black_tm =", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmNotEqualTo(String value) {
            addCriterion("black_tm <>", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmGreaterThan(String value) {
            addCriterion("black_tm >", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmGreaterThanOrEqualTo(String value) {
            addCriterion("black_tm >=", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmLessThan(String value) {
            addCriterion("black_tm <", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmLessThanOrEqualTo(String value) {
            addCriterion("black_tm <=", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmLike(String value) {
            addCriterion("black_tm like", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmNotLike(String value) {
            addCriterion("black_tm not like", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmIn(List<String> values) {
            addCriterion("black_tm in", values, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmNotIn(List<String> values) {
            addCriterion("black_tm not in", values, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmBetween(String value1, String value2) {
            addCriterion("black_tm between", value1, value2, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmNotBetween(String value1, String value2) {
            addCriterion("black_tm not between", value1, value2, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackResultIsNull() {
            addCriterion("black_result is null");
            return (Criteria) this;
        }

        public Criteria andBlackResultIsNotNull() {
            addCriterion("black_result is not null");
            return (Criteria) this;
        }

        public Criteria andBlackResultEqualTo(String value) {
            addCriterion("black_result =", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultNotEqualTo(String value) {
            addCriterion("black_result <>", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultGreaterThan(String value) {
            addCriterion("black_result >", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultGreaterThanOrEqualTo(String value) {
            addCriterion("black_result >=", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultLessThan(String value) {
            addCriterion("black_result <", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultLessThanOrEqualTo(String value) {
            addCriterion("black_result <=", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultLike(String value) {
            addCriterion("black_result like", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultNotLike(String value) {
            addCriterion("black_result not like", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultIn(List<String> values) {
            addCriterion("black_result in", values, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultNotIn(List<String> values) {
            addCriterion("black_result not in", values, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultBetween(String value1, String value2) {
            addCriterion("black_result between", value1, value2, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultNotBetween(String value1, String value2) {
            addCriterion("black_result not between", value1, value2, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeIsNull() {
            addCriterion("black_result_code is null");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeIsNotNull() {
            addCriterion("black_result_code is not null");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeEqualTo(String value) {
            addCriterion("black_result_code =", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeNotEqualTo(String value) {
            addCriterion("black_result_code <>", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeGreaterThan(String value) {
            addCriterion("black_result_code >", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("black_result_code >=", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeLessThan(String value) {
            addCriterion("black_result_code <", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeLessThanOrEqualTo(String value) {
            addCriterion("black_result_code <=", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeLike(String value) {
            addCriterion("black_result_code like", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeNotLike(String value) {
            addCriterion("black_result_code not like", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeIn(List<String> values) {
            addCriterion("black_result_code in", values, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeNotIn(List<String> values) {
            addCriterion("black_result_code not in", values, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeBetween(String value1, String value2) {
            addCriterion("black_result_code between", value1, value2, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeNotBetween(String value1, String value2) {
            addCriterion("black_result_code not between", value1, value2, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andWhiteResultIsNull() {
            addCriterion("white_result is null");
            return (Criteria) this;
        }

        public Criteria andWhiteResultIsNotNull() {
            addCriterion("white_result is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteResultEqualTo(String value) {
            addCriterion("white_result =", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultNotEqualTo(String value) {
            addCriterion("white_result <>", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultGreaterThan(String value) {
            addCriterion("white_result >", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultGreaterThanOrEqualTo(String value) {
            addCriterion("white_result >=", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultLessThan(String value) {
            addCriterion("white_result <", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultLessThanOrEqualTo(String value) {
            addCriterion("white_result <=", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultLike(String value) {
            addCriterion("white_result like", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultNotLike(String value) {
            addCriterion("white_result not like", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultIn(List<String> values) {
            addCriterion("white_result in", values, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultNotIn(List<String> values) {
            addCriterion("white_result not in", values, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultBetween(String value1, String value2) {
            addCriterion("white_result between", value1, value2, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultNotBetween(String value1, String value2) {
            addCriterion("white_result not between", value1, value2, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andTotalTmIsNull() {
            addCriterion("total_tm is null");
            return (Criteria) this;
        }

        public Criteria andTotalTmIsNotNull() {
            addCriterion("total_tm is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTmEqualTo(String value) {
            addCriterion("total_tm =", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmNotEqualTo(String value) {
            addCriterion("total_tm <>", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmGreaterThan(String value) {
            addCriterion("total_tm >", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmGreaterThanOrEqualTo(String value) {
            addCriterion("total_tm >=", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmLessThan(String value) {
            addCriterion("total_tm <", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmLessThanOrEqualTo(String value) {
            addCriterion("total_tm <=", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmLike(String value) {
            addCriterion("total_tm like", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmNotLike(String value) {
            addCriterion("total_tm not like", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmIn(List<String> values) {
            addCriterion("total_tm in", values, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmNotIn(List<String> values) {
            addCriterion("total_tm not in", values, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmBetween(String value1, String value2) {
            addCriterion("total_tm between", value1, value2, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmNotBetween(String value1, String value2) {
            addCriterion("total_tm not between", value1, value2, "totalTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmIsNull() {
            addCriterion("rule_tm is null");
            return (Criteria) this;
        }

        public Criteria andRuleTmIsNotNull() {
            addCriterion("rule_tm is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTmEqualTo(String value) {
            addCriterion("rule_tm =", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmNotEqualTo(String value) {
            addCriterion("rule_tm <>", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmGreaterThan(String value) {
            addCriterion("rule_tm >", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmGreaterThanOrEqualTo(String value) {
            addCriterion("rule_tm >=", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmLessThan(String value) {
            addCriterion("rule_tm <", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmLessThanOrEqualTo(String value) {
            addCriterion("rule_tm <=", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmLike(String value) {
            addCriterion("rule_tm like", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmNotLike(String value) {
            addCriterion("rule_tm not like", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmIn(List<String> values) {
            addCriterion("rule_tm in", values, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmNotIn(List<String> values) {
            addCriterion("rule_tm not in", values, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmBetween(String value1, String value2) {
            addCriterion("rule_tm between", value1, value2, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmNotBetween(String value1, String value2) {
            addCriterion("rule_tm not between", value1, value2, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleResultIsNull() {
            addCriterion("rule_result is null");
            return (Criteria) this;
        }

        public Criteria andRuleResultIsNotNull() {
            addCriterion("rule_result is not null");
            return (Criteria) this;
        }

        public Criteria andRuleResultEqualTo(String value) {
            addCriterion("rule_result =", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultNotEqualTo(String value) {
            addCriterion("rule_result <>", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultGreaterThan(String value) {
            addCriterion("rule_result >", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultGreaterThanOrEqualTo(String value) {
            addCriterion("rule_result >=", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultLessThan(String value) {
            addCriterion("rule_result <", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultLessThanOrEqualTo(String value) {
            addCriterion("rule_result <=", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultLike(String value) {
            addCriterion("rule_result like", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultNotLike(String value) {
            addCriterion("rule_result not like", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultIn(List<String> values) {
            addCriterion("rule_result in", values, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultNotIn(List<String> values) {
            addCriterion("rule_result not in", values, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultBetween(String value1, String value2) {
            addCriterion("rule_result between", value1, value2, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultNotBetween(String value1, String value2) {
            addCriterion("rule_result not between", value1, value2, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleIsNull() {
            addCriterion("triger_rule is null");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleIsNotNull() {
            addCriterion("triger_rule is not null");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleEqualTo(String value) {
            addCriterion("triger_rule =", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleNotEqualTo(String value) {
            addCriterion("triger_rule <>", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleGreaterThan(String value) {
            addCriterion("triger_rule >", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleGreaterThanOrEqualTo(String value) {
            addCriterion("triger_rule >=", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleLessThan(String value) {
            addCriterion("triger_rule <", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleLessThanOrEqualTo(String value) {
            addCriterion("triger_rule <=", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleLike(String value) {
            addCriterion("triger_rule like", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleNotLike(String value) {
            addCriterion("triger_rule not like", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleIn(List<String> values) {
            addCriterion("triger_rule in", values, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleNotIn(List<String> values) {
            addCriterion("triger_rule not in", values, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleBetween(String value1, String value2) {
            addCriterion("triger_rule between", value1, value2, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleNotBetween(String value1, String value2) {
            addCriterion("triger_rule not between", value1, value2, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andRuleCodesIsNull() {
            addCriterion("rule_codes is null");
            return (Criteria) this;
        }

        public Criteria andRuleCodesIsNotNull() {
            addCriterion("rule_codes is not null");
            return (Criteria) this;
        }

        public Criteria andRuleCodesEqualTo(String value) {
            addCriterion("rule_codes =", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesNotEqualTo(String value) {
            addCriterion("rule_codes <>", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesGreaterThan(String value) {
            addCriterion("rule_codes >", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesGreaterThanOrEqualTo(String value) {
            addCriterion("rule_codes >=", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesLessThan(String value) {
            addCriterion("rule_codes <", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesLessThanOrEqualTo(String value) {
            addCriterion("rule_codes <=", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesLike(String value) {
            addCriterion("rule_codes like", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesNotLike(String value) {
            addCriterion("rule_codes not like", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesIn(List<String> values) {
            addCriterion("rule_codes in", values, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesNotIn(List<String> values) {
            addCriterion("rule_codes not in", values, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesBetween(String value1, String value2) {
            addCriterion("rule_codes between", value1, value2, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesNotBetween(String value1, String value2) {
            addCriterion("rule_codes not between", value1, value2, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeIsNull() {
            addCriterion("support_operate_code is null");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeIsNotNull() {
            addCriterion("support_operate_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeEqualTo(String value) {
            addCriterion("support_operate_code =", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeNotEqualTo(String value) {
            addCriterion("support_operate_code <>", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeGreaterThan(String value) {
            addCriterion("support_operate_code >", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("support_operate_code >=", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeLessThan(String value) {
            addCriterion("support_operate_code <", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeLessThanOrEqualTo(String value) {
            addCriterion("support_operate_code <=", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeLike(String value) {
            addCriterion("support_operate_code like", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeNotLike(String value) {
            addCriterion("support_operate_code not like", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeIn(List<String> values) {
            addCriterion("support_operate_code in", values, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeNotIn(List<String> values) {
            addCriterion("support_operate_code not in", values, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeBetween(String value1, String value2) {
            addCriterion("support_operate_code between", value1, value2, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeNotBetween(String value1, String value2) {
            addCriterion("support_operate_code not between", value1, value2, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andBlockTypeIsNull() {
            addCriterion("block_type is null");
            return (Criteria) this;
        }

        public Criteria andBlockTypeIsNotNull() {
            addCriterion("block_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlockTypeEqualTo(String value) {
            addCriterion("block_type =", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeNotEqualTo(String value) {
            addCriterion("block_type <>", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeGreaterThan(String value) {
            addCriterion("block_type >", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("block_type >=", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeLessThan(String value) {
            addCriterion("block_type <", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeLessThanOrEqualTo(String value) {
            addCriterion("block_type <=", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeLike(String value) {
            addCriterion("block_type like", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeNotLike(String value) {
            addCriterion("block_type not like", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeIn(List<String> values) {
            addCriterion("block_type in", values, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeNotIn(List<String> values) {
            addCriterion("block_type not in", values, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeBetween(String value1, String value2) {
            addCriterion("block_type between", value1, value2, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeNotBetween(String value1, String value2) {
            addCriterion("block_type not between", value1, value2, "blockType");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("error_code is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("error_code is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("error_code =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("error_code <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("error_code >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("error_code >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("error_code <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("error_code <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("error_code like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("error_code not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("error_code in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("error_code not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("error_code between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("error_code not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNull() {
            addCriterion("error_msg is null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNotNull() {
            addCriterion("error_msg is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgEqualTo(String value) {
            addCriterion("error_msg =", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotEqualTo(String value) {
            addCriterion("error_msg <>", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThan(String value) {
            addCriterion("error_msg >", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThanOrEqualTo(String value) {
            addCriterion("error_msg >=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThan(String value) {
            addCriterion("error_msg <", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThanOrEqualTo(String value) {
            addCriterion("error_msg <=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLike(String value) {
            addCriterion("error_msg like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotLike(String value) {
            addCriterion("error_msg not like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIn(List<String> values) {
            addCriterion("error_msg in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotIn(List<String> values) {
            addCriterion("error_msg not in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgBetween(String value1, String value2) {
            addCriterion("error_msg between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotBetween(String value1, String value2) {
            addCriterion("error_msg not between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIsNull() {
            addCriterion("notify_status is null");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIsNotNull() {
            addCriterion("notify_status is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusEqualTo(String value) {
            addCriterion("notify_status =", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotEqualTo(String value) {
            addCriterion("notify_status <>", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusGreaterThan(String value) {
            addCriterion("notify_status >", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("notify_status >=", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLessThan(String value) {
            addCriterion("notify_status <", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLessThanOrEqualTo(String value) {
            addCriterion("notify_status <=", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLike(String value) {
            addCriterion("notify_status like", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotLike(String value) {
            addCriterion("notify_status not like", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIn(List<String> values) {
            addCriterion("notify_status in", values, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotIn(List<String> values) {
            addCriterion("notify_status not in", values, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusBetween(String value1, String value2) {
            addCriterion("notify_status between", value1, value2, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotBetween(String value1, String value2) {
            addCriterion("notify_status not between", value1, value2, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyNumIsNull() {
            addCriterion("notify_num is null");
            return (Criteria) this;
        }

        public Criteria andNotifyNumIsNotNull() {
            addCriterion("notify_num is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyNumEqualTo(Byte value) {
            addCriterion("notify_num =", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumNotEqualTo(Byte value) {
            addCriterion("notify_num <>", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumGreaterThan(Byte value) {
            addCriterion("notify_num >", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("notify_num >=", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumLessThan(Byte value) {
            addCriterion("notify_num <", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumLessThanOrEqualTo(Byte value) {
            addCriterion("notify_num <=", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumIn(List<Byte> values) {
            addCriterion("notify_num in", values, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumNotIn(List<Byte> values) {
            addCriterion("notify_num not in", values, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumBetween(Byte value1, Byte value2) {
            addCriterion("notify_num between", value1, value2, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumNotBetween(Byte value1, Byte value2) {
            addCriterion("notify_num not between", value1, value2, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeIsNull() {
            addCriterion("notify_result_code is null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeIsNotNull() {
            addCriterion("notify_result_code is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeEqualTo(String value) {
            addCriterion("notify_result_code =", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeNotEqualTo(String value) {
            addCriterion("notify_result_code <>", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeGreaterThan(String value) {
            addCriterion("notify_result_code >", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("notify_result_code >=", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeLessThan(String value) {
            addCriterion("notify_result_code <", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeLessThanOrEqualTo(String value) {
            addCriterion("notify_result_code <=", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeLike(String value) {
            addCriterion("notify_result_code like", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeNotLike(String value) {
            addCriterion("notify_result_code not like", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeIn(List<String> values) {
            addCriterion("notify_result_code in", values, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeNotIn(List<String> values) {
            addCriterion("notify_result_code not in", values, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeBetween(String value1, String value2) {
            addCriterion("notify_result_code between", value1, value2, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeNotBetween(String value1, String value2) {
            addCriterion("notify_result_code not between", value1, value2, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgIsNull() {
            addCriterion("notify_result_msg is null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgIsNotNull() {
            addCriterion("notify_result_msg is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgEqualTo(String value) {
            addCriterion("notify_result_msg =", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgNotEqualTo(String value) {
            addCriterion("notify_result_msg <>", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgGreaterThan(String value) {
            addCriterion("notify_result_msg >", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgGreaterThanOrEqualTo(String value) {
            addCriterion("notify_result_msg >=", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgLessThan(String value) {
            addCriterion("notify_result_msg <", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgLessThanOrEqualTo(String value) {
            addCriterion("notify_result_msg <=", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgLike(String value) {
            addCriterion("notify_result_msg like", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgNotLike(String value) {
            addCriterion("notify_result_msg not like", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgIn(List<String> values) {
            addCriterion("notify_result_msg in", values, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgNotIn(List<String> values) {
            addCriterion("notify_result_msg not in", values, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgBetween(String value1, String value2) {
            addCriterion("notify_result_msg between", value1, value2, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgNotBetween(String value1, String value2) {
            addCriterion("notify_result_msg not between", value1, value2, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andPayResultIsNull() {
            addCriterion("pay_result is null");
            return (Criteria) this;
        }

        public Criteria andPayResultIsNotNull() {
            addCriterion("pay_result is not null");
            return (Criteria) this;
        }

        public Criteria andPayResultEqualTo(String value) {
            addCriterion("pay_result =", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotEqualTo(String value) {
            addCriterion("pay_result <>", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultGreaterThan(String value) {
            addCriterion("pay_result >", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultGreaterThanOrEqualTo(String value) {
            addCriterion("pay_result >=", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLessThan(String value) {
            addCriterion("pay_result <", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLessThanOrEqualTo(String value) {
            addCriterion("pay_result <=", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLike(String value) {
            addCriterion("pay_result like", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotLike(String value) {
            addCriterion("pay_result not like", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultIn(List<String> values) {
            addCriterion("pay_result in", values, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotIn(List<String> values) {
            addCriterion("pay_result not in", values, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultBetween(String value1, String value2) {
            addCriterion("pay_result between", value1, value2, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotBetween(String value1, String value2) {
            addCriterion("pay_result not between", value1, value2, "payResult");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIsNull() {
            addCriterion("goods_info is null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIsNotNull() {
            addCriterion("goods_info is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoEqualTo(String value) {
            addCriterion("goods_info =", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotEqualTo(String value) {
            addCriterion("goods_info <>", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoGreaterThan(String value) {
            addCriterion("goods_info >", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_info >=", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLessThan(String value) {
            addCriterion("goods_info <", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLessThanOrEqualTo(String value) {
            addCriterion("goods_info <=", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLike(String value) {
            addCriterion("goods_info like", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotLike(String value) {
            addCriterion("goods_info not like", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIn(List<String> values) {
            addCriterion("goods_info in", values, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotIn(List<String> values) {
            addCriterion("goods_info not in", values, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoBetween(String value1, String value2) {
            addCriterion("goods_info between", value1, value2, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotBetween(String value1, String value2) {
            addCriterion("goods_info not between", value1, value2, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 充值交易订单表
     *
     * @author wcyong
     *
     * @date 2023-01-18
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
