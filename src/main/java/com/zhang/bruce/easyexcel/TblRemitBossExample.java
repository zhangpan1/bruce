package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblRemitBossExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRemitBossExample() {
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

        public Criteria andFileUrlIsNull() {
            addCriterion("FILE_URL is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("FILE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("FILE_URL =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("FILE_URL <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("FILE_URL >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_URL >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("FILE_URL <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("FILE_URL <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("FILE_URL like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("FILE_URL not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("FILE_URL in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("FILE_URL not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("FILE_URL between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("FILE_URL not between", value1, value2, "fileUrl");
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

        public Criteria andOrdAmtIsNull() {
            addCriterion("ORD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOrdAmtIsNotNull() {
            addCriterion("ORD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdAmtEqualTo(BigDecimal value) {
            addCriterion("ORD_AMT =", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtNotEqualTo(BigDecimal value) {
            addCriterion("ORD_AMT <>", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtGreaterThan(BigDecimal value) {
            addCriterion("ORD_AMT >", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORD_AMT >=", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtLessThan(BigDecimal value) {
            addCriterion("ORD_AMT <", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORD_AMT <=", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtIn(List<BigDecimal> values) {
            addCriterion("ORD_AMT in", values, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtNotIn(List<BigDecimal> values) {
            addCriterion("ORD_AMT not in", values, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORD_AMT between", value1, value2, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORD_AMT not between", value1, value2, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andRefAmtIsNull() {
            addCriterion("REF_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRefAmtIsNotNull() {
            addCriterion("REF_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRefAmtEqualTo(BigDecimal value) {
            addCriterion("REF_AMT =", value, "refAmt");
            return (Criteria) this;
        }

        public Criteria andRefAmtNotEqualTo(BigDecimal value) {
            addCriterion("REF_AMT <>", value, "refAmt");
            return (Criteria) this;
        }

        public Criteria andRefAmtGreaterThan(BigDecimal value) {
            addCriterion("REF_AMT >", value, "refAmt");
            return (Criteria) this;
        }

        public Criteria andRefAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REF_AMT >=", value, "refAmt");
            return (Criteria) this;
        }

        public Criteria andRefAmtLessThan(BigDecimal value) {
            addCriterion("REF_AMT <", value, "refAmt");
            return (Criteria) this;
        }

        public Criteria andRefAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REF_AMT <=", value, "refAmt");
            return (Criteria) this;
        }

        public Criteria andRefAmtIn(List<BigDecimal> values) {
            addCriterion("REF_AMT in", values, "refAmt");
            return (Criteria) this;
        }

        public Criteria andRefAmtNotIn(List<BigDecimal> values) {
            addCriterion("REF_AMT not in", values, "refAmt");
            return (Criteria) this;
        }

        public Criteria andRefAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REF_AMT between", value1, value2, "refAmt");
            return (Criteria) this;
        }

        public Criteria andRefAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REF_AMT not between", value1, value2, "refAmt");
            return (Criteria) this;
        }

        public Criteria andDvdAmtIsNull() {
            addCriterion("DVD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDvdAmtIsNotNull() {
            addCriterion("DVD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDvdAmtEqualTo(BigDecimal value) {
            addCriterion("DVD_AMT =", value, "dvdAmt");
            return (Criteria) this;
        }

        public Criteria andDvdAmtNotEqualTo(BigDecimal value) {
            addCriterion("DVD_AMT <>", value, "dvdAmt");
            return (Criteria) this;
        }

        public Criteria andDvdAmtGreaterThan(BigDecimal value) {
            addCriterion("DVD_AMT >", value, "dvdAmt");
            return (Criteria) this;
        }

        public Criteria andDvdAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DVD_AMT >=", value, "dvdAmt");
            return (Criteria) this;
        }

        public Criteria andDvdAmtLessThan(BigDecimal value) {
            addCriterion("DVD_AMT <", value, "dvdAmt");
            return (Criteria) this;
        }

        public Criteria andDvdAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DVD_AMT <=", value, "dvdAmt");
            return (Criteria) this;
        }

        public Criteria andDvdAmtIn(List<BigDecimal> values) {
            addCriterion("DVD_AMT in", values, "dvdAmt");
            return (Criteria) this;
        }

        public Criteria andDvdAmtNotIn(List<BigDecimal> values) {
            addCriterion("DVD_AMT not in", values, "dvdAmt");
            return (Criteria) this;
        }

        public Criteria andDvdAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DVD_AMT between", value1, value2, "dvdAmt");
            return (Criteria) this;
        }

        public Criteria andDvdAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DVD_AMT not between", value1, value2, "dvdAmt");
            return (Criteria) this;
        }

        public Criteria andDvdDetailIsNull() {
            addCriterion("DVD_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDvdDetailIsNotNull() {
            addCriterion("DVD_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDvdDetailEqualTo(String value) {
            addCriterion("DVD_DETAIL =", value, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailNotEqualTo(String value) {
            addCriterion("DVD_DETAIL <>", value, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailGreaterThan(String value) {
            addCriterion("DVD_DETAIL >", value, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailGreaterThanOrEqualTo(String value) {
            addCriterion("DVD_DETAIL >=", value, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailLessThan(String value) {
            addCriterion("DVD_DETAIL <", value, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailLessThanOrEqualTo(String value) {
            addCriterion("DVD_DETAIL <=", value, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailLike(String value) {
            addCriterion("DVD_DETAIL like", value, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailNotLike(String value) {
            addCriterion("DVD_DETAIL not like", value, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailIn(List<String> values) {
            addCriterion("DVD_DETAIL in", values, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailNotIn(List<String> values) {
            addCriterion("DVD_DETAIL not in", values, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailBetween(String value1, String value2) {
            addCriterion("DVD_DETAIL between", value1, value2, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDvdDetailNotBetween(String value1, String value2) {
            addCriterion("DVD_DETAIL not between", value1, value2, "dvdDetail");
            return (Criteria) this;
        }

        public Criteria andDealStatusIsNull() {
            addCriterion("DEAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDealStatusIsNotNull() {
            addCriterion("DEAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDealStatusEqualTo(String value) {
            addCriterion("DEAL_STATUS =", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotEqualTo(String value) {
            addCriterion("DEAL_STATUS <>", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusGreaterThan(String value) {
            addCriterion("DEAL_STATUS >", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_STATUS >=", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusLessThan(String value) {
            addCriterion("DEAL_STATUS <", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusLessThanOrEqualTo(String value) {
            addCriterion("DEAL_STATUS <=", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusLike(String value) {
            addCriterion("DEAL_STATUS like", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotLike(String value) {
            addCriterion("DEAL_STATUS not like", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusIn(List<String> values) {
            addCriterion("DEAL_STATUS in", values, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotIn(List<String> values) {
            addCriterion("DEAL_STATUS not in", values, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusBetween(String value1, String value2) {
            addCriterion("DEAL_STATUS between", value1, value2, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotBetween(String value1, String value2) {
            addCriterion("DEAL_STATUS not between", value1, value2, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andParseInfoIsNull() {
            addCriterion("PARSE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andParseInfoIsNotNull() {
            addCriterion("PARSE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andParseInfoEqualTo(String value) {
            addCriterion("PARSE_INFO =", value, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoNotEqualTo(String value) {
            addCriterion("PARSE_INFO <>", value, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoGreaterThan(String value) {
            addCriterion("PARSE_INFO >", value, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PARSE_INFO >=", value, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoLessThan(String value) {
            addCriterion("PARSE_INFO <", value, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoLessThanOrEqualTo(String value) {
            addCriterion("PARSE_INFO <=", value, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoLike(String value) {
            addCriterion("PARSE_INFO like", value, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoNotLike(String value) {
            addCriterion("PARSE_INFO not like", value, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoIn(List<String> values) {
            addCriterion("PARSE_INFO in", values, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoNotIn(List<String> values) {
            addCriterion("PARSE_INFO not in", values, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoBetween(String value1, String value2) {
            addCriterion("PARSE_INFO between", value1, value2, "parseInfo");
            return (Criteria) this;
        }

        public Criteria andParseInfoNotBetween(String value1, String value2) {
            addCriterion("PARSE_INFO not between", value1, value2, "parseInfo");
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
