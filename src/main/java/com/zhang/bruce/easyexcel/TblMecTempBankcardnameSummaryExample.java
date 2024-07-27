package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TblMecTempBankcardnameSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblMecTempBankcardnameSummaryExample() {
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

        public Criteria andBankCardNameIsNull() {
            addCriterion("BANK_CARD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNameIsNotNull() {
            addCriterion("BANK_CARD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNameEqualTo(String value) {
            addCriterion("BANK_CARD_NAME =", value, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameNotEqualTo(String value) {
            addCriterion("BANK_CARD_NAME <>", value, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameGreaterThan(String value) {
            addCriterion("BANK_CARD_NAME >", value, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NAME >=", value, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameLessThan(String value) {
            addCriterion("BANK_CARD_NAME <", value, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NAME <=", value, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameLike(String value) {
            addCriterion("BANK_CARD_NAME like", value, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameNotLike(String value) {
            addCriterion("BANK_CARD_NAME not like", value, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameIn(List<String> values) {
            addCriterion("BANK_CARD_NAME in", values, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameNotIn(List<String> values) {
            addCriterion("BANK_CARD_NAME not in", values, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NAME between", value1, value2, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardNameNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NAME not between", value1, value2, "bankCardName");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtIsNull() {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT is null");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtIsNotNull() {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT =", value, "bankCardBookAdvanceCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtNotEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT <>", value, "bankCardBookAdvanceCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtGreaterThan(BigDecimal value) {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT >", value, "bankCardBookAdvanceCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT >=", value, "bankCardBookAdvanceCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtLessThan(BigDecimal value) {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT <", value, "bankCardBookAdvanceCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT <=", value, "bankCardBookAdvanceCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtIn(List<BigDecimal> values) {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT in", values, "bankCardBookAdvanceCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtNotIn(List<BigDecimal> values) {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT not in", values, "bankCardBookAdvanceCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT between", value1, value2, "bankCardBookAdvanceCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardBookAdvanceCusamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_CARD_BOOK_ADVANCE_CUSAMT not between", value1, value2, "bankCardBookAdvanceCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtIsNull() {
            addCriterion("BANK_CARD_DFDF_CUSAMT is null");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtIsNotNull() {
            addCriterion("BANK_CARD_DFDF_CUSAMT is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_DFDF_CUSAMT =", value, "bankCardDfdfCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtNotEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_DFDF_CUSAMT <>", value, "bankCardDfdfCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtGreaterThan(BigDecimal value) {
            addCriterion("BANK_CARD_DFDF_CUSAMT >", value, "bankCardDfdfCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_DFDF_CUSAMT >=", value, "bankCardDfdfCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtLessThan(BigDecimal value) {
            addCriterion("BANK_CARD_DFDF_CUSAMT <", value, "bankCardDfdfCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_DFDF_CUSAMT <=", value, "bankCardDfdfCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtIn(List<BigDecimal> values) {
            addCriterion("BANK_CARD_DFDF_CUSAMT in", values, "bankCardDfdfCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtNotIn(List<BigDecimal> values) {
            addCriterion("BANK_CARD_DFDF_CUSAMT not in", values, "bankCardDfdfCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_CARD_DFDF_CUSAMT between", value1, value2, "bankCardDfdfCusamt");
            return (Criteria) this;
        }

        public Criteria andBankCardDfdfCusamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_CARD_DFDF_CUSAMT not between", value1, value2, "bankCardDfdfCusamt");
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
