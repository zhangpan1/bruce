package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblRrsReqCurrentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRrsReqCurrentExample() {
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
     * @date 2023-03-30
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

        public Criteria andIpCountryIsNull() {
            addCriterion("IP_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andIpCountryIsNotNull() {
            addCriterion("IP_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIpCountryEqualTo(String value) {
            addCriterion("IP_COUNTRY =", value, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryNotEqualTo(String value) {
            addCriterion("IP_COUNTRY <>", value, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryGreaterThan(String value) {
            addCriterion("IP_COUNTRY >", value, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryGreaterThanOrEqualTo(String value) {
            addCriterion("IP_COUNTRY >=", value, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryLessThan(String value) {
            addCriterion("IP_COUNTRY <", value, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryLessThanOrEqualTo(String value) {
            addCriterion("IP_COUNTRY <=", value, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryLike(String value) {
            addCriterion("IP_COUNTRY like", value, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryNotLike(String value) {
            addCriterion("IP_COUNTRY not like", value, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryIn(List<String> values) {
            addCriterion("IP_COUNTRY in", values, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryNotIn(List<String> values) {
            addCriterion("IP_COUNTRY not in", values, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryBetween(String value1, String value2) {
            addCriterion("IP_COUNTRY between", value1, value2, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpCountryNotBetween(String value1, String value2) {
            addCriterion("IP_COUNTRY not between", value1, value2, "ipCountry");
            return (Criteria) this;
        }

        public Criteria andIpProvinceIsNull() {
            addCriterion("IP_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andIpProvinceIsNotNull() {
            addCriterion("IP_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andIpProvinceEqualTo(String value) {
            addCriterion("IP_PROVINCE =", value, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceNotEqualTo(String value) {
            addCriterion("IP_PROVINCE <>", value, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceGreaterThan(String value) {
            addCriterion("IP_PROVINCE >", value, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("IP_PROVINCE >=", value, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceLessThan(String value) {
            addCriterion("IP_PROVINCE <", value, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceLessThanOrEqualTo(String value) {
            addCriterion("IP_PROVINCE <=", value, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceLike(String value) {
            addCriterion("IP_PROVINCE like", value, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceNotLike(String value) {
            addCriterion("IP_PROVINCE not like", value, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceIn(List<String> values) {
            addCriterion("IP_PROVINCE in", values, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceNotIn(List<String> values) {
            addCriterion("IP_PROVINCE not in", values, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceBetween(String value1, String value2) {
            addCriterion("IP_PROVINCE between", value1, value2, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpProvinceNotBetween(String value1, String value2) {
            addCriterion("IP_PROVINCE not between", value1, value2, "ipProvince");
            return (Criteria) this;
        }

        public Criteria andIpCityIsNull() {
            addCriterion("IP_CITY is null");
            return (Criteria) this;
        }

        public Criteria andIpCityIsNotNull() {
            addCriterion("IP_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andIpCityEqualTo(String value) {
            addCriterion("IP_CITY =", value, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityNotEqualTo(String value) {
            addCriterion("IP_CITY <>", value, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityGreaterThan(String value) {
            addCriterion("IP_CITY >", value, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityGreaterThanOrEqualTo(String value) {
            addCriterion("IP_CITY >=", value, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityLessThan(String value) {
            addCriterion("IP_CITY <", value, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityLessThanOrEqualTo(String value) {
            addCriterion("IP_CITY <=", value, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityLike(String value) {
            addCriterion("IP_CITY like", value, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityNotLike(String value) {
            addCriterion("IP_CITY not like", value, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityIn(List<String> values) {
            addCriterion("IP_CITY in", values, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityNotIn(List<String> values) {
            addCriterion("IP_CITY not in", values, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityBetween(String value1, String value2) {
            addCriterion("IP_CITY between", value1, value2, "ipCity");
            return (Criteria) this;
        }

        public Criteria andIpCityNotBetween(String value1, String value2) {
            addCriterion("IP_CITY not between", value1, value2, "ipCity");
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

        public Criteria andRidIsNull() {
            addCriterion("RID is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("RID is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(String value) {
            addCriterion("RID =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(String value) {
            addCriterion("RID <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(String value) {
            addCriterion("RID >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(String value) {
            addCriterion("RID >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(String value) {
            addCriterion("RID <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(String value) {
            addCriterion("RID <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLike(String value) {
            addCriterion("RID like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotLike(String value) {
            addCriterion("RID not like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<String> values) {
            addCriterion("RID in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<String> values) {
            addCriterion("RID not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(String value1, String value2) {
            addCriterion("RID between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(String value1, String value2) {
            addCriterion("RID not between", value1, value2, "rid");
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

        public Criteria andUseToolIsNull() {
            addCriterion("USE_TOOL is null");
            return (Criteria) this;
        }

        public Criteria andUseToolIsNotNull() {
            addCriterion("USE_TOOL is not null");
            return (Criteria) this;
        }

        public Criteria andUseToolEqualTo(String value) {
            addCriterion("USE_TOOL =", value, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolNotEqualTo(String value) {
            addCriterion("USE_TOOL <>", value, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolGreaterThan(String value) {
            addCriterion("USE_TOOL >", value, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolGreaterThanOrEqualTo(String value) {
            addCriterion("USE_TOOL >=", value, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolLessThan(String value) {
            addCriterion("USE_TOOL <", value, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolLessThanOrEqualTo(String value) {
            addCriterion("USE_TOOL <=", value, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolLike(String value) {
            addCriterion("USE_TOOL like", value, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolNotLike(String value) {
            addCriterion("USE_TOOL not like", value, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolIn(List<String> values) {
            addCriterion("USE_TOOL in", values, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolNotIn(List<String> values) {
            addCriterion("USE_TOOL not in", values, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolBetween(String value1, String value2) {
            addCriterion("USE_TOOL between", value1, value2, "useTool");
            return (Criteria) this;
        }

        public Criteria andUseToolNotBetween(String value1, String value2) {
            addCriterion("USE_TOOL not between", value1, value2, "useTool");
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

        public Criteria andCrdAreaIsNull() {
            addCriterion("CRD_AREA is null");
            return (Criteria) this;
        }

        public Criteria andCrdAreaIsNotNull() {
            addCriterion("CRD_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andCrdAreaEqualTo(String value) {
            addCriterion("CRD_AREA =", value, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaNotEqualTo(String value) {
            addCriterion("CRD_AREA <>", value, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaGreaterThan(String value) {
            addCriterion("CRD_AREA >", value, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaGreaterThanOrEqualTo(String value) {
            addCriterion("CRD_AREA >=", value, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaLessThan(String value) {
            addCriterion("CRD_AREA <", value, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaLessThanOrEqualTo(String value) {
            addCriterion("CRD_AREA <=", value, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaLike(String value) {
            addCriterion("CRD_AREA like", value, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaNotLike(String value) {
            addCriterion("CRD_AREA not like", value, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaIn(List<String> values) {
            addCriterion("CRD_AREA in", values, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaNotIn(List<String> values) {
            addCriterion("CRD_AREA not in", values, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaBetween(String value1, String value2) {
            addCriterion("CRD_AREA between", value1, value2, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdAreaNotBetween(String value1, String value2) {
            addCriterion("CRD_AREA not between", value1, value2, "crdArea");
            return (Criteria) this;
        }

        public Criteria andCrdTypIsNull() {
            addCriterion("CRD_TYP is null");
            return (Criteria) this;
        }

        public Criteria andCrdTypIsNotNull() {
            addCriterion("CRD_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andCrdTypEqualTo(String value) {
            addCriterion("CRD_TYP =", value, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypNotEqualTo(String value) {
            addCriterion("CRD_TYP <>", value, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypGreaterThan(String value) {
            addCriterion("CRD_TYP >", value, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypGreaterThanOrEqualTo(String value) {
            addCriterion("CRD_TYP >=", value, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypLessThan(String value) {
            addCriterion("CRD_TYP <", value, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypLessThanOrEqualTo(String value) {
            addCriterion("CRD_TYP <=", value, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypLike(String value) {
            addCriterion("CRD_TYP like", value, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypNotLike(String value) {
            addCriterion("CRD_TYP not like", value, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypIn(List<String> values) {
            addCriterion("CRD_TYP in", values, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypNotIn(List<String> values) {
            addCriterion("CRD_TYP not in", values, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypBetween(String value1, String value2) {
            addCriterion("CRD_TYP between", value1, value2, "crdTyp");
            return (Criteria) this;
        }

        public Criteria andCrdTypNotBetween(String value1, String value2) {
            addCriterion("CRD_TYP not between", value1, value2, "crdTyp");
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

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileAreaIsNull() {
            addCriterion("MOBILE_AREA is null");
            return (Criteria) this;
        }

        public Criteria andMobileAreaIsNotNull() {
            addCriterion("MOBILE_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAreaEqualTo(String value) {
            addCriterion("MOBILE_AREA =", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaNotEqualTo(String value) {
            addCriterion("MOBILE_AREA <>", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaGreaterThan(String value) {
            addCriterion("MOBILE_AREA >", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_AREA >=", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaLessThan(String value) {
            addCriterion("MOBILE_AREA <", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_AREA <=", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaLike(String value) {
            addCriterion("MOBILE_AREA like", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaNotLike(String value) {
            addCriterion("MOBILE_AREA not like", value, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaIn(List<String> values) {
            addCriterion("MOBILE_AREA in", values, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaNotIn(List<String> values) {
            addCriterion("MOBILE_AREA not in", values, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaBetween(String value1, String value2) {
            addCriterion("MOBILE_AREA between", value1, value2, "mobileArea");
            return (Criteria) this;
        }

        public Criteria andMobileAreaNotBetween(String value1, String value2) {
            addCriterion("MOBILE_AREA not between", value1, value2, "mobileArea");
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

        public Criteria andPayIdIsNull() {
            addCriterion("PAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("PAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("PAY_ID =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("PAY_ID <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("PAY_ID >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ID >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("PAY_ID <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_ID <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("PAY_ID like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("PAY_ID not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("PAY_ID in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("PAY_ID not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("PAY_ID between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("PAY_ID not between", value1, value2, "payId");
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

        public Criteria andUsrIpIsNull() {
            addCriterion("USR_IP is null");
            return (Criteria) this;
        }

        public Criteria andUsrIpIsNotNull() {
            addCriterion("USR_IP is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIpEqualTo(String value) {
            addCriterion("USR_IP =", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpNotEqualTo(String value) {
            addCriterion("USR_IP <>", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpGreaterThan(String value) {
            addCriterion("USR_IP >", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpGreaterThanOrEqualTo(String value) {
            addCriterion("USR_IP >=", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpLessThan(String value) {
            addCriterion("USR_IP <", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpLessThanOrEqualTo(String value) {
            addCriterion("USR_IP <=", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpLike(String value) {
            addCriterion("USR_IP like", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpNotLike(String value) {
            addCriterion("USR_IP not like", value, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpIn(List<String> values) {
            addCriterion("USR_IP in", values, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpNotIn(List<String> values) {
            addCriterion("USR_IP not in", values, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpBetween(String value1, String value2) {
            addCriterion("USR_IP between", value1, value2, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpNotBetween(String value1, String value2) {
            addCriterion("USR_IP not between", value1, value2, "usrIp");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaIsNull() {
            addCriterion("USR_IP_AREA is null");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaIsNotNull() {
            addCriterion("USR_IP_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaEqualTo(String value) {
            addCriterion("USR_IP_AREA =", value, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaNotEqualTo(String value) {
            addCriterion("USR_IP_AREA <>", value, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaGreaterThan(String value) {
            addCriterion("USR_IP_AREA >", value, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaGreaterThanOrEqualTo(String value) {
            addCriterion("USR_IP_AREA >=", value, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaLessThan(String value) {
            addCriterion("USR_IP_AREA <", value, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaLessThanOrEqualTo(String value) {
            addCriterion("USR_IP_AREA <=", value, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaLike(String value) {
            addCriterion("USR_IP_AREA like", value, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaNotLike(String value) {
            addCriterion("USR_IP_AREA not like", value, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaIn(List<String> values) {
            addCriterion("USR_IP_AREA in", values, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaNotIn(List<String> values) {
            addCriterion("USR_IP_AREA not in", values, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaBetween(String value1, String value2) {
            addCriterion("USR_IP_AREA between", value1, value2, "usrIpArea");
            return (Criteria) this;
        }

        public Criteria andUsrIpAreaNotBetween(String value1, String value2) {
            addCriterion("USR_IP_AREA not between", value1, value2, "usrIpArea");
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

        public Criteria andToolsIfIsNull() {
            addCriterion("TOOLS_IF is null");
            return (Criteria) this;
        }

        public Criteria andToolsIfIsNotNull() {
            addCriterion("TOOLS_IF is not null");
            return (Criteria) this;
        }

        public Criteria andToolsIfEqualTo(String value) {
            addCriterion("TOOLS_IF =", value, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfNotEqualTo(String value) {
            addCriterion("TOOLS_IF <>", value, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfGreaterThan(String value) {
            addCriterion("TOOLS_IF >", value, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfGreaterThanOrEqualTo(String value) {
            addCriterion("TOOLS_IF >=", value, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfLessThan(String value) {
            addCriterion("TOOLS_IF <", value, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfLessThanOrEqualTo(String value) {
            addCriterion("TOOLS_IF <=", value, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfLike(String value) {
            addCriterion("TOOLS_IF like", value, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfNotLike(String value) {
            addCriterion("TOOLS_IF not like", value, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfIn(List<String> values) {
            addCriterion("TOOLS_IF in", values, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfNotIn(List<String> values) {
            addCriterion("TOOLS_IF not in", values, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfBetween(String value1, String value2) {
            addCriterion("TOOLS_IF between", value1, value2, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andToolsIfNotBetween(String value1, String value2) {
            addCriterion("TOOLS_IF not between", value1, value2, "toolsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfIsNull() {
            addCriterion("GOODS_IF is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIfIsNotNull() {
            addCriterion("GOODS_IF is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIfEqualTo(String value) {
            addCriterion("GOODS_IF =", value, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfNotEqualTo(String value) {
            addCriterion("GOODS_IF <>", value, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfGreaterThan(String value) {
            addCriterion("GOODS_IF >", value, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_IF >=", value, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfLessThan(String value) {
            addCriterion("GOODS_IF <", value, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfLessThanOrEqualTo(String value) {
            addCriterion("GOODS_IF <=", value, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfLike(String value) {
            addCriterion("GOODS_IF like", value, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfNotLike(String value) {
            addCriterion("GOODS_IF not like", value, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfIn(List<String> values) {
            addCriterion("GOODS_IF in", values, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfNotIn(List<String> values) {
            addCriterion("GOODS_IF not in", values, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfBetween(String value1, String value2) {
            addCriterion("GOODS_IF between", value1, value2, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andGoodsIfNotBetween(String value1, String value2) {
            addCriterion("GOODS_IF not between", value1, value2, "goodsIf");
            return (Criteria) this;
        }

        public Criteria andReqIfIsNull() {
            addCriterion("REQ_IF is null");
            return (Criteria) this;
        }

        public Criteria andReqIfIsNotNull() {
            addCriterion("REQ_IF is not null");
            return (Criteria) this;
        }

        public Criteria andReqIfEqualTo(String value) {
            addCriterion("REQ_IF =", value, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfNotEqualTo(String value) {
            addCriterion("REQ_IF <>", value, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfGreaterThan(String value) {
            addCriterion("REQ_IF >", value, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_IF >=", value, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfLessThan(String value) {
            addCriterion("REQ_IF <", value, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfLessThanOrEqualTo(String value) {
            addCriterion("REQ_IF <=", value, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfLike(String value) {
            addCriterion("REQ_IF like", value, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfNotLike(String value) {
            addCriterion("REQ_IF not like", value, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfIn(List<String> values) {
            addCriterion("REQ_IF in", values, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfNotIn(List<String> values) {
            addCriterion("REQ_IF not in", values, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfBetween(String value1, String value2) {
            addCriterion("REQ_IF between", value1, value2, "reqIf");
            return (Criteria) this;
        }

        public Criteria andReqIfNotBetween(String value1, String value2) {
            addCriterion("REQ_IF not between", value1, value2, "reqIf");
            return (Criteria) this;
        }

        public Criteria andRtsTmIsNull() {
            addCriterion("RTS_TM is null");
            return (Criteria) this;
        }

        public Criteria andRtsTmIsNotNull() {
            addCriterion("RTS_TM is not null");
            return (Criteria) this;
        }

        public Criteria andRtsTmEqualTo(Integer value) {
            addCriterion("RTS_TM =", value, "rtsTm");
            return (Criteria) this;
        }

        public Criteria andRtsTmNotEqualTo(Integer value) {
            addCriterion("RTS_TM <>", value, "rtsTm");
            return (Criteria) this;
        }

        public Criteria andRtsTmGreaterThan(Integer value) {
            addCriterion("RTS_TM >", value, "rtsTm");
            return (Criteria) this;
        }

        public Criteria andRtsTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("RTS_TM >=", value, "rtsTm");
            return (Criteria) this;
        }

        public Criteria andRtsTmLessThan(Integer value) {
            addCriterion("RTS_TM <", value, "rtsTm");
            return (Criteria) this;
        }

        public Criteria andRtsTmLessThanOrEqualTo(Integer value) {
            addCriterion("RTS_TM <=", value, "rtsTm");
            return (Criteria) this;
        }

        public Criteria andRtsTmIn(List<Integer> values) {
            addCriterion("RTS_TM in", values, "rtsTm");
            return (Criteria) this;
        }

        public Criteria andRtsTmNotIn(List<Integer> values) {
            addCriterion("RTS_TM not in", values, "rtsTm");
            return (Criteria) this;
        }

        public Criteria andRtsTmBetween(Integer value1, Integer value2) {
            addCriterion("RTS_TM between", value1, value2, "rtsTm");
            return (Criteria) this;
        }

        public Criteria andRtsTmNotBetween(Integer value1, Integer value2) {
            addCriterion("RTS_TM not between", value1, value2, "rtsTm");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescIsNull() {
            addCriterion("RTS_RETDESC is null");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescIsNotNull() {
            addCriterion("RTS_RETDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescEqualTo(String value) {
            addCriterion("RTS_RETDESC =", value, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescNotEqualTo(String value) {
            addCriterion("RTS_RETDESC <>", value, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescGreaterThan(String value) {
            addCriterion("RTS_RETDESC >", value, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescGreaterThanOrEqualTo(String value) {
            addCriterion("RTS_RETDESC >=", value, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescLessThan(String value) {
            addCriterion("RTS_RETDESC <", value, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescLessThanOrEqualTo(String value) {
            addCriterion("RTS_RETDESC <=", value, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescLike(String value) {
            addCriterion("RTS_RETDESC like", value, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescNotLike(String value) {
            addCriterion("RTS_RETDESC not like", value, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescIn(List<String> values) {
            addCriterion("RTS_RETDESC in", values, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescNotIn(List<String> values) {
            addCriterion("RTS_RETDESC not in", values, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescBetween(String value1, String value2) {
            addCriterion("RTS_RETDESC between", value1, value2, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRtsRetdescNotBetween(String value1, String value2) {
            addCriterion("RTS_RETDESC not between", value1, value2, "rtsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbTmIsNull() {
            addCriterion("RLSB_TM is null");
            return (Criteria) this;
        }

        public Criteria andRlsbTmIsNotNull() {
            addCriterion("RLSB_TM is not null");
            return (Criteria) this;
        }

        public Criteria andRlsbTmEqualTo(Integer value) {
            addCriterion("RLSB_TM =", value, "rlsbTm");
            return (Criteria) this;
        }

        public Criteria andRlsbTmNotEqualTo(Integer value) {
            addCriterion("RLSB_TM <>", value, "rlsbTm");
            return (Criteria) this;
        }

        public Criteria andRlsbTmGreaterThan(Integer value) {
            addCriterion("RLSB_TM >", value, "rlsbTm");
            return (Criteria) this;
        }

        public Criteria andRlsbTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("RLSB_TM >=", value, "rlsbTm");
            return (Criteria) this;
        }

        public Criteria andRlsbTmLessThan(Integer value) {
            addCriterion("RLSB_TM <", value, "rlsbTm");
            return (Criteria) this;
        }

        public Criteria andRlsbTmLessThanOrEqualTo(Integer value) {
            addCriterion("RLSB_TM <=", value, "rlsbTm");
            return (Criteria) this;
        }

        public Criteria andRlsbTmIn(List<Integer> values) {
            addCriterion("RLSB_TM in", values, "rlsbTm");
            return (Criteria) this;
        }

        public Criteria andRlsbTmNotIn(List<Integer> values) {
            addCriterion("RLSB_TM not in", values, "rlsbTm");
            return (Criteria) this;
        }

        public Criteria andRlsbTmBetween(Integer value1, Integer value2) {
            addCriterion("RLSB_TM between", value1, value2, "rlsbTm");
            return (Criteria) this;
        }

        public Criteria andRlsbTmNotBetween(Integer value1, Integer value2) {
            addCriterion("RLSB_TM not between", value1, value2, "rlsbTm");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescIsNull() {
            addCriterion("RLSB_RETDESC is null");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescIsNotNull() {
            addCriterion("RLSB_RETDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescEqualTo(String value) {
            addCriterion("RLSB_RETDESC =", value, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescNotEqualTo(String value) {
            addCriterion("RLSB_RETDESC <>", value, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescGreaterThan(String value) {
            addCriterion("RLSB_RETDESC >", value, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescGreaterThanOrEqualTo(String value) {
            addCriterion("RLSB_RETDESC >=", value, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescLessThan(String value) {
            addCriterion("RLSB_RETDESC <", value, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescLessThanOrEqualTo(String value) {
            addCriterion("RLSB_RETDESC <=", value, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescLike(String value) {
            addCriterion("RLSB_RETDESC like", value, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescNotLike(String value) {
            addCriterion("RLSB_RETDESC not like", value, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescIn(List<String> values) {
            addCriterion("RLSB_RETDESC in", values, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescNotIn(List<String> values) {
            addCriterion("RLSB_RETDESC not in", values, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescBetween(String value1, String value2) {
            addCriterion("RLSB_RETDESC between", value1, value2, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsbRetdescNotBetween(String value1, String value2) {
            addCriterion("RLSB_RETDESC not between", value1, value2, "rlsbRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswTmIsNull() {
            addCriterion("RLSW_TM is null");
            return (Criteria) this;
        }

        public Criteria andRlswTmIsNotNull() {
            addCriterion("RLSW_TM is not null");
            return (Criteria) this;
        }

        public Criteria andRlswTmEqualTo(Integer value) {
            addCriterion("RLSW_TM =", value, "rlswTm");
            return (Criteria) this;
        }

        public Criteria andRlswTmNotEqualTo(Integer value) {
            addCriterion("RLSW_TM <>", value, "rlswTm");
            return (Criteria) this;
        }

        public Criteria andRlswTmGreaterThan(Integer value) {
            addCriterion("RLSW_TM >", value, "rlswTm");
            return (Criteria) this;
        }

        public Criteria andRlswTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("RLSW_TM >=", value, "rlswTm");
            return (Criteria) this;
        }

        public Criteria andRlswTmLessThan(Integer value) {
            addCriterion("RLSW_TM <", value, "rlswTm");
            return (Criteria) this;
        }

        public Criteria andRlswTmLessThanOrEqualTo(Integer value) {
            addCriterion("RLSW_TM <=", value, "rlswTm");
            return (Criteria) this;
        }

        public Criteria andRlswTmIn(List<Integer> values) {
            addCriterion("RLSW_TM in", values, "rlswTm");
            return (Criteria) this;
        }

        public Criteria andRlswTmNotIn(List<Integer> values) {
            addCriterion("RLSW_TM not in", values, "rlswTm");
            return (Criteria) this;
        }

        public Criteria andRlswTmBetween(Integer value1, Integer value2) {
            addCriterion("RLSW_TM between", value1, value2, "rlswTm");
            return (Criteria) this;
        }

        public Criteria andRlswTmNotBetween(Integer value1, Integer value2) {
            addCriterion("RLSW_TM not between", value1, value2, "rlswTm");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescIsNull() {
            addCriterion("RLSW_RETDESC is null");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescIsNotNull() {
            addCriterion("RLSW_RETDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescEqualTo(String value) {
            addCriterion("RLSW_RETDESC =", value, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescNotEqualTo(String value) {
            addCriterion("RLSW_RETDESC <>", value, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescGreaterThan(String value) {
            addCriterion("RLSW_RETDESC >", value, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescGreaterThanOrEqualTo(String value) {
            addCriterion("RLSW_RETDESC >=", value, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescLessThan(String value) {
            addCriterion("RLSW_RETDESC <", value, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescLessThanOrEqualTo(String value) {
            addCriterion("RLSW_RETDESC <=", value, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescLike(String value) {
            addCriterion("RLSW_RETDESC like", value, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescNotLike(String value) {
            addCriterion("RLSW_RETDESC not like", value, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescIn(List<String> values) {
            addCriterion("RLSW_RETDESC in", values, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescNotIn(List<String> values) {
            addCriterion("RLSW_RETDESC not in", values, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescBetween(String value1, String value2) {
            addCriterion("RLSW_RETDESC between", value1, value2, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlswRetdescNotBetween(String value1, String value2) {
            addCriterion("RLSW_RETDESC not between", value1, value2, "rlswRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsTmIsNull() {
            addCriterion("RDS_TM is null");
            return (Criteria) this;
        }

        public Criteria andRdsTmIsNotNull() {
            addCriterion("RDS_TM is not null");
            return (Criteria) this;
        }

        public Criteria andRdsTmEqualTo(Integer value) {
            addCriterion("RDS_TM =", value, "rdsTm");
            return (Criteria) this;
        }

        public Criteria andRdsTmNotEqualTo(Integer value) {
            addCriterion("RDS_TM <>", value, "rdsTm");
            return (Criteria) this;
        }

        public Criteria andRdsTmGreaterThan(Integer value) {
            addCriterion("RDS_TM >", value, "rdsTm");
            return (Criteria) this;
        }

        public Criteria andRdsTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("RDS_TM >=", value, "rdsTm");
            return (Criteria) this;
        }

        public Criteria andRdsTmLessThan(Integer value) {
            addCriterion("RDS_TM <", value, "rdsTm");
            return (Criteria) this;
        }

        public Criteria andRdsTmLessThanOrEqualTo(Integer value) {
            addCriterion("RDS_TM <=", value, "rdsTm");
            return (Criteria) this;
        }

        public Criteria andRdsTmIn(List<Integer> values) {
            addCriterion("RDS_TM in", values, "rdsTm");
            return (Criteria) this;
        }

        public Criteria andRdsTmNotIn(List<Integer> values) {
            addCriterion("RDS_TM not in", values, "rdsTm");
            return (Criteria) this;
        }

        public Criteria andRdsTmBetween(Integer value1, Integer value2) {
            addCriterion("RDS_TM between", value1, value2, "rdsTm");
            return (Criteria) this;
        }

        public Criteria andRdsTmNotBetween(Integer value1, Integer value2) {
            addCriterion("RDS_TM not between", value1, value2, "rdsTm");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescIsNull() {
            addCriterion("RDS_RETDESC is null");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescIsNotNull() {
            addCriterion("RDS_RETDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescEqualTo(String value) {
            addCriterion("RDS_RETDESC =", value, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescNotEqualTo(String value) {
            addCriterion("RDS_RETDESC <>", value, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescGreaterThan(String value) {
            addCriterion("RDS_RETDESC >", value, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescGreaterThanOrEqualTo(String value) {
            addCriterion("RDS_RETDESC >=", value, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescLessThan(String value) {
            addCriterion("RDS_RETDESC <", value, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescLessThanOrEqualTo(String value) {
            addCriterion("RDS_RETDESC <=", value, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescLike(String value) {
            addCriterion("RDS_RETDESC like", value, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescNotLike(String value) {
            addCriterion("RDS_RETDESC not like", value, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescIn(List<String> values) {
            addCriterion("RDS_RETDESC in", values, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescNotIn(List<String> values) {
            addCriterion("RDS_RETDESC not in", values, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescBetween(String value1, String value2) {
            addCriterion("RDS_RETDESC between", value1, value2, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRdsRetdescNotBetween(String value1, String value2) {
            addCriterion("RDS_RETDESC not between", value1, value2, "rdsRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmIsNull() {
            addCriterion("DOORGOD_TM is null");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmIsNotNull() {
            addCriterion("DOORGOD_TM is not null");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmEqualTo(Integer value) {
            addCriterion("DOORGOD_TM =", value, "doorgodTm");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmNotEqualTo(Integer value) {
            addCriterion("DOORGOD_TM <>", value, "doorgodTm");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmGreaterThan(Integer value) {
            addCriterion("DOORGOD_TM >", value, "doorgodTm");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOORGOD_TM >=", value, "doorgodTm");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmLessThan(Integer value) {
            addCriterion("DOORGOD_TM <", value, "doorgodTm");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmLessThanOrEqualTo(Integer value) {
            addCriterion("DOORGOD_TM <=", value, "doorgodTm");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmIn(List<Integer> values) {
            addCriterion("DOORGOD_TM in", values, "doorgodTm");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmNotIn(List<Integer> values) {
            addCriterion("DOORGOD_TM not in", values, "doorgodTm");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmBetween(Integer value1, Integer value2) {
            addCriterion("DOORGOD_TM between", value1, value2, "doorgodTm");
            return (Criteria) this;
        }

        public Criteria andDoorgodTmNotBetween(Integer value1, Integer value2) {
            addCriterion("DOORGOD_TM not between", value1, value2, "doorgodTm");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescIsNull() {
            addCriterion("DOORGOD_RETDESC is null");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescIsNotNull() {
            addCriterion("DOORGOD_RETDESC is not null");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescEqualTo(String value) {
            addCriterion("DOORGOD_RETDESC =", value, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescNotEqualTo(String value) {
            addCriterion("DOORGOD_RETDESC <>", value, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescGreaterThan(String value) {
            addCriterion("DOORGOD_RETDESC >", value, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescGreaterThanOrEqualTo(String value) {
            addCriterion("DOORGOD_RETDESC >=", value, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescLessThan(String value) {
            addCriterion("DOORGOD_RETDESC <", value, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescLessThanOrEqualTo(String value) {
            addCriterion("DOORGOD_RETDESC <=", value, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescLike(String value) {
            addCriterion("DOORGOD_RETDESC like", value, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescNotLike(String value) {
            addCriterion("DOORGOD_RETDESC not like", value, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescIn(List<String> values) {
            addCriterion("DOORGOD_RETDESC in", values, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescNotIn(List<String> values) {
            addCriterion("DOORGOD_RETDESC not in", values, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescBetween(String value1, String value2) {
            addCriterion("DOORGOD_RETDESC between", value1, value2, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetdescNotBetween(String value1, String value2) {
            addCriterion("DOORGOD_RETDESC not between", value1, value2, "doorgodRetdesc");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeIsNull() {
            addCriterion("DOORGOD_RETCODE is null");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeIsNotNull() {
            addCriterion("DOORGOD_RETCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeEqualTo(String value) {
            addCriterion("DOORGOD_RETCODE =", value, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeNotEqualTo(String value) {
            addCriterion("DOORGOD_RETCODE <>", value, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeGreaterThan(String value) {
            addCriterion("DOORGOD_RETCODE >", value, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DOORGOD_RETCODE >=", value, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeLessThan(String value) {
            addCriterion("DOORGOD_RETCODE <", value, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeLessThanOrEqualTo(String value) {
            addCriterion("DOORGOD_RETCODE <=", value, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeLike(String value) {
            addCriterion("DOORGOD_RETCODE like", value, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeNotLike(String value) {
            addCriterion("DOORGOD_RETCODE not like", value, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeIn(List<String> values) {
            addCriterion("DOORGOD_RETCODE in", values, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeNotIn(List<String> values) {
            addCriterion("DOORGOD_RETCODE not in", values, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeBetween(String value1, String value2) {
            addCriterion("DOORGOD_RETCODE between", value1, value2, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andDoorgodRetcodeNotBetween(String value1, String value2) {
            addCriterion("DOORGOD_RETCODE not between", value1, value2, "doorgodRetcode");
            return (Criteria) this;
        }

        public Criteria andPrepareTmIsNull() {
            addCriterion("PREPARE_TM is null");
            return (Criteria) this;
        }

        public Criteria andPrepareTmIsNotNull() {
            addCriterion("PREPARE_TM is not null");
            return (Criteria) this;
        }

        public Criteria andPrepareTmEqualTo(Integer value) {
            addCriterion("PREPARE_TM =", value, "prepareTm");
            return (Criteria) this;
        }

        public Criteria andPrepareTmNotEqualTo(Integer value) {
            addCriterion("PREPARE_TM <>", value, "prepareTm");
            return (Criteria) this;
        }

        public Criteria andPrepareTmGreaterThan(Integer value) {
            addCriterion("PREPARE_TM >", value, "prepareTm");
            return (Criteria) this;
        }

        public Criteria andPrepareTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("PREPARE_TM >=", value, "prepareTm");
            return (Criteria) this;
        }

        public Criteria andPrepareTmLessThan(Integer value) {
            addCriterion("PREPARE_TM <", value, "prepareTm");
            return (Criteria) this;
        }

        public Criteria andPrepareTmLessThanOrEqualTo(Integer value) {
            addCriterion("PREPARE_TM <=", value, "prepareTm");
            return (Criteria) this;
        }

        public Criteria andPrepareTmIn(List<Integer> values) {
            addCriterion("PREPARE_TM in", values, "prepareTm");
            return (Criteria) this;
        }

        public Criteria andPrepareTmNotIn(List<Integer> values) {
            addCriterion("PREPARE_TM not in", values, "prepareTm");
            return (Criteria) this;
        }

        public Criteria andPrepareTmBetween(Integer value1, Integer value2) {
            addCriterion("PREPARE_TM between", value1, value2, "prepareTm");
            return (Criteria) this;
        }

        public Criteria andPrepareTmNotBetween(Integer value1, Integer value2) {
            addCriterion("PREPARE_TM not between", value1, value2, "prepareTm");
            return (Criteria) this;
        }

        public Criteria andChkTmIsNull() {
            addCriterion("CHK_TM is null");
            return (Criteria) this;
        }

        public Criteria andChkTmIsNotNull() {
            addCriterion("CHK_TM is not null");
            return (Criteria) this;
        }

        public Criteria andChkTmEqualTo(Integer value) {
            addCriterion("CHK_TM =", value, "chkTm");
            return (Criteria) this;
        }

        public Criteria andChkTmNotEqualTo(Integer value) {
            addCriterion("CHK_TM <>", value, "chkTm");
            return (Criteria) this;
        }

        public Criteria andChkTmGreaterThan(Integer value) {
            addCriterion("CHK_TM >", value, "chkTm");
            return (Criteria) this;
        }

        public Criteria andChkTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHK_TM >=", value, "chkTm");
            return (Criteria) this;
        }

        public Criteria andChkTmLessThan(Integer value) {
            addCriterion("CHK_TM <", value, "chkTm");
            return (Criteria) this;
        }

        public Criteria andChkTmLessThanOrEqualTo(Integer value) {
            addCriterion("CHK_TM <=", value, "chkTm");
            return (Criteria) this;
        }

        public Criteria andChkTmIn(List<Integer> values) {
            addCriterion("CHK_TM in", values, "chkTm");
            return (Criteria) this;
        }

        public Criteria andChkTmNotIn(List<Integer> values) {
            addCriterion("CHK_TM not in", values, "chkTm");
            return (Criteria) this;
        }

        public Criteria andChkTmBetween(Integer value1, Integer value2) {
            addCriterion("CHK_TM between", value1, value2, "chkTm");
            return (Criteria) this;
        }

        public Criteria andChkTmNotBetween(Integer value1, Integer value2) {
            addCriterion("CHK_TM not between", value1, value2, "chkTm");
            return (Criteria) this;
        }

        public Criteria andRkIpIsNull() {
            addCriterion("RK_IP is null");
            return (Criteria) this;
        }

        public Criteria andRkIpIsNotNull() {
            addCriterion("RK_IP is not null");
            return (Criteria) this;
        }

        public Criteria andRkIpEqualTo(String value) {
            addCriterion("RK_IP =", value, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpNotEqualTo(String value) {
            addCriterion("RK_IP <>", value, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpGreaterThan(String value) {
            addCriterion("RK_IP >", value, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpGreaterThanOrEqualTo(String value) {
            addCriterion("RK_IP >=", value, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpLessThan(String value) {
            addCriterion("RK_IP <", value, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpLessThanOrEqualTo(String value) {
            addCriterion("RK_IP <=", value, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpLike(String value) {
            addCriterion("RK_IP like", value, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpNotLike(String value) {
            addCriterion("RK_IP not like", value, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpIn(List<String> values) {
            addCriterion("RK_IP in", values, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpNotIn(List<String> values) {
            addCriterion("RK_IP not in", values, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpBetween(String value1, String value2) {
            addCriterion("RK_IP between", value1, value2, "rkIp");
            return (Criteria) this;
        }

        public Criteria andRkIpNotBetween(String value1, String value2) {
            addCriterion("RK_IP not between", value1, value2, "rkIp");
            return (Criteria) this;
        }

        public Criteria andSubSysIsNull() {
            addCriterion("SUB_SYS is null");
            return (Criteria) this;
        }

        public Criteria andSubSysIsNotNull() {
            addCriterion("SUB_SYS is not null");
            return (Criteria) this;
        }

        public Criteria andSubSysEqualTo(String value) {
            addCriterion("SUB_SYS =", value, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysNotEqualTo(String value) {
            addCriterion("SUB_SYS <>", value, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysGreaterThan(String value) {
            addCriterion("SUB_SYS >", value, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_SYS >=", value, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysLessThan(String value) {
            addCriterion("SUB_SYS <", value, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysLessThanOrEqualTo(String value) {
            addCriterion("SUB_SYS <=", value, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysLike(String value) {
            addCriterion("SUB_SYS like", value, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysNotLike(String value) {
            addCriterion("SUB_SYS not like", value, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysIn(List<String> values) {
            addCriterion("SUB_SYS in", values, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysNotIn(List<String> values) {
            addCriterion("SUB_SYS not in", values, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysBetween(String value1, String value2) {
            addCriterion("SUB_SYS between", value1, value2, "subSys");
            return (Criteria) this;
        }

        public Criteria andSubSysNotBetween(String value1, String value2) {
            addCriterion("SUB_SYS not between", value1, value2, "subSys");
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

        public Criteria andChkRetdescIsNull() {
            addCriterion("CHK_RETDESC is null");
            return (Criteria) this;
        }

        public Criteria andChkRetdescIsNotNull() {
            addCriterion("CHK_RETDESC is not null");
            return (Criteria) this;
        }

        public Criteria andChkRetdescEqualTo(String value) {
            addCriterion("CHK_RETDESC =", value, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescNotEqualTo(String value) {
            addCriterion("CHK_RETDESC <>", value, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescGreaterThan(String value) {
            addCriterion("CHK_RETDESC >", value, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_RETDESC >=", value, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescLessThan(String value) {
            addCriterion("CHK_RETDESC <", value, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescLessThanOrEqualTo(String value) {
            addCriterion("CHK_RETDESC <=", value, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescLike(String value) {
            addCriterion("CHK_RETDESC like", value, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescNotLike(String value) {
            addCriterion("CHK_RETDESC not like", value, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescIn(List<String> values) {
            addCriterion("CHK_RETDESC in", values, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescNotIn(List<String> values) {
            addCriterion("CHK_RETDESC not in", values, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescBetween(String value1, String value2) {
            addCriterion("CHK_RETDESC between", value1, value2, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andChkRetdescNotBetween(String value1, String value2) {
            addCriterion("CHK_RETDESC not between", value1, value2, "chkRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescIsNull() {
            addCriterion("PREPARE_RETDESC is null");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescIsNotNull() {
            addCriterion("PREPARE_RETDESC is not null");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescEqualTo(String value) {
            addCriterion("PREPARE_RETDESC =", value, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescNotEqualTo(String value) {
            addCriterion("PREPARE_RETDESC <>", value, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescGreaterThan(String value) {
            addCriterion("PREPARE_RETDESC >", value, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescGreaterThanOrEqualTo(String value) {
            addCriterion("PREPARE_RETDESC >=", value, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescLessThan(String value) {
            addCriterion("PREPARE_RETDESC <", value, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescLessThanOrEqualTo(String value) {
            addCriterion("PREPARE_RETDESC <=", value, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescLike(String value) {
            addCriterion("PREPARE_RETDESC like", value, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescNotLike(String value) {
            addCriterion("PREPARE_RETDESC not like", value, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescIn(List<String> values) {
            addCriterion("PREPARE_RETDESC in", values, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescNotIn(List<String> values) {
            addCriterion("PREPARE_RETDESC not in", values, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescBetween(String value1, String value2) {
            addCriterion("PREPARE_RETDESC between", value1, value2, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andPrepareRetdescNotBetween(String value1, String value2) {
            addCriterion("PREPARE_RETDESC not between", value1, value2, "prepareRetdesc");
            return (Criteria) this;
        }

        public Criteria andFirstPayIsNull() {
            addCriterion("FIRST_PAY is null");
            return (Criteria) this;
        }

        public Criteria andFirstPayIsNotNull() {
            addCriterion("FIRST_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPayEqualTo(String value) {
            addCriterion("FIRST_PAY =", value, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayNotEqualTo(String value) {
            addCriterion("FIRST_PAY <>", value, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayGreaterThan(String value) {
            addCriterion("FIRST_PAY >", value, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_PAY >=", value, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayLessThan(String value) {
            addCriterion("FIRST_PAY <", value, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayLessThanOrEqualTo(String value) {
            addCriterion("FIRST_PAY <=", value, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayLike(String value) {
            addCriterion("FIRST_PAY like", value, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayNotLike(String value) {
            addCriterion("FIRST_PAY not like", value, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayIn(List<String> values) {
            addCriterion("FIRST_PAY in", values, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayNotIn(List<String> values) {
            addCriterion("FIRST_PAY not in", values, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayBetween(String value1, String value2) {
            addCriterion("FIRST_PAY between", value1, value2, "firstPay");
            return (Criteria) this;
        }

        public Criteria andFirstPayNotBetween(String value1, String value2) {
            addCriterion("FIRST_PAY not between", value1, value2, "firstPay");
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

        public Criteria andSubProdIdIsNull() {
            addCriterion("SUB_PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubProdIdIsNotNull() {
            addCriterion("SUB_PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubProdIdEqualTo(String value) {
            addCriterion("SUB_PROD_ID =", value, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdNotEqualTo(String value) {
            addCriterion("SUB_PROD_ID <>", value, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdGreaterThan(String value) {
            addCriterion("SUB_PROD_ID >", value, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_PROD_ID >=", value, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdLessThan(String value) {
            addCriterion("SUB_PROD_ID <", value, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdLessThanOrEqualTo(String value) {
            addCriterion("SUB_PROD_ID <=", value, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdLike(String value) {
            addCriterion("SUB_PROD_ID like", value, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdNotLike(String value) {
            addCriterion("SUB_PROD_ID not like", value, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdIn(List<String> values) {
            addCriterion("SUB_PROD_ID in", values, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdNotIn(List<String> values) {
            addCriterion("SUB_PROD_ID not in", values, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdBetween(String value1, String value2) {
            addCriterion("SUB_PROD_ID between", value1, value2, "subProdId");
            return (Criteria) this;
        }

        public Criteria andSubProdIdNotBetween(String value1, String value2) {
            addCriterion("SUB_PROD_ID not between", value1, value2, "subProdId");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescIsNull() {
            addCriterion("RGS_RETDESC is null");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescIsNotNull() {
            addCriterion("RGS_RETDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescEqualTo(String value) {
            addCriterion("RGS_RETDESC =", value, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescNotEqualTo(String value) {
            addCriterion("RGS_RETDESC <>", value, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescGreaterThan(String value) {
            addCriterion("RGS_RETDESC >", value, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescGreaterThanOrEqualTo(String value) {
            addCriterion("RGS_RETDESC >=", value, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescLessThan(String value) {
            addCriterion("RGS_RETDESC <", value, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescLessThanOrEqualTo(String value) {
            addCriterion("RGS_RETDESC <=", value, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescLike(String value) {
            addCriterion("RGS_RETDESC like", value, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescNotLike(String value) {
            addCriterion("RGS_RETDESC not like", value, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescIn(List<String> values) {
            addCriterion("RGS_RETDESC in", values, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescNotIn(List<String> values) {
            addCriterion("RGS_RETDESC not in", values, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescBetween(String value1, String value2) {
            addCriterion("RGS_RETDESC between", value1, value2, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsRetdescNotBetween(String value1, String value2) {
            addCriterion("RGS_RETDESC not between", value1, value2, "rgsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRgsTmIsNull() {
            addCriterion("RGS_TM is null");
            return (Criteria) this;
        }

        public Criteria andRgsTmIsNotNull() {
            addCriterion("RGS_TM is not null");
            return (Criteria) this;
        }

        public Criteria andRgsTmEqualTo(Integer value) {
            addCriterion("RGS_TM =", value, "rgsTm");
            return (Criteria) this;
        }

        public Criteria andRgsTmNotEqualTo(Integer value) {
            addCriterion("RGS_TM <>", value, "rgsTm");
            return (Criteria) this;
        }

        public Criteria andRgsTmGreaterThan(Integer value) {
            addCriterion("RGS_TM >", value, "rgsTm");
            return (Criteria) this;
        }

        public Criteria andRgsTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("RGS_TM >=", value, "rgsTm");
            return (Criteria) this;
        }

        public Criteria andRgsTmLessThan(Integer value) {
            addCriterion("RGS_TM <", value, "rgsTm");
            return (Criteria) this;
        }

        public Criteria andRgsTmLessThanOrEqualTo(Integer value) {
            addCriterion("RGS_TM <=", value, "rgsTm");
            return (Criteria) this;
        }

        public Criteria andRgsTmIn(List<Integer> values) {
            addCriterion("RGS_TM in", values, "rgsTm");
            return (Criteria) this;
        }

        public Criteria andRgsTmNotIn(List<Integer> values) {
            addCriterion("RGS_TM not in", values, "rgsTm");
            return (Criteria) this;
        }

        public Criteria andRgsTmBetween(Integer value1, Integer value2) {
            addCriterion("RGS_TM between", value1, value2, "rgsTm");
            return (Criteria) this;
        }

        public Criteria andRgsTmNotBetween(Integer value1, Integer value2) {
            addCriterion("RGS_TM not between", value1, value2, "rgsTm");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescIsNull() {
            addCriterion("RBS_RETDESC is null");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescIsNotNull() {
            addCriterion("RBS_RETDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescEqualTo(String value) {
            addCriterion("RBS_RETDESC =", value, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescNotEqualTo(String value) {
            addCriterion("RBS_RETDESC <>", value, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescGreaterThan(String value) {
            addCriterion("RBS_RETDESC >", value, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescGreaterThanOrEqualTo(String value) {
            addCriterion("RBS_RETDESC >=", value, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescLessThan(String value) {
            addCriterion("RBS_RETDESC <", value, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescLessThanOrEqualTo(String value) {
            addCriterion("RBS_RETDESC <=", value, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescLike(String value) {
            addCriterion("RBS_RETDESC like", value, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescNotLike(String value) {
            addCriterion("RBS_RETDESC not like", value, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescIn(List<String> values) {
            addCriterion("RBS_RETDESC in", values, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescNotIn(List<String> values) {
            addCriterion("RBS_RETDESC not in", values, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescBetween(String value1, String value2) {
            addCriterion("RBS_RETDESC between", value1, value2, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsRetdescNotBetween(String value1, String value2) {
            addCriterion("RBS_RETDESC not between", value1, value2, "rbsRetdesc");
            return (Criteria) this;
        }

        public Criteria andRbsTmIsNull() {
            addCriterion("RBS_TM is null");
            return (Criteria) this;
        }

        public Criteria andRbsTmIsNotNull() {
            addCriterion("RBS_TM is not null");
            return (Criteria) this;
        }

        public Criteria andRbsTmEqualTo(Integer value) {
            addCriterion("RBS_TM =", value, "rbsTm");
            return (Criteria) this;
        }

        public Criteria andRbsTmNotEqualTo(Integer value) {
            addCriterion("RBS_TM <>", value, "rbsTm");
            return (Criteria) this;
        }

        public Criteria andRbsTmGreaterThan(Integer value) {
            addCriterion("RBS_TM >", value, "rbsTm");
            return (Criteria) this;
        }

        public Criteria andRbsTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("RBS_TM >=", value, "rbsTm");
            return (Criteria) this;
        }

        public Criteria andRbsTmLessThan(Integer value) {
            addCriterion("RBS_TM <", value, "rbsTm");
            return (Criteria) this;
        }

        public Criteria andRbsTmLessThanOrEqualTo(Integer value) {
            addCriterion("RBS_TM <=", value, "rbsTm");
            return (Criteria) this;
        }

        public Criteria andRbsTmIn(List<Integer> values) {
            addCriterion("RBS_TM in", values, "rbsTm");
            return (Criteria) this;
        }

        public Criteria andRbsTmNotIn(List<Integer> values) {
            addCriterion("RBS_TM not in", values, "rbsTm");
            return (Criteria) this;
        }

        public Criteria andRbsTmBetween(Integer value1, Integer value2) {
            addCriterion("RBS_TM between", value1, value2, "rbsTm");
            return (Criteria) this;
        }

        public Criteria andRbsTmNotBetween(Integer value1, Integer value2) {
            addCriterion("RBS_TM not between", value1, value2, "rbsTm");
            return (Criteria) this;
        }

        public Criteria andRetSwitchIsNull() {
            addCriterion("RET_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andRetSwitchIsNotNull() {
            addCriterion("RET_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andRetSwitchEqualTo(String value) {
            addCriterion("RET_SWITCH =", value, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchNotEqualTo(String value) {
            addCriterion("RET_SWITCH <>", value, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchGreaterThan(String value) {
            addCriterion("RET_SWITCH >", value, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("RET_SWITCH >=", value, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchLessThan(String value) {
            addCriterion("RET_SWITCH <", value, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchLessThanOrEqualTo(String value) {
            addCriterion("RET_SWITCH <=", value, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchLike(String value) {
            addCriterion("RET_SWITCH like", value, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchNotLike(String value) {
            addCriterion("RET_SWITCH not like", value, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchIn(List<String> values) {
            addCriterion("RET_SWITCH in", values, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchNotIn(List<String> values) {
            addCriterion("RET_SWITCH not in", values, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchBetween(String value1, String value2) {
            addCriterion("RET_SWITCH between", value1, value2, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRetSwitchNotBetween(String value1, String value2) {
            addCriterion("RET_SWITCH not between", value1, value2, "retSwitch");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescIsNull() {
            addCriterion("RLSG_RETDESC is null");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescIsNotNull() {
            addCriterion("RLSG_RETDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescEqualTo(String value) {
            addCriterion("RLSG_RETDESC =", value, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescNotEqualTo(String value) {
            addCriterion("RLSG_RETDESC <>", value, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescGreaterThan(String value) {
            addCriterion("RLSG_RETDESC >", value, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescGreaterThanOrEqualTo(String value) {
            addCriterion("RLSG_RETDESC >=", value, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescLessThan(String value) {
            addCriterion("RLSG_RETDESC <", value, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescLessThanOrEqualTo(String value) {
            addCriterion("RLSG_RETDESC <=", value, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescLike(String value) {
            addCriterion("RLSG_RETDESC like", value, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescNotLike(String value) {
            addCriterion("RLSG_RETDESC not like", value, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescIn(List<String> values) {
            addCriterion("RLSG_RETDESC in", values, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescNotIn(List<String> values) {
            addCriterion("RLSG_RETDESC not in", values, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescBetween(String value1, String value2) {
            addCriterion("RLSG_RETDESC between", value1, value2, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgRetdescNotBetween(String value1, String value2) {
            addCriterion("RLSG_RETDESC not between", value1, value2, "rlsgRetdesc");
            return (Criteria) this;
        }

        public Criteria andRlsgTmIsNull() {
            addCriterion("RLSG_TM is null");
            return (Criteria) this;
        }

        public Criteria andRlsgTmIsNotNull() {
            addCriterion("RLSG_TM is not null");
            return (Criteria) this;
        }

        public Criteria andRlsgTmEqualTo(Integer value) {
            addCriterion("RLSG_TM =", value, "rlsgTm");
            return (Criteria) this;
        }

        public Criteria andRlsgTmNotEqualTo(Integer value) {
            addCriterion("RLSG_TM <>", value, "rlsgTm");
            return (Criteria) this;
        }

        public Criteria andRlsgTmGreaterThan(Integer value) {
            addCriterion("RLSG_TM >", value, "rlsgTm");
            return (Criteria) this;
        }

        public Criteria andRlsgTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("RLSG_TM >=", value, "rlsgTm");
            return (Criteria) this;
        }

        public Criteria andRlsgTmLessThan(Integer value) {
            addCriterion("RLSG_TM <", value, "rlsgTm");
            return (Criteria) this;
        }

        public Criteria andRlsgTmLessThanOrEqualTo(Integer value) {
            addCriterion("RLSG_TM <=", value, "rlsgTm");
            return (Criteria) this;
        }

        public Criteria andRlsgTmIn(List<Integer> values) {
            addCriterion("RLSG_TM in", values, "rlsgTm");
            return (Criteria) this;
        }

        public Criteria andRlsgTmNotIn(List<Integer> values) {
            addCriterion("RLSG_TM not in", values, "rlsgTm");
            return (Criteria) this;
        }

        public Criteria andRlsgTmBetween(Integer value1, Integer value2) {
            addCriterion("RLSG_TM between", value1, value2, "rlsgTm");
            return (Criteria) this;
        }

        public Criteria andRlsgTmNotBetween(Integer value1, Integer value2) {
            addCriterion("RLSG_TM not between", value1, value2, "rlsgTm");
            return (Criteria) this;
        }

        public Criteria andRetcodeIsNull() {
            addCriterion("RETCODE is null");
            return (Criteria) this;
        }

        public Criteria andRetcodeIsNotNull() {
            addCriterion("RETCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRetcodeEqualTo(String value) {
            addCriterion("RETCODE =", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotEqualTo(String value) {
            addCriterion("RETCODE <>", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeGreaterThan(String value) {
            addCriterion("RETCODE >", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RETCODE >=", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeLessThan(String value) {
            addCriterion("RETCODE <", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeLessThanOrEqualTo(String value) {
            addCriterion("RETCODE <=", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeLike(String value) {
            addCriterion("RETCODE like", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotLike(String value) {
            addCriterion("RETCODE not like", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeIn(List<String> values) {
            addCriterion("RETCODE in", values, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotIn(List<String> values) {
            addCriterion("RETCODE not in", values, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeBetween(String value1, String value2) {
            addCriterion("RETCODE between", value1, value2, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotBetween(String value1, String value2) {
            addCriterion("RETCODE not between", value1, value2, "retcode");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleIsNull() {
            addCriterion("BANGSUN_TRIGERRULE is null");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleIsNotNull() {
            addCriterion("BANGSUN_TRIGERRULE is not null");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleEqualTo(String value) {
            addCriterion("BANGSUN_TRIGERRULE =", value, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleNotEqualTo(String value) {
            addCriterion("BANGSUN_TRIGERRULE <>", value, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleGreaterThan(String value) {
            addCriterion("BANGSUN_TRIGERRULE >", value, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleGreaterThanOrEqualTo(String value) {
            addCriterion("BANGSUN_TRIGERRULE >=", value, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleLessThan(String value) {
            addCriterion("BANGSUN_TRIGERRULE <", value, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleLessThanOrEqualTo(String value) {
            addCriterion("BANGSUN_TRIGERRULE <=", value, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleLike(String value) {
            addCriterion("BANGSUN_TRIGERRULE like", value, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleNotLike(String value) {
            addCriterion("BANGSUN_TRIGERRULE not like", value, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleIn(List<String> values) {
            addCriterion("BANGSUN_TRIGERRULE in", values, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleNotIn(List<String> values) {
            addCriterion("BANGSUN_TRIGERRULE not in", values, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleBetween(String value1, String value2) {
            addCriterion("BANGSUN_TRIGERRULE between", value1, value2, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andBangsunTrigerruleNotBetween(String value1, String value2) {
            addCriterion("BANGSUN_TRIGERRULE not between", value1, value2, "bangsunTrigerrule");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("PAYWAY is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("PAYWAY is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("PAYWAY =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("PAYWAY <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("PAYWAY >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("PAYWAY >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("PAYWAY <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("PAYWAY <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("PAYWAY like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("PAYWAY not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("PAYWAY in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("PAYWAY not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("PAYWAY between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("PAYWAY not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andTradeSrcIsNull() {
            addCriterion("TRADE_SRC is null");
            return (Criteria) this;
        }

        public Criteria andTradeSrcIsNotNull() {
            addCriterion("TRADE_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andTradeSrcEqualTo(String value) {
            addCriterion("TRADE_SRC =", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcNotEqualTo(String value) {
            addCriterion("TRADE_SRC <>", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcGreaterThan(String value) {
            addCriterion("TRADE_SRC >", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_SRC >=", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcLessThan(String value) {
            addCriterion("TRADE_SRC <", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcLessThanOrEqualTo(String value) {
            addCriterion("TRADE_SRC <=", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcLike(String value) {
            addCriterion("TRADE_SRC like", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcNotLike(String value) {
            addCriterion("TRADE_SRC not like", value, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcIn(List<String> values) {
            addCriterion("TRADE_SRC in", values, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcNotIn(List<String> values) {
            addCriterion("TRADE_SRC not in", values, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcBetween(String value1, String value2) {
            addCriterion("TRADE_SRC between", value1, value2, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andTradeSrcNotBetween(String value1, String value2) {
            addCriterion("TRADE_SRC not between", value1, value2, "tradeSrc");
            return (Criteria) this;
        }

        public Criteria andParamTypIsNull() {
            addCriterion("PARAM_TYP is null");
            return (Criteria) this;
        }

        public Criteria andParamTypIsNotNull() {
            addCriterion("PARAM_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andParamTypEqualTo(String value) {
            addCriterion("PARAM_TYP =", value, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypNotEqualTo(String value) {
            addCriterion("PARAM_TYP <>", value, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypGreaterThan(String value) {
            addCriterion("PARAM_TYP >", value, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_TYP >=", value, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypLessThan(String value) {
            addCriterion("PARAM_TYP <", value, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypLessThanOrEqualTo(String value) {
            addCriterion("PARAM_TYP <=", value, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypLike(String value) {
            addCriterion("PARAM_TYP like", value, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypNotLike(String value) {
            addCriterion("PARAM_TYP not like", value, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypIn(List<String> values) {
            addCriterion("PARAM_TYP in", values, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypNotIn(List<String> values) {
            addCriterion("PARAM_TYP not in", values, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypBetween(String value1, String value2) {
            addCriterion("PARAM_TYP between", value1, value2, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andParamTypNotBetween(String value1, String value2) {
            addCriterion("PARAM_TYP not between", value1, value2, "paramTyp");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeIsNull() {
            addCriterion("MERCHANT_RETCODE is null");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeIsNotNull() {
            addCriterion("MERCHANT_RETCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeEqualTo(String value) {
            addCriterion("MERCHANT_RETCODE =", value, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeNotEqualTo(String value) {
            addCriterion("MERCHANT_RETCODE <>", value, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeGreaterThan(String value) {
            addCriterion("MERCHANT_RETCODE >", value, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_RETCODE >=", value, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeLessThan(String value) {
            addCriterion("MERCHANT_RETCODE <", value, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_RETCODE <=", value, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeLike(String value) {
            addCriterion("MERCHANT_RETCODE like", value, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeNotLike(String value) {
            addCriterion("MERCHANT_RETCODE not like", value, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeIn(List<String> values) {
            addCriterion("MERCHANT_RETCODE in", values, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeNotIn(List<String> values) {
            addCriterion("MERCHANT_RETCODE not in", values, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeBetween(String value1, String value2) {
            addCriterion("MERCHANT_RETCODE between", value1, value2, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andMerchantRetcodeNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_RETCODE not between", value1, value2, "merchantRetcode");
            return (Criteria) this;
        }

        public Criteria andIfEncryIsNull() {
            addCriterion("IF_ENCRY is null");
            return (Criteria) this;
        }

        public Criteria andIfEncryIsNotNull() {
            addCriterion("IF_ENCRY is not null");
            return (Criteria) this;
        }

        public Criteria andIfEncryEqualTo(String value) {
            addCriterion("IF_ENCRY =", value, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryNotEqualTo(String value) {
            addCriterion("IF_ENCRY <>", value, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryGreaterThan(String value) {
            addCriterion("IF_ENCRY >", value, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryGreaterThanOrEqualTo(String value) {
            addCriterion("IF_ENCRY >=", value, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryLessThan(String value) {
            addCriterion("IF_ENCRY <", value, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryLessThanOrEqualTo(String value) {
            addCriterion("IF_ENCRY <=", value, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryLike(String value) {
            addCriterion("IF_ENCRY like", value, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryNotLike(String value) {
            addCriterion("IF_ENCRY not like", value, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryIn(List<String> values) {
            addCriterion("IF_ENCRY in", values, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryNotIn(List<String> values) {
            addCriterion("IF_ENCRY not in", values, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryBetween(String value1, String value2) {
            addCriterion("IF_ENCRY between", value1, value2, "ifEncry");
            return (Criteria) this;
        }

        public Criteria andIfEncryNotBetween(String value1, String value2) {
            addCriterion("IF_ENCRY not between", value1, value2, "ifEncry");
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

        public Criteria andPayTmIsNull() {
            addCriterion("PAY_TM is null");
            return (Criteria) this;
        }

        public Criteria andPayTmIsNotNull() {
            addCriterion("PAY_TM is not null");
            return (Criteria) this;
        }

        public Criteria andPayTmEqualTo(Date value) {
            addCriterion("PAY_TM =", value, "payTm");
            return (Criteria) this;
        }

        public Criteria andPayTmNotEqualTo(Date value) {
            addCriterion("PAY_TM <>", value, "payTm");
            return (Criteria) this;
        }

        public Criteria andPayTmGreaterThan(Date value) {
            addCriterion("PAY_TM >", value, "payTm");
            return (Criteria) this;
        }

        public Criteria andPayTmGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_TM >=", value, "payTm");
            return (Criteria) this;
        }

        public Criteria andPayTmLessThan(Date value) {
            addCriterion("PAY_TM <", value, "payTm");
            return (Criteria) this;
        }

        public Criteria andPayTmLessThanOrEqualTo(Date value) {
            addCriterion("PAY_TM <=", value, "payTm");
            return (Criteria) this;
        }

        public Criteria andPayTmIn(List<Date> values) {
            addCriterion("PAY_TM in", values, "payTm");
            return (Criteria) this;
        }

        public Criteria andPayTmNotIn(List<Date> values) {
            addCriterion("PAY_TM not in", values, "payTm");
            return (Criteria) this;
        }

        public Criteria andPayTmBetween(Date value1, Date value2) {
            addCriterion("PAY_TM between", value1, value2, "payTm");
            return (Criteria) this;
        }

        public Criteria andPayTmNotBetween(Date value1, Date value2) {
            addCriterion("PAY_TM not between", value1, value2, "payTm");
            return (Criteria) this;
        }

        public Criteria andPayCdIsNull() {
            addCriterion("PAY_CD is null");
            return (Criteria) this;
        }

        public Criteria andPayCdIsNotNull() {
            addCriterion("PAY_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPayCdEqualTo(String value) {
            addCriterion("PAY_CD =", value, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdNotEqualTo(String value) {
            addCriterion("PAY_CD <>", value, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdGreaterThan(String value) {
            addCriterion("PAY_CD >", value, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CD >=", value, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdLessThan(String value) {
            addCriterion("PAY_CD <", value, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdLessThanOrEqualTo(String value) {
            addCriterion("PAY_CD <=", value, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdLike(String value) {
            addCriterion("PAY_CD like", value, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdNotLike(String value) {
            addCriterion("PAY_CD not like", value, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdIn(List<String> values) {
            addCriterion("PAY_CD in", values, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdNotIn(List<String> values) {
            addCriterion("PAY_CD not in", values, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdBetween(String value1, String value2) {
            addCriterion("PAY_CD between", value1, value2, "payCd");
            return (Criteria) this;
        }

        public Criteria andPayCdNotBetween(String value1, String value2) {
            addCriterion("PAY_CD not between", value1, value2, "payCd");
            return (Criteria) this;
        }

        public Criteria andSynConTmIsNull() {
            addCriterion("SYN_CON_TM is null");
            return (Criteria) this;
        }

        public Criteria andSynConTmIsNotNull() {
            addCriterion("SYN_CON_TM is not null");
            return (Criteria) this;
        }

        public Criteria andSynConTmEqualTo(Integer value) {
            addCriterion("SYN_CON_TM =", value, "synConTm");
            return (Criteria) this;
        }

        public Criteria andSynConTmNotEqualTo(Integer value) {
            addCriterion("SYN_CON_TM <>", value, "synConTm");
            return (Criteria) this;
        }

        public Criteria andSynConTmGreaterThan(Integer value) {
            addCriterion("SYN_CON_TM >", value, "synConTm");
            return (Criteria) this;
        }

        public Criteria andSynConTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYN_CON_TM >=", value, "synConTm");
            return (Criteria) this;
        }

        public Criteria andSynConTmLessThan(Integer value) {
            addCriterion("SYN_CON_TM <", value, "synConTm");
            return (Criteria) this;
        }

        public Criteria andSynConTmLessThanOrEqualTo(Integer value) {
            addCriterion("SYN_CON_TM <=", value, "synConTm");
            return (Criteria) this;
        }

        public Criteria andSynConTmIn(List<Integer> values) {
            addCriterion("SYN_CON_TM in", values, "synConTm");
            return (Criteria) this;
        }

        public Criteria andSynConTmNotIn(List<Integer> values) {
            addCriterion("SYN_CON_TM not in", values, "synConTm");
            return (Criteria) this;
        }

        public Criteria andSynConTmBetween(Integer value1, Integer value2) {
            addCriterion("SYN_CON_TM between", value1, value2, "synConTm");
            return (Criteria) this;
        }

        public Criteria andSynConTmNotBetween(Integer value1, Integer value2) {
            addCriterion("SYN_CON_TM not between", value1, value2, "synConTm");
            return (Criteria) this;
        }

        public Criteria andSynErrCdIsNull() {
            addCriterion("SYN_ERR_CD is null");
            return (Criteria) this;
        }

        public Criteria andSynErrCdIsNotNull() {
            addCriterion("SYN_ERR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSynErrCdEqualTo(String value) {
            addCriterion("SYN_ERR_CD =", value, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdNotEqualTo(String value) {
            addCriterion("SYN_ERR_CD <>", value, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdGreaterThan(String value) {
            addCriterion("SYN_ERR_CD >", value, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdGreaterThanOrEqualTo(String value) {
            addCriterion("SYN_ERR_CD >=", value, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdLessThan(String value) {
            addCriterion("SYN_ERR_CD <", value, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdLessThanOrEqualTo(String value) {
            addCriterion("SYN_ERR_CD <=", value, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdLike(String value) {
            addCriterion("SYN_ERR_CD like", value, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdNotLike(String value) {
            addCriterion("SYN_ERR_CD not like", value, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdIn(List<String> values) {
            addCriterion("SYN_ERR_CD in", values, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdNotIn(List<String> values) {
            addCriterion("SYN_ERR_CD not in", values, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdBetween(String value1, String value2) {
            addCriterion("SYN_ERR_CD between", value1, value2, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andSynErrCdNotBetween(String value1, String value2) {
            addCriterion("SYN_ERR_CD not between", value1, value2, "synErrCd");
            return (Criteria) this;
        }

        public Criteria andBizorderIsNull() {
            addCriterion("BIZORDER is null");
            return (Criteria) this;
        }

        public Criteria andBizorderIsNotNull() {
            addCriterion("BIZORDER is not null");
            return (Criteria) this;
        }

        public Criteria andBizorderEqualTo(String value) {
            addCriterion("BIZORDER =", value, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderNotEqualTo(String value) {
            addCriterion("BIZORDER <>", value, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderGreaterThan(String value) {
            addCriterion("BIZORDER >", value, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderGreaterThanOrEqualTo(String value) {
            addCriterion("BIZORDER >=", value, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderLessThan(String value) {
            addCriterion("BIZORDER <", value, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderLessThanOrEqualTo(String value) {
            addCriterion("BIZORDER <=", value, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderLike(String value) {
            addCriterion("BIZORDER like", value, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderNotLike(String value) {
            addCriterion("BIZORDER not like", value, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderIn(List<String> values) {
            addCriterion("BIZORDER in", values, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderNotIn(List<String> values) {
            addCriterion("BIZORDER not in", values, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderBetween(String value1, String value2) {
            addCriterion("BIZORDER between", value1, value2, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBizorderNotBetween(String value1, String value2) {
            addCriterion("BIZORDER not between", value1, value2, "bizorder");
            return (Criteria) this;
        }

        public Criteria andBankSeqIsNull() {
            addCriterion("BANK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBankSeqIsNotNull() {
            addCriterion("BANK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBankSeqEqualTo(String value) {
            addCriterion("BANK_SEQ =", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqNotEqualTo(String value) {
            addCriterion("BANK_SEQ <>", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqGreaterThan(String value) {
            addCriterion("BANK_SEQ >", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_SEQ >=", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqLessThan(String value) {
            addCriterion("BANK_SEQ <", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqLessThanOrEqualTo(String value) {
            addCriterion("BANK_SEQ <=", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqLike(String value) {
            addCriterion("BANK_SEQ like", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqNotLike(String value) {
            addCriterion("BANK_SEQ not like", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqIn(List<String> values) {
            addCriterion("BANK_SEQ in", values, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqNotIn(List<String> values) {
            addCriterion("BANK_SEQ not in", values, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqBetween(String value1, String value2) {
            addCriterion("BANK_SEQ between", value1, value2, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqNotBetween(String value1, String value2) {
            addCriterion("BANK_SEQ not between", value1, value2, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoIsNull() {
            addCriterion("BANK_ORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoIsNotNull() {
            addCriterion("BANK_ORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoEqualTo(String value) {
            addCriterion("BANK_ORDERNO =", value, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoNotEqualTo(String value) {
            addCriterion("BANK_ORDERNO <>", value, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoGreaterThan(String value) {
            addCriterion("BANK_ORDERNO >", value, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ORDERNO >=", value, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoLessThan(String value) {
            addCriterion("BANK_ORDERNO <", value, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoLessThanOrEqualTo(String value) {
            addCriterion("BANK_ORDERNO <=", value, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoLike(String value) {
            addCriterion("BANK_ORDERNO like", value, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoNotLike(String value) {
            addCriterion("BANK_ORDERNO not like", value, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoIn(List<String> values) {
            addCriterion("BANK_ORDERNO in", values, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoNotIn(List<String> values) {
            addCriterion("BANK_ORDERNO not in", values, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoBetween(String value1, String value2) {
            addCriterion("BANK_ORDERNO between", value1, value2, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andBankOrdernoNotBetween(String value1, String value2) {
            addCriterion("BANK_ORDERNO not between", value1, value2, "bankOrderno");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("ORDER_TYPE =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("ORDER_TYPE <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("ORDER_TYPE >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("ORDER_TYPE <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("ORDER_TYPE like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("ORDER_TYPE not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("ORDER_TYPE in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("ORDER_TYPE not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andFrpCodeIsNull() {
            addCriterion("FRP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFrpCodeIsNotNull() {
            addCriterion("FRP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFrpCodeEqualTo(String value) {
            addCriterion("FRP_CODE =", value, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeNotEqualTo(String value) {
            addCriterion("FRP_CODE <>", value, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeGreaterThan(String value) {
            addCriterion("FRP_CODE >", value, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FRP_CODE >=", value, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeLessThan(String value) {
            addCriterion("FRP_CODE <", value, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeLessThanOrEqualTo(String value) {
            addCriterion("FRP_CODE <=", value, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeLike(String value) {
            addCriterion("FRP_CODE like", value, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeNotLike(String value) {
            addCriterion("FRP_CODE not like", value, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeIn(List<String> values) {
            addCriterion("FRP_CODE in", values, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeNotIn(List<String> values) {
            addCriterion("FRP_CODE not in", values, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeBetween(String value1, String value2) {
            addCriterion("FRP_CODE between", value1, value2, "frpCode");
            return (Criteria) this;
        }

        public Criteria andFrpCodeNotBetween(String value1, String value2) {
            addCriterion("FRP_CODE not between", value1, value2, "frpCode");
            return (Criteria) this;
        }

        public Criteria andEtltaskidIsNull() {
            addCriterion("ETLTASKID is null");
            return (Criteria) this;
        }

        public Criteria andEtltaskidIsNotNull() {
            addCriterion("ETLTASKID is not null");
            return (Criteria) this;
        }

        public Criteria andEtltaskidEqualTo(String value) {
            addCriterion("ETLTASKID =", value, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidNotEqualTo(String value) {
            addCriterion("ETLTASKID <>", value, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidGreaterThan(String value) {
            addCriterion("ETLTASKID >", value, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidGreaterThanOrEqualTo(String value) {
            addCriterion("ETLTASKID >=", value, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidLessThan(String value) {
            addCriterion("ETLTASKID <", value, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidLessThanOrEqualTo(String value) {
            addCriterion("ETLTASKID <=", value, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidLike(String value) {
            addCriterion("ETLTASKID like", value, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidNotLike(String value) {
            addCriterion("ETLTASKID not like", value, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidIn(List<String> values) {
            addCriterion("ETLTASKID in", values, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidNotIn(List<String> values) {
            addCriterion("ETLTASKID not in", values, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidBetween(String value1, String value2) {
            addCriterion("ETLTASKID between", value1, value2, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andEtltaskidNotBetween(String value1, String value2) {
            addCriterion("ETLTASKID not between", value1, value2, "etltaskid");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNull() {
            addCriterion("TERMINAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("TERMINAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(String value) {
            addCriterion("TERMINAL_ID =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(String value) {
            addCriterion("TERMINAL_ID <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(String value) {
            addCriterion("TERMINAL_ID >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(String value) {
            addCriterion("TERMINAL_ID <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLike(String value) {
            addCriterion("TERMINAL_ID like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotLike(String value) {
            addCriterion("TERMINAL_ID not like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<String> values) {
            addCriterion("TERMINAL_ID in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<String> values) {
            addCriterion("TERMINAL_ID not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID not between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andPrePhoneIsNull() {
            addCriterion("PRE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPrePhoneIsNotNull() {
            addCriterion("PRE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPrePhoneEqualTo(String value) {
            addCriterion("PRE_PHONE =", value, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneNotEqualTo(String value) {
            addCriterion("PRE_PHONE <>", value, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneGreaterThan(String value) {
            addCriterion("PRE_PHONE >", value, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_PHONE >=", value, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneLessThan(String value) {
            addCriterion("PRE_PHONE <", value, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneLessThanOrEqualTo(String value) {
            addCriterion("PRE_PHONE <=", value, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneLike(String value) {
            addCriterion("PRE_PHONE like", value, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneNotLike(String value) {
            addCriterion("PRE_PHONE not like", value, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneIn(List<String> values) {
            addCriterion("PRE_PHONE in", values, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneNotIn(List<String> values) {
            addCriterion("PRE_PHONE not in", values, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneBetween(String value1, String value2) {
            addCriterion("PRE_PHONE between", value1, value2, "prePhone");
            return (Criteria) this;
        }

        public Criteria andPrePhoneNotBetween(String value1, String value2) {
            addCriterion("PRE_PHONE not between", value1, value2, "prePhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("CONTACT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("CONTACT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("CONTACT_PHONE =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("CONTACT_PHONE <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("CONTACT_PHONE >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("CONTACT_PHONE <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("CONTACT_PHONE like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("CONTACT_PHONE not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("CONTACT_PHONE in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("CONTACT_PHONE not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoIsNull() {
            addCriterion("CUSTOMERIDNO is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoIsNotNull() {
            addCriterion("CUSTOMERIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoEqualTo(String value) {
            addCriterion("CUSTOMERIDNO =", value, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoNotEqualTo(String value) {
            addCriterion("CUSTOMERIDNO <>", value, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoGreaterThan(String value) {
            addCriterion("CUSTOMERIDNO >", value, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERIDNO >=", value, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoLessThan(String value) {
            addCriterion("CUSTOMERIDNO <", value, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERIDNO <=", value, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoLike(String value) {
            addCriterion("CUSTOMERIDNO like", value, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoNotLike(String value) {
            addCriterion("CUSTOMERIDNO not like", value, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoIn(List<String> values) {
            addCriterion("CUSTOMERIDNO in", values, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoNotIn(List<String> values) {
            addCriterion("CUSTOMERIDNO not in", values, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoBetween(String value1, String value2) {
            addCriterion("CUSTOMERIDNO between", value1, value2, "customeridno");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERIDNO not between", value1, value2, "customeridno");
            return (Criteria) this;
        }

        public Criteria andAgencyNoIsNull() {
            addCriterion("AGENCY_NO is null");
            return (Criteria) this;
        }

        public Criteria andAgencyNoIsNotNull() {
            addCriterion("AGENCY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyNoEqualTo(String value) {
            addCriterion("AGENCY_NO =", value, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoNotEqualTo(String value) {
            addCriterion("AGENCY_NO <>", value, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoGreaterThan(String value) {
            addCriterion("AGENCY_NO >", value, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoGreaterThanOrEqualTo(String value) {
            addCriterion("AGENCY_NO >=", value, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoLessThan(String value) {
            addCriterion("AGENCY_NO <", value, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoLessThanOrEqualTo(String value) {
            addCriterion("AGENCY_NO <=", value, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoLike(String value) {
            addCriterion("AGENCY_NO like", value, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoNotLike(String value) {
            addCriterion("AGENCY_NO not like", value, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoIn(List<String> values) {
            addCriterion("AGENCY_NO in", values, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoNotIn(List<String> values) {
            addCriterion("AGENCY_NO not in", values, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoBetween(String value1, String value2) {
            addCriterion("AGENCY_NO between", value1, value2, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andAgencyNoNotBetween(String value1, String value2) {
            addCriterion("AGENCY_NO not between", value1, value2, "agencyNo");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIsNull() {
            addCriterion("PASSENGER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIsNotNull() {
            addCriterion("PASSENGER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneEqualTo(String value) {
            addCriterion("PASSENGER_PHONE =", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotEqualTo(String value) {
            addCriterion("PASSENGER_PHONE <>", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneGreaterThan(String value) {
            addCriterion("PASSENGER_PHONE >", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PASSENGER_PHONE >=", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLessThan(String value) {
            addCriterion("PASSENGER_PHONE <", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLessThanOrEqualTo(String value) {
            addCriterion("PASSENGER_PHONE <=", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLike(String value) {
            addCriterion("PASSENGER_PHONE like", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotLike(String value) {
            addCriterion("PASSENGER_PHONE not like", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIn(List<String> values) {
            addCriterion("PASSENGER_PHONE in", values, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotIn(List<String> values) {
            addCriterion("PASSENGER_PHONE not in", values, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneBetween(String value1, String value2) {
            addCriterion("PASSENGER_PHONE between", value1, value2, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotBetween(String value1, String value2) {
            addCriterion("PASSENGER_PHONE not between", value1, value2, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoIsNull() {
            addCriterion("TARGET_MERCHANT_NO is null");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoIsNotNull() {
            addCriterion("TARGET_MERCHANT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoEqualTo(String value) {
            addCriterion("TARGET_MERCHANT_NO =", value, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoNotEqualTo(String value) {
            addCriterion("TARGET_MERCHANT_NO <>", value, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoGreaterThan(String value) {
            addCriterion("TARGET_MERCHANT_NO >", value, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET_MERCHANT_NO >=", value, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoLessThan(String value) {
            addCriterion("TARGET_MERCHANT_NO <", value, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("TARGET_MERCHANT_NO <=", value, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoLike(String value) {
            addCriterion("TARGET_MERCHANT_NO like", value, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoNotLike(String value) {
            addCriterion("TARGET_MERCHANT_NO not like", value, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoIn(List<String> values) {
            addCriterion("TARGET_MERCHANT_NO in", values, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoNotIn(List<String> values) {
            addCriterion("TARGET_MERCHANT_NO not in", values, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoBetween(String value1, String value2) {
            addCriterion("TARGET_MERCHANT_NO between", value1, value2, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andTargetMerchantNoNotBetween(String value1, String value2) {
            addCriterion("TARGET_MERCHANT_NO not between", value1, value2, "targetMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoIsNull() {
            addCriterion("REQUEST_MERCHANT_NO is null");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoIsNotNull() {
            addCriterion("REQUEST_MERCHANT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoEqualTo(String value) {
            addCriterion("REQUEST_MERCHANT_NO =", value, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoNotEqualTo(String value) {
            addCriterion("REQUEST_MERCHANT_NO <>", value, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoGreaterThan(String value) {
            addCriterion("REQUEST_MERCHANT_NO >", value, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_MERCHANT_NO >=", value, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoLessThan(String value) {
            addCriterion("REQUEST_MERCHANT_NO <", value, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_MERCHANT_NO <=", value, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoLike(String value) {
            addCriterion("REQUEST_MERCHANT_NO like", value, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoNotLike(String value) {
            addCriterion("REQUEST_MERCHANT_NO not like", value, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoIn(List<String> values) {
            addCriterion("REQUEST_MERCHANT_NO in", values, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoNotIn(List<String> values) {
            addCriterion("REQUEST_MERCHANT_NO not in", values, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoBetween(String value1, String value2) {
            addCriterion("REQUEST_MERCHANT_NO between", value1, value2, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andRequestMerchantNoNotBetween(String value1, String value2) {
            addCriterion("REQUEST_MERCHANT_NO not between", value1, value2, "requestMerchantNo");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeIsNull() {
            addCriterion("TARGET_USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeIsNotNull() {
            addCriterion("TARGET_USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeEqualTo(String value) {
            addCriterion("TARGET_USER_TYPE =", value, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeNotEqualTo(String value) {
            addCriterion("TARGET_USER_TYPE <>", value, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeGreaterThan(String value) {
            addCriterion("TARGET_USER_TYPE >", value, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET_USER_TYPE >=", value, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeLessThan(String value) {
            addCriterion("TARGET_USER_TYPE <", value, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeLessThanOrEqualTo(String value) {
            addCriterion("TARGET_USER_TYPE <=", value, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeLike(String value) {
            addCriterion("TARGET_USER_TYPE like", value, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeNotLike(String value) {
            addCriterion("TARGET_USER_TYPE not like", value, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeIn(List<String> values) {
            addCriterion("TARGET_USER_TYPE in", values, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeNotIn(List<String> values) {
            addCriterion("TARGET_USER_TYPE not in", values, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeBetween(String value1, String value2) {
            addCriterion("TARGET_USER_TYPE between", value1, value2, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andTargetUserTypeNotBetween(String value1, String value2) {
            addCriterion("TARGET_USER_TYPE not between", value1, value2, "targetUserType");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestIsNull() {
            addCriterion("PRE_PHONE_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestIsNotNull() {
            addCriterion("PRE_PHONE_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestEqualTo(String value) {
            addCriterion("PRE_PHONE_DIGEST =", value, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestNotEqualTo(String value) {
            addCriterion("PRE_PHONE_DIGEST <>", value, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestGreaterThan(String value) {
            addCriterion("PRE_PHONE_DIGEST >", value, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_PHONE_DIGEST >=", value, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestLessThan(String value) {
            addCriterion("PRE_PHONE_DIGEST <", value, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestLessThanOrEqualTo(String value) {
            addCriterion("PRE_PHONE_DIGEST <=", value, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestLike(String value) {
            addCriterion("PRE_PHONE_DIGEST like", value, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestNotLike(String value) {
            addCriterion("PRE_PHONE_DIGEST not like", value, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestIn(List<String> values) {
            addCriterion("PRE_PHONE_DIGEST in", values, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestNotIn(List<String> values) {
            addCriterion("PRE_PHONE_DIGEST not in", values, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestBetween(String value1, String value2) {
            addCriterion("PRE_PHONE_DIGEST between", value1, value2, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPrePhoneDigestNotBetween(String value1, String value2) {
            addCriterion("PRE_PHONE_DIGEST not between", value1, value2, "prePhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestIsNull() {
            addCriterion("CONTACT_PHONE_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestIsNotNull() {
            addCriterion("CONTACT_PHONE_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestEqualTo(String value) {
            addCriterion("CONTACT_PHONE_DIGEST =", value, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestNotEqualTo(String value) {
            addCriterion("CONTACT_PHONE_DIGEST <>", value, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestGreaterThan(String value) {
            addCriterion("CONTACT_PHONE_DIGEST >", value, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE_DIGEST >=", value, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestLessThan(String value) {
            addCriterion("CONTACT_PHONE_DIGEST <", value, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE_DIGEST <=", value, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestLike(String value) {
            addCriterion("CONTACT_PHONE_DIGEST like", value, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestNotLike(String value) {
            addCriterion("CONTACT_PHONE_DIGEST not like", value, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestIn(List<String> values) {
            addCriterion("CONTACT_PHONE_DIGEST in", values, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestNotIn(List<String> values) {
            addCriterion("CONTACT_PHONE_DIGEST not in", values, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE_DIGEST between", value1, value2, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andContactPhoneDigestNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE_DIGEST not between", value1, value2, "contactPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestIsNull() {
            addCriterion("ID_NO_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestIsNotNull() {
            addCriterion("ID_NO_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestEqualTo(String value) {
            addCriterion("ID_NO_DIGEST =", value, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestNotEqualTo(String value) {
            addCriterion("ID_NO_DIGEST <>", value, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestGreaterThan(String value) {
            addCriterion("ID_NO_DIGEST >", value, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO_DIGEST >=", value, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestLessThan(String value) {
            addCriterion("ID_NO_DIGEST <", value, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestLessThanOrEqualTo(String value) {
            addCriterion("ID_NO_DIGEST <=", value, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestLike(String value) {
            addCriterion("ID_NO_DIGEST like", value, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestNotLike(String value) {
            addCriterion("ID_NO_DIGEST not like", value, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestIn(List<String> values) {
            addCriterion("ID_NO_DIGEST in", values, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestNotIn(List<String> values) {
            addCriterion("ID_NO_DIGEST not in", values, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestBetween(String value1, String value2) {
            addCriterion("ID_NO_DIGEST between", value1, value2, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andIdNoDigestNotBetween(String value1, String value2) {
            addCriterion("ID_NO_DIGEST not between", value1, value2, "idNoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestIsNull() {
            addCriterion("CUSTOMERIDNO_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestIsNotNull() {
            addCriterion("CUSTOMERIDNO_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestEqualTo(String value) {
            addCriterion("CUSTOMERIDNO_DIGEST =", value, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestNotEqualTo(String value) {
            addCriterion("CUSTOMERIDNO_DIGEST <>", value, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestGreaterThan(String value) {
            addCriterion("CUSTOMERIDNO_DIGEST >", value, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERIDNO_DIGEST >=", value, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestLessThan(String value) {
            addCriterion("CUSTOMERIDNO_DIGEST <", value, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERIDNO_DIGEST <=", value, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestLike(String value) {
            addCriterion("CUSTOMERIDNO_DIGEST like", value, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestNotLike(String value) {
            addCriterion("CUSTOMERIDNO_DIGEST not like", value, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestIn(List<String> values) {
            addCriterion("CUSTOMERIDNO_DIGEST in", values, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestNotIn(List<String> values) {
            addCriterion("CUSTOMERIDNO_DIGEST not in", values, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestBetween(String value1, String value2) {
            addCriterion("CUSTOMERIDNO_DIGEST between", value1, value2, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCustomeridnoDigestNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERIDNO_DIGEST not between", value1, value2, "customeridnoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestIsNull() {
            addCriterion("CRD_NO_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestIsNotNull() {
            addCriterion("CRD_NO_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestEqualTo(String value) {
            addCriterion("CRD_NO_DIGEST =", value, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestNotEqualTo(String value) {
            addCriterion("CRD_NO_DIGEST <>", value, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestGreaterThan(String value) {
            addCriterion("CRD_NO_DIGEST >", value, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestGreaterThanOrEqualTo(String value) {
            addCriterion("CRD_NO_DIGEST >=", value, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestLessThan(String value) {
            addCriterion("CRD_NO_DIGEST <", value, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestLessThanOrEqualTo(String value) {
            addCriterion("CRD_NO_DIGEST <=", value, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestLike(String value) {
            addCriterion("CRD_NO_DIGEST like", value, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestNotLike(String value) {
            addCriterion("CRD_NO_DIGEST not like", value, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestIn(List<String> values) {
            addCriterion("CRD_NO_DIGEST in", values, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestNotIn(List<String> values) {
            addCriterion("CRD_NO_DIGEST not in", values, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestBetween(String value1, String value2) {
            addCriterion("CRD_NO_DIGEST between", value1, value2, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andCrdNoDigestNotBetween(String value1, String value2) {
            addCriterion("CRD_NO_DIGEST not between", value1, value2, "crdNoDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestIsNull() {
            addCriterion("MOBILE_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andMobileDigestIsNotNull() {
            addCriterion("MOBILE_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andMobileDigestEqualTo(String value) {
            addCriterion("MOBILE_DIGEST =", value, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestNotEqualTo(String value) {
            addCriterion("MOBILE_DIGEST <>", value, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestGreaterThan(String value) {
            addCriterion("MOBILE_DIGEST >", value, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_DIGEST >=", value, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestLessThan(String value) {
            addCriterion("MOBILE_DIGEST <", value, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_DIGEST <=", value, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestLike(String value) {
            addCriterion("MOBILE_DIGEST like", value, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestNotLike(String value) {
            addCriterion("MOBILE_DIGEST not like", value, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestIn(List<String> values) {
            addCriterion("MOBILE_DIGEST in", values, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestNotIn(List<String> values) {
            addCriterion("MOBILE_DIGEST not in", values, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestBetween(String value1, String value2) {
            addCriterion("MOBILE_DIGEST between", value1, value2, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andMobileDigestNotBetween(String value1, String value2) {
            addCriterion("MOBILE_DIGEST not between", value1, value2, "mobileDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestIsNull() {
            addCriterion("PASSENGER_PHONE_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestIsNotNull() {
            addCriterion("PASSENGER_PHONE_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestEqualTo(String value) {
            addCriterion("PASSENGER_PHONE_DIGEST =", value, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestNotEqualTo(String value) {
            addCriterion("PASSENGER_PHONE_DIGEST <>", value, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestGreaterThan(String value) {
            addCriterion("PASSENGER_PHONE_DIGEST >", value, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestGreaterThanOrEqualTo(String value) {
            addCriterion("PASSENGER_PHONE_DIGEST >=", value, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestLessThan(String value) {
            addCriterion("PASSENGER_PHONE_DIGEST <", value, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestLessThanOrEqualTo(String value) {
            addCriterion("PASSENGER_PHONE_DIGEST <=", value, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestLike(String value) {
            addCriterion("PASSENGER_PHONE_DIGEST like", value, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestNotLike(String value) {
            addCriterion("PASSENGER_PHONE_DIGEST not like", value, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestIn(List<String> values) {
            addCriterion("PASSENGER_PHONE_DIGEST in", values, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestNotIn(List<String> values) {
            addCriterion("PASSENGER_PHONE_DIGEST not in", values, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestBetween(String value1, String value2) {
            addCriterion("PASSENGER_PHONE_DIGEST between", value1, value2, "passengerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneDigestNotBetween(String value1, String value2) {
            addCriterion("PASSENGER_PHONE_DIGEST not between", value1, value2, "passengerPhoneDigest");
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
     * @date 2023-03-30
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
