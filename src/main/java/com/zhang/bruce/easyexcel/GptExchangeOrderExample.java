package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GptExchangeOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GptExchangeOrderExample() {
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
     * 换汇交易订单表
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

        public Criteria andMerchantKycIsNull() {
            addCriterion("merchant_kyc is null");
            return (Criteria) this;
        }

        public Criteria andMerchantKycIsNotNull() {
            addCriterion("merchant_kyc is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantKycEqualTo(String value) {
            addCriterion("merchant_kyc =", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycNotEqualTo(String value) {
            addCriterion("merchant_kyc <>", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycGreaterThan(String value) {
            addCriterion("merchant_kyc >", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_kyc >=", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycLessThan(String value) {
            addCriterion("merchant_kyc <", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycLessThanOrEqualTo(String value) {
            addCriterion("merchant_kyc <=", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycLike(String value) {
            addCriterion("merchant_kyc like", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycNotLike(String value) {
            addCriterion("merchant_kyc not like", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycIn(List<String> values) {
            addCriterion("merchant_kyc in", values, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycNotIn(List<String> values) {
            addCriterion("merchant_kyc not in", values, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycBetween(String value1, String value2) {
            addCriterion("merchant_kyc between", value1, value2, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycNotBetween(String value1, String value2) {
            addCriterion("merchant_kyc not between", value1, value2, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubIsNull() {
            addCriterion("merchant_kyc_sub is null");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubIsNotNull() {
            addCriterion("merchant_kyc_sub is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubEqualTo(String value) {
            addCriterion("merchant_kyc_sub =", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubNotEqualTo(String value) {
            addCriterion("merchant_kyc_sub <>", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubGreaterThan(String value) {
            addCriterion("merchant_kyc_sub >", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_kyc_sub >=", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubLessThan(String value) {
            addCriterion("merchant_kyc_sub <", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubLessThanOrEqualTo(String value) {
            addCriterion("merchant_kyc_sub <=", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubLike(String value) {
            addCriterion("merchant_kyc_sub like", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubNotLike(String value) {
            addCriterion("merchant_kyc_sub not like", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubIn(List<String> values) {
            addCriterion("merchant_kyc_sub in", values, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubNotIn(List<String> values) {
            addCriterion("merchant_kyc_sub not in", values, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubBetween(String value1, String value2) {
            addCriterion("merchant_kyc_sub between", value1, value2, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubNotBetween(String value1, String value2) {
            addCriterion("merchant_kyc_sub not between", value1, value2, "merchantKycSub");
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

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("complete_time not between", value1, value2, "completeTime");
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
     * 换汇交易订单表
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
