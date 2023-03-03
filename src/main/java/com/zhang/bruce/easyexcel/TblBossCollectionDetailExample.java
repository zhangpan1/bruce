package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblBossCollectionDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblBossCollectionDetailExample() {
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
     * @date 2023-02-28
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

        public Criteria andProdIsNull() {
            addCriterion("PROD is null");
            return (Criteria) this;
        }

        public Criteria andProdIsNotNull() {
            addCriterion("PROD is not null");
            return (Criteria) this;
        }

        public Criteria andProdEqualTo(String value) {
            addCriterion("PROD =", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdNotEqualTo(String value) {
            addCriterion("PROD <>", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdGreaterThan(String value) {
            addCriterion("PROD >", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdGreaterThanOrEqualTo(String value) {
            addCriterion("PROD >=", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdLessThan(String value) {
            addCriterion("PROD <", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdLessThanOrEqualTo(String value) {
            addCriterion("PROD <=", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdLike(String value) {
            addCriterion("PROD like", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdNotLike(String value) {
            addCriterion("PROD not like", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdIn(List<String> values) {
            addCriterion("PROD in", values, "prod");
            return (Criteria) this;
        }

        public Criteria andProdNotIn(List<String> values) {
            addCriterion("PROD not in", values, "prod");
            return (Criteria) this;
        }

        public Criteria andProdBetween(String value1, String value2) {
            addCriterion("PROD between", value1, value2, "prod");
            return (Criteria) this;
        }

        public Criteria andProdNotBetween(String value1, String value2) {
            addCriterion("PROD not between", value1, value2, "prod");
            return (Criteria) this;
        }

        public Criteria andBizIsNull() {
            addCriterion("BIZ is null");
            return (Criteria) this;
        }

        public Criteria andBizIsNotNull() {
            addCriterion("BIZ is not null");
            return (Criteria) this;
        }

        public Criteria andBizEqualTo(String value) {
            addCriterion("BIZ =", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizNotEqualTo(String value) {
            addCriterion("BIZ <>", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizGreaterThan(String value) {
            addCriterion("BIZ >", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ >=", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizLessThan(String value) {
            addCriterion("BIZ <", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizLessThanOrEqualTo(String value) {
            addCriterion("BIZ <=", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizLike(String value) {
            addCriterion("BIZ like", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizNotLike(String value) {
            addCriterion("BIZ not like", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizIn(List<String> values) {
            addCriterion("BIZ in", values, "biz");
            return (Criteria) this;
        }

        public Criteria andBizNotIn(List<String> values) {
            addCriterion("BIZ not in", values, "biz");
            return (Criteria) this;
        }

        public Criteria andBizBetween(String value1, String value2) {
            addCriterion("BIZ between", value1, value2, "biz");
            return (Criteria) this;
        }

        public Criteria andBizNotBetween(String value1, String value2) {
            addCriterion("BIZ not between", value1, value2, "biz");
            return (Criteria) this;
        }

        public Criteria andMecNoIsNull() {
            addCriterion("MEC_NO is null");
            return (Criteria) this;
        }

        public Criteria andMecNoIsNotNull() {
            addCriterion("MEC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMecNoEqualTo(String value) {
            addCriterion("MEC_NO =", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoNotEqualTo(String value) {
            addCriterion("MEC_NO <>", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoGreaterThan(String value) {
            addCriterion("MEC_NO >", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoGreaterThanOrEqualTo(String value) {
            addCriterion("MEC_NO >=", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoLessThan(String value) {
            addCriterion("MEC_NO <", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoLessThanOrEqualTo(String value) {
            addCriterion("MEC_NO <=", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoLike(String value) {
            addCriterion("MEC_NO like", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoNotLike(String value) {
            addCriterion("MEC_NO not like", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoIn(List<String> values) {
            addCriterion("MEC_NO in", values, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoNotIn(List<String> values) {
            addCriterion("MEC_NO not in", values, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoBetween(String value1, String value2) {
            addCriterion("MEC_NO between", value1, value2, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoNotBetween(String value1, String value2) {
            addCriterion("MEC_NO not between", value1, value2, "mecNo");
            return (Criteria) this;
        }

        public Criteria andReqIdIsNull() {
            addCriterion("REQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andReqIdIsNotNull() {
            addCriterion("REQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReqIdEqualTo(String value) {
            addCriterion("REQ_ID =", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotEqualTo(String value) {
            addCriterion("REQ_ID <>", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdGreaterThan(String value) {
            addCriterion("REQ_ID >", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_ID >=", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLessThan(String value) {
            addCriterion("REQ_ID <", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLessThanOrEqualTo(String value) {
            addCriterion("REQ_ID <=", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLike(String value) {
            addCriterion("REQ_ID like", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotLike(String value) {
            addCriterion("REQ_ID not like", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdIn(List<String> values) {
            addCriterion("REQ_ID in", values, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotIn(List<String> values) {
            addCriterion("REQ_ID not in", values, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdBetween(String value1, String value2) {
            addCriterion("REQ_ID between", value1, value2, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotBetween(String value1, String value2) {
            addCriterion("REQ_ID not between", value1, value2, "reqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNull() {
            addCriterion("SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNotNull() {
            addCriterion("SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeqIdEqualTo(String value) {
            addCriterion("SEQ_ID =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(String value) {
            addCriterion("SEQ_ID <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(String value) {
            addCriterion("SEQ_ID >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_ID >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(String value) {
            addCriterion("SEQ_ID <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(String value) {
            addCriterion("SEQ_ID <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLike(String value) {
            addCriterion("SEQ_ID like", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotLike(String value) {
            addCriterion("SEQ_ID not like", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<String> values) {
            addCriterion("SEQ_ID in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<String> values) {
            addCriterion("SEQ_ID not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(String value1, String value2) {
            addCriterion("SEQ_ID between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(String value1, String value2) {
            addCriterion("SEQ_ID not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdIsNull() {
            addCriterion("COO_REQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andCooReqIdIsNotNull() {
            addCriterion("COO_REQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCooReqIdEqualTo(String value) {
            addCriterion("COO_REQ_ID =", value, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdNotEqualTo(String value) {
            addCriterion("COO_REQ_ID <>", value, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdGreaterThan(String value) {
            addCriterion("COO_REQ_ID >", value, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdGreaterThanOrEqualTo(String value) {
            addCriterion("COO_REQ_ID >=", value, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdLessThan(String value) {
            addCriterion("COO_REQ_ID <", value, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdLessThanOrEqualTo(String value) {
            addCriterion("COO_REQ_ID <=", value, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdLike(String value) {
            addCriterion("COO_REQ_ID like", value, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdNotLike(String value) {
            addCriterion("COO_REQ_ID not like", value, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdIn(List<String> values) {
            addCriterion("COO_REQ_ID in", values, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdNotIn(List<String> values) {
            addCriterion("COO_REQ_ID not in", values, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdBetween(String value1, String value2) {
            addCriterion("COO_REQ_ID between", value1, value2, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andCooReqIdNotBetween(String value1, String value2) {
            addCriterion("COO_REQ_ID not between", value1, value2, "cooReqId");
            return (Criteria) this;
        }

        public Criteria andAmtIsNull() {
            addCriterion("AMT is null");
            return (Criteria) this;
        }

        public Criteria andAmtIsNotNull() {
            addCriterion("AMT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtEqualTo(BigDecimal value) {
            addCriterion("AMT =", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotEqualTo(BigDecimal value) {
            addCriterion("AMT <>", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThan(BigDecimal value) {
            addCriterion("AMT >", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT >=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThan(BigDecimal value) {
            addCriterion("AMT <", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT <=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtIn(List<BigDecimal> values) {
            addCriterion("AMT in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotIn(List<BigDecimal> values) {
            addCriterion("AMT not in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT not between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNull() {
            addCriterion("PROD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("PROD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("PROD_NAME =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("PROD_NAME <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("PROD_NAME >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_NAME >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("PROD_NAME <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("PROD_NAME <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("PROD_NAME like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("PROD_NAME not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("PROD_NAME in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("PROD_NAME not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("PROD_NAME between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("PROD_NAME not between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("PAY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("PAY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("PAY_WAY =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("PAY_WAY <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("PAY_WAY >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("PAY_WAY <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("PAY_WAY like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("PAY_WAY not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("PAY_WAY in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("PAY_WAY not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("PAY_WAY between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andCrdNoIsNull() {
            addCriterion("CRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCrdNoIsNotNull() {
            addCriterion("CRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCrdNoEqualTo(String value) {
            addCriterion("CRD_NO =", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoNotEqualTo(String value) {
            addCriterion("CRD_NO <>", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoGreaterThan(String value) {
            addCriterion("CRD_NO >", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("CRD_NO >=", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoLessThan(String value) {
            addCriterion("CRD_NO <", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoLessThanOrEqualTo(String value) {
            addCriterion("CRD_NO <=", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoLike(String value) {
            addCriterion("CRD_NO like", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoNotLike(String value) {
            addCriterion("CRD_NO not like", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoIn(List<String> values) {
            addCriterion("CRD_NO in", values, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoNotIn(List<String> values) {
            addCriterion("CRD_NO not in", values, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoBetween(String value1, String value2) {
            addCriterion("CRD_NO between", value1, value2, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoNotBetween(String value1, String value2) {
            addCriterion("CRD_NO not between", value1, value2, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdTypeIsNull() {
            addCriterion("CRD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCrdTypeIsNotNull() {
            addCriterion("CRD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCrdTypeEqualTo(String value) {
            addCriterion("CRD_TYPE =", value, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeNotEqualTo(String value) {
            addCriterion("CRD_TYPE <>", value, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeGreaterThan(String value) {
            addCriterion("CRD_TYPE >", value, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CRD_TYPE >=", value, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeLessThan(String value) {
            addCriterion("CRD_TYPE <", value, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeLessThanOrEqualTo(String value) {
            addCriterion("CRD_TYPE <=", value, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeLike(String value) {
            addCriterion("CRD_TYPE like", value, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeNotLike(String value) {
            addCriterion("CRD_TYPE not like", value, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeIn(List<String> values) {
            addCriterion("CRD_TYPE in", values, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeNotIn(List<String> values) {
            addCriterion("CRD_TYPE not in", values, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeBetween(String value1, String value2) {
            addCriterion("CRD_TYPE between", value1, value2, "crdType");
            return (Criteria) this;
        }

        public Criteria andCrdTypeNotBetween(String value1, String value2) {
            addCriterion("CRD_TYPE not between", value1, value2, "crdType");
            return (Criteria) this;
        }

        public Criteria andBnkIdIsNull() {
            addCriterion("BNK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBnkIdIsNotNull() {
            addCriterion("BNK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBnkIdEqualTo(String value) {
            addCriterion("BNK_ID =", value, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdNotEqualTo(String value) {
            addCriterion("BNK_ID <>", value, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdGreaterThan(String value) {
            addCriterion("BNK_ID >", value, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdGreaterThanOrEqualTo(String value) {
            addCriterion("BNK_ID >=", value, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdLessThan(String value) {
            addCriterion("BNK_ID <", value, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdLessThanOrEqualTo(String value) {
            addCriterion("BNK_ID <=", value, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdLike(String value) {
            addCriterion("BNK_ID like", value, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdNotLike(String value) {
            addCriterion("BNK_ID not like", value, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdIn(List<String> values) {
            addCriterion("BNK_ID in", values, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdNotIn(List<String> values) {
            addCriterion("BNK_ID not in", values, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdBetween(String value1, String value2) {
            addCriterion("BNK_ID between", value1, value2, "bnkId");
            return (Criteria) this;
        }

        public Criteria andBnkIdNotBetween(String value1, String value2) {
            addCriterion("BNK_ID not between", value1, value2, "bnkId");
            return (Criteria) this;
        }

        public Criteria andUsrIdIsNull() {
            addCriterion("USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsrIdIsNotNull() {
            addCriterion("USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIdEqualTo(String value) {
            addCriterion("USR_ID =", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotEqualTo(String value) {
            addCriterion("USR_ID <>", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThan(String value) {
            addCriterion("USR_ID >", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("USR_ID >=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThan(String value) {
            addCriterion("USR_ID <", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThanOrEqualTo(String value) {
            addCriterion("USR_ID <=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLike(String value) {
            addCriterion("USR_ID like", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotLike(String value) {
            addCriterion("USR_ID not like", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdIn(List<String> values) {
            addCriterion("USR_ID in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotIn(List<String> values) {
            addCriterion("USR_ID not in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdBetween(String value1, String value2) {
            addCriterion("USR_ID between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotBetween(String value1, String value2) {
            addCriterion("USR_ID not between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andGoodsNmIsNull() {
            addCriterion("GOODS_NM is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNmIsNotNull() {
            addCriterion("GOODS_NM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNmEqualTo(String value) {
            addCriterion("GOODS_NM =", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotEqualTo(String value) {
            addCriterion("GOODS_NM <>", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmGreaterThan(String value) {
            addCriterion("GOODS_NM >", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NM >=", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmLessThan(String value) {
            addCriterion("GOODS_NM <", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NM <=", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmLike(String value) {
            addCriterion("GOODS_NM like", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotLike(String value) {
            addCriterion("GOODS_NM not like", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmIn(List<String> values) {
            addCriterion("GOODS_NM in", values, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotIn(List<String> values) {
            addCriterion("GOODS_NM not in", values, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmBetween(String value1, String value2) {
            addCriterion("GOODS_NM between", value1, value2, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotBetween(String value1, String value2) {
            addCriterion("GOODS_NM not between", value1, value2, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andOccTmIsNull() {
            addCriterion("OCC_TM is null");
            return (Criteria) this;
        }

        public Criteria andOccTmIsNotNull() {
            addCriterion("OCC_TM is not null");
            return (Criteria) this;
        }

        public Criteria andOccTmEqualTo(Date value) {
            addCriterion("OCC_TM =", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmNotEqualTo(Date value) {
            addCriterion("OCC_TM <>", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmGreaterThan(Date value) {
            addCriterion("OCC_TM >", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmGreaterThanOrEqualTo(Date value) {
            addCriterion("OCC_TM >=", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmLessThan(Date value) {
            addCriterion("OCC_TM <", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmLessThanOrEqualTo(Date value) {
            addCriterion("OCC_TM <=", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmIn(List<Date> values) {
            addCriterion("OCC_TM in", values, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmNotIn(List<Date> values) {
            addCriterion("OCC_TM not in", values, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmBetween(Date value1, Date value2) {
            addCriterion("OCC_TM between", value1, value2, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmNotBetween(Date value1, Date value2) {
            addCriterion("OCC_TM not between", value1, value2, "occTm");
            return (Criteria) this;
        }

        public Criteria andCtTmIsNull() {
            addCriterion("CT_TM is null");
            return (Criteria) this;
        }

        public Criteria andCtTmIsNotNull() {
            addCriterion("CT_TM is not null");
            return (Criteria) this;
        }

        public Criteria andCtTmEqualTo(Date value) {
            addCriterion("CT_TM =", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmNotEqualTo(Date value) {
            addCriterion("CT_TM <>", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmGreaterThan(Date value) {
            addCriterion("CT_TM >", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmGreaterThanOrEqualTo(Date value) {
            addCriterion("CT_TM >=", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmLessThan(Date value) {
            addCriterion("CT_TM <", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmLessThanOrEqualTo(Date value) {
            addCriterion("CT_TM <=", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmIn(List<Date> values) {
            addCriterion("CT_TM in", values, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmNotIn(List<Date> values) {
            addCriterion("CT_TM not in", values, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmBetween(Date value1, Date value2) {
            addCriterion("CT_TM between", value1, value2, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmNotBetween(Date value1, Date value2) {
            addCriterion("CT_TM not between", value1, value2, "ctTm");
            return (Criteria) this;
        }

        public Criteria andMfTmIsNull() {
            addCriterion("MF_TM is null");
            return (Criteria) this;
        }

        public Criteria andMfTmIsNotNull() {
            addCriterion("MF_TM is not null");
            return (Criteria) this;
        }

        public Criteria andMfTmEqualTo(Date value) {
            addCriterion("MF_TM =", value, "mfTm");
            return (Criteria) this;
        }

        public Criteria andMfTmNotEqualTo(Date value) {
            addCriterion("MF_TM <>", value, "mfTm");
            return (Criteria) this;
        }

        public Criteria andMfTmGreaterThan(Date value) {
            addCriterion("MF_TM >", value, "mfTm");
            return (Criteria) this;
        }

        public Criteria andMfTmGreaterThanOrEqualTo(Date value) {
            addCriterion("MF_TM >=", value, "mfTm");
            return (Criteria) this;
        }

        public Criteria andMfTmLessThan(Date value) {
            addCriterion("MF_TM <", value, "mfTm");
            return (Criteria) this;
        }

        public Criteria andMfTmLessThanOrEqualTo(Date value) {
            addCriterion("MF_TM <=", value, "mfTm");
            return (Criteria) this;
        }

        public Criteria andMfTmIn(List<Date> values) {
            addCriterion("MF_TM in", values, "mfTm");
            return (Criteria) this;
        }

        public Criteria andMfTmNotIn(List<Date> values) {
            addCriterion("MF_TM not in", values, "mfTm");
            return (Criteria) this;
        }

        public Criteria andMfTmBetween(Date value1, Date value2) {
            addCriterion("MF_TM between", value1, value2, "mfTm");
            return (Criteria) this;
        }

        public Criteria andMfTmNotBetween(Date value1, Date value2) {
            addCriterion("MF_TM not between", value1, value2, "mfTm");
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
     * @date 2023-02-28
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
