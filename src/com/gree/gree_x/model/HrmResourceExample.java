package com.gree.gree_x.model;

import java.util.ArrayList;
import java.util.List;

public class HrmResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HrmResourceExample() {
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

        public Criteria andLoginidIsNull() {
            addCriterion("loginid is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("loginid is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(String value) {
            addCriterion("loginid =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(String value) {
            addCriterion("loginid <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(String value) {
            addCriterion("loginid >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(String value) {
            addCriterion("loginid >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(String value) {
            addCriterion("loginid <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(String value) {
            addCriterion("loginid <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLike(String value) {
            addCriterion("loginid like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotLike(String value) {
            addCriterion("loginid not like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<String> values) {
            addCriterion("loginid in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<String> values) {
            addCriterion("loginid not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(String value1, String value2) {
            addCriterion("loginid between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(String value1, String value2) {
            addCriterion("loginid not between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("lastname is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("lastname is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("lastname =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("lastname <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("lastname >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("lastname >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("lastname <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("lastname <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("lastname like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("lastname not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("lastname in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("lastname not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("lastname between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("lastname not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(Integer value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(Integer value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(Integer value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(Integer value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(Integer value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(Integer value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<Integer> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<Integer> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(Integer value1, Integer value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(Integer value1, Integer value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageIsNull() {
            addCriterion("systemlanguage is null");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageIsNotNull() {
            addCriterion("systemlanguage is not null");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageEqualTo(Integer value) {
            addCriterion("systemlanguage =", value, "systemlanguage");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageNotEqualTo(Integer value) {
            addCriterion("systemlanguage <>", value, "systemlanguage");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageGreaterThan(Integer value) {
            addCriterion("systemlanguage >", value, "systemlanguage");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageGreaterThanOrEqualTo(Integer value) {
            addCriterion("systemlanguage >=", value, "systemlanguage");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageLessThan(Integer value) {
            addCriterion("systemlanguage <", value, "systemlanguage");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageLessThanOrEqualTo(Integer value) {
            addCriterion("systemlanguage <=", value, "systemlanguage");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageIn(List<Integer> values) {
            addCriterion("systemlanguage in", values, "systemlanguage");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageNotIn(List<Integer> values) {
            addCriterion("systemlanguage not in", values, "systemlanguage");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageBetween(Integer value1, Integer value2) {
            addCriterion("systemlanguage between", value1, value2, "systemlanguage");
            return (Criteria) this;
        }

        public Criteria andSystemlanguageNotBetween(Integer value1, Integer value2) {
            addCriterion("systemlanguage not between", value1, value2, "systemlanguage");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalstatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(String value) {
            addCriterion("maritalstatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(String value) {
            addCriterion("maritalstatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(String value) {
            addCriterion("maritalstatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("maritalstatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(String value) {
            addCriterion("maritalstatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("maritalstatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLike(String value) {
            addCriterion("maritalstatus like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotLike(String value) {
            addCriterion("maritalstatus not like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<String> values) {
            addCriterion("maritalstatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<String> values) {
            addCriterion("maritalstatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(String value1, String value2) {
            addCriterion("maritalstatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(String value1, String value2) {
            addCriterion("maritalstatus not between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobilecallIsNull() {
            addCriterion("mobilecall is null");
            return (Criteria) this;
        }

        public Criteria andMobilecallIsNotNull() {
            addCriterion("mobilecall is not null");
            return (Criteria) this;
        }

        public Criteria andMobilecallEqualTo(String value) {
            addCriterion("mobilecall =", value, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallNotEqualTo(String value) {
            addCriterion("mobilecall <>", value, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallGreaterThan(String value) {
            addCriterion("mobilecall >", value, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallGreaterThanOrEqualTo(String value) {
            addCriterion("mobilecall >=", value, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallLessThan(String value) {
            addCriterion("mobilecall <", value, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallLessThanOrEqualTo(String value) {
            addCriterion("mobilecall <=", value, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallLike(String value) {
            addCriterion("mobilecall like", value, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallNotLike(String value) {
            addCriterion("mobilecall not like", value, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallIn(List<String> values) {
            addCriterion("mobilecall in", values, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallNotIn(List<String> values) {
            addCriterion("mobilecall not in", values, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallBetween(String value1, String value2) {
            addCriterion("mobilecall between", value1, value2, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andMobilecallNotBetween(String value1, String value2) {
            addCriterion("mobilecall not between", value1, value2, "mobilecall");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNull() {
            addCriterion("locationid is null");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNotNull() {
            addCriterion("locationid is not null");
            return (Criteria) this;
        }

        public Criteria andLocationidEqualTo(Integer value) {
            addCriterion("locationid =", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotEqualTo(Integer value) {
            addCriterion("locationid <>", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThan(Integer value) {
            addCriterion("locationid >", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("locationid >=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThan(Integer value) {
            addCriterion("locationid <", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThanOrEqualTo(Integer value) {
            addCriterion("locationid <=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidIn(List<Integer> values) {
            addCriterion("locationid in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotIn(List<Integer> values) {
            addCriterion("locationid not in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidBetween(Integer value1, Integer value2) {
            addCriterion("locationid between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotBetween(Integer value1, Integer value2) {
            addCriterion("locationid not between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andWorkroomIsNull() {
            addCriterion("workroom is null");
            return (Criteria) this;
        }

        public Criteria andWorkroomIsNotNull() {
            addCriterion("workroom is not null");
            return (Criteria) this;
        }

        public Criteria andWorkroomEqualTo(String value) {
            addCriterion("workroom =", value, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomNotEqualTo(String value) {
            addCriterion("workroom <>", value, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomGreaterThan(String value) {
            addCriterion("workroom >", value, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomGreaterThanOrEqualTo(String value) {
            addCriterion("workroom >=", value, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomLessThan(String value) {
            addCriterion("workroom <", value, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomLessThanOrEqualTo(String value) {
            addCriterion("workroom <=", value, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomLike(String value) {
            addCriterion("workroom like", value, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomNotLike(String value) {
            addCriterion("workroom not like", value, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomIn(List<String> values) {
            addCriterion("workroom in", values, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomNotIn(List<String> values) {
            addCriterion("workroom not in", values, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomBetween(String value1, String value2) {
            addCriterion("workroom between", value1, value2, "workroom");
            return (Criteria) this;
        }

        public Criteria andWorkroomNotBetween(String value1, String value2) {
            addCriterion("workroom not between", value1, value2, "workroom");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("homeaddress is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("homeaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("homeaddress =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("homeaddress <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("homeaddress >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("homeaddress >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("homeaddress <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("homeaddress <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("homeaddress like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("homeaddress not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("homeaddress in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("homeaddress not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("homeaddress between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("homeaddress not between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andResourcetypeIsNull() {
            addCriterion("resourcetype is null");
            return (Criteria) this;
        }

        public Criteria andResourcetypeIsNotNull() {
            addCriterion("resourcetype is not null");
            return (Criteria) this;
        }

        public Criteria andResourcetypeEqualTo(String value) {
            addCriterion("resourcetype =", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotEqualTo(String value) {
            addCriterion("resourcetype <>", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeGreaterThan(String value) {
            addCriterion("resourcetype >", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("resourcetype >=", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeLessThan(String value) {
            addCriterion("resourcetype <", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeLessThanOrEqualTo(String value) {
            addCriterion("resourcetype <=", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeLike(String value) {
            addCriterion("resourcetype like", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotLike(String value) {
            addCriterion("resourcetype not like", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeIn(List<String> values) {
            addCriterion("resourcetype in", values, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotIn(List<String> values) {
            addCriterion("resourcetype not in", values, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeBetween(String value1, String value2) {
            addCriterion("resourcetype between", value1, value2, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotBetween(String value1, String value2) {
            addCriterion("resourcetype not between", value1, value2, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("startdate like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("startdate not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("enddate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("enddate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNull() {
            addCriterion("jobtitle is null");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNotNull() {
            addCriterion("jobtitle is not null");
            return (Criteria) this;
        }

        public Criteria andJobtitleEqualTo(Integer value) {
            addCriterion("jobtitle =", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotEqualTo(Integer value) {
            addCriterion("jobtitle <>", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThan(Integer value) {
            addCriterion("jobtitle >", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobtitle >=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThan(Integer value) {
            addCriterion("jobtitle <", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThanOrEqualTo(Integer value) {
            addCriterion("jobtitle <=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleIn(List<Integer> values) {
            addCriterion("jobtitle in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotIn(List<Integer> values) {
            addCriterion("jobtitle not in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleBetween(Integer value1, Integer value2) {
            addCriterion("jobtitle between", value1, value2, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotBetween(Integer value1, Integer value2) {
            addCriterion("jobtitle not between", value1, value2, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescIsNull() {
            addCriterion("jobactivitydesc is null");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescIsNotNull() {
            addCriterion("jobactivitydesc is not null");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescEqualTo(String value) {
            addCriterion("jobactivitydesc =", value, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescNotEqualTo(String value) {
            addCriterion("jobactivitydesc <>", value, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescGreaterThan(String value) {
            addCriterion("jobactivitydesc >", value, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescGreaterThanOrEqualTo(String value) {
            addCriterion("jobactivitydesc >=", value, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescLessThan(String value) {
            addCriterion("jobactivitydesc <", value, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescLessThanOrEqualTo(String value) {
            addCriterion("jobactivitydesc <=", value, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescLike(String value) {
            addCriterion("jobactivitydesc like", value, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescNotLike(String value) {
            addCriterion("jobactivitydesc not like", value, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescIn(List<String> values) {
            addCriterion("jobactivitydesc in", values, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescNotIn(List<String> values) {
            addCriterion("jobactivitydesc not in", values, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescBetween(String value1, String value2) {
            addCriterion("jobactivitydesc between", value1, value2, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJobactivitydescNotBetween(String value1, String value2) {
            addCriterion("jobactivitydesc not between", value1, value2, "jobactivitydesc");
            return (Criteria) this;
        }

        public Criteria andJoblevelIsNull() {
            addCriterion("joblevel is null");
            return (Criteria) this;
        }

        public Criteria andJoblevelIsNotNull() {
            addCriterion("joblevel is not null");
            return (Criteria) this;
        }

        public Criteria andJoblevelEqualTo(Byte value) {
            addCriterion("joblevel =", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelNotEqualTo(Byte value) {
            addCriterion("joblevel <>", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelGreaterThan(Byte value) {
            addCriterion("joblevel >", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("joblevel >=", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelLessThan(Byte value) {
            addCriterion("joblevel <", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelLessThanOrEqualTo(Byte value) {
            addCriterion("joblevel <=", value, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelIn(List<Byte> values) {
            addCriterion("joblevel in", values, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelNotIn(List<Byte> values) {
            addCriterion("joblevel not in", values, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelBetween(Byte value1, Byte value2) {
            addCriterion("joblevel between", value1, value2, "joblevel");
            return (Criteria) this;
        }

        public Criteria andJoblevelNotBetween(Byte value1, Byte value2) {
            addCriterion("joblevel not between", value1, value2, "joblevel");
            return (Criteria) this;
        }

        public Criteria andSeclevelIsNull() {
            addCriterion("seclevel is null");
            return (Criteria) this;
        }

        public Criteria andSeclevelIsNotNull() {
            addCriterion("seclevel is not null");
            return (Criteria) this;
        }

        public Criteria andSeclevelEqualTo(Byte value) {
            addCriterion("seclevel =", value, "seclevel");
            return (Criteria) this;
        }

        public Criteria andSeclevelNotEqualTo(Byte value) {
            addCriterion("seclevel <>", value, "seclevel");
            return (Criteria) this;
        }

        public Criteria andSeclevelGreaterThan(Byte value) {
            addCriterion("seclevel >", value, "seclevel");
            return (Criteria) this;
        }

        public Criteria andSeclevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("seclevel >=", value, "seclevel");
            return (Criteria) this;
        }

        public Criteria andSeclevelLessThan(Byte value) {
            addCriterion("seclevel <", value, "seclevel");
            return (Criteria) this;
        }

        public Criteria andSeclevelLessThanOrEqualTo(Byte value) {
            addCriterion("seclevel <=", value, "seclevel");
            return (Criteria) this;
        }

        public Criteria andSeclevelIn(List<Byte> values) {
            addCriterion("seclevel in", values, "seclevel");
            return (Criteria) this;
        }

        public Criteria andSeclevelNotIn(List<Byte> values) {
            addCriterion("seclevel not in", values, "seclevel");
            return (Criteria) this;
        }

        public Criteria andSeclevelBetween(Byte value1, Byte value2) {
            addCriterion("seclevel between", value1, value2, "seclevel");
            return (Criteria) this;
        }

        public Criteria andSeclevelNotBetween(Byte value1, Byte value2) {
            addCriterion("seclevel not between", value1, value2, "seclevel");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentid is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentid is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentid =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentid <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentid >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentid >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentid <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentid <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentid in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentid not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentid between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentid not between", value1, value2, "departmentid");
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

        public Criteria andCostcenteridIsNull() {
            addCriterion("costcenterid is null");
            return (Criteria) this;
        }

        public Criteria andCostcenteridIsNotNull() {
            addCriterion("costcenterid is not null");
            return (Criteria) this;
        }

        public Criteria andCostcenteridEqualTo(Integer value) {
            addCriterion("costcenterid =", value, "costcenterid");
            return (Criteria) this;
        }

        public Criteria andCostcenteridNotEqualTo(Integer value) {
            addCriterion("costcenterid <>", value, "costcenterid");
            return (Criteria) this;
        }

        public Criteria andCostcenteridGreaterThan(Integer value) {
            addCriterion("costcenterid >", value, "costcenterid");
            return (Criteria) this;
        }

        public Criteria andCostcenteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("costcenterid >=", value, "costcenterid");
            return (Criteria) this;
        }

        public Criteria andCostcenteridLessThan(Integer value) {
            addCriterion("costcenterid <", value, "costcenterid");
            return (Criteria) this;
        }

        public Criteria andCostcenteridLessThanOrEqualTo(Integer value) {
            addCriterion("costcenterid <=", value, "costcenterid");
            return (Criteria) this;
        }

        public Criteria andCostcenteridIn(List<Integer> values) {
            addCriterion("costcenterid in", values, "costcenterid");
            return (Criteria) this;
        }

        public Criteria andCostcenteridNotIn(List<Integer> values) {
            addCriterion("costcenterid not in", values, "costcenterid");
            return (Criteria) this;
        }

        public Criteria andCostcenteridBetween(Integer value1, Integer value2) {
            addCriterion("costcenterid between", value1, value2, "costcenterid");
            return (Criteria) this;
        }

        public Criteria andCostcenteridNotBetween(Integer value1, Integer value2) {
            addCriterion("costcenterid not between", value1, value2, "costcenterid");
            return (Criteria) this;
        }

        public Criteria andManageridIsNull() {
            addCriterion("managerid is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("managerid is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(Integer value) {
            addCriterion("managerid =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(Integer value) {
            addCriterion("managerid <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(Integer value) {
            addCriterion("managerid >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("managerid >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(Integer value) {
            addCriterion("managerid <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(Integer value) {
            addCriterion("managerid <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<Integer> values) {
            addCriterion("managerid in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<Integer> values) {
            addCriterion("managerid not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(Integer value1, Integer value2) {
            addCriterion("managerid between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(Integer value1, Integer value2) {
            addCriterion("managerid not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andAssistantidIsNull() {
            addCriterion("assistantid is null");
            return (Criteria) this;
        }

        public Criteria andAssistantidIsNotNull() {
            addCriterion("assistantid is not null");
            return (Criteria) this;
        }

        public Criteria andAssistantidEqualTo(Integer value) {
            addCriterion("assistantid =", value, "assistantid");
            return (Criteria) this;
        }

        public Criteria andAssistantidNotEqualTo(Integer value) {
            addCriterion("assistantid <>", value, "assistantid");
            return (Criteria) this;
        }

        public Criteria andAssistantidGreaterThan(Integer value) {
            addCriterion("assistantid >", value, "assistantid");
            return (Criteria) this;
        }

        public Criteria andAssistantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("assistantid >=", value, "assistantid");
            return (Criteria) this;
        }

        public Criteria andAssistantidLessThan(Integer value) {
            addCriterion("assistantid <", value, "assistantid");
            return (Criteria) this;
        }

        public Criteria andAssistantidLessThanOrEqualTo(Integer value) {
            addCriterion("assistantid <=", value, "assistantid");
            return (Criteria) this;
        }

        public Criteria andAssistantidIn(List<Integer> values) {
            addCriterion("assistantid in", values, "assistantid");
            return (Criteria) this;
        }

        public Criteria andAssistantidNotIn(List<Integer> values) {
            addCriterion("assistantid not in", values, "assistantid");
            return (Criteria) this;
        }

        public Criteria andAssistantidBetween(Integer value1, Integer value2) {
            addCriterion("assistantid between", value1, value2, "assistantid");
            return (Criteria) this;
        }

        public Criteria andAssistantidNotBetween(Integer value1, Integer value2) {
            addCriterion("assistantid not between", value1, value2, "assistantid");
            return (Criteria) this;
        }

        public Criteria andBankid1IsNull() {
            addCriterion("bankid1 is null");
            return (Criteria) this;
        }

        public Criteria andBankid1IsNotNull() {
            addCriterion("bankid1 is not null");
            return (Criteria) this;
        }

        public Criteria andBankid1EqualTo(Integer value) {
            addCriterion("bankid1 =", value, "bankid1");
            return (Criteria) this;
        }

        public Criteria andBankid1NotEqualTo(Integer value) {
            addCriterion("bankid1 <>", value, "bankid1");
            return (Criteria) this;
        }

        public Criteria andBankid1GreaterThan(Integer value) {
            addCriterion("bankid1 >", value, "bankid1");
            return (Criteria) this;
        }

        public Criteria andBankid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("bankid1 >=", value, "bankid1");
            return (Criteria) this;
        }

        public Criteria andBankid1LessThan(Integer value) {
            addCriterion("bankid1 <", value, "bankid1");
            return (Criteria) this;
        }

        public Criteria andBankid1LessThanOrEqualTo(Integer value) {
            addCriterion("bankid1 <=", value, "bankid1");
            return (Criteria) this;
        }

        public Criteria andBankid1In(List<Integer> values) {
            addCriterion("bankid1 in", values, "bankid1");
            return (Criteria) this;
        }

        public Criteria andBankid1NotIn(List<Integer> values) {
            addCriterion("bankid1 not in", values, "bankid1");
            return (Criteria) this;
        }

        public Criteria andBankid1Between(Integer value1, Integer value2) {
            addCriterion("bankid1 between", value1, value2, "bankid1");
            return (Criteria) this;
        }

        public Criteria andBankid1NotBetween(Integer value1, Integer value2) {
            addCriterion("bankid1 not between", value1, value2, "bankid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1IsNull() {
            addCriterion("accountid1 is null");
            return (Criteria) this;
        }

        public Criteria andAccountid1IsNotNull() {
            addCriterion("accountid1 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountid1EqualTo(String value) {
            addCriterion("accountid1 =", value, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1NotEqualTo(String value) {
            addCriterion("accountid1 <>", value, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1GreaterThan(String value) {
            addCriterion("accountid1 >", value, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1GreaterThanOrEqualTo(String value) {
            addCriterion("accountid1 >=", value, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1LessThan(String value) {
            addCriterion("accountid1 <", value, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1LessThanOrEqualTo(String value) {
            addCriterion("accountid1 <=", value, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1Like(String value) {
            addCriterion("accountid1 like", value, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1NotLike(String value) {
            addCriterion("accountid1 not like", value, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1In(List<String> values) {
            addCriterion("accountid1 in", values, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1NotIn(List<String> values) {
            addCriterion("accountid1 not in", values, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1Between(String value1, String value2) {
            addCriterion("accountid1 between", value1, value2, "accountid1");
            return (Criteria) this;
        }

        public Criteria andAccountid1NotBetween(String value1, String value2) {
            addCriterion("accountid1 not between", value1, value2, "accountid1");
            return (Criteria) this;
        }

        public Criteria andResourceimageidIsNull() {
            addCriterion("resourceimageid is null");
            return (Criteria) this;
        }

        public Criteria andResourceimageidIsNotNull() {
            addCriterion("resourceimageid is not null");
            return (Criteria) this;
        }

        public Criteria andResourceimageidEqualTo(Integer value) {
            addCriterion("resourceimageid =", value, "resourceimageid");
            return (Criteria) this;
        }

        public Criteria andResourceimageidNotEqualTo(Integer value) {
            addCriterion("resourceimageid <>", value, "resourceimageid");
            return (Criteria) this;
        }

        public Criteria andResourceimageidGreaterThan(Integer value) {
            addCriterion("resourceimageid >", value, "resourceimageid");
            return (Criteria) this;
        }

        public Criteria andResourceimageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resourceimageid >=", value, "resourceimageid");
            return (Criteria) this;
        }

        public Criteria andResourceimageidLessThan(Integer value) {
            addCriterion("resourceimageid <", value, "resourceimageid");
            return (Criteria) this;
        }

        public Criteria andResourceimageidLessThanOrEqualTo(Integer value) {
            addCriterion("resourceimageid <=", value, "resourceimageid");
            return (Criteria) this;
        }

        public Criteria andResourceimageidIn(List<Integer> values) {
            addCriterion("resourceimageid in", values, "resourceimageid");
            return (Criteria) this;
        }

        public Criteria andResourceimageidNotIn(List<Integer> values) {
            addCriterion("resourceimageid not in", values, "resourceimageid");
            return (Criteria) this;
        }

        public Criteria andResourceimageidBetween(Integer value1, Integer value2) {
            addCriterion("resourceimageid between", value1, value2, "resourceimageid");
            return (Criteria) this;
        }

        public Criteria andResourceimageidNotBetween(Integer value1, Integer value2) {
            addCriterion("resourceimageid not between", value1, value2, "resourceimageid");
            return (Criteria) this;
        }

        public Criteria andCreateridIsNull() {
            addCriterion("createrid is null");
            return (Criteria) this;
        }

        public Criteria andCreateridIsNotNull() {
            addCriterion("createrid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateridEqualTo(Integer value) {
            addCriterion("createrid =", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotEqualTo(Integer value) {
            addCriterion("createrid <>", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridGreaterThan(Integer value) {
            addCriterion("createrid >", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridGreaterThanOrEqualTo(Integer value) {
            addCriterion("createrid >=", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridLessThan(Integer value) {
            addCriterion("createrid <", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridLessThanOrEqualTo(Integer value) {
            addCriterion("createrid <=", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridIn(List<Integer> values) {
            addCriterion("createrid in", values, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotIn(List<Integer> values) {
            addCriterion("createrid not in", values, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridBetween(Integer value1, Integer value2) {
            addCriterion("createrid between", value1, value2, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotBetween(Integer value1, Integer value2) {
            addCriterion("createrid not between", value1, value2, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(String value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(String value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(String value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(String value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(String value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLike(String value) {
            addCriterion("createdate like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotLike(String value) {
            addCriterion("createdate not like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<String> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<String> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(String value1, String value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(String value1, String value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andLastmodidIsNull() {
            addCriterion("lastmodid is null");
            return (Criteria) this;
        }

        public Criteria andLastmodidIsNotNull() {
            addCriterion("lastmodid is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodidEqualTo(Integer value) {
            addCriterion("lastmodid =", value, "lastmodid");
            return (Criteria) this;
        }

        public Criteria andLastmodidNotEqualTo(Integer value) {
            addCriterion("lastmodid <>", value, "lastmodid");
            return (Criteria) this;
        }

        public Criteria andLastmodidGreaterThan(Integer value) {
            addCriterion("lastmodid >", value, "lastmodid");
            return (Criteria) this;
        }

        public Criteria andLastmodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastmodid >=", value, "lastmodid");
            return (Criteria) this;
        }

        public Criteria andLastmodidLessThan(Integer value) {
            addCriterion("lastmodid <", value, "lastmodid");
            return (Criteria) this;
        }

        public Criteria andLastmodidLessThanOrEqualTo(Integer value) {
            addCriterion("lastmodid <=", value, "lastmodid");
            return (Criteria) this;
        }

        public Criteria andLastmodidIn(List<Integer> values) {
            addCriterion("lastmodid in", values, "lastmodid");
            return (Criteria) this;
        }

        public Criteria andLastmodidNotIn(List<Integer> values) {
            addCriterion("lastmodid not in", values, "lastmodid");
            return (Criteria) this;
        }

        public Criteria andLastmodidBetween(Integer value1, Integer value2) {
            addCriterion("lastmodid between", value1, value2, "lastmodid");
            return (Criteria) this;
        }

        public Criteria andLastmodidNotBetween(Integer value1, Integer value2) {
            addCriterion("lastmodid not between", value1, value2, "lastmodid");
            return (Criteria) this;
        }

        public Criteria andLastmoddateIsNull() {
            addCriterion("lastmoddate is null");
            return (Criteria) this;
        }

        public Criteria andLastmoddateIsNotNull() {
            addCriterion("lastmoddate is not null");
            return (Criteria) this;
        }

        public Criteria andLastmoddateEqualTo(String value) {
            addCriterion("lastmoddate =", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateNotEqualTo(String value) {
            addCriterion("lastmoddate <>", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateGreaterThan(String value) {
            addCriterion("lastmoddate >", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateGreaterThanOrEqualTo(String value) {
            addCriterion("lastmoddate >=", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateLessThan(String value) {
            addCriterion("lastmoddate <", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateLessThanOrEqualTo(String value) {
            addCriterion("lastmoddate <=", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateLike(String value) {
            addCriterion("lastmoddate like", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateNotLike(String value) {
            addCriterion("lastmoddate not like", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateIn(List<String> values) {
            addCriterion("lastmoddate in", values, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateNotIn(List<String> values) {
            addCriterion("lastmoddate not in", values, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateBetween(String value1, String value2) {
            addCriterion("lastmoddate between", value1, value2, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateNotBetween(String value1, String value2) {
            addCriterion("lastmoddate not between", value1, value2, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNull() {
            addCriterion("lastlogindate is null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNotNull() {
            addCriterion("lastlogindate is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateEqualTo(String value) {
            addCriterion("lastlogindate =", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotEqualTo(String value) {
            addCriterion("lastlogindate <>", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThan(String value) {
            addCriterion("lastlogindate >", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThanOrEqualTo(String value) {
            addCriterion("lastlogindate >=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThan(String value) {
            addCriterion("lastlogindate <", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThanOrEqualTo(String value) {
            addCriterion("lastlogindate <=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLike(String value) {
            addCriterion("lastlogindate like", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotLike(String value) {
            addCriterion("lastlogindate not like", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIn(List<String> values) {
            addCriterion("lastlogindate in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotIn(List<String> values) {
            addCriterion("lastlogindate not in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateBetween(String value1, String value2) {
            addCriterion("lastlogindate between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotBetween(String value1, String value2) {
            addCriterion("lastlogindate not between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andDatefield1IsNull() {
            addCriterion("datefield1 is null");
            return (Criteria) this;
        }

        public Criteria andDatefield1IsNotNull() {
            addCriterion("datefield1 is not null");
            return (Criteria) this;
        }

        public Criteria andDatefield1EqualTo(String value) {
            addCriterion("datefield1 =", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1NotEqualTo(String value) {
            addCriterion("datefield1 <>", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1GreaterThan(String value) {
            addCriterion("datefield1 >", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1GreaterThanOrEqualTo(String value) {
            addCriterion("datefield1 >=", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1LessThan(String value) {
            addCriterion("datefield1 <", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1LessThanOrEqualTo(String value) {
            addCriterion("datefield1 <=", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1Like(String value) {
            addCriterion("datefield1 like", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1NotLike(String value) {
            addCriterion("datefield1 not like", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1In(List<String> values) {
            addCriterion("datefield1 in", values, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1NotIn(List<String> values) {
            addCriterion("datefield1 not in", values, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1Between(String value1, String value2) {
            addCriterion("datefield1 between", value1, value2, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1NotBetween(String value1, String value2) {
            addCriterion("datefield1 not between", value1, value2, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield2IsNull() {
            addCriterion("datefield2 is null");
            return (Criteria) this;
        }

        public Criteria andDatefield2IsNotNull() {
            addCriterion("datefield2 is not null");
            return (Criteria) this;
        }

        public Criteria andDatefield2EqualTo(String value) {
            addCriterion("datefield2 =", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2NotEqualTo(String value) {
            addCriterion("datefield2 <>", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2GreaterThan(String value) {
            addCriterion("datefield2 >", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2GreaterThanOrEqualTo(String value) {
            addCriterion("datefield2 >=", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2LessThan(String value) {
            addCriterion("datefield2 <", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2LessThanOrEqualTo(String value) {
            addCriterion("datefield2 <=", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2Like(String value) {
            addCriterion("datefield2 like", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2NotLike(String value) {
            addCriterion("datefield2 not like", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2In(List<String> values) {
            addCriterion("datefield2 in", values, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2NotIn(List<String> values) {
            addCriterion("datefield2 not in", values, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2Between(String value1, String value2) {
            addCriterion("datefield2 between", value1, value2, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2NotBetween(String value1, String value2) {
            addCriterion("datefield2 not between", value1, value2, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield3IsNull() {
            addCriterion("datefield3 is null");
            return (Criteria) this;
        }

        public Criteria andDatefield3IsNotNull() {
            addCriterion("datefield3 is not null");
            return (Criteria) this;
        }

        public Criteria andDatefield3EqualTo(String value) {
            addCriterion("datefield3 =", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3NotEqualTo(String value) {
            addCriterion("datefield3 <>", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3GreaterThan(String value) {
            addCriterion("datefield3 >", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3GreaterThanOrEqualTo(String value) {
            addCriterion("datefield3 >=", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3LessThan(String value) {
            addCriterion("datefield3 <", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3LessThanOrEqualTo(String value) {
            addCriterion("datefield3 <=", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3Like(String value) {
            addCriterion("datefield3 like", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3NotLike(String value) {
            addCriterion("datefield3 not like", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3In(List<String> values) {
            addCriterion("datefield3 in", values, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3NotIn(List<String> values) {
            addCriterion("datefield3 not in", values, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3Between(String value1, String value2) {
            addCriterion("datefield3 between", value1, value2, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3NotBetween(String value1, String value2) {
            addCriterion("datefield3 not between", value1, value2, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield4IsNull() {
            addCriterion("datefield4 is null");
            return (Criteria) this;
        }

        public Criteria andDatefield4IsNotNull() {
            addCriterion("datefield4 is not null");
            return (Criteria) this;
        }

        public Criteria andDatefield4EqualTo(String value) {
            addCriterion("datefield4 =", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4NotEqualTo(String value) {
            addCriterion("datefield4 <>", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4GreaterThan(String value) {
            addCriterion("datefield4 >", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4GreaterThanOrEqualTo(String value) {
            addCriterion("datefield4 >=", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4LessThan(String value) {
            addCriterion("datefield4 <", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4LessThanOrEqualTo(String value) {
            addCriterion("datefield4 <=", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4Like(String value) {
            addCriterion("datefield4 like", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4NotLike(String value) {
            addCriterion("datefield4 not like", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4In(List<String> values) {
            addCriterion("datefield4 in", values, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4NotIn(List<String> values) {
            addCriterion("datefield4 not in", values, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4Between(String value1, String value2) {
            addCriterion("datefield4 between", value1, value2, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4NotBetween(String value1, String value2) {
            addCriterion("datefield4 not between", value1, value2, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield5IsNull() {
            addCriterion("datefield5 is null");
            return (Criteria) this;
        }

        public Criteria andDatefield5IsNotNull() {
            addCriterion("datefield5 is not null");
            return (Criteria) this;
        }

        public Criteria andDatefield5EqualTo(String value) {
            addCriterion("datefield5 =", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5NotEqualTo(String value) {
            addCriterion("datefield5 <>", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5GreaterThan(String value) {
            addCriterion("datefield5 >", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5GreaterThanOrEqualTo(String value) {
            addCriterion("datefield5 >=", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5LessThan(String value) {
            addCriterion("datefield5 <", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5LessThanOrEqualTo(String value) {
            addCriterion("datefield5 <=", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5Like(String value) {
            addCriterion("datefield5 like", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5NotLike(String value) {
            addCriterion("datefield5 not like", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5In(List<String> values) {
            addCriterion("datefield5 in", values, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5NotIn(List<String> values) {
            addCriterion("datefield5 not in", values, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5Between(String value1, String value2) {
            addCriterion("datefield5 between", value1, value2, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5NotBetween(String value1, String value2) {
            addCriterion("datefield5 not between", value1, value2, "datefield5");
            return (Criteria) this;
        }

        public Criteria andNumberfield1IsNull() {
            addCriterion("numberfield1 is null");
            return (Criteria) this;
        }

        public Criteria andNumberfield1IsNotNull() {
            addCriterion("numberfield1 is not null");
            return (Criteria) this;
        }

        public Criteria andNumberfield1EqualTo(Double value) {
            addCriterion("numberfield1 =", value, "numberfield1");
            return (Criteria) this;
        }

        public Criteria andNumberfield1NotEqualTo(Double value) {
            addCriterion("numberfield1 <>", value, "numberfield1");
            return (Criteria) this;
        }

        public Criteria andNumberfield1GreaterThan(Double value) {
            addCriterion("numberfield1 >", value, "numberfield1");
            return (Criteria) this;
        }

        public Criteria andNumberfield1GreaterThanOrEqualTo(Double value) {
            addCriterion("numberfield1 >=", value, "numberfield1");
            return (Criteria) this;
        }

        public Criteria andNumberfield1LessThan(Double value) {
            addCriterion("numberfield1 <", value, "numberfield1");
            return (Criteria) this;
        }

        public Criteria andNumberfield1LessThanOrEqualTo(Double value) {
            addCriterion("numberfield1 <=", value, "numberfield1");
            return (Criteria) this;
        }

        public Criteria andNumberfield1In(List<Double> values) {
            addCriterion("numberfield1 in", values, "numberfield1");
            return (Criteria) this;
        }

        public Criteria andNumberfield1NotIn(List<Double> values) {
            addCriterion("numberfield1 not in", values, "numberfield1");
            return (Criteria) this;
        }

        public Criteria andNumberfield1Between(Double value1, Double value2) {
            addCriterion("numberfield1 between", value1, value2, "numberfield1");
            return (Criteria) this;
        }

        public Criteria andNumberfield1NotBetween(Double value1, Double value2) {
            addCriterion("numberfield1 not between", value1, value2, "numberfield1");
            return (Criteria) this;
        }

        public Criteria andNumberfield2IsNull() {
            addCriterion("numberfield2 is null");
            return (Criteria) this;
        }

        public Criteria andNumberfield2IsNotNull() {
            addCriterion("numberfield2 is not null");
            return (Criteria) this;
        }

        public Criteria andNumberfield2EqualTo(Double value) {
            addCriterion("numberfield2 =", value, "numberfield2");
            return (Criteria) this;
        }

        public Criteria andNumberfield2NotEqualTo(Double value) {
            addCriterion("numberfield2 <>", value, "numberfield2");
            return (Criteria) this;
        }

        public Criteria andNumberfield2GreaterThan(Double value) {
            addCriterion("numberfield2 >", value, "numberfield2");
            return (Criteria) this;
        }

        public Criteria andNumberfield2GreaterThanOrEqualTo(Double value) {
            addCriterion("numberfield2 >=", value, "numberfield2");
            return (Criteria) this;
        }

        public Criteria andNumberfield2LessThan(Double value) {
            addCriterion("numberfield2 <", value, "numberfield2");
            return (Criteria) this;
        }

        public Criteria andNumberfield2LessThanOrEqualTo(Double value) {
            addCriterion("numberfield2 <=", value, "numberfield2");
            return (Criteria) this;
        }

        public Criteria andNumberfield2In(List<Double> values) {
            addCriterion("numberfield2 in", values, "numberfield2");
            return (Criteria) this;
        }

        public Criteria andNumberfield2NotIn(List<Double> values) {
            addCriterion("numberfield2 not in", values, "numberfield2");
            return (Criteria) this;
        }

        public Criteria andNumberfield2Between(Double value1, Double value2) {
            addCriterion("numberfield2 between", value1, value2, "numberfield2");
            return (Criteria) this;
        }

        public Criteria andNumberfield2NotBetween(Double value1, Double value2) {
            addCriterion("numberfield2 not between", value1, value2, "numberfield2");
            return (Criteria) this;
        }

        public Criteria andNumberfield3IsNull() {
            addCriterion("numberfield3 is null");
            return (Criteria) this;
        }

        public Criteria andNumberfield3IsNotNull() {
            addCriterion("numberfield3 is not null");
            return (Criteria) this;
        }

        public Criteria andNumberfield3EqualTo(Double value) {
            addCriterion("numberfield3 =", value, "numberfield3");
            return (Criteria) this;
        }

        public Criteria andNumberfield3NotEqualTo(Double value) {
            addCriterion("numberfield3 <>", value, "numberfield3");
            return (Criteria) this;
        }

        public Criteria andNumberfield3GreaterThan(Double value) {
            addCriterion("numberfield3 >", value, "numberfield3");
            return (Criteria) this;
        }

        public Criteria andNumberfield3GreaterThanOrEqualTo(Double value) {
            addCriterion("numberfield3 >=", value, "numberfield3");
            return (Criteria) this;
        }

        public Criteria andNumberfield3LessThan(Double value) {
            addCriterion("numberfield3 <", value, "numberfield3");
            return (Criteria) this;
        }

        public Criteria andNumberfield3LessThanOrEqualTo(Double value) {
            addCriterion("numberfield3 <=", value, "numberfield3");
            return (Criteria) this;
        }

        public Criteria andNumberfield3In(List<Double> values) {
            addCriterion("numberfield3 in", values, "numberfield3");
            return (Criteria) this;
        }

        public Criteria andNumberfield3NotIn(List<Double> values) {
            addCriterion("numberfield3 not in", values, "numberfield3");
            return (Criteria) this;
        }

        public Criteria andNumberfield3Between(Double value1, Double value2) {
            addCriterion("numberfield3 between", value1, value2, "numberfield3");
            return (Criteria) this;
        }

        public Criteria andNumberfield3NotBetween(Double value1, Double value2) {
            addCriterion("numberfield3 not between", value1, value2, "numberfield3");
            return (Criteria) this;
        }

        public Criteria andNumberfield4IsNull() {
            addCriterion("numberfield4 is null");
            return (Criteria) this;
        }

        public Criteria andNumberfield4IsNotNull() {
            addCriterion("numberfield4 is not null");
            return (Criteria) this;
        }

        public Criteria andNumberfield4EqualTo(Double value) {
            addCriterion("numberfield4 =", value, "numberfield4");
            return (Criteria) this;
        }

        public Criteria andNumberfield4NotEqualTo(Double value) {
            addCriterion("numberfield4 <>", value, "numberfield4");
            return (Criteria) this;
        }

        public Criteria andNumberfield4GreaterThan(Double value) {
            addCriterion("numberfield4 >", value, "numberfield4");
            return (Criteria) this;
        }

        public Criteria andNumberfield4GreaterThanOrEqualTo(Double value) {
            addCriterion("numberfield4 >=", value, "numberfield4");
            return (Criteria) this;
        }

        public Criteria andNumberfield4LessThan(Double value) {
            addCriterion("numberfield4 <", value, "numberfield4");
            return (Criteria) this;
        }

        public Criteria andNumberfield4LessThanOrEqualTo(Double value) {
            addCriterion("numberfield4 <=", value, "numberfield4");
            return (Criteria) this;
        }

        public Criteria andNumberfield4In(List<Double> values) {
            addCriterion("numberfield4 in", values, "numberfield4");
            return (Criteria) this;
        }

        public Criteria andNumberfield4NotIn(List<Double> values) {
            addCriterion("numberfield4 not in", values, "numberfield4");
            return (Criteria) this;
        }

        public Criteria andNumberfield4Between(Double value1, Double value2) {
            addCriterion("numberfield4 between", value1, value2, "numberfield4");
            return (Criteria) this;
        }

        public Criteria andNumberfield4NotBetween(Double value1, Double value2) {
            addCriterion("numberfield4 not between", value1, value2, "numberfield4");
            return (Criteria) this;
        }

        public Criteria andNumberfield5IsNull() {
            addCriterion("numberfield5 is null");
            return (Criteria) this;
        }

        public Criteria andNumberfield5IsNotNull() {
            addCriterion("numberfield5 is not null");
            return (Criteria) this;
        }

        public Criteria andNumberfield5EqualTo(Double value) {
            addCriterion("numberfield5 =", value, "numberfield5");
            return (Criteria) this;
        }

        public Criteria andNumberfield5NotEqualTo(Double value) {
            addCriterion("numberfield5 <>", value, "numberfield5");
            return (Criteria) this;
        }

        public Criteria andNumberfield5GreaterThan(Double value) {
            addCriterion("numberfield5 >", value, "numberfield5");
            return (Criteria) this;
        }

        public Criteria andNumberfield5GreaterThanOrEqualTo(Double value) {
            addCriterion("numberfield5 >=", value, "numberfield5");
            return (Criteria) this;
        }

        public Criteria andNumberfield5LessThan(Double value) {
            addCriterion("numberfield5 <", value, "numberfield5");
            return (Criteria) this;
        }

        public Criteria andNumberfield5LessThanOrEqualTo(Double value) {
            addCriterion("numberfield5 <=", value, "numberfield5");
            return (Criteria) this;
        }

        public Criteria andNumberfield5In(List<Double> values) {
            addCriterion("numberfield5 in", values, "numberfield5");
            return (Criteria) this;
        }

        public Criteria andNumberfield5NotIn(List<Double> values) {
            addCriterion("numberfield5 not in", values, "numberfield5");
            return (Criteria) this;
        }

        public Criteria andNumberfield5Between(Double value1, Double value2) {
            addCriterion("numberfield5 between", value1, value2, "numberfield5");
            return (Criteria) this;
        }

        public Criteria andNumberfield5NotBetween(Double value1, Double value2) {
            addCriterion("numberfield5 not between", value1, value2, "numberfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield1IsNull() {
            addCriterion("textfield1 is null");
            return (Criteria) this;
        }

        public Criteria andTextfield1IsNotNull() {
            addCriterion("textfield1 is not null");
            return (Criteria) this;
        }

        public Criteria andTextfield1EqualTo(String value) {
            addCriterion("textfield1 =", value, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1NotEqualTo(String value) {
            addCriterion("textfield1 <>", value, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1GreaterThan(String value) {
            addCriterion("textfield1 >", value, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1GreaterThanOrEqualTo(String value) {
            addCriterion("textfield1 >=", value, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1LessThan(String value) {
            addCriterion("textfield1 <", value, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1LessThanOrEqualTo(String value) {
            addCriterion("textfield1 <=", value, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1Like(String value) {
            addCriterion("textfield1 like", value, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1NotLike(String value) {
            addCriterion("textfield1 not like", value, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1In(List<String> values) {
            addCriterion("textfield1 in", values, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1NotIn(List<String> values) {
            addCriterion("textfield1 not in", values, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1Between(String value1, String value2) {
            addCriterion("textfield1 between", value1, value2, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield1NotBetween(String value1, String value2) {
            addCriterion("textfield1 not between", value1, value2, "textfield1");
            return (Criteria) this;
        }

        public Criteria andTextfield2IsNull() {
            addCriterion("textfield2 is null");
            return (Criteria) this;
        }

        public Criteria andTextfield2IsNotNull() {
            addCriterion("textfield2 is not null");
            return (Criteria) this;
        }

        public Criteria andTextfield2EqualTo(String value) {
            addCriterion("textfield2 =", value, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2NotEqualTo(String value) {
            addCriterion("textfield2 <>", value, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2GreaterThan(String value) {
            addCriterion("textfield2 >", value, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2GreaterThanOrEqualTo(String value) {
            addCriterion("textfield2 >=", value, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2LessThan(String value) {
            addCriterion("textfield2 <", value, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2LessThanOrEqualTo(String value) {
            addCriterion("textfield2 <=", value, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2Like(String value) {
            addCriterion("textfield2 like", value, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2NotLike(String value) {
            addCriterion("textfield2 not like", value, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2In(List<String> values) {
            addCriterion("textfield2 in", values, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2NotIn(List<String> values) {
            addCriterion("textfield2 not in", values, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2Between(String value1, String value2) {
            addCriterion("textfield2 between", value1, value2, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield2NotBetween(String value1, String value2) {
            addCriterion("textfield2 not between", value1, value2, "textfield2");
            return (Criteria) this;
        }

        public Criteria andTextfield3IsNull() {
            addCriterion("textfield3 is null");
            return (Criteria) this;
        }

        public Criteria andTextfield3IsNotNull() {
            addCriterion("textfield3 is not null");
            return (Criteria) this;
        }

        public Criteria andTextfield3EqualTo(String value) {
            addCriterion("textfield3 =", value, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3NotEqualTo(String value) {
            addCriterion("textfield3 <>", value, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3GreaterThan(String value) {
            addCriterion("textfield3 >", value, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3GreaterThanOrEqualTo(String value) {
            addCriterion("textfield3 >=", value, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3LessThan(String value) {
            addCriterion("textfield3 <", value, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3LessThanOrEqualTo(String value) {
            addCriterion("textfield3 <=", value, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3Like(String value) {
            addCriterion("textfield3 like", value, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3NotLike(String value) {
            addCriterion("textfield3 not like", value, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3In(List<String> values) {
            addCriterion("textfield3 in", values, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3NotIn(List<String> values) {
            addCriterion("textfield3 not in", values, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3Between(String value1, String value2) {
            addCriterion("textfield3 between", value1, value2, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield3NotBetween(String value1, String value2) {
            addCriterion("textfield3 not between", value1, value2, "textfield3");
            return (Criteria) this;
        }

        public Criteria andTextfield4IsNull() {
            addCriterion("textfield4 is null");
            return (Criteria) this;
        }

        public Criteria andTextfield4IsNotNull() {
            addCriterion("textfield4 is not null");
            return (Criteria) this;
        }

        public Criteria andTextfield4EqualTo(String value) {
            addCriterion("textfield4 =", value, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4NotEqualTo(String value) {
            addCriterion("textfield4 <>", value, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4GreaterThan(String value) {
            addCriterion("textfield4 >", value, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4GreaterThanOrEqualTo(String value) {
            addCriterion("textfield4 >=", value, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4LessThan(String value) {
            addCriterion("textfield4 <", value, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4LessThanOrEqualTo(String value) {
            addCriterion("textfield4 <=", value, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4Like(String value) {
            addCriterion("textfield4 like", value, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4NotLike(String value) {
            addCriterion("textfield4 not like", value, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4In(List<String> values) {
            addCriterion("textfield4 in", values, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4NotIn(List<String> values) {
            addCriterion("textfield4 not in", values, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4Between(String value1, String value2) {
            addCriterion("textfield4 between", value1, value2, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield4NotBetween(String value1, String value2) {
            addCriterion("textfield4 not between", value1, value2, "textfield4");
            return (Criteria) this;
        }

        public Criteria andTextfield5IsNull() {
            addCriterion("textfield5 is null");
            return (Criteria) this;
        }

        public Criteria andTextfield5IsNotNull() {
            addCriterion("textfield5 is not null");
            return (Criteria) this;
        }

        public Criteria andTextfield5EqualTo(String value) {
            addCriterion("textfield5 =", value, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5NotEqualTo(String value) {
            addCriterion("textfield5 <>", value, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5GreaterThan(String value) {
            addCriterion("textfield5 >", value, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5GreaterThanOrEqualTo(String value) {
            addCriterion("textfield5 >=", value, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5LessThan(String value) {
            addCriterion("textfield5 <", value, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5LessThanOrEqualTo(String value) {
            addCriterion("textfield5 <=", value, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5Like(String value) {
            addCriterion("textfield5 like", value, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5NotLike(String value) {
            addCriterion("textfield5 not like", value, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5In(List<String> values) {
            addCriterion("textfield5 in", values, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5NotIn(List<String> values) {
            addCriterion("textfield5 not in", values, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5Between(String value1, String value2) {
            addCriterion("textfield5 between", value1, value2, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTextfield5NotBetween(String value1, String value2) {
            addCriterion("textfield5 not between", value1, value2, "textfield5");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1IsNull() {
            addCriterion("tinyintfield1 is null");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1IsNotNull() {
            addCriterion("tinyintfield1 is not null");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1EqualTo(Byte value) {
            addCriterion("tinyintfield1 =", value, "tinyintfield1");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1NotEqualTo(Byte value) {
            addCriterion("tinyintfield1 <>", value, "tinyintfield1");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1GreaterThan(Byte value) {
            addCriterion("tinyintfield1 >", value, "tinyintfield1");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1GreaterThanOrEqualTo(Byte value) {
            addCriterion("tinyintfield1 >=", value, "tinyintfield1");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1LessThan(Byte value) {
            addCriterion("tinyintfield1 <", value, "tinyintfield1");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1LessThanOrEqualTo(Byte value) {
            addCriterion("tinyintfield1 <=", value, "tinyintfield1");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1In(List<Byte> values) {
            addCriterion("tinyintfield1 in", values, "tinyintfield1");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1NotIn(List<Byte> values) {
            addCriterion("tinyintfield1 not in", values, "tinyintfield1");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1Between(Byte value1, Byte value2) {
            addCriterion("tinyintfield1 between", value1, value2, "tinyintfield1");
            return (Criteria) this;
        }

        public Criteria andTinyintfield1NotBetween(Byte value1, Byte value2) {
            addCriterion("tinyintfield1 not between", value1, value2, "tinyintfield1");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2IsNull() {
            addCriterion("tinyintfield2 is null");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2IsNotNull() {
            addCriterion("tinyintfield2 is not null");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2EqualTo(Byte value) {
            addCriterion("tinyintfield2 =", value, "tinyintfield2");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2NotEqualTo(Byte value) {
            addCriterion("tinyintfield2 <>", value, "tinyintfield2");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2GreaterThan(Byte value) {
            addCriterion("tinyintfield2 >", value, "tinyintfield2");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2GreaterThanOrEqualTo(Byte value) {
            addCriterion("tinyintfield2 >=", value, "tinyintfield2");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2LessThan(Byte value) {
            addCriterion("tinyintfield2 <", value, "tinyintfield2");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2LessThanOrEqualTo(Byte value) {
            addCriterion("tinyintfield2 <=", value, "tinyintfield2");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2In(List<Byte> values) {
            addCriterion("tinyintfield2 in", values, "tinyintfield2");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2NotIn(List<Byte> values) {
            addCriterion("tinyintfield2 not in", values, "tinyintfield2");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2Between(Byte value1, Byte value2) {
            addCriterion("tinyintfield2 between", value1, value2, "tinyintfield2");
            return (Criteria) this;
        }

        public Criteria andTinyintfield2NotBetween(Byte value1, Byte value2) {
            addCriterion("tinyintfield2 not between", value1, value2, "tinyintfield2");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3IsNull() {
            addCriterion("tinyintfield3 is null");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3IsNotNull() {
            addCriterion("tinyintfield3 is not null");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3EqualTo(Byte value) {
            addCriterion("tinyintfield3 =", value, "tinyintfield3");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3NotEqualTo(Byte value) {
            addCriterion("tinyintfield3 <>", value, "tinyintfield3");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3GreaterThan(Byte value) {
            addCriterion("tinyintfield3 >", value, "tinyintfield3");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3GreaterThanOrEqualTo(Byte value) {
            addCriterion("tinyintfield3 >=", value, "tinyintfield3");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3LessThan(Byte value) {
            addCriterion("tinyintfield3 <", value, "tinyintfield3");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3LessThanOrEqualTo(Byte value) {
            addCriterion("tinyintfield3 <=", value, "tinyintfield3");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3In(List<Byte> values) {
            addCriterion("tinyintfield3 in", values, "tinyintfield3");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3NotIn(List<Byte> values) {
            addCriterion("tinyintfield3 not in", values, "tinyintfield3");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3Between(Byte value1, Byte value2) {
            addCriterion("tinyintfield3 between", value1, value2, "tinyintfield3");
            return (Criteria) this;
        }

        public Criteria andTinyintfield3NotBetween(Byte value1, Byte value2) {
            addCriterion("tinyintfield3 not between", value1, value2, "tinyintfield3");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4IsNull() {
            addCriterion("tinyintfield4 is null");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4IsNotNull() {
            addCriterion("tinyintfield4 is not null");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4EqualTo(Byte value) {
            addCriterion("tinyintfield4 =", value, "tinyintfield4");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4NotEqualTo(Byte value) {
            addCriterion("tinyintfield4 <>", value, "tinyintfield4");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4GreaterThan(Byte value) {
            addCriterion("tinyintfield4 >", value, "tinyintfield4");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4GreaterThanOrEqualTo(Byte value) {
            addCriterion("tinyintfield4 >=", value, "tinyintfield4");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4LessThan(Byte value) {
            addCriterion("tinyintfield4 <", value, "tinyintfield4");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4LessThanOrEqualTo(Byte value) {
            addCriterion("tinyintfield4 <=", value, "tinyintfield4");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4In(List<Byte> values) {
            addCriterion("tinyintfield4 in", values, "tinyintfield4");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4NotIn(List<Byte> values) {
            addCriterion("tinyintfield4 not in", values, "tinyintfield4");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4Between(Byte value1, Byte value2) {
            addCriterion("tinyintfield4 between", value1, value2, "tinyintfield4");
            return (Criteria) this;
        }

        public Criteria andTinyintfield4NotBetween(Byte value1, Byte value2) {
            addCriterion("tinyintfield4 not between", value1, value2, "tinyintfield4");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5IsNull() {
            addCriterion("tinyintfield5 is null");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5IsNotNull() {
            addCriterion("tinyintfield5 is not null");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5EqualTo(Byte value) {
            addCriterion("tinyintfield5 =", value, "tinyintfield5");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5NotEqualTo(Byte value) {
            addCriterion("tinyintfield5 <>", value, "tinyintfield5");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5GreaterThan(Byte value) {
            addCriterion("tinyintfield5 >", value, "tinyintfield5");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5GreaterThanOrEqualTo(Byte value) {
            addCriterion("tinyintfield5 >=", value, "tinyintfield5");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5LessThan(Byte value) {
            addCriterion("tinyintfield5 <", value, "tinyintfield5");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5LessThanOrEqualTo(Byte value) {
            addCriterion("tinyintfield5 <=", value, "tinyintfield5");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5In(List<Byte> values) {
            addCriterion("tinyintfield5 in", values, "tinyintfield5");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5NotIn(List<Byte> values) {
            addCriterion("tinyintfield5 not in", values, "tinyintfield5");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5Between(Byte value1, Byte value2) {
            addCriterion("tinyintfield5 between", value1, value2, "tinyintfield5");
            return (Criteria) this;
        }

        public Criteria andTinyintfield5NotBetween(Byte value1, Byte value2) {
            addCriterion("tinyintfield5 not between", value1, value2, "tinyintfield5");
            return (Criteria) this;
        }

        public Criteria andCertificatenumIsNull() {
            addCriterion("certificatenum is null");
            return (Criteria) this;
        }

        public Criteria andCertificatenumIsNotNull() {
            addCriterion("certificatenum is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatenumEqualTo(String value) {
            addCriterion("certificatenum =", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotEqualTo(String value) {
            addCriterion("certificatenum <>", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumGreaterThan(String value) {
            addCriterion("certificatenum >", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumGreaterThanOrEqualTo(String value) {
            addCriterion("certificatenum >=", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumLessThan(String value) {
            addCriterion("certificatenum <", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumLessThanOrEqualTo(String value) {
            addCriterion("certificatenum <=", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumLike(String value) {
            addCriterion("certificatenum like", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotLike(String value) {
            addCriterion("certificatenum not like", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumIn(List<String> values) {
            addCriterion("certificatenum in", values, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotIn(List<String> values) {
            addCriterion("certificatenum not in", values, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumBetween(String value1, String value2) {
            addCriterion("certificatenum between", value1, value2, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotBetween(String value1, String value2) {
            addCriterion("certificatenum not between", value1, value2, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("nativeplace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("nativeplace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("nativeplace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativeplace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("nativeplace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("nativeplace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("nativeplace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("nativeplace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("nativeplace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("nativeplace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("nativeplace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("nativeplace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andEducationlevelIsNull() {
            addCriterion("educationlevel is null");
            return (Criteria) this;
        }

        public Criteria andEducationlevelIsNotNull() {
            addCriterion("educationlevel is not null");
            return (Criteria) this;
        }

        public Criteria andEducationlevelEqualTo(Integer value) {
            addCriterion("educationlevel =", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotEqualTo(Integer value) {
            addCriterion("educationlevel <>", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelGreaterThan(Integer value) {
            addCriterion("educationlevel >", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("educationlevel >=", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelLessThan(Integer value) {
            addCriterion("educationlevel <", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelLessThanOrEqualTo(Integer value) {
            addCriterion("educationlevel <=", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelIn(List<Integer> values) {
            addCriterion("educationlevel in", values, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotIn(List<Integer> values) {
            addCriterion("educationlevel not in", values, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelBetween(Integer value1, Integer value2) {
            addCriterion("educationlevel between", value1, value2, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("educationlevel not between", value1, value2, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andBememberdateIsNull() {
            addCriterion("bememberdate is null");
            return (Criteria) this;
        }

        public Criteria andBememberdateIsNotNull() {
            addCriterion("bememberdate is not null");
            return (Criteria) this;
        }

        public Criteria andBememberdateEqualTo(String value) {
            addCriterion("bememberdate =", value, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateNotEqualTo(String value) {
            addCriterion("bememberdate <>", value, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateGreaterThan(String value) {
            addCriterion("bememberdate >", value, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateGreaterThanOrEqualTo(String value) {
            addCriterion("bememberdate >=", value, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateLessThan(String value) {
            addCriterion("bememberdate <", value, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateLessThanOrEqualTo(String value) {
            addCriterion("bememberdate <=", value, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateLike(String value) {
            addCriterion("bememberdate like", value, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateNotLike(String value) {
            addCriterion("bememberdate not like", value, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateIn(List<String> values) {
            addCriterion("bememberdate in", values, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateNotIn(List<String> values) {
            addCriterion("bememberdate not in", values, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateBetween(String value1, String value2) {
            addCriterion("bememberdate between", value1, value2, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBememberdateNotBetween(String value1, String value2) {
            addCriterion("bememberdate not between", value1, value2, "bememberdate");
            return (Criteria) this;
        }

        public Criteria andBepartydateIsNull() {
            addCriterion("bepartydate is null");
            return (Criteria) this;
        }

        public Criteria andBepartydateIsNotNull() {
            addCriterion("bepartydate is not null");
            return (Criteria) this;
        }

        public Criteria andBepartydateEqualTo(String value) {
            addCriterion("bepartydate =", value, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateNotEqualTo(String value) {
            addCriterion("bepartydate <>", value, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateGreaterThan(String value) {
            addCriterion("bepartydate >", value, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateGreaterThanOrEqualTo(String value) {
            addCriterion("bepartydate >=", value, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateLessThan(String value) {
            addCriterion("bepartydate <", value, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateLessThanOrEqualTo(String value) {
            addCriterion("bepartydate <=", value, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateLike(String value) {
            addCriterion("bepartydate like", value, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateNotLike(String value) {
            addCriterion("bepartydate not like", value, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateIn(List<String> values) {
            addCriterion("bepartydate in", values, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateNotIn(List<String> values) {
            addCriterion("bepartydate not in", values, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateBetween(String value1, String value2) {
            addCriterion("bepartydate between", value1, value2, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andBepartydateNotBetween(String value1, String value2) {
            addCriterion("bepartydate not between", value1, value2, "bepartydate");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIsNull() {
            addCriterion("workcode is null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIsNotNull() {
            addCriterion("workcode is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeEqualTo(String value) {
            addCriterion("workcode =", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotEqualTo(String value) {
            addCriterion("workcode <>", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThan(String value) {
            addCriterion("workcode >", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("workcode >=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThan(String value) {
            addCriterion("workcode <", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThanOrEqualTo(String value) {
            addCriterion("workcode <=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLike(String value) {
            addCriterion("workcode like", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotLike(String value) {
            addCriterion("workcode not like", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIn(List<String> values) {
            addCriterion("workcode in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotIn(List<String> values) {
            addCriterion("workcode not in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeBetween(String value1, String value2) {
            addCriterion("workcode between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotBetween(String value1, String value2) {
            addCriterion("workcode not between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceIsNull() {
            addCriterion("regresidentplace is null");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceIsNotNull() {
            addCriterion("regresidentplace is not null");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceEqualTo(String value) {
            addCriterion("regresidentplace =", value, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceNotEqualTo(String value) {
            addCriterion("regresidentplace <>", value, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceGreaterThan(String value) {
            addCriterion("regresidentplace >", value, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceGreaterThanOrEqualTo(String value) {
            addCriterion("regresidentplace >=", value, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceLessThan(String value) {
            addCriterion("regresidentplace <", value, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceLessThanOrEqualTo(String value) {
            addCriterion("regresidentplace <=", value, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceLike(String value) {
            addCriterion("regresidentplace like", value, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceNotLike(String value) {
            addCriterion("regresidentplace not like", value, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceIn(List<String> values) {
            addCriterion("regresidentplace in", values, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceNotIn(List<String> values) {
            addCriterion("regresidentplace not in", values, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceBetween(String value1, String value2) {
            addCriterion("regresidentplace between", value1, value2, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andRegresidentplaceNotBetween(String value1, String value2) {
            addCriterion("regresidentplace not between", value1, value2, "regresidentplace");
            return (Criteria) this;
        }

        public Criteria andHealthinfoIsNull() {
            addCriterion("healthinfo is null");
            return (Criteria) this;
        }

        public Criteria andHealthinfoIsNotNull() {
            addCriterion("healthinfo is not null");
            return (Criteria) this;
        }

        public Criteria andHealthinfoEqualTo(String value) {
            addCriterion("healthinfo =", value, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoNotEqualTo(String value) {
            addCriterion("healthinfo <>", value, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoGreaterThan(String value) {
            addCriterion("healthinfo >", value, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoGreaterThanOrEqualTo(String value) {
            addCriterion("healthinfo >=", value, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoLessThan(String value) {
            addCriterion("healthinfo <", value, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoLessThanOrEqualTo(String value) {
            addCriterion("healthinfo <=", value, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoLike(String value) {
            addCriterion("healthinfo like", value, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoNotLike(String value) {
            addCriterion("healthinfo not like", value, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoIn(List<String> values) {
            addCriterion("healthinfo in", values, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoNotIn(List<String> values) {
            addCriterion("healthinfo not in", values, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoBetween(String value1, String value2) {
            addCriterion("healthinfo between", value1, value2, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andHealthinfoNotBetween(String value1, String value2) {
            addCriterion("healthinfo not between", value1, value2, "healthinfo");
            return (Criteria) this;
        }

        public Criteria andResidentplaceIsNull() {
            addCriterion("residentplace is null");
            return (Criteria) this;
        }

        public Criteria andResidentplaceIsNotNull() {
            addCriterion("residentplace is not null");
            return (Criteria) this;
        }

        public Criteria andResidentplaceEqualTo(String value) {
            addCriterion("residentplace =", value, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceNotEqualTo(String value) {
            addCriterion("residentplace <>", value, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceGreaterThan(String value) {
            addCriterion("residentplace >", value, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceGreaterThanOrEqualTo(String value) {
            addCriterion("residentplace >=", value, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceLessThan(String value) {
            addCriterion("residentplace <", value, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceLessThanOrEqualTo(String value) {
            addCriterion("residentplace <=", value, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceLike(String value) {
            addCriterion("residentplace like", value, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceNotLike(String value) {
            addCriterion("residentplace not like", value, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceIn(List<String> values) {
            addCriterion("residentplace in", values, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceNotIn(List<String> values) {
            addCriterion("residentplace not in", values, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceBetween(String value1, String value2) {
            addCriterion("residentplace between", value1, value2, "residentplace");
            return (Criteria) this;
        }

        public Criteria andResidentplaceNotBetween(String value1, String value2) {
            addCriterion("residentplace not between", value1, value2, "residentplace");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNull() {
            addCriterion("policy is null");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNotNull() {
            addCriterion("policy is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyEqualTo(String value) {
            addCriterion("policy =", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotEqualTo(String value) {
            addCriterion("policy <>", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThan(String value) {
            addCriterion("policy >", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("policy >=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThan(String value) {
            addCriterion("policy <", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThanOrEqualTo(String value) {
            addCriterion("policy <=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLike(String value) {
            addCriterion("policy like", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotLike(String value) {
            addCriterion("policy not like", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyIn(List<String> values) {
            addCriterion("policy in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotIn(List<String> values) {
            addCriterion("policy not in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyBetween(String value1, String value2) {
            addCriterion("policy between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotBetween(String value1, String value2) {
            addCriterion("policy not between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andUsekindIsNull() {
            addCriterion("usekind is null");
            return (Criteria) this;
        }

        public Criteria andUsekindIsNotNull() {
            addCriterion("usekind is not null");
            return (Criteria) this;
        }

        public Criteria andUsekindEqualTo(Integer value) {
            addCriterion("usekind =", value, "usekind");
            return (Criteria) this;
        }

        public Criteria andUsekindNotEqualTo(Integer value) {
            addCriterion("usekind <>", value, "usekind");
            return (Criteria) this;
        }

        public Criteria andUsekindGreaterThan(Integer value) {
            addCriterion("usekind >", value, "usekind");
            return (Criteria) this;
        }

        public Criteria andUsekindGreaterThanOrEqualTo(Integer value) {
            addCriterion("usekind >=", value, "usekind");
            return (Criteria) this;
        }

        public Criteria andUsekindLessThan(Integer value) {
            addCriterion("usekind <", value, "usekind");
            return (Criteria) this;
        }

        public Criteria andUsekindLessThanOrEqualTo(Integer value) {
            addCriterion("usekind <=", value, "usekind");
            return (Criteria) this;
        }

        public Criteria andUsekindIn(List<Integer> values) {
            addCriterion("usekind in", values, "usekind");
            return (Criteria) this;
        }

        public Criteria andUsekindNotIn(List<Integer> values) {
            addCriterion("usekind not in", values, "usekind");
            return (Criteria) this;
        }

        public Criteria andUsekindBetween(Integer value1, Integer value2) {
            addCriterion("usekind between", value1, value2, "usekind");
            return (Criteria) this;
        }

        public Criteria andUsekindNotBetween(Integer value1, Integer value2) {
            addCriterion("usekind not between", value1, value2, "usekind");
            return (Criteria) this;
        }

        public Criteria andJobcallIsNull() {
            addCriterion("jobcall is null");
            return (Criteria) this;
        }

        public Criteria andJobcallIsNotNull() {
            addCriterion("jobcall is not null");
            return (Criteria) this;
        }

        public Criteria andJobcallEqualTo(Integer value) {
            addCriterion("jobcall =", value, "jobcall");
            return (Criteria) this;
        }

        public Criteria andJobcallNotEqualTo(Integer value) {
            addCriterion("jobcall <>", value, "jobcall");
            return (Criteria) this;
        }

        public Criteria andJobcallGreaterThan(Integer value) {
            addCriterion("jobcall >", value, "jobcall");
            return (Criteria) this;
        }

        public Criteria andJobcallGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobcall >=", value, "jobcall");
            return (Criteria) this;
        }

        public Criteria andJobcallLessThan(Integer value) {
            addCriterion("jobcall <", value, "jobcall");
            return (Criteria) this;
        }

        public Criteria andJobcallLessThanOrEqualTo(Integer value) {
            addCriterion("jobcall <=", value, "jobcall");
            return (Criteria) this;
        }

        public Criteria andJobcallIn(List<Integer> values) {
            addCriterion("jobcall in", values, "jobcall");
            return (Criteria) this;
        }

        public Criteria andJobcallNotIn(List<Integer> values) {
            addCriterion("jobcall not in", values, "jobcall");
            return (Criteria) this;
        }

        public Criteria andJobcallBetween(Integer value1, Integer value2) {
            addCriterion("jobcall between", value1, value2, "jobcall");
            return (Criteria) this;
        }

        public Criteria andJobcallNotBetween(Integer value1, Integer value2) {
            addCriterion("jobcall not between", value1, value2, "jobcall");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountIsNull() {
            addCriterion("accumfundaccount is null");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountIsNotNull() {
            addCriterion("accumfundaccount is not null");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountEqualTo(String value) {
            addCriterion("accumfundaccount =", value, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountNotEqualTo(String value) {
            addCriterion("accumfundaccount <>", value, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountGreaterThan(String value) {
            addCriterion("accumfundaccount >", value, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountGreaterThanOrEqualTo(String value) {
            addCriterion("accumfundaccount >=", value, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountLessThan(String value) {
            addCriterion("accumfundaccount <", value, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountLessThanOrEqualTo(String value) {
            addCriterion("accumfundaccount <=", value, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountLike(String value) {
            addCriterion("accumfundaccount like", value, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountNotLike(String value) {
            addCriterion("accumfundaccount not like", value, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountIn(List<String> values) {
            addCriterion("accumfundaccount in", values, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountNotIn(List<String> values) {
            addCriterion("accumfundaccount not in", values, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountBetween(String value1, String value2) {
            addCriterion("accumfundaccount between", value1, value2, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andAccumfundaccountNotBetween(String value1, String value2) {
            addCriterion("accumfundaccount not between", value1, value2, "accumfundaccount");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNull() {
            addCriterion("birthplace is null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNotNull() {
            addCriterion("birthplace is not null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceEqualTo(String value) {
            addCriterion("birthplace =", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotEqualTo(String value) {
            addCriterion("birthplace <>", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThan(String value) {
            addCriterion("birthplace >", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("birthplace >=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThan(String value) {
            addCriterion("birthplace <", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("birthplace <=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLike(String value) {
            addCriterion("birthplace like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotLike(String value) {
            addCriterion("birthplace not like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIn(List<String> values) {
            addCriterion("birthplace in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotIn(List<String> values) {
            addCriterion("birthplace not in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceBetween(String value1, String value2) {
            addCriterion("birthplace between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotBetween(String value1, String value2) {
            addCriterion("birthplace not between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andFolkIsNull() {
            addCriterion("folk is null");
            return (Criteria) this;
        }

        public Criteria andFolkIsNotNull() {
            addCriterion("folk is not null");
            return (Criteria) this;
        }

        public Criteria andFolkEqualTo(String value) {
            addCriterion("folk =", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotEqualTo(String value) {
            addCriterion("folk <>", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkGreaterThan(String value) {
            addCriterion("folk >", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkGreaterThanOrEqualTo(String value) {
            addCriterion("folk >=", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkLessThan(String value) {
            addCriterion("folk <", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkLessThanOrEqualTo(String value) {
            addCriterion("folk <=", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkLike(String value) {
            addCriterion("folk like", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotLike(String value) {
            addCriterion("folk not like", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkIn(List<String> values) {
            addCriterion("folk in", values, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotIn(List<String> values) {
            addCriterion("folk not in", values, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkBetween(String value1, String value2) {
            addCriterion("folk between", value1, value2, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotBetween(String value1, String value2) {
            addCriterion("folk not between", value1, value2, "folk");
            return (Criteria) this;
        }

        public Criteria andResidentphoneIsNull() {
            addCriterion("residentphone is null");
            return (Criteria) this;
        }

        public Criteria andResidentphoneIsNotNull() {
            addCriterion("residentphone is not null");
            return (Criteria) this;
        }

        public Criteria andResidentphoneEqualTo(String value) {
            addCriterion("residentphone =", value, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneNotEqualTo(String value) {
            addCriterion("residentphone <>", value, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneGreaterThan(String value) {
            addCriterion("residentphone >", value, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneGreaterThanOrEqualTo(String value) {
            addCriterion("residentphone >=", value, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneLessThan(String value) {
            addCriterion("residentphone <", value, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneLessThanOrEqualTo(String value) {
            addCriterion("residentphone <=", value, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneLike(String value) {
            addCriterion("residentphone like", value, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneNotLike(String value) {
            addCriterion("residentphone not like", value, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneIn(List<String> values) {
            addCriterion("residentphone in", values, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneNotIn(List<String> values) {
            addCriterion("residentphone not in", values, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneBetween(String value1, String value2) {
            addCriterion("residentphone between", value1, value2, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentphoneNotBetween(String value1, String value2) {
            addCriterion("residentphone not between", value1, value2, "residentphone");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeIsNull() {
            addCriterion("residentpostcode is null");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeIsNotNull() {
            addCriterion("residentpostcode is not null");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeEqualTo(String value) {
            addCriterion("residentpostcode =", value, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeNotEqualTo(String value) {
            addCriterion("residentpostcode <>", value, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeGreaterThan(String value) {
            addCriterion("residentpostcode >", value, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("residentpostcode >=", value, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeLessThan(String value) {
            addCriterion("residentpostcode <", value, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeLessThanOrEqualTo(String value) {
            addCriterion("residentpostcode <=", value, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeLike(String value) {
            addCriterion("residentpostcode like", value, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeNotLike(String value) {
            addCriterion("residentpostcode not like", value, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeIn(List<String> values) {
            addCriterion("residentpostcode in", values, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeNotIn(List<String> values) {
            addCriterion("residentpostcode not in", values, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeBetween(String value1, String value2) {
            addCriterion("residentpostcode between", value1, value2, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andResidentpostcodeNotBetween(String value1, String value2) {
            addCriterion("residentpostcode not between", value1, value2, "residentpostcode");
            return (Criteria) this;
        }

        public Criteria andExtphoneIsNull() {
            addCriterion("extphone is null");
            return (Criteria) this;
        }

        public Criteria andExtphoneIsNotNull() {
            addCriterion("extphone is not null");
            return (Criteria) this;
        }

        public Criteria andExtphoneEqualTo(String value) {
            addCriterion("extphone =", value, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneNotEqualTo(String value) {
            addCriterion("extphone <>", value, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneGreaterThan(String value) {
            addCriterion("extphone >", value, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneGreaterThanOrEqualTo(String value) {
            addCriterion("extphone >=", value, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneLessThan(String value) {
            addCriterion("extphone <", value, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneLessThanOrEqualTo(String value) {
            addCriterion("extphone <=", value, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneLike(String value) {
            addCriterion("extphone like", value, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneNotLike(String value) {
            addCriterion("extphone not like", value, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneIn(List<String> values) {
            addCriterion("extphone in", values, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneNotIn(List<String> values) {
            addCriterion("extphone not in", values, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneBetween(String value1, String value2) {
            addCriterion("extphone between", value1, value2, "extphone");
            return (Criteria) this;
        }

        public Criteria andExtphoneNotBetween(String value1, String value2) {
            addCriterion("extphone not between", value1, value2, "extphone");
            return (Criteria) this;
        }

        public Criteria andManagerstrIsNull() {
            addCriterion("managerstr is null");
            return (Criteria) this;
        }

        public Criteria andManagerstrIsNotNull() {
            addCriterion("managerstr is not null");
            return (Criteria) this;
        }

        public Criteria andManagerstrEqualTo(String value) {
            addCriterion("managerstr =", value, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrNotEqualTo(String value) {
            addCriterion("managerstr <>", value, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrGreaterThan(String value) {
            addCriterion("managerstr >", value, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrGreaterThanOrEqualTo(String value) {
            addCriterion("managerstr >=", value, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrLessThan(String value) {
            addCriterion("managerstr <", value, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrLessThanOrEqualTo(String value) {
            addCriterion("managerstr <=", value, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrLike(String value) {
            addCriterion("managerstr like", value, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrNotLike(String value) {
            addCriterion("managerstr not like", value, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrIn(List<String> values) {
            addCriterion("managerstr in", values, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrNotIn(List<String> values) {
            addCriterion("managerstr not in", values, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrBetween(String value1, String value2) {
            addCriterion("managerstr between", value1, value2, "managerstr");
            return (Criteria) this;
        }

        public Criteria andManagerstrNotBetween(String value1, String value2) {
            addCriterion("managerstr not between", value1, value2, "managerstr");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andIslabouunionIsNull() {
            addCriterion("islabouunion is null");
            return (Criteria) this;
        }

        public Criteria andIslabouunionIsNotNull() {
            addCriterion("islabouunion is not null");
            return (Criteria) this;
        }

        public Criteria andIslabouunionEqualTo(String value) {
            addCriterion("islabouunion =", value, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionNotEqualTo(String value) {
            addCriterion("islabouunion <>", value, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionGreaterThan(String value) {
            addCriterion("islabouunion >", value, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionGreaterThanOrEqualTo(String value) {
            addCriterion("islabouunion >=", value, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionLessThan(String value) {
            addCriterion("islabouunion <", value, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionLessThanOrEqualTo(String value) {
            addCriterion("islabouunion <=", value, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionLike(String value) {
            addCriterion("islabouunion like", value, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionNotLike(String value) {
            addCriterion("islabouunion not like", value, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionIn(List<String> values) {
            addCriterion("islabouunion in", values, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionNotIn(List<String> values) {
            addCriterion("islabouunion not in", values, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionBetween(String value1, String value2) {
            addCriterion("islabouunion between", value1, value2, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andIslabouunionNotBetween(String value1, String value2) {
            addCriterion("islabouunion not between", value1, value2, "islabouunion");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberIsNull() {
            addCriterion("tempresidentnumber is null");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberIsNotNull() {
            addCriterion("tempresidentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberEqualTo(String value) {
            addCriterion("tempresidentnumber =", value, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberNotEqualTo(String value) {
            addCriterion("tempresidentnumber <>", value, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberGreaterThan(String value) {
            addCriterion("tempresidentnumber >", value, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("tempresidentnumber >=", value, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberLessThan(String value) {
            addCriterion("tempresidentnumber <", value, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberLessThanOrEqualTo(String value) {
            addCriterion("tempresidentnumber <=", value, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberLike(String value) {
            addCriterion("tempresidentnumber like", value, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberNotLike(String value) {
            addCriterion("tempresidentnumber not like", value, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberIn(List<String> values) {
            addCriterion("tempresidentnumber in", values, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberNotIn(List<String> values) {
            addCriterion("tempresidentnumber not in", values, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberBetween(String value1, String value2) {
            addCriterion("tempresidentnumber between", value1, value2, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andTempresidentnumberNotBetween(String value1, String value2) {
            addCriterion("tempresidentnumber not between", value1, value2, "tempresidentnumber");
            return (Criteria) this;
        }

        public Criteria andProbationenddateIsNull() {
            addCriterion("probationenddate is null");
            return (Criteria) this;
        }

        public Criteria andProbationenddateIsNotNull() {
            addCriterion("probationenddate is not null");
            return (Criteria) this;
        }

        public Criteria andProbationenddateEqualTo(String value) {
            addCriterion("probationenddate =", value, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateNotEqualTo(String value) {
            addCriterion("probationenddate <>", value, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateGreaterThan(String value) {
            addCriterion("probationenddate >", value, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateGreaterThanOrEqualTo(String value) {
            addCriterion("probationenddate >=", value, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateLessThan(String value) {
            addCriterion("probationenddate <", value, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateLessThanOrEqualTo(String value) {
            addCriterion("probationenddate <=", value, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateLike(String value) {
            addCriterion("probationenddate like", value, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateNotLike(String value) {
            addCriterion("probationenddate not like", value, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateIn(List<String> values) {
            addCriterion("probationenddate in", values, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateNotIn(List<String> values) {
            addCriterion("probationenddate not in", values, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateBetween(String value1, String value2) {
            addCriterion("probationenddate between", value1, value2, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andProbationenddateNotBetween(String value1, String value2) {
            addCriterion("probationenddate not between", value1, value2, "probationenddate");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNull() {
            addCriterion("countryid is null");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNotNull() {
            addCriterion("countryid is not null");
            return (Criteria) this;
        }

        public Criteria andCountryidEqualTo(Integer value) {
            addCriterion("countryid =", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotEqualTo(Integer value) {
            addCriterion("countryid <>", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThan(Integer value) {
            addCriterion("countryid >", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("countryid >=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThan(Integer value) {
            addCriterion("countryid <", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThanOrEqualTo(Integer value) {
            addCriterion("countryid <=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidIn(List<Integer> values) {
            addCriterion("countryid in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotIn(List<Integer> values) {
            addCriterion("countryid not in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidBetween(Integer value1, Integer value2) {
            addCriterion("countryid between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotBetween(Integer value1, Integer value2) {
            addCriterion("countryid not between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateIsNull() {
            addCriterion("passwdchgdate is null");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateIsNotNull() {
            addCriterion("passwdchgdate is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateEqualTo(String value) {
            addCriterion("passwdchgdate =", value, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateNotEqualTo(String value) {
            addCriterion("passwdchgdate <>", value, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateGreaterThan(String value) {
            addCriterion("passwdchgdate >", value, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateGreaterThanOrEqualTo(String value) {
            addCriterion("passwdchgdate >=", value, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateLessThan(String value) {
            addCriterion("passwdchgdate <", value, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateLessThanOrEqualTo(String value) {
            addCriterion("passwdchgdate <=", value, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateLike(String value) {
            addCriterion("passwdchgdate like", value, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateNotLike(String value) {
            addCriterion("passwdchgdate not like", value, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateIn(List<String> values) {
            addCriterion("passwdchgdate in", values, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateNotIn(List<String> values) {
            addCriterion("passwdchgdate not in", values, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateBetween(String value1, String value2) {
            addCriterion("passwdchgdate between", value1, value2, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andPasswdchgdateNotBetween(String value1, String value2) {
            addCriterion("passwdchgdate not between", value1, value2, "passwdchgdate");
            return (Criteria) this;
        }

        public Criteria andNeedusbIsNull() {
            addCriterion("needusb is null");
            return (Criteria) this;
        }

        public Criteria andNeedusbIsNotNull() {
            addCriterion("needusb is not null");
            return (Criteria) this;
        }

        public Criteria andNeedusbEqualTo(Integer value) {
            addCriterion("needusb =", value, "needusb");
            return (Criteria) this;
        }

        public Criteria andNeedusbNotEqualTo(Integer value) {
            addCriterion("needusb <>", value, "needusb");
            return (Criteria) this;
        }

        public Criteria andNeedusbGreaterThan(Integer value) {
            addCriterion("needusb >", value, "needusb");
            return (Criteria) this;
        }

        public Criteria andNeedusbGreaterThanOrEqualTo(Integer value) {
            addCriterion("needusb >=", value, "needusb");
            return (Criteria) this;
        }

        public Criteria andNeedusbLessThan(Integer value) {
            addCriterion("needusb <", value, "needusb");
            return (Criteria) this;
        }

        public Criteria andNeedusbLessThanOrEqualTo(Integer value) {
            addCriterion("needusb <=", value, "needusb");
            return (Criteria) this;
        }

        public Criteria andNeedusbIn(List<Integer> values) {
            addCriterion("needusb in", values, "needusb");
            return (Criteria) this;
        }

        public Criteria andNeedusbNotIn(List<Integer> values) {
            addCriterion("needusb not in", values, "needusb");
            return (Criteria) this;
        }

        public Criteria andNeedusbBetween(Integer value1, Integer value2) {
            addCriterion("needusb between", value1, value2, "needusb");
            return (Criteria) this;
        }

        public Criteria andNeedusbNotBetween(Integer value1, Integer value2) {
            addCriterion("needusb not between", value1, value2, "needusb");
            return (Criteria) this;
        }

        public Criteria andSerialIsNull() {
            addCriterion("serial is null");
            return (Criteria) this;
        }

        public Criteria andSerialIsNotNull() {
            addCriterion("serial is not null");
            return (Criteria) this;
        }

        public Criteria andSerialEqualTo(String value) {
            addCriterion("serial =", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotEqualTo(String value) {
            addCriterion("serial <>", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialGreaterThan(String value) {
            addCriterion("serial >", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialGreaterThanOrEqualTo(String value) {
            addCriterion("serial >=", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialLessThan(String value) {
            addCriterion("serial <", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialLessThanOrEqualTo(String value) {
            addCriterion("serial <=", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialLike(String value) {
            addCriterion("serial like", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotLike(String value) {
            addCriterion("serial not like", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialIn(List<String> values) {
            addCriterion("serial in", values, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotIn(List<String> values) {
            addCriterion("serial not in", values, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialBetween(String value1, String value2) {
            addCriterion("serial between", value1, value2, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotBetween(String value1, String value2) {
            addCriterion("serial not between", value1, value2, "serial");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andLloginidIsNull() {
            addCriterion("lloginid is null");
            return (Criteria) this;
        }

        public Criteria andLloginidIsNotNull() {
            addCriterion("lloginid is not null");
            return (Criteria) this;
        }

        public Criteria andLloginidEqualTo(String value) {
            addCriterion("lloginid =", value, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidNotEqualTo(String value) {
            addCriterion("lloginid <>", value, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidGreaterThan(String value) {
            addCriterion("lloginid >", value, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidGreaterThanOrEqualTo(String value) {
            addCriterion("lloginid >=", value, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidLessThan(String value) {
            addCriterion("lloginid <", value, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidLessThanOrEqualTo(String value) {
            addCriterion("lloginid <=", value, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidLike(String value) {
            addCriterion("lloginid like", value, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidNotLike(String value) {
            addCriterion("lloginid not like", value, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidIn(List<String> values) {
            addCriterion("lloginid in", values, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidNotIn(List<String> values) {
            addCriterion("lloginid not in", values, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidBetween(String value1, String value2) {
            addCriterion("lloginid between", value1, value2, "lloginid");
            return (Criteria) this;
        }

        public Criteria andLloginidNotBetween(String value1, String value2) {
            addCriterion("lloginid not between", value1, value2, "lloginid");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassIsNull() {
            addCriterion("needdynapass is null");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassIsNotNull() {
            addCriterion("needdynapass is not null");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassEqualTo(Integer value) {
            addCriterion("needdynapass =", value, "needdynapass");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassNotEqualTo(Integer value) {
            addCriterion("needdynapass <>", value, "needdynapass");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassGreaterThan(Integer value) {
            addCriterion("needdynapass >", value, "needdynapass");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassGreaterThanOrEqualTo(Integer value) {
            addCriterion("needdynapass >=", value, "needdynapass");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassLessThan(Integer value) {
            addCriterion("needdynapass <", value, "needdynapass");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassLessThanOrEqualTo(Integer value) {
            addCriterion("needdynapass <=", value, "needdynapass");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassIn(List<Integer> values) {
            addCriterion("needdynapass in", values, "needdynapass");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassNotIn(List<Integer> values) {
            addCriterion("needdynapass not in", values, "needdynapass");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassBetween(Integer value1, Integer value2) {
            addCriterion("needdynapass between", value1, value2, "needdynapass");
            return (Criteria) this;
        }

        public Criteria andNeeddynapassNotBetween(Integer value1, Integer value2) {
            addCriterion("needdynapass not between", value1, value2, "needdynapass");
            return (Criteria) this;
        }

        public Criteria andDsporderIsNull() {
            addCriterion("dsporder is null");
            return (Criteria) this;
        }

        public Criteria andDsporderIsNotNull() {
            addCriterion("dsporder is not null");
            return (Criteria) this;
        }

        public Criteria andDsporderEqualTo(Double value) {
            addCriterion("dsporder =", value, "dsporder");
            return (Criteria) this;
        }

        public Criteria andDsporderNotEqualTo(Double value) {
            addCriterion("dsporder <>", value, "dsporder");
            return (Criteria) this;
        }

        public Criteria andDsporderGreaterThan(Double value) {
            addCriterion("dsporder >", value, "dsporder");
            return (Criteria) this;
        }

        public Criteria andDsporderGreaterThanOrEqualTo(Double value) {
            addCriterion("dsporder >=", value, "dsporder");
            return (Criteria) this;
        }

        public Criteria andDsporderLessThan(Double value) {
            addCriterion("dsporder <", value, "dsporder");
            return (Criteria) this;
        }

        public Criteria andDsporderLessThanOrEqualTo(Double value) {
            addCriterion("dsporder <=", value, "dsporder");
            return (Criteria) this;
        }

        public Criteria andDsporderIn(List<Double> values) {
            addCriterion("dsporder in", values, "dsporder");
            return (Criteria) this;
        }

        public Criteria andDsporderNotIn(List<Double> values) {
            addCriterion("dsporder not in", values, "dsporder");
            return (Criteria) this;
        }

        public Criteria andDsporderBetween(Double value1, Double value2) {
            addCriterion("dsporder between", value1, value2, "dsporder");
            return (Criteria) this;
        }

        public Criteria andDsporderNotBetween(Double value1, Double value2) {
            addCriterion("dsporder not between", value1, value2, "dsporder");
            return (Criteria) this;
        }

        public Criteria andPasswordstateIsNull() {
            addCriterion("passwordstate is null");
            return (Criteria) this;
        }

        public Criteria andPasswordstateIsNotNull() {
            addCriterion("passwordstate is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordstateEqualTo(Integer value) {
            addCriterion("passwordstate =", value, "passwordstate");
            return (Criteria) this;
        }

        public Criteria andPasswordstateNotEqualTo(Integer value) {
            addCriterion("passwordstate <>", value, "passwordstate");
            return (Criteria) this;
        }

        public Criteria andPasswordstateGreaterThan(Integer value) {
            addCriterion("passwordstate >", value, "passwordstate");
            return (Criteria) this;
        }

        public Criteria andPasswordstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("passwordstate >=", value, "passwordstate");
            return (Criteria) this;
        }

        public Criteria andPasswordstateLessThan(Integer value) {
            addCriterion("passwordstate <", value, "passwordstate");
            return (Criteria) this;
        }

        public Criteria andPasswordstateLessThanOrEqualTo(Integer value) {
            addCriterion("passwordstate <=", value, "passwordstate");
            return (Criteria) this;
        }

        public Criteria andPasswordstateIn(List<Integer> values) {
            addCriterion("passwordstate in", values, "passwordstate");
            return (Criteria) this;
        }

        public Criteria andPasswordstateNotIn(List<Integer> values) {
            addCriterion("passwordstate not in", values, "passwordstate");
            return (Criteria) this;
        }

        public Criteria andPasswordstateBetween(Integer value1, Integer value2) {
            addCriterion("passwordstate between", value1, value2, "passwordstate");
            return (Criteria) this;
        }

        public Criteria andPasswordstateNotBetween(Integer value1, Integer value2) {
            addCriterion("passwordstate not between", value1, value2, "passwordstate");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNull() {
            addCriterion("accounttype is null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNotNull() {
            addCriterion("accounttype is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeEqualTo(Integer value) {
            addCriterion("accounttype =", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotEqualTo(Integer value) {
            addCriterion("accounttype <>", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThan(Integer value) {
            addCriterion("accounttype >", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("accounttype >=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThan(Integer value) {
            addCriterion("accounttype <", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThanOrEqualTo(Integer value) {
            addCriterion("accounttype <=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIn(List<Integer> values) {
            addCriterion("accounttype in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotIn(List<Integer> values) {
            addCriterion("accounttype not in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeBetween(Integer value1, Integer value2) {
            addCriterion("accounttype between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("accounttype not between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andBelongtoIsNull() {
            addCriterion("belongto is null");
            return (Criteria) this;
        }

        public Criteria andBelongtoIsNotNull() {
            addCriterion("belongto is not null");
            return (Criteria) this;
        }

        public Criteria andBelongtoEqualTo(Integer value) {
            addCriterion("belongto =", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotEqualTo(Integer value) {
            addCriterion("belongto <>", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoGreaterThan(Integer value) {
            addCriterion("belongto >", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoGreaterThanOrEqualTo(Integer value) {
            addCriterion("belongto >=", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoLessThan(Integer value) {
            addCriterion("belongto <", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoLessThanOrEqualTo(Integer value) {
            addCriterion("belongto <=", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoIn(List<Integer> values) {
            addCriterion("belongto in", values, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotIn(List<Integer> values) {
            addCriterion("belongto not in", values, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoBetween(Integer value1, Integer value2) {
            addCriterion("belongto between", value1, value2, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotBetween(Integer value1, Integer value2) {
            addCriterion("belongto not between", value1, value2, "belongto");
            return (Criteria) this;
        }

        public Criteria andDactylogramIsNull() {
            addCriterion("dactylogram is null");
            return (Criteria) this;
        }

        public Criteria andDactylogramIsNotNull() {
            addCriterion("dactylogram is not null");
            return (Criteria) this;
        }

        public Criteria andDactylogramEqualTo(String value) {
            addCriterion("dactylogram =", value, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramNotEqualTo(String value) {
            addCriterion("dactylogram <>", value, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramGreaterThan(String value) {
            addCriterion("dactylogram >", value, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramGreaterThanOrEqualTo(String value) {
            addCriterion("dactylogram >=", value, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramLessThan(String value) {
            addCriterion("dactylogram <", value, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramLessThanOrEqualTo(String value) {
            addCriterion("dactylogram <=", value, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramLike(String value) {
            addCriterion("dactylogram like", value, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramNotLike(String value) {
            addCriterion("dactylogram not like", value, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramIn(List<String> values) {
            addCriterion("dactylogram in", values, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramNotIn(List<String> values) {
            addCriterion("dactylogram not in", values, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramBetween(String value1, String value2) {
            addCriterion("dactylogram between", value1, value2, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andDactylogramNotBetween(String value1, String value2) {
            addCriterion("dactylogram not between", value1, value2, "dactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramIsNull() {
            addCriterion("assistantdactylogram is null");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramIsNotNull() {
            addCriterion("assistantdactylogram is not null");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramEqualTo(String value) {
            addCriterion("assistantdactylogram =", value, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramNotEqualTo(String value) {
            addCriterion("assistantdactylogram <>", value, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramGreaterThan(String value) {
            addCriterion("assistantdactylogram >", value, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramGreaterThanOrEqualTo(String value) {
            addCriterion("assistantdactylogram >=", value, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramLessThan(String value) {
            addCriterion("assistantdactylogram <", value, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramLessThanOrEqualTo(String value) {
            addCriterion("assistantdactylogram <=", value, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramLike(String value) {
            addCriterion("assistantdactylogram like", value, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramNotLike(String value) {
            addCriterion("assistantdactylogram not like", value, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramIn(List<String> values) {
            addCriterion("assistantdactylogram in", values, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramNotIn(List<String> values) {
            addCriterion("assistantdactylogram not in", values, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramBetween(String value1, String value2) {
            addCriterion("assistantdactylogram between", value1, value2, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andAssistantdactylogramNotBetween(String value1, String value2) {
            addCriterion("assistantdactylogram not between", value1, value2, "assistantdactylogram");
            return (Criteria) this;
        }

        public Criteria andPasswordlockIsNull() {
            addCriterion("passwordlock is null");
            return (Criteria) this;
        }

        public Criteria andPasswordlockIsNotNull() {
            addCriterion("passwordlock is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordlockEqualTo(Integer value) {
            addCriterion("passwordlock =", value, "passwordlock");
            return (Criteria) this;
        }

        public Criteria andPasswordlockNotEqualTo(Integer value) {
            addCriterion("passwordlock <>", value, "passwordlock");
            return (Criteria) this;
        }

        public Criteria andPasswordlockGreaterThan(Integer value) {
            addCriterion("passwordlock >", value, "passwordlock");
            return (Criteria) this;
        }

        public Criteria andPasswordlockGreaterThanOrEqualTo(Integer value) {
            addCriterion("passwordlock >=", value, "passwordlock");
            return (Criteria) this;
        }

        public Criteria andPasswordlockLessThan(Integer value) {
            addCriterion("passwordlock <", value, "passwordlock");
            return (Criteria) this;
        }

        public Criteria andPasswordlockLessThanOrEqualTo(Integer value) {
            addCriterion("passwordlock <=", value, "passwordlock");
            return (Criteria) this;
        }

        public Criteria andPasswordlockIn(List<Integer> values) {
            addCriterion("passwordlock in", values, "passwordlock");
            return (Criteria) this;
        }

        public Criteria andPasswordlockNotIn(List<Integer> values) {
            addCriterion("passwordlock not in", values, "passwordlock");
            return (Criteria) this;
        }

        public Criteria andPasswordlockBetween(Integer value1, Integer value2) {
            addCriterion("passwordlock between", value1, value2, "passwordlock");
            return (Criteria) this;
        }

        public Criteria andPasswordlockNotBetween(Integer value1, Integer value2) {
            addCriterion("passwordlock not between", value1, value2, "passwordlock");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongIsNull() {
            addCriterion("sumpasswordwrong is null");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongIsNotNull() {
            addCriterion("sumpasswordwrong is not null");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongEqualTo(Integer value) {
            addCriterion("sumpasswordwrong =", value, "sumpasswordwrong");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongNotEqualTo(Integer value) {
            addCriterion("sumpasswordwrong <>", value, "sumpasswordwrong");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongGreaterThan(Integer value) {
            addCriterion("sumpasswordwrong >", value, "sumpasswordwrong");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongGreaterThanOrEqualTo(Integer value) {
            addCriterion("sumpasswordwrong >=", value, "sumpasswordwrong");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongLessThan(Integer value) {
            addCriterion("sumpasswordwrong <", value, "sumpasswordwrong");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongLessThanOrEqualTo(Integer value) {
            addCriterion("sumpasswordwrong <=", value, "sumpasswordwrong");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongIn(List<Integer> values) {
            addCriterion("sumpasswordwrong in", values, "sumpasswordwrong");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongNotIn(List<Integer> values) {
            addCriterion("sumpasswordwrong not in", values, "sumpasswordwrong");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongBetween(Integer value1, Integer value2) {
            addCriterion("sumpasswordwrong between", value1, value2, "sumpasswordwrong");
            return (Criteria) this;
        }

        public Criteria andSumpasswordwrongNotBetween(Integer value1, Integer value2) {
            addCriterion("sumpasswordwrong not between", value1, value2, "sumpasswordwrong");
            return (Criteria) this;
        }

        public Criteria andOldpassword1IsNull() {
            addCriterion("oldpassword1 is null");
            return (Criteria) this;
        }

        public Criteria andOldpassword1IsNotNull() {
            addCriterion("oldpassword1 is not null");
            return (Criteria) this;
        }

        public Criteria andOldpassword1EqualTo(String value) {
            addCriterion("oldpassword1 =", value, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1NotEqualTo(String value) {
            addCriterion("oldpassword1 <>", value, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1GreaterThan(String value) {
            addCriterion("oldpassword1 >", value, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1GreaterThanOrEqualTo(String value) {
            addCriterion("oldpassword1 >=", value, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1LessThan(String value) {
            addCriterion("oldpassword1 <", value, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1LessThanOrEqualTo(String value) {
            addCriterion("oldpassword1 <=", value, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1Like(String value) {
            addCriterion("oldpassword1 like", value, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1NotLike(String value) {
            addCriterion("oldpassword1 not like", value, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1In(List<String> values) {
            addCriterion("oldpassword1 in", values, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1NotIn(List<String> values) {
            addCriterion("oldpassword1 not in", values, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1Between(String value1, String value2) {
            addCriterion("oldpassword1 between", value1, value2, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword1NotBetween(String value1, String value2) {
            addCriterion("oldpassword1 not between", value1, value2, "oldpassword1");
            return (Criteria) this;
        }

        public Criteria andOldpassword2IsNull() {
            addCriterion("oldpassword2 is null");
            return (Criteria) this;
        }

        public Criteria andOldpassword2IsNotNull() {
            addCriterion("oldpassword2 is not null");
            return (Criteria) this;
        }

        public Criteria andOldpassword2EqualTo(String value) {
            addCriterion("oldpassword2 =", value, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2NotEqualTo(String value) {
            addCriterion("oldpassword2 <>", value, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2GreaterThan(String value) {
            addCriterion("oldpassword2 >", value, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2GreaterThanOrEqualTo(String value) {
            addCriterion("oldpassword2 >=", value, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2LessThan(String value) {
            addCriterion("oldpassword2 <", value, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2LessThanOrEqualTo(String value) {
            addCriterion("oldpassword2 <=", value, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2Like(String value) {
            addCriterion("oldpassword2 like", value, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2NotLike(String value) {
            addCriterion("oldpassword2 not like", value, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2In(List<String> values) {
            addCriterion("oldpassword2 in", values, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2NotIn(List<String> values) {
            addCriterion("oldpassword2 not in", values, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2Between(String value1, String value2) {
            addCriterion("oldpassword2 between", value1, value2, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andOldpassword2NotBetween(String value1, String value2) {
            addCriterion("oldpassword2 not between", value1, value2, "oldpassword2");
            return (Criteria) this;
        }

        public Criteria andMsgstyleIsNull() {
            addCriterion("msgStyle is null");
            return (Criteria) this;
        }

        public Criteria andMsgstyleIsNotNull() {
            addCriterion("msgStyle is not null");
            return (Criteria) this;
        }

        public Criteria andMsgstyleEqualTo(String value) {
            addCriterion("msgStyle =", value, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleNotEqualTo(String value) {
            addCriterion("msgStyle <>", value, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleGreaterThan(String value) {
            addCriterion("msgStyle >", value, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleGreaterThanOrEqualTo(String value) {
            addCriterion("msgStyle >=", value, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleLessThan(String value) {
            addCriterion("msgStyle <", value, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleLessThanOrEqualTo(String value) {
            addCriterion("msgStyle <=", value, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleLike(String value) {
            addCriterion("msgStyle like", value, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleNotLike(String value) {
            addCriterion("msgStyle not like", value, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleIn(List<String> values) {
            addCriterion("msgStyle in", values, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleNotIn(List<String> values) {
            addCriterion("msgStyle not in", values, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleBetween(String value1, String value2) {
            addCriterion("msgStyle between", value1, value2, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMsgstyleNotBetween(String value1, String value2) {
            addCriterion("msgStyle not between", value1, value2, "msgstyle");
            return (Criteria) this;
        }

        public Criteria andMessagerurlIsNull() {
            addCriterion("messagerurl is null");
            return (Criteria) this;
        }

        public Criteria andMessagerurlIsNotNull() {
            addCriterion("messagerurl is not null");
            return (Criteria) this;
        }

        public Criteria andMessagerurlEqualTo(String value) {
            addCriterion("messagerurl =", value, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlNotEqualTo(String value) {
            addCriterion("messagerurl <>", value, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlGreaterThan(String value) {
            addCriterion("messagerurl >", value, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlGreaterThanOrEqualTo(String value) {
            addCriterion("messagerurl >=", value, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlLessThan(String value) {
            addCriterion("messagerurl <", value, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlLessThanOrEqualTo(String value) {
            addCriterion("messagerurl <=", value, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlLike(String value) {
            addCriterion("messagerurl like", value, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlNotLike(String value) {
            addCriterion("messagerurl not like", value, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlIn(List<String> values) {
            addCriterion("messagerurl in", values, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlNotIn(List<String> values) {
            addCriterion("messagerurl not in", values, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlBetween(String value1, String value2) {
            addCriterion("messagerurl between", value1, value2, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andMessagerurlNotBetween(String value1, String value2) {
            addCriterion("messagerurl not between", value1, value2, "messagerurl");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameIsNull() {
            addCriterion("pinyinlastname is null");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameIsNotNull() {
            addCriterion("pinyinlastname is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameEqualTo(String value) {
            addCriterion("pinyinlastname =", value, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameNotEqualTo(String value) {
            addCriterion("pinyinlastname <>", value, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameGreaterThan(String value) {
            addCriterion("pinyinlastname >", value, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameGreaterThanOrEqualTo(String value) {
            addCriterion("pinyinlastname >=", value, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameLessThan(String value) {
            addCriterion("pinyinlastname <", value, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameLessThanOrEqualTo(String value) {
            addCriterion("pinyinlastname <=", value, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameLike(String value) {
            addCriterion("pinyinlastname like", value, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameNotLike(String value) {
            addCriterion("pinyinlastname not like", value, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameIn(List<String> values) {
            addCriterion("pinyinlastname in", values, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameNotIn(List<String> values) {
            addCriterion("pinyinlastname not in", values, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameBetween(String value1, String value2) {
            addCriterion("pinyinlastname between", value1, value2, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andPinyinlastnameNotBetween(String value1, String value2) {
            addCriterion("pinyinlastname not between", value1, value2, "pinyinlastname");
            return (Criteria) this;
        }

        public Criteria andTokenkeyIsNull() {
            addCriterion("tokenkey is null");
            return (Criteria) this;
        }

        public Criteria andTokenkeyIsNotNull() {
            addCriterion("tokenkey is not null");
            return (Criteria) this;
        }

        public Criteria andTokenkeyEqualTo(String value) {
            addCriterion("tokenkey =", value, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyNotEqualTo(String value) {
            addCriterion("tokenkey <>", value, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyGreaterThan(String value) {
            addCriterion("tokenkey >", value, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyGreaterThanOrEqualTo(String value) {
            addCriterion("tokenkey >=", value, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyLessThan(String value) {
            addCriterion("tokenkey <", value, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyLessThanOrEqualTo(String value) {
            addCriterion("tokenkey <=", value, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyLike(String value) {
            addCriterion("tokenkey like", value, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyNotLike(String value) {
            addCriterion("tokenkey not like", value, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyIn(List<String> values) {
            addCriterion("tokenkey in", values, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyNotIn(List<String> values) {
            addCriterion("tokenkey not in", values, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyBetween(String value1, String value2) {
            addCriterion("tokenkey between", value1, value2, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andTokenkeyNotBetween(String value1, String value2) {
            addCriterion("tokenkey not between", value1, value2, "tokenkey");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeIsNull() {
            addCriterion("userUsbType is null");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeIsNotNull() {
            addCriterion("userUsbType is not null");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeEqualTo(String value) {
            addCriterion("userUsbType =", value, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeNotEqualTo(String value) {
            addCriterion("userUsbType <>", value, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeGreaterThan(String value) {
            addCriterion("userUsbType >", value, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeGreaterThanOrEqualTo(String value) {
            addCriterion("userUsbType >=", value, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeLessThan(String value) {
            addCriterion("userUsbType <", value, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeLessThanOrEqualTo(String value) {
            addCriterion("userUsbType <=", value, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeLike(String value) {
            addCriterion("userUsbType like", value, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeNotLike(String value) {
            addCriterion("userUsbType not like", value, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeIn(List<String> values) {
            addCriterion("userUsbType in", values, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeNotIn(List<String> values) {
            addCriterion("userUsbType not in", values, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeBetween(String value1, String value2) {
            addCriterion("userUsbType between", value1, value2, "userusbtype");
            return (Criteria) this;
        }

        public Criteria andUserusbtypeNotBetween(String value1, String value2) {
            addCriterion("userUsbType not between", value1, value2, "userusbtype");
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