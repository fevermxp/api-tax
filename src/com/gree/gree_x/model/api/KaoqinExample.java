package com.gree.gree_x.model.api;

import java.util.ArrayList;
import java.util.List;

public class KaoqinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KaoqinExample() {
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

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andTeamIsNull() {
            addCriterion("team is null");
            return (Criteria) this;
        }

        public Criteria andTeamIsNotNull() {
            addCriterion("team is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEqualTo(String value) {
            addCriterion("team =", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotEqualTo(String value) {
            addCriterion("team <>", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThan(String value) {
            addCriterion("team >", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThanOrEqualTo(String value) {
            addCriterion("team >=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThan(String value) {
            addCriterion("team <", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThanOrEqualTo(String value) {
            addCriterion("team <=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLike(String value) {
            addCriterion("team like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotLike(String value) {
            addCriterion("team not like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamIn(List<String> values) {
            addCriterion("team in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotIn(List<String> values) {
            addCriterion("team not in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamBetween(String value1, String value2) {
            addCriterion("team between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotBetween(String value1, String value2) {
            addCriterion("team not between", value1, value2, "team");
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

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andYcqtsIsNull() {
            addCriterion("ycqts is null");
            return (Criteria) this;
        }

        public Criteria andYcqtsIsNotNull() {
            addCriterion("ycqts is not null");
            return (Criteria) this;
        }

        public Criteria andYcqtsEqualTo(Double value) {
            addCriterion("ycqts =", value, "ycqts");
            return (Criteria) this;
        }

        public Criteria andYcqtsNotEqualTo(Double value) {
            addCriterion("ycqts <>", value, "ycqts");
            return (Criteria) this;
        }

        public Criteria andYcqtsGreaterThan(Double value) {
            addCriterion("ycqts >", value, "ycqts");
            return (Criteria) this;
        }

        public Criteria andYcqtsGreaterThanOrEqualTo(Double value) {
            addCriterion("ycqts >=", value, "ycqts");
            return (Criteria) this;
        }

        public Criteria andYcqtsLessThan(Double value) {
            addCriterion("ycqts <", value, "ycqts");
            return (Criteria) this;
        }

        public Criteria andYcqtsLessThanOrEqualTo(Double value) {
            addCriterion("ycqts <=", value, "ycqts");
            return (Criteria) this;
        }

        public Criteria andYcqtsIn(List<Double> values) {
            addCriterion("ycqts in", values, "ycqts");
            return (Criteria) this;
        }

        public Criteria andYcqtsNotIn(List<Double> values) {
            addCriterion("ycqts not in", values, "ycqts");
            return (Criteria) this;
        }

        public Criteria andYcqtsBetween(Double value1, Double value2) {
            addCriterion("ycqts between", value1, value2, "ycqts");
            return (Criteria) this;
        }

        public Criteria andYcqtsNotBetween(Double value1, Double value2) {
            addCriterion("ycqts not between", value1, value2, "ycqts");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsIsNull() {
            addCriterion("gzrcqts is null");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsIsNotNull() {
            addCriterion("gzrcqts is not null");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsEqualTo(Double value) {
            addCriterion("gzrcqts =", value, "gzrcqts");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsNotEqualTo(Double value) {
            addCriterion("gzrcqts <>", value, "gzrcqts");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsGreaterThan(Double value) {
            addCriterion("gzrcqts >", value, "gzrcqts");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsGreaterThanOrEqualTo(Double value) {
            addCriterion("gzrcqts >=", value, "gzrcqts");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsLessThan(Double value) {
            addCriterion("gzrcqts <", value, "gzrcqts");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsLessThanOrEqualTo(Double value) {
            addCriterion("gzrcqts <=", value, "gzrcqts");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsIn(List<Double> values) {
            addCriterion("gzrcqts in", values, "gzrcqts");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsNotIn(List<Double> values) {
            addCriterion("gzrcqts not in", values, "gzrcqts");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsBetween(Double value1, Double value2) {
            addCriterion("gzrcqts between", value1, value2, "gzrcqts");
            return (Criteria) this;
        }

        public Criteria andGzrcqtsNotBetween(Double value1, Double value2) {
            addCriterion("gzrcqts not between", value1, value2, "gzrcqts");
            return (Criteria) this;
        }

        public Criteria andSjcqtsIsNull() {
            addCriterion("sjcqts is null");
            return (Criteria) this;
        }

        public Criteria andSjcqtsIsNotNull() {
            addCriterion("sjcqts is not null");
            return (Criteria) this;
        }

        public Criteria andSjcqtsEqualTo(Double value) {
            addCriterion("sjcqts =", value, "sjcqts");
            return (Criteria) this;
        }

        public Criteria andSjcqtsNotEqualTo(Double value) {
            addCriterion("sjcqts <>", value, "sjcqts");
            return (Criteria) this;
        }

        public Criteria andSjcqtsGreaterThan(Double value) {
            addCriterion("sjcqts >", value, "sjcqts");
            return (Criteria) this;
        }

        public Criteria andSjcqtsGreaterThanOrEqualTo(Double value) {
            addCriterion("sjcqts >=", value, "sjcqts");
            return (Criteria) this;
        }

        public Criteria andSjcqtsLessThan(Double value) {
            addCriterion("sjcqts <", value, "sjcqts");
            return (Criteria) this;
        }

        public Criteria andSjcqtsLessThanOrEqualTo(Double value) {
            addCriterion("sjcqts <=", value, "sjcqts");
            return (Criteria) this;
        }

        public Criteria andSjcqtsIn(List<Double> values) {
            addCriterion("sjcqts in", values, "sjcqts");
            return (Criteria) this;
        }

        public Criteria andSjcqtsNotIn(List<Double> values) {
            addCriterion("sjcqts not in", values, "sjcqts");
            return (Criteria) this;
        }

        public Criteria andSjcqtsBetween(Double value1, Double value2) {
            addCriterion("sjcqts between", value1, value2, "sjcqts");
            return (Criteria) this;
        }

        public Criteria andSjcqtsNotBetween(Double value1, Double value2) {
            addCriterion("sjcqts not between", value1, value2, "sjcqts");
            return (Criteria) this;
        }

        public Criteria andSchjtsIsNull() {
            addCriterion("schjts is null");
            return (Criteria) this;
        }

        public Criteria andSchjtsIsNotNull() {
            addCriterion("schjts is not null");
            return (Criteria) this;
        }

        public Criteria andSchjtsEqualTo(Double value) {
            addCriterion("schjts =", value, "schjts");
            return (Criteria) this;
        }

        public Criteria andSchjtsNotEqualTo(Double value) {
            addCriterion("schjts <>", value, "schjts");
            return (Criteria) this;
        }

        public Criteria andSchjtsGreaterThan(Double value) {
            addCriterion("schjts >", value, "schjts");
            return (Criteria) this;
        }

        public Criteria andSchjtsGreaterThanOrEqualTo(Double value) {
            addCriterion("schjts >=", value, "schjts");
            return (Criteria) this;
        }

        public Criteria andSchjtsLessThan(Double value) {
            addCriterion("schjts <", value, "schjts");
            return (Criteria) this;
        }

        public Criteria andSchjtsLessThanOrEqualTo(Double value) {
            addCriterion("schjts <=", value, "schjts");
            return (Criteria) this;
        }

        public Criteria andSchjtsIn(List<Double> values) {
            addCriterion("schjts in", values, "schjts");
            return (Criteria) this;
        }

        public Criteria andSchjtsNotIn(List<Double> values) {
            addCriterion("schjts not in", values, "schjts");
            return (Criteria) this;
        }

        public Criteria andSchjtsBetween(Double value1, Double value2) {
            addCriterion("schjts between", value1, value2, "schjts");
            return (Criteria) this;
        }

        public Criteria andSchjtsNotBetween(Double value1, Double value2) {
            addCriterion("schjts not between", value1, value2, "schjts");
            return (Criteria) this;
        }

        public Criteria andYcqzxssIsNull() {
            addCriterion("ycqzxss is null");
            return (Criteria) this;
        }

        public Criteria andYcqzxssIsNotNull() {
            addCriterion("ycqzxss is not null");
            return (Criteria) this;
        }

        public Criteria andYcqzxssEqualTo(Double value) {
            addCriterion("ycqzxss =", value, "ycqzxss");
            return (Criteria) this;
        }

        public Criteria andYcqzxssNotEqualTo(Double value) {
            addCriterion("ycqzxss <>", value, "ycqzxss");
            return (Criteria) this;
        }

        public Criteria andYcqzxssGreaterThan(Double value) {
            addCriterion("ycqzxss >", value, "ycqzxss");
            return (Criteria) this;
        }

        public Criteria andYcqzxssGreaterThanOrEqualTo(Double value) {
            addCriterion("ycqzxss >=", value, "ycqzxss");
            return (Criteria) this;
        }

        public Criteria andYcqzxssLessThan(Double value) {
            addCriterion("ycqzxss <", value, "ycqzxss");
            return (Criteria) this;
        }

        public Criteria andYcqzxssLessThanOrEqualTo(Double value) {
            addCriterion("ycqzxss <=", value, "ycqzxss");
            return (Criteria) this;
        }

        public Criteria andYcqzxssIn(List<Double> values) {
            addCriterion("ycqzxss in", values, "ycqzxss");
            return (Criteria) this;
        }

        public Criteria andYcqzxssNotIn(List<Double> values) {
            addCriterion("ycqzxss not in", values, "ycqzxss");
            return (Criteria) this;
        }

        public Criteria andYcqzxssBetween(Double value1, Double value2) {
            addCriterion("ycqzxss between", value1, value2, "ycqzxss");
            return (Criteria) this;
        }

        public Criteria andYcqzxssNotBetween(Double value1, Double value2) {
            addCriterion("ycqzxss not between", value1, value2, "ycqzxss");
            return (Criteria) this;
        }

        public Criteria andPrjbxsIsNull() {
            addCriterion("prjbxs is null");
            return (Criteria) this;
        }

        public Criteria andPrjbxsIsNotNull() {
            addCriterion("prjbxs is not null");
            return (Criteria) this;
        }

        public Criteria andPrjbxsEqualTo(Double value) {
            addCriterion("prjbxs =", value, "prjbxs");
            return (Criteria) this;
        }

        public Criteria andPrjbxsNotEqualTo(Double value) {
            addCriterion("prjbxs <>", value, "prjbxs");
            return (Criteria) this;
        }

        public Criteria andPrjbxsGreaterThan(Double value) {
            addCriterion("prjbxs >", value, "prjbxs");
            return (Criteria) this;
        }

        public Criteria andPrjbxsGreaterThanOrEqualTo(Double value) {
            addCriterion("prjbxs >=", value, "prjbxs");
            return (Criteria) this;
        }

        public Criteria andPrjbxsLessThan(Double value) {
            addCriterion("prjbxs <", value, "prjbxs");
            return (Criteria) this;
        }

        public Criteria andPrjbxsLessThanOrEqualTo(Double value) {
            addCriterion("prjbxs <=", value, "prjbxs");
            return (Criteria) this;
        }

        public Criteria andPrjbxsIn(List<Double> values) {
            addCriterion("prjbxs in", values, "prjbxs");
            return (Criteria) this;
        }

        public Criteria andPrjbxsNotIn(List<Double> values) {
            addCriterion("prjbxs not in", values, "prjbxs");
            return (Criteria) this;
        }

        public Criteria andPrjbxsBetween(Double value1, Double value2) {
            addCriterion("prjbxs between", value1, value2, "prjbxs");
            return (Criteria) this;
        }

        public Criteria andPrjbxsNotBetween(Double value1, Double value2) {
            addCriterion("prjbxs not between", value1, value2, "prjbxs");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsIsNull() {
            addCriterion("jiarjbxs is null");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsIsNotNull() {
            addCriterion("jiarjbxs is not null");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsEqualTo(Double value) {
            addCriterion("jiarjbxs =", value, "jiarjbxs");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsNotEqualTo(Double value) {
            addCriterion("jiarjbxs <>", value, "jiarjbxs");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsGreaterThan(Double value) {
            addCriterion("jiarjbxs >", value, "jiarjbxs");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsGreaterThanOrEqualTo(Double value) {
            addCriterion("jiarjbxs >=", value, "jiarjbxs");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsLessThan(Double value) {
            addCriterion("jiarjbxs <", value, "jiarjbxs");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsLessThanOrEqualTo(Double value) {
            addCriterion("jiarjbxs <=", value, "jiarjbxs");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsIn(List<Double> values) {
            addCriterion("jiarjbxs in", values, "jiarjbxs");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsNotIn(List<Double> values) {
            addCriterion("jiarjbxs not in", values, "jiarjbxs");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsBetween(Double value1, Double value2) {
            addCriterion("jiarjbxs between", value1, value2, "jiarjbxs");
            return (Criteria) this;
        }

        public Criteria andJiarjbxsNotBetween(Double value1, Double value2) {
            addCriterion("jiarjbxs not between", value1, value2, "jiarjbxs");
            return (Criteria) this;
        }

        public Criteria andJierjbxsIsNull() {
            addCriterion("jierjbxs is null");
            return (Criteria) this;
        }

        public Criteria andJierjbxsIsNotNull() {
            addCriterion("jierjbxs is not null");
            return (Criteria) this;
        }

        public Criteria andJierjbxsEqualTo(Double value) {
            addCriterion("jierjbxs =", value, "jierjbxs");
            return (Criteria) this;
        }

        public Criteria andJierjbxsNotEqualTo(Double value) {
            addCriterion("jierjbxs <>", value, "jierjbxs");
            return (Criteria) this;
        }

        public Criteria andJierjbxsGreaterThan(Double value) {
            addCriterion("jierjbxs >", value, "jierjbxs");
            return (Criteria) this;
        }

        public Criteria andJierjbxsGreaterThanOrEqualTo(Double value) {
            addCriterion("jierjbxs >=", value, "jierjbxs");
            return (Criteria) this;
        }

        public Criteria andJierjbxsLessThan(Double value) {
            addCriterion("jierjbxs <", value, "jierjbxs");
            return (Criteria) this;
        }

        public Criteria andJierjbxsLessThanOrEqualTo(Double value) {
            addCriterion("jierjbxs <=", value, "jierjbxs");
            return (Criteria) this;
        }

        public Criteria andJierjbxsIn(List<Double> values) {
            addCriterion("jierjbxs in", values, "jierjbxs");
            return (Criteria) this;
        }

        public Criteria andJierjbxsNotIn(List<Double> values) {
            addCriterion("jierjbxs not in", values, "jierjbxs");
            return (Criteria) this;
        }

        public Criteria andJierjbxsBetween(Double value1, Double value2) {
            addCriterion("jierjbxs between", value1, value2, "jierjbxs");
            return (Criteria) this;
        }

        public Criteria andJierjbxsNotBetween(Double value1, Double value2) {
            addCriterion("jierjbxs not between", value1, value2, "jierjbxs");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsIsNull() {
            addCriterion("jjrsbts is null");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsIsNotNull() {
            addCriterion("jjrsbts is not null");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsEqualTo(Double value) {
            addCriterion("jjrsbts =", value, "jjrsbts");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsNotEqualTo(Double value) {
            addCriterion("jjrsbts <>", value, "jjrsbts");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsGreaterThan(Double value) {
            addCriterion("jjrsbts >", value, "jjrsbts");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsGreaterThanOrEqualTo(Double value) {
            addCriterion("jjrsbts >=", value, "jjrsbts");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsLessThan(Double value) {
            addCriterion("jjrsbts <", value, "jjrsbts");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsLessThanOrEqualTo(Double value) {
            addCriterion("jjrsbts <=", value, "jjrsbts");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsIn(List<Double> values) {
            addCriterion("jjrsbts in", values, "jjrsbts");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsNotIn(List<Double> values) {
            addCriterion("jjrsbts not in", values, "jjrsbts");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsBetween(Double value1, Double value2) {
            addCriterion("jjrsbts between", value1, value2, "jjrsbts");
            return (Criteria) this;
        }

        public Criteria andJjrsbtsNotBetween(Double value1, Double value2) {
            addCriterion("jjrsbts not between", value1, value2, "jjrsbts");
            return (Criteria) this;
        }

        public Criteria andGspxtsIsNull() {
            addCriterion("gspxts is null");
            return (Criteria) this;
        }

        public Criteria andGspxtsIsNotNull() {
            addCriterion("gspxts is not null");
            return (Criteria) this;
        }

        public Criteria andGspxtsEqualTo(Double value) {
            addCriterion("gspxts =", value, "gspxts");
            return (Criteria) this;
        }

        public Criteria andGspxtsNotEqualTo(Double value) {
            addCriterion("gspxts <>", value, "gspxts");
            return (Criteria) this;
        }

        public Criteria andGspxtsGreaterThan(Double value) {
            addCriterion("gspxts >", value, "gspxts");
            return (Criteria) this;
        }

        public Criteria andGspxtsGreaterThanOrEqualTo(Double value) {
            addCriterion("gspxts >=", value, "gspxts");
            return (Criteria) this;
        }

        public Criteria andGspxtsLessThan(Double value) {
            addCriterion("gspxts <", value, "gspxts");
            return (Criteria) this;
        }

        public Criteria andGspxtsLessThanOrEqualTo(Double value) {
            addCriterion("gspxts <=", value, "gspxts");
            return (Criteria) this;
        }

        public Criteria andGspxtsIn(List<Double> values) {
            addCriterion("gspxts in", values, "gspxts");
            return (Criteria) this;
        }

        public Criteria andGspxtsNotIn(List<Double> values) {
            addCriterion("gspxts not in", values, "gspxts");
            return (Criteria) this;
        }

        public Criteria andGspxtsBetween(Double value1, Double value2) {
            addCriterion("gspxts between", value1, value2, "gspxts");
            return (Criteria) this;
        }

        public Criteria andGspxtsNotBetween(Double value1, Double value2) {
            addCriterion("gspxts not between", value1, value2, "gspxts");
            return (Criteria) this;
        }

        public Criteria andFcpxtsIsNull() {
            addCriterion("fcpxts is null");
            return (Criteria) this;
        }

        public Criteria andFcpxtsIsNotNull() {
            addCriterion("fcpxts is not null");
            return (Criteria) this;
        }

        public Criteria andFcpxtsEqualTo(Double value) {
            addCriterion("fcpxts =", value, "fcpxts");
            return (Criteria) this;
        }

        public Criteria andFcpxtsNotEqualTo(Double value) {
            addCriterion("fcpxts <>", value, "fcpxts");
            return (Criteria) this;
        }

        public Criteria andFcpxtsGreaterThan(Double value) {
            addCriterion("fcpxts >", value, "fcpxts");
            return (Criteria) this;
        }

        public Criteria andFcpxtsGreaterThanOrEqualTo(Double value) {
            addCriterion("fcpxts >=", value, "fcpxts");
            return (Criteria) this;
        }

        public Criteria andFcpxtsLessThan(Double value) {
            addCriterion("fcpxts <", value, "fcpxts");
            return (Criteria) this;
        }

        public Criteria andFcpxtsLessThanOrEqualTo(Double value) {
            addCriterion("fcpxts <=", value, "fcpxts");
            return (Criteria) this;
        }

        public Criteria andFcpxtsIn(List<Double> values) {
            addCriterion("fcpxts in", values, "fcpxts");
            return (Criteria) this;
        }

        public Criteria andFcpxtsNotIn(List<Double> values) {
            addCriterion("fcpxts not in", values, "fcpxts");
            return (Criteria) this;
        }

        public Criteria andFcpxtsBetween(Double value1, Double value2) {
            addCriterion("fcpxts between", value1, value2, "fcpxts");
            return (Criteria) this;
        }

        public Criteria andFcpxtsNotBetween(Double value1, Double value2) {
            addCriterion("fcpxts not between", value1, value2, "fcpxts");
            return (Criteria) this;
        }

        public Criteria andCbtsIsNull() {
            addCriterion("cbts is null");
            return (Criteria) this;
        }

        public Criteria andCbtsIsNotNull() {
            addCriterion("cbts is not null");
            return (Criteria) this;
        }

        public Criteria andCbtsEqualTo(Double value) {
            addCriterion("cbts =", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsNotEqualTo(Double value) {
            addCriterion("cbts <>", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsGreaterThan(Double value) {
            addCriterion("cbts >", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsGreaterThanOrEqualTo(Double value) {
            addCriterion("cbts >=", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsLessThan(Double value) {
            addCriterion("cbts <", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsLessThanOrEqualTo(Double value) {
            addCriterion("cbts <=", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsIn(List<Double> values) {
            addCriterion("cbts in", values, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsNotIn(List<Double> values) {
            addCriterion("cbts not in", values, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsBetween(Double value1, Double value2) {
            addCriterion("cbts between", value1, value2, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsNotBetween(Double value1, Double value2) {
            addCriterion("cbts not between", value1, value2, "cbts");
            return (Criteria) this;
        }

        public Criteria andNxjtsIsNull() {
            addCriterion("nxjts is null");
            return (Criteria) this;
        }

        public Criteria andNxjtsIsNotNull() {
            addCriterion("nxjts is not null");
            return (Criteria) this;
        }

        public Criteria andNxjtsEqualTo(Double value) {
            addCriterion("nxjts =", value, "nxjts");
            return (Criteria) this;
        }

        public Criteria andNxjtsNotEqualTo(Double value) {
            addCriterion("nxjts <>", value, "nxjts");
            return (Criteria) this;
        }

        public Criteria andNxjtsGreaterThan(Double value) {
            addCriterion("nxjts >", value, "nxjts");
            return (Criteria) this;
        }

        public Criteria andNxjtsGreaterThanOrEqualTo(Double value) {
            addCriterion("nxjts >=", value, "nxjts");
            return (Criteria) this;
        }

        public Criteria andNxjtsLessThan(Double value) {
            addCriterion("nxjts <", value, "nxjts");
            return (Criteria) this;
        }

        public Criteria andNxjtsLessThanOrEqualTo(Double value) {
            addCriterion("nxjts <=", value, "nxjts");
            return (Criteria) this;
        }

        public Criteria andNxjtsIn(List<Double> values) {
            addCriterion("nxjts in", values, "nxjts");
            return (Criteria) this;
        }

        public Criteria andNxjtsNotIn(List<Double> values) {
            addCriterion("nxjts not in", values, "nxjts");
            return (Criteria) this;
        }

        public Criteria andNxjtsBetween(Double value1, Double value2) {
            addCriterion("nxjts between", value1, value2, "nxjts");
            return (Criteria) this;
        }

        public Criteria andNxjtsNotBetween(Double value1, Double value2) {
            addCriterion("nxjts not between", value1, value2, "nxjts");
            return (Criteria) this;
        }

        public Criteria andBjtsIsNull() {
            addCriterion("bjts is null");
            return (Criteria) this;
        }

        public Criteria andBjtsIsNotNull() {
            addCriterion("bjts is not null");
            return (Criteria) this;
        }

        public Criteria andBjtsEqualTo(Double value) {
            addCriterion("bjts =", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsNotEqualTo(Double value) {
            addCriterion("bjts <>", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsGreaterThan(Double value) {
            addCriterion("bjts >", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsGreaterThanOrEqualTo(Double value) {
            addCriterion("bjts >=", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsLessThan(Double value) {
            addCriterion("bjts <", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsLessThanOrEqualTo(Double value) {
            addCriterion("bjts <=", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsIn(List<Double> values) {
            addCriterion("bjts in", values, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsNotIn(List<Double> values) {
            addCriterion("bjts not in", values, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsBetween(Double value1, Double value2) {
            addCriterion("bjts between", value1, value2, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsNotBetween(Double value1, Double value2) {
            addCriterion("bjts not between", value1, value2, "bjts");
            return (Criteria) this;
        }

        public Criteria andSjtsIsNull() {
            addCriterion("sjts is null");
            return (Criteria) this;
        }

        public Criteria andSjtsIsNotNull() {
            addCriterion("sjts is not null");
            return (Criteria) this;
        }

        public Criteria andSjtsEqualTo(Double value) {
            addCriterion("sjts =", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsNotEqualTo(Double value) {
            addCriterion("sjts <>", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsGreaterThan(Double value) {
            addCriterion("sjts >", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsGreaterThanOrEqualTo(Double value) {
            addCriterion("sjts >=", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsLessThan(Double value) {
            addCriterion("sjts <", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsLessThanOrEqualTo(Double value) {
            addCriterion("sjts <=", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsIn(List<Double> values) {
            addCriterion("sjts in", values, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsNotIn(List<Double> values) {
            addCriterion("sjts not in", values, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsBetween(Double value1, Double value2) {
            addCriterion("sjts between", value1, value2, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsNotBetween(Double value1, Double value2) {
            addCriterion("sjts not between", value1, value2, "sjts");
            return (Criteria) this;
        }

        public Criteria andCjtsIsNull() {
            addCriterion("cjts is null");
            return (Criteria) this;
        }

        public Criteria andCjtsIsNotNull() {
            addCriterion("cjts is not null");
            return (Criteria) this;
        }

        public Criteria andCjtsEqualTo(Double value) {
            addCriterion("cjts =", value, "cjts");
            return (Criteria) this;
        }

        public Criteria andCjtsNotEqualTo(Double value) {
            addCriterion("cjts <>", value, "cjts");
            return (Criteria) this;
        }

        public Criteria andCjtsGreaterThan(Double value) {
            addCriterion("cjts >", value, "cjts");
            return (Criteria) this;
        }

        public Criteria andCjtsGreaterThanOrEqualTo(Double value) {
            addCriterion("cjts >=", value, "cjts");
            return (Criteria) this;
        }

        public Criteria andCjtsLessThan(Double value) {
            addCriterion("cjts <", value, "cjts");
            return (Criteria) this;
        }

        public Criteria andCjtsLessThanOrEqualTo(Double value) {
            addCriterion("cjts <=", value, "cjts");
            return (Criteria) this;
        }

        public Criteria andCjtsIn(List<Double> values) {
            addCriterion("cjts in", values, "cjts");
            return (Criteria) this;
        }

        public Criteria andCjtsNotIn(List<Double> values) {
            addCriterion("cjts not in", values, "cjts");
            return (Criteria) this;
        }

        public Criteria andCjtsBetween(Double value1, Double value2) {
            addCriterion("cjts between", value1, value2, "cjts");
            return (Criteria) this;
        }

        public Criteria andCjtsNotBetween(Double value1, Double value2) {
            addCriterion("cjts not between", value1, value2, "cjts");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsIsNull() {
            addCriterion("jhsyjts is null");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsIsNotNull() {
            addCriterion("jhsyjts is not null");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsEqualTo(Double value) {
            addCriterion("jhsyjts =", value, "jhsyjts");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsNotEqualTo(Double value) {
            addCriterion("jhsyjts <>", value, "jhsyjts");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsGreaterThan(Double value) {
            addCriterion("jhsyjts >", value, "jhsyjts");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsGreaterThanOrEqualTo(Double value) {
            addCriterion("jhsyjts >=", value, "jhsyjts");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsLessThan(Double value) {
            addCriterion("jhsyjts <", value, "jhsyjts");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsLessThanOrEqualTo(Double value) {
            addCriterion("jhsyjts <=", value, "jhsyjts");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsIn(List<Double> values) {
            addCriterion("jhsyjts in", values, "jhsyjts");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsNotIn(List<Double> values) {
            addCriterion("jhsyjts not in", values, "jhsyjts");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsBetween(Double value1, Double value2) {
            addCriterion("jhsyjts between", value1, value2, "jhsyjts");
            return (Criteria) this;
        }

        public Criteria andJhsyjtsNotBetween(Double value1, Double value2) {
            addCriterion("jhsyjts not between", value1, value2, "jhsyjts");
            return (Criteria) this;
        }

        public Criteria andGsjtsIsNull() {
            addCriterion("gsjts is null");
            return (Criteria) this;
        }

        public Criteria andGsjtsIsNotNull() {
            addCriterion("gsjts is not null");
            return (Criteria) this;
        }

        public Criteria andGsjtsEqualTo(Double value) {
            addCriterion("gsjts =", value, "gsjts");
            return (Criteria) this;
        }

        public Criteria andGsjtsNotEqualTo(Double value) {
            addCriterion("gsjts <>", value, "gsjts");
            return (Criteria) this;
        }

        public Criteria andGsjtsGreaterThan(Double value) {
            addCriterion("gsjts >", value, "gsjts");
            return (Criteria) this;
        }

        public Criteria andGsjtsGreaterThanOrEqualTo(Double value) {
            addCriterion("gsjts >=", value, "gsjts");
            return (Criteria) this;
        }

        public Criteria andGsjtsLessThan(Double value) {
            addCriterion("gsjts <", value, "gsjts");
            return (Criteria) this;
        }

        public Criteria andGsjtsLessThanOrEqualTo(Double value) {
            addCriterion("gsjts <=", value, "gsjts");
            return (Criteria) this;
        }

        public Criteria andGsjtsIn(List<Double> values) {
            addCriterion("gsjts in", values, "gsjts");
            return (Criteria) this;
        }

        public Criteria andGsjtsNotIn(List<Double> values) {
            addCriterion("gsjts not in", values, "gsjts");
            return (Criteria) this;
        }

        public Criteria andGsjtsBetween(Double value1, Double value2) {
            addCriterion("gsjts between", value1, value2, "gsjts");
            return (Criteria) this;
        }

        public Criteria andGsjtsNotBetween(Double value1, Double value2) {
            addCriterion("gsjts not between", value1, value2, "gsjts");
            return (Criteria) this;
        }

        public Criteria andHjtsIsNull() {
            addCriterion("hjts is null");
            return (Criteria) this;
        }

        public Criteria andHjtsIsNotNull() {
            addCriterion("hjts is not null");
            return (Criteria) this;
        }

        public Criteria andHjtsEqualTo(Double value) {
            addCriterion("hjts =", value, "hjts");
            return (Criteria) this;
        }

        public Criteria andHjtsNotEqualTo(Double value) {
            addCriterion("hjts <>", value, "hjts");
            return (Criteria) this;
        }

        public Criteria andHjtsGreaterThan(Double value) {
            addCriterion("hjts >", value, "hjts");
            return (Criteria) this;
        }

        public Criteria andHjtsGreaterThanOrEqualTo(Double value) {
            addCriterion("hjts >=", value, "hjts");
            return (Criteria) this;
        }

        public Criteria andHjtsLessThan(Double value) {
            addCriterion("hjts <", value, "hjts");
            return (Criteria) this;
        }

        public Criteria andHjtsLessThanOrEqualTo(Double value) {
            addCriterion("hjts <=", value, "hjts");
            return (Criteria) this;
        }

        public Criteria andHjtsIn(List<Double> values) {
            addCriterion("hjts in", values, "hjts");
            return (Criteria) this;
        }

        public Criteria andHjtsNotIn(List<Double> values) {
            addCriterion("hjts not in", values, "hjts");
            return (Criteria) this;
        }

        public Criteria andHjtsBetween(Double value1, Double value2) {
            addCriterion("hjts between", value1, value2, "hjts");
            return (Criteria) this;
        }

        public Criteria andHjtsNotBetween(Double value1, Double value2) {
            addCriterion("hjts not between", value1, value2, "hjts");
            return (Criteria) this;
        }

        public Criteria andSangjtsIsNull() {
            addCriterion("sangjts is null");
            return (Criteria) this;
        }

        public Criteria andSangjtsIsNotNull() {
            addCriterion("sangjts is not null");
            return (Criteria) this;
        }

        public Criteria andSangjtsEqualTo(Double value) {
            addCriterion("sangjts =", value, "sangjts");
            return (Criteria) this;
        }

        public Criteria andSangjtsNotEqualTo(Double value) {
            addCriterion("sangjts <>", value, "sangjts");
            return (Criteria) this;
        }

        public Criteria andSangjtsGreaterThan(Double value) {
            addCriterion("sangjts >", value, "sangjts");
            return (Criteria) this;
        }

        public Criteria andSangjtsGreaterThanOrEqualTo(Double value) {
            addCriterion("sangjts >=", value, "sangjts");
            return (Criteria) this;
        }

        public Criteria andSangjtsLessThan(Double value) {
            addCriterion("sangjts <", value, "sangjts");
            return (Criteria) this;
        }

        public Criteria andSangjtsLessThanOrEqualTo(Double value) {
            addCriterion("sangjts <=", value, "sangjts");
            return (Criteria) this;
        }

        public Criteria andSangjtsIn(List<Double> values) {
            addCriterion("sangjts in", values, "sangjts");
            return (Criteria) this;
        }

        public Criteria andSangjtsNotIn(List<Double> values) {
            addCriterion("sangjts not in", values, "sangjts");
            return (Criteria) this;
        }

        public Criteria andSangjtsBetween(Double value1, Double value2) {
            addCriterion("sangjts between", value1, value2, "sangjts");
            return (Criteria) this;
        }

        public Criteria andSangjtsNotBetween(Double value1, Double value2) {
            addCriterion("sangjts not between", value1, value2, "sangjts");
            return (Criteria) this;
        }

        public Criteria andBrjtsIsNull() {
            addCriterion("brjts is null");
            return (Criteria) this;
        }

        public Criteria andBrjtsIsNotNull() {
            addCriterion("brjts is not null");
            return (Criteria) this;
        }

        public Criteria andBrjtsEqualTo(Double value) {
            addCriterion("brjts =", value, "brjts");
            return (Criteria) this;
        }

        public Criteria andBrjtsNotEqualTo(Double value) {
            addCriterion("brjts <>", value, "brjts");
            return (Criteria) this;
        }

        public Criteria andBrjtsGreaterThan(Double value) {
            addCriterion("brjts >", value, "brjts");
            return (Criteria) this;
        }

        public Criteria andBrjtsGreaterThanOrEqualTo(Double value) {
            addCriterion("brjts >=", value, "brjts");
            return (Criteria) this;
        }

        public Criteria andBrjtsLessThan(Double value) {
            addCriterion("brjts <", value, "brjts");
            return (Criteria) this;
        }

        public Criteria andBrjtsLessThanOrEqualTo(Double value) {
            addCriterion("brjts <=", value, "brjts");
            return (Criteria) this;
        }

        public Criteria andBrjtsIn(List<Double> values) {
            addCriterion("brjts in", values, "brjts");
            return (Criteria) this;
        }

        public Criteria andBrjtsNotIn(List<Double> values) {
            addCriterion("brjts not in", values, "brjts");
            return (Criteria) this;
        }

        public Criteria andBrjtsBetween(Double value1, Double value2) {
            addCriterion("brjts between", value1, value2, "brjts");
            return (Criteria) this;
        }

        public Criteria andBrjtsNotBetween(Double value1, Double value2) {
            addCriterion("brjts not between", value1, value2, "brjts");
            return (Criteria) this;
        }

        public Criteria andKgtsIsNull() {
            addCriterion("kgts is null");
            return (Criteria) this;
        }

        public Criteria andKgtsIsNotNull() {
            addCriterion("kgts is not null");
            return (Criteria) this;
        }

        public Criteria andKgtsEqualTo(Double value) {
            addCriterion("kgts =", value, "kgts");
            return (Criteria) this;
        }

        public Criteria andKgtsNotEqualTo(Double value) {
            addCriterion("kgts <>", value, "kgts");
            return (Criteria) this;
        }

        public Criteria andKgtsGreaterThan(Double value) {
            addCriterion("kgts >", value, "kgts");
            return (Criteria) this;
        }

        public Criteria andKgtsGreaterThanOrEqualTo(Double value) {
            addCriterion("kgts >=", value, "kgts");
            return (Criteria) this;
        }

        public Criteria andKgtsLessThan(Double value) {
            addCriterion("kgts <", value, "kgts");
            return (Criteria) this;
        }

        public Criteria andKgtsLessThanOrEqualTo(Double value) {
            addCriterion("kgts <=", value, "kgts");
            return (Criteria) this;
        }

        public Criteria andKgtsIn(List<Double> values) {
            addCriterion("kgts in", values, "kgts");
            return (Criteria) this;
        }

        public Criteria andKgtsNotIn(List<Double> values) {
            addCriterion("kgts not in", values, "kgts");
            return (Criteria) this;
        }

        public Criteria andKgtsBetween(Double value1, Double value2) {
            addCriterion("kgts between", value1, value2, "kgts");
            return (Criteria) this;
        }

        public Criteria andKgtsNotBetween(Double value1, Double value2) {
            addCriterion("kgts not between", value1, value2, "kgts");
            return (Criteria) this;
        }

        public Criteria andBxtsIsNull() {
            addCriterion("bxts is null");
            return (Criteria) this;
        }

        public Criteria andBxtsIsNotNull() {
            addCriterion("bxts is not null");
            return (Criteria) this;
        }

        public Criteria andBxtsEqualTo(Double value) {
            addCriterion("bxts =", value, "bxts");
            return (Criteria) this;
        }

        public Criteria andBxtsNotEqualTo(Double value) {
            addCriterion("bxts <>", value, "bxts");
            return (Criteria) this;
        }

        public Criteria andBxtsGreaterThan(Double value) {
            addCriterion("bxts >", value, "bxts");
            return (Criteria) this;
        }

        public Criteria andBxtsGreaterThanOrEqualTo(Double value) {
            addCriterion("bxts >=", value, "bxts");
            return (Criteria) this;
        }

        public Criteria andBxtsLessThan(Double value) {
            addCriterion("bxts <", value, "bxts");
            return (Criteria) this;
        }

        public Criteria andBxtsLessThanOrEqualTo(Double value) {
            addCriterion("bxts <=", value, "bxts");
            return (Criteria) this;
        }

        public Criteria andBxtsIn(List<Double> values) {
            addCriterion("bxts in", values, "bxts");
            return (Criteria) this;
        }

        public Criteria andBxtsNotIn(List<Double> values) {
            addCriterion("bxts not in", values, "bxts");
            return (Criteria) this;
        }

        public Criteria andBxtsBetween(Double value1, Double value2) {
            addCriterion("bxts between", value1, value2, "bxts");
            return (Criteria) this;
        }

        public Criteria andBxtsNotBetween(Double value1, Double value2) {
            addCriterion("bxts not between", value1, value2, "bxts");
            return (Criteria) this;
        }

        public Criteria andYtxtsIsNull() {
            addCriterion("ytxts is null");
            return (Criteria) this;
        }

        public Criteria andYtxtsIsNotNull() {
            addCriterion("ytxts is not null");
            return (Criteria) this;
        }

        public Criteria andYtxtsEqualTo(Double value) {
            addCriterion("ytxts =", value, "ytxts");
            return (Criteria) this;
        }

        public Criteria andYtxtsNotEqualTo(Double value) {
            addCriterion("ytxts <>", value, "ytxts");
            return (Criteria) this;
        }

        public Criteria andYtxtsGreaterThan(Double value) {
            addCriterion("ytxts >", value, "ytxts");
            return (Criteria) this;
        }

        public Criteria andYtxtsGreaterThanOrEqualTo(Double value) {
            addCriterion("ytxts >=", value, "ytxts");
            return (Criteria) this;
        }

        public Criteria andYtxtsLessThan(Double value) {
            addCriterion("ytxts <", value, "ytxts");
            return (Criteria) this;
        }

        public Criteria andYtxtsLessThanOrEqualTo(Double value) {
            addCriterion("ytxts <=", value, "ytxts");
            return (Criteria) this;
        }

        public Criteria andYtxtsIn(List<Double> values) {
            addCriterion("ytxts in", values, "ytxts");
            return (Criteria) this;
        }

        public Criteria andYtxtsNotIn(List<Double> values) {
            addCriterion("ytxts not in", values, "ytxts");
            return (Criteria) this;
        }

        public Criteria andYtxtsBetween(Double value1, Double value2) {
            addCriterion("ytxts between", value1, value2, "ytxts");
            return (Criteria) this;
        }

        public Criteria andYtxtsNotBetween(Double value1, Double value2) {
            addCriterion("ytxts not between", value1, value2, "ytxts");
            return (Criteria) this;
        }

        public Criteria andCctsIsNull() {
            addCriterion("ccts is null");
            return (Criteria) this;
        }

        public Criteria andCctsIsNotNull() {
            addCriterion("ccts is not null");
            return (Criteria) this;
        }

        public Criteria andCctsEqualTo(Double value) {
            addCriterion("ccts =", value, "ccts");
            return (Criteria) this;
        }

        public Criteria andCctsNotEqualTo(Double value) {
            addCriterion("ccts <>", value, "ccts");
            return (Criteria) this;
        }

        public Criteria andCctsGreaterThan(Double value) {
            addCriterion("ccts >", value, "ccts");
            return (Criteria) this;
        }

        public Criteria andCctsGreaterThanOrEqualTo(Double value) {
            addCriterion("ccts >=", value, "ccts");
            return (Criteria) this;
        }

        public Criteria andCctsLessThan(Double value) {
            addCriterion("ccts <", value, "ccts");
            return (Criteria) this;
        }

        public Criteria andCctsLessThanOrEqualTo(Double value) {
            addCriterion("ccts <=", value, "ccts");
            return (Criteria) this;
        }

        public Criteria andCctsIn(List<Double> values) {
            addCriterion("ccts in", values, "ccts");
            return (Criteria) this;
        }

        public Criteria andCctsNotIn(List<Double> values) {
            addCriterion("ccts not in", values, "ccts");
            return (Criteria) this;
        }

        public Criteria andCctsBetween(Double value1, Double value2) {
            addCriterion("ccts between", value1, value2, "ccts");
            return (Criteria) this;
        }

        public Criteria andCctsNotBetween(Double value1, Double value2) {
            addCriterion("ccts not between", value1, value2, "ccts");
            return (Criteria) this;
        }

        public Criteria andBbtsIsNull() {
            addCriterion("bbts is null");
            return (Criteria) this;
        }

        public Criteria andBbtsIsNotNull() {
            addCriterion("bbts is not null");
            return (Criteria) this;
        }

        public Criteria andBbtsEqualTo(Double value) {
            addCriterion("bbts =", value, "bbts");
            return (Criteria) this;
        }

        public Criteria andBbtsNotEqualTo(Double value) {
            addCriterion("bbts <>", value, "bbts");
            return (Criteria) this;
        }

        public Criteria andBbtsGreaterThan(Double value) {
            addCriterion("bbts >", value, "bbts");
            return (Criteria) this;
        }

        public Criteria andBbtsGreaterThanOrEqualTo(Double value) {
            addCriterion("bbts >=", value, "bbts");
            return (Criteria) this;
        }

        public Criteria andBbtsLessThan(Double value) {
            addCriterion("bbts <", value, "bbts");
            return (Criteria) this;
        }

        public Criteria andBbtsLessThanOrEqualTo(Double value) {
            addCriterion("bbts <=", value, "bbts");
            return (Criteria) this;
        }

        public Criteria andBbtsIn(List<Double> values) {
            addCriterion("bbts in", values, "bbts");
            return (Criteria) this;
        }

        public Criteria andBbtsNotIn(List<Double> values) {
            addCriterion("bbts not in", values, "bbts");
            return (Criteria) this;
        }

        public Criteria andBbtsBetween(Double value1, Double value2) {
            addCriterion("bbts between", value1, value2, "bbts");
            return (Criteria) this;
        }

        public Criteria andBbtsNotBetween(Double value1, Double value2) {
            addCriterion("bbts not between", value1, value2, "bbts");
            return (Criteria) this;
        }

        public Criteria andZbtsIsNull() {
            addCriterion("zbts is null");
            return (Criteria) this;
        }

        public Criteria andZbtsIsNotNull() {
            addCriterion("zbts is not null");
            return (Criteria) this;
        }

        public Criteria andZbtsEqualTo(Double value) {
            addCriterion("zbts =", value, "zbts");
            return (Criteria) this;
        }

        public Criteria andZbtsNotEqualTo(Double value) {
            addCriterion("zbts <>", value, "zbts");
            return (Criteria) this;
        }

        public Criteria andZbtsGreaterThan(Double value) {
            addCriterion("zbts >", value, "zbts");
            return (Criteria) this;
        }

        public Criteria andZbtsGreaterThanOrEqualTo(Double value) {
            addCriterion("zbts >=", value, "zbts");
            return (Criteria) this;
        }

        public Criteria andZbtsLessThan(Double value) {
            addCriterion("zbts <", value, "zbts");
            return (Criteria) this;
        }

        public Criteria andZbtsLessThanOrEqualTo(Double value) {
            addCriterion("zbts <=", value, "zbts");
            return (Criteria) this;
        }

        public Criteria andZbtsIn(List<Double> values) {
            addCriterion("zbts in", values, "zbts");
            return (Criteria) this;
        }

        public Criteria andZbtsNotIn(List<Double> values) {
            addCriterion("zbts not in", values, "zbts");
            return (Criteria) this;
        }

        public Criteria andZbtsBetween(Double value1, Double value2) {
            addCriterion("zbts between", value1, value2, "zbts");
            return (Criteria) this;
        }

        public Criteria andZbtsNotBetween(Double value1, Double value2) {
            addCriterion("zbts not between", value1, value2, "zbts");
            return (Criteria) this;
        }

        public Criteria andWbtsIsNull() {
            addCriterion("wbts is null");
            return (Criteria) this;
        }

        public Criteria andWbtsIsNotNull() {
            addCriterion("wbts is not null");
            return (Criteria) this;
        }

        public Criteria andWbtsEqualTo(Double value) {
            addCriterion("wbts =", value, "wbts");
            return (Criteria) this;
        }

        public Criteria andWbtsNotEqualTo(Double value) {
            addCriterion("wbts <>", value, "wbts");
            return (Criteria) this;
        }

        public Criteria andWbtsGreaterThan(Double value) {
            addCriterion("wbts >", value, "wbts");
            return (Criteria) this;
        }

        public Criteria andWbtsGreaterThanOrEqualTo(Double value) {
            addCriterion("wbts >=", value, "wbts");
            return (Criteria) this;
        }

        public Criteria andWbtsLessThan(Double value) {
            addCriterion("wbts <", value, "wbts");
            return (Criteria) this;
        }

        public Criteria andWbtsLessThanOrEqualTo(Double value) {
            addCriterion("wbts <=", value, "wbts");
            return (Criteria) this;
        }

        public Criteria andWbtsIn(List<Double> values) {
            addCriterion("wbts in", values, "wbts");
            return (Criteria) this;
        }

        public Criteria andWbtsNotIn(List<Double> values) {
            addCriterion("wbts not in", values, "wbts");
            return (Criteria) this;
        }

        public Criteria andWbtsBetween(Double value1, Double value2) {
            addCriterion("wbts between", value1, value2, "wbts");
            return (Criteria) this;
        }

        public Criteria andWbtsNotBetween(Double value1, Double value2) {
            addCriterion("wbts not between", value1, value2, "wbts");
            return (Criteria) this;
        }

        public Criteria andNxjjytsIsNull() {
            addCriterion("nxjjyts is null");
            return (Criteria) this;
        }

        public Criteria andNxjjytsIsNotNull() {
            addCriterion("nxjjyts is not null");
            return (Criteria) this;
        }

        public Criteria andNxjjytsEqualTo(Double value) {
            addCriterion("nxjjyts =", value, "nxjjyts");
            return (Criteria) this;
        }

        public Criteria andNxjjytsNotEqualTo(Double value) {
            addCriterion("nxjjyts <>", value, "nxjjyts");
            return (Criteria) this;
        }

        public Criteria andNxjjytsGreaterThan(Double value) {
            addCriterion("nxjjyts >", value, "nxjjyts");
            return (Criteria) this;
        }

        public Criteria andNxjjytsGreaterThanOrEqualTo(Double value) {
            addCriterion("nxjjyts >=", value, "nxjjyts");
            return (Criteria) this;
        }

        public Criteria andNxjjytsLessThan(Double value) {
            addCriterion("nxjjyts <", value, "nxjjyts");
            return (Criteria) this;
        }

        public Criteria andNxjjytsLessThanOrEqualTo(Double value) {
            addCriterion("nxjjyts <=", value, "nxjjyts");
            return (Criteria) this;
        }

        public Criteria andNxjjytsIn(List<Double> values) {
            addCriterion("nxjjyts in", values, "nxjjyts");
            return (Criteria) this;
        }

        public Criteria andNxjjytsNotIn(List<Double> values) {
            addCriterion("nxjjyts not in", values, "nxjjyts");
            return (Criteria) this;
        }

        public Criteria andNxjjytsBetween(Double value1, Double value2) {
            addCriterion("nxjjyts between", value1, value2, "nxjjyts");
            return (Criteria) this;
        }

        public Criteria andNxjjytsNotBetween(Double value1, Double value2) {
            addCriterion("nxjjyts not between", value1, value2, "nxjjyts");
            return (Criteria) this;
        }

        public Criteria andJblxxsIsNull() {
            addCriterion("jblxxs is null");
            return (Criteria) this;
        }

        public Criteria andJblxxsIsNotNull() {
            addCriterion("jblxxs is not null");
            return (Criteria) this;
        }

        public Criteria andJblxxsEqualTo(Double value) {
            addCriterion("jblxxs =", value, "jblxxs");
            return (Criteria) this;
        }

        public Criteria andJblxxsNotEqualTo(Double value) {
            addCriterion("jblxxs <>", value, "jblxxs");
            return (Criteria) this;
        }

        public Criteria andJblxxsGreaterThan(Double value) {
            addCriterion("jblxxs >", value, "jblxxs");
            return (Criteria) this;
        }

        public Criteria andJblxxsGreaterThanOrEqualTo(Double value) {
            addCriterion("jblxxs >=", value, "jblxxs");
            return (Criteria) this;
        }

        public Criteria andJblxxsLessThan(Double value) {
            addCriterion("jblxxs <", value, "jblxxs");
            return (Criteria) this;
        }

        public Criteria andJblxxsLessThanOrEqualTo(Double value) {
            addCriterion("jblxxs <=", value, "jblxxs");
            return (Criteria) this;
        }

        public Criteria andJblxxsIn(List<Double> values) {
            addCriterion("jblxxs in", values, "jblxxs");
            return (Criteria) this;
        }

        public Criteria andJblxxsNotIn(List<Double> values) {
            addCriterion("jblxxs not in", values, "jblxxs");
            return (Criteria) this;
        }

        public Criteria andJblxxsBetween(Double value1, Double value2) {
            addCriterion("jblxxs between", value1, value2, "jblxxs");
            return (Criteria) this;
        }

        public Criteria andJblxxsNotBetween(Double value1, Double value2) {
            addCriterion("jblxxs not between", value1, value2, "jblxxs");
            return (Criteria) this;
        }

        public Criteria andWjrgstsIsNull() {
            addCriterion("wjrgsts is null");
            return (Criteria) this;
        }

        public Criteria andWjrgstsIsNotNull() {
            addCriterion("wjrgsts is not null");
            return (Criteria) this;
        }

        public Criteria andWjrgstsEqualTo(Double value) {
            addCriterion("wjrgsts =", value, "wjrgsts");
            return (Criteria) this;
        }

        public Criteria andWjrgstsNotEqualTo(Double value) {
            addCriterion("wjrgsts <>", value, "wjrgsts");
            return (Criteria) this;
        }

        public Criteria andWjrgstsGreaterThan(Double value) {
            addCriterion("wjrgsts >", value, "wjrgsts");
            return (Criteria) this;
        }

        public Criteria andWjrgstsGreaterThanOrEqualTo(Double value) {
            addCriterion("wjrgsts >=", value, "wjrgsts");
            return (Criteria) this;
        }

        public Criteria andWjrgstsLessThan(Double value) {
            addCriterion("wjrgsts <", value, "wjrgsts");
            return (Criteria) this;
        }

        public Criteria andWjrgstsLessThanOrEqualTo(Double value) {
            addCriterion("wjrgsts <=", value, "wjrgsts");
            return (Criteria) this;
        }

        public Criteria andWjrgstsIn(List<Double> values) {
            addCriterion("wjrgsts in", values, "wjrgsts");
            return (Criteria) this;
        }

        public Criteria andWjrgstsNotIn(List<Double> values) {
            addCriterion("wjrgsts not in", values, "wjrgsts");
            return (Criteria) this;
        }

        public Criteria andWjrgstsBetween(Double value1, Double value2) {
            addCriterion("wjrgsts between", value1, value2, "wjrgsts");
            return (Criteria) this;
        }

        public Criteria andWjrgstsNotBetween(Double value1, Double value2) {
            addCriterion("wjrgsts not between", value1, value2, "wjrgsts");
            return (Criteria) this;
        }

        public Criteria andLxtsIsNull() {
            addCriterion("lxts is null");
            return (Criteria) this;
        }

        public Criteria andLxtsIsNotNull() {
            addCriterion("lxts is not null");
            return (Criteria) this;
        }

        public Criteria andLxtsEqualTo(Double value) {
            addCriterion("lxts =", value, "lxts");
            return (Criteria) this;
        }

        public Criteria andLxtsNotEqualTo(Double value) {
            addCriterion("lxts <>", value, "lxts");
            return (Criteria) this;
        }

        public Criteria andLxtsGreaterThan(Double value) {
            addCriterion("lxts >", value, "lxts");
            return (Criteria) this;
        }

        public Criteria andLxtsGreaterThanOrEqualTo(Double value) {
            addCriterion("lxts >=", value, "lxts");
            return (Criteria) this;
        }

        public Criteria andLxtsLessThan(Double value) {
            addCriterion("lxts <", value, "lxts");
            return (Criteria) this;
        }

        public Criteria andLxtsLessThanOrEqualTo(Double value) {
            addCriterion("lxts <=", value, "lxts");
            return (Criteria) this;
        }

        public Criteria andLxtsIn(List<Double> values) {
            addCriterion("lxts in", values, "lxts");
            return (Criteria) this;
        }

        public Criteria andLxtsNotIn(List<Double> values) {
            addCriterion("lxts not in", values, "lxts");
            return (Criteria) this;
        }

        public Criteria andLxtsBetween(Double value1, Double value2) {
            addCriterion("lxts between", value1, value2, "lxts");
            return (Criteria) this;
        }

        public Criteria andLxtsNotBetween(Double value1, Double value2) {
            addCriterion("lxts not between", value1, value2, "lxts");
            return (Criteria) this;
        }

        public Criteria andGxtsIsNull() {
            addCriterion("gxts is null");
            return (Criteria) this;
        }

        public Criteria andGxtsIsNotNull() {
            addCriterion("gxts is not null");
            return (Criteria) this;
        }

        public Criteria andGxtsEqualTo(Double value) {
            addCriterion("gxts =", value, "gxts");
            return (Criteria) this;
        }

        public Criteria andGxtsNotEqualTo(Double value) {
            addCriterion("gxts <>", value, "gxts");
            return (Criteria) this;
        }

        public Criteria andGxtsGreaterThan(Double value) {
            addCriterion("gxts >", value, "gxts");
            return (Criteria) this;
        }

        public Criteria andGxtsGreaterThanOrEqualTo(Double value) {
            addCriterion("gxts >=", value, "gxts");
            return (Criteria) this;
        }

        public Criteria andGxtsLessThan(Double value) {
            addCriterion("gxts <", value, "gxts");
            return (Criteria) this;
        }

        public Criteria andGxtsLessThanOrEqualTo(Double value) {
            addCriterion("gxts <=", value, "gxts");
            return (Criteria) this;
        }

        public Criteria andGxtsIn(List<Double> values) {
            addCriterion("gxts in", values, "gxts");
            return (Criteria) this;
        }

        public Criteria andGxtsNotIn(List<Double> values) {
            addCriterion("gxts not in", values, "gxts");
            return (Criteria) this;
        }

        public Criteria andGxtsBetween(Double value1, Double value2) {
            addCriterion("gxts between", value1, value2, "gxts");
            return (Criteria) this;
        }

        public Criteria andGxtsNotBetween(Double value1, Double value2) {
            addCriterion("gxts not between", value1, value2, "gxts");
            return (Criteria) this;
        }

        public Criteria andHjIsNull() {
            addCriterion("hj is null");
            return (Criteria) this;
        }

        public Criteria andHjIsNotNull() {
            addCriterion("hj is not null");
            return (Criteria) this;
        }

        public Criteria andHjEqualTo(Double value) {
            addCriterion("hj =", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotEqualTo(Double value) {
            addCriterion("hj <>", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjGreaterThan(Double value) {
            addCriterion("hj >", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjGreaterThanOrEqualTo(Double value) {
            addCriterion("hj >=", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjLessThan(Double value) {
            addCriterion("hj <", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjLessThanOrEqualTo(Double value) {
            addCriterion("hj <=", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjIn(List<Double> values) {
            addCriterion("hj in", values, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotIn(List<Double> values) {
            addCriterion("hj not in", values, "hj");
            return (Criteria) this;
        }

        public Criteria andHjBetween(Double value1, Double value2) {
            addCriterion("hj between", value1, value2, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotBetween(Double value1, Double value2) {
            addCriterion("hj not between", value1, value2, "hj");
            return (Criteria) this;
        }

        public Criteria andIsconfirmIsNull() {
            addCriterion("isconfirm is null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmIsNotNull() {
            addCriterion("isconfirm is not null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmEqualTo(Integer value) {
            addCriterion("isconfirm =", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmNotEqualTo(Integer value) {
            addCriterion("isconfirm <>", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmGreaterThan(Integer value) {
            addCriterion("isconfirm >", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("isconfirm >=", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmLessThan(Integer value) {
            addCriterion("isconfirm <", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmLessThanOrEqualTo(Integer value) {
            addCriterion("isconfirm <=", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmIn(List<Integer> values) {
            addCriterion("isconfirm in", values, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmNotIn(List<Integer> values) {
            addCriterion("isconfirm not in", values, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmBetween(Integer value1, Integer value2) {
            addCriterion("isconfirm between", value1, value2, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("isconfirm not between", value1, value2, "isconfirm");
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