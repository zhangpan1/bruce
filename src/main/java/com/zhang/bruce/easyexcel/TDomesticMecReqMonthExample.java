package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDomesticMecReqMonthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDomesticMecReqMonthExample() {
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
     * 复盘报告-按照商编统计月度交易结果
     *
     * @author wcyong
     *
     * @date 2022-12-21
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

        public Criteria andProdIsNull() {
            addCriterion("prod is null");
            return (Criteria) this;
        }

        public Criteria andProdIsNotNull() {
            addCriterion("prod is not null");
            return (Criteria) this;
        }

        public Criteria andProdEqualTo(String value) {
            addCriterion("prod =", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdNotEqualTo(String value) {
            addCriterion("prod <>", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdGreaterThan(String value) {
            addCriterion("prod >", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdGreaterThanOrEqualTo(String value) {
            addCriterion("prod >=", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdLessThan(String value) {
            addCriterion("prod <", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdLessThanOrEqualTo(String value) {
            addCriterion("prod <=", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdLike(String value) {
            addCriterion("prod like", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdNotLike(String value) {
            addCriterion("prod not like", value, "prod");
            return (Criteria) this;
        }

        public Criteria andProdIn(List<String> values) {
            addCriterion("prod in", values, "prod");
            return (Criteria) this;
        }

        public Criteria andProdNotIn(List<String> values) {
            addCriterion("prod not in", values, "prod");
            return (Criteria) this;
        }

        public Criteria andProdBetween(String value1, String value2) {
            addCriterion("prod between", value1, value2, "prod");
            return (Criteria) this;
        }

        public Criteria andProdNotBetween(String value1, String value2) {
            addCriterion("prod not between", value1, value2, "prod");
            return (Criteria) this;
        }

        public Criteria andBizIsNull() {
            addCriterion("biz is null");
            return (Criteria) this;
        }

        public Criteria andBizIsNotNull() {
            addCriterion("biz is not null");
            return (Criteria) this;
        }

        public Criteria andBizEqualTo(String value) {
            addCriterion("biz =", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizNotEqualTo(String value) {
            addCriterion("biz <>", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizGreaterThan(String value) {
            addCriterion("biz >", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizGreaterThanOrEqualTo(String value) {
            addCriterion("biz >=", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizLessThan(String value) {
            addCriterion("biz <", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizLessThanOrEqualTo(String value) {
            addCriterion("biz <=", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizLike(String value) {
            addCriterion("biz like", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizNotLike(String value) {
            addCriterion("biz not like", value, "biz");
            return (Criteria) this;
        }

        public Criteria andBizIn(List<String> values) {
            addCriterion("biz in", values, "biz");
            return (Criteria) this;
        }

        public Criteria andBizNotIn(List<String> values) {
            addCriterion("biz not in", values, "biz");
            return (Criteria) this;
        }

        public Criteria andBizBetween(String value1, String value2) {
            addCriterion("biz between", value1, value2, "biz");
            return (Criteria) this;
        }

        public Criteria andBizNotBetween(String value1, String value2) {
            addCriterion("biz not between", value1, value2, "biz");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("pay_way like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("pay_way not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andMecNoIsNull() {
            addCriterion("mec_no is null");
            return (Criteria) this;
        }

        public Criteria andMecNoIsNotNull() {
            addCriterion("mec_no is not null");
            return (Criteria) this;
        }

        public Criteria andMecNoEqualTo(String value) {
            addCriterion("mec_no =", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoNotEqualTo(String value) {
            addCriterion("mec_no <>", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoGreaterThan(String value) {
            addCriterion("mec_no >", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoGreaterThanOrEqualTo(String value) {
            addCriterion("mec_no >=", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoLessThan(String value) {
            addCriterion("mec_no <", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoLessThanOrEqualTo(String value) {
            addCriterion("mec_no <=", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoLike(String value) {
            addCriterion("mec_no like", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoNotLike(String value) {
            addCriterion("mec_no not like", value, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoIn(List<String> values) {
            addCriterion("mec_no in", values, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoNotIn(List<String> values) {
            addCriterion("mec_no not in", values, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoBetween(String value1, String value2) {
            addCriterion("mec_no between", value1, value2, "mecNo");
            return (Criteria) this;
        }

        public Criteria andMecNoNotBetween(String value1, String value2) {
            addCriterion("mec_no not between", value1, value2, "mecNo");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andAmtIsNull() {
            addCriterion("amt is null");
            return (Criteria) this;
        }

        public Criteria andAmtIsNotNull() {
            addCriterion("amt is not null");
            return (Criteria) this;
        }

        public Criteria andAmtEqualTo(BigDecimal value) {
            addCriterion("amt =", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotEqualTo(BigDecimal value) {
            addCriterion("amt <>", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThan(BigDecimal value) {
            addCriterion("amt >", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amt >=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThan(BigDecimal value) {
            addCriterion("amt <", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amt <=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtIn(List<BigDecimal> values) {
            addCriterion("amt in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotIn(List<BigDecimal> values) {
            addCriterion("amt not in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amt between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amt not between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Long value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Long value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Long value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Long value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Long value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Long> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Long> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Long value1, Long value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Long value1, Long value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
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

        public Criteria andCategoryResultIsNull() {
            addCriterion("category_result is null");
            return (Criteria) this;
        }

        public Criteria andCategoryResultIsNotNull() {
            addCriterion("category_result is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryResultEqualTo(String value) {
            addCriterion("category_result =", value, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultNotEqualTo(String value) {
            addCriterion("category_result <>", value, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultGreaterThan(String value) {
            addCriterion("category_result >", value, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultGreaterThanOrEqualTo(String value) {
            addCriterion("category_result >=", value, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultLessThan(String value) {
            addCriterion("category_result <", value, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultLessThanOrEqualTo(String value) {
            addCriterion("category_result <=", value, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultLike(String value) {
            addCriterion("category_result like", value, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultNotLike(String value) {
            addCriterion("category_result not like", value, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultIn(List<String> values) {
            addCriterion("category_result in", values, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultNotIn(List<String> values) {
            addCriterion("category_result not in", values, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultBetween(String value1, String value2) {
            addCriterion("category_result between", value1, value2, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andCategoryResultNotBetween(String value1, String value2) {
            addCriterion("category_result not between", value1, value2, "categoryResult");
            return (Criteria) this;
        }

        public Criteria andMonthStrIsNull() {
            addCriterion("month_str is null");
            return (Criteria) this;
        }

        public Criteria andMonthStrIsNotNull() {
            addCriterion("month_str is not null");
            return (Criteria) this;
        }

        public Criteria andMonthStrEqualTo(String value) {
            addCriterion("month_str =", value, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrNotEqualTo(String value) {
            addCriterion("month_str <>", value, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrGreaterThan(String value) {
            addCriterion("month_str >", value, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrGreaterThanOrEqualTo(String value) {
            addCriterion("month_str >=", value, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrLessThan(String value) {
            addCriterion("month_str <", value, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrLessThanOrEqualTo(String value) {
            addCriterion("month_str <=", value, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrLike(String value) {
            addCriterion("month_str like", value, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrNotLike(String value) {
            addCriterion("month_str not like", value, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrIn(List<String> values) {
            addCriterion("month_str in", values, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrNotIn(List<String> values) {
            addCriterion("month_str not in", values, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrBetween(String value1, String value2) {
            addCriterion("month_str between", value1, value2, "monthStr");
            return (Criteria) this;
        }

        public Criteria andMonthStrNotBetween(String value1, String value2) {
            addCriterion("month_str not between", value1, value2, "monthStr");
            return (Criteria) this;
        }

        public Criteria andOccTmIsNull() {
            addCriterion("occ_tm is null");
            return (Criteria) this;
        }

        public Criteria andOccTmIsNotNull() {
            addCriterion("occ_tm is not null");
            return (Criteria) this;
        }

        public Criteria andOccTmEqualTo(Date value) {
            addCriterion("occ_tm =", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmNotEqualTo(Date value) {
            addCriterion("occ_tm <>", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmGreaterThan(Date value) {
            addCriterion("occ_tm >", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmGreaterThanOrEqualTo(Date value) {
            addCriterion("occ_tm >=", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmLessThan(Date value) {
            addCriterion("occ_tm <", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmLessThanOrEqualTo(Date value) {
            addCriterion("occ_tm <=", value, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmIn(List<Date> values) {
            addCriterion("occ_tm in", values, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmNotIn(List<Date> values) {
            addCriterion("occ_tm not in", values, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmBetween(Date value1, Date value2) {
            addCriterion("occ_tm between", value1, value2, "occTm");
            return (Criteria) this;
        }

        public Criteria andOccTmNotBetween(Date value1, Date value2) {
            addCriterion("occ_tm not between", value1, value2, "occTm");
            return (Criteria) this;
        }

        public Criteria andCtTmIsNull() {
            addCriterion("ct_tm is null");
            return (Criteria) this;
        }

        public Criteria andCtTmIsNotNull() {
            addCriterion("ct_tm is not null");
            return (Criteria) this;
        }

        public Criteria andCtTmEqualTo(Date value) {
            addCriterion("ct_tm =", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmNotEqualTo(Date value) {
            addCriterion("ct_tm <>", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmGreaterThan(Date value) {
            addCriterion("ct_tm >", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmGreaterThanOrEqualTo(Date value) {
            addCriterion("ct_tm >=", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmLessThan(Date value) {
            addCriterion("ct_tm <", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmLessThanOrEqualTo(Date value) {
            addCriterion("ct_tm <=", value, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmIn(List<Date> values) {
            addCriterion("ct_tm in", values, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmNotIn(List<Date> values) {
            addCriterion("ct_tm not in", values, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmBetween(Date value1, Date value2) {
            addCriterion("ct_tm between", value1, value2, "ctTm");
            return (Criteria) this;
        }

        public Criteria andCtTmNotBetween(Date value1, Date value2) {
            addCriterion("ct_tm not between", value1, value2, "ctTm");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 复盘报告-按照商编统计月度交易结果
     *
     * @author wcyong
     *
     * @date 2022-12-21
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
