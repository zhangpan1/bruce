package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GptRemitOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GptRemitOrderExample() {
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
     * 出款交易订单表
     *
     * @author wcyong
     *
     * @date 2023-01-19
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

        public Criteria andAllotTypeIsNull() {
            addCriterion("allot_type is null");
            return (Criteria) this;
        }

        public Criteria andAllotTypeIsNotNull() {
            addCriterion("allot_type is not null");
            return (Criteria) this;
        }

        public Criteria andAllotTypeEqualTo(String value) {
            addCriterion("allot_type =", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotEqualTo(String value) {
            addCriterion("allot_type <>", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeGreaterThan(String value) {
            addCriterion("allot_type >", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeGreaterThanOrEqualTo(String value) {
            addCriterion("allot_type >=", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeLessThan(String value) {
            addCriterion("allot_type <", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeLessThanOrEqualTo(String value) {
            addCriterion("allot_type <=", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeLike(String value) {
            addCriterion("allot_type like", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotLike(String value) {
            addCriterion("allot_type not like", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeIn(List<String> values) {
            addCriterion("allot_type in", values, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotIn(List<String> values) {
            addCriterion("allot_type not in", values, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeBetween(String value1, String value2) {
            addCriterion("allot_type between", value1, value2, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotBetween(String value1, String value2) {
            addCriterion("allot_type not between", value1, value2, "allotType");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("data_source is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("data_source is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("data_source =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("data_source <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("data_source >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("data_source >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("data_source <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("data_source <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("data_source like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("data_source not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("data_source in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("data_source not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("data_source between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("data_source not between", value1, value2, "dataSource");
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

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestIsNull() {
            addCriterion("supplier_name_digest is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestIsNotNull() {
            addCriterion("supplier_name_digest is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestEqualTo(String value) {
            addCriterion("supplier_name_digest =", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestNotEqualTo(String value) {
            addCriterion("supplier_name_digest <>", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestGreaterThan(String value) {
            addCriterion("supplier_name_digest >", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name_digest >=", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestLessThan(String value) {
            addCriterion("supplier_name_digest <", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestLessThanOrEqualTo(String value) {
            addCriterion("supplier_name_digest <=", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestLike(String value) {
            addCriterion("supplier_name_digest like", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestNotLike(String value) {
            addCriterion("supplier_name_digest not like", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestIn(List<String> values) {
            addCriterion("supplier_name_digest in", values, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestNotIn(List<String> values) {
            addCriterion("supplier_name_digest not in", values, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestBetween(String value1, String value2) {
            addCriterion("supplier_name_digest between", value1, value2, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestNotBetween(String value1, String value2) {
            addCriterion("supplier_name_digest not between", value1, value2, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andDeclareIdIsNull() {
            addCriterion("declare_id is null");
            return (Criteria) this;
        }

        public Criteria andDeclareIdIsNotNull() {
            addCriterion("declare_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareIdEqualTo(String value) {
            addCriterion("declare_id =", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdNotEqualTo(String value) {
            addCriterion("declare_id <>", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdGreaterThan(String value) {
            addCriterion("declare_id >", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdGreaterThanOrEqualTo(String value) {
            addCriterion("declare_id >=", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdLessThan(String value) {
            addCriterion("declare_id <", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdLessThanOrEqualTo(String value) {
            addCriterion("declare_id <=", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdLike(String value) {
            addCriterion("declare_id like", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdNotLike(String value) {
            addCriterion("declare_id not like", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdIn(List<String> values) {
            addCriterion("declare_id in", values, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdNotIn(List<String> values) {
            addCriterion("declare_id not in", values, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdBetween(String value1, String value2) {
            addCriterion("declare_id between", value1, value2, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdNotBetween(String value1, String value2) {
            addCriterion("declare_id not between", value1, value2, "declareId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("trade_type like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("trade_type not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andTradeModeIsNull() {
            addCriterion("trade_mode is null");
            return (Criteria) this;
        }

        public Criteria andTradeModeIsNotNull() {
            addCriterion("trade_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTradeModeEqualTo(String value) {
            addCriterion("trade_mode =", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotEqualTo(String value) {
            addCriterion("trade_mode <>", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeGreaterThan(String value) {
            addCriterion("trade_mode >", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_mode >=", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLessThan(String value) {
            addCriterion("trade_mode <", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLessThanOrEqualTo(String value) {
            addCriterion("trade_mode <=", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLike(String value) {
            addCriterion("trade_mode like", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotLike(String value) {
            addCriterion("trade_mode not like", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeIn(List<String> values) {
            addCriterion("trade_mode in", values, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotIn(List<String> values) {
            addCriterion("trade_mode not in", values, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeBetween(String value1, String value2) {
            addCriterion("trade_mode between", value1, value2, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotBetween(String value1, String value2) {
            addCriterion("trade_mode not between", value1, value2, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andIsSettlementIsNull() {
            addCriterion("is_settlement is null");
            return (Criteria) this;
        }

        public Criteria andIsSettlementIsNotNull() {
            addCriterion("is_settlement is not null");
            return (Criteria) this;
        }

        public Criteria andIsSettlementEqualTo(String value) {
            addCriterion("is_settlement =", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementNotEqualTo(String value) {
            addCriterion("is_settlement <>", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementGreaterThan(String value) {
            addCriterion("is_settlement >", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementGreaterThanOrEqualTo(String value) {
            addCriterion("is_settlement >=", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementLessThan(String value) {
            addCriterion("is_settlement <", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementLessThanOrEqualTo(String value) {
            addCriterion("is_settlement <=", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementLike(String value) {
            addCriterion("is_settlement like", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementNotLike(String value) {
            addCriterion("is_settlement not like", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementIn(List<String> values) {
            addCriterion("is_settlement in", values, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementNotIn(List<String> values) {
            addCriterion("is_settlement not in", values, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementBetween(String value1, String value2) {
            addCriterion("is_settlement between", value1, value2, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementNotBetween(String value1, String value2) {
            addCriterion("is_settlement not between", value1, value2, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andTradeMomoIsNull() {
            addCriterion("trade_momo is null");
            return (Criteria) this;
        }

        public Criteria andTradeMomoIsNotNull() {
            addCriterion("trade_momo is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMomoEqualTo(String value) {
            addCriterion("trade_momo =", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoNotEqualTo(String value) {
            addCriterion("trade_momo <>", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoGreaterThan(String value) {
            addCriterion("trade_momo >", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_momo >=", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoLessThan(String value) {
            addCriterion("trade_momo <", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoLessThanOrEqualTo(String value) {
            addCriterion("trade_momo <=", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoLike(String value) {
            addCriterion("trade_momo like", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoNotLike(String value) {
            addCriterion("trade_momo not like", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoIn(List<String> values) {
            addCriterion("trade_momo in", values, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoNotIn(List<String> values) {
            addCriterion("trade_momo not in", values, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoBetween(String value1, String value2) {
            addCriterion("trade_momo between", value1, value2, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoNotBetween(String value1, String value2) {
            addCriterion("trade_momo not between", value1, value2, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardIsNull() {
            addCriterion("seller_id_card is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardIsNotNull() {
            addCriterion("seller_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardEqualTo(String value) {
            addCriterion("seller_id_card =", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardNotEqualTo(String value) {
            addCriterion("seller_id_card <>", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardGreaterThan(String value) {
            addCriterion("seller_id_card >", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id_card >=", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardLessThan(String value) {
            addCriterion("seller_id_card <", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardLessThanOrEqualTo(String value) {
            addCriterion("seller_id_card <=", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardLike(String value) {
            addCriterion("seller_id_card like", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardNotLike(String value) {
            addCriterion("seller_id_card not like", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardIn(List<String> values) {
            addCriterion("seller_id_card in", values, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardNotIn(List<String> values) {
            addCriterion("seller_id_card not in", values, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardBetween(String value1, String value2) {
            addCriterion("seller_id_card between", value1, value2, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardNotBetween(String value1, String value2) {
            addCriterion("seller_id_card not between", value1, value2, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaIsNull() {
            addCriterion("seller_id_card_area is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaIsNotNull() {
            addCriterion("seller_id_card_area is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaEqualTo(String value) {
            addCriterion("seller_id_card_area =", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaNotEqualTo(String value) {
            addCriterion("seller_id_card_area <>", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaGreaterThan(String value) {
            addCriterion("seller_id_card_area >", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id_card_area >=", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaLessThan(String value) {
            addCriterion("seller_id_card_area <", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaLessThanOrEqualTo(String value) {
            addCriterion("seller_id_card_area <=", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaLike(String value) {
            addCriterion("seller_id_card_area like", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaNotLike(String value) {
            addCriterion("seller_id_card_area not like", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaIn(List<String> values) {
            addCriterion("seller_id_card_area in", values, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaNotIn(List<String> values) {
            addCriterion("seller_id_card_area not in", values, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaBetween(String value1, String value2) {
            addCriterion("seller_id_card_area between", value1, value2, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaNotBetween(String value1, String value2) {
            addCriterion("seller_id_card_area not between", value1, value2, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdIsNull() {
            addCriterion("platform_member_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdIsNotNull() {
            addCriterion("platform_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdEqualTo(String value) {
            addCriterion("platform_member_id =", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdNotEqualTo(String value) {
            addCriterion("platform_member_id <>", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdGreaterThan(String value) {
            addCriterion("platform_member_id >", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("platform_member_id >=", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdLessThan(String value) {
            addCriterion("platform_member_id <", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdLessThanOrEqualTo(String value) {
            addCriterion("platform_member_id <=", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdLike(String value) {
            addCriterion("platform_member_id like", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdNotLike(String value) {
            addCriterion("platform_member_id not like", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdIn(List<String> values) {
            addCriterion("platform_member_id in", values, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdNotIn(List<String> values) {
            addCriterion("platform_member_id not in", values, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdBetween(String value1, String value2) {
            addCriterion("platform_member_id between", value1, value2, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdNotBetween(String value1, String value2) {
            addCriterion("platform_member_id not between", value1, value2, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeIsNull() {
            addCriterion("receiver_type is null");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeIsNotNull() {
            addCriterion("receiver_type is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeEqualTo(String value) {
            addCriterion("receiver_type =", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotEqualTo(String value) {
            addCriterion("receiver_type <>", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeGreaterThan(String value) {
            addCriterion("receiver_type >", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_type >=", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeLessThan(String value) {
            addCriterion("receiver_type <", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeLessThanOrEqualTo(String value) {
            addCriterion("receiver_type <=", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeLike(String value) {
            addCriterion("receiver_type like", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotLike(String value) {
            addCriterion("receiver_type not like", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeIn(List<String> values) {
            addCriterion("receiver_type in", values, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotIn(List<String> values) {
            addCriterion("receiver_type not in", values, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeBetween(String value1, String value2) {
            addCriterion("receiver_type between", value1, value2, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotBetween(String value1, String value2) {
            addCriterion("receiver_type not between", value1, value2, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeIsNull() {
            addCriterion("receiver_id_type is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeIsNotNull() {
            addCriterion("receiver_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeEqualTo(String value) {
            addCriterion("receiver_id_type =", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeNotEqualTo(String value) {
            addCriterion("receiver_id_type <>", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeGreaterThan(String value) {
            addCriterion("receiver_id_type >", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_id_type >=", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeLessThan(String value) {
            addCriterion("receiver_id_type <", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeLessThanOrEqualTo(String value) {
            addCriterion("receiver_id_type <=", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeLike(String value) {
            addCriterion("receiver_id_type like", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeNotLike(String value) {
            addCriterion("receiver_id_type not like", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeIn(List<String> values) {
            addCriterion("receiver_id_type in", values, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeNotIn(List<String> values) {
            addCriterion("receiver_id_type not in", values, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeBetween(String value1, String value2) {
            addCriterion("receiver_id_type between", value1, value2, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeNotBetween(String value1, String value2) {
            addCriterion("receiver_id_type not between", value1, value2, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardIsNull() {
            addCriterion("receiver_id_card is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardIsNotNull() {
            addCriterion("receiver_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardEqualTo(String value) {
            addCriterion("receiver_id_card =", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardNotEqualTo(String value) {
            addCriterion("receiver_id_card <>", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardGreaterThan(String value) {
            addCriterion("receiver_id_card >", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_id_card >=", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardLessThan(String value) {
            addCriterion("receiver_id_card <", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardLessThanOrEqualTo(String value) {
            addCriterion("receiver_id_card <=", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardLike(String value) {
            addCriterion("receiver_id_card like", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardNotLike(String value) {
            addCriterion("receiver_id_card not like", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardIn(List<String> values) {
            addCriterion("receiver_id_card in", values, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardNotIn(List<String> values) {
            addCriterion("receiver_id_card not in", values, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardBetween(String value1, String value2) {
            addCriterion("receiver_id_card between", value1, value2, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardNotBetween(String value1, String value2) {
            addCriterion("receiver_id_card not between", value1, value2, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestIsNull() {
            addCriterion("receiver_id_card_digest is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestIsNotNull() {
            addCriterion("receiver_id_card_digest is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestEqualTo(String value) {
            addCriterion("receiver_id_card_digest =", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestNotEqualTo(String value) {
            addCriterion("receiver_id_card_digest <>", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestGreaterThan(String value) {
            addCriterion("receiver_id_card_digest >", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_id_card_digest >=", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestLessThan(String value) {
            addCriterion("receiver_id_card_digest <", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestLessThanOrEqualTo(String value) {
            addCriterion("receiver_id_card_digest <=", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestLike(String value) {
            addCriterion("receiver_id_card_digest like", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestNotLike(String value) {
            addCriterion("receiver_id_card_digest not like", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestIn(List<String> values) {
            addCriterion("receiver_id_card_digest in", values, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestNotIn(List<String> values) {
            addCriterion("receiver_id_card_digest not in", values, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestBetween(String value1, String value2) {
            addCriterion("receiver_id_card_digest between", value1, value2, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestNotBetween(String value1, String value2) {
            addCriterion("receiver_id_card_digest not between", value1, value2, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaIsNull() {
            addCriterion("receiver_id_card_area is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaIsNotNull() {
            addCriterion("receiver_id_card_area is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaEqualTo(String value) {
            addCriterion("receiver_id_card_area =", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaNotEqualTo(String value) {
            addCriterion("receiver_id_card_area <>", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaGreaterThan(String value) {
            addCriterion("receiver_id_card_area >", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_id_card_area >=", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaLessThan(String value) {
            addCriterion("receiver_id_card_area <", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaLessThanOrEqualTo(String value) {
            addCriterion("receiver_id_card_area <=", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaLike(String value) {
            addCriterion("receiver_id_card_area like", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaNotLike(String value) {
            addCriterion("receiver_id_card_area not like", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaIn(List<String> values) {
            addCriterion("receiver_id_card_area in", values, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaNotIn(List<String> values) {
            addCriterion("receiver_id_card_area not in", values, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaBetween(String value1, String value2) {
            addCriterion("receiver_id_card_area between", value1, value2, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaNotBetween(String value1, String value2) {
            addCriterion("receiver_id_card_area not between", value1, value2, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestIsNull() {
            addCriterion("receiver_name_digest is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestIsNotNull() {
            addCriterion("receiver_name_digest is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestEqualTo(String value) {
            addCriterion("receiver_name_digest =", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestNotEqualTo(String value) {
            addCriterion("receiver_name_digest <>", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestGreaterThan(String value) {
            addCriterion("receiver_name_digest >", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name_digest >=", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestLessThan(String value) {
            addCriterion("receiver_name_digest <", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestLessThanOrEqualTo(String value) {
            addCriterion("receiver_name_digest <=", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestLike(String value) {
            addCriterion("receiver_name_digest like", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestNotLike(String value) {
            addCriterion("receiver_name_digest not like", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestIn(List<String> values) {
            addCriterion("receiver_name_digest in", values, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestNotIn(List<String> values) {
            addCriterion("receiver_name_digest not in", values, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestBetween(String value1, String value2) {
            addCriterion("receiver_name_digest between", value1, value2, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestNotBetween(String value1, String value2) {
            addCriterion("receiver_name_digest not between", value1, value2, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameIsNull() {
            addCriterion("receiver_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameIsNotNull() {
            addCriterion("receiver_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameEqualTo(String value) {
            addCriterion("receiver_bank_name =", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameNotEqualTo(String value) {
            addCriterion("receiver_bank_name <>", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameGreaterThan(String value) {
            addCriterion("receiver_bank_name >", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_bank_name >=", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameLessThan(String value) {
            addCriterion("receiver_bank_name <", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_bank_name <=", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameLike(String value) {
            addCriterion("receiver_bank_name like", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameNotLike(String value) {
            addCriterion("receiver_bank_name not like", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameIn(List<String> values) {
            addCriterion("receiver_bank_name in", values, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameNotIn(List<String> values) {
            addCriterion("receiver_bank_name not in", values, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBetween(String value1, String value2) {
            addCriterion("receiver_bank_name between", value1, value2, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameNotBetween(String value1, String value2) {
            addCriterion("receiver_bank_name not between", value1, value2, "receiverBankName");
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

        public Criteria andReceiverBankCardIdDigestIsNull() {
            addCriterion("receiver_bank_card_id_digest is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestIsNotNull() {
            addCriterion("receiver_bank_card_id_digest is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestEqualTo(String value) {
            addCriterion("receiver_bank_card_id_digest =", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestNotEqualTo(String value) {
            addCriterion("receiver_bank_card_id_digest <>", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestGreaterThan(String value) {
            addCriterion("receiver_bank_card_id_digest >", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_bank_card_id_digest >=", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestLessThan(String value) {
            addCriterion("receiver_bank_card_id_digest <", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestLessThanOrEqualTo(String value) {
            addCriterion("receiver_bank_card_id_digest <=", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestLike(String value) {
            addCriterion("receiver_bank_card_id_digest like", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestNotLike(String value) {
            addCriterion("receiver_bank_card_id_digest not like", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestIn(List<String> values) {
            addCriterion("receiver_bank_card_id_digest in", values, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestNotIn(List<String> values) {
            addCriterion("receiver_bank_card_id_digest not in", values, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestBetween(String value1, String value2) {
            addCriterion("receiver_bank_card_id_digest between", value1, value2, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestNotBetween(String value1, String value2) {
            addCriterion("receiver_bank_card_id_digest not between", value1, value2, "receiverBankCardIdDigest");
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

        public Criteria andReceiverBankBranchIsNull() {
            addCriterion("receiver_bank_branch is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchIsNotNull() {
            addCriterion("receiver_bank_branch is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchEqualTo(String value) {
            addCriterion("receiver_bank_branch =", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchNotEqualTo(String value) {
            addCriterion("receiver_bank_branch <>", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchGreaterThan(String value) {
            addCriterion("receiver_bank_branch >", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_bank_branch >=", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchLessThan(String value) {
            addCriterion("receiver_bank_branch <", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchLessThanOrEqualTo(String value) {
            addCriterion("receiver_bank_branch <=", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchLike(String value) {
            addCriterion("receiver_bank_branch like", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchNotLike(String value) {
            addCriterion("receiver_bank_branch not like", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchIn(List<String> values) {
            addCriterion("receiver_bank_branch in", values, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchNotIn(List<String> values) {
            addCriterion("receiver_bank_branch not in", values, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchBetween(String value1, String value2) {
            addCriterion("receiver_bank_branch between", value1, value2, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchNotBetween(String value1, String value2) {
            addCriterion("receiver_bank_branch not between", value1, value2, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeIsNull() {
            addCriterion("receiver_country_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeIsNotNull() {
            addCriterion("receiver_country_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeEqualTo(String value) {
            addCriterion("receiver_country_code =", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeNotEqualTo(String value) {
            addCriterion("receiver_country_code <>", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeGreaterThan(String value) {
            addCriterion("receiver_country_code >", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_country_code >=", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeLessThan(String value) {
            addCriterion("receiver_country_code <", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("receiver_country_code <=", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeLike(String value) {
            addCriterion("receiver_country_code like", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeNotLike(String value) {
            addCriterion("receiver_country_code not like", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeIn(List<String> values) {
            addCriterion("receiver_country_code in", values, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeNotIn(List<String> values) {
            addCriterion("receiver_country_code not in", values, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeBetween(String value1, String value2) {
            addCriterion("receiver_country_code between", value1, value2, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeNotBetween(String value1, String value2) {
            addCriterion("receiver_country_code not between", value1, value2, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnIsNull() {
            addCriterion("receiver_country_name_en is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnIsNotNull() {
            addCriterion("receiver_country_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnEqualTo(String value) {
            addCriterion("receiver_country_name_en =", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnNotEqualTo(String value) {
            addCriterion("receiver_country_name_en <>", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnGreaterThan(String value) {
            addCriterion("receiver_country_name_en >", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_country_name_en >=", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnLessThan(String value) {
            addCriterion("receiver_country_name_en <", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnLessThanOrEqualTo(String value) {
            addCriterion("receiver_country_name_en <=", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnLike(String value) {
            addCriterion("receiver_country_name_en like", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnNotLike(String value) {
            addCriterion("receiver_country_name_en not like", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnIn(List<String> values) {
            addCriterion("receiver_country_name_en in", values, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnNotIn(List<String> values) {
            addCriterion("receiver_country_name_en not in", values, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnBetween(String value1, String value2) {
            addCriterion("receiver_country_name_en between", value1, value2, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnNotBetween(String value1, String value2) {
            addCriterion("receiver_country_name_en not between", value1, value2, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhIsNull() {
            addCriterion("receiver_country_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhIsNotNull() {
            addCriterion("receiver_country_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhEqualTo(String value) {
            addCriterion("receiver_country_name_zh =", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhNotEqualTo(String value) {
            addCriterion("receiver_country_name_zh <>", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhGreaterThan(String value) {
            addCriterion("receiver_country_name_zh >", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_country_name_zh >=", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhLessThan(String value) {
            addCriterion("receiver_country_name_zh <", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhLessThanOrEqualTo(String value) {
            addCriterion("receiver_country_name_zh <=", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhLike(String value) {
            addCriterion("receiver_country_name_zh like", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhNotLike(String value) {
            addCriterion("receiver_country_name_zh not like", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhIn(List<String> values) {
            addCriterion("receiver_country_name_zh in", values, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhNotIn(List<String> values) {
            addCriterion("receiver_country_name_zh not in", values, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhBetween(String value1, String value2) {
            addCriterion("receiver_country_name_zh between", value1, value2, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhNotBetween(String value1, String value2) {
            addCriterion("receiver_country_name_zh not between", value1, value2, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeIsNull() {
            addCriterion("receiver_country_alph2_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeIsNotNull() {
            addCriterion("receiver_country_alph2_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeEqualTo(String value) {
            addCriterion("receiver_country_alph2_code =", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeNotEqualTo(String value) {
            addCriterion("receiver_country_alph2_code <>", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeGreaterThan(String value) {
            addCriterion("receiver_country_alph2_code >", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_country_alph2_code >=", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeLessThan(String value) {
            addCriterion("receiver_country_alph2_code <", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeLessThanOrEqualTo(String value) {
            addCriterion("receiver_country_alph2_code <=", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeLike(String value) {
            addCriterion("receiver_country_alph2_code like", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeNotLike(String value) {
            addCriterion("receiver_country_alph2_code not like", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeIn(List<String> values) {
            addCriterion("receiver_country_alph2_code in", values, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeNotIn(List<String> values) {
            addCriterion("receiver_country_alph2_code not in", values, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeBetween(String value1, String value2) {
            addCriterion("receiver_country_alph2_code between", value1, value2, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeNotBetween(String value1, String value2) {
            addCriterion("receiver_country_alph2_code not between", value1, value2, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeIsNull() {
            addCriterion("receiver_country_alph3_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeIsNotNull() {
            addCriterion("receiver_country_alph3_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeEqualTo(String value) {
            addCriterion("receiver_country_alph3_code =", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeNotEqualTo(String value) {
            addCriterion("receiver_country_alph3_code <>", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeGreaterThan(String value) {
            addCriterion("receiver_country_alph3_code >", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_country_alph3_code >=", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeLessThan(String value) {
            addCriterion("receiver_country_alph3_code <", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeLessThanOrEqualTo(String value) {
            addCriterion("receiver_country_alph3_code <=", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeLike(String value) {
            addCriterion("receiver_country_alph3_code like", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeNotLike(String value) {
            addCriterion("receiver_country_alph3_code not like", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeIn(List<String> values) {
            addCriterion("receiver_country_alph3_code in", values, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeNotIn(List<String> values) {
            addCriterion("receiver_country_alph3_code not in", values, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeBetween(String value1, String value2) {
            addCriterion("receiver_country_alph3_code between", value1, value2, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeNotBetween(String value1, String value2) {
            addCriterion("receiver_country_alph3_code not between", value1, value2, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
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
     * 出款交易订单表
     *
     * @author wcyong
     *
     * @date 2023-01-19
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
