package com.gree.gree_x.model.api;

import java.util.ArrayList;
import java.util.List;

public class Workflow_115Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Workflow_115Example() {
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

        public Criteria andRequestidIsNull() {
            addCriterion("requestId is null");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNotNull() {
            addCriterion("requestId is not null");
            return (Criteria) this;
        }

        public Criteria andRequestidEqualTo(Integer value) {
            addCriterion("requestId =", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotEqualTo(Integer value) {
            addCriterion("requestId <>", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThan(Integer value) {
            addCriterion("requestId >", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThanOrEqualTo(Integer value) {
            addCriterion("requestId >=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThan(Integer value) {
            addCriterion("requestId <", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThanOrEqualTo(Integer value) {
            addCriterion("requestId <=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidIn(List<Integer> values) {
            addCriterion("requestId in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotIn(List<Integer> values) {
            addCriterion("requestId not in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidBetween(Integer value1, Integer value2) {
            addCriterion("requestId between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotBetween(Integer value1, Integer value2) {
            addCriterion("requestId not between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andTarxmIsNull() {
            addCriterion("tarxm is null");
            return (Criteria) this;
        }

        public Criteria andTarxmIsNotNull() {
            addCriterion("tarxm is not null");
            return (Criteria) this;
        }

        public Criteria andTarxmEqualTo(String value) {
            addCriterion("tarxm =", value, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmNotEqualTo(String value) {
            addCriterion("tarxm <>", value, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmGreaterThan(String value) {
            addCriterion("tarxm >", value, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmGreaterThanOrEqualTo(String value) {
            addCriterion("tarxm >=", value, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmLessThan(String value) {
            addCriterion("tarxm <", value, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmLessThanOrEqualTo(String value) {
            addCriterion("tarxm <=", value, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmLike(String value) {
            addCriterion("tarxm like", value, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmNotLike(String value) {
            addCriterion("tarxm not like", value, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmIn(List<String> values) {
            addCriterion("tarxm in", values, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmNotIn(List<String> values) {
            addCriterion("tarxm not in", values, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmBetween(String value1, String value2) {
            addCriterion("tarxm between", value1, value2, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarxmNotBetween(String value1, String value2) {
            addCriterion("tarxm not between", value1, value2, "tarxm");
            return (Criteria) this;
        }

        public Criteria andTarghIsNull() {
            addCriterion("targh is null");
            return (Criteria) this;
        }

        public Criteria andTarghIsNotNull() {
            addCriterion("targh is not null");
            return (Criteria) this;
        }

        public Criteria andTarghEqualTo(String value) {
            addCriterion("targh =", value, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghNotEqualTo(String value) {
            addCriterion("targh <>", value, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghGreaterThan(String value) {
            addCriterion("targh >", value, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghGreaterThanOrEqualTo(String value) {
            addCriterion("targh >=", value, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghLessThan(String value) {
            addCriterion("targh <", value, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghLessThanOrEqualTo(String value) {
            addCriterion("targh <=", value, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghLike(String value) {
            addCriterion("targh like", value, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghNotLike(String value) {
            addCriterion("targh not like", value, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghIn(List<String> values) {
            addCriterion("targh in", values, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghNotIn(List<String> values) {
            addCriterion("targh not in", values, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghBetween(String value1, String value2) {
            addCriterion("targh between", value1, value2, "targh");
            return (Criteria) this;
        }

        public Criteria andTarghNotBetween(String value1, String value2) {
            addCriterion("targh not between", value1, value2, "targh");
            return (Criteria) this;
        }

        public Criteria andXtdlrIsNull() {
            addCriterion("xtdlr is null");
            return (Criteria) this;
        }

        public Criteria andXtdlrIsNotNull() {
            addCriterion("xtdlr is not null");
            return (Criteria) this;
        }

        public Criteria andXtdlrEqualTo(String value) {
            addCriterion("xtdlr =", value, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrNotEqualTo(String value) {
            addCriterion("xtdlr <>", value, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrGreaterThan(String value) {
            addCriterion("xtdlr >", value, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrGreaterThanOrEqualTo(String value) {
            addCriterion("xtdlr >=", value, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrLessThan(String value) {
            addCriterion("xtdlr <", value, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrLessThanOrEqualTo(String value) {
            addCriterion("xtdlr <=", value, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrLike(String value) {
            addCriterion("xtdlr like", value, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrNotLike(String value) {
            addCriterion("xtdlr not like", value, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrIn(List<String> values) {
            addCriterion("xtdlr in", values, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrNotIn(List<String> values) {
            addCriterion("xtdlr not in", values, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrBetween(String value1, String value2) {
            addCriterion("xtdlr between", value1, value2, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andXtdlrNotBetween(String value1, String value2) {
            addCriterion("xtdlr not between", value1, value2, "xtdlr");
            return (Criteria) this;
        }

        public Criteria andTarszdwIsNull() {
            addCriterion("tarszdw is null");
            return (Criteria) this;
        }

        public Criteria andTarszdwIsNotNull() {
            addCriterion("tarszdw is not null");
            return (Criteria) this;
        }

        public Criteria andTarszdwEqualTo(String value) {
            addCriterion("tarszdw =", value, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwNotEqualTo(String value) {
            addCriterion("tarszdw <>", value, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwGreaterThan(String value) {
            addCriterion("tarszdw >", value, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwGreaterThanOrEqualTo(String value) {
            addCriterion("tarszdw >=", value, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwLessThan(String value) {
            addCriterion("tarszdw <", value, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwLessThanOrEqualTo(String value) {
            addCriterion("tarszdw <=", value, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwLike(String value) {
            addCriterion("tarszdw like", value, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwNotLike(String value) {
            addCriterion("tarszdw not like", value, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwIn(List<String> values) {
            addCriterion("tarszdw in", values, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwNotIn(List<String> values) {
            addCriterion("tarszdw not in", values, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwBetween(String value1, String value2) {
            addCriterion("tarszdw between", value1, value2, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarszdwNotBetween(String value1, String value2) {
            addCriterion("tarszdw not between", value1, value2, "tarszdw");
            return (Criteria) this;
        }

        public Criteria andTarlxfsIsNull() {
            addCriterion("tarlxfs is null");
            return (Criteria) this;
        }

        public Criteria andTarlxfsIsNotNull() {
            addCriterion("tarlxfs is not null");
            return (Criteria) this;
        }

        public Criteria andTarlxfsEqualTo(String value) {
            addCriterion("tarlxfs =", value, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsNotEqualTo(String value) {
            addCriterion("tarlxfs <>", value, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsGreaterThan(String value) {
            addCriterion("tarlxfs >", value, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsGreaterThanOrEqualTo(String value) {
            addCriterion("tarlxfs >=", value, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsLessThan(String value) {
            addCriterion("tarlxfs <", value, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsLessThanOrEqualTo(String value) {
            addCriterion("tarlxfs <=", value, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsLike(String value) {
            addCriterion("tarlxfs like", value, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsNotLike(String value) {
            addCriterion("tarlxfs not like", value, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsIn(List<String> values) {
            addCriterion("tarlxfs in", values, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsNotIn(List<String> values) {
            addCriterion("tarlxfs not in", values, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsBetween(String value1, String value2) {
            addCriterion("tarlxfs between", value1, value2, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarlxfsNotBetween(String value1, String value2) {
            addCriterion("tarlxfs not between", value1, value2, "tarlxfs");
            return (Criteria) this;
        }

        public Criteria andTarznsxIsNull() {
            addCriterion("tarznsx is null");
            return (Criteria) this;
        }

        public Criteria andTarznsxIsNotNull() {
            addCriterion("tarznsx is not null");
            return (Criteria) this;
        }

        public Criteria andTarznsxEqualTo(Integer value) {
            addCriterion("tarznsx =", value, "tarznsx");
            return (Criteria) this;
        }

        public Criteria andTarznsxNotEqualTo(Integer value) {
            addCriterion("tarznsx <>", value, "tarznsx");
            return (Criteria) this;
        }

        public Criteria andTarznsxGreaterThan(Integer value) {
            addCriterion("tarznsx >", value, "tarznsx");
            return (Criteria) this;
        }

        public Criteria andTarznsxGreaterThanOrEqualTo(Integer value) {
            addCriterion("tarznsx >=", value, "tarznsx");
            return (Criteria) this;
        }

        public Criteria andTarznsxLessThan(Integer value) {
            addCriterion("tarznsx <", value, "tarznsx");
            return (Criteria) this;
        }

        public Criteria andTarznsxLessThanOrEqualTo(Integer value) {
            addCriterion("tarznsx <=", value, "tarznsx");
            return (Criteria) this;
        }

        public Criteria andTarznsxIn(List<Integer> values) {
            addCriterion("tarznsx in", values, "tarznsx");
            return (Criteria) this;
        }

        public Criteria andTarznsxNotIn(List<Integer> values) {
            addCriterion("tarznsx not in", values, "tarznsx");
            return (Criteria) this;
        }

        public Criteria andTarznsxBetween(Integer value1, Integer value2) {
            addCriterion("tarznsx between", value1, value2, "tarznsx");
            return (Criteria) this;
        }

        public Criteria andTarznsxNotBetween(Integer value1, Integer value2) {
            addCriterion("tarznsx not between", value1, value2, "tarznsx");
            return (Criteria) this;
        }

        public Criteria andTamcIsNull() {
            addCriterion("tamc is null");
            return (Criteria) this;
        }

        public Criteria andTamcIsNotNull() {
            addCriterion("tamc is not null");
            return (Criteria) this;
        }

        public Criteria andTamcEqualTo(String value) {
            addCriterion("tamc =", value, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcNotEqualTo(String value) {
            addCriterion("tamc <>", value, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcGreaterThan(String value) {
            addCriterion("tamc >", value, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcGreaterThanOrEqualTo(String value) {
            addCriterion("tamc >=", value, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcLessThan(String value) {
            addCriterion("tamc <", value, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcLessThanOrEqualTo(String value) {
            addCriterion("tamc <=", value, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcLike(String value) {
            addCriterion("tamc like", value, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcNotLike(String value) {
            addCriterion("tamc not like", value, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcIn(List<String> values) {
            addCriterion("tamc in", values, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcNotIn(List<String> values) {
            addCriterion("tamc not in", values, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcBetween(String value1, String value2) {
            addCriterion("tamc between", value1, value2, "tamc");
            return (Criteria) this;
        }

        public Criteria andTamcNotBetween(String value1, String value2) {
            addCriterion("tamc not between", value1, value2, "tamc");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsIsNull() {
            addCriterion("gsqxzms is null");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsIsNotNull() {
            addCriterion("gsqxzms is not null");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsEqualTo(String value) {
            addCriterion("gsqxzms =", value, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsNotEqualTo(String value) {
            addCriterion("gsqxzms <>", value, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsGreaterThan(String value) {
            addCriterion("gsqxzms >", value, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsGreaterThanOrEqualTo(String value) {
            addCriterion("gsqxzms >=", value, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsLessThan(String value) {
            addCriterion("gsqxzms <", value, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsLessThanOrEqualTo(String value) {
            addCriterion("gsqxzms <=", value, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsLike(String value) {
            addCriterion("gsqxzms like", value, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsNotLike(String value) {
            addCriterion("gsqxzms not like", value, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsIn(List<String> values) {
            addCriterion("gsqxzms in", values, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsNotIn(List<String> values) {
            addCriterion("gsqxzms not in", values, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsBetween(String value1, String value2) {
            addCriterion("gsqxzms between", value1, value2, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andGsqxzmsNotBetween(String value1, String value2) {
            addCriterion("gsqxzms not between", value1, value2, "gsqxzms");
            return (Criteria) this;
        }

        public Criteria andTafjzcIsNull() {
            addCriterion("tafjzc is null");
            return (Criteria) this;
        }

        public Criteria andTafjzcIsNotNull() {
            addCriterion("tafjzc is not null");
            return (Criteria) this;
        }

        public Criteria andTafjzcEqualTo(String value) {
            addCriterion("tafjzc =", value, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcNotEqualTo(String value) {
            addCriterion("tafjzc <>", value, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcGreaterThan(String value) {
            addCriterion("tafjzc >", value, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcGreaterThanOrEqualTo(String value) {
            addCriterion("tafjzc >=", value, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcLessThan(String value) {
            addCriterion("tafjzc <", value, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcLessThanOrEqualTo(String value) {
            addCriterion("tafjzc <=", value, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcLike(String value) {
            addCriterion("tafjzc like", value, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcNotLike(String value) {
            addCriterion("tafjzc not like", value, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcIn(List<String> values) {
            addCriterion("tafjzc in", values, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcNotIn(List<String> values) {
            addCriterion("tafjzc not in", values, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcBetween(String value1, String value2) {
            addCriterion("tafjzc between", value1, value2, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andTafjzcNotBetween(String value1, String value2) {
            addCriterion("tafjzc not between", value1, value2, "tafjzc");
            return (Criteria) this;
        }

        public Criteria andGsyjIsNull() {
            addCriterion("gsyj is null");
            return (Criteria) this;
        }

        public Criteria andGsyjIsNotNull() {
            addCriterion("gsyj is not null");
            return (Criteria) this;
        }

        public Criteria andGsyjEqualTo(String value) {
            addCriterion("gsyj =", value, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjNotEqualTo(String value) {
            addCriterion("gsyj <>", value, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjGreaterThan(String value) {
            addCriterion("gsyj >", value, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjGreaterThanOrEqualTo(String value) {
            addCriterion("gsyj >=", value, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjLessThan(String value) {
            addCriterion("gsyj <", value, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjLessThanOrEqualTo(String value) {
            addCriterion("gsyj <=", value, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjLike(String value) {
            addCriterion("gsyj like", value, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjNotLike(String value) {
            addCriterion("gsyj not like", value, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjIn(List<String> values) {
            addCriterion("gsyj in", values, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjNotIn(List<String> values) {
            addCriterion("gsyj not in", values, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjBetween(String value1, String value2) {
            addCriterion("gsyj between", value1, value2, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGsyjNotBetween(String value1, String value2) {
            addCriterion("gsyj not between", value1, value2, "gsyj");
            return (Criteria) this;
        }

        public Criteria andGshyjxgIsNull() {
            addCriterion("gshyjxg is null");
            return (Criteria) this;
        }

        public Criteria andGshyjxgIsNotNull() {
            addCriterion("gshyjxg is not null");
            return (Criteria) this;
        }

        public Criteria andGshyjxgEqualTo(String value) {
            addCriterion("gshyjxg =", value, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgNotEqualTo(String value) {
            addCriterion("gshyjxg <>", value, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgGreaterThan(String value) {
            addCriterion("gshyjxg >", value, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgGreaterThanOrEqualTo(String value) {
            addCriterion("gshyjxg >=", value, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgLessThan(String value) {
            addCriterion("gshyjxg <", value, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgLessThanOrEqualTo(String value) {
            addCriterion("gshyjxg <=", value, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgLike(String value) {
            addCriterion("gshyjxg like", value, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgNotLike(String value) {
            addCriterion("gshyjxg not like", value, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgIn(List<String> values) {
            addCriterion("gshyjxg in", values, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgNotIn(List<String> values) {
            addCriterion("gshyjxg not in", values, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgBetween(String value1, String value2) {
            addCriterion("gshyjxg between", value1, value2, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andGshyjxgNotBetween(String value1, String value2) {
            addCriterion("gshyjxg not between", value1, value2, "gshyjxg");
            return (Criteria) this;
        }

        public Criteria andTalxIsNull() {
            addCriterion("talx is null");
            return (Criteria) this;
        }

        public Criteria andTalxIsNotNull() {
            addCriterion("talx is not null");
            return (Criteria) this;
        }

        public Criteria andTalxEqualTo(Integer value) {
            addCriterion("talx =", value, "talx");
            return (Criteria) this;
        }

        public Criteria andTalxNotEqualTo(Integer value) {
            addCriterion("talx <>", value, "talx");
            return (Criteria) this;
        }

        public Criteria andTalxGreaterThan(Integer value) {
            addCriterion("talx >", value, "talx");
            return (Criteria) this;
        }

        public Criteria andTalxGreaterThanOrEqualTo(Integer value) {
            addCriterion("talx >=", value, "talx");
            return (Criteria) this;
        }

        public Criteria andTalxLessThan(Integer value) {
            addCriterion("talx <", value, "talx");
            return (Criteria) this;
        }

        public Criteria andTalxLessThanOrEqualTo(Integer value) {
            addCriterion("talx <=", value, "talx");
            return (Criteria) this;
        }

        public Criteria andTalxIn(List<Integer> values) {
            addCriterion("talx in", values, "talx");
            return (Criteria) this;
        }

        public Criteria andTalxNotIn(List<Integer> values) {
            addCriterion("talx not in", values, "talx");
            return (Criteria) this;
        }

        public Criteria andTalxBetween(Integer value1, Integer value2) {
            addCriterion("talx between", value1, value2, "talx");
            return (Criteria) this;
        }

        public Criteria andTalxNotBetween(Integer value1, Integer value2) {
            addCriterion("talx not between", value1, value2, "talx");
            return (Criteria) this;
        }

        public Criteria andCsyjxzIsNull() {
            addCriterion("csyjxz is null");
            return (Criteria) this;
        }

        public Criteria andCsyjxzIsNotNull() {
            addCriterion("csyjxz is not null");
            return (Criteria) this;
        }

        public Criteria andCsyjxzEqualTo(Integer value) {
            addCriterion("csyjxz =", value, "csyjxz");
            return (Criteria) this;
        }

        public Criteria andCsyjxzNotEqualTo(Integer value) {
            addCriterion("csyjxz <>", value, "csyjxz");
            return (Criteria) this;
        }

        public Criteria andCsyjxzGreaterThan(Integer value) {
            addCriterion("csyjxz >", value, "csyjxz");
            return (Criteria) this;
        }

        public Criteria andCsyjxzGreaterThanOrEqualTo(Integer value) {
            addCriterion("csyjxz >=", value, "csyjxz");
            return (Criteria) this;
        }

        public Criteria andCsyjxzLessThan(Integer value) {
            addCriterion("csyjxz <", value, "csyjxz");
            return (Criteria) this;
        }

        public Criteria andCsyjxzLessThanOrEqualTo(Integer value) {
            addCriterion("csyjxz <=", value, "csyjxz");
            return (Criteria) this;
        }

        public Criteria andCsyjxzIn(List<Integer> values) {
            addCriterion("csyjxz in", values, "csyjxz");
            return (Criteria) this;
        }

        public Criteria andCsyjxzNotIn(List<Integer> values) {
            addCriterion("csyjxz not in", values, "csyjxz");
            return (Criteria) this;
        }

        public Criteria andCsyjxzBetween(Integer value1, Integer value2) {
            addCriterion("csyjxz between", value1, value2, "csyjxz");
            return (Criteria) this;
        }

        public Criteria andCsyjxzNotBetween(Integer value1, Integer value2) {
            addCriterion("csyjxz not between", value1, value2, "csyjxz");
            return (Criteria) this;
        }

        public Criteria andLsyjxzIsNull() {
            addCriterion("lsyjxz is null");
            return (Criteria) this;
        }

        public Criteria andLsyjxzIsNotNull() {
            addCriterion("lsyjxz is not null");
            return (Criteria) this;
        }

        public Criteria andLsyjxzEqualTo(Integer value) {
            addCriterion("lsyjxz =", value, "lsyjxz");
            return (Criteria) this;
        }

        public Criteria andLsyjxzNotEqualTo(Integer value) {
            addCriterion("lsyjxz <>", value, "lsyjxz");
            return (Criteria) this;
        }

        public Criteria andLsyjxzGreaterThan(Integer value) {
            addCriterion("lsyjxz >", value, "lsyjxz");
            return (Criteria) this;
        }

        public Criteria andLsyjxzGreaterThanOrEqualTo(Integer value) {
            addCriterion("lsyjxz >=", value, "lsyjxz");
            return (Criteria) this;
        }

        public Criteria andLsyjxzLessThan(Integer value) {
            addCriterion("lsyjxz <", value, "lsyjxz");
            return (Criteria) this;
        }

        public Criteria andLsyjxzLessThanOrEqualTo(Integer value) {
            addCriterion("lsyjxz <=", value, "lsyjxz");
            return (Criteria) this;
        }

        public Criteria andLsyjxzIn(List<Integer> values) {
            addCriterion("lsyjxz in", values, "lsyjxz");
            return (Criteria) this;
        }

        public Criteria andLsyjxzNotIn(List<Integer> values) {
            addCriterion("lsyjxz not in", values, "lsyjxz");
            return (Criteria) this;
        }

        public Criteria andLsyjxzBetween(Integer value1, Integer value2) {
            addCriterion("lsyjxz between", value1, value2, "lsyjxz");
            return (Criteria) this;
        }

        public Criteria andLsyjxzNotBetween(Integer value1, Integer value2) {
            addCriterion("lsyjxz not between", value1, value2, "lsyjxz");
            return (Criteria) this;
        }

        public Criteria andZplsdwIsNull() {
            addCriterion("zplsdw is null");
            return (Criteria) this;
        }

        public Criteria andZplsdwIsNotNull() {
            addCriterion("zplsdw is not null");
            return (Criteria) this;
        }

        public Criteria andZplsdwEqualTo(Integer value) {
            addCriterion("zplsdw =", value, "zplsdw");
            return (Criteria) this;
        }

        public Criteria andZplsdwNotEqualTo(Integer value) {
            addCriterion("zplsdw <>", value, "zplsdw");
            return (Criteria) this;
        }

        public Criteria andZplsdwGreaterThan(Integer value) {
            addCriterion("zplsdw >", value, "zplsdw");
            return (Criteria) this;
        }

        public Criteria andZplsdwGreaterThanOrEqualTo(Integer value) {
            addCriterion("zplsdw >=", value, "zplsdw");
            return (Criteria) this;
        }

        public Criteria andZplsdwLessThan(Integer value) {
            addCriterion("zplsdw <", value, "zplsdw");
            return (Criteria) this;
        }

        public Criteria andZplsdwLessThanOrEqualTo(Integer value) {
            addCriterion("zplsdw <=", value, "zplsdw");
            return (Criteria) this;
        }

        public Criteria andZplsdwIn(List<Integer> values) {
            addCriterion("zplsdw in", values, "zplsdw");
            return (Criteria) this;
        }

        public Criteria andZplsdwNotIn(List<Integer> values) {
            addCriterion("zplsdw not in", values, "zplsdw");
            return (Criteria) this;
        }

        public Criteria andZplsdwBetween(Integer value1, Integer value2) {
            addCriterion("zplsdw between", value1, value2, "zplsdw");
            return (Criteria) this;
        }

        public Criteria andZplsdwNotBetween(Integer value1, Integer value2) {
            addCriterion("zplsdw not between", value1, value2, "zplsdw");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrIsNull() {
            addCriterion("zpbdwlsr is null");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrIsNotNull() {
            addCriterion("zpbdwlsr is not null");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrEqualTo(Integer value) {
            addCriterion("zpbdwlsr =", value, "zpbdwlsr");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrNotEqualTo(Integer value) {
            addCriterion("zpbdwlsr <>", value, "zpbdwlsr");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrGreaterThan(Integer value) {
            addCriterion("zpbdwlsr >", value, "zpbdwlsr");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrGreaterThanOrEqualTo(Integer value) {
            addCriterion("zpbdwlsr >=", value, "zpbdwlsr");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrLessThan(Integer value) {
            addCriterion("zpbdwlsr <", value, "zpbdwlsr");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrLessThanOrEqualTo(Integer value) {
            addCriterion("zpbdwlsr <=", value, "zpbdwlsr");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrIn(List<Integer> values) {
            addCriterion("zpbdwlsr in", values, "zpbdwlsr");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrNotIn(List<Integer> values) {
            addCriterion("zpbdwlsr not in", values, "zpbdwlsr");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrBetween(Integer value1, Integer value2) {
            addCriterion("zpbdwlsr between", value1, value2, "zpbdwlsr");
            return (Criteria) this;
        }

        public Criteria andZpbdwlsrNotBetween(Integer value1, Integer value2) {
            addCriterion("zpbdwlsr not between", value1, value2, "zpbdwlsr");
            return (Criteria) this;
        }

        public Criteria andZsyjxzIsNull() {
            addCriterion("zsyjxz is null");
            return (Criteria) this;
        }

        public Criteria andZsyjxzIsNotNull() {
            addCriterion("zsyjxz is not null");
            return (Criteria) this;
        }

        public Criteria andZsyjxzEqualTo(Integer value) {
            addCriterion("zsyjxz =", value, "zsyjxz");
            return (Criteria) this;
        }

        public Criteria andZsyjxzNotEqualTo(Integer value) {
            addCriterion("zsyjxz <>", value, "zsyjxz");
            return (Criteria) this;
        }

        public Criteria andZsyjxzGreaterThan(Integer value) {
            addCriterion("zsyjxz >", value, "zsyjxz");
            return (Criteria) this;
        }

        public Criteria andZsyjxzGreaterThanOrEqualTo(Integer value) {
            addCriterion("zsyjxz >=", value, "zsyjxz");
            return (Criteria) this;
        }

        public Criteria andZsyjxzLessThan(Integer value) {
            addCriterion("zsyjxz <", value, "zsyjxz");
            return (Criteria) this;
        }

        public Criteria andZsyjxzLessThanOrEqualTo(Integer value) {
            addCriterion("zsyjxz <=", value, "zsyjxz");
            return (Criteria) this;
        }

        public Criteria andZsyjxzIn(List<Integer> values) {
            addCriterion("zsyjxz in", values, "zsyjxz");
            return (Criteria) this;
        }

        public Criteria andZsyjxzNotIn(List<Integer> values) {
            addCriterion("zsyjxz not in", values, "zsyjxz");
            return (Criteria) this;
        }

        public Criteria andZsyjxzBetween(Integer value1, Integer value2) {
            addCriterion("zsyjxz between", value1, value2, "zsyjxz");
            return (Criteria) this;
        }

        public Criteria andZsyjxzNotBetween(Integer value1, Integer value2) {
            addCriterion("zsyjxz not between", value1, value2, "zsyjxz");
            return (Criteria) this;
        }

        public Criteria andBcnyyIsNull() {
            addCriterion("bcnyy is null");
            return (Criteria) this;
        }

        public Criteria andBcnyyIsNotNull() {
            addCriterion("bcnyy is not null");
            return (Criteria) this;
        }

        public Criteria andBcnyyEqualTo(String value) {
            addCriterion("bcnyy =", value, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyNotEqualTo(String value) {
            addCriterion("bcnyy <>", value, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyGreaterThan(String value) {
            addCriterion("bcnyy >", value, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyGreaterThanOrEqualTo(String value) {
            addCriterion("bcnyy >=", value, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyLessThan(String value) {
            addCriterion("bcnyy <", value, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyLessThanOrEqualTo(String value) {
            addCriterion("bcnyy <=", value, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyLike(String value) {
            addCriterion("bcnyy like", value, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyNotLike(String value) {
            addCriterion("bcnyy not like", value, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyIn(List<String> values) {
            addCriterion("bcnyy in", values, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyNotIn(List<String> values) {
            addCriterion("bcnyy not in", values, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyBetween(String value1, String value2) {
            addCriterion("bcnyy between", value1, value2, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andBcnyyNotBetween(String value1, String value2) {
            addCriterion("bcnyy not between", value1, value2, "bcnyy");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmIsNull() {
            addCriterion("sjlsrxm is null");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmIsNotNull() {
            addCriterion("sjlsrxm is not null");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmEqualTo(String value) {
            addCriterion("sjlsrxm =", value, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmNotEqualTo(String value) {
            addCriterion("sjlsrxm <>", value, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmGreaterThan(String value) {
            addCriterion("sjlsrxm >", value, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmGreaterThanOrEqualTo(String value) {
            addCriterion("sjlsrxm >=", value, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmLessThan(String value) {
            addCriterion("sjlsrxm <", value, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmLessThanOrEqualTo(String value) {
            addCriterion("sjlsrxm <=", value, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmLike(String value) {
            addCriterion("sjlsrxm like", value, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmNotLike(String value) {
            addCriterion("sjlsrxm not like", value, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmIn(List<String> values) {
            addCriterion("sjlsrxm in", values, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmNotIn(List<String> values) {
            addCriterion("sjlsrxm not in", values, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmBetween(String value1, String value2) {
            addCriterion("sjlsrxm between", value1, value2, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrxmNotBetween(String value1, String value2) {
            addCriterion("sjlsrxm not between", value1, value2, "sjlsrxm");
            return (Criteria) this;
        }

        public Criteria andSjlsrghIsNull() {
            addCriterion("sjlsrgh is null");
            return (Criteria) this;
        }

        public Criteria andSjlsrghIsNotNull() {
            addCriterion("sjlsrgh is not null");
            return (Criteria) this;
        }

        public Criteria andSjlsrghEqualTo(String value) {
            addCriterion("sjlsrgh =", value, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghNotEqualTo(String value) {
            addCriterion("sjlsrgh <>", value, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghGreaterThan(String value) {
            addCriterion("sjlsrgh >", value, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghGreaterThanOrEqualTo(String value) {
            addCriterion("sjlsrgh >=", value, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghLessThan(String value) {
            addCriterion("sjlsrgh <", value, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghLessThanOrEqualTo(String value) {
            addCriterion("sjlsrgh <=", value, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghLike(String value) {
            addCriterion("sjlsrgh like", value, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghNotLike(String value) {
            addCriterion("sjlsrgh not like", value, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghIn(List<String> values) {
            addCriterion("sjlsrgh in", values, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghNotIn(List<String> values) {
            addCriterion("sjlsrgh not in", values, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghBetween(String value1, String value2) {
            addCriterion("sjlsrgh between", value1, value2, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andSjlsrghNotBetween(String value1, String value2) {
            addCriterion("sjlsrgh not between", value1, value2, "sjlsrgh");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsIsNull() {
            addCriterion("lsrlxfs is null");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsIsNotNull() {
            addCriterion("lsrlxfs is not null");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsEqualTo(String value) {
            addCriterion("lsrlxfs =", value, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsNotEqualTo(String value) {
            addCriterion("lsrlxfs <>", value, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsGreaterThan(String value) {
            addCriterion("lsrlxfs >", value, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsGreaterThanOrEqualTo(String value) {
            addCriterion("lsrlxfs >=", value, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsLessThan(String value) {
            addCriterion("lsrlxfs <", value, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsLessThanOrEqualTo(String value) {
            addCriterion("lsrlxfs <=", value, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsLike(String value) {
            addCriterion("lsrlxfs like", value, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsNotLike(String value) {
            addCriterion("lsrlxfs not like", value, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsIn(List<String> values) {
            addCriterion("lsrlxfs in", values, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsNotIn(List<String> values) {
            addCriterion("lsrlxfs not in", values, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsBetween(String value1, String value2) {
            addCriterion("lsrlxfs between", value1, value2, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrlxfsNotBetween(String value1, String value2) {
            addCriterion("lsrlxfs not between", value1, value2, "lsrlxfs");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjIsNull() {
            addCriterion("lsrjdyj is null");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjIsNotNull() {
            addCriterion("lsrjdyj is not null");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjEqualTo(Integer value) {
            addCriterion("lsrjdyj =", value, "lsrjdyj");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjNotEqualTo(Integer value) {
            addCriterion("lsrjdyj <>", value, "lsrjdyj");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjGreaterThan(Integer value) {
            addCriterion("lsrjdyj >", value, "lsrjdyj");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjGreaterThanOrEqualTo(Integer value) {
            addCriterion("lsrjdyj >=", value, "lsrjdyj");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjLessThan(Integer value) {
            addCriterion("lsrjdyj <", value, "lsrjdyj");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjLessThanOrEqualTo(Integer value) {
            addCriterion("lsrjdyj <=", value, "lsrjdyj");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjIn(List<Integer> values) {
            addCriterion("lsrjdyj in", values, "lsrjdyj");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjNotIn(List<Integer> values) {
            addCriterion("lsrjdyj not in", values, "lsrjdyj");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjBetween(Integer value1, Integer value2) {
            addCriterion("lsrjdyj between", value1, value2, "lsrjdyj");
            return (Criteria) this;
        }

        public Criteria andLsrjdyjNotBetween(Integer value1, Integer value2) {
            addCriterion("lsrjdyj not between", value1, value2, "lsrjdyj");
            return (Criteria) this;
        }

        public Criteria andYjlssjIsNull() {
            addCriterion("yjlssj is null");
            return (Criteria) this;
        }

        public Criteria andYjlssjIsNotNull() {
            addCriterion("yjlssj is not null");
            return (Criteria) this;
        }

        public Criteria andYjlssjEqualTo(String value) {
            addCriterion("yjlssj =", value, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjNotEqualTo(String value) {
            addCriterion("yjlssj <>", value, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjGreaterThan(String value) {
            addCriterion("yjlssj >", value, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjGreaterThanOrEqualTo(String value) {
            addCriterion("yjlssj >=", value, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjLessThan(String value) {
            addCriterion("yjlssj <", value, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjLessThanOrEqualTo(String value) {
            addCriterion("yjlssj <=", value, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjLike(String value) {
            addCriterion("yjlssj like", value, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjNotLike(String value) {
            addCriterion("yjlssj not like", value, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjIn(List<String> values) {
            addCriterion("yjlssj in", values, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjNotIn(List<String> values) {
            addCriterion("yjlssj not in", values, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjBetween(String value1, String value2) {
            addCriterion("yjlssj between", value1, value2, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andYjlssjNotBetween(String value1, String value2) {
            addCriterion("yjlssj not between", value1, value2, "yjlssj");
            return (Criteria) this;
        }

        public Criteria andBklsyyIsNull() {
            addCriterion("bklsyy is null");
            return (Criteria) this;
        }

        public Criteria andBklsyyIsNotNull() {
            addCriterion("bklsyy is not null");
            return (Criteria) this;
        }

        public Criteria andBklsyyEqualTo(String value) {
            addCriterion("bklsyy =", value, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyNotEqualTo(String value) {
            addCriterion("bklsyy <>", value, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyGreaterThan(String value) {
            addCriterion("bklsyy >", value, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyGreaterThanOrEqualTo(String value) {
            addCriterion("bklsyy >=", value, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyLessThan(String value) {
            addCriterion("bklsyy <", value, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyLessThanOrEqualTo(String value) {
            addCriterion("bklsyy <=", value, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyLike(String value) {
            addCriterion("bklsyy like", value, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyNotLike(String value) {
            addCriterion("bklsyy not like", value, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyIn(List<String> values) {
            addCriterion("bklsyy in", values, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyNotIn(List<String> values) {
            addCriterion("bklsyy not in", values, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyBetween(String value1, String value2) {
            addCriterion("bklsyy between", value1, value2, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andBklsyyNotBetween(String value1, String value2) {
            addCriterion("bklsyy not between", value1, value2, "bklsyy");
            return (Criteria) this;
        }

        public Criteria andSjlssjIsNull() {
            addCriterion("sjlssj is null");
            return (Criteria) this;
        }

        public Criteria andSjlssjIsNotNull() {
            addCriterion("sjlssj is not null");
            return (Criteria) this;
        }

        public Criteria andSjlssjEqualTo(String value) {
            addCriterion("sjlssj =", value, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjNotEqualTo(String value) {
            addCriterion("sjlssj <>", value, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjGreaterThan(String value) {
            addCriterion("sjlssj >", value, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjGreaterThanOrEqualTo(String value) {
            addCriterion("sjlssj >=", value, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjLessThan(String value) {
            addCriterion("sjlssj <", value, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjLessThanOrEqualTo(String value) {
            addCriterion("sjlssj <=", value, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjLike(String value) {
            addCriterion("sjlssj like", value, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjNotLike(String value) {
            addCriterion("sjlssj not like", value, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjIn(List<String> values) {
            addCriterion("sjlssj in", values, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjNotIn(List<String> values) {
            addCriterion("sjlssj not in", values, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjBetween(String value1, String value2) {
            addCriterion("sjlssj between", value1, value2, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andSjlssjNotBetween(String value1, String value2) {
            addCriterion("sjlssj not between", value1, value2, "sjlssj");
            return (Criteria) this;
        }

        public Criteria andYxxymsIsNull() {
            addCriterion("yxxyms is null");
            return (Criteria) this;
        }

        public Criteria andYxxymsIsNotNull() {
            addCriterion("yxxyms is not null");
            return (Criteria) this;
        }

        public Criteria andYxxymsEqualTo(String value) {
            addCriterion("yxxyms =", value, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsNotEqualTo(String value) {
            addCriterion("yxxyms <>", value, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsGreaterThan(String value) {
            addCriterion("yxxyms >", value, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsGreaterThanOrEqualTo(String value) {
            addCriterion("yxxyms >=", value, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsLessThan(String value) {
            addCriterion("yxxyms <", value, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsLessThanOrEqualTo(String value) {
            addCriterion("yxxyms <=", value, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsLike(String value) {
            addCriterion("yxxyms like", value, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsNotLike(String value) {
            addCriterion("yxxyms not like", value, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsIn(List<String> values) {
            addCriterion("yxxyms in", values, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsNotIn(List<String> values) {
            addCriterion("yxxyms not in", values, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsBetween(String value1, String value2) {
            addCriterion("yxxyms between", value1, value2, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andYxxymsNotBetween(String value1, String value2) {
            addCriterion("yxxyms not between", value1, value2, "yxxyms");
            return (Criteria) this;
        }

        public Criteria andLsyjfjIsNull() {
            addCriterion("lsyjfj is null");
            return (Criteria) this;
        }

        public Criteria andLsyjfjIsNotNull() {
            addCriterion("lsyjfj is not null");
            return (Criteria) this;
        }

        public Criteria andLsyjfjEqualTo(String value) {
            addCriterion("lsyjfj =", value, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjNotEqualTo(String value) {
            addCriterion("lsyjfj <>", value, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjGreaterThan(String value) {
            addCriterion("lsyjfj >", value, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjGreaterThanOrEqualTo(String value) {
            addCriterion("lsyjfj >=", value, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjLessThan(String value) {
            addCriterion("lsyjfj <", value, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjLessThanOrEqualTo(String value) {
            addCriterion("lsyjfj <=", value, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjLike(String value) {
            addCriterion("lsyjfj like", value, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjNotLike(String value) {
            addCriterion("lsyjfj not like", value, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjIn(List<String> values) {
            addCriterion("lsyjfj in", values, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjNotIn(List<String> values) {
            addCriterion("lsyjfj not in", values, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjBetween(String value1, String value2) {
            addCriterion("lsyjfj between", value1, value2, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andLsyjfjNotBetween(String value1, String value2) {
            addCriterion("lsyjfj not between", value1, value2, "lsyjfj");
            return (Criteria) this;
        }

        public Criteria andWxxymsIsNull() {
            addCriterion("wxxyms is null");
            return (Criteria) this;
        }

        public Criteria andWxxymsIsNotNull() {
            addCriterion("wxxyms is not null");
            return (Criteria) this;
        }

        public Criteria andWxxymsEqualTo(String value) {
            addCriterion("wxxyms =", value, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsNotEqualTo(String value) {
            addCriterion("wxxyms <>", value, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsGreaterThan(String value) {
            addCriterion("wxxyms >", value, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsGreaterThanOrEqualTo(String value) {
            addCriterion("wxxyms >=", value, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsLessThan(String value) {
            addCriterion("wxxyms <", value, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsLessThanOrEqualTo(String value) {
            addCriterion("wxxyms <=", value, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsLike(String value) {
            addCriterion("wxxyms like", value, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsNotLike(String value) {
            addCriterion("wxxyms not like", value, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsIn(List<String> values) {
            addCriterion("wxxyms in", values, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsNotIn(List<String> values) {
            addCriterion("wxxyms not in", values, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsBetween(String value1, String value2) {
            addCriterion("wxxyms between", value1, value2, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andWxxymsNotBetween(String value1, String value2) {
            addCriterion("wxxyms not between", value1, value2, "wxxyms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsIsNull() {
            addCriterion("tgcxdms is null");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsIsNotNull() {
            addCriterion("tgcxdms is not null");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsEqualTo(String value) {
            addCriterion("tgcxdms =", value, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsNotEqualTo(String value) {
            addCriterion("tgcxdms <>", value, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsGreaterThan(String value) {
            addCriterion("tgcxdms >", value, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsGreaterThanOrEqualTo(String value) {
            addCriterion("tgcxdms >=", value, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsLessThan(String value) {
            addCriterion("tgcxdms <", value, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsLessThanOrEqualTo(String value) {
            addCriterion("tgcxdms <=", value, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsLike(String value) {
            addCriterion("tgcxdms like", value, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsNotLike(String value) {
            addCriterion("tgcxdms not like", value, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsIn(List<String> values) {
            addCriterion("tgcxdms in", values, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsNotIn(List<String> values) {
            addCriterion("tgcxdms not in", values, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsBetween(String value1, String value2) {
            addCriterion("tgcxdms between", value1, value2, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andTgcxdmsNotBetween(String value1, String value2) {
            addCriterion("tgcxdms not between", value1, value2, "tgcxdms");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzIsNull() {
            addCriterion("lsyxxxz is null");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzIsNotNull() {
            addCriterion("lsyxxxz is not null");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzEqualTo(Integer value) {
            addCriterion("lsyxxxz =", value, "lsyxxxz");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzNotEqualTo(Integer value) {
            addCriterion("lsyxxxz <>", value, "lsyxxxz");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzGreaterThan(Integer value) {
            addCriterion("lsyxxxz >", value, "lsyxxxz");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzGreaterThanOrEqualTo(Integer value) {
            addCriterion("lsyxxxz >=", value, "lsyxxxz");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzLessThan(Integer value) {
            addCriterion("lsyxxxz <", value, "lsyxxxz");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzLessThanOrEqualTo(Integer value) {
            addCriterion("lsyxxxz <=", value, "lsyxxxz");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzIn(List<Integer> values) {
            addCriterion("lsyxxxz in", values, "lsyxxxz");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzNotIn(List<Integer> values) {
            addCriterion("lsyxxxz not in", values, "lsyxxxz");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzBetween(Integer value1, Integer value2) {
            addCriterion("lsyxxxz between", value1, value2, "lsyxxxz");
            return (Criteria) this;
        }

        public Criteria andLsyxxxzNotBetween(Integer value1, Integer value2) {
            addCriterion("lsyxxxz not between", value1, value2, "lsyxxxz");
            return (Criteria) this;
        }

        public Criteria andPdf1IsNull() {
            addCriterion("pdf1 is null");
            return (Criteria) this;
        }

        public Criteria andPdf1IsNotNull() {
            addCriterion("pdf1 is not null");
            return (Criteria) this;
        }

        public Criteria andPdf1EqualTo(Integer value) {
            addCriterion("pdf1 =", value, "pdf1");
            return (Criteria) this;
        }

        public Criteria andPdf1NotEqualTo(Integer value) {
            addCriterion("pdf1 <>", value, "pdf1");
            return (Criteria) this;
        }

        public Criteria andPdf1GreaterThan(Integer value) {
            addCriterion("pdf1 >", value, "pdf1");
            return (Criteria) this;
        }

        public Criteria andPdf1GreaterThanOrEqualTo(Integer value) {
            addCriterion("pdf1 >=", value, "pdf1");
            return (Criteria) this;
        }

        public Criteria andPdf1LessThan(Integer value) {
            addCriterion("pdf1 <", value, "pdf1");
            return (Criteria) this;
        }

        public Criteria andPdf1LessThanOrEqualTo(Integer value) {
            addCriterion("pdf1 <=", value, "pdf1");
            return (Criteria) this;
        }

        public Criteria andPdf1In(List<Integer> values) {
            addCriterion("pdf1 in", values, "pdf1");
            return (Criteria) this;
        }

        public Criteria andPdf1NotIn(List<Integer> values) {
            addCriterion("pdf1 not in", values, "pdf1");
            return (Criteria) this;
        }

        public Criteria andPdf1Between(Integer value1, Integer value2) {
            addCriterion("pdf1 between", value1, value2, "pdf1");
            return (Criteria) this;
        }

        public Criteria andPdf1NotBetween(Integer value1, Integer value2) {
            addCriterion("pdf1 not between", value1, value2, "pdf1");
            return (Criteria) this;
        }

        public Criteria andPdf2IsNull() {
            addCriterion("pdf2 is null");
            return (Criteria) this;
        }

        public Criteria andPdf2IsNotNull() {
            addCriterion("pdf2 is not null");
            return (Criteria) this;
        }

        public Criteria andPdf2EqualTo(Integer value) {
            addCriterion("pdf2 =", value, "pdf2");
            return (Criteria) this;
        }

        public Criteria andPdf2NotEqualTo(Integer value) {
            addCriterion("pdf2 <>", value, "pdf2");
            return (Criteria) this;
        }

        public Criteria andPdf2GreaterThan(Integer value) {
            addCriterion("pdf2 >", value, "pdf2");
            return (Criteria) this;
        }

        public Criteria andPdf2GreaterThanOrEqualTo(Integer value) {
            addCriterion("pdf2 >=", value, "pdf2");
            return (Criteria) this;
        }

        public Criteria andPdf2LessThan(Integer value) {
            addCriterion("pdf2 <", value, "pdf2");
            return (Criteria) this;
        }

        public Criteria andPdf2LessThanOrEqualTo(Integer value) {
            addCriterion("pdf2 <=", value, "pdf2");
            return (Criteria) this;
        }

        public Criteria andPdf2In(List<Integer> values) {
            addCriterion("pdf2 in", values, "pdf2");
            return (Criteria) this;
        }

        public Criteria andPdf2NotIn(List<Integer> values) {
            addCriterion("pdf2 not in", values, "pdf2");
            return (Criteria) this;
        }

        public Criteria andPdf2Between(Integer value1, Integer value2) {
            addCriterion("pdf2 between", value1, value2, "pdf2");
            return (Criteria) this;
        }

        public Criteria andPdf2NotBetween(Integer value1, Integer value2) {
            addCriterion("pdf2 not between", value1, value2, "pdf2");
            return (Criteria) this;
        }

        public Criteria andPdf3IsNull() {
            addCriterion("pdf3 is null");
            return (Criteria) this;
        }

        public Criteria andPdf3IsNotNull() {
            addCriterion("pdf3 is not null");
            return (Criteria) this;
        }

        public Criteria andPdf3EqualTo(Integer value) {
            addCriterion("pdf3 =", value, "pdf3");
            return (Criteria) this;
        }

        public Criteria andPdf3NotEqualTo(Integer value) {
            addCriterion("pdf3 <>", value, "pdf3");
            return (Criteria) this;
        }

        public Criteria andPdf3GreaterThan(Integer value) {
            addCriterion("pdf3 >", value, "pdf3");
            return (Criteria) this;
        }

        public Criteria andPdf3GreaterThanOrEqualTo(Integer value) {
            addCriterion("pdf3 >=", value, "pdf3");
            return (Criteria) this;
        }

        public Criteria andPdf3LessThan(Integer value) {
            addCriterion("pdf3 <", value, "pdf3");
            return (Criteria) this;
        }

        public Criteria andPdf3LessThanOrEqualTo(Integer value) {
            addCriterion("pdf3 <=", value, "pdf3");
            return (Criteria) this;
        }

        public Criteria andPdf3In(List<Integer> values) {
            addCriterion("pdf3 in", values, "pdf3");
            return (Criteria) this;
        }

        public Criteria andPdf3NotIn(List<Integer> values) {
            addCriterion("pdf3 not in", values, "pdf3");
            return (Criteria) this;
        }

        public Criteria andPdf3Between(Integer value1, Integer value2) {
            addCriterion("pdf3 between", value1, value2, "pdf3");
            return (Criteria) this;
        }

        public Criteria andPdf3NotBetween(Integer value1, Integer value2) {
            addCriterion("pdf3 not between", value1, value2, "pdf3");
            return (Criteria) this;
        }

        public Criteria andSpyj1IsNull() {
            addCriterion("spyj1 is null");
            return (Criteria) this;
        }

        public Criteria andSpyj1IsNotNull() {
            addCriterion("spyj1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpyj1EqualTo(Integer value) {
            addCriterion("spyj1 =", value, "spyj1");
            return (Criteria) this;
        }

        public Criteria andSpyj1NotEqualTo(Integer value) {
            addCriterion("spyj1 <>", value, "spyj1");
            return (Criteria) this;
        }

        public Criteria andSpyj1GreaterThan(Integer value) {
            addCriterion("spyj1 >", value, "spyj1");
            return (Criteria) this;
        }

        public Criteria andSpyj1GreaterThanOrEqualTo(Integer value) {
            addCriterion("spyj1 >=", value, "spyj1");
            return (Criteria) this;
        }

        public Criteria andSpyj1LessThan(Integer value) {
            addCriterion("spyj1 <", value, "spyj1");
            return (Criteria) this;
        }

        public Criteria andSpyj1LessThanOrEqualTo(Integer value) {
            addCriterion("spyj1 <=", value, "spyj1");
            return (Criteria) this;
        }

        public Criteria andSpyj1In(List<Integer> values) {
            addCriterion("spyj1 in", values, "spyj1");
            return (Criteria) this;
        }

        public Criteria andSpyj1NotIn(List<Integer> values) {
            addCriterion("spyj1 not in", values, "spyj1");
            return (Criteria) this;
        }

        public Criteria andSpyj1Between(Integer value1, Integer value2) {
            addCriterion("spyj1 between", value1, value2, "spyj1");
            return (Criteria) this;
        }

        public Criteria andSpyj1NotBetween(Integer value1, Integer value2) {
            addCriterion("spyj1 not between", value1, value2, "spyj1");
            return (Criteria) this;
        }

        public Criteria andLsjyIsNull() {
            addCriterion("lsjy is null");
            return (Criteria) this;
        }

        public Criteria andLsjyIsNotNull() {
            addCriterion("lsjy is not null");
            return (Criteria) this;
        }

        public Criteria andLsjyEqualTo(String value) {
            addCriterion("lsjy =", value, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyNotEqualTo(String value) {
            addCriterion("lsjy <>", value, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyGreaterThan(String value) {
            addCriterion("lsjy >", value, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyGreaterThanOrEqualTo(String value) {
            addCriterion("lsjy >=", value, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyLessThan(String value) {
            addCriterion("lsjy <", value, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyLessThanOrEqualTo(String value) {
            addCriterion("lsjy <=", value, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyLike(String value) {
            addCriterion("lsjy like", value, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyNotLike(String value) {
            addCriterion("lsjy not like", value, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyIn(List<String> values) {
            addCriterion("lsjy in", values, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyNotIn(List<String> values) {
            addCriterion("lsjy not in", values, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyBetween(String value1, String value2) {
            addCriterion("lsjy between", value1, value2, "lsjy");
            return (Criteria) this;
        }

        public Criteria andLsjyNotBetween(String value1, String value2) {
            addCriterion("lsjy not between", value1, value2, "lsjy");
            return (Criteria) this;
        }

        public Criteria andFyyjIsNull() {
            addCriterion("fyyj is null");
            return (Criteria) this;
        }

        public Criteria andFyyjIsNotNull() {
            addCriterion("fyyj is not null");
            return (Criteria) this;
        }

        public Criteria andFyyjEqualTo(Integer value) {
            addCriterion("fyyj =", value, "fyyj");
            return (Criteria) this;
        }

        public Criteria andFyyjNotEqualTo(Integer value) {
            addCriterion("fyyj <>", value, "fyyj");
            return (Criteria) this;
        }

        public Criteria andFyyjGreaterThan(Integer value) {
            addCriterion("fyyj >", value, "fyyj");
            return (Criteria) this;
        }

        public Criteria andFyyjGreaterThanOrEqualTo(Integer value) {
            addCriterion("fyyj >=", value, "fyyj");
            return (Criteria) this;
        }

        public Criteria andFyyjLessThan(Integer value) {
            addCriterion("fyyj <", value, "fyyj");
            return (Criteria) this;
        }

        public Criteria andFyyjLessThanOrEqualTo(Integer value) {
            addCriterion("fyyj <=", value, "fyyj");
            return (Criteria) this;
        }

        public Criteria andFyyjIn(List<Integer> values) {
            addCriterion("fyyj in", values, "fyyj");
            return (Criteria) this;
        }

        public Criteria andFyyjNotIn(List<Integer> values) {
            addCriterion("fyyj not in", values, "fyyj");
            return (Criteria) this;
        }

        public Criteria andFyyjBetween(Integer value1, Integer value2) {
            addCriterion("fyyj between", value1, value2, "fyyj");
            return (Criteria) this;
        }

        public Criteria andFyyjNotBetween(Integer value1, Integer value2) {
            addCriterion("fyyj not between", value1, value2, "fyyj");
            return (Criteria) this;
        }

        public Criteria andSpyj2IsNull() {
            addCriterion("spyj2 is null");
            return (Criteria) this;
        }

        public Criteria andSpyj2IsNotNull() {
            addCriterion("spyj2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpyj2EqualTo(Integer value) {
            addCriterion("spyj2 =", value, "spyj2");
            return (Criteria) this;
        }

        public Criteria andSpyj2NotEqualTo(Integer value) {
            addCriterion("spyj2 <>", value, "spyj2");
            return (Criteria) this;
        }

        public Criteria andSpyj2GreaterThan(Integer value) {
            addCriterion("spyj2 >", value, "spyj2");
            return (Criteria) this;
        }

        public Criteria andSpyj2GreaterThanOrEqualTo(Integer value) {
            addCriterion("spyj2 >=", value, "spyj2");
            return (Criteria) this;
        }

        public Criteria andSpyj2LessThan(Integer value) {
            addCriterion("spyj2 <", value, "spyj2");
            return (Criteria) this;
        }

        public Criteria andSpyj2LessThanOrEqualTo(Integer value) {
            addCriterion("spyj2 <=", value, "spyj2");
            return (Criteria) this;
        }

        public Criteria andSpyj2In(List<Integer> values) {
            addCriterion("spyj2 in", values, "spyj2");
            return (Criteria) this;
        }

        public Criteria andSpyj2NotIn(List<Integer> values) {
            addCriterion("spyj2 not in", values, "spyj2");
            return (Criteria) this;
        }

        public Criteria andSpyj2Between(Integer value1, Integer value2) {
            addCriterion("spyj2 between", value1, value2, "spyj2");
            return (Criteria) this;
        }

        public Criteria andSpyj2NotBetween(Integer value1, Integer value2) {
            addCriterion("spyj2 not between", value1, value2, "spyj2");
            return (Criteria) this;
        }

        public Criteria andFujianIsNull() {
            addCriterion("fujian is null");
            return (Criteria) this;
        }

        public Criteria andFujianIsNotNull() {
            addCriterion("fujian is not null");
            return (Criteria) this;
        }

        public Criteria andFujianEqualTo(String value) {
            addCriterion("fujian =", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianNotEqualTo(String value) {
            addCriterion("fujian <>", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianGreaterThan(String value) {
            addCriterion("fujian >", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianGreaterThanOrEqualTo(String value) {
            addCriterion("fujian >=", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianLessThan(String value) {
            addCriterion("fujian <", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianLessThanOrEqualTo(String value) {
            addCriterion("fujian <=", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianLike(String value) {
            addCriterion("fujian like", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianNotLike(String value) {
            addCriterion("fujian not like", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianIn(List<String> values) {
            addCriterion("fujian in", values, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianNotIn(List<String> values) {
            addCriterion("fujian not in", values, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianBetween(String value1, String value2) {
            addCriterion("fujian between", value1, value2, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianNotBetween(String value1, String value2) {
            addCriterion("fujian not between", value1, value2, "fujian");
            return (Criteria) this;
        }

        public Criteria andWdwzpIsNull() {
            addCriterion("wdwzp is null");
            return (Criteria) this;
        }

        public Criteria andWdwzpIsNotNull() {
            addCriterion("wdwzp is not null");
            return (Criteria) this;
        }

        public Criteria andWdwzpEqualTo(Integer value) {
            addCriterion("wdwzp =", value, "wdwzp");
            return (Criteria) this;
        }

        public Criteria andWdwzpNotEqualTo(Integer value) {
            addCriterion("wdwzp <>", value, "wdwzp");
            return (Criteria) this;
        }

        public Criteria andWdwzpGreaterThan(Integer value) {
            addCriterion("wdwzp >", value, "wdwzp");
            return (Criteria) this;
        }

        public Criteria andWdwzpGreaterThanOrEqualTo(Integer value) {
            addCriterion("wdwzp >=", value, "wdwzp");
            return (Criteria) this;
        }

        public Criteria andWdwzpLessThan(Integer value) {
            addCriterion("wdwzp <", value, "wdwzp");
            return (Criteria) this;
        }

        public Criteria andWdwzpLessThanOrEqualTo(Integer value) {
            addCriterion("wdwzp <=", value, "wdwzp");
            return (Criteria) this;
        }

        public Criteria andWdwzpIn(List<Integer> values) {
            addCriterion("wdwzp in", values, "wdwzp");
            return (Criteria) this;
        }

        public Criteria andWdwzpNotIn(List<Integer> values) {
            addCriterion("wdwzp not in", values, "wdwzp");
            return (Criteria) this;
        }

        public Criteria andWdwzpBetween(Integer value1, Integer value2) {
            addCriterion("wdwzp between", value1, value2, "wdwzp");
            return (Criteria) this;
        }

        public Criteria andWdwzpNotBetween(Integer value1, Integer value2) {
            addCriterion("wdwzp not between", value1, value2, "wdwzp");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpIsNull() {
            addCriterion("fylsdwzzp is null");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpIsNotNull() {
            addCriterion("fylsdwzzp is not null");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpEqualTo(Integer value) {
            addCriterion("fylsdwzzp =", value, "fylsdwzzp");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpNotEqualTo(Integer value) {
            addCriterion("fylsdwzzp <>", value, "fylsdwzzp");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpGreaterThan(Integer value) {
            addCriterion("fylsdwzzp >", value, "fylsdwzzp");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpGreaterThanOrEqualTo(Integer value) {
            addCriterion("fylsdwzzp >=", value, "fylsdwzzp");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpLessThan(Integer value) {
            addCriterion("fylsdwzzp <", value, "fylsdwzzp");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpLessThanOrEqualTo(Integer value) {
            addCriterion("fylsdwzzp <=", value, "fylsdwzzp");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpIn(List<Integer> values) {
            addCriterion("fylsdwzzp in", values, "fylsdwzzp");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpNotIn(List<Integer> values) {
            addCriterion("fylsdwzzp not in", values, "fylsdwzzp");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpBetween(Integer value1, Integer value2) {
            addCriterion("fylsdwzzp between", value1, value2, "fylsdwzzp");
            return (Criteria) this;
        }

        public Criteria andFylsdwzzpNotBetween(Integer value1, Integer value2) {
            addCriterion("fylsdwzzp not between", value1, value2, "fylsdwzzp");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9IsNull() {
            addCriterion("lsrzzp9 is null");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9IsNotNull() {
            addCriterion("lsrzzp9 is not null");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9EqualTo(Integer value) {
            addCriterion("lsrzzp9 =", value, "lsrzzp9");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9NotEqualTo(Integer value) {
            addCriterion("lsrzzp9 <>", value, "lsrzzp9");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9GreaterThan(Integer value) {
            addCriterion("lsrzzp9 >", value, "lsrzzp9");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9GreaterThanOrEqualTo(Integer value) {
            addCriterion("lsrzzp9 >=", value, "lsrzzp9");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9LessThan(Integer value) {
            addCriterion("lsrzzp9 <", value, "lsrzzp9");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9LessThanOrEqualTo(Integer value) {
            addCriterion("lsrzzp9 <=", value, "lsrzzp9");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9In(List<Integer> values) {
            addCriterion("lsrzzp9 in", values, "lsrzzp9");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9NotIn(List<Integer> values) {
            addCriterion("lsrzzp9 not in", values, "lsrzzp9");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9Between(Integer value1, Integer value2) {
            addCriterion("lsrzzp9 between", value1, value2, "lsrzzp9");
            return (Criteria) this;
        }

        public Criteria andLsrzzp9NotBetween(Integer value1, Integer value2) {
            addCriterion("lsrzzp9 not between", value1, value2, "lsrzzp9");
            return (Criteria) this;
        }

        public Criteria andDlrxIsNull() {
            addCriterion("dlrx is null");
            return (Criteria) this;
        }

        public Criteria andDlrxIsNotNull() {
            addCriterion("dlrx is not null");
            return (Criteria) this;
        }

        public Criteria andDlrxEqualTo(String value) {
            addCriterion("dlrx =", value, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxNotEqualTo(String value) {
            addCriterion("dlrx <>", value, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxGreaterThan(String value) {
            addCriterion("dlrx >", value, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxGreaterThanOrEqualTo(String value) {
            addCriterion("dlrx >=", value, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxLessThan(String value) {
            addCriterion("dlrx <", value, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxLessThanOrEqualTo(String value) {
            addCriterion("dlrx <=", value, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxLike(String value) {
            addCriterion("dlrx like", value, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxNotLike(String value) {
            addCriterion("dlrx not like", value, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxIn(List<String> values) {
            addCriterion("dlrx in", values, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxNotIn(List<String> values) {
            addCriterion("dlrx not in", values, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxBetween(String value1, String value2) {
            addCriterion("dlrx between", value1, value2, "dlrx");
            return (Criteria) this;
        }

        public Criteria andDlrxNotBetween(String value1, String value2) {
            addCriterion("dlrx not between", value1, value2, "dlrx");
            return (Criteria) this;
        }

        public Criteria andSqrqIsNull() {
            addCriterion("SQRQ is null");
            return (Criteria) this;
        }

        public Criteria andSqrqIsNotNull() {
            addCriterion("SQRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSqrqEqualTo(String value) {
            addCriterion("SQRQ =", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotEqualTo(String value) {
            addCriterion("SQRQ <>", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqGreaterThan(String value) {
            addCriterion("SQRQ >", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqGreaterThanOrEqualTo(String value) {
            addCriterion("SQRQ >=", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLessThan(String value) {
            addCriterion("SQRQ <", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLessThanOrEqualTo(String value) {
            addCriterion("SQRQ <=", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLike(String value) {
            addCriterion("SQRQ like", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotLike(String value) {
            addCriterion("SQRQ not like", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqIn(List<String> values) {
            addCriterion("SQRQ in", values, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotIn(List<String> values) {
            addCriterion("SQRQ not in", values, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqBetween(String value1, String value2) {
            addCriterion("SQRQ between", value1, value2, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotBetween(String value1, String value2) {
            addCriterion("SQRQ not between", value1, value2, "sqrq");
            return (Criteria) this;
        }

        public Criteria andCsyjbzIsNull() {
            addCriterion("csyjbz is null");
            return (Criteria) this;
        }

        public Criteria andCsyjbzIsNotNull() {
            addCriterion("csyjbz is not null");
            return (Criteria) this;
        }

        public Criteria andCsyjbzEqualTo(String value) {
            addCriterion("csyjbz =", value, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzNotEqualTo(String value) {
            addCriterion("csyjbz <>", value, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzGreaterThan(String value) {
            addCriterion("csyjbz >", value, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzGreaterThanOrEqualTo(String value) {
            addCriterion("csyjbz >=", value, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzLessThan(String value) {
            addCriterion("csyjbz <", value, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzLessThanOrEqualTo(String value) {
            addCriterion("csyjbz <=", value, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzLike(String value) {
            addCriterion("csyjbz like", value, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzNotLike(String value) {
            addCriterion("csyjbz not like", value, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzIn(List<String> values) {
            addCriterion("csyjbz in", values, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzNotIn(List<String> values) {
            addCriterion("csyjbz not in", values, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzBetween(String value1, String value2) {
            addCriterion("csyjbz between", value1, value2, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andCsyjbzNotBetween(String value1, String value2) {
            addCriterion("csyjbz not between", value1, value2, "csyjbz");
            return (Criteria) this;
        }

        public Criteria andBanzuIsNull() {
            addCriterion("BANZU is null");
            return (Criteria) this;
        }

        public Criteria andBanzuIsNotNull() {
            addCriterion("BANZU is not null");
            return (Criteria) this;
        }

        public Criteria andBanzuEqualTo(String value) {
            addCriterion("BANZU =", value, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuNotEqualTo(String value) {
            addCriterion("BANZU <>", value, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuGreaterThan(String value) {
            addCriterion("BANZU >", value, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuGreaterThanOrEqualTo(String value) {
            addCriterion("BANZU >=", value, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuLessThan(String value) {
            addCriterion("BANZU <", value, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuLessThanOrEqualTo(String value) {
            addCriterion("BANZU <=", value, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuLike(String value) {
            addCriterion("BANZU like", value, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuNotLike(String value) {
            addCriterion("BANZU not like", value, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuIn(List<String> values) {
            addCriterion("BANZU in", values, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuNotIn(List<String> values) {
            addCriterion("BANZU not in", values, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuBetween(String value1, String value2) {
            addCriterion("BANZU between", value1, value2, "banzu");
            return (Criteria) this;
        }

        public Criteria andBanzuNotBetween(String value1, String value2) {
            addCriterion("BANZU not between", value1, value2, "banzu");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagIsNull() {
            addCriterion("FTriggerFlag is null");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagIsNotNull() {
            addCriterion("FTriggerFlag is not null");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagEqualTo(Integer value) {
            addCriterion("FTriggerFlag =", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagNotEqualTo(Integer value) {
            addCriterion("FTriggerFlag <>", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagGreaterThan(Integer value) {
            addCriterion("FTriggerFlag >", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("FTriggerFlag >=", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagLessThan(Integer value) {
            addCriterion("FTriggerFlag <", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagLessThanOrEqualTo(Integer value) {
            addCriterion("FTriggerFlag <=", value, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagIn(List<Integer> values) {
            addCriterion("FTriggerFlag in", values, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagNotIn(List<Integer> values) {
            addCriterion("FTriggerFlag not in", values, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagBetween(Integer value1, Integer value2) {
            addCriterion("FTriggerFlag between", value1, value2, "ftriggerflag");
            return (Criteria) this;
        }

        public Criteria andFtriggerflagNotBetween(Integer value1, Integer value2) {
            addCriterion("FTriggerFlag not between", value1, value2, "ftriggerflag");
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