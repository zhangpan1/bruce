package com.zhang.bruce.easyexcel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerchantSomplaintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantSomplaintExample() {
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
     *
     *
     * @author wcyong
     *
     * @date 2023-01-13
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAcceptanceDateIsNull() {
            addCriterion("acceptance_date is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIsNotNull() {
            addCriterion("acceptance_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date =", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date <>", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("acceptance_date >", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date >=", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateLessThan(Date value) {
            addCriterionForJDBCDate("acceptance_date <", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date <=", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIn(List<Date> values) {
            addCriterionForJDBCDate("acceptance_date in", values, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("acceptance_date not in", values, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("acceptance_date between", value1, value2, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("acceptance_date not between", value1, value2, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeIsNull() {
            addCriterion("acceptance_time is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeIsNotNull() {
            addCriterion("acceptance_time is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeEqualTo(Date value) {
            addCriterion("acceptance_time =", value, "acceptanceTime");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeNotEqualTo(Date value) {
            addCriterion("acceptance_time <>", value, "acceptanceTime");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeGreaterThan(Date value) {
            addCriterion("acceptance_time >", value, "acceptanceTime");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("acceptance_time >=", value, "acceptanceTime");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeLessThan(Date value) {
            addCriterion("acceptance_time <", value, "acceptanceTime");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("acceptance_time <=", value, "acceptanceTime");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeIn(List<Date> values) {
            addCriterion("acceptance_time in", values, "acceptanceTime");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeNotIn(List<Date> values) {
            addCriterion("acceptance_time not in", values, "acceptanceTime");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeBetween(Date value1, Date value2) {
            addCriterion("acceptance_time between", value1, value2, "acceptanceTime");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("acceptance_time not between", value1, value2, "acceptanceTime");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceIsNull() {
            addCriterion("somplaint_source is null");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceIsNotNull() {
            addCriterion("somplaint_source is not null");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceEqualTo(String value) {
            addCriterion("somplaint_source =", value, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceNotEqualTo(String value) {
            addCriterion("somplaint_source <>", value, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceGreaterThan(String value) {
            addCriterion("somplaint_source >", value, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceGreaterThanOrEqualTo(String value) {
            addCriterion("somplaint_source >=", value, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceLessThan(String value) {
            addCriterion("somplaint_source <", value, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceLessThanOrEqualTo(String value) {
            addCriterion("somplaint_source <=", value, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceLike(String value) {
            addCriterion("somplaint_source like", value, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceNotLike(String value) {
            addCriterion("somplaint_source not like", value, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceIn(List<String> values) {
            addCriterion("somplaint_source in", values, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceNotIn(List<String> values) {
            addCriterion("somplaint_source not in", values, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceBetween(String value1, String value2) {
            addCriterion("somplaint_source between", value1, value2, "somplaintSource");
            return (Criteria) this;
        }

        public Criteria andSomplaintSourceNotBetween(String value1, String value2) {
            addCriterion("somplaint_source not between", value1, value2, "somplaintSource");
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountIsNull() {
            addCriterion("transaction_amount is null");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountIsNotNull() {
            addCriterion("transaction_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountEqualTo(String value) {
            addCriterion("transaction_amount =", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountNotEqualTo(String value) {
            addCriterion("transaction_amount <>", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountGreaterThan(String value) {
            addCriterion("transaction_amount >", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_amount >=", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountLessThan(String value) {
            addCriterion("transaction_amount <", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountLessThanOrEqualTo(String value) {
            addCriterion("transaction_amount <=", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountLike(String value) {
            addCriterion("transaction_amount like", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountNotLike(String value) {
            addCriterion("transaction_amount not like", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountIn(List<String> values) {
            addCriterion("transaction_amount in", values, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountNotIn(List<String> values) {
            addCriterion("transaction_amount not in", values, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountBetween(String value1, String value2) {
            addCriterion("transaction_amount between", value1, value2, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountNotBetween(String value1, String value2) {
            addCriterion("transaction_amount not between", value1, value2, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayIsNull() {
            addCriterion("somplaint_way is null");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayIsNotNull() {
            addCriterion("somplaint_way is not null");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayEqualTo(String value) {
            addCriterion("somplaint_way =", value, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayNotEqualTo(String value) {
            addCriterion("somplaint_way <>", value, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayGreaterThan(String value) {
            addCriterion("somplaint_way >", value, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayGreaterThanOrEqualTo(String value) {
            addCriterion("somplaint_way >=", value, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayLessThan(String value) {
            addCriterion("somplaint_way <", value, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayLessThanOrEqualTo(String value) {
            addCriterion("somplaint_way <=", value, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayLike(String value) {
            addCriterion("somplaint_way like", value, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayNotLike(String value) {
            addCriterion("somplaint_way not like", value, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayIn(List<String> values) {
            addCriterion("somplaint_way in", values, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayNotIn(List<String> values) {
            addCriterion("somplaint_way not in", values, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayBetween(String value1, String value2) {
            addCriterion("somplaint_way between", value1, value2, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andSomplaintWayNotBetween(String value1, String value2) {
            addCriterion("somplaint_way not between", value1, value2, "somplaintWay");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNull() {
            addCriterion("report_type is null");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNotNull() {
            addCriterion("report_type is not null");
            return (Criteria) this;
        }

        public Criteria andReportTypeEqualTo(String value) {
            addCriterion("report_type =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(String value) {
            addCriterion("report_type <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(String value) {
            addCriterion("report_type >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("report_type >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(String value) {
            addCriterion("report_type <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(String value) {
            addCriterion("report_type <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLike(String value) {
            addCriterion("report_type like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotLike(String value) {
            addCriterion("report_type not like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<String> values) {
            addCriterion("report_type in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<String> values) {
            addCriterion("report_type not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(String value1, String value2) {
            addCriterion("report_type between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(String value1, String value2) {
            addCriterion("report_type not between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonIsNull() {
            addCriterion("somplaint_reason is null");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonIsNotNull() {
            addCriterion("somplaint_reason is not null");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonEqualTo(String value) {
            addCriterion("somplaint_reason =", value, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonNotEqualTo(String value) {
            addCriterion("somplaint_reason <>", value, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonGreaterThan(String value) {
            addCriterion("somplaint_reason >", value, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonGreaterThanOrEqualTo(String value) {
            addCriterion("somplaint_reason >=", value, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonLessThan(String value) {
            addCriterion("somplaint_reason <", value, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonLessThanOrEqualTo(String value) {
            addCriterion("somplaint_reason <=", value, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonLike(String value) {
            addCriterion("somplaint_reason like", value, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonNotLike(String value) {
            addCriterion("somplaint_reason not like", value, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonIn(List<String> values) {
            addCriterion("somplaint_reason in", values, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonNotIn(List<String> values) {
            addCriterion("somplaint_reason not in", values, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonBetween(String value1, String value2) {
            addCriterion("somplaint_reason between", value1, value2, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintReasonNotBetween(String value1, String value2) {
            addCriterion("somplaint_reason not between", value1, value2, "somplaintReason");
            return (Criteria) this;
        }

        public Criteria andSomplaintByIsNull() {
            addCriterion("somplaint_by is null");
            return (Criteria) this;
        }

        public Criteria andSomplaintByIsNotNull() {
            addCriterion("somplaint_by is not null");
            return (Criteria) this;
        }

        public Criteria andSomplaintByEqualTo(String value) {
            addCriterion("somplaint_by =", value, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByNotEqualTo(String value) {
            addCriterion("somplaint_by <>", value, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByGreaterThan(String value) {
            addCriterion("somplaint_by >", value, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByGreaterThanOrEqualTo(String value) {
            addCriterion("somplaint_by >=", value, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByLessThan(String value) {
            addCriterion("somplaint_by <", value, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByLessThanOrEqualTo(String value) {
            addCriterion("somplaint_by <=", value, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByLike(String value) {
            addCriterion("somplaint_by like", value, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByNotLike(String value) {
            addCriterion("somplaint_by not like", value, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByIn(List<String> values) {
            addCriterion("somplaint_by in", values, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByNotIn(List<String> values) {
            addCriterion("somplaint_by not in", values, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByBetween(String value1, String value2) {
            addCriterion("somplaint_by between", value1, value2, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andSomplaintByNotBetween(String value1, String value2) {
            addCriterion("somplaint_by not between", value1, value2, "somplaintBy");
            return (Criteria) this;
        }

        public Criteria andContactWayIsNull() {
            addCriterion("contact_way is null");
            return (Criteria) this;
        }

        public Criteria andContactWayIsNotNull() {
            addCriterion("contact_way is not null");
            return (Criteria) this;
        }

        public Criteria andContactWayEqualTo(String value) {
            addCriterion("contact_way =", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotEqualTo(String value) {
            addCriterion("contact_way <>", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayGreaterThan(String value) {
            addCriterion("contact_way >", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayGreaterThanOrEqualTo(String value) {
            addCriterion("contact_way >=", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayLessThan(String value) {
            addCriterion("contact_way <", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayLessThanOrEqualTo(String value) {
            addCriterion("contact_way <=", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayLike(String value) {
            addCriterion("contact_way like", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotLike(String value) {
            addCriterion("contact_way not like", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayIn(List<String> values) {
            addCriterion("contact_way in", values, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotIn(List<String> values) {
            addCriterion("contact_way not in", values, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayBetween(String value1, String value2) {
            addCriterion("contact_way between", value1, value2, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotBetween(String value1, String value2) {
            addCriterion("contact_way not between", value1, value2, "contactWay");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNull() {
            addCriterion("last_modified_by is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNotNull() {
            addCriterion("last_modified_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByEqualTo(String value) {
            addCriterion("last_modified_by =", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotEqualTo(String value) {
            addCriterion("last_modified_by <>", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThan(String value) {
            addCriterion("last_modified_by >", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("last_modified_by >=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThan(String value) {
            addCriterion("last_modified_by <", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThanOrEqualTo(String value) {
            addCriterion("last_modified_by <=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLike(String value) {
            addCriterion("last_modified_by like", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotLike(String value) {
            addCriterion("last_modified_by not like", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIn(List<String> values) {
            addCriterion("last_modified_by in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotIn(List<String> values) {
            addCriterion("last_modified_by not in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByBetween(String value1, String value2) {
            addCriterion("last_modified_by between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotBetween(String value1, String value2) {
            addCriterion("last_modified_by not between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNull() {
            addCriterion("last_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNotNull() {
            addCriterion("last_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeEqualTo(Date value) {
            addCriterion("last_modified_time =", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotEqualTo(Date value) {
            addCriterion("last_modified_time <>", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThan(Date value) {
            addCriterion("last_modified_time >", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modified_time >=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThan(Date value) {
            addCriterion("last_modified_time <", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modified_time <=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIn(List<Date> values) {
            addCriterion("last_modified_time in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotIn(List<Date> values) {
            addCriterion("last_modified_time not in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("last_modified_time between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modified_time not between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeIsNull() {
            addCriterion("somplaint_type is null");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeIsNotNull() {
            addCriterion("somplaint_type is not null");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeEqualTo(String value) {
            addCriterion("somplaint_type =", value, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeNotEqualTo(String value) {
            addCriterion("somplaint_type <>", value, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeGreaterThan(String value) {
            addCriterion("somplaint_type >", value, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeGreaterThanOrEqualTo(String value) {
            addCriterion("somplaint_type >=", value, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeLessThan(String value) {
            addCriterion("somplaint_type <", value, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeLessThanOrEqualTo(String value) {
            addCriterion("somplaint_type <=", value, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeLike(String value) {
            addCriterion("somplaint_type like", value, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeNotLike(String value) {
            addCriterion("somplaint_type not like", value, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeIn(List<String> values) {
            addCriterion("somplaint_type in", values, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeNotIn(List<String> values) {
            addCriterion("somplaint_type not in", values, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeBetween(String value1, String value2) {
            addCriterion("somplaint_type between", value1, value2, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andSomplaintTypeNotBetween(String value1, String value2) {
            addCriterion("somplaint_type not between", value1, value2, "somplaintType");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoIsNull() {
            addCriterion("bank_order_no is null");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoIsNotNull() {
            addCriterion("bank_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoEqualTo(String value) {
            addCriterion("bank_order_no =", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoNotEqualTo(String value) {
            addCriterion("bank_order_no <>", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoGreaterThan(String value) {
            addCriterion("bank_order_no >", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_order_no >=", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoLessThan(String value) {
            addCriterion("bank_order_no <", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoLessThanOrEqualTo(String value) {
            addCriterion("bank_order_no <=", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoLike(String value) {
            addCriterion("bank_order_no like", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoNotLike(String value) {
            addCriterion("bank_order_no not like", value, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoIn(List<String> values) {
            addCriterion("bank_order_no in", values, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoNotIn(List<String> values) {
            addCriterion("bank_order_no not in", values, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoBetween(String value1, String value2) {
            addCriterion("bank_order_no between", value1, value2, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankOrderNoNotBetween(String value1, String value2) {
            addCriterion("bank_order_no not between", value1, value2, "bankOrderNo");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlIsNull() {
            addCriterion("somplaint_url is null");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlIsNotNull() {
            addCriterion("somplaint_url is not null");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlEqualTo(String value) {
            addCriterion("somplaint_url =", value, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlNotEqualTo(String value) {
            addCriterion("somplaint_url <>", value, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlGreaterThan(String value) {
            addCriterion("somplaint_url >", value, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlGreaterThanOrEqualTo(String value) {
            addCriterion("somplaint_url >=", value, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlLessThan(String value) {
            addCriterion("somplaint_url <", value, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlLessThanOrEqualTo(String value) {
            addCriterion("somplaint_url <=", value, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlLike(String value) {
            addCriterion("somplaint_url like", value, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlNotLike(String value) {
            addCriterion("somplaint_url not like", value, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlIn(List<String> values) {
            addCriterion("somplaint_url in", values, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlNotIn(List<String> values) {
            addCriterion("somplaint_url not in", values, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlBetween(String value1, String value2) {
            addCriterion("somplaint_url between", value1, value2, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andSomplaintUrlNotBetween(String value1, String value2) {
            addCriterion("somplaint_url not between", value1, value2, "somplaintUrl");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoIsNull() {
            addCriterion("work_order_no is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoIsNotNull() {
            addCriterion("work_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoEqualTo(String value) {
            addCriterion("work_order_no =", value, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoNotEqualTo(String value) {
            addCriterion("work_order_no <>", value, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoGreaterThan(String value) {
            addCriterion("work_order_no >", value, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("work_order_no >=", value, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoLessThan(String value) {
            addCriterion("work_order_no <", value, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoLessThanOrEqualTo(String value) {
            addCriterion("work_order_no <=", value, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoLike(String value) {
            addCriterion("work_order_no like", value, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoNotLike(String value) {
            addCriterion("work_order_no not like", value, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoIn(List<String> values) {
            addCriterion("work_order_no in", values, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoNotIn(List<String> values) {
            addCriterion("work_order_no not in", values, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoBetween(String value1, String value2) {
            addCriterion("work_order_no between", value1, value2, "workOrderNo");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNoNotBetween(String value1, String value2) {
            addCriterion("work_order_no not between", value1, value2, "workOrderNo");
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

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureIsNull() {
            addCriterion("complaint_nature is null");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureIsNotNull() {
            addCriterion("complaint_nature is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureEqualTo(String value) {
            addCriterion("complaint_nature =", value, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureNotEqualTo(String value) {
            addCriterion("complaint_nature <>", value, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureGreaterThan(String value) {
            addCriterion("complaint_nature >", value, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_nature >=", value, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureLessThan(String value) {
            addCriterion("complaint_nature <", value, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureLessThanOrEqualTo(String value) {
            addCriterion("complaint_nature <=", value, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureLike(String value) {
            addCriterion("complaint_nature like", value, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureNotLike(String value) {
            addCriterion("complaint_nature not like", value, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureIn(List<String> values) {
            addCriterion("complaint_nature in", values, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureNotIn(List<String> values) {
            addCriterion("complaint_nature not in", values, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureBetween(String value1, String value2) {
            addCriterion("complaint_nature between", value1, value2, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andComplaintNatureNotBetween(String value1, String value2) {
            addCriterion("complaint_nature not between", value1, value2, "complaintNature");
            return (Criteria) this;
        }

        public Criteria andProcessContentIsNull() {
            addCriterion("process_content is null");
            return (Criteria) this;
        }

        public Criteria andProcessContentIsNotNull() {
            addCriterion("process_content is not null");
            return (Criteria) this;
        }

        public Criteria andProcessContentEqualTo(String value) {
            addCriterion("process_content =", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotEqualTo(String value) {
            addCriterion("process_content <>", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentGreaterThan(String value) {
            addCriterion("process_content >", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentGreaterThanOrEqualTo(String value) {
            addCriterion("process_content >=", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentLessThan(String value) {
            addCriterion("process_content <", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentLessThanOrEqualTo(String value) {
            addCriterion("process_content <=", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentLike(String value) {
            addCriterion("process_content like", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotLike(String value) {
            addCriterion("process_content not like", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentIn(List<String> values) {
            addCriterion("process_content in", values, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotIn(List<String> values) {
            addCriterion("process_content not in", values, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentBetween(String value1, String value2) {
            addCriterion("process_content between", value1, value2, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotBetween(String value1, String value2) {
            addCriterion("process_content not between", value1, value2, "processContent");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailIsNull() {
            addCriterion("somplaint_detail is null");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailIsNotNull() {
            addCriterion("somplaint_detail is not null");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailEqualTo(String value) {
            addCriterion("somplaint_detail =", value, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailNotEqualTo(String value) {
            addCriterion("somplaint_detail <>", value, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailGreaterThan(String value) {
            addCriterion("somplaint_detail >", value, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailGreaterThanOrEqualTo(String value) {
            addCriterion("somplaint_detail >=", value, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailLessThan(String value) {
            addCriterion("somplaint_detail <", value, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailLessThanOrEqualTo(String value) {
            addCriterion("somplaint_detail <=", value, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailLike(String value) {
            addCriterion("somplaint_detail like", value, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailNotLike(String value) {
            addCriterion("somplaint_detail not like", value, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailIn(List<String> values) {
            addCriterion("somplaint_detail in", values, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailNotIn(List<String> values) {
            addCriterion("somplaint_detail not in", values, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailBetween(String value1, String value2) {
            addCriterion("somplaint_detail between", value1, value2, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSomplaintDetailNotBetween(String value1, String value2) {
            addCriterion("somplaint_detail not between", value1, value2, "somplaintDetail");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentIsNull() {
            addCriterion("supplement_comment is null");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentIsNotNull() {
            addCriterion("supplement_comment is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentEqualTo(String value) {
            addCriterion("supplement_comment =", value, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentNotEqualTo(String value) {
            addCriterion("supplement_comment <>", value, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentGreaterThan(String value) {
            addCriterion("supplement_comment >", value, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentGreaterThanOrEqualTo(String value) {
            addCriterion("supplement_comment >=", value, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentLessThan(String value) {
            addCriterion("supplement_comment <", value, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentLessThanOrEqualTo(String value) {
            addCriterion("supplement_comment <=", value, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentLike(String value) {
            addCriterion("supplement_comment like", value, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentNotLike(String value) {
            addCriterion("supplement_comment not like", value, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentIn(List<String> values) {
            addCriterion("supplement_comment in", values, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentNotIn(List<String> values) {
            addCriterion("supplement_comment not in", values, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentBetween(String value1, String value2) {
            addCriterion("supplement_comment between", value1, value2, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andSupplementCommentNotBetween(String value1, String value2) {
            addCriterion("supplement_comment not between", value1, value2, "supplementComment");
            return (Criteria) this;
        }

        public Criteria andYpMecNoIsNull() {
            addCriterion("yp_mec_no is null");
            return (Criteria) this;
        }

        public Criteria andYpMecNoIsNotNull() {
            addCriterion("yp_mec_no is not null");
            return (Criteria) this;
        }

        public Criteria andYpMecNoEqualTo(String value) {
            addCriterion("yp_mec_no =", value, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoNotEqualTo(String value) {
            addCriterion("yp_mec_no <>", value, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoGreaterThan(String value) {
            addCriterion("yp_mec_no >", value, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoGreaterThanOrEqualTo(String value) {
            addCriterion("yp_mec_no >=", value, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoLessThan(String value) {
            addCriterion("yp_mec_no <", value, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoLessThanOrEqualTo(String value) {
            addCriterion("yp_mec_no <=", value, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoLike(String value) {
            addCriterion("yp_mec_no like", value, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoNotLike(String value) {
            addCriterion("yp_mec_no not like", value, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoIn(List<String> values) {
            addCriterion("yp_mec_no in", values, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoNotIn(List<String> values) {
            addCriterion("yp_mec_no not in", values, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoBetween(String value1, String value2) {
            addCriterion("yp_mec_no between", value1, value2, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andYpMecNoNotBetween(String value1, String value2) {
            addCriterion("yp_mec_no not between", value1, value2, "ypMecNo");
            return (Criteria) this;
        }

        public Criteria andPunishStatusIsNull() {
            addCriterion("punish_status is null");
            return (Criteria) this;
        }

        public Criteria andPunishStatusIsNotNull() {
            addCriterion("punish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPunishStatusEqualTo(Short value) {
            addCriterion("punish_status =", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusNotEqualTo(Short value) {
            addCriterion("punish_status <>", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusGreaterThan(Short value) {
            addCriterion("punish_status >", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("punish_status >=", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusLessThan(Short value) {
            addCriterion("punish_status <", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusLessThanOrEqualTo(Short value) {
            addCriterion("punish_status <=", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusIn(List<Short> values) {
            addCriterion("punish_status in", values, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusNotIn(List<Short> values) {
            addCriterion("punish_status not in", values, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusBetween(Short value1, Short value2) {
            addCriterion("punish_status between", value1, value2, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusNotBetween(Short value1, Short value2) {
            addCriterion("punish_status not between", value1, value2, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andCrdNoIsNull() {
            addCriterion("crd_no is null");
            return (Criteria) this;
        }

        public Criteria andCrdNoIsNotNull() {
            addCriterion("crd_no is not null");
            return (Criteria) this;
        }

        public Criteria andCrdNoEqualTo(String value) {
            addCriterion("crd_no =", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoNotEqualTo(String value) {
            addCriterion("crd_no <>", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoGreaterThan(String value) {
            addCriterion("crd_no >", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("crd_no >=", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoLessThan(String value) {
            addCriterion("crd_no <", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoLessThanOrEqualTo(String value) {
            addCriterion("crd_no <=", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoLike(String value) {
            addCriterion("crd_no like", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoNotLike(String value) {
            addCriterion("crd_no not like", value, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoIn(List<String> values) {
            addCriterion("crd_no in", values, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoNotIn(List<String> values) {
            addCriterion("crd_no not in", values, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoBetween(String value1, String value2) {
            addCriterion("crd_no between", value1, value2, "crdNo");
            return (Criteria) this;
        }

        public Criteria andCrdNoNotBetween(String value1, String value2) {
            addCriterion("crd_no not between", value1, value2, "crdNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("id_no is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("id_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("id_no =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("id_no <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("id_no >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_no >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("id_no <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("id_no <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("id_no like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("id_no not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("id_no in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("id_no not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("id_no between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("id_no not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     *
     * @author wcyong
     *
     * @date 2023-01-13
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
