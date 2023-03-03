package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblRemitBossDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRemitBossDetailExample() {
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

        public Criteria andDvdreqIdIsNull() {
            addCriterion("DVDREQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdIsNotNull() {
            addCriterion("DVDREQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdEqualTo(String value) {
            addCriterion("DVDREQ_ID =", value, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdNotEqualTo(String value) {
            addCriterion("DVDREQ_ID <>", value, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdGreaterThan(String value) {
            addCriterion("DVDREQ_ID >", value, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdGreaterThanOrEqualTo(String value) {
            addCriterion("DVDREQ_ID >=", value, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdLessThan(String value) {
            addCriterion("DVDREQ_ID <", value, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdLessThanOrEqualTo(String value) {
            addCriterion("DVDREQ_ID <=", value, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdLike(String value) {
            addCriterion("DVDREQ_ID like", value, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdNotLike(String value) {
            addCriterion("DVDREQ_ID not like", value, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdIn(List<String> values) {
            addCriterion("DVDREQ_ID in", values, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdNotIn(List<String> values) {
            addCriterion("DVDREQ_ID not in", values, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdBetween(String value1, String value2) {
            addCriterion("DVDREQ_ID between", value1, value2, "dvdreqId");
            return (Criteria) this;
        }

        public Criteria andDvdreqIdNotBetween(String value1, String value2) {
            addCriterion("DVDREQ_ID not between", value1, value2, "dvdreqId");
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

        public Criteria andLedgerNameIsNull() {
            addCriterion("LEDGER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLedgerNameIsNotNull() {
            addCriterion("LEDGER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerNameEqualTo(String value) {
            addCriterion("LEDGER_NAME =", value, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameNotEqualTo(String value) {
            addCriterion("LEDGER_NAME <>", value, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameGreaterThan(String value) {
            addCriterion("LEDGER_NAME >", value, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_NAME >=", value, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameLessThan(String value) {
            addCriterion("LEDGER_NAME <", value, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_NAME <=", value, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameLike(String value) {
            addCriterion("LEDGER_NAME like", value, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameNotLike(String value) {
            addCriterion("LEDGER_NAME not like", value, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameIn(List<String> values) {
            addCriterion("LEDGER_NAME in", values, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameNotIn(List<String> values) {
            addCriterion("LEDGER_NAME not in", values, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameBetween(String value1, String value2) {
            addCriterion("LEDGER_NAME between", value1, value2, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerNameNotBetween(String value1, String value2) {
            addCriterion("LEDGER_NAME not between", value1, value2, "ledgerName");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoIsNull() {
            addCriterion("LEDGER_CRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoIsNotNull() {
            addCriterion("LEDGER_CRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoEqualTo(String value) {
            addCriterion("LEDGER_CRD_NO =", value, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoNotEqualTo(String value) {
            addCriterion("LEDGER_CRD_NO <>", value, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoGreaterThan(String value) {
            addCriterion("LEDGER_CRD_NO >", value, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_CRD_NO >=", value, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoLessThan(String value) {
            addCriterion("LEDGER_CRD_NO <", value, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_CRD_NO <=", value, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoLike(String value) {
            addCriterion("LEDGER_CRD_NO like", value, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoNotLike(String value) {
            addCriterion("LEDGER_CRD_NO not like", value, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoIn(List<String> values) {
            addCriterion("LEDGER_CRD_NO in", values, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoNotIn(List<String> values) {
            addCriterion("LEDGER_CRD_NO not in", values, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoBetween(String value1, String value2) {
            addCriterion("LEDGER_CRD_NO between", value1, value2, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoNotBetween(String value1, String value2) {
            addCriterion("LEDGER_CRD_NO not between", value1, value2, "ledgerCrdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoIsNull() {
            addCriterion("LEDGER_ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoIsNotNull() {
            addCriterion("LEDGER_ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoEqualTo(String value) {
            addCriterion("LEDGER_ID_NO =", value, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoNotEqualTo(String value) {
            addCriterion("LEDGER_ID_NO <>", value, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoGreaterThan(String value) {
            addCriterion("LEDGER_ID_NO >", value, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_ID_NO >=", value, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoLessThan(String value) {
            addCriterion("LEDGER_ID_NO <", value, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_ID_NO <=", value, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoLike(String value) {
            addCriterion("LEDGER_ID_NO like", value, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoNotLike(String value) {
            addCriterion("LEDGER_ID_NO not like", value, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoIn(List<String> values) {
            addCriterion("LEDGER_ID_NO in", values, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoNotIn(List<String> values) {
            addCriterion("LEDGER_ID_NO not in", values, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoBetween(String value1, String value2) {
            addCriterion("LEDGER_ID_NO between", value1, value2, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoNotBetween(String value1, String value2) {
            addCriterion("LEDGER_ID_NO not between", value1, value2, "ledgerIdNo");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneIsNull() {
            addCriterion("LEDGER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneIsNotNull() {
            addCriterion("LEDGER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneEqualTo(String value) {
            addCriterion("LEDGER_PHONE =", value, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneNotEqualTo(String value) {
            addCriterion("LEDGER_PHONE <>", value, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneGreaterThan(String value) {
            addCriterion("LEDGER_PHONE >", value, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_PHONE >=", value, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneLessThan(String value) {
            addCriterion("LEDGER_PHONE <", value, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_PHONE <=", value, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneLike(String value) {
            addCriterion("LEDGER_PHONE like", value, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneNotLike(String value) {
            addCriterion("LEDGER_PHONE not like", value, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneIn(List<String> values) {
            addCriterion("LEDGER_PHONE in", values, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneNotIn(List<String> values) {
            addCriterion("LEDGER_PHONE not in", values, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneBetween(String value1, String value2) {
            addCriterion("LEDGER_PHONE between", value1, value2, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneNotBetween(String value1, String value2) {
            addCriterion("LEDGER_PHONE not between", value1, value2, "ledgerPhone");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleIsNull() {
            addCriterion("LEDGER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleIsNotNull() {
            addCriterion("LEDGER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleEqualTo(String value) {
            addCriterion("LEDGER_ROLE =", value, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleNotEqualTo(String value) {
            addCriterion("LEDGER_ROLE <>", value, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleGreaterThan(String value) {
            addCriterion("LEDGER_ROLE >", value, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_ROLE >=", value, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleLessThan(String value) {
            addCriterion("LEDGER_ROLE <", value, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_ROLE <=", value, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleLike(String value) {
            addCriterion("LEDGER_ROLE like", value, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleNotLike(String value) {
            addCriterion("LEDGER_ROLE not like", value, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleIn(List<String> values) {
            addCriterion("LEDGER_ROLE in", values, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleNotIn(List<String> values) {
            addCriterion("LEDGER_ROLE not in", values, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleBetween(String value1, String value2) {
            addCriterion("LEDGER_ROLE between", value1, value2, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andLedgerRoleNotBetween(String value1, String value2) {
            addCriterion("LEDGER_ROLE not between", value1, value2, "ledgerRole");
            return (Criteria) this;
        }

        public Criteria andSceneIsNull() {
            addCriterion("SCENE is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("SCENE is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(String value) {
            addCriterion("SCENE =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(String value) {
            addCriterion("SCENE <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(String value) {
            addCriterion("SCENE >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(String value) {
            addCriterion("SCENE >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(String value) {
            addCriterion("SCENE <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(String value) {
            addCriterion("SCENE <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLike(String value) {
            addCriterion("SCENE like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLike(String value) {
            addCriterion("SCENE not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<String> values) {
            addCriterion("SCENE in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<String> values) {
            addCriterion("SCENE not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(String value1, String value2) {
            addCriterion("SCENE between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(String value1, String value2) {
            addCriterion("SCENE not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andStaIsNull() {
            addCriterion("STA is null");
            return (Criteria) this;
        }

        public Criteria andStaIsNotNull() {
            addCriterion("STA is not null");
            return (Criteria) this;
        }

        public Criteria andStaEqualTo(String value) {
            addCriterion("STA =", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaNotEqualTo(String value) {
            addCriterion("STA <>", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaGreaterThan(String value) {
            addCriterion("STA >", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaGreaterThanOrEqualTo(String value) {
            addCriterion("STA >=", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaLessThan(String value) {
            addCriterion("STA <", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaLessThanOrEqualTo(String value) {
            addCriterion("STA <=", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaLike(String value) {
            addCriterion("STA like", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaNotLike(String value) {
            addCriterion("STA not like", value, "sta");
            return (Criteria) this;
        }

        public Criteria andStaIn(List<String> values) {
            addCriterion("STA in", values, "sta");
            return (Criteria) this;
        }

        public Criteria andStaNotIn(List<String> values) {
            addCriterion("STA not in", values, "sta");
            return (Criteria) this;
        }

        public Criteria andStaBetween(String value1, String value2) {
            addCriterion("STA between", value1, value2, "sta");
            return (Criteria) this;
        }

        public Criteria andStaNotBetween(String value1, String value2) {
            addCriterion("STA not between", value1, value2, "sta");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION not between", value1, value2, "version");
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

        public Criteria andLedgerNameDigestIsNull() {
            addCriterion("LEDGER_NAME_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestIsNotNull() {
            addCriterion("LEDGER_NAME_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestEqualTo(String value) {
            addCriterion("LEDGER_NAME_DIGEST =", value, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestNotEqualTo(String value) {
            addCriterion("LEDGER_NAME_DIGEST <>", value, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestGreaterThan(String value) {
            addCriterion("LEDGER_NAME_DIGEST >", value, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_NAME_DIGEST >=", value, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestLessThan(String value) {
            addCriterion("LEDGER_NAME_DIGEST <", value, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_NAME_DIGEST <=", value, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestLike(String value) {
            addCriterion("LEDGER_NAME_DIGEST like", value, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestNotLike(String value) {
            addCriterion("LEDGER_NAME_DIGEST not like", value, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestIn(List<String> values) {
            addCriterion("LEDGER_NAME_DIGEST in", values, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestNotIn(List<String> values) {
            addCriterion("LEDGER_NAME_DIGEST not in", values, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestBetween(String value1, String value2) {
            addCriterion("LEDGER_NAME_DIGEST between", value1, value2, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerNameDigestNotBetween(String value1, String value2) {
            addCriterion("LEDGER_NAME_DIGEST not between", value1, value2, "ledgerNameDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestIsNull() {
            addCriterion("LEDGER_CRD_NO_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestIsNotNull() {
            addCriterion("LEDGER_CRD_NO_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestEqualTo(String value) {
            addCriterion("LEDGER_CRD_NO_DIGEST =", value, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestNotEqualTo(String value) {
            addCriterion("LEDGER_CRD_NO_DIGEST <>", value, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestGreaterThan(String value) {
            addCriterion("LEDGER_CRD_NO_DIGEST >", value, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_CRD_NO_DIGEST >=", value, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestLessThan(String value) {
            addCriterion("LEDGER_CRD_NO_DIGEST <", value, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_CRD_NO_DIGEST <=", value, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestLike(String value) {
            addCriterion("LEDGER_CRD_NO_DIGEST like", value, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestNotLike(String value) {
            addCriterion("LEDGER_CRD_NO_DIGEST not like", value, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestIn(List<String> values) {
            addCriterion("LEDGER_CRD_NO_DIGEST in", values, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestNotIn(List<String> values) {
            addCriterion("LEDGER_CRD_NO_DIGEST not in", values, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestBetween(String value1, String value2) {
            addCriterion("LEDGER_CRD_NO_DIGEST between", value1, value2, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerCrdNoDigestNotBetween(String value1, String value2) {
            addCriterion("LEDGER_CRD_NO_DIGEST not between", value1, value2, "ledgerCrdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestIsNull() {
            addCriterion("LEDGER_ID_NO_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestIsNotNull() {
            addCriterion("LEDGER_ID_NO_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestEqualTo(String value) {
            addCriterion("LEDGER_ID_NO_DIGEST =", value, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestNotEqualTo(String value) {
            addCriterion("LEDGER_ID_NO_DIGEST <>", value, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestGreaterThan(String value) {
            addCriterion("LEDGER_ID_NO_DIGEST >", value, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_ID_NO_DIGEST >=", value, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestLessThan(String value) {
            addCriterion("LEDGER_ID_NO_DIGEST <", value, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_ID_NO_DIGEST <=", value, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestLike(String value) {
            addCriterion("LEDGER_ID_NO_DIGEST like", value, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestNotLike(String value) {
            addCriterion("LEDGER_ID_NO_DIGEST not like", value, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestIn(List<String> values) {
            addCriterion("LEDGER_ID_NO_DIGEST in", values, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestNotIn(List<String> values) {
            addCriterion("LEDGER_ID_NO_DIGEST not in", values, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestBetween(String value1, String value2) {
            addCriterion("LEDGER_ID_NO_DIGEST between", value1, value2, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNoDigestNotBetween(String value1, String value2) {
            addCriterion("LEDGER_ID_NO_DIGEST not between", value1, value2, "ledgerIdNoDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestIsNull() {
            addCriterion("LEDGER_PHONE_DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestIsNotNull() {
            addCriterion("LEDGER_PHONE_DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestEqualTo(String value) {
            addCriterion("LEDGER_PHONE_DIGEST =", value, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestNotEqualTo(String value) {
            addCriterion("LEDGER_PHONE_DIGEST <>", value, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestGreaterThan(String value) {
            addCriterion("LEDGER_PHONE_DIGEST >", value, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_PHONE_DIGEST >=", value, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestLessThan(String value) {
            addCriterion("LEDGER_PHONE_DIGEST <", value, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_PHONE_DIGEST <=", value, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestLike(String value) {
            addCriterion("LEDGER_PHONE_DIGEST like", value, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestNotLike(String value) {
            addCriterion("LEDGER_PHONE_DIGEST not like", value, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestIn(List<String> values) {
            addCriterion("LEDGER_PHONE_DIGEST in", values, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestNotIn(List<String> values) {
            addCriterion("LEDGER_PHONE_DIGEST not in", values, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestBetween(String value1, String value2) {
            addCriterion("LEDGER_PHONE_DIGEST between", value1, value2, "ledgerPhoneDigest");
            return (Criteria) this;
        }

        public Criteria andLedgerPhoneDigestNotBetween(String value1, String value2) {
            addCriterion("LEDGER_PHONE_DIGEST not between", value1, value2, "ledgerPhoneDigest");
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
