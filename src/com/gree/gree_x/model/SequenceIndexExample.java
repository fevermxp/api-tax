package com.gree.gree_x.model;

import java.util.ArrayList;
import java.util.List;

public class SequenceIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SequenceIndexExample() {
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

        public Criteria andIndexdescIsNull() {
            addCriterion("indexdesc is null");
            return (Criteria) this;
        }

        public Criteria andIndexdescIsNotNull() {
            addCriterion("indexdesc is not null");
            return (Criteria) this;
        }

        public Criteria andIndexdescEqualTo(String value) {
            addCriterion("indexdesc =", value, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescNotEqualTo(String value) {
            addCriterion("indexdesc <>", value, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescGreaterThan(String value) {
            addCriterion("indexdesc >", value, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescGreaterThanOrEqualTo(String value) {
            addCriterion("indexdesc >=", value, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescLessThan(String value) {
            addCriterion("indexdesc <", value, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescLessThanOrEqualTo(String value) {
            addCriterion("indexdesc <=", value, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescLike(String value) {
            addCriterion("indexdesc like", value, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescNotLike(String value) {
            addCriterion("indexdesc not like", value, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescIn(List<String> values) {
            addCriterion("indexdesc in", values, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescNotIn(List<String> values) {
            addCriterion("indexdesc not in", values, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescBetween(String value1, String value2) {
            addCriterion("indexdesc between", value1, value2, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andIndexdescNotBetween(String value1, String value2) {
            addCriterion("indexdesc not between", value1, value2, "indexdesc");
            return (Criteria) this;
        }

        public Criteria andCurrentidIsNull() {
            addCriterion("currentid is null");
            return (Criteria) this;
        }

        public Criteria andCurrentidIsNotNull() {
            addCriterion("currentid is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentidEqualTo(Integer value) {
            addCriterion("currentid =", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidNotEqualTo(Integer value) {
            addCriterion("currentid <>", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidGreaterThan(Integer value) {
            addCriterion("currentid >", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("currentid >=", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidLessThan(Integer value) {
            addCriterion("currentid <", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidLessThanOrEqualTo(Integer value) {
            addCriterion("currentid <=", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidIn(List<Integer> values) {
            addCriterion("currentid in", values, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidNotIn(List<Integer> values) {
            addCriterion("currentid not in", values, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidBetween(Integer value1, Integer value2) {
            addCriterion("currentid between", value1, value2, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidNotBetween(Integer value1, Integer value2) {
            addCriterion("currentid not between", value1, value2, "currentid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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