package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblGptDeclareOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblGptDeclareOrderDetailExample() {
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
     * @date 2023-02-05
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdIsNull() {
            addCriterion("PARENT_REQUEST_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdIsNotNull() {
            addCriterion("PARENT_REQUEST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdEqualTo(String value) {
            addCriterion("PARENT_REQUEST_ID =", value, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdNotEqualTo(String value) {
            addCriterion("PARENT_REQUEST_ID <>", value, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdGreaterThan(String value) {
            addCriterion("PARENT_REQUEST_ID >", value, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_REQUEST_ID >=", value, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdLessThan(String value) {
            addCriterion("PARENT_REQUEST_ID <", value, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_REQUEST_ID <=", value, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdLike(String value) {
            addCriterion("PARENT_REQUEST_ID like", value, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdNotLike(String value) {
            addCriterion("PARENT_REQUEST_ID not like", value, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdIn(List<String> values) {
            addCriterion("PARENT_REQUEST_ID in", values, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdNotIn(List<String> values) {
            addCriterion("PARENT_REQUEST_ID not in", values, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdBetween(String value1, String value2) {
            addCriterion("PARENT_REQUEST_ID between", value1, value2, "parentRequestId");
            return (Criteria) this;
        }

        public Criteria andParentRequestIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_REQUEST_ID not between", value1, value2, "parentRequestId");
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

        public Criteria andDeclareidIdIsNull() {
            addCriterion("DECLAREID_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdIsNotNull() {
            addCriterion("DECLAREID_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdEqualTo(String value) {
            addCriterion("DECLAREID_ID =", value, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdNotEqualTo(String value) {
            addCriterion("DECLAREID_ID <>", value, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdGreaterThan(String value) {
            addCriterion("DECLAREID_ID >", value, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdGreaterThanOrEqualTo(String value) {
            addCriterion("DECLAREID_ID >=", value, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdLessThan(String value) {
            addCriterion("DECLAREID_ID <", value, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdLessThanOrEqualTo(String value) {
            addCriterion("DECLAREID_ID <=", value, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdLike(String value) {
            addCriterion("DECLAREID_ID like", value, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdNotLike(String value) {
            addCriterion("DECLAREID_ID not like", value, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdIn(List<String> values) {
            addCriterion("DECLAREID_ID in", values, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdNotIn(List<String> values) {
            addCriterion("DECLAREID_ID not in", values, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdBetween(String value1, String value2) {
            addCriterion("DECLAREID_ID between", value1, value2, "declareidId");
            return (Criteria) this;
        }

        public Criteria andDeclareidIdNotBetween(String value1, String value2) {
            addCriterion("DECLAREID_ID not between", value1, value2, "declareidId");
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

        public Criteria andSellerWebsiteIsNull() {
            addCriterion("SELLER_WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteIsNotNull() {
            addCriterion("SELLER_WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteEqualTo(String value) {
            addCriterion("SELLER_WEBSITE =", value, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteNotEqualTo(String value) {
            addCriterion("SELLER_WEBSITE <>", value, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteGreaterThan(String value) {
            addCriterion("SELLER_WEBSITE >", value, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_WEBSITE >=", value, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteLessThan(String value) {
            addCriterion("SELLER_WEBSITE <", value, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteLessThanOrEqualTo(String value) {
            addCriterion("SELLER_WEBSITE <=", value, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteLike(String value) {
            addCriterion("SELLER_WEBSITE like", value, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteNotLike(String value) {
            addCriterion("SELLER_WEBSITE not like", value, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteIn(List<String> values) {
            addCriterion("SELLER_WEBSITE in", values, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteNotIn(List<String> values) {
            addCriterion("SELLER_WEBSITE not in", values, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteBetween(String value1, String value2) {
            addCriterion("SELLER_WEBSITE between", value1, value2, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteNotBetween(String value1, String value2) {
            addCriterion("SELLER_WEBSITE not between", value1, value2, "sellerWebsite");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainIsNull() {
            addCriterion("SELLER_WEBSITE_DOMAIN is null");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainIsNotNull() {
            addCriterion("SELLER_WEBSITE_DOMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainEqualTo(String value) {
            addCriterion("SELLER_WEBSITE_DOMAIN =", value, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainNotEqualTo(String value) {
            addCriterion("SELLER_WEBSITE_DOMAIN <>", value, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainGreaterThan(String value) {
            addCriterion("SELLER_WEBSITE_DOMAIN >", value, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_WEBSITE_DOMAIN >=", value, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainLessThan(String value) {
            addCriterion("SELLER_WEBSITE_DOMAIN <", value, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainLessThanOrEqualTo(String value) {
            addCriterion("SELLER_WEBSITE_DOMAIN <=", value, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainLike(String value) {
            addCriterion("SELLER_WEBSITE_DOMAIN like", value, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainNotLike(String value) {
            addCriterion("SELLER_WEBSITE_DOMAIN not like", value, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainIn(List<String> values) {
            addCriterion("SELLER_WEBSITE_DOMAIN in", values, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainNotIn(List<String> values) {
            addCriterion("SELLER_WEBSITE_DOMAIN not in", values, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainBetween(String value1, String value2) {
            addCriterion("SELLER_WEBSITE_DOMAIN between", value1, value2, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andSellerWebsiteDomainNotBetween(String value1, String value2) {
            addCriterion("SELLER_WEBSITE_DOMAIN not between", value1, value2, "sellerWebsiteDomain");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("CONTRACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("CONTRACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("CONTRACT_NO =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("CONTRACT_NO <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("CONTRACT_NO >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NO >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("CONTRACT_NO <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NO <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("CONTRACT_NO like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("CONTRACT_NO not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("CONTRACT_NO in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("CONTRACT_NO not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("CONTRACT_NO between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_NO not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardIsNull() {
            addCriterion("PAYER_ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardIsNotNull() {
            addCriterion("PAYER_ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardEqualTo(String value) {
            addCriterion("PAYER_ID_CARD =", value, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardNotEqualTo(String value) {
            addCriterion("PAYER_ID_CARD <>", value, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardGreaterThan(String value) {
            addCriterion("PAYER_ID_CARD >", value, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_ID_CARD >=", value, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardLessThan(String value) {
            addCriterion("PAYER_ID_CARD <", value, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardLessThanOrEqualTo(String value) {
            addCriterion("PAYER_ID_CARD <=", value, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardLike(String value) {
            addCriterion("PAYER_ID_CARD like", value, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardNotLike(String value) {
            addCriterion("PAYER_ID_CARD not like", value, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardIn(List<String> values) {
            addCriterion("PAYER_ID_CARD in", values, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardNotIn(List<String> values) {
            addCriterion("PAYER_ID_CARD not in", values, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardBetween(String value1, String value2) {
            addCriterion("PAYER_ID_CARD between", value1, value2, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardNotBetween(String value1, String value2) {
            addCriterion("PAYER_ID_CARD not between", value1, value2, "payerIdCard");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestIsNull() {
            addCriterion("PAYER_ID_CARD_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestIsNotNull() {
            addCriterion("PAYER_ID_CARD_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestEqualTo(String value) {
            addCriterion("PAYER_ID_CARD_DIGEST =", value, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestNotEqualTo(String value) {
            addCriterion("PAYER_ID_CARD_DIGEST <>", value, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestGreaterThan(String value) {
            addCriterion("PAYER_ID_CARD_DIGEST >", value, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_ID_CARD_DIGEST >=", value, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestLessThan(String value) {
            addCriterion("PAYER_ID_CARD_DIGEST <", value, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestLessThanOrEqualTo(String value) {
            addCriterion("PAYER_ID_CARD_DIGEST <=", value, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestLike(String value) {
            addCriterion("PAYER_ID_CARD_DIGEST like", value, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestNotLike(String value) {
            addCriterion("PAYER_ID_CARD_DIGEST not like", value, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestIn(List<String> values) {
            addCriterion("PAYER_ID_CARD_DIGEST in", values, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestNotIn(List<String> values) {
            addCriterion("PAYER_ID_CARD_DIGEST not in", values, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestBetween(String value1, String value2) {
            addCriterion("PAYER_ID_CARD_DIGEST between", value1, value2, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardDigestNotBetween(String value1, String value2) {
            addCriterion("PAYER_ID_CARD_DIGEST not between", value1, value2, "payerIdCardDigest");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaIsNull() {
            addCriterion("PAYER_ID_CARD_AREA is null");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaIsNotNull() {
            addCriterion("PAYER_ID_CARD_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaEqualTo(String value) {
            addCriterion("PAYER_ID_CARD_AREA =", value, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaNotEqualTo(String value) {
            addCriterion("PAYER_ID_CARD_AREA <>", value, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaGreaterThan(String value) {
            addCriterion("PAYER_ID_CARD_AREA >", value, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_ID_CARD_AREA >=", value, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaLessThan(String value) {
            addCriterion("PAYER_ID_CARD_AREA <", value, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaLessThanOrEqualTo(String value) {
            addCriterion("PAYER_ID_CARD_AREA <=", value, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaLike(String value) {
            addCriterion("PAYER_ID_CARD_AREA like", value, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaNotLike(String value) {
            addCriterion("PAYER_ID_CARD_AREA not like", value, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaIn(List<String> values) {
            addCriterion("PAYER_ID_CARD_AREA in", values, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaNotIn(List<String> values) {
            addCriterion("PAYER_ID_CARD_AREA not in", values, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaBetween(String value1, String value2) {
            addCriterion("PAYER_ID_CARD_AREA between", value1, value2, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerIdCardAreaNotBetween(String value1, String value2) {
            addCriterion("PAYER_ID_CARD_AREA not between", value1, value2, "payerIdCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNull() {
            addCriterion("PAYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNotNull() {
            addCriterion("PAYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayerNameEqualTo(String value) {
            addCriterion("PAYER_NAME =", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotEqualTo(String value) {
            addCriterion("PAYER_NAME <>", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThan(String value) {
            addCriterion("PAYER_NAME >", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_NAME >=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThan(String value) {
            addCriterion("PAYER_NAME <", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThanOrEqualTo(String value) {
            addCriterion("PAYER_NAME <=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLike(String value) {
            addCriterion("PAYER_NAME like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotLike(String value) {
            addCriterion("PAYER_NAME not like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameIn(List<String> values) {
            addCriterion("PAYER_NAME in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotIn(List<String> values) {
            addCriterion("PAYER_NAME not in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameBetween(String value1, String value2) {
            addCriterion("PAYER_NAME between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotBetween(String value1, String value2) {
            addCriterion("PAYER_NAME not between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestIsNull() {
            addCriterion("PAYER_NAME_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestIsNotNull() {
            addCriterion("PAYER_NAME_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestEqualTo(String value) {
            addCriterion("PAYER_NAME_DIGEST =", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestNotEqualTo(String value) {
            addCriterion("PAYER_NAME_DIGEST <>", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestGreaterThan(String value) {
            addCriterion("PAYER_NAME_DIGEST >", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_NAME_DIGEST >=", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestLessThan(String value) {
            addCriterion("PAYER_NAME_DIGEST <", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestLessThanOrEqualTo(String value) {
            addCriterion("PAYER_NAME_DIGEST <=", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestLike(String value) {
            addCriterion("PAYER_NAME_DIGEST like", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestNotLike(String value) {
            addCriterion("PAYER_NAME_DIGEST not like", value, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestIn(List<String> values) {
            addCriterion("PAYER_NAME_DIGEST in", values, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestNotIn(List<String> values) {
            addCriterion("PAYER_NAME_DIGEST not in", values, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestBetween(String value1, String value2) {
            addCriterion("PAYER_NAME_DIGEST between", value1, value2, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerNameDigestNotBetween(String value1, String value2) {
            addCriterion("PAYER_NAME_DIGEST not between", value1, value2, "payerNameDigest");
            return (Criteria) this;
        }

        public Criteria andPayerTypeIsNull() {
            addCriterion("PAYER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayerTypeIsNotNull() {
            addCriterion("PAYER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayerTypeEqualTo(String value) {
            addCriterion("PAYER_TYPE =", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeNotEqualTo(String value) {
            addCriterion("PAYER_TYPE <>", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeGreaterThan(String value) {
            addCriterion("PAYER_TYPE >", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_TYPE >=", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeLessThan(String value) {
            addCriterion("PAYER_TYPE <", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeLessThanOrEqualTo(String value) {
            addCriterion("PAYER_TYPE <=", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeLike(String value) {
            addCriterion("PAYER_TYPE like", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeNotLike(String value) {
            addCriterion("PAYER_TYPE not like", value, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeIn(List<String> values) {
            addCriterion("PAYER_TYPE in", values, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeNotIn(List<String> values) {
            addCriterion("PAYER_TYPE not in", values, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeBetween(String value1, String value2) {
            addCriterion("PAYER_TYPE between", value1, value2, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerTypeNotBetween(String value1, String value2) {
            addCriterion("PAYER_TYPE not between", value1, value2, "payerType");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdIsNull() {
            addCriterion("PAYER_BANK_CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdIsNotNull() {
            addCriterion("PAYER_BANK_CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_ID =", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdNotEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_ID <>", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdGreaterThan(String value) {
            addCriterion("PAYER_BANK_CARD_ID >", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_ID >=", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdLessThan(String value) {
            addCriterion("PAYER_BANK_CARD_ID <", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdLessThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_ID <=", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdLike(String value) {
            addCriterion("PAYER_BANK_CARD_ID like", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdNotLike(String value) {
            addCriterion("PAYER_BANK_CARD_ID not like", value, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdIn(List<String> values) {
            addCriterion("PAYER_BANK_CARD_ID in", values, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdNotIn(List<String> values) {
            addCriterion("PAYER_BANK_CARD_ID not in", values, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_CARD_ID between", value1, value2, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdNotBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_CARD_ID not between", value1, value2, "payerBankCardId");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestIsNull() {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestIsNotNull() {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST =", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestNotEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST <>", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestGreaterThan(String value) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST >", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST >=", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestLessThan(String value) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST <", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestLessThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST <=", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestLike(String value) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST like", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestNotLike(String value) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST not like", value, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestIn(List<String> values) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST in", values, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestNotIn(List<String> values) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST not in", values, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST between", value1, value2, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardIdDigestNotBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_CARD_ID_DIGEST not between", value1, value2, "payerBankCardIdDigest");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaIsNull() {
            addCriterion("PAYER_BANK_CARD_AREA is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaIsNotNull() {
            addCriterion("PAYER_BANK_CARD_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_AREA =", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaNotEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_AREA <>", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaGreaterThan(String value) {
            addCriterion("PAYER_BANK_CARD_AREA >", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_AREA >=", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaLessThan(String value) {
            addCriterion("PAYER_BANK_CARD_AREA <", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaLessThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_AREA <=", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaLike(String value) {
            addCriterion("PAYER_BANK_CARD_AREA like", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaNotLike(String value) {
            addCriterion("PAYER_BANK_CARD_AREA not like", value, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaIn(List<String> values) {
            addCriterion("PAYER_BANK_CARD_AREA in", values, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaNotIn(List<String> values) {
            addCriterion("PAYER_BANK_CARD_AREA not in", values, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_CARD_AREA between", value1, value2, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardAreaNotBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_CARD_AREA not between", value1, value2, "payerBankCardArea");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsIsNull() {
            addCriterion("PAYER_BANK_NAME_BS is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsIsNotNull() {
            addCriterion("PAYER_BANK_NAME_BS is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsEqualTo(String value) {
            addCriterion("PAYER_BANK_NAME_BS =", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsNotEqualTo(String value) {
            addCriterion("PAYER_BANK_NAME_BS <>", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsGreaterThan(String value) {
            addCriterion("PAYER_BANK_NAME_BS >", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_NAME_BS >=", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsLessThan(String value) {
            addCriterion("PAYER_BANK_NAME_BS <", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsLessThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_NAME_BS <=", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsLike(String value) {
            addCriterion("PAYER_BANK_NAME_BS like", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsNotLike(String value) {
            addCriterion("PAYER_BANK_NAME_BS not like", value, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsIn(List<String> values) {
            addCriterion("PAYER_BANK_NAME_BS in", values, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsNotIn(List<String> values) {
            addCriterion("PAYER_BANK_NAME_BS not in", values, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_NAME_BS between", value1, value2, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBsNotBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_NAME_BS not between", value1, value2, "payerBankNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsIsNull() {
            addCriterion("PAYER_BANK_CARD_NAME_BS is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsIsNotNull() {
            addCriterion("PAYER_BANK_CARD_NAME_BS is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_NAME_BS =", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsNotEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_NAME_BS <>", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsGreaterThan(String value) {
            addCriterion("PAYER_BANK_CARD_NAME_BS >", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_NAME_BS >=", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsLessThan(String value) {
            addCriterion("PAYER_BANK_CARD_NAME_BS <", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsLessThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_NAME_BS <=", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsLike(String value) {
            addCriterion("PAYER_BANK_CARD_NAME_BS like", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsNotLike(String value) {
            addCriterion("PAYER_BANK_CARD_NAME_BS not like", value, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsIn(List<String> values) {
            addCriterion("PAYER_BANK_CARD_NAME_BS in", values, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsNotIn(List<String> values) {
            addCriterion("PAYER_BANK_CARD_NAME_BS not in", values, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_CARD_NAME_BS between", value1, value2, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardNameBsNotBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_CARD_NAME_BS not between", value1, value2, "payerBankCardNameBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsIsNull() {
            addCriterion("PAYER_BANK_CARD_TYPE_BS is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsIsNotNull() {
            addCriterion("PAYER_BANK_CARD_TYPE_BS is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS =", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsNotEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS <>", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsGreaterThan(String value) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS >", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS >=", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsLessThan(String value) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS <", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsLessThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS <=", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsLike(String value) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS like", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsNotLike(String value) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS not like", value, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsIn(List<String> values) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS in", values, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsNotIn(List<String> values) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS not in", values, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS between", value1, value2, "payerBankCardTypeBs");
            return (Criteria) this;
        }

        public Criteria andPayerBankCardTypeBsNotBetween(String value1, String value2) {
            addCriterion("PAYER_BANK_CARD_TYPE_BS not between", value1, value2, "payerBankCardTypeBs");
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("GOODS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("GOODS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("GOODS_TYPE =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("GOODS_TYPE <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("GOODS_TYPE >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("GOODS_TYPE <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("GOODS_TYPE like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("GOODS_TYPE not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("GOODS_TYPE in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("GOODS_TYPE not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityIsNull() {
            addCriterion("GOODS_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityIsNotNull() {
            addCriterion("GOODS_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityEqualTo(Integer value) {
            addCriterion("GOODS_QUANTITY =", value, "goodsQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityNotEqualTo(Integer value) {
            addCriterion("GOODS_QUANTITY <>", value, "goodsQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityGreaterThan(Integer value) {
            addCriterion("GOODS_QUANTITY >", value, "goodsQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_QUANTITY >=", value, "goodsQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityLessThan(Integer value) {
            addCriterion("GOODS_QUANTITY <", value, "goodsQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_QUANTITY <=", value, "goodsQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityIn(List<Integer> values) {
            addCriterion("GOODS_QUANTITY in", values, "goodsQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityNotIn(List<Integer> values) {
            addCriterion("GOODS_QUANTITY not in", values, "goodsQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_QUANTITY between", value1, value2, "goodsQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodsQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_QUANTITY not between", value1, value2, "goodsQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIsNull() {
            addCriterion("EXCHANGE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIsNotNull() {
            addCriterion("EXCHANGE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonEqualTo(String value) {
            addCriterion("EXCHANGE_REASON =", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotEqualTo(String value) {
            addCriterion("EXCHANGE_REASON <>", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonGreaterThan(String value) {
            addCriterion("EXCHANGE_REASON >", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_REASON >=", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLessThan(String value) {
            addCriterion("EXCHANGE_REASON <", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_REASON <=", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLike(String value) {
            addCriterion("EXCHANGE_REASON like", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotLike(String value) {
            addCriterion("EXCHANGE_REASON not like", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIn(List<String> values) {
            addCriterion("EXCHANGE_REASON in", values, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotIn(List<String> values) {
            addCriterion("EXCHANGE_REASON not in", values, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonBetween(String value1, String value2) {
            addCriterion("EXCHANGE_REASON between", value1, value2, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotBetween(String value1, String value2) {
            addCriterion("EXCHANGE_REASON not between", value1, value2, "exchangeReason");
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

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("LOGISTICS_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("LOGISTICS_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("LOGISTICS_COMPANY =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("LOGISTICS_COMPANY <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("LOGISTICS_COMPANY >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_COMPANY >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("LOGISTICS_COMPANY <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_COMPANY <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("LOGISTICS_COMPANY like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("LOGISTICS_COMPANY not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("LOGISTICS_COMPANY in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("LOGISTICS_COMPANY not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("LOGISTICS_COMPANY between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("LOGISTICS_COMPANY not between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoIsNull() {
            addCriterion("LOGISTICS_NO is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoIsNotNull() {
            addCriterion("LOGISTICS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoEqualTo(String value) {
            addCriterion("LOGISTICS_NO =", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotEqualTo(String value) {
            addCriterion("LOGISTICS_NO <>", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoGreaterThan(String value) {
            addCriterion("LOGISTICS_NO >", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_NO >=", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoLessThan(String value) {
            addCriterion("LOGISTICS_NO <", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoLessThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_NO <=", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoLike(String value) {
            addCriterion("LOGISTICS_NO like", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotLike(String value) {
            addCriterion("LOGISTICS_NO not like", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoIn(List<String> values) {
            addCriterion("LOGISTICS_NO in", values, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotIn(List<String> values) {
            addCriterion("LOGISTICS_NO not in", values, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoBetween(String value1, String value2) {
            addCriterion("LOGISTICS_NO between", value1, value2, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotBetween(String value1, String value2) {
            addCriterion("LOGISTICS_NO not between", value1, value2, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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
     * @date 2023-02-05
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
