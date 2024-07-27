package com.zhang.bruce.easyexcel;

import java.util.ArrayList;
import java.util.List;

public class TblMecTempBooknoSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblMecTempBooknoSummaryExample() {
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
     * @date 2024-07-27
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

        public Criteria andBookNoIsNull() {
            addCriterion("BOOK_NO is null");
            return (Criteria) this;
        }

        public Criteria andBookNoIsNotNull() {
            addCriterion("BOOK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBookNoEqualTo(String value) {
            addCriterion("BOOK_NO =", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotEqualTo(String value) {
            addCriterion("BOOK_NO <>", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoGreaterThan(String value) {
            addCriterion("BOOK_NO >", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_NO >=", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoLessThan(String value) {
            addCriterion("BOOK_NO <", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoLessThanOrEqualTo(String value) {
            addCriterion("BOOK_NO <=", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoLike(String value) {
            addCriterion("BOOK_NO like", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotLike(String value) {
            addCriterion("BOOK_NO not like", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoIn(List<String> values) {
            addCriterion("BOOK_NO in", values, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotIn(List<String> values) {
            addCriterion("BOOK_NO not in", values, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoBetween(String value1, String value2) {
            addCriterion("BOOK_NO between", value1, value2, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotBetween(String value1, String value2) {
            addCriterion("BOOK_NO not between", value1, value2, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameIsNull() {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameIsNotNull() {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameEqualTo(String value) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME =", value, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameNotEqualTo(String value) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME <>", value, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameGreaterThan(String value) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME >", value, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME >=", value, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameLessThan(String value) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME <", value, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameLessThanOrEqualTo(String value) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME <=", value, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameLike(String value) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME like", value, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameNotLike(String value) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME not like", value, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameIn(List<String> values) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME in", values, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameNotIn(List<String> values) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME not in", values, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameBetween(String value1, String value2) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME between", value1, value2, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andBookNoAdvanceBankcardNameNotBetween(String value1, String value2) {
            addCriterion("BOOK_NO_ADVANCE_BANKCARD_NAME not between", value1, value2, "bookNoAdvanceBankcardName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("CREATE_DATE like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("CREATE_DATE not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
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
     * @date 2024-07-27
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
