package com.gree.gree_x.model;

import java.util.ArrayList;
import java.util.List;

public class HrmDepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HrmDepartmentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkIsNull() {
            addCriterion("departmentmark is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkIsNotNull() {
            addCriterion("departmentmark is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkEqualTo(String value) {
            addCriterion("departmentmark =", value, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkNotEqualTo(String value) {
            addCriterion("departmentmark <>", value, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkGreaterThan(String value) {
            addCriterion("departmentmark >", value, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkGreaterThanOrEqualTo(String value) {
            addCriterion("departmentmark >=", value, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkLessThan(String value) {
            addCriterion("departmentmark <", value, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkLessThanOrEqualTo(String value) {
            addCriterion("departmentmark <=", value, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkLike(String value) {
            addCriterion("departmentmark like", value, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkNotLike(String value) {
            addCriterion("departmentmark not like", value, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkIn(List<String> values) {
            addCriterion("departmentmark in", values, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkNotIn(List<String> values) {
            addCriterion("departmentmark not in", values, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkBetween(String value1, String value2) {
            addCriterion("departmentmark between", value1, value2, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentmarkNotBetween(String value1, String value2) {
            addCriterion("departmentmark not between", value1, value2, "departmentmark");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentname is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentname is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentname =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentname <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentname >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentname >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentname <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentname <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentname like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentname not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentname in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentname not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentname between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentname not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1IsNull() {
            addCriterion("subcompanyid1 is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1IsNotNull() {
            addCriterion("subcompanyid1 is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1EqualTo(Integer value) {
            addCriterion("subcompanyid1 =", value, "subcompanyid1");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1NotEqualTo(Integer value) {
            addCriterion("subcompanyid1 <>", value, "subcompanyid1");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1GreaterThan(Integer value) {
            addCriterion("subcompanyid1 >", value, "subcompanyid1");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("subcompanyid1 >=", value, "subcompanyid1");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1LessThan(Integer value) {
            addCriterion("subcompanyid1 <", value, "subcompanyid1");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1LessThanOrEqualTo(Integer value) {
            addCriterion("subcompanyid1 <=", value, "subcompanyid1");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1In(List<Integer> values) {
            addCriterion("subcompanyid1 in", values, "subcompanyid1");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1NotIn(List<Integer> values) {
            addCriterion("subcompanyid1 not in", values, "subcompanyid1");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1Between(Integer value1, Integer value2) {
            addCriterion("subcompanyid1 between", value1, value2, "subcompanyid1");
            return (Criteria) this;
        }

        public Criteria andSubcompanyid1NotBetween(Integer value1, Integer value2) {
            addCriterion("subcompanyid1 not between", value1, value2, "subcompanyid1");
            return (Criteria) this;
        }

        public Criteria andSupdepidIsNull() {
            addCriterion("supdepid is null");
            return (Criteria) this;
        }

        public Criteria andSupdepidIsNotNull() {
            addCriterion("supdepid is not null");
            return (Criteria) this;
        }

        public Criteria andSupdepidEqualTo(Integer value) {
            addCriterion("supdepid =", value, "supdepid");
            return (Criteria) this;
        }

        public Criteria andSupdepidNotEqualTo(Integer value) {
            addCriterion("supdepid <>", value, "supdepid");
            return (Criteria) this;
        }

        public Criteria andSupdepidGreaterThan(Integer value) {
            addCriterion("supdepid >", value, "supdepid");
            return (Criteria) this;
        }

        public Criteria andSupdepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("supdepid >=", value, "supdepid");
            return (Criteria) this;
        }

        public Criteria andSupdepidLessThan(Integer value) {
            addCriterion("supdepid <", value, "supdepid");
            return (Criteria) this;
        }

        public Criteria andSupdepidLessThanOrEqualTo(Integer value) {
            addCriterion("supdepid <=", value, "supdepid");
            return (Criteria) this;
        }

        public Criteria andSupdepidIn(List<Integer> values) {
            addCriterion("supdepid in", values, "supdepid");
            return (Criteria) this;
        }

        public Criteria andSupdepidNotIn(List<Integer> values) {
            addCriterion("supdepid not in", values, "supdepid");
            return (Criteria) this;
        }

        public Criteria andSupdepidBetween(Integer value1, Integer value2) {
            addCriterion("supdepid between", value1, value2, "supdepid");
            return (Criteria) this;
        }

        public Criteria andSupdepidNotBetween(Integer value1, Integer value2) {
            addCriterion("supdepid not between", value1, value2, "supdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidIsNull() {
            addCriterion("allsupdepid is null");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidIsNotNull() {
            addCriterion("allsupdepid is not null");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidEqualTo(String value) {
            addCriterion("allsupdepid =", value, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidNotEqualTo(String value) {
            addCriterion("allsupdepid <>", value, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidGreaterThan(String value) {
            addCriterion("allsupdepid >", value, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidGreaterThanOrEqualTo(String value) {
            addCriterion("allsupdepid >=", value, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidLessThan(String value) {
            addCriterion("allsupdepid <", value, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidLessThanOrEqualTo(String value) {
            addCriterion("allsupdepid <=", value, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidLike(String value) {
            addCriterion("allsupdepid like", value, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidNotLike(String value) {
            addCriterion("allsupdepid not like", value, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidIn(List<String> values) {
            addCriterion("allsupdepid in", values, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidNotIn(List<String> values) {
            addCriterion("allsupdepid not in", values, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidBetween(String value1, String value2) {
            addCriterion("allsupdepid between", value1, value2, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andAllsupdepidNotBetween(String value1, String value2) {
            addCriterion("allsupdepid not between", value1, value2, "allsupdepid");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNull() {
            addCriterion("showorder is null");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNotNull() {
            addCriterion("showorder is not null");
            return (Criteria) this;
        }

        public Criteria andShoworderEqualTo(Integer value) {
            addCriterion("showorder =", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotEqualTo(Integer value) {
            addCriterion("showorder <>", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThan(Integer value) {
            addCriterion("showorder >", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThanOrEqualTo(Integer value) {
            addCriterion("showorder >=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThan(Integer value) {
            addCriterion("showorder <", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThanOrEqualTo(Integer value) {
            addCriterion("showorder <=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderIn(List<Integer> values) {
            addCriterion("showorder in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotIn(List<Integer> values) {
            addCriterion("showorder not in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderBetween(Integer value1, Integer value2) {
            addCriterion("showorder between", value1, value2, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotBetween(Integer value1, Integer value2) {
            addCriterion("showorder not between", value1, value2, "showorder");
            return (Criteria) this;
        }

        public Criteria andCanceledIsNull() {
            addCriterion("canceled is null");
            return (Criteria) this;
        }

        public Criteria andCanceledIsNotNull() {
            addCriterion("canceled is not null");
            return (Criteria) this;
        }

        public Criteria andCanceledEqualTo(String value) {
            addCriterion("canceled =", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledNotEqualTo(String value) {
            addCriterion("canceled <>", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledGreaterThan(String value) {
            addCriterion("canceled >", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledGreaterThanOrEqualTo(String value) {
            addCriterion("canceled >=", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledLessThan(String value) {
            addCriterion("canceled <", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledLessThanOrEqualTo(String value) {
            addCriterion("canceled <=", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledLike(String value) {
            addCriterion("canceled like", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledNotLike(String value) {
            addCriterion("canceled not like", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledIn(List<String> values) {
            addCriterion("canceled in", values, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledNotIn(List<String> values) {
            addCriterion("canceled not in", values, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledBetween(String value1, String value2) {
            addCriterion("canceled between", value1, value2, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledNotBetween(String value1, String value2) {
            addCriterion("canceled not between", value1, value2, "canceled");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNull() {
            addCriterion("departmentcode is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNotNull() {
            addCriterion("departmentcode is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeEqualTo(String value) {
            addCriterion("departmentcode =", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotEqualTo(String value) {
            addCriterion("departmentcode <>", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThan(String value) {
            addCriterion("departmentcode >", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("departmentcode >=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThan(String value) {
            addCriterion("departmentcode <", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("departmentcode <=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLike(String value) {
            addCriterion("departmentcode like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotLike(String value) {
            addCriterion("departmentcode not like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIn(List<String> values) {
            addCriterion("departmentcode in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotIn(List<String> values) {
            addCriterion("departmentcode not in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeBetween(String value1, String value2) {
            addCriterion("departmentcode between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("departmentcode not between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andCoadjutantIsNull() {
            addCriterion("coadjutant is null");
            return (Criteria) this;
        }

        public Criteria andCoadjutantIsNotNull() {
            addCriterion("coadjutant is not null");
            return (Criteria) this;
        }

        public Criteria andCoadjutantEqualTo(Integer value) {
            addCriterion("coadjutant =", value, "coadjutant");
            return (Criteria) this;
        }

        public Criteria andCoadjutantNotEqualTo(Integer value) {
            addCriterion("coadjutant <>", value, "coadjutant");
            return (Criteria) this;
        }

        public Criteria andCoadjutantGreaterThan(Integer value) {
            addCriterion("coadjutant >", value, "coadjutant");
            return (Criteria) this;
        }

        public Criteria andCoadjutantGreaterThanOrEqualTo(Integer value) {
            addCriterion("coadjutant >=", value, "coadjutant");
            return (Criteria) this;
        }

        public Criteria andCoadjutantLessThan(Integer value) {
            addCriterion("coadjutant <", value, "coadjutant");
            return (Criteria) this;
        }

        public Criteria andCoadjutantLessThanOrEqualTo(Integer value) {
            addCriterion("coadjutant <=", value, "coadjutant");
            return (Criteria) this;
        }

        public Criteria andCoadjutantIn(List<Integer> values) {
            addCriterion("coadjutant in", values, "coadjutant");
            return (Criteria) this;
        }

        public Criteria andCoadjutantNotIn(List<Integer> values) {
            addCriterion("coadjutant not in", values, "coadjutant");
            return (Criteria) this;
        }

        public Criteria andCoadjutantBetween(Integer value1, Integer value2) {
            addCriterion("coadjutant between", value1, value2, "coadjutant");
            return (Criteria) this;
        }

        public Criteria andCoadjutantNotBetween(Integer value1, Integer value2) {
            addCriterion("coadjutant not between", value1, value2, "coadjutant");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrIsNull() {
            addCriterion("zzjgbmfzr is null");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrIsNotNull() {
            addCriterion("zzjgbmfzr is not null");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrEqualTo(String value) {
            addCriterion("zzjgbmfzr =", value, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrNotEqualTo(String value) {
            addCriterion("zzjgbmfzr <>", value, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrGreaterThan(String value) {
            addCriterion("zzjgbmfzr >", value, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrGreaterThanOrEqualTo(String value) {
            addCriterion("zzjgbmfzr >=", value, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrLessThan(String value) {
            addCriterion("zzjgbmfzr <", value, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrLessThanOrEqualTo(String value) {
            addCriterion("zzjgbmfzr <=", value, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrLike(String value) {
            addCriterion("zzjgbmfzr like", value, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrNotLike(String value) {
            addCriterion("zzjgbmfzr not like", value, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrIn(List<String> values) {
            addCriterion("zzjgbmfzr in", values, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrNotIn(List<String> values) {
            addCriterion("zzjgbmfzr not in", values, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrBetween(String value1, String value2) {
            addCriterion("zzjgbmfzr between", value1, value2, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfzrNotBetween(String value1, String value2) {
            addCriterion("zzjgbmfzr not between", value1, value2, "zzjgbmfzr");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldIsNull() {
            addCriterion("zzjgbmfgld is null");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldIsNotNull() {
            addCriterion("zzjgbmfgld is not null");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldEqualTo(String value) {
            addCriterion("zzjgbmfgld =", value, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldNotEqualTo(String value) {
            addCriterion("zzjgbmfgld <>", value, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldGreaterThan(String value) {
            addCriterion("zzjgbmfgld >", value, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldGreaterThanOrEqualTo(String value) {
            addCriterion("zzjgbmfgld >=", value, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldLessThan(String value) {
            addCriterion("zzjgbmfgld <", value, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldLessThanOrEqualTo(String value) {
            addCriterion("zzjgbmfgld <=", value, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldLike(String value) {
            addCriterion("zzjgbmfgld like", value, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldNotLike(String value) {
            addCriterion("zzjgbmfgld not like", value, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldIn(List<String> values) {
            addCriterion("zzjgbmfgld in", values, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldNotIn(List<String> values) {
            addCriterion("zzjgbmfgld not in", values, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldBetween(String value1, String value2) {
            addCriterion("zzjgbmfgld between", value1, value2, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andZzjgbmfgldNotBetween(String value1, String value2) {
            addCriterion("zzjgbmfgld not between", value1, value2, "zzjgbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrIsNull() {
            addCriterion("jzglbmfzr is null");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrIsNotNull() {
            addCriterion("jzglbmfzr is not null");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrEqualTo(String value) {
            addCriterion("jzglbmfzr =", value, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrNotEqualTo(String value) {
            addCriterion("jzglbmfzr <>", value, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrGreaterThan(String value) {
            addCriterion("jzglbmfzr >", value, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrGreaterThanOrEqualTo(String value) {
            addCriterion("jzglbmfzr >=", value, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrLessThan(String value) {
            addCriterion("jzglbmfzr <", value, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrLessThanOrEqualTo(String value) {
            addCriterion("jzglbmfzr <=", value, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrLike(String value) {
            addCriterion("jzglbmfzr like", value, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrNotLike(String value) {
            addCriterion("jzglbmfzr not like", value, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrIn(List<String> values) {
            addCriterion("jzglbmfzr in", values, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrNotIn(List<String> values) {
            addCriterion("jzglbmfzr not in", values, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrBetween(String value1, String value2) {
            addCriterion("jzglbmfzr between", value1, value2, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfzrNotBetween(String value1, String value2) {
            addCriterion("jzglbmfzr not between", value1, value2, "jzglbmfzr");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldIsNull() {
            addCriterion("jzglbmfgld is null");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldIsNotNull() {
            addCriterion("jzglbmfgld is not null");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldEqualTo(String value) {
            addCriterion("jzglbmfgld =", value, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldNotEqualTo(String value) {
            addCriterion("jzglbmfgld <>", value, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldGreaterThan(String value) {
            addCriterion("jzglbmfgld >", value, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldGreaterThanOrEqualTo(String value) {
            addCriterion("jzglbmfgld >=", value, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldLessThan(String value) {
            addCriterion("jzglbmfgld <", value, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldLessThanOrEqualTo(String value) {
            addCriterion("jzglbmfgld <=", value, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldLike(String value) {
            addCriterion("jzglbmfgld like", value, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldNotLike(String value) {
            addCriterion("jzglbmfgld not like", value, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldIn(List<String> values) {
            addCriterion("jzglbmfgld in", values, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldNotIn(List<String> values) {
            addCriterion("jzglbmfgld not in", values, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldBetween(String value1, String value2) {
            addCriterion("jzglbmfgld between", value1, value2, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andJzglbmfgldNotBetween(String value1, String value2) {
            addCriterion("jzglbmfgld not between", value1, value2, "jzglbmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfzrIsNull() {
            addCriterion("bmfzr is null");
            return (Criteria) this;
        }

        public Criteria andBmfzrIsNotNull() {
            addCriterion("bmfzr is not null");
            return (Criteria) this;
        }

        public Criteria andBmfzrEqualTo(String value) {
            addCriterion("bmfzr =", value, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrNotEqualTo(String value) {
            addCriterion("bmfzr <>", value, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrGreaterThan(String value) {
            addCriterion("bmfzr >", value, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrGreaterThanOrEqualTo(String value) {
            addCriterion("bmfzr >=", value, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrLessThan(String value) {
            addCriterion("bmfzr <", value, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrLessThanOrEqualTo(String value) {
            addCriterion("bmfzr <=", value, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrLike(String value) {
            addCriterion("bmfzr like", value, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrNotLike(String value) {
            addCriterion("bmfzr not like", value, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrIn(List<String> values) {
            addCriterion("bmfzr in", values, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrNotIn(List<String> values) {
            addCriterion("bmfzr not in", values, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrBetween(String value1, String value2) {
            addCriterion("bmfzr between", value1, value2, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfzrNotBetween(String value1, String value2) {
            addCriterion("bmfzr not between", value1, value2, "bmfzr");
            return (Criteria) this;
        }

        public Criteria andBmfgldIsNull() {
            addCriterion("bmfgld is null");
            return (Criteria) this;
        }

        public Criteria andBmfgldIsNotNull() {
            addCriterion("bmfgld is not null");
            return (Criteria) this;
        }

        public Criteria andBmfgldEqualTo(String value) {
            addCriterion("bmfgld =", value, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldNotEqualTo(String value) {
            addCriterion("bmfgld <>", value, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldGreaterThan(String value) {
            addCriterion("bmfgld >", value, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldGreaterThanOrEqualTo(String value) {
            addCriterion("bmfgld >=", value, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldLessThan(String value) {
            addCriterion("bmfgld <", value, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldLessThanOrEqualTo(String value) {
            addCriterion("bmfgld <=", value, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldLike(String value) {
            addCriterion("bmfgld like", value, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldNotLike(String value) {
            addCriterion("bmfgld not like", value, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldIn(List<String> values) {
            addCriterion("bmfgld in", values, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldNotIn(List<String> values) {
            addCriterion("bmfgld not in", values, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldBetween(String value1, String value2) {
            addCriterion("bmfgld between", value1, value2, "bmfgld");
            return (Criteria) this;
        }

        public Criteria andBmfgldNotBetween(String value1, String value2) {
            addCriterion("bmfgld not between", value1, value2, "bmfgld");
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