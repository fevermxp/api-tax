package com.gree.gree_x.model.ehrsoft;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andCodesetidIsNull() {
            addCriterion("CODESETID is null");
            return (Criteria) this;
        }

        public Criteria andCodesetidIsNotNull() {
            addCriterion("CODESETID is not null");
            return (Criteria) this;
        }

        public Criteria andCodesetidEqualTo(String value) {
            addCriterion("CODESETID =", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidNotEqualTo(String value) {
            addCriterion("CODESETID <>", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidGreaterThan(String value) {
            addCriterion("CODESETID >", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidGreaterThanOrEqualTo(String value) {
            addCriterion("CODESETID >=", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidLessThan(String value) {
            addCriterion("CODESETID <", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidLessThanOrEqualTo(String value) {
            addCriterion("CODESETID <=", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidLike(String value) {
            addCriterion("CODESETID like", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidNotLike(String value) {
            addCriterion("CODESETID not like", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidIn(List<String> values) {
            addCriterion("CODESETID in", values, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidNotIn(List<String> values) {
            addCriterion("CODESETID not in", values, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidBetween(String value1, String value2) {
            addCriterion("CODESETID between", value1, value2, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidNotBetween(String value1, String value2) {
            addCriterion("CODESETID not between", value1, value2, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidIsNull() {
            addCriterion("CODEITEMID is null");
            return (Criteria) this;
        }

        public Criteria andCodeitemidIsNotNull() {
            addCriterion("CODEITEMID is not null");
            return (Criteria) this;
        }

        public Criteria andCodeitemidEqualTo(String value) {
            addCriterion("CODEITEMID =", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidNotEqualTo(String value) {
            addCriterion("CODEITEMID <>", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidGreaterThan(String value) {
            addCriterion("CODEITEMID >", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidGreaterThanOrEqualTo(String value) {
            addCriterion("CODEITEMID >=", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidLessThan(String value) {
            addCriterion("CODEITEMID <", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidLessThanOrEqualTo(String value) {
            addCriterion("CODEITEMID <=", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidLike(String value) {
            addCriterion("CODEITEMID like", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidNotLike(String value) {
            addCriterion("CODEITEMID not like", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidIn(List<String> values) {
            addCriterion("CODEITEMID in", values, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidNotIn(List<String> values) {
            addCriterion("CODEITEMID not in", values, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidBetween(String value1, String value2) {
            addCriterion("CODEITEMID between", value1, value2, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidNotBetween(String value1, String value2) {
            addCriterion("CODEITEMID not between", value1, value2, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescIsNull() {
            addCriterion("CODEITEMDESC is null");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescIsNotNull() {
            addCriterion("CODEITEMDESC is not null");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescEqualTo(String value) {
            addCriterion("CODEITEMDESC =", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescNotEqualTo(String value) {
            addCriterion("CODEITEMDESC <>", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescGreaterThan(String value) {
            addCriterion("CODEITEMDESC >", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescGreaterThanOrEqualTo(String value) {
            addCriterion("CODEITEMDESC >=", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescLessThan(String value) {
            addCriterion("CODEITEMDESC <", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescLessThanOrEqualTo(String value) {
            addCriterion("CODEITEMDESC <=", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescLike(String value) {
            addCriterion("CODEITEMDESC like", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescNotLike(String value) {
            addCriterion("CODEITEMDESC not like", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescIn(List<String> values) {
            addCriterion("CODEITEMDESC in", values, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescNotIn(List<String> values) {
            addCriterion("CODEITEMDESC not in", values, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescBetween(String value1, String value2) {
            addCriterion("CODEITEMDESC between", value1, value2, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescNotBetween(String value1, String value2) {
            addCriterion("CODEITEMDESC not between", value1, value2, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("PARENTID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("PARENTID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andChildidIsNull() {
            addCriterion("CHILDID is null");
            return (Criteria) this;
        }

        public Criteria andChildidIsNotNull() {
            addCriterion("CHILDID is not null");
            return (Criteria) this;
        }

        public Criteria andChildidEqualTo(String value) {
            addCriterion("CHILDID =", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotEqualTo(String value) {
            addCriterion("CHILDID <>", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidGreaterThan(String value) {
            addCriterion("CHILDID >", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidGreaterThanOrEqualTo(String value) {
            addCriterion("CHILDID >=", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLessThan(String value) {
            addCriterion("CHILDID <", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLessThanOrEqualTo(String value) {
            addCriterion("CHILDID <=", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLike(String value) {
            addCriterion("CHILDID like", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotLike(String value) {
            addCriterion("CHILDID not like", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidIn(List<String> values) {
            addCriterion("CHILDID in", values, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotIn(List<String> values) {
            addCriterion("CHILDID not in", values, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidBetween(String value1, String value2) {
            addCriterion("CHILDID between", value1, value2, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotBetween(String value1, String value2) {
            addCriterion("CHILDID not between", value1, value2, "childid");
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

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Short value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Short value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Short value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Short value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Short value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Short value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Short> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Short> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Short value1, Short value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Short value1, Short value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
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

        public Criteria andGroupidIsNull() {
            addCriterion("GROUPID is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("GROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Short value) {
            addCriterion("GROUPID =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Short value) {
            addCriterion("GROUPID <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Short value) {
            addCriterion("GROUPID >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Short value) {
            addCriterion("GROUPID >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Short value) {
            addCriterion("GROUPID <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Short value) {
            addCriterion("GROUPID <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Short> values) {
            addCriterion("GROUPID in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Short> values) {
            addCriterion("GROUPID not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Short value1, Short value2) {
            addCriterion("GROUPID between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Short value1, Short value2) {
            addCriterion("GROUPID not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andInvalidIsNull() {
            addCriterion("INVALID is null");
            return (Criteria) this;
        }

        public Criteria andInvalidIsNotNull() {
            addCriterion("INVALID is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidEqualTo(Short value) {
            addCriterion("INVALID =", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotEqualTo(Short value) {
            addCriterion("INVALID <>", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidGreaterThan(Short value) {
            addCriterion("INVALID >", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidGreaterThanOrEqualTo(Short value) {
            addCriterion("INVALID >=", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidLessThan(Short value) {
            addCriterion("INVALID <", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidLessThanOrEqualTo(Short value) {
            addCriterion("INVALID <=", value, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidIn(List<Short> values) {
            addCriterion("INVALID in", values, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotIn(List<Short> values) {
            addCriterion("INVALID not in", values, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidBetween(Short value1, Short value2) {
            addCriterion("INVALID between", value1, value2, "invalid");
            return (Criteria) this;
        }

        public Criteria andInvalidNotBetween(Short value1, Short value2) {
            addCriterion("INVALID not between", value1, value2, "invalid");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Short value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Short value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Short value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Short value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Short value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Short> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Short> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Short value1, Short value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Short value1, Short value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andLayerIsNull() {
            addCriterion("LAYER is null");
            return (Criteria) this;
        }

        public Criteria andLayerIsNotNull() {
            addCriterion("LAYER is not null");
            return (Criteria) this;
        }

        public Criteria andLayerEqualTo(Short value) {
            addCriterion("LAYER =", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotEqualTo(Short value) {
            addCriterion("LAYER <>", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThan(Short value) {
            addCriterion("LAYER >", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThanOrEqualTo(Short value) {
            addCriterion("LAYER >=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThan(Short value) {
            addCriterion("LAYER <", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThanOrEqualTo(Short value) {
            addCriterion("LAYER <=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerIn(List<Short> values) {
            addCriterion("LAYER in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotIn(List<Short> values) {
            addCriterion("LAYER not in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerBetween(Short value1, Short value2) {
            addCriterion("LAYER between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotBetween(Short value1, Short value2) {
            addCriterion("LAYER not between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andCorcodeIsNull() {
            addCriterion("CORCODE is null");
            return (Criteria) this;
        }

        public Criteria andCorcodeIsNotNull() {
            addCriterion("CORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCorcodeEqualTo(String value) {
            addCriterion("CORCODE =", value, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeNotEqualTo(String value) {
            addCriterion("CORCODE <>", value, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeGreaterThan(String value) {
            addCriterion("CORCODE >", value, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CORCODE >=", value, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeLessThan(String value) {
            addCriterion("CORCODE <", value, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeLessThanOrEqualTo(String value) {
            addCriterion("CORCODE <=", value, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeLike(String value) {
            addCriterion("CORCODE like", value, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeNotLike(String value) {
            addCriterion("CORCODE not like", value, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeIn(List<String> values) {
            addCriterion("CORCODE in", values, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeNotIn(List<String> values) {
            addCriterion("CORCODE not in", values, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeBetween(String value1, String value2) {
            addCriterion("CORCODE between", value1, value2, "corcode");
            return (Criteria) this;
        }

        public Criteria andCorcodeNotBetween(String value1, String value2) {
            addCriterion("CORCODE not between", value1, value2, "corcode");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andViewChartIsNull() {
            addCriterion("VIEW_CHART is null");
            return (Criteria) this;
        }

        public Criteria andViewChartIsNotNull() {
            addCriterion("VIEW_CHART is not null");
            return (Criteria) this;
        }

        public Criteria andViewChartEqualTo(Long value) {
            addCriterion("VIEW_CHART =", value, "viewChart");
            return (Criteria) this;
        }

        public Criteria andViewChartNotEqualTo(Long value) {
            addCriterion("VIEW_CHART <>", value, "viewChart");
            return (Criteria) this;
        }

        public Criteria andViewChartGreaterThan(Long value) {
            addCriterion("VIEW_CHART >", value, "viewChart");
            return (Criteria) this;
        }

        public Criteria andViewChartGreaterThanOrEqualTo(Long value) {
            addCriterion("VIEW_CHART >=", value, "viewChart");
            return (Criteria) this;
        }

        public Criteria andViewChartLessThan(Long value) {
            addCriterion("VIEW_CHART <", value, "viewChart");
            return (Criteria) this;
        }

        public Criteria andViewChartLessThanOrEqualTo(Long value) {
            addCriterion("VIEW_CHART <=", value, "viewChart");
            return (Criteria) this;
        }

        public Criteria andViewChartIn(List<Long> values) {
            addCriterion("VIEW_CHART in", values, "viewChart");
            return (Criteria) this;
        }

        public Criteria andViewChartNotIn(List<Long> values) {
            addCriterion("VIEW_CHART not in", values, "viewChart");
            return (Criteria) this;
        }

        public Criteria andViewChartBetween(Long value1, Long value2) {
            addCriterion("VIEW_CHART between", value1, value2, "viewChart");
            return (Criteria) this;
        }

        public Criteria andViewChartNotBetween(Long value1, Long value2) {
            addCriterion("VIEW_CHART not between", value1, value2, "viewChart");
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