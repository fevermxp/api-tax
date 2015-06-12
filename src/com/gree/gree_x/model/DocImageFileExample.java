package com.gree.gree_x.model;

import java.util.ArrayList;
import java.util.List;

public class DocImageFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocImageFileExample() {
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

        public Criteria andDocidIsNull() {
            addCriterion("docid is null");
            return (Criteria) this;
        }

        public Criteria andDocidIsNotNull() {
            addCriterion("docid is not null");
            return (Criteria) this;
        }

        public Criteria andDocidEqualTo(Integer value) {
            addCriterion("docid =", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotEqualTo(Integer value) {
            addCriterion("docid <>", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThan(Integer value) {
            addCriterion("docid >", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docid >=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThan(Integer value) {
            addCriterion("docid <", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThanOrEqualTo(Integer value) {
            addCriterion("docid <=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidIn(List<Integer> values) {
            addCriterion("docid in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotIn(List<Integer> values) {
            addCriterion("docid not in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidBetween(Integer value1, Integer value2) {
            addCriterion("docid between", value1, value2, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotBetween(Integer value1, Integer value2) {
            addCriterion("docid not between", value1, value2, "docid");
            return (Criteria) this;
        }

        public Criteria andImagefileidIsNull() {
            addCriterion("imagefileid is null");
            return (Criteria) this;
        }

        public Criteria andImagefileidIsNotNull() {
            addCriterion("imagefileid is not null");
            return (Criteria) this;
        }

        public Criteria andImagefileidEqualTo(Integer value) {
            addCriterion("imagefileid =", value, "imagefileid");
            return (Criteria) this;
        }

        public Criteria andImagefileidNotEqualTo(Integer value) {
            addCriterion("imagefileid <>", value, "imagefileid");
            return (Criteria) this;
        }

        public Criteria andImagefileidGreaterThan(Integer value) {
            addCriterion("imagefileid >", value, "imagefileid");
            return (Criteria) this;
        }

        public Criteria andImagefileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("imagefileid >=", value, "imagefileid");
            return (Criteria) this;
        }

        public Criteria andImagefileidLessThan(Integer value) {
            addCriterion("imagefileid <", value, "imagefileid");
            return (Criteria) this;
        }

        public Criteria andImagefileidLessThanOrEqualTo(Integer value) {
            addCriterion("imagefileid <=", value, "imagefileid");
            return (Criteria) this;
        }

        public Criteria andImagefileidIn(List<Integer> values) {
            addCriterion("imagefileid in", values, "imagefileid");
            return (Criteria) this;
        }

        public Criteria andImagefileidNotIn(List<Integer> values) {
            addCriterion("imagefileid not in", values, "imagefileid");
            return (Criteria) this;
        }

        public Criteria andImagefileidBetween(Integer value1, Integer value2) {
            addCriterion("imagefileid between", value1, value2, "imagefileid");
            return (Criteria) this;
        }

        public Criteria andImagefileidNotBetween(Integer value1, Integer value2) {
            addCriterion("imagefileid not between", value1, value2, "imagefileid");
            return (Criteria) this;
        }

        public Criteria andImagefilenameIsNull() {
            addCriterion("imagefilename is null");
            return (Criteria) this;
        }

        public Criteria andImagefilenameIsNotNull() {
            addCriterion("imagefilename is not null");
            return (Criteria) this;
        }

        public Criteria andImagefilenameEqualTo(String value) {
            addCriterion("imagefilename =", value, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameNotEqualTo(String value) {
            addCriterion("imagefilename <>", value, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameGreaterThan(String value) {
            addCriterion("imagefilename >", value, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameGreaterThanOrEqualTo(String value) {
            addCriterion("imagefilename >=", value, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameLessThan(String value) {
            addCriterion("imagefilename <", value, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameLessThanOrEqualTo(String value) {
            addCriterion("imagefilename <=", value, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameLike(String value) {
            addCriterion("imagefilename like", value, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameNotLike(String value) {
            addCriterion("imagefilename not like", value, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameIn(List<String> values) {
            addCriterion("imagefilename in", values, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameNotIn(List<String> values) {
            addCriterion("imagefilename not in", values, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameBetween(String value1, String value2) {
            addCriterion("imagefilename between", value1, value2, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefilenameNotBetween(String value1, String value2) {
            addCriterion("imagefilename not between", value1, value2, "imagefilename");
            return (Criteria) this;
        }

        public Criteria andImagefiledescIsNull() {
            addCriterion("imagefiledesc is null");
            return (Criteria) this;
        }

        public Criteria andImagefiledescIsNotNull() {
            addCriterion("imagefiledesc is not null");
            return (Criteria) this;
        }

        public Criteria andImagefiledescEqualTo(String value) {
            addCriterion("imagefiledesc =", value, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescNotEqualTo(String value) {
            addCriterion("imagefiledesc <>", value, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescGreaterThan(String value) {
            addCriterion("imagefiledesc >", value, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescGreaterThanOrEqualTo(String value) {
            addCriterion("imagefiledesc >=", value, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescLessThan(String value) {
            addCriterion("imagefiledesc <", value, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescLessThanOrEqualTo(String value) {
            addCriterion("imagefiledesc <=", value, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescLike(String value) {
            addCriterion("imagefiledesc like", value, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescNotLike(String value) {
            addCriterion("imagefiledesc not like", value, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescIn(List<String> values) {
            addCriterion("imagefiledesc in", values, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescNotIn(List<String> values) {
            addCriterion("imagefiledesc not in", values, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescBetween(String value1, String value2) {
            addCriterion("imagefiledesc between", value1, value2, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefiledescNotBetween(String value1, String value2) {
            addCriterion("imagefiledesc not between", value1, value2, "imagefiledesc");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthIsNull() {
            addCriterion("imagefilewidth is null");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthIsNotNull() {
            addCriterion("imagefilewidth is not null");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthEqualTo(Integer value) {
            addCriterion("imagefilewidth =", value, "imagefilewidth");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthNotEqualTo(Integer value) {
            addCriterion("imagefilewidth <>", value, "imagefilewidth");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthGreaterThan(Integer value) {
            addCriterion("imagefilewidth >", value, "imagefilewidth");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("imagefilewidth >=", value, "imagefilewidth");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthLessThan(Integer value) {
            addCriterion("imagefilewidth <", value, "imagefilewidth");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthLessThanOrEqualTo(Integer value) {
            addCriterion("imagefilewidth <=", value, "imagefilewidth");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthIn(List<Integer> values) {
            addCriterion("imagefilewidth in", values, "imagefilewidth");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthNotIn(List<Integer> values) {
            addCriterion("imagefilewidth not in", values, "imagefilewidth");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthBetween(Integer value1, Integer value2) {
            addCriterion("imagefilewidth between", value1, value2, "imagefilewidth");
            return (Criteria) this;
        }

        public Criteria andImagefilewidthNotBetween(Integer value1, Integer value2) {
            addCriterion("imagefilewidth not between", value1, value2, "imagefilewidth");
            return (Criteria) this;
        }

        public Criteria andImagefileheightIsNull() {
            addCriterion("imagefileheight is null");
            return (Criteria) this;
        }

        public Criteria andImagefileheightIsNotNull() {
            addCriterion("imagefileheight is not null");
            return (Criteria) this;
        }

        public Criteria andImagefileheightEqualTo(Integer value) {
            addCriterion("imagefileheight =", value, "imagefileheight");
            return (Criteria) this;
        }

        public Criteria andImagefileheightNotEqualTo(Integer value) {
            addCriterion("imagefileheight <>", value, "imagefileheight");
            return (Criteria) this;
        }

        public Criteria andImagefileheightGreaterThan(Integer value) {
            addCriterion("imagefileheight >", value, "imagefileheight");
            return (Criteria) this;
        }

        public Criteria andImagefileheightGreaterThanOrEqualTo(Integer value) {
            addCriterion("imagefileheight >=", value, "imagefileheight");
            return (Criteria) this;
        }

        public Criteria andImagefileheightLessThan(Integer value) {
            addCriterion("imagefileheight <", value, "imagefileheight");
            return (Criteria) this;
        }

        public Criteria andImagefileheightLessThanOrEqualTo(Integer value) {
            addCriterion("imagefileheight <=", value, "imagefileheight");
            return (Criteria) this;
        }

        public Criteria andImagefileheightIn(List<Integer> values) {
            addCriterion("imagefileheight in", values, "imagefileheight");
            return (Criteria) this;
        }

        public Criteria andImagefileheightNotIn(List<Integer> values) {
            addCriterion("imagefileheight not in", values, "imagefileheight");
            return (Criteria) this;
        }

        public Criteria andImagefileheightBetween(Integer value1, Integer value2) {
            addCriterion("imagefileheight between", value1, value2, "imagefileheight");
            return (Criteria) this;
        }

        public Criteria andImagefileheightNotBetween(Integer value1, Integer value2) {
            addCriterion("imagefileheight not between", value1, value2, "imagefileheight");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeIsNull() {
            addCriterion("imagefielsize is null");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeIsNotNull() {
            addCriterion("imagefielsize is not null");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeEqualTo(Integer value) {
            addCriterion("imagefielsize =", value, "imagefielsize");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeNotEqualTo(Integer value) {
            addCriterion("imagefielsize <>", value, "imagefielsize");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeGreaterThan(Integer value) {
            addCriterion("imagefielsize >", value, "imagefielsize");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("imagefielsize >=", value, "imagefielsize");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeLessThan(Integer value) {
            addCriterion("imagefielsize <", value, "imagefielsize");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeLessThanOrEqualTo(Integer value) {
            addCriterion("imagefielsize <=", value, "imagefielsize");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeIn(List<Integer> values) {
            addCriterion("imagefielsize in", values, "imagefielsize");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeNotIn(List<Integer> values) {
            addCriterion("imagefielsize not in", values, "imagefielsize");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeBetween(Integer value1, Integer value2) {
            addCriterion("imagefielsize between", value1, value2, "imagefielsize");
            return (Criteria) this;
        }

        public Criteria andImagefielsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("imagefielsize not between", value1, value2, "imagefielsize");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeIsNull() {
            addCriterion("docfiletype is null");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeIsNotNull() {
            addCriterion("docfiletype is not null");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeEqualTo(String value) {
            addCriterion("docfiletype =", value, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeNotEqualTo(String value) {
            addCriterion("docfiletype <>", value, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeGreaterThan(String value) {
            addCriterion("docfiletype >", value, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("docfiletype >=", value, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeLessThan(String value) {
            addCriterion("docfiletype <", value, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeLessThanOrEqualTo(String value) {
            addCriterion("docfiletype <=", value, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeLike(String value) {
            addCriterion("docfiletype like", value, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeNotLike(String value) {
            addCriterion("docfiletype not like", value, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeIn(List<String> values) {
            addCriterion("docfiletype in", values, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeNotIn(List<String> values) {
            addCriterion("docfiletype not in", values, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeBetween(String value1, String value2) {
            addCriterion("docfiletype between", value1, value2, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andDocfiletypeNotBetween(String value1, String value2) {
            addCriterion("docfiletype not between", value1, value2, "docfiletype");
            return (Criteria) this;
        }

        public Criteria andVersionidIsNull() {
            addCriterion("versionId is null");
            return (Criteria) this;
        }

        public Criteria andVersionidIsNotNull() {
            addCriterion("versionId is not null");
            return (Criteria) this;
        }

        public Criteria andVersionidEqualTo(Integer value) {
            addCriterion("versionId =", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotEqualTo(Integer value) {
            addCriterion("versionId <>", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidGreaterThan(Integer value) {
            addCriterion("versionId >", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("versionId >=", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidLessThan(Integer value) {
            addCriterion("versionId <", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidLessThanOrEqualTo(Integer value) {
            addCriterion("versionId <=", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidIn(List<Integer> values) {
            addCriterion("versionId in", values, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotIn(List<Integer> values) {
            addCriterion("versionId not in", values, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidBetween(Integer value1, Integer value2) {
            addCriterion("versionId between", value1, value2, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotBetween(Integer value1, Integer value2) {
            addCriterion("versionId not between", value1, value2, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersiondetailIsNull() {
            addCriterion("versionDetail is null");
            return (Criteria) this;
        }

        public Criteria andVersiondetailIsNotNull() {
            addCriterion("versionDetail is not null");
            return (Criteria) this;
        }

        public Criteria andVersiondetailEqualTo(String value) {
            addCriterion("versionDetail =", value, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailNotEqualTo(String value) {
            addCriterion("versionDetail <>", value, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailGreaterThan(String value) {
            addCriterion("versionDetail >", value, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailGreaterThanOrEqualTo(String value) {
            addCriterion("versionDetail >=", value, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailLessThan(String value) {
            addCriterion("versionDetail <", value, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailLessThanOrEqualTo(String value) {
            addCriterion("versionDetail <=", value, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailLike(String value) {
            addCriterion("versionDetail like", value, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailNotLike(String value) {
            addCriterion("versionDetail not like", value, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailIn(List<String> values) {
            addCriterion("versionDetail in", values, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailNotIn(List<String> values) {
            addCriterion("versionDetail not in", values, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailBetween(String value1, String value2) {
            addCriterion("versionDetail between", value1, value2, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andVersiondetailNotBetween(String value1, String value2) {
            addCriterion("versionDetail not between", value1, value2, "versiondetail");
            return (Criteria) this;
        }

        public Criteria andIsextfileIsNull() {
            addCriterion("isextfile is null");
            return (Criteria) this;
        }

        public Criteria andIsextfileIsNotNull() {
            addCriterion("isextfile is not null");
            return (Criteria) this;
        }

        public Criteria andIsextfileEqualTo(String value) {
            addCriterion("isextfile =", value, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileNotEqualTo(String value) {
            addCriterion("isextfile <>", value, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileGreaterThan(String value) {
            addCriterion("isextfile >", value, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileGreaterThanOrEqualTo(String value) {
            addCriterion("isextfile >=", value, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileLessThan(String value) {
            addCriterion("isextfile <", value, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileLessThanOrEqualTo(String value) {
            addCriterion("isextfile <=", value, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileLike(String value) {
            addCriterion("isextfile like", value, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileNotLike(String value) {
            addCriterion("isextfile not like", value, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileIn(List<String> values) {
            addCriterion("isextfile in", values, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileNotIn(List<String> values) {
            addCriterion("isextfile not in", values, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileBetween(String value1, String value2) {
            addCriterion("isextfile between", value1, value2, "isextfile");
            return (Criteria) this;
        }

        public Criteria andIsextfileNotBetween(String value1, String value2) {
            addCriterion("isextfile not between", value1, value2, "isextfile");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletIsNull() {
            addCriterion("hasUsedTemplet is null");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletIsNotNull() {
            addCriterion("hasUsedTemplet is not null");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletEqualTo(String value) {
            addCriterion("hasUsedTemplet =", value, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletNotEqualTo(String value) {
            addCriterion("hasUsedTemplet <>", value, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletGreaterThan(String value) {
            addCriterion("hasUsedTemplet >", value, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletGreaterThanOrEqualTo(String value) {
            addCriterion("hasUsedTemplet >=", value, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletLessThan(String value) {
            addCriterion("hasUsedTemplet <", value, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletLessThanOrEqualTo(String value) {
            addCriterion("hasUsedTemplet <=", value, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletLike(String value) {
            addCriterion("hasUsedTemplet like", value, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletNotLike(String value) {
            addCriterion("hasUsedTemplet not like", value, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletIn(List<String> values) {
            addCriterion("hasUsedTemplet in", values, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletNotIn(List<String> values) {
            addCriterion("hasUsedTemplet not in", values, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletBetween(String value1, String value2) {
            addCriterion("hasUsedTemplet between", value1, value2, "hasusedtemplet");
            return (Criteria) this;
        }

        public Criteria andHasusedtempletNotBetween(String value1, String value2) {
            addCriterion("hasUsedTemplet not between", value1, value2, "hasusedtemplet");
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