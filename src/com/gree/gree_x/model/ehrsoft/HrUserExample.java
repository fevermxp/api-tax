package com.gree.gree_x.model.ehrsoft;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HrUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HrUserExample() {
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

        public Criteria andA0100IsNull() {
            addCriterion("A0100 is null");
            return (Criteria) this;
        }

        public Criteria andA0100IsNotNull() {
            addCriterion("A0100 is not null");
            return (Criteria) this;
        }

        public Criteria andA0100EqualTo(String value) {
            addCriterion("A0100 =", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100NotEqualTo(String value) {
            addCriterion("A0100 <>", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100GreaterThan(String value) {
            addCriterion("A0100 >", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100GreaterThanOrEqualTo(String value) {
            addCriterion("A0100 >=", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100LessThan(String value) {
            addCriterion("A0100 <", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100LessThanOrEqualTo(String value) {
            addCriterion("A0100 <=", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100Like(String value) {
            addCriterion("A0100 like", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100NotLike(String value) {
            addCriterion("A0100 not like", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100In(List<String> values) {
            addCriterion("A0100 in", values, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100NotIn(List<String> values) {
            addCriterion("A0100 not in", values, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100Between(String value1, String value2) {
            addCriterion("A0100 between", value1, value2, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100NotBetween(String value1, String value2) {
            addCriterion("A0100 not between", value1, value2, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0000IsNull() {
            addCriterion("A0000 is null");
            return (Criteria) this;
        }

        public Criteria andA0000IsNotNull() {
            addCriterion("A0000 is not null");
            return (Criteria) this;
        }

        public Criteria andA0000EqualTo(Short value) {
            addCriterion("A0000 =", value, "a0000");
            return (Criteria) this;
        }

        public Criteria andA0000NotEqualTo(Short value) {
            addCriterion("A0000 <>", value, "a0000");
            return (Criteria) this;
        }

        public Criteria andA0000GreaterThan(Short value) {
            addCriterion("A0000 >", value, "a0000");
            return (Criteria) this;
        }

        public Criteria andA0000GreaterThanOrEqualTo(Short value) {
            addCriterion("A0000 >=", value, "a0000");
            return (Criteria) this;
        }

        public Criteria andA0000LessThan(Short value) {
            addCriterion("A0000 <", value, "a0000");
            return (Criteria) this;
        }

        public Criteria andA0000LessThanOrEqualTo(Short value) {
            addCriterion("A0000 <=", value, "a0000");
            return (Criteria) this;
        }

        public Criteria andA0000In(List<Short> values) {
            addCriterion("A0000 in", values, "a0000");
            return (Criteria) this;
        }

        public Criteria andA0000NotIn(List<Short> values) {
            addCriterion("A0000 not in", values, "a0000");
            return (Criteria) this;
        }

        public Criteria andA0000Between(Short value1, Short value2) {
            addCriterion("A0000 between", value1, value2, "a0000");
            return (Criteria) this;
        }

        public Criteria andA0000NotBetween(Short value1, Short value2) {
            addCriterion("A0000 not between", value1, value2, "a0000");
            return (Criteria) this;
        }

        public Criteria andB0110IsNull() {
            addCriterion("B0110 is null");
            return (Criteria) this;
        }

        public Criteria andB0110IsNotNull() {
            addCriterion("B0110 is not null");
            return (Criteria) this;
        }

        public Criteria andB0110EqualTo(String value) {
            addCriterion("B0110 =", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110NotEqualTo(String value) {
            addCriterion("B0110 <>", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110GreaterThan(String value) {
            addCriterion("B0110 >", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110GreaterThanOrEqualTo(String value) {
            addCriterion("B0110 >=", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110LessThan(String value) {
            addCriterion("B0110 <", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110LessThanOrEqualTo(String value) {
            addCriterion("B0110 <=", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110Like(String value) {
            addCriterion("B0110 like", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110NotLike(String value) {
            addCriterion("B0110 not like", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110In(List<String> values) {
            addCriterion("B0110 in", values, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110NotIn(List<String> values) {
            addCriterion("B0110 not in", values, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110Between(String value1, String value2) {
            addCriterion("B0110 between", value1, value2, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110NotBetween(String value1, String value2) {
            addCriterion("B0110 not between", value1, value2, "b0110");
            return (Criteria) this;
        }

        public Criteria andA0111IsNull() {
            addCriterion("A0111 is null");
            return (Criteria) this;
        }

        public Criteria andA0111IsNotNull() {
            addCriterion("A0111 is not null");
            return (Criteria) this;
        }

        public Criteria andA0111EqualTo(Date value) {
            addCriterion("A0111 =", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111NotEqualTo(Date value) {
            addCriterion("A0111 <>", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111GreaterThan(Date value) {
            addCriterion("A0111 >", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111GreaterThanOrEqualTo(Date value) {
            addCriterion("A0111 >=", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111LessThan(Date value) {
            addCriterion("A0111 <", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111LessThanOrEqualTo(Date value) {
            addCriterion("A0111 <=", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111In(List<Date> values) {
            addCriterion("A0111 in", values, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111NotIn(List<Date> values) {
            addCriterion("A0111 not in", values, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111Between(Date value1, Date value2) {
            addCriterion("A0111 between", value1, value2, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111NotBetween(Date value1, Date value2) {
            addCriterion("A0111 not between", value1, value2, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0107IsNull() {
            addCriterion("A0107 is null");
            return (Criteria) this;
        }

        public Criteria andA0107IsNotNull() {
            addCriterion("A0107 is not null");
            return (Criteria) this;
        }

        public Criteria andA0107EqualTo(String value) {
            addCriterion("A0107 =", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotEqualTo(String value) {
            addCriterion("A0107 <>", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107GreaterThan(String value) {
            addCriterion("A0107 >", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107GreaterThanOrEqualTo(String value) {
            addCriterion("A0107 >=", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107LessThan(String value) {
            addCriterion("A0107 <", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107LessThanOrEqualTo(String value) {
            addCriterion("A0107 <=", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107Like(String value) {
            addCriterion("A0107 like", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotLike(String value) {
            addCriterion("A0107 not like", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107In(List<String> values) {
            addCriterion("A0107 in", values, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotIn(List<String> values) {
            addCriterion("A0107 not in", values, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107Between(String value1, String value2) {
            addCriterion("A0107 between", value1, value2, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotBetween(String value1, String value2) {
            addCriterion("A0107 not between", value1, value2, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0177IsNull() {
            addCriterion("A0177 is null");
            return (Criteria) this;
        }

        public Criteria andA0177IsNotNull() {
            addCriterion("A0177 is not null");
            return (Criteria) this;
        }

        public Criteria andA0177EqualTo(String value) {
            addCriterion("A0177 =", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177NotEqualTo(String value) {
            addCriterion("A0177 <>", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177GreaterThan(String value) {
            addCriterion("A0177 >", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177GreaterThanOrEqualTo(String value) {
            addCriterion("A0177 >=", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177LessThan(String value) {
            addCriterion("A0177 <", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177LessThanOrEqualTo(String value) {
            addCriterion("A0177 <=", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177Like(String value) {
            addCriterion("A0177 like", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177NotLike(String value) {
            addCriterion("A0177 not like", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177In(List<String> values) {
            addCriterion("A0177 in", values, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177NotIn(List<String> values) {
            addCriterion("A0177 not in", values, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177Between(String value1, String value2) {
            addCriterion("A0177 between", value1, value2, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177NotBetween(String value1, String value2) {
            addCriterion("A0177 not between", value1, value2, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0121IsNull() {
            addCriterion("A0121 is null");
            return (Criteria) this;
        }

        public Criteria andA0121IsNotNull() {
            addCriterion("A0121 is not null");
            return (Criteria) this;
        }

        public Criteria andA0121EqualTo(String value) {
            addCriterion("A0121 =", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotEqualTo(String value) {
            addCriterion("A0121 <>", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121GreaterThan(String value) {
            addCriterion("A0121 >", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121GreaterThanOrEqualTo(String value) {
            addCriterion("A0121 >=", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121LessThan(String value) {
            addCriterion("A0121 <", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121LessThanOrEqualTo(String value) {
            addCriterion("A0121 <=", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121Like(String value) {
            addCriterion("A0121 like", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotLike(String value) {
            addCriterion("A0121 not like", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121In(List<String> values) {
            addCriterion("A0121 in", values, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotIn(List<String> values) {
            addCriterion("A0121 not in", values, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121Between(String value1, String value2) {
            addCriterion("A0121 between", value1, value2, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotBetween(String value1, String value2) {
            addCriterion("A0121 not between", value1, value2, "a0121");
            return (Criteria) this;
        }

        public Criteria andE0127IsNull() {
            addCriterion("E0127 is null");
            return (Criteria) this;
        }

        public Criteria andE0127IsNotNull() {
            addCriterion("E0127 is not null");
            return (Criteria) this;
        }

        public Criteria andE0127EqualTo(String value) {
            addCriterion("E0127 =", value, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127NotEqualTo(String value) {
            addCriterion("E0127 <>", value, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127GreaterThan(String value) {
            addCriterion("E0127 >", value, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127GreaterThanOrEqualTo(String value) {
            addCriterion("E0127 >=", value, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127LessThan(String value) {
            addCriterion("E0127 <", value, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127LessThanOrEqualTo(String value) {
            addCriterion("E0127 <=", value, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127Like(String value) {
            addCriterion("E0127 like", value, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127NotLike(String value) {
            addCriterion("E0127 not like", value, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127In(List<String> values) {
            addCriterion("E0127 in", values, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127NotIn(List<String> values) {
            addCriterion("E0127 not in", values, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127Between(String value1, String value2) {
            addCriterion("E0127 between", value1, value2, "e0127");
            return (Criteria) this;
        }

        public Criteria andE0127NotBetween(String value1, String value2) {
            addCriterion("E0127 not between", value1, value2, "e0127");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andC0101IsNull() {
            addCriterion("C0101 is null");
            return (Criteria) this;
        }

        public Criteria andC0101IsNotNull() {
            addCriterion("C0101 is not null");
            return (Criteria) this;
        }

        public Criteria andC0101EqualTo(Short value) {
            addCriterion("C0101 =", value, "c0101");
            return (Criteria) this;
        }

        public Criteria andC0101NotEqualTo(Short value) {
            addCriterion("C0101 <>", value, "c0101");
            return (Criteria) this;
        }

        public Criteria andC0101GreaterThan(Short value) {
            addCriterion("C0101 >", value, "c0101");
            return (Criteria) this;
        }

        public Criteria andC0101GreaterThanOrEqualTo(Short value) {
            addCriterion("C0101 >=", value, "c0101");
            return (Criteria) this;
        }

        public Criteria andC0101LessThan(Short value) {
            addCriterion("C0101 <", value, "c0101");
            return (Criteria) this;
        }

        public Criteria andC0101LessThanOrEqualTo(Short value) {
            addCriterion("C0101 <=", value, "c0101");
            return (Criteria) this;
        }

        public Criteria andC0101In(List<Short> values) {
            addCriterion("C0101 in", values, "c0101");
            return (Criteria) this;
        }

        public Criteria andC0101NotIn(List<Short> values) {
            addCriterion("C0101 not in", values, "c0101");
            return (Criteria) this;
        }

        public Criteria andC0101Between(Short value1, Short value2) {
            addCriterion("C0101 between", value1, value2, "c0101");
            return (Criteria) this;
        }

        public Criteria andC0101NotBetween(Short value1, Short value2) {
            addCriterion("C0101 not between", value1, value2, "c0101");
            return (Criteria) this;
        }

        public Criteria andE01a1IsNull() {
            addCriterion("E01A1 is null");
            return (Criteria) this;
        }

        public Criteria andE01a1IsNotNull() {
            addCriterion("E01A1 is not null");
            return (Criteria) this;
        }

        public Criteria andE01a1EqualTo(String value) {
            addCriterion("E01A1 =", value, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1NotEqualTo(String value) {
            addCriterion("E01A1 <>", value, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1GreaterThan(String value) {
            addCriterion("E01A1 >", value, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1GreaterThanOrEqualTo(String value) {
            addCriterion("E01A1 >=", value, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1LessThan(String value) {
            addCriterion("E01A1 <", value, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1LessThanOrEqualTo(String value) {
            addCriterion("E01A1 <=", value, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1Like(String value) {
            addCriterion("E01A1 like", value, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1NotLike(String value) {
            addCriterion("E01A1 not like", value, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1In(List<String> values) {
            addCriterion("E01A1 in", values, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1NotIn(List<String> values) {
            addCriterion("E01A1 not in", values, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1Between(String value1, String value2) {
            addCriterion("E01A1 between", value1, value2, "e01a1");
            return (Criteria) this;
        }

        public Criteria andE01a1NotBetween(String value1, String value2) {
            addCriterion("E01A1 not between", value1, value2, "e01a1");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNull() {
            addCriterion("MODTIME is null");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNotNull() {
            addCriterion("MODTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModtimeEqualTo(Date value) {
            addCriterion("MODTIME =", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotEqualTo(Date value) {
            addCriterion("MODTIME <>", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThan(Date value) {
            addCriterion("MODTIME >", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODTIME >=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThan(Date value) {
            addCriterion("MODTIME <", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThanOrEqualTo(Date value) {
            addCriterion("MODTIME <=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeIn(List<Date> values) {
            addCriterion("MODTIME in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotIn(List<Date> values) {
            addCriterion("MODTIME not in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeBetween(Date value1, Date value2) {
            addCriterion("MODTIME between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotBetween(Date value1, Date value2) {
            addCriterion("MODTIME not between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNull() {
            addCriterion("CREATEUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNotNull() {
            addCriterion("CREATEUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameEqualTo(String value) {
            addCriterion("CREATEUSERNAME =", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotEqualTo(String value) {
            addCriterion("CREATEUSERNAME <>", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThan(String value) {
            addCriterion("CREATEUSERNAME >", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERNAME >=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThan(String value) {
            addCriterion("CREATEUSERNAME <", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERNAME <=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLike(String value) {
            addCriterion("CREATEUSERNAME like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotLike(String value) {
            addCriterion("CREATEUSERNAME not like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIn(List<String> values) {
            addCriterion("CREATEUSERNAME in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotIn(List<String> values) {
            addCriterion("CREATEUSERNAME not in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameBetween(String value1, String value2) {
            addCriterion("CREATEUSERNAME between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERNAME not between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andModusernameIsNull() {
            addCriterion("MODUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andModusernameIsNotNull() {
            addCriterion("MODUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andModusernameEqualTo(String value) {
            addCriterion("MODUSERNAME =", value, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameNotEqualTo(String value) {
            addCriterion("MODUSERNAME <>", value, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameGreaterThan(String value) {
            addCriterion("MODUSERNAME >", value, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameGreaterThanOrEqualTo(String value) {
            addCriterion("MODUSERNAME >=", value, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameLessThan(String value) {
            addCriterion("MODUSERNAME <", value, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameLessThanOrEqualTo(String value) {
            addCriterion("MODUSERNAME <=", value, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameLike(String value) {
            addCriterion("MODUSERNAME like", value, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameNotLike(String value) {
            addCriterion("MODUSERNAME not like", value, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameIn(List<String> values) {
            addCriterion("MODUSERNAME in", values, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameNotIn(List<String> values) {
            addCriterion("MODUSERNAME not in", values, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameBetween(String value1, String value2) {
            addCriterion("MODUSERNAME between", value1, value2, "modusername");
            return (Criteria) this;
        }

        public Criteria andModusernameNotBetween(String value1, String value2) {
            addCriterion("MODUSERNAME not between", value1, value2, "modusername");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("USERPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("USERPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("USERPASSWORD =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("USERPASSWORD <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("USERPASSWORD >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("USERPASSWORD <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("USERPASSWORD like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("USERPASSWORD not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("USERPASSWORD in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("USERPASSWORD not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("USERPASSWORD between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("USERPASSWORD not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andGroupsIsNull() {
            addCriterion("GROUPS is null");
            return (Criteria) this;
        }

        public Criteria andGroupsIsNotNull() {
            addCriterion("GROUPS is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsEqualTo(String value) {
            addCriterion("GROUPS =", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotEqualTo(String value) {
            addCriterion("GROUPS <>", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsGreaterThan(String value) {
            addCriterion("GROUPS >", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPS >=", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLessThan(String value) {
            addCriterion("GROUPS <", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLessThanOrEqualTo(String value) {
            addCriterion("GROUPS <=", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLike(String value) {
            addCriterion("GROUPS like", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotLike(String value) {
            addCriterion("GROUPS not like", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsIn(List<String> values) {
            addCriterion("GROUPS in", values, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotIn(List<String> values) {
            addCriterion("GROUPS not in", values, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsBetween(String value1, String value2) {
            addCriterion("GROUPS between", value1, value2, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotBetween(String value1, String value2) {
            addCriterion("GROUPS not between", value1, value2, "groups");
            return (Criteria) this;
        }

        public Criteria andC0183IsNull() {
            addCriterion("C0183 is null");
            return (Criteria) this;
        }

        public Criteria andC0183IsNotNull() {
            addCriterion("C0183 is not null");
            return (Criteria) this;
        }

        public Criteria andC0183EqualTo(Date value) {
            addCriterion("C0183 =", value, "c0183");
            return (Criteria) this;
        }

        public Criteria andC0183NotEqualTo(Date value) {
            addCriterion("C0183 <>", value, "c0183");
            return (Criteria) this;
        }

        public Criteria andC0183GreaterThan(Date value) {
            addCriterion("C0183 >", value, "c0183");
            return (Criteria) this;
        }

        public Criteria andC0183GreaterThanOrEqualTo(Date value) {
            addCriterion("C0183 >=", value, "c0183");
            return (Criteria) this;
        }

        public Criteria andC0183LessThan(Date value) {
            addCriterion("C0183 <", value, "c0183");
            return (Criteria) this;
        }

        public Criteria andC0183LessThanOrEqualTo(Date value) {
            addCriterion("C0183 <=", value, "c0183");
            return (Criteria) this;
        }

        public Criteria andC0183In(List<Date> values) {
            addCriterion("C0183 in", values, "c0183");
            return (Criteria) this;
        }

        public Criteria andC0183NotIn(List<Date> values) {
            addCriterion("C0183 not in", values, "c0183");
            return (Criteria) this;
        }

        public Criteria andC0183Between(Date value1, Date value2) {
            addCriterion("C0183 between", value1, value2, "c0183");
            return (Criteria) this;
        }

        public Criteria andC0183NotBetween(Date value1, Date value2) {
            addCriterion("C0183 not between", value1, value2, "c0183");
            return (Criteria) this;
        }

        public Criteria andC0181IsNull() {
            addCriterion("C0181 is null");
            return (Criteria) this;
        }

        public Criteria andC0181IsNotNull() {
            addCriterion("C0181 is not null");
            return (Criteria) this;
        }

        public Criteria andC0181EqualTo(String value) {
            addCriterion("C0181 =", value, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181NotEqualTo(String value) {
            addCriterion("C0181 <>", value, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181GreaterThan(String value) {
            addCriterion("C0181 >", value, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181GreaterThanOrEqualTo(String value) {
            addCriterion("C0181 >=", value, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181LessThan(String value) {
            addCriterion("C0181 <", value, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181LessThanOrEqualTo(String value) {
            addCriterion("C0181 <=", value, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181Like(String value) {
            addCriterion("C0181 like", value, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181NotLike(String value) {
            addCriterion("C0181 not like", value, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181In(List<String> values) {
            addCriterion("C0181 in", values, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181NotIn(List<String> values) {
            addCriterion("C0181 not in", values, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181Between(String value1, String value2) {
            addCriterion("C0181 between", value1, value2, "c0181");
            return (Criteria) this;
        }

        public Criteria andC0181NotBetween(String value1, String value2) {
            addCriterion("C0181 not between", value1, value2, "c0181");
            return (Criteria) this;
        }

        public Criteria andModtime1IsNull() {
            addCriterion("MODTIME1 is null");
            return (Criteria) this;
        }

        public Criteria andModtime1IsNotNull() {
            addCriterion("MODTIME1 is not null");
            return (Criteria) this;
        }

        public Criteria andModtime1EqualTo(Date value) {
            addCriterion("MODTIME1 =", value, "modtime1");
            return (Criteria) this;
        }

        public Criteria andModtime1NotEqualTo(Date value) {
            addCriterion("MODTIME1 <>", value, "modtime1");
            return (Criteria) this;
        }

        public Criteria andModtime1GreaterThan(Date value) {
            addCriterion("MODTIME1 >", value, "modtime1");
            return (Criteria) this;
        }

        public Criteria andModtime1GreaterThanOrEqualTo(Date value) {
            addCriterion("MODTIME1 >=", value, "modtime1");
            return (Criteria) this;
        }

        public Criteria andModtime1LessThan(Date value) {
            addCriterion("MODTIME1 <", value, "modtime1");
            return (Criteria) this;
        }

        public Criteria andModtime1LessThanOrEqualTo(Date value) {
            addCriterion("MODTIME1 <=", value, "modtime1");
            return (Criteria) this;
        }

        public Criteria andModtime1In(List<Date> values) {
            addCriterion("MODTIME1 in", values, "modtime1");
            return (Criteria) this;
        }

        public Criteria andModtime1NotIn(List<Date> values) {
            addCriterion("MODTIME1 not in", values, "modtime1");
            return (Criteria) this;
        }

        public Criteria andModtime1Between(Date value1, Date value2) {
            addCriterion("MODTIME1 between", value1, value2, "modtime1");
            return (Criteria) this;
        }

        public Criteria andModtime1NotBetween(Date value1, Date value2) {
            addCriterion("MODTIME1 not between", value1, value2, "modtime1");
            return (Criteria) this;
        }

        public Criteria andE0122IsNull() {
            addCriterion("E0122 is null");
            return (Criteria) this;
        }

        public Criteria andE0122IsNotNull() {
            addCriterion("E0122 is not null");
            return (Criteria) this;
        }

        public Criteria andE0122EqualTo(String value) {
            addCriterion("E0122 =", value, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122NotEqualTo(String value) {
            addCriterion("E0122 <>", value, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122GreaterThan(String value) {
            addCriterion("E0122 >", value, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122GreaterThanOrEqualTo(String value) {
            addCriterion("E0122 >=", value, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122LessThan(String value) {
            addCriterion("E0122 <", value, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122LessThanOrEqualTo(String value) {
            addCriterion("E0122 <=", value, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122Like(String value) {
            addCriterion("E0122 like", value, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122NotLike(String value) {
            addCriterion("E0122 not like", value, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122In(List<String> values) {
            addCriterion("E0122 in", values, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122NotIn(List<String> values) {
            addCriterion("E0122 not in", values, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122Between(String value1, String value2) {
            addCriterion("E0122 between", value1, value2, "e0122");
            return (Criteria) this;
        }

        public Criteria andE0122NotBetween(String value1, String value2) {
            addCriterion("E0122 not between", value1, value2, "e0122");
            return (Criteria) this;
        }

        public Criteria andA0101IsNull() {
            addCriterion("A0101 is null");
            return (Criteria) this;
        }

        public Criteria andA0101IsNotNull() {
            addCriterion("A0101 is not null");
            return (Criteria) this;
        }

        public Criteria andA0101EqualTo(String value) {
            addCriterion("A0101 =", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotEqualTo(String value) {
            addCriterion("A0101 <>", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101GreaterThan(String value) {
            addCriterion("A0101 >", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101GreaterThanOrEqualTo(String value) {
            addCriterion("A0101 >=", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101LessThan(String value) {
            addCriterion("A0101 <", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101LessThanOrEqualTo(String value) {
            addCriterion("A0101 <=", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101Like(String value) {
            addCriterion("A0101 like", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotLike(String value) {
            addCriterion("A0101 not like", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101In(List<String> values) {
            addCriterion("A0101 in", values, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotIn(List<String> values) {
            addCriterion("A0101 not in", values, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101Between(String value1, String value2) {
            addCriterion("A0101 between", value1, value2, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotBetween(String value1, String value2) {
            addCriterion("A0101 not between", value1, value2, "a0101");
            return (Criteria) this;
        }

        public Criteria andC0104IsNull() {
            addCriterion("C0104 is null");
            return (Criteria) this;
        }

        public Criteria andC0104IsNotNull() {
            addCriterion("C0104 is not null");
            return (Criteria) this;
        }

        public Criteria andC0104EqualTo(String value) {
            addCriterion("C0104 =", value, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104NotEqualTo(String value) {
            addCriterion("C0104 <>", value, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104GreaterThan(String value) {
            addCriterion("C0104 >", value, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104GreaterThanOrEqualTo(String value) {
            addCriterion("C0104 >=", value, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104LessThan(String value) {
            addCriterion("C0104 <", value, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104LessThanOrEqualTo(String value) {
            addCriterion("C0104 <=", value, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104Like(String value) {
            addCriterion("C0104 like", value, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104NotLike(String value) {
            addCriterion("C0104 not like", value, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104In(List<String> values) {
            addCriterion("C0104 in", values, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104NotIn(List<String> values) {
            addCriterion("C0104 not in", values, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104Between(String value1, String value2) {
            addCriterion("C0104 between", value1, value2, "c0104");
            return (Criteria) this;
        }

        public Criteria andC0104NotBetween(String value1, String value2) {
            addCriterion("C0104 not between", value1, value2, "c0104");
            return (Criteria) this;
        }

        public Criteria andC010aIsNull() {
            addCriterion("C010A is null");
            return (Criteria) this;
        }

        public Criteria andC010aIsNotNull() {
            addCriterion("C010A is not null");
            return (Criteria) this;
        }

        public Criteria andC010aEqualTo(String value) {
            addCriterion("C010A =", value, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aNotEqualTo(String value) {
            addCriterion("C010A <>", value, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aGreaterThan(String value) {
            addCriterion("C010A >", value, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aGreaterThanOrEqualTo(String value) {
            addCriterion("C010A >=", value, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aLessThan(String value) {
            addCriterion("C010A <", value, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aLessThanOrEqualTo(String value) {
            addCriterion("C010A <=", value, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aLike(String value) {
            addCriterion("C010A like", value, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aNotLike(String value) {
            addCriterion("C010A not like", value, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aIn(List<String> values) {
            addCriterion("C010A in", values, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aNotIn(List<String> values) {
            addCriterion("C010A not in", values, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aBetween(String value1, String value2) {
            addCriterion("C010A between", value1, value2, "c010a");
            return (Criteria) this;
        }

        public Criteria andC010aNotBetween(String value1, String value2) {
            addCriterion("C010A not between", value1, value2, "c010a");
            return (Criteria) this;
        }

        public Criteria andC01uiIsNull() {
            addCriterion("C01UI is null");
            return (Criteria) this;
        }

        public Criteria andC01uiIsNotNull() {
            addCriterion("C01UI is not null");
            return (Criteria) this;
        }

        public Criteria andC01uiEqualTo(String value) {
            addCriterion("C01UI =", value, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiNotEqualTo(String value) {
            addCriterion("C01UI <>", value, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiGreaterThan(String value) {
            addCriterion("C01UI >", value, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiGreaterThanOrEqualTo(String value) {
            addCriterion("C01UI >=", value, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiLessThan(String value) {
            addCriterion("C01UI <", value, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiLessThanOrEqualTo(String value) {
            addCriterion("C01UI <=", value, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiLike(String value) {
            addCriterion("C01UI like", value, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiNotLike(String value) {
            addCriterion("C01UI not like", value, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiIn(List<String> values) {
            addCriterion("C01UI in", values, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiNotIn(List<String> values) {
            addCriterion("C01UI not in", values, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiBetween(String value1, String value2) {
            addCriterion("C01UI between", value1, value2, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC01uiNotBetween(String value1, String value2) {
            addCriterion("C01UI not between", value1, value2, "c01ui");
            return (Criteria) this;
        }

        public Criteria andC0109IsNull() {
            addCriterion("C0109 is null");
            return (Criteria) this;
        }

        public Criteria andC0109IsNotNull() {
            addCriterion("C0109 is not null");
            return (Criteria) this;
        }

        public Criteria andC0109EqualTo(String value) {
            addCriterion("C0109 =", value, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109NotEqualTo(String value) {
            addCriterion("C0109 <>", value, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109GreaterThan(String value) {
            addCriterion("C0109 >", value, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109GreaterThanOrEqualTo(String value) {
            addCriterion("C0109 >=", value, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109LessThan(String value) {
            addCriterion("C0109 <", value, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109LessThanOrEqualTo(String value) {
            addCriterion("C0109 <=", value, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109Like(String value) {
            addCriterion("C0109 like", value, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109NotLike(String value) {
            addCriterion("C0109 not like", value, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109In(List<String> values) {
            addCriterion("C0109 in", values, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109NotIn(List<String> values) {
            addCriterion("C0109 not in", values, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109Between(String value1, String value2) {
            addCriterion("C0109 between", value1, value2, "c0109");
            return (Criteria) this;
        }

        public Criteria andC0109NotBetween(String value1, String value2) {
            addCriterion("C0109 not between", value1, value2, "c0109");
            return (Criteria) this;
        }

        public Criteria andC01utIsNull() {
            addCriterion("C01UT is null");
            return (Criteria) this;
        }

        public Criteria andC01utIsNotNull() {
            addCriterion("C01UT is not null");
            return (Criteria) this;
        }

        public Criteria andC01utEqualTo(String value) {
            addCriterion("C01UT =", value, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utNotEqualTo(String value) {
            addCriterion("C01UT <>", value, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utGreaterThan(String value) {
            addCriterion("C01UT >", value, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utGreaterThanOrEqualTo(String value) {
            addCriterion("C01UT >=", value, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utLessThan(String value) {
            addCriterion("C01UT <", value, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utLessThanOrEqualTo(String value) {
            addCriterion("C01UT <=", value, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utLike(String value) {
            addCriterion("C01UT like", value, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utNotLike(String value) {
            addCriterion("C01UT not like", value, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utIn(List<String> values) {
            addCriterion("C01UT in", values, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utNotIn(List<String> values) {
            addCriterion("C01UT not in", values, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utBetween(String value1, String value2) {
            addCriterion("C01UT between", value1, value2, "c01ut");
            return (Criteria) this;
        }

        public Criteria andC01utNotBetween(String value1, String value2) {
            addCriterion("C01UT not between", value1, value2, "c01ut");
            return (Criteria) this;
        }

        public Criteria andE0104IsNull() {
            addCriterion("E0104 is null");
            return (Criteria) this;
        }

        public Criteria andE0104IsNotNull() {
            addCriterion("E0104 is not null");
            return (Criteria) this;
        }

        public Criteria andE0104EqualTo(String value) {
            addCriterion("E0104 =", value, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104NotEqualTo(String value) {
            addCriterion("E0104 <>", value, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104GreaterThan(String value) {
            addCriterion("E0104 >", value, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104GreaterThanOrEqualTo(String value) {
            addCriterion("E0104 >=", value, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104LessThan(String value) {
            addCriterion("E0104 <", value, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104LessThanOrEqualTo(String value) {
            addCriterion("E0104 <=", value, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104Like(String value) {
            addCriterion("E0104 like", value, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104NotLike(String value) {
            addCriterion("E0104 not like", value, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104In(List<String> values) {
            addCriterion("E0104 in", values, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104NotIn(List<String> values) {
            addCriterion("E0104 not in", values, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104Between(String value1, String value2) {
            addCriterion("E0104 between", value1, value2, "e0104");
            return (Criteria) this;
        }

        public Criteria andE0104NotBetween(String value1, String value2) {
            addCriterion("E0104 not between", value1, value2, "e0104");
            return (Criteria) this;
        }

        public Criteria andA0174IsNull() {
            addCriterion("A0174 is null");
            return (Criteria) this;
        }

        public Criteria andA0174IsNotNull() {
            addCriterion("A0174 is not null");
            return (Criteria) this;
        }

        public Criteria andA0174EqualTo(String value) {
            addCriterion("A0174 =", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174NotEqualTo(String value) {
            addCriterion("A0174 <>", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174GreaterThan(String value) {
            addCriterion("A0174 >", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174GreaterThanOrEqualTo(String value) {
            addCriterion("A0174 >=", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174LessThan(String value) {
            addCriterion("A0174 <", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174LessThanOrEqualTo(String value) {
            addCriterion("A0174 <=", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174Like(String value) {
            addCriterion("A0174 like", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174NotLike(String value) {
            addCriterion("A0174 not like", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174In(List<String> values) {
            addCriterion("A0174 in", values, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174NotIn(List<String> values) {
            addCriterion("A0174 not in", values, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174Between(String value1, String value2) {
            addCriterion("A0174 between", value1, value2, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174NotBetween(String value1, String value2) {
            addCriterion("A0174 not between", value1, value2, "a0174");
            return (Criteria) this;
        }

        public Criteria andE0126IsNull() {
            addCriterion("E0126 is null");
            return (Criteria) this;
        }

        public Criteria andE0126IsNotNull() {
            addCriterion("E0126 is not null");
            return (Criteria) this;
        }

        public Criteria andE0126EqualTo(String value) {
            addCriterion("E0126 =", value, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126NotEqualTo(String value) {
            addCriterion("E0126 <>", value, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126GreaterThan(String value) {
            addCriterion("E0126 >", value, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126GreaterThanOrEqualTo(String value) {
            addCriterion("E0126 >=", value, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126LessThan(String value) {
            addCriterion("E0126 <", value, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126LessThanOrEqualTo(String value) {
            addCriterion("E0126 <=", value, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126Like(String value) {
            addCriterion("E0126 like", value, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126NotLike(String value) {
            addCriterion("E0126 not like", value, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126In(List<String> values) {
            addCriterion("E0126 in", values, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126NotIn(List<String> values) {
            addCriterion("E0126 not in", values, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126Between(String value1, String value2) {
            addCriterion("E0126 between", value1, value2, "e0126");
            return (Criteria) this;
        }

        public Criteria andE0126NotBetween(String value1, String value2) {
            addCriterion("E0126 not between", value1, value2, "e0126");
            return (Criteria) this;
        }

        public Criteria andC01uyIsNull() {
            addCriterion("C01UY is null");
            return (Criteria) this;
        }

        public Criteria andC01uyIsNotNull() {
            addCriterion("C01UY is not null");
            return (Criteria) this;
        }

        public Criteria andC01uyEqualTo(String value) {
            addCriterion("C01UY =", value, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyNotEqualTo(String value) {
            addCriterion("C01UY <>", value, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyGreaterThan(String value) {
            addCriterion("C01UY >", value, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyGreaterThanOrEqualTo(String value) {
            addCriterion("C01UY >=", value, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyLessThan(String value) {
            addCriterion("C01UY <", value, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyLessThanOrEqualTo(String value) {
            addCriterion("C01UY <=", value, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyLike(String value) {
            addCriterion("C01UY like", value, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyNotLike(String value) {
            addCriterion("C01UY not like", value, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyIn(List<String> values) {
            addCriterion("C01UY in", values, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyNotIn(List<String> values) {
            addCriterion("C01UY not in", values, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyBetween(String value1, String value2) {
            addCriterion("C01UY between", value1, value2, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uyNotBetween(String value1, String value2) {
            addCriterion("C01UY not between", value1, value2, "c01uy");
            return (Criteria) this;
        }

        public Criteria andC01uzIsNull() {
            addCriterion("C01UZ is null");
            return (Criteria) this;
        }

        public Criteria andC01uzIsNotNull() {
            addCriterion("C01UZ is not null");
            return (Criteria) this;
        }

        public Criteria andC01uzEqualTo(String value) {
            addCriterion("C01UZ =", value, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzNotEqualTo(String value) {
            addCriterion("C01UZ <>", value, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzGreaterThan(String value) {
            addCriterion("C01UZ >", value, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzGreaterThanOrEqualTo(String value) {
            addCriterion("C01UZ >=", value, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzLessThan(String value) {
            addCriterion("C01UZ <", value, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzLessThanOrEqualTo(String value) {
            addCriterion("C01UZ <=", value, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzLike(String value) {
            addCriterion("C01UZ like", value, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzNotLike(String value) {
            addCriterion("C01UZ not like", value, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzIn(List<String> values) {
            addCriterion("C01UZ in", values, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzNotIn(List<String> values) {
            addCriterion("C01UZ not in", values, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzBetween(String value1, String value2) {
            addCriterion("C01UZ between", value1, value2, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uzNotBetween(String value1, String value2) {
            addCriterion("C01UZ not between", value1, value2, "c01uz");
            return (Criteria) this;
        }

        public Criteria andC01uwIsNull() {
            addCriterion("C01UW is null");
            return (Criteria) this;
        }

        public Criteria andC01uwIsNotNull() {
            addCriterion("C01UW is not null");
            return (Criteria) this;
        }

        public Criteria andC01uwEqualTo(Date value) {
            addCriterion("C01UW =", value, "c01uw");
            return (Criteria) this;
        }

        public Criteria andC01uwNotEqualTo(Date value) {
            addCriterion("C01UW <>", value, "c01uw");
            return (Criteria) this;
        }

        public Criteria andC01uwGreaterThan(Date value) {
            addCriterion("C01UW >", value, "c01uw");
            return (Criteria) this;
        }

        public Criteria andC01uwGreaterThanOrEqualTo(Date value) {
            addCriterion("C01UW >=", value, "c01uw");
            return (Criteria) this;
        }

        public Criteria andC01uwLessThan(Date value) {
            addCriterion("C01UW <", value, "c01uw");
            return (Criteria) this;
        }

        public Criteria andC01uwLessThanOrEqualTo(Date value) {
            addCriterion("C01UW <=", value, "c01uw");
            return (Criteria) this;
        }

        public Criteria andC01uwIn(List<Date> values) {
            addCriterion("C01UW in", values, "c01uw");
            return (Criteria) this;
        }

        public Criteria andC01uwNotIn(List<Date> values) {
            addCriterion("C01UW not in", values, "c01uw");
            return (Criteria) this;
        }

        public Criteria andC01uwBetween(Date value1, Date value2) {
            addCriterion("C01UW between", value1, value2, "c01uw");
            return (Criteria) this;
        }

        public Criteria andC01uwNotBetween(Date value1, Date value2) {
            addCriterion("C01UW not between", value1, value2, "c01uw");
            return (Criteria) this;
        }

        public Criteria andC01uxIsNull() {
            addCriterion("C01UX is null");
            return (Criteria) this;
        }

        public Criteria andC01uxIsNotNull() {
            addCriterion("C01UX is not null");
            return (Criteria) this;
        }

        public Criteria andC01uxEqualTo(String value) {
            addCriterion("C01UX =", value, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxNotEqualTo(String value) {
            addCriterion("C01UX <>", value, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxGreaterThan(String value) {
            addCriterion("C01UX >", value, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxGreaterThanOrEqualTo(String value) {
            addCriterion("C01UX >=", value, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxLessThan(String value) {
            addCriterion("C01UX <", value, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxLessThanOrEqualTo(String value) {
            addCriterion("C01UX <=", value, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxLike(String value) {
            addCriterion("C01UX like", value, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxNotLike(String value) {
            addCriterion("C01UX not like", value, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxIn(List<String> values) {
            addCriterion("C01UX in", values, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxNotIn(List<String> values) {
            addCriterion("C01UX not in", values, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxBetween(String value1, String value2) {
            addCriterion("C01UX between", value1, value2, "c01ux");
            return (Criteria) this;
        }

        public Criteria andC01uxNotBetween(String value1, String value2) {
            addCriterion("C01UX not between", value1, value2, "c01ux");
            return (Criteria) this;
        }

        public Criteria andA01z0IsNull() {
            addCriterion("A01Z0 is null");
            return (Criteria) this;
        }

        public Criteria andA01z0IsNotNull() {
            addCriterion("A01Z0 is not null");
            return (Criteria) this;
        }

        public Criteria andA01z0EqualTo(String value) {
            addCriterion("A01Z0 =", value, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0NotEqualTo(String value) {
            addCriterion("A01Z0 <>", value, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0GreaterThan(String value) {
            addCriterion("A01Z0 >", value, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0GreaterThanOrEqualTo(String value) {
            addCriterion("A01Z0 >=", value, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0LessThan(String value) {
            addCriterion("A01Z0 <", value, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0LessThanOrEqualTo(String value) {
            addCriterion("A01Z0 <=", value, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0Like(String value) {
            addCriterion("A01Z0 like", value, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0NotLike(String value) {
            addCriterion("A01Z0 not like", value, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0In(List<String> values) {
            addCriterion("A01Z0 in", values, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0NotIn(List<String> values) {
            addCriterion("A01Z0 not in", values, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0Between(String value1, String value2) {
            addCriterion("A01Z0 between", value1, value2, "a01z0");
            return (Criteria) this;
        }

        public Criteria andA01z0NotBetween(String value1, String value2) {
            addCriterion("A01Z0 not between", value1, value2, "a01z0");
            return (Criteria) this;
        }

        public Criteria andC01v1IsNull() {
            addCriterion("C01V1 is null");
            return (Criteria) this;
        }

        public Criteria andC01v1IsNotNull() {
            addCriterion("C01V1 is not null");
            return (Criteria) this;
        }

        public Criteria andC01v1EqualTo(String value) {
            addCriterion("C01V1 =", value, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1NotEqualTo(String value) {
            addCriterion("C01V1 <>", value, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1GreaterThan(String value) {
            addCriterion("C01V1 >", value, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1GreaterThanOrEqualTo(String value) {
            addCriterion("C01V1 >=", value, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1LessThan(String value) {
            addCriterion("C01V1 <", value, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1LessThanOrEqualTo(String value) {
            addCriterion("C01V1 <=", value, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1Like(String value) {
            addCriterion("C01V1 like", value, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1NotLike(String value) {
            addCriterion("C01V1 not like", value, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1In(List<String> values) {
            addCriterion("C01V1 in", values, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1NotIn(List<String> values) {
            addCriterion("C01V1 not in", values, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1Between(String value1, String value2) {
            addCriterion("C01V1 between", value1, value2, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v1NotBetween(String value1, String value2) {
            addCriterion("C01V1 not between", value1, value2, "c01v1");
            return (Criteria) this;
        }

        public Criteria andC01v2IsNull() {
            addCriterion("C01V2 is null");
            return (Criteria) this;
        }

        public Criteria andC01v2IsNotNull() {
            addCriterion("C01V2 is not null");
            return (Criteria) this;
        }

        public Criteria andC01v2EqualTo(Date value) {
            addCriterion("C01V2 =", value, "c01v2");
            return (Criteria) this;
        }

        public Criteria andC01v2NotEqualTo(Date value) {
            addCriterion("C01V2 <>", value, "c01v2");
            return (Criteria) this;
        }

        public Criteria andC01v2GreaterThan(Date value) {
            addCriterion("C01V2 >", value, "c01v2");
            return (Criteria) this;
        }

        public Criteria andC01v2GreaterThanOrEqualTo(Date value) {
            addCriterion("C01V2 >=", value, "c01v2");
            return (Criteria) this;
        }

        public Criteria andC01v2LessThan(Date value) {
            addCriterion("C01V2 <", value, "c01v2");
            return (Criteria) this;
        }

        public Criteria andC01v2LessThanOrEqualTo(Date value) {
            addCriterion("C01V2 <=", value, "c01v2");
            return (Criteria) this;
        }

        public Criteria andC01v2In(List<Date> values) {
            addCriterion("C01V2 in", values, "c01v2");
            return (Criteria) this;
        }

        public Criteria andC01v2NotIn(List<Date> values) {
            addCriterion("C01V2 not in", values, "c01v2");
            return (Criteria) this;
        }

        public Criteria andC01v2Between(Date value1, Date value2) {
            addCriterion("C01V2 between", value1, value2, "c01v2");
            return (Criteria) this;
        }

        public Criteria andC01v2NotBetween(Date value1, Date value2) {
            addCriterion("C01V2 not between", value1, value2, "c01v2");
            return (Criteria) this;
        }

        public Criteria andC01v4IsNull() {
            addCriterion("C01V4 is null");
            return (Criteria) this;
        }

        public Criteria andC01v4IsNotNull() {
            addCriterion("C01V4 is not null");
            return (Criteria) this;
        }

        public Criteria andC01v4EqualTo(String value) {
            addCriterion("C01V4 =", value, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4NotEqualTo(String value) {
            addCriterion("C01V4 <>", value, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4GreaterThan(String value) {
            addCriterion("C01V4 >", value, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4GreaterThanOrEqualTo(String value) {
            addCriterion("C01V4 >=", value, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4LessThan(String value) {
            addCriterion("C01V4 <", value, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4LessThanOrEqualTo(String value) {
            addCriterion("C01V4 <=", value, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4Like(String value) {
            addCriterion("C01V4 like", value, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4NotLike(String value) {
            addCriterion("C01V4 not like", value, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4In(List<String> values) {
            addCriterion("C01V4 in", values, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4NotIn(List<String> values) {
            addCriterion("C01V4 not in", values, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4Between(String value1, String value2) {
            addCriterion("C01V4 between", value1, value2, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v4NotBetween(String value1, String value2) {
            addCriterion("C01V4 not between", value1, value2, "c01v4");
            return (Criteria) this;
        }

        public Criteria andC01v6IsNull() {
            addCriterion("C01V6 is null");
            return (Criteria) this;
        }

        public Criteria andC01v6IsNotNull() {
            addCriterion("C01V6 is not null");
            return (Criteria) this;
        }

        public Criteria andC01v6EqualTo(BigDecimal value) {
            addCriterion("C01V6 =", value, "c01v6");
            return (Criteria) this;
        }

        public Criteria andC01v6NotEqualTo(BigDecimal value) {
            addCriterion("C01V6 <>", value, "c01v6");
            return (Criteria) this;
        }

        public Criteria andC01v6GreaterThan(BigDecimal value) {
            addCriterion("C01V6 >", value, "c01v6");
            return (Criteria) this;
        }

        public Criteria andC01v6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("C01V6 >=", value, "c01v6");
            return (Criteria) this;
        }

        public Criteria andC01v6LessThan(BigDecimal value) {
            addCriterion("C01V6 <", value, "c01v6");
            return (Criteria) this;
        }

        public Criteria andC01v6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("C01V6 <=", value, "c01v6");
            return (Criteria) this;
        }

        public Criteria andC01v6In(List<BigDecimal> values) {
            addCriterion("C01V6 in", values, "c01v6");
            return (Criteria) this;
        }

        public Criteria andC01v6NotIn(List<BigDecimal> values) {
            addCriterion("C01V6 not in", values, "c01v6");
            return (Criteria) this;
        }

        public Criteria andC01v6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("C01V6 between", value1, value2, "c01v6");
            return (Criteria) this;
        }

        public Criteria andC01v6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C01V6 not between", value1, value2, "c01v6");
            return (Criteria) this;
        }

        public Criteria andC01v7IsNull() {
            addCriterion("C01V7 is null");
            return (Criteria) this;
        }

        public Criteria andC01v7IsNotNull() {
            addCriterion("C01V7 is not null");
            return (Criteria) this;
        }

        public Criteria andC01v7EqualTo(String value) {
            addCriterion("C01V7 =", value, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7NotEqualTo(String value) {
            addCriterion("C01V7 <>", value, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7GreaterThan(String value) {
            addCriterion("C01V7 >", value, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7GreaterThanOrEqualTo(String value) {
            addCriterion("C01V7 >=", value, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7LessThan(String value) {
            addCriterion("C01V7 <", value, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7LessThanOrEqualTo(String value) {
            addCriterion("C01V7 <=", value, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7Like(String value) {
            addCriterion("C01V7 like", value, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7NotLike(String value) {
            addCriterion("C01V7 not like", value, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7In(List<String> values) {
            addCriterion("C01V7 in", values, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7NotIn(List<String> values) {
            addCriterion("C01V7 not in", values, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7Between(String value1, String value2) {
            addCriterion("C01V7 between", value1, value2, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01v7NotBetween(String value1, String value2) {
            addCriterion("C01V7 not between", value1, value2, "c01v7");
            return (Criteria) this;
        }

        public Criteria andC01vbIsNull() {
            addCriterion("C01VB is null");
            return (Criteria) this;
        }

        public Criteria andC01vbIsNotNull() {
            addCriterion("C01VB is not null");
            return (Criteria) this;
        }

        public Criteria andC01vbEqualTo(String value) {
            addCriterion("C01VB =", value, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbNotEqualTo(String value) {
            addCriterion("C01VB <>", value, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbGreaterThan(String value) {
            addCriterion("C01VB >", value, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbGreaterThanOrEqualTo(String value) {
            addCriterion("C01VB >=", value, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbLessThan(String value) {
            addCriterion("C01VB <", value, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbLessThanOrEqualTo(String value) {
            addCriterion("C01VB <=", value, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbLike(String value) {
            addCriterion("C01VB like", value, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbNotLike(String value) {
            addCriterion("C01VB not like", value, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbIn(List<String> values) {
            addCriterion("C01VB in", values, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbNotIn(List<String> values) {
            addCriterion("C01VB not in", values, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbBetween(String value1, String value2) {
            addCriterion("C01VB between", value1, value2, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01vbNotBetween(String value1, String value2) {
            addCriterion("C01VB not between", value1, value2, "c01vb");
            return (Criteria) this;
        }

        public Criteria andC01v5IsNull() {
            addCriterion("C01V5 is null");
            return (Criteria) this;
        }

        public Criteria andC01v5IsNotNull() {
            addCriterion("C01V5 is not null");
            return (Criteria) this;
        }

        public Criteria andC01v5EqualTo(String value) {
            addCriterion("C01V5 =", value, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5NotEqualTo(String value) {
            addCriterion("C01V5 <>", value, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5GreaterThan(String value) {
            addCriterion("C01V5 >", value, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5GreaterThanOrEqualTo(String value) {
            addCriterion("C01V5 >=", value, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5LessThan(String value) {
            addCriterion("C01V5 <", value, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5LessThanOrEqualTo(String value) {
            addCriterion("C01V5 <=", value, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5Like(String value) {
            addCriterion("C01V5 like", value, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5NotLike(String value) {
            addCriterion("C01V5 not like", value, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5In(List<String> values) {
            addCriterion("C01V5 in", values, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5NotIn(List<String> values) {
            addCriterion("C01V5 not in", values, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5Between(String value1, String value2) {
            addCriterion("C01V5 between", value1, value2, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01v5NotBetween(String value1, String value2) {
            addCriterion("C01V5 not between", value1, value2, "c01v5");
            return (Criteria) this;
        }

        public Criteria andC01vcIsNull() {
            addCriterion("C01VC is null");
            return (Criteria) this;
        }

        public Criteria andC01vcIsNotNull() {
            addCriterion("C01VC is not null");
            return (Criteria) this;
        }

        public Criteria andC01vcEqualTo(String value) {
            addCriterion("C01VC =", value, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcNotEqualTo(String value) {
            addCriterion("C01VC <>", value, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcGreaterThan(String value) {
            addCriterion("C01VC >", value, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcGreaterThanOrEqualTo(String value) {
            addCriterion("C01VC >=", value, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcLessThan(String value) {
            addCriterion("C01VC <", value, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcLessThanOrEqualTo(String value) {
            addCriterion("C01VC <=", value, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcLike(String value) {
            addCriterion("C01VC like", value, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcNotLike(String value) {
            addCriterion("C01VC not like", value, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcIn(List<String> values) {
            addCriterion("C01VC in", values, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcNotIn(List<String> values) {
            addCriterion("C01VC not in", values, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcBetween(String value1, String value2) {
            addCriterion("C01VC between", value1, value2, "c01vc");
            return (Criteria) this;
        }

        public Criteria andC01vcNotBetween(String value1, String value2) {
            addCriterion("C01VC not between", value1, value2, "c01vc");
            return (Criteria) this;
        }

        public Criteria andGuidkeyIsNull() {
            addCriterion("GUIDKEY is null");
            return (Criteria) this;
        }

        public Criteria andGuidkeyIsNotNull() {
            addCriterion("GUIDKEY is not null");
            return (Criteria) this;
        }

        public Criteria andGuidkeyEqualTo(String value) {
            addCriterion("GUIDKEY =", value, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyNotEqualTo(String value) {
            addCriterion("GUIDKEY <>", value, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyGreaterThan(String value) {
            addCriterion("GUIDKEY >", value, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyGreaterThanOrEqualTo(String value) {
            addCriterion("GUIDKEY >=", value, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyLessThan(String value) {
            addCriterion("GUIDKEY <", value, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyLessThanOrEqualTo(String value) {
            addCriterion("GUIDKEY <=", value, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyLike(String value) {
            addCriterion("GUIDKEY like", value, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyNotLike(String value) {
            addCriterion("GUIDKEY not like", value, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyIn(List<String> values) {
            addCriterion("GUIDKEY in", values, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyNotIn(List<String> values) {
            addCriterion("GUIDKEY not in", values, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyBetween(String value1, String value2) {
            addCriterion("GUIDKEY between", value1, value2, "guidkey");
            return (Criteria) this;
        }

        public Criteria andGuidkeyNotBetween(String value1, String value2) {
            addCriterion("GUIDKEY not between", value1, value2, "guidkey");
            return (Criteria) this;
        }

        public Criteria andC01usIsNull() {
            addCriterion("C01US is null");
            return (Criteria) this;
        }

        public Criteria andC01usIsNotNull() {
            addCriterion("C01US is not null");
            return (Criteria) this;
        }

        public Criteria andC01usEqualTo(String value) {
            addCriterion("C01US =", value, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usNotEqualTo(String value) {
            addCriterion("C01US <>", value, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usGreaterThan(String value) {
            addCriterion("C01US >", value, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usGreaterThanOrEqualTo(String value) {
            addCriterion("C01US >=", value, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usLessThan(String value) {
            addCriterion("C01US <", value, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usLessThanOrEqualTo(String value) {
            addCriterion("C01US <=", value, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usLike(String value) {
            addCriterion("C01US like", value, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usNotLike(String value) {
            addCriterion("C01US not like", value, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usIn(List<String> values) {
            addCriterion("C01US in", values, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usNotIn(List<String> values) {
            addCriterion("C01US not in", values, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usBetween(String value1, String value2) {
            addCriterion("C01US between", value1, value2, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01usNotBetween(String value1, String value2) {
            addCriterion("C01US not between", value1, value2, "c01us");
            return (Criteria) this;
        }

        public Criteria andC01vdIsNull() {
            addCriterion("C01VD is null");
            return (Criteria) this;
        }

        public Criteria andC01vdIsNotNull() {
            addCriterion("C01VD is not null");
            return (Criteria) this;
        }

        public Criteria andC01vdEqualTo(String value) {
            addCriterion("C01VD =", value, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdNotEqualTo(String value) {
            addCriterion("C01VD <>", value, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdGreaterThan(String value) {
            addCriterion("C01VD >", value, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdGreaterThanOrEqualTo(String value) {
            addCriterion("C01VD >=", value, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdLessThan(String value) {
            addCriterion("C01VD <", value, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdLessThanOrEqualTo(String value) {
            addCriterion("C01VD <=", value, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdLike(String value) {
            addCriterion("C01VD like", value, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdNotLike(String value) {
            addCriterion("C01VD not like", value, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdIn(List<String> values) {
            addCriterion("C01VD in", values, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdNotIn(List<String> values) {
            addCriterion("C01VD not in", values, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdBetween(String value1, String value2) {
            addCriterion("C01VD between", value1, value2, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01vdNotBetween(String value1, String value2) {
            addCriterion("C01VD not between", value1, value2, "c01vd");
            return (Criteria) this;
        }

        public Criteria andC01umIsNull() {
            addCriterion("C01UM is null");
            return (Criteria) this;
        }

        public Criteria andC01umIsNotNull() {
            addCriterion("C01UM is not null");
            return (Criteria) this;
        }

        public Criteria andC01umEqualTo(String value) {
            addCriterion("C01UM =", value, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umNotEqualTo(String value) {
            addCriterion("C01UM <>", value, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umGreaterThan(String value) {
            addCriterion("C01UM >", value, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umGreaterThanOrEqualTo(String value) {
            addCriterion("C01UM >=", value, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umLessThan(String value) {
            addCriterion("C01UM <", value, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umLessThanOrEqualTo(String value) {
            addCriterion("C01UM <=", value, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umLike(String value) {
            addCriterion("C01UM like", value, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umNotLike(String value) {
            addCriterion("C01UM not like", value, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umIn(List<String> values) {
            addCriterion("C01UM in", values, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umNotIn(List<String> values) {
            addCriterion("C01UM not in", values, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umBetween(String value1, String value2) {
            addCriterion("C01UM between", value1, value2, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01umNotBetween(String value1, String value2) {
            addCriterion("C01UM not between", value1, value2, "c01um");
            return (Criteria) this;
        }

        public Criteria andC01veIsNull() {
            addCriterion("C01VE is null");
            return (Criteria) this;
        }

        public Criteria andC01veIsNotNull() {
            addCriterion("C01VE is not null");
            return (Criteria) this;
        }

        public Criteria andC01veEqualTo(String value) {
            addCriterion("C01VE =", value, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veNotEqualTo(String value) {
            addCriterion("C01VE <>", value, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veGreaterThan(String value) {
            addCriterion("C01VE >", value, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veGreaterThanOrEqualTo(String value) {
            addCriterion("C01VE >=", value, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veLessThan(String value) {
            addCriterion("C01VE <", value, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veLessThanOrEqualTo(String value) {
            addCriterion("C01VE <=", value, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veLike(String value) {
            addCriterion("C01VE like", value, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veNotLike(String value) {
            addCriterion("C01VE not like", value, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veIn(List<String> values) {
            addCriterion("C01VE in", values, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veNotIn(List<String> values) {
            addCriterion("C01VE not in", values, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veBetween(String value1, String value2) {
            addCriterion("C01VE between", value1, value2, "c01ve");
            return (Criteria) this;
        }

        public Criteria andC01veNotBetween(String value1, String value2) {
            addCriterion("C01VE not between", value1, value2, "c01ve");
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