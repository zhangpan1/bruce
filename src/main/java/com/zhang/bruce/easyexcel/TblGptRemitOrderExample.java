package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblGptRemitOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblGptRemitOrderExample() {
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
     * null
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("PRODUCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("PRODUCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("PRODUCT_CODE =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_CODE <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("PRODUCT_CODE >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("PRODUCT_CODE <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("PRODUCT_CODE like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("PRODUCT_CODE not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("PRODUCT_CODE in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("PRODUCT_CODE not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNull() {
            addCriterion("BUSINESS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNotNull() {
            addCriterion("BUSINESS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeEqualTo(String value) {
            addCriterion("BUSINESS_CODE =", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotEqualTo(String value) {
            addCriterion("BUSINESS_CODE <>", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThan(String value) {
            addCriterion("BUSINESS_CODE >", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_CODE >=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThan(String value) {
            addCriterion("BUSINESS_CODE <", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_CODE <=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLike(String value) {
            addCriterion("BUSINESS_CODE like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotLike(String value) {
            addCriterion("BUSINESS_CODE not like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIn(List<String> values) {
            addCriterion("BUSINESS_CODE in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotIn(List<String> values) {
            addCriterion("BUSINESS_CODE not in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeBetween(String value1, String value2) {
            addCriterion("BUSINESS_CODE between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_CODE not between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andSequenceIdIsNull() {
            addCriterion("SEQUENCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIdIsNotNull() {
            addCriterion("SEQUENCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceIdEqualTo(String value) {
            addCriterion("SEQUENCE_ID =", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotEqualTo(String value) {
            addCriterion("SEQUENCE_ID <>", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdGreaterThan(String value) {
            addCriterion("SEQUENCE_ID >", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("SEQUENCE_ID >=", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdLessThan(String value) {
            addCriterion("SEQUENCE_ID <", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdLessThanOrEqualTo(String value) {
            addCriterion("SEQUENCE_ID <=", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdLike(String value) {
            addCriterion("SEQUENCE_ID like", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotLike(String value) {
            addCriterion("SEQUENCE_ID not like", value, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdIn(List<String> values) {
            addCriterion("SEQUENCE_ID in", values, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotIn(List<String> values) {
            addCriterion("SEQUENCE_ID not in", values, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdBetween(String value1, String value2) {
            addCriterion("SEQUENCE_ID between", value1, value2, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andSequenceIdNotBetween(String value1, String value2) {
            addCriterion("SEQUENCE_ID not between", value1, value2, "sequenceId");
            return (Criteria) this;
        }

        public Criteria andAllotTypeIsNull() {
            addCriterion("ALLOT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAllotTypeIsNotNull() {
            addCriterion("ALLOT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAllotTypeEqualTo(String value) {
            addCriterion("ALLOT_TYPE =", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotEqualTo(String value) {
            addCriterion("ALLOT_TYPE <>", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeGreaterThan(String value) {
            addCriterion("ALLOT_TYPE >", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOT_TYPE >=", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeLessThan(String value) {
            addCriterion("ALLOT_TYPE <", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeLessThanOrEqualTo(String value) {
            addCriterion("ALLOT_TYPE <=", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeLike(String value) {
            addCriterion("ALLOT_TYPE like", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotLike(String value) {
            addCriterion("ALLOT_TYPE not like", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeIn(List<String> values) {
            addCriterion("ALLOT_TYPE in", values, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotIn(List<String> values) {
            addCriterion("ALLOT_TYPE not in", values, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeBetween(String value1, String value2) {
            addCriterion("ALLOT_TYPE between", value1, value2, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotBetween(String value1, String value2) {
            addCriterion("ALLOT_TYPE not between", value1, value2, "allotType");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("DATA_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("DATA_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("DATA_SOURCE =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("DATA_SOURCE <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("DATA_SOURCE >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("DATA_SOURCE <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("DATA_SOURCE like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("DATA_SOURCE not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("DATA_SOURCE in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("DATA_SOURCE not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNull() {
            addCriterion("REQUEST_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("REQUEST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(String value) {
            addCriterion("REQUEST_ID =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(String value) {
            addCriterion("REQUEST_ID <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(String value) {
            addCriterion("REQUEST_ID >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_ID >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(String value) {
            addCriterion("REQUEST_ID <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_ID <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLike(String value) {
            addCriterion("REQUEST_ID like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotLike(String value) {
            addCriterion("REQUEST_ID not like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<String> values) {
            addCriterion("REQUEST_ID in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<String> values) {
            addCriterion("REQUEST_ID not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(String value1, String value2) {
            addCriterion("REQUEST_ID between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(String value1, String value2) {
            addCriterion("REQUEST_ID not between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("MERCHANT_NO is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("MERCHANT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("MERCHANT_NO =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("MERCHANT_NO <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("MERCHANT_NO >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NO >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("MERCHANT_NO <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NO <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("MERCHANT_NO like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("MERCHANT_NO not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("MERCHANT_NO in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("MERCHANT_NO not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("MERCHANT_NO between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_NO not between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andSignNameIsNull() {
            addCriterion("SIGN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSignNameIsNotNull() {
            addCriterion("SIGN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSignNameEqualTo(String value) {
            addCriterion("SIGN_NAME =", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotEqualTo(String value) {
            addCriterion("SIGN_NAME <>", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameGreaterThan(String value) {
            addCriterion("SIGN_NAME >", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_NAME >=", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLessThan(String value) {
            addCriterion("SIGN_NAME <", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLessThanOrEqualTo(String value) {
            addCriterion("SIGN_NAME <=", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLike(String value) {
            addCriterion("SIGN_NAME like", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotLike(String value) {
            addCriterion("SIGN_NAME not like", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameIn(List<String> values) {
            addCriterion("SIGN_NAME in", values, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotIn(List<String> values) {
            addCriterion("SIGN_NAME not in", values, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameBetween(String value1, String value2) {
            addCriterion("SIGN_NAME between", value1, value2, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotBetween(String value1, String value2) {
            addCriterion("SIGN_NAME not between", value1, value2, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameEnIsNull() {
            addCriterion("SIGN_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andSignNameEnIsNotNull() {
            addCriterion("SIGN_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andSignNameEnEqualTo(String value) {
            addCriterion("SIGN_NAME_EN =", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnNotEqualTo(String value) {
            addCriterion("SIGN_NAME_EN <>", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnGreaterThan(String value) {
            addCriterion("SIGN_NAME_EN >", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_NAME_EN >=", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnLessThan(String value) {
            addCriterion("SIGN_NAME_EN <", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnLessThanOrEqualTo(String value) {
            addCriterion("SIGN_NAME_EN <=", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnLike(String value) {
            addCriterion("SIGN_NAME_EN like", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnNotLike(String value) {
            addCriterion("SIGN_NAME_EN not like", value, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnIn(List<String> values) {
            addCriterion("SIGN_NAME_EN in", values, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnNotIn(List<String> values) {
            addCriterion("SIGN_NAME_EN not in", values, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnBetween(String value1, String value2) {
            addCriterion("SIGN_NAME_EN between", value1, value2, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andSignNameEnNotBetween(String value1, String value2) {
            addCriterion("SIGN_NAME_EN not between", value1, value2, "signNameEn");
            return (Criteria) this;
        }

        public Criteria andMerchantKycIsNull() {
            addCriterion("MERCHANT_KYC is null");
            return (Criteria) this;
        }

        public Criteria andMerchantKycIsNotNull() {
            addCriterion("MERCHANT_KYC is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantKycEqualTo(String value) {
            addCriterion("MERCHANT_KYC =", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycNotEqualTo(String value) {
            addCriterion("MERCHANT_KYC <>", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycGreaterThan(String value) {
            addCriterion("MERCHANT_KYC >", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_KYC >=", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycLessThan(String value) {
            addCriterion("MERCHANT_KYC <", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_KYC <=", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycLike(String value) {
            addCriterion("MERCHANT_KYC like", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycNotLike(String value) {
            addCriterion("MERCHANT_KYC not like", value, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycIn(List<String> values) {
            addCriterion("MERCHANT_KYC in", values, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycNotIn(List<String> values) {
            addCriterion("MERCHANT_KYC not in", values, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycBetween(String value1, String value2) {
            addCriterion("MERCHANT_KYC between", value1, value2, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_KYC not between", value1, value2, "merchantKyc");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubIsNull() {
            addCriterion("MERCHANT_KYC_SUB is null");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubIsNotNull() {
            addCriterion("MERCHANT_KYC_SUB is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubEqualTo(String value) {
            addCriterion("MERCHANT_KYC_SUB =", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubNotEqualTo(String value) {
            addCriterion("MERCHANT_KYC_SUB <>", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubGreaterThan(String value) {
            addCriterion("MERCHANT_KYC_SUB >", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_KYC_SUB >=", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubLessThan(String value) {
            addCriterion("MERCHANT_KYC_SUB <", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_KYC_SUB <=", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubLike(String value) {
            addCriterion("MERCHANT_KYC_SUB like", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubNotLike(String value) {
            addCriterion("MERCHANT_KYC_SUB not like", value, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubIn(List<String> values) {
            addCriterion("MERCHANT_KYC_SUB in", values, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubNotIn(List<String> values) {
            addCriterion("MERCHANT_KYC_SUB not in", values, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubBetween(String value1, String value2) {
            addCriterion("MERCHANT_KYC_SUB between", value1, value2, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMerchantKycSubNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_KYC_SUB not between", value1, value2, "merchantKycSub");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("MEMBER_ID like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("IP_ADDRESS =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("IP_ADDRESS <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("IP_ADDRESS >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("IP_ADDRESS <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("IP_ADDRESS like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("IP_ADDRESS not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("IP_ADDRESS in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("IP_ADDRESS not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAreaIsNull() {
            addCriterion("IP_AREA is null");
            return (Criteria) this;
        }

        public Criteria andIpAreaIsNotNull() {
            addCriterion("IP_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andIpAreaEqualTo(String value) {
            addCriterion("IP_AREA =", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaNotEqualTo(String value) {
            addCriterion("IP_AREA <>", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaGreaterThan(String value) {
            addCriterion("IP_AREA >", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaGreaterThanOrEqualTo(String value) {
            addCriterion("IP_AREA >=", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaLessThan(String value) {
            addCriterion("IP_AREA <", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaLessThanOrEqualTo(String value) {
            addCriterion("IP_AREA <=", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaLike(String value) {
            addCriterion("IP_AREA like", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaNotLike(String value) {
            addCriterion("IP_AREA not like", value, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaIn(List<String> values) {
            addCriterion("IP_AREA in", values, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaNotIn(List<String> values) {
            addCriterion("IP_AREA not in", values, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaBetween(String value1, String value2) {
            addCriterion("IP_AREA between", value1, value2, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpAreaNotBetween(String value1, String value2) {
            addCriterion("IP_AREA not between", value1, value2, "ipArea");
            return (Criteria) this;
        }

        public Criteria andIpProxyIsNull() {
            addCriterion("IP_PROXY is null");
            return (Criteria) this;
        }

        public Criteria andIpProxyIsNotNull() {
            addCriterion("IP_PROXY is not null");
            return (Criteria) this;
        }

        public Criteria andIpProxyEqualTo(String value) {
            addCriterion("IP_PROXY =", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyNotEqualTo(String value) {
            addCriterion("IP_PROXY <>", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyGreaterThan(String value) {
            addCriterion("IP_PROXY >", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyGreaterThanOrEqualTo(String value) {
            addCriterion("IP_PROXY >=", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyLessThan(String value) {
            addCriterion("IP_PROXY <", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyLessThanOrEqualTo(String value) {
            addCriterion("IP_PROXY <=", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyLike(String value) {
            addCriterion("IP_PROXY like", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyNotLike(String value) {
            addCriterion("IP_PROXY not like", value, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyIn(List<String> values) {
            addCriterion("IP_PROXY in", values, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyNotIn(List<String> values) {
            addCriterion("IP_PROXY not in", values, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyBetween(String value1, String value2) {
            addCriterion("IP_PROXY between", value1, value2, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andIpProxyNotBetween(String value1, String value2) {
            addCriterion("IP_PROXY not between", value1, value2, "ipProxy");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("SUPPLIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("SUPPLIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("SUPPLIER_NAME =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("SUPPLIER_NAME >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("SUPPLIER_NAME <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("SUPPLIER_NAME like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("SUPPLIER_NAME not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("SUPPLIER_NAME in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("SUPPLIER_NAME not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestIsNull() {
            addCriterion("SUPPLIER_NAME_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestIsNotNull() {
            addCriterion("SUPPLIER_NAME_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestEqualTo(String value) {
            addCriterion("SUPPLIER_NAME_DIGEST =", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestNotEqualTo(String value) {
            addCriterion("SUPPLIER_NAME_DIGEST <>", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestGreaterThan(String value) {
            addCriterion("SUPPLIER_NAME_DIGEST >", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME_DIGEST >=", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestLessThan(String value) {
            addCriterion("SUPPLIER_NAME_DIGEST <", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME_DIGEST <=", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestLike(String value) {
            addCriterion("SUPPLIER_NAME_DIGEST like", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestNotLike(String value) {
            addCriterion("SUPPLIER_NAME_DIGEST not like", value, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestIn(List<String> values) {
            addCriterion("SUPPLIER_NAME_DIGEST in", values, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestNotIn(List<String> values) {
            addCriterion("SUPPLIER_NAME_DIGEST not in", values, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME_DIGEST between", value1, value2, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andSupplierNameDigestNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME_DIGEST not between", value1, value2, "supplierNameDigest");
            return (Criteria) this;
        }

        public Criteria andDeclareIdIsNull() {
            addCriterion("DECLARE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeclareIdIsNotNull() {
            addCriterion("DECLARE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareIdEqualTo(String value) {
            addCriterion("DECLARE_ID =", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdNotEqualTo(String value) {
            addCriterion("DECLARE_ID <>", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdGreaterThan(String value) {
            addCriterion("DECLARE_ID >", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdGreaterThanOrEqualTo(String value) {
            addCriterion("DECLARE_ID >=", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdLessThan(String value) {
            addCriterion("DECLARE_ID <", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdLessThanOrEqualTo(String value) {
            addCriterion("DECLARE_ID <=", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdLike(String value) {
            addCriterion("DECLARE_ID like", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdNotLike(String value) {
            addCriterion("DECLARE_ID not like", value, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdIn(List<String> values) {
            addCriterion("DECLARE_ID in", values, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdNotIn(List<String> values) {
            addCriterion("DECLARE_ID not in", values, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdBetween(String value1, String value2) {
            addCriterion("DECLARE_ID between", value1, value2, "declareId");
            return (Criteria) this;
        }

        public Criteria andDeclareIdNotBetween(String value1, String value2) {
            addCriterion("DECLARE_ID not between", value1, value2, "declareId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("TRADE_TYPE =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("TRADE_TYPE <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("TRADE_TYPE >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("TRADE_TYPE <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("TRADE_TYPE like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("TRADE_TYPE not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("TRADE_TYPE in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("TRADE_TYPE not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("ACCOUNT_NAME =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("ACCOUNT_NAME >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("ACCOUNT_NAME <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("ACCOUNT_NAME like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("ACCOUNT_NAME not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("ACCOUNT_NAME in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("ACCOUNT_NAME not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andTradeModeIsNull() {
            addCriterion("TRADE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andTradeModeIsNotNull() {
            addCriterion("TRADE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeModeEqualTo(String value) {
            addCriterion("TRADE_MODE =", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotEqualTo(String value) {
            addCriterion("TRADE_MODE <>", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeGreaterThan(String value) {
            addCriterion("TRADE_MODE >", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_MODE >=", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLessThan(String value) {
            addCriterion("TRADE_MODE <", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLessThanOrEqualTo(String value) {
            addCriterion("TRADE_MODE <=", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLike(String value) {
            addCriterion("TRADE_MODE like", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotLike(String value) {
            addCriterion("TRADE_MODE not like", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeIn(List<String> values) {
            addCriterion("TRADE_MODE in", values, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotIn(List<String> values) {
            addCriterion("TRADE_MODE not in", values, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeBetween(String value1, String value2) {
            addCriterion("TRADE_MODE between", value1, value2, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotBetween(String value1, String value2) {
            addCriterion("TRADE_MODE not between", value1, value2, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andIsSettlementIsNull() {
            addCriterion("IS_SETTLEMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsSettlementIsNotNull() {
            addCriterion("IS_SETTLEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsSettlementEqualTo(String value) {
            addCriterion("IS_SETTLEMENT =", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementNotEqualTo(String value) {
            addCriterion("IS_SETTLEMENT <>", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementGreaterThan(String value) {
            addCriterion("IS_SETTLEMENT >", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SETTLEMENT >=", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementLessThan(String value) {
            addCriterion("IS_SETTLEMENT <", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementLessThanOrEqualTo(String value) {
            addCriterion("IS_SETTLEMENT <=", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementLike(String value) {
            addCriterion("IS_SETTLEMENT like", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementNotLike(String value) {
            addCriterion("IS_SETTLEMENT not like", value, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementIn(List<String> values) {
            addCriterion("IS_SETTLEMENT in", values, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementNotIn(List<String> values) {
            addCriterion("IS_SETTLEMENT not in", values, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementBetween(String value1, String value2) {
            addCriterion("IS_SETTLEMENT between", value1, value2, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andIsSettlementNotBetween(String value1, String value2) {
            addCriterion("IS_SETTLEMENT not between", value1, value2, "isSettlement");
            return (Criteria) this;
        }

        public Criteria andTradeMomoIsNull() {
            addCriterion("TRADE_MOMO is null");
            return (Criteria) this;
        }

        public Criteria andTradeMomoIsNotNull() {
            addCriterion("TRADE_MOMO is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMomoEqualTo(String value) {
            addCriterion("TRADE_MOMO =", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoNotEqualTo(String value) {
            addCriterion("TRADE_MOMO <>", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoGreaterThan(String value) {
            addCriterion("TRADE_MOMO >", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_MOMO >=", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoLessThan(String value) {
            addCriterion("TRADE_MOMO <", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoLessThanOrEqualTo(String value) {
            addCriterion("TRADE_MOMO <=", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoLike(String value) {
            addCriterion("TRADE_MOMO like", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoNotLike(String value) {
            addCriterion("TRADE_MOMO not like", value, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoIn(List<String> values) {
            addCriterion("TRADE_MOMO in", values, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoNotIn(List<String> values) {
            addCriterion("TRADE_MOMO not in", values, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoBetween(String value1, String value2) {
            addCriterion("TRADE_MOMO between", value1, value2, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andTradeMomoNotBetween(String value1, String value2) {
            addCriterion("TRADE_MOMO not between", value1, value2, "tradeMomo");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("SELLER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("SELLER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("SELLER_NAME =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("SELLER_NAME <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("SELLER_NAME >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_NAME >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("SELLER_NAME <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("SELLER_NAME <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("SELLER_NAME like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("SELLER_NAME not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("SELLER_NAME in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("SELLER_NAME not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("SELLER_NAME between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("SELLER_NAME not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardIsNull() {
            addCriterion("SELLER_ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardIsNotNull() {
            addCriterion("SELLER_ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardEqualTo(String value) {
            addCriterion("SELLER_ID_CARD =", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardNotEqualTo(String value) {
            addCriterion("SELLER_ID_CARD <>", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardGreaterThan(String value) {
            addCriterion("SELLER_ID_CARD >", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_ID_CARD >=", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardLessThan(String value) {
            addCriterion("SELLER_ID_CARD <", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardLessThanOrEqualTo(String value) {
            addCriterion("SELLER_ID_CARD <=", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardLike(String value) {
            addCriterion("SELLER_ID_CARD like", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardNotLike(String value) {
            addCriterion("SELLER_ID_CARD not like", value, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardIn(List<String> values) {
            addCriterion("SELLER_ID_CARD in", values, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardNotIn(List<String> values) {
            addCriterion("SELLER_ID_CARD not in", values, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardBetween(String value1, String value2) {
            addCriterion("SELLER_ID_CARD between", value1, value2, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardNotBetween(String value1, String value2) {
            addCriterion("SELLER_ID_CARD not between", value1, value2, "sellerIdCard");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaIsNull() {
            addCriterion("SELLER_ID_CARD_AREA is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaIsNotNull() {
            addCriterion("SELLER_ID_CARD_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaEqualTo(String value) {
            addCriterion("SELLER_ID_CARD_AREA =", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaNotEqualTo(String value) {
            addCriterion("SELLER_ID_CARD_AREA <>", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaGreaterThan(String value) {
            addCriterion("SELLER_ID_CARD_AREA >", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_ID_CARD_AREA >=", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaLessThan(String value) {
            addCriterion("SELLER_ID_CARD_AREA <", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaLessThanOrEqualTo(String value) {
            addCriterion("SELLER_ID_CARD_AREA <=", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaLike(String value) {
            addCriterion("SELLER_ID_CARD_AREA like", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaNotLike(String value) {
            addCriterion("SELLER_ID_CARD_AREA not like", value, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaIn(List<String> values) {
            addCriterion("SELLER_ID_CARD_AREA in", values, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaNotIn(List<String> values) {
            addCriterion("SELLER_ID_CARD_AREA not in", values, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaBetween(String value1, String value2) {
            addCriterion("SELLER_ID_CARD_AREA between", value1, value2, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andSellerIdCardAreaNotBetween(String value1, String value2) {
            addCriterion("SELLER_ID_CARD_AREA not between", value1, value2, "sellerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdIsNull() {
            addCriterion("PLATFORM_MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdIsNotNull() {
            addCriterion("PLATFORM_MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdEqualTo(String value) {
            addCriterion("PLATFORM_MEMBER_ID =", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdNotEqualTo(String value) {
            addCriterion("PLATFORM_MEMBER_ID <>", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdGreaterThan(String value) {
            addCriterion("PLATFORM_MEMBER_ID >", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM_MEMBER_ID >=", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdLessThan(String value) {
            addCriterion("PLATFORM_MEMBER_ID <", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM_MEMBER_ID <=", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdLike(String value) {
            addCriterion("PLATFORM_MEMBER_ID like", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdNotLike(String value) {
            addCriterion("PLATFORM_MEMBER_ID not like", value, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdIn(List<String> values) {
            addCriterion("PLATFORM_MEMBER_ID in", values, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdNotIn(List<String> values) {
            addCriterion("PLATFORM_MEMBER_ID not in", values, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdBetween(String value1, String value2) {
            addCriterion("PLATFORM_MEMBER_ID between", value1, value2, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andPlatformMemberIdNotBetween(String value1, String value2) {
            addCriterion("PLATFORM_MEMBER_ID not between", value1, value2, "platformMemberId");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeIsNull() {
            addCriterion("RECEIVER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeIsNotNull() {
            addCriterion("RECEIVER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeEqualTo(String value) {
            addCriterion("RECEIVER_TYPE =", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotEqualTo(String value) {
            addCriterion("RECEIVER_TYPE <>", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeGreaterThan(String value) {
            addCriterion("RECEIVER_TYPE >", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_TYPE >=", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeLessThan(String value) {
            addCriterion("RECEIVER_TYPE <", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_TYPE <=", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeLike(String value) {
            addCriterion("RECEIVER_TYPE like", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotLike(String value) {
            addCriterion("RECEIVER_TYPE not like", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeIn(List<String> values) {
            addCriterion("RECEIVER_TYPE in", values, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotIn(List<String> values) {
            addCriterion("RECEIVER_TYPE not in", values, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeBetween(String value1, String value2) {
            addCriterion("RECEIVER_TYPE between", value1, value2, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_TYPE not between", value1, value2, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeIsNull() {
            addCriterion("RECEIVER_ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeIsNotNull() {
            addCriterion("RECEIVER_ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeEqualTo(String value) {
            addCriterion("RECEIVER_ID_TYPE =", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeNotEqualTo(String value) {
            addCriterion("RECEIVER_ID_TYPE <>", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeGreaterThan(String value) {
            addCriterion("RECEIVER_ID_TYPE >", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID_TYPE >=", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeLessThan(String value) {
            addCriterion("RECEIVER_ID_TYPE <", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID_TYPE <=", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeLike(String value) {
            addCriterion("RECEIVER_ID_TYPE like", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeNotLike(String value) {
            addCriterion("RECEIVER_ID_TYPE not like", value, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeIn(List<String> values) {
            addCriterion("RECEIVER_ID_TYPE in", values, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeNotIn(List<String> values) {
            addCriterion("RECEIVER_ID_TYPE not in", values, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID_TYPE between", value1, value2, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdTypeNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID_TYPE not between", value1, value2, "receiverIdType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardIsNull() {
            addCriterion("RECEIVER_ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardIsNotNull() {
            addCriterion("RECEIVER_ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD =", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardNotEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD <>", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardGreaterThan(String value) {
            addCriterion("RECEIVER_ID_CARD >", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD >=", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardLessThan(String value) {
            addCriterion("RECEIVER_ID_CARD <", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD <=", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardLike(String value) {
            addCriterion("RECEIVER_ID_CARD like", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardNotLike(String value) {
            addCriterion("RECEIVER_ID_CARD not like", value, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardIn(List<String> values) {
            addCriterion("RECEIVER_ID_CARD in", values, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardNotIn(List<String> values) {
            addCriterion("RECEIVER_ID_CARD not in", values, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID_CARD between", value1, value2, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID_CARD not between", value1, value2, "receiverIdCard");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestIsNull() {
            addCriterion("RECEIVER_ID_CARD_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestIsNotNull() {
            addCriterion("RECEIVER_ID_CARD_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD_DIGEST =", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestNotEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD_DIGEST <>", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestGreaterThan(String value) {
            addCriterion("RECEIVER_ID_CARD_DIGEST >", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD_DIGEST >=", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestLessThan(String value) {
            addCriterion("RECEIVER_ID_CARD_DIGEST <", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD_DIGEST <=", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestLike(String value) {
            addCriterion("RECEIVER_ID_CARD_DIGEST like", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestNotLike(String value) {
            addCriterion("RECEIVER_ID_CARD_DIGEST not like", value, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestIn(List<String> values) {
            addCriterion("RECEIVER_ID_CARD_DIGEST in", values, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestNotIn(List<String> values) {
            addCriterion("RECEIVER_ID_CARD_DIGEST not in", values, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID_CARD_DIGEST between", value1, value2, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardDigestNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID_CARD_DIGEST not between", value1, value2, "receiverIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaIsNull() {
            addCriterion("RECEIVER_ID_CARD_AREA is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaIsNotNull() {
            addCriterion("RECEIVER_ID_CARD_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD_AREA =", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaNotEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD_AREA <>", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaGreaterThan(String value) {
            addCriterion("RECEIVER_ID_CARD_AREA >", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD_AREA >=", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaLessThan(String value) {
            addCriterion("RECEIVER_ID_CARD_AREA <", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID_CARD_AREA <=", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaLike(String value) {
            addCriterion("RECEIVER_ID_CARD_AREA like", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaNotLike(String value) {
            addCriterion("RECEIVER_ID_CARD_AREA not like", value, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaIn(List<String> values) {
            addCriterion("RECEIVER_ID_CARD_AREA in", values, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaNotIn(List<String> values) {
            addCriterion("RECEIVER_ID_CARD_AREA not in", values, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID_CARD_AREA between", value1, value2, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverIdCardAreaNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID_CARD_AREA not between", value1, value2, "receiverIdCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("RECEIVER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("RECEIVER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("RECEIVER_NAME =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("RECEIVER_NAME <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("RECEIVER_NAME >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_NAME >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("RECEIVER_NAME <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_NAME <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("RECEIVER_NAME like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("RECEIVER_NAME not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("RECEIVER_NAME in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("RECEIVER_NAME not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("RECEIVER_NAME between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_NAME not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestIsNull() {
            addCriterion("RECEIVER_NAME_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestIsNotNull() {
            addCriterion("RECEIVER_NAME_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestEqualTo(String value) {
            addCriterion("RECEIVER_NAME_DIGEST =", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestNotEqualTo(String value) {
            addCriterion("RECEIVER_NAME_DIGEST <>", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestGreaterThan(String value) {
            addCriterion("RECEIVER_NAME_DIGEST >", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_NAME_DIGEST >=", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestLessThan(String value) {
            addCriterion("RECEIVER_NAME_DIGEST <", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_NAME_DIGEST <=", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestLike(String value) {
            addCriterion("RECEIVER_NAME_DIGEST like", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestNotLike(String value) {
            addCriterion("RECEIVER_NAME_DIGEST not like", value, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestIn(List<String> values) {
            addCriterion("RECEIVER_NAME_DIGEST in", values, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestNotIn(List<String> values) {
            addCriterion("RECEIVER_NAME_DIGEST not in", values, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestBetween(String value1, String value2) {
            addCriterion("RECEIVER_NAME_DIGEST between", value1, value2, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverNameDigestNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_NAME_DIGEST not between", value1, value2, "receiverNameDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameIsNull() {
            addCriterion("RECEIVER_BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameIsNotNull() {
            addCriterion("RECEIVER_BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameEqualTo(String value) {
            addCriterion("RECEIVER_BANK_NAME =", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameNotEqualTo(String value) {
            addCriterion("RECEIVER_BANK_NAME <>", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameGreaterThan(String value) {
            addCriterion("RECEIVER_BANK_NAME >", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_NAME >=", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameLessThan(String value) {
            addCriterion("RECEIVER_BANK_NAME <", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_NAME <=", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameLike(String value) {
            addCriterion("RECEIVER_BANK_NAME like", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameNotLike(String value) {
            addCriterion("RECEIVER_BANK_NAME not like", value, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameIn(List<String> values) {
            addCriterion("RECEIVER_BANK_NAME in", values, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameNotIn(List<String> values) {
            addCriterion("RECEIVER_BANK_NAME not in", values, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_NAME between", value1, value2, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_NAME not between", value1, value2, "receiverBankName");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdIsNull() {
            addCriterion("RECEIVER_BANK_CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdIsNotNull() {
            addCriterion("RECEIVER_BANK_CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID =", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdNotEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID <>", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdGreaterThan(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID >", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID >=", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdLessThan(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID <", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID <=", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdLike(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID like", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdNotLike(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID not like", value, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdIn(List<String> values) {
            addCriterion("RECEIVER_BANK_CARD_ID in", values, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdNotIn(List<String> values) {
            addCriterion("RECEIVER_BANK_CARD_ID not in", values, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_CARD_ID between", value1, value2, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_CARD_ID not between", value1, value2, "receiverBankCardId");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestIsNull() {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestIsNotNull() {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST =", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestNotEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST <>", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestGreaterThan(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST >", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST >=", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestLessThan(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST <", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST <=", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestLike(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST like", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestNotLike(String value) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST not like", value, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestIn(List<String> values) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST in", values, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestNotIn(List<String> values) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST not in", values, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST between", value1, value2, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardIdDigestNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_CARD_ID_DIGEST not between", value1, value2, "receiverBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaIsNull() {
            addCriterion("RECEIVER_BANK_CARD_AREA is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaIsNotNull() {
            addCriterion("RECEIVER_BANK_CARD_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_AREA =", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaNotEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_AREA <>", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaGreaterThan(String value) {
            addCriterion("RECEIVER_BANK_CARD_AREA >", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_AREA >=", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaLessThan(String value) {
            addCriterion("RECEIVER_BANK_CARD_AREA <", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_AREA <=", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaLike(String value) {
            addCriterion("RECEIVER_BANK_CARD_AREA like", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaNotLike(String value) {
            addCriterion("RECEIVER_BANK_CARD_AREA not like", value, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaIn(List<String> values) {
            addCriterion("RECEIVER_BANK_CARD_AREA in", values, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaNotIn(List<String> values) {
            addCriterion("RECEIVER_BANK_CARD_AREA not in", values, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_CARD_AREA between", value1, value2, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardAreaNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_CARD_AREA not between", value1, value2, "receiverBankCardArea");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsIsNull() {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsIsNotNull() {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS =", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsNotEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS <>", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsGreaterThan(String value) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS >", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS >=", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsLessThan(String value) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS <", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS <=", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsLike(String value) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS like", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsNotLike(String value) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS not like", value, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsIn(List<String> values) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS in", values, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsNotIn(List<String> values) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS not in", values, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS between", value1, value2, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardNameBsNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_CARD_NAME_BS not between", value1, value2, "receiverBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsIsNull() {
            addCriterion("RECEIVER_BANK_NAME_BS is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsIsNotNull() {
            addCriterion("RECEIVER_BANK_NAME_BS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsEqualTo(String value) {
            addCriterion("RECEIVER_BANK_NAME_BS =", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsNotEqualTo(String value) {
            addCriterion("RECEIVER_BANK_NAME_BS <>", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsGreaterThan(String value) {
            addCriterion("RECEIVER_BANK_NAME_BS >", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_NAME_BS >=", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsLessThan(String value) {
            addCriterion("RECEIVER_BANK_NAME_BS <", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_NAME_BS <=", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsLike(String value) {
            addCriterion("RECEIVER_BANK_NAME_BS like", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsNotLike(String value) {
            addCriterion("RECEIVER_BANK_NAME_BS not like", value, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsIn(List<String> values) {
            addCriterion("RECEIVER_BANK_NAME_BS in", values, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsNotIn(List<String> values) {
            addCriterion("RECEIVER_BANK_NAME_BS not in", values, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_NAME_BS between", value1, value2, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankNameBsNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_NAME_BS not between", value1, value2, "receiverBankNameBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsIsNull() {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsIsNotNull() {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS =", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsNotEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS <>", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsGreaterThan(String value) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS >", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS >=", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsLessThan(String value) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS <", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS <=", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsLike(String value) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS like", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsNotLike(String value) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS not like", value, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsIn(List<String> values) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS in", values, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsNotIn(List<String> values) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS not in", values, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS between", value1, value2, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankCardTypeBsNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_CARD_TYPE_BS not between", value1, value2, "receiverBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchIsNull() {
            addCriterion("RECEIVER_BANK_BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchIsNotNull() {
            addCriterion("RECEIVER_BANK_BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchEqualTo(String value) {
            addCriterion("RECEIVER_BANK_BRANCH =", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchNotEqualTo(String value) {
            addCriterion("RECEIVER_BANK_BRANCH <>", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchGreaterThan(String value) {
            addCriterion("RECEIVER_BANK_BRANCH >", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_BRANCH >=", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchLessThan(String value) {
            addCriterion("RECEIVER_BANK_BRANCH <", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_BANK_BRANCH <=", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchLike(String value) {
            addCriterion("RECEIVER_BANK_BRANCH like", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchNotLike(String value) {
            addCriterion("RECEIVER_BANK_BRANCH not like", value, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchIn(List<String> values) {
            addCriterion("RECEIVER_BANK_BRANCH in", values, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchNotIn(List<String> values) {
            addCriterion("RECEIVER_BANK_BRANCH not in", values, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_BRANCH between", value1, value2, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverBankBranchNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_BANK_BRANCH not between", value1, value2, "receiverBankBranch");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeIsNull() {
            addCriterion("RECEIVER_COUNTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeIsNotNull() {
            addCriterion("RECEIVER_COUNTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_CODE =", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeNotEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_CODE <>", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeGreaterThan(String value) {
            addCriterion("RECEIVER_COUNTRY_CODE >", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_CODE >=", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeLessThan(String value) {
            addCriterion("RECEIVER_COUNTRY_CODE <", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_CODE <=", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeLike(String value) {
            addCriterion("RECEIVER_COUNTRY_CODE like", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeNotLike(String value) {
            addCriterion("RECEIVER_COUNTRY_CODE not like", value, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeIn(List<String> values) {
            addCriterion("RECEIVER_COUNTRY_CODE in", values, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeNotIn(List<String> values) {
            addCriterion("RECEIVER_COUNTRY_CODE not in", values, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeBetween(String value1, String value2) {
            addCriterion("RECEIVER_COUNTRY_CODE between", value1, value2, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryCodeNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_COUNTRY_CODE not between", value1, value2, "receiverCountryCode");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnIsNull() {
            addCriterion("RECEIVER_COUNTRY_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnIsNotNull() {
            addCriterion("RECEIVER_COUNTRY_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN =", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnNotEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN <>", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnGreaterThan(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN >", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN >=", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnLessThan(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN <", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN <=", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnLike(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN like", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnNotLike(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN not like", value, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnIn(List<String> values) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN in", values, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnNotIn(List<String> values) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN not in", values, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnBetween(String value1, String value2) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN between", value1, value2, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameEnNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_COUNTRY_NAME_EN not between", value1, value2, "receiverCountryNameEn");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhIsNull() {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhIsNotNull() {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH =", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhNotEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH <>", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhGreaterThan(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH >", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH >=", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhLessThan(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH <", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH <=", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhLike(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH like", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhNotLike(String value) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH not like", value, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhIn(List<String> values) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH in", values, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhNotIn(List<String> values) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH not in", values, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhBetween(String value1, String value2) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH between", value1, value2, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryNameZhNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_COUNTRY_NAME_ZH not between", value1, value2, "receiverCountryNameZh");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeIsNull() {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeIsNotNull() {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE =", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeNotEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE <>", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeGreaterThan(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE >", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE >=", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeLessThan(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE <", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE <=", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeLike(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE like", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeNotLike(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE not like", value, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeIn(List<String> values) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE in", values, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeNotIn(List<String> values) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE not in", values, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeBetween(String value1, String value2) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE between", value1, value2, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph2CodeNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_COUNTRY_ALPH2_CODE not between", value1, value2, "receiverCountryAlph2Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeIsNull() {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeIsNotNull() {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE =", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeNotEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE <>", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeGreaterThan(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE >", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE >=", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeLessThan(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE <", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE <=", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeLike(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE like", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeNotLike(String value) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE not like", value, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeIn(List<String> values) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE in", values, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeNotIn(List<String> values) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE not in", values, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeBetween(String value1, String value2) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE between", value1, value2, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverCountryAlph3CodeNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_COUNTRY_ALPH3_CODE not between", value1, value2, "receiverCountryAlph3Code");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("RECEIVER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("RECEIVER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("RECEIVER_ADDRESS =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("RECEIVER_ADDRESS <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("RECEIVER_ADDRESS >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ADDRESS >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("RECEIVER_ADDRESS <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ADDRESS <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("RECEIVER_ADDRESS like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("RECEIVER_ADDRESS not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("RECEIVER_ADDRESS in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("RECEIVER_ADDRESS not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("RECEIVER_ADDRESS between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_ADDRESS not between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountIsNull() {
            addCriterion("CNY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCnyAmountIsNotNull() {
            addCriterion("CNY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCnyAmountEqualTo(BigDecimal value) {
            addCriterion("CNY_AMOUNT =", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountNotEqualTo(BigDecimal value) {
            addCriterion("CNY_AMOUNT <>", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountGreaterThan(BigDecimal value) {
            addCriterion("CNY_AMOUNT >", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CNY_AMOUNT >=", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountLessThan(BigDecimal value) {
            addCriterion("CNY_AMOUNT <", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CNY_AMOUNT <=", value, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountIn(List<BigDecimal> values) {
            addCriterion("CNY_AMOUNT in", values, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountNotIn(List<BigDecimal> values) {
            addCriterion("CNY_AMOUNT not in", values, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CNY_AMOUNT between", value1, value2, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andCnyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CNY_AMOUNT not between", value1, value2, "cnyAmount");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("NOTIFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("NOTIFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("NOTIFY_URL =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("NOTIFY_URL <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("NOTIFY_URL >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_URL >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("NOTIFY_URL <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_URL <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("NOTIFY_URL like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("NOTIFY_URL not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("NOTIFY_URL in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("NOTIFY_URL not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("NOTIFY_URL between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_URL not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOccurTimeIsNull() {
            addCriterion("OCCUR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOccurTimeIsNotNull() {
            addCriterion("OCCUR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOccurTimeEqualTo(Date value) {
            addCriterion("OCCUR_TIME =", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeNotEqualTo(Date value) {
            addCriterion("OCCUR_TIME <>", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeGreaterThan(Date value) {
            addCriterion("OCCUR_TIME >", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OCCUR_TIME >=", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeLessThan(Date value) {
            addCriterion("OCCUR_TIME <", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeLessThanOrEqualTo(Date value) {
            addCriterion("OCCUR_TIME <=", value, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeIn(List<Date> values) {
            addCriterion("OCCUR_TIME in", values, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeNotIn(List<Date> values) {
            addCriterion("OCCUR_TIME not in", values, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeBetween(Date value1, Date value2) {
            addCriterion("OCCUR_TIME between", value1, value2, "occurTime");
            return (Criteria) this;
        }

        public Criteria andOccurTimeNotBetween(Date value1, Date value2) {
            addCriterion("OCCUR_TIME not between", value1, value2, "occurTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("COMPLETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("COMPLETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("COMPLETE_TIME =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("COMPLETE_TIME <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("COMPLETE_TIME >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COMPLETE_TIME >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("COMPLETE_TIME <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("COMPLETE_TIME <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("COMPLETE_TIME in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("COMPLETE_TIME not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("COMPLETE_TIME between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("COMPLETE_TIME not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andBlackTmIsNull() {
            addCriterion("BLACK_TM is null");
            return (Criteria) this;
        }

        public Criteria andBlackTmIsNotNull() {
            addCriterion("BLACK_TM is not null");
            return (Criteria) this;
        }

        public Criteria andBlackTmEqualTo(String value) {
            addCriterion("BLACK_TM =", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmNotEqualTo(String value) {
            addCriterion("BLACK_TM <>", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmGreaterThan(String value) {
            addCriterion("BLACK_TM >", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmGreaterThanOrEqualTo(String value) {
            addCriterion("BLACK_TM >=", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmLessThan(String value) {
            addCriterion("BLACK_TM <", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmLessThanOrEqualTo(String value) {
            addCriterion("BLACK_TM <=", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmLike(String value) {
            addCriterion("BLACK_TM like", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmNotLike(String value) {
            addCriterion("BLACK_TM not like", value, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmIn(List<String> values) {
            addCriterion("BLACK_TM in", values, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmNotIn(List<String> values) {
            addCriterion("BLACK_TM not in", values, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmBetween(String value1, String value2) {
            addCriterion("BLACK_TM between", value1, value2, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackTmNotBetween(String value1, String value2) {
            addCriterion("BLACK_TM not between", value1, value2, "blackTm");
            return (Criteria) this;
        }

        public Criteria andBlackResultIsNull() {
            addCriterion("BLACK_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andBlackResultIsNotNull() {
            addCriterion("BLACK_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andBlackResultEqualTo(String value) {
            addCriterion("BLACK_RESULT =", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultNotEqualTo(String value) {
            addCriterion("BLACK_RESULT <>", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultGreaterThan(String value) {
            addCriterion("BLACK_RESULT >", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultGreaterThanOrEqualTo(String value) {
            addCriterion("BLACK_RESULT >=", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultLessThan(String value) {
            addCriterion("BLACK_RESULT <", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultLessThanOrEqualTo(String value) {
            addCriterion("BLACK_RESULT <=", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultLike(String value) {
            addCriterion("BLACK_RESULT like", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultNotLike(String value) {
            addCriterion("BLACK_RESULT not like", value, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultIn(List<String> values) {
            addCriterion("BLACK_RESULT in", values, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultNotIn(List<String> values) {
            addCriterion("BLACK_RESULT not in", values, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultBetween(String value1, String value2) {
            addCriterion("BLACK_RESULT between", value1, value2, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultNotBetween(String value1, String value2) {
            addCriterion("BLACK_RESULT not between", value1, value2, "blackResult");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeIsNull() {
            addCriterion("BLACK_RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeIsNotNull() {
            addCriterion("BLACK_RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeEqualTo(String value) {
            addCriterion("BLACK_RESULT_CODE =", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeNotEqualTo(String value) {
            addCriterion("BLACK_RESULT_CODE <>", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeGreaterThan(String value) {
            addCriterion("BLACK_RESULT_CODE >", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BLACK_RESULT_CODE >=", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeLessThan(String value) {
            addCriterion("BLACK_RESULT_CODE <", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeLessThanOrEqualTo(String value) {
            addCriterion("BLACK_RESULT_CODE <=", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeLike(String value) {
            addCriterion("BLACK_RESULT_CODE like", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeNotLike(String value) {
            addCriterion("BLACK_RESULT_CODE not like", value, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeIn(List<String> values) {
            addCriterion("BLACK_RESULT_CODE in", values, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeNotIn(List<String> values) {
            addCriterion("BLACK_RESULT_CODE not in", values, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeBetween(String value1, String value2) {
            addCriterion("BLACK_RESULT_CODE between", value1, value2, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andBlackResultCodeNotBetween(String value1, String value2) {
            addCriterion("BLACK_RESULT_CODE not between", value1, value2, "blackResultCode");
            return (Criteria) this;
        }

        public Criteria andWhiteResultIsNull() {
            addCriterion("WHITE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andWhiteResultIsNotNull() {
            addCriterion("WHITE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteResultEqualTo(String value) {
            addCriterion("WHITE_RESULT =", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultNotEqualTo(String value) {
            addCriterion("WHITE_RESULT <>", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultGreaterThan(String value) {
            addCriterion("WHITE_RESULT >", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultGreaterThanOrEqualTo(String value) {
            addCriterion("WHITE_RESULT >=", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultLessThan(String value) {
            addCriterion("WHITE_RESULT <", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultLessThanOrEqualTo(String value) {
            addCriterion("WHITE_RESULT <=", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultLike(String value) {
            addCriterion("WHITE_RESULT like", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultNotLike(String value) {
            addCriterion("WHITE_RESULT not like", value, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultIn(List<String> values) {
            addCriterion("WHITE_RESULT in", values, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultNotIn(List<String> values) {
            addCriterion("WHITE_RESULT not in", values, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultBetween(String value1, String value2) {
            addCriterion("WHITE_RESULT between", value1, value2, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andWhiteResultNotBetween(String value1, String value2) {
            addCriterion("WHITE_RESULT not between", value1, value2, "whiteResult");
            return (Criteria) this;
        }

        public Criteria andTotalTmIsNull() {
            addCriterion("TOTAL_TM is null");
            return (Criteria) this;
        }

        public Criteria andTotalTmIsNotNull() {
            addCriterion("TOTAL_TM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTmEqualTo(String value) {
            addCriterion("TOTAL_TM =", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmNotEqualTo(String value) {
            addCriterion("TOTAL_TM <>", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmGreaterThan(String value) {
            addCriterion("TOTAL_TM >", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_TM >=", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmLessThan(String value) {
            addCriterion("TOTAL_TM <", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_TM <=", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmLike(String value) {
            addCriterion("TOTAL_TM like", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmNotLike(String value) {
            addCriterion("TOTAL_TM not like", value, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmIn(List<String> values) {
            addCriterion("TOTAL_TM in", values, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmNotIn(List<String> values) {
            addCriterion("TOTAL_TM not in", values, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmBetween(String value1, String value2) {
            addCriterion("TOTAL_TM between", value1, value2, "totalTm");
            return (Criteria) this;
        }

        public Criteria andTotalTmNotBetween(String value1, String value2) {
            addCriterion("TOTAL_TM not between", value1, value2, "totalTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmIsNull() {
            addCriterion("RULE_TM is null");
            return (Criteria) this;
        }

        public Criteria andRuleTmIsNotNull() {
            addCriterion("RULE_TM is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTmEqualTo(String value) {
            addCriterion("RULE_TM =", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmNotEqualTo(String value) {
            addCriterion("RULE_TM <>", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmGreaterThan(String value) {
            addCriterion("RULE_TM >", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_TM >=", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmLessThan(String value) {
            addCriterion("RULE_TM <", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmLessThanOrEqualTo(String value) {
            addCriterion("RULE_TM <=", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmLike(String value) {
            addCriterion("RULE_TM like", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmNotLike(String value) {
            addCriterion("RULE_TM not like", value, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmIn(List<String> values) {
            addCriterion("RULE_TM in", values, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmNotIn(List<String> values) {
            addCriterion("RULE_TM not in", values, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmBetween(String value1, String value2) {
            addCriterion("RULE_TM between", value1, value2, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleTmNotBetween(String value1, String value2) {
            addCriterion("RULE_TM not between", value1, value2, "ruleTm");
            return (Criteria) this;
        }

        public Criteria andRuleResultIsNull() {
            addCriterion("RULE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andRuleResultIsNotNull() {
            addCriterion("RULE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andRuleResultEqualTo(String value) {
            addCriterion("RULE_RESULT =", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultNotEqualTo(String value) {
            addCriterion("RULE_RESULT <>", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultGreaterThan(String value) {
            addCriterion("RULE_RESULT >", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_RESULT >=", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultLessThan(String value) {
            addCriterion("RULE_RESULT <", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultLessThanOrEqualTo(String value) {
            addCriterion("RULE_RESULT <=", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultLike(String value) {
            addCriterion("RULE_RESULT like", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultNotLike(String value) {
            addCriterion("RULE_RESULT not like", value, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultIn(List<String> values) {
            addCriterion("RULE_RESULT in", values, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultNotIn(List<String> values) {
            addCriterion("RULE_RESULT not in", values, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultBetween(String value1, String value2) {
            addCriterion("RULE_RESULT between", value1, value2, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andRuleResultNotBetween(String value1, String value2) {
            addCriterion("RULE_RESULT not between", value1, value2, "ruleResult");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleIsNull() {
            addCriterion("TRIGER_RULE is null");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleIsNotNull() {
            addCriterion("TRIGER_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleEqualTo(String value) {
            addCriterion("TRIGER_RULE =", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleNotEqualTo(String value) {
            addCriterion("TRIGER_RULE <>", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleGreaterThan(String value) {
            addCriterion("TRIGER_RULE >", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGER_RULE >=", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleLessThan(String value) {
            addCriterion("TRIGER_RULE <", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleLessThanOrEqualTo(String value) {
            addCriterion("TRIGER_RULE <=", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleLike(String value) {
            addCriterion("TRIGER_RULE like", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleNotLike(String value) {
            addCriterion("TRIGER_RULE not like", value, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleIn(List<String> values) {
            addCriterion("TRIGER_RULE in", values, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleNotIn(List<String> values) {
            addCriterion("TRIGER_RULE not in", values, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleBetween(String value1, String value2) {
            addCriterion("TRIGER_RULE between", value1, value2, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andTrigerRuleNotBetween(String value1, String value2) {
            addCriterion("TRIGER_RULE not between", value1, value2, "trigerRule");
            return (Criteria) this;
        }

        public Criteria andRuleCodesIsNull() {
            addCriterion("RULE_CODES is null");
            return (Criteria) this;
        }

        public Criteria andRuleCodesIsNotNull() {
            addCriterion("RULE_CODES is not null");
            return (Criteria) this;
        }

        public Criteria andRuleCodesEqualTo(String value) {
            addCriterion("RULE_CODES =", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesNotEqualTo(String value) {
            addCriterion("RULE_CODES <>", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesGreaterThan(String value) {
            addCriterion("RULE_CODES >", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_CODES >=", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesLessThan(String value) {
            addCriterion("RULE_CODES <", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesLessThanOrEqualTo(String value) {
            addCriterion("RULE_CODES <=", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesLike(String value) {
            addCriterion("RULE_CODES like", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesNotLike(String value) {
            addCriterion("RULE_CODES not like", value, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesIn(List<String> values) {
            addCriterion("RULE_CODES in", values, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesNotIn(List<String> values) {
            addCriterion("RULE_CODES not in", values, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesBetween(String value1, String value2) {
            addCriterion("RULE_CODES between", value1, value2, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andRuleCodesNotBetween(String value1, String value2) {
            addCriterion("RULE_CODES not between", value1, value2, "ruleCodes");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeIsNull() {
            addCriterion("SUPPORT_OPERATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeIsNotNull() {
            addCriterion("SUPPORT_OPERATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeEqualTo(String value) {
            addCriterion("SUPPORT_OPERATE_CODE =", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeNotEqualTo(String value) {
            addCriterion("SUPPORT_OPERATE_CODE <>", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeGreaterThan(String value) {
            addCriterion("SUPPORT_OPERATE_CODE >", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPORT_OPERATE_CODE >=", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeLessThan(String value) {
            addCriterion("SUPPORT_OPERATE_CODE <", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeLessThanOrEqualTo(String value) {
            addCriterion("SUPPORT_OPERATE_CODE <=", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeLike(String value) {
            addCriterion("SUPPORT_OPERATE_CODE like", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeNotLike(String value) {
            addCriterion("SUPPORT_OPERATE_CODE not like", value, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeIn(List<String> values) {
            addCriterion("SUPPORT_OPERATE_CODE in", values, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeNotIn(List<String> values) {
            addCriterion("SUPPORT_OPERATE_CODE not in", values, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeBetween(String value1, String value2) {
            addCriterion("SUPPORT_OPERATE_CODE between", value1, value2, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andSupportOperateCodeNotBetween(String value1, String value2) {
            addCriterion("SUPPORT_OPERATE_CODE not between", value1, value2, "supportOperateCode");
            return (Criteria) this;
        }

        public Criteria andBlockTypeIsNull() {
            addCriterion("BLOCK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBlockTypeIsNotNull() {
            addCriterion("BLOCK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBlockTypeEqualTo(String value) {
            addCriterion("BLOCK_TYPE =", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeNotEqualTo(String value) {
            addCriterion("BLOCK_TYPE <>", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeGreaterThan(String value) {
            addCriterion("BLOCK_TYPE >", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BLOCK_TYPE >=", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeLessThan(String value) {
            addCriterion("BLOCK_TYPE <", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeLessThanOrEqualTo(String value) {
            addCriterion("BLOCK_TYPE <=", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeLike(String value) {
            addCriterion("BLOCK_TYPE like", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeNotLike(String value) {
            addCriterion("BLOCK_TYPE not like", value, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeIn(List<String> values) {
            addCriterion("BLOCK_TYPE in", values, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeNotIn(List<String> values) {
            addCriterion("BLOCK_TYPE not in", values, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeBetween(String value1, String value2) {
            addCriterion("BLOCK_TYPE between", value1, value2, "blockType");
            return (Criteria) this;
        }

        public Criteria andBlockTypeNotBetween(String value1, String value2) {
            addCriterion("BLOCK_TYPE not between", value1, value2, "blockType");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("ERROR_CODE =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("ERROR_CODE <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("ERROR_CODE >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("ERROR_CODE <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("ERROR_CODE like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("ERROR_CODE not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("ERROR_CODE in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("ERROR_CODE not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("ERROR_CODE between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("ERROR_CODE not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNull() {
            addCriterion("ERROR_MSG is null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNotNull() {
            addCriterion("ERROR_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgEqualTo(String value) {
            addCriterion("ERROR_MSG =", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotEqualTo(String value) {
            addCriterion("ERROR_MSG <>", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThan(String value) {
            addCriterion("ERROR_MSG >", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_MSG >=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThan(String value) {
            addCriterion("ERROR_MSG <", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThanOrEqualTo(String value) {
            addCriterion("ERROR_MSG <=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLike(String value) {
            addCriterion("ERROR_MSG like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotLike(String value) {
            addCriterion("ERROR_MSG not like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIn(List<String> values) {
            addCriterion("ERROR_MSG in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotIn(List<String> values) {
            addCriterion("ERROR_MSG not in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgBetween(String value1, String value2) {
            addCriterion("ERROR_MSG between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotBetween(String value1, String value2) {
            addCriterion("ERROR_MSG not between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIsNull() {
            addCriterion("NOTIFY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIsNotNull() {
            addCriterion("NOTIFY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusEqualTo(String value) {
            addCriterion("NOTIFY_STATUS =", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotEqualTo(String value) {
            addCriterion("NOTIFY_STATUS <>", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusGreaterThan(String value) {
            addCriterion("NOTIFY_STATUS >", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_STATUS >=", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLessThan(String value) {
            addCriterion("NOTIFY_STATUS <", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_STATUS <=", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLike(String value) {
            addCriterion("NOTIFY_STATUS like", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotLike(String value) {
            addCriterion("NOTIFY_STATUS not like", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIn(List<String> values) {
            addCriterion("NOTIFY_STATUS in", values, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotIn(List<String> values) {
            addCriterion("NOTIFY_STATUS not in", values, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusBetween(String value1, String value2) {
            addCriterion("NOTIFY_STATUS between", value1, value2, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_STATUS not between", value1, value2, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyNumIsNull() {
            addCriterion("NOTIFY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andNotifyNumIsNotNull() {
            addCriterion("NOTIFY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyNumEqualTo(Integer value) {
            addCriterion("NOTIFY_NUM =", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumNotEqualTo(Integer value) {
            addCriterion("NOTIFY_NUM <>", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumGreaterThan(Integer value) {
            addCriterion("NOTIFY_NUM >", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOTIFY_NUM >=", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumLessThan(Integer value) {
            addCriterion("NOTIFY_NUM <", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumLessThanOrEqualTo(Integer value) {
            addCriterion("NOTIFY_NUM <=", value, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumIn(List<Integer> values) {
            addCriterion("NOTIFY_NUM in", values, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumNotIn(List<Integer> values) {
            addCriterion("NOTIFY_NUM not in", values, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumBetween(Integer value1, Integer value2) {
            addCriterion("NOTIFY_NUM between", value1, value2, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("NOTIFY_NUM not between", value1, value2, "notifyNum");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeIsNull() {
            addCriterion("NOTIFY_RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeIsNotNull() {
            addCriterion("NOTIFY_RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeEqualTo(String value) {
            addCriterion("NOTIFY_RESULT_CODE =", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeNotEqualTo(String value) {
            addCriterion("NOTIFY_RESULT_CODE <>", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeGreaterThan(String value) {
            addCriterion("NOTIFY_RESULT_CODE >", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_RESULT_CODE >=", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeLessThan(String value) {
            addCriterion("NOTIFY_RESULT_CODE <", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_RESULT_CODE <=", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeLike(String value) {
            addCriterion("NOTIFY_RESULT_CODE like", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeNotLike(String value) {
            addCriterion("NOTIFY_RESULT_CODE not like", value, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeIn(List<String> values) {
            addCriterion("NOTIFY_RESULT_CODE in", values, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeNotIn(List<String> values) {
            addCriterion("NOTIFY_RESULT_CODE not in", values, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeBetween(String value1, String value2) {
            addCriterion("NOTIFY_RESULT_CODE between", value1, value2, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultCodeNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_RESULT_CODE not between", value1, value2, "notifyResultCode");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgIsNull() {
            addCriterion("NOTIFY_RESULT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgIsNotNull() {
            addCriterion("NOTIFY_RESULT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgEqualTo(String value) {
            addCriterion("NOTIFY_RESULT_MSG =", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgNotEqualTo(String value) {
            addCriterion("NOTIFY_RESULT_MSG <>", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgGreaterThan(String value) {
            addCriterion("NOTIFY_RESULT_MSG >", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_RESULT_MSG >=", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgLessThan(String value) {
            addCriterion("NOTIFY_RESULT_MSG <", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_RESULT_MSG <=", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgLike(String value) {
            addCriterion("NOTIFY_RESULT_MSG like", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgNotLike(String value) {
            addCriterion("NOTIFY_RESULT_MSG not like", value, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgIn(List<String> values) {
            addCriterion("NOTIFY_RESULT_MSG in", values, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgNotIn(List<String> values) {
            addCriterion("NOTIFY_RESULT_MSG not in", values, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgBetween(String value1, String value2) {
            addCriterion("NOTIFY_RESULT_MSG between", value1, value2, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andNotifyResultMsgNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_RESULT_MSG not between", value1, value2, "notifyResultMsg");
            return (Criteria) this;
        }

        public Criteria andPayResultIsNull() {
            addCriterion("PAY_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPayResultIsNotNull() {
            addCriterion("PAY_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPayResultEqualTo(String value) {
            addCriterion("PAY_RESULT =", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotEqualTo(String value) {
            addCriterion("PAY_RESULT <>", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultGreaterThan(String value) {
            addCriterion("PAY_RESULT >", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_RESULT >=", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLessThan(String value) {
            addCriterion("PAY_RESULT <", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLessThanOrEqualTo(String value) {
            addCriterion("PAY_RESULT <=", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultLike(String value) {
            addCriterion("PAY_RESULT like", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotLike(String value) {
            addCriterion("PAY_RESULT not like", value, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultIn(List<String> values) {
            addCriterion("PAY_RESULT in", values, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotIn(List<String> values) {
            addCriterion("PAY_RESULT not in", values, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultBetween(String value1, String value2) {
            addCriterion("PAY_RESULT between", value1, value2, "payResult");
            return (Criteria) this;
        }

        public Criteria andPayResultNotBetween(String value1, String value2) {
            addCriterion("PAY_RESULT not between", value1, value2, "payResult");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIsNull() {
            addCriterion("GOODS_INFO is null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIsNotNull() {
            addCriterion("GOODS_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoEqualTo(String value) {
            addCriterion("GOODS_INFO =", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotEqualTo(String value) {
            addCriterion("GOODS_INFO <>", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoGreaterThan(String value) {
            addCriterion("GOODS_INFO >", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_INFO >=", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLessThan(String value) {
            addCriterion("GOODS_INFO <", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLessThanOrEqualTo(String value) {
            addCriterion("GOODS_INFO <=", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLike(String value) {
            addCriterion("GOODS_INFO like", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotLike(String value) {
            addCriterion("GOODS_INFO not like", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIn(List<String> values) {
            addCriterion("GOODS_INFO in", values, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotIn(List<String> values) {
            addCriterion("GOODS_INFO not in", values, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoBetween(String value1, String value2) {
            addCriterion("GOODS_INFO between", value1, value2, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotBetween(String value1, String value2) {
            addCriterion("GOODS_INFO not between", value1, value2, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * null
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
