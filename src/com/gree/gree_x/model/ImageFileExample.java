package com.gree.gree_x.model;

import java.util.ArrayList;
import java.util.List;

public class ImageFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageFileExample() {
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

        public Criteria andImagefiletypeIsNull() {
            addCriterion("imagefiletype is null");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeIsNotNull() {
            addCriterion("imagefiletype is not null");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeEqualTo(String value) {
            addCriterion("imagefiletype =", value, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeNotEqualTo(String value) {
            addCriterion("imagefiletype <>", value, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeGreaterThan(String value) {
            addCriterion("imagefiletype >", value, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("imagefiletype >=", value, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeLessThan(String value) {
            addCriterion("imagefiletype <", value, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeLessThanOrEqualTo(String value) {
            addCriterion("imagefiletype <=", value, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeLike(String value) {
            addCriterion("imagefiletype like", value, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeNotLike(String value) {
            addCriterion("imagefiletype not like", value, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeIn(List<String> values) {
            addCriterion("imagefiletype in", values, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeNotIn(List<String> values) {
            addCriterion("imagefiletype not in", values, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeBetween(String value1, String value2) {
            addCriterion("imagefiletype between", value1, value2, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefiletypeNotBetween(String value1, String value2) {
            addCriterion("imagefiletype not between", value1, value2, "imagefiletype");
            return (Criteria) this;
        }

        public Criteria andImagefileusedIsNull() {
            addCriterion("imagefileused is null");
            return (Criteria) this;
        }

        public Criteria andImagefileusedIsNotNull() {
            addCriterion("imagefileused is not null");
            return (Criteria) this;
        }

        public Criteria andImagefileusedEqualTo(Integer value) {
            addCriterion("imagefileused =", value, "imagefileused");
            return (Criteria) this;
        }

        public Criteria andImagefileusedNotEqualTo(Integer value) {
            addCriterion("imagefileused <>", value, "imagefileused");
            return (Criteria) this;
        }

        public Criteria andImagefileusedGreaterThan(Integer value) {
            addCriterion("imagefileused >", value, "imagefileused");
            return (Criteria) this;
        }

        public Criteria andImagefileusedGreaterThanOrEqualTo(Integer value) {
            addCriterion("imagefileused >=", value, "imagefileused");
            return (Criteria) this;
        }

        public Criteria andImagefileusedLessThan(Integer value) {
            addCriterion("imagefileused <", value, "imagefileused");
            return (Criteria) this;
        }

        public Criteria andImagefileusedLessThanOrEqualTo(Integer value) {
            addCriterion("imagefileused <=", value, "imagefileused");
            return (Criteria) this;
        }

        public Criteria andImagefileusedIn(List<Integer> values) {
            addCriterion("imagefileused in", values, "imagefileused");
            return (Criteria) this;
        }

        public Criteria andImagefileusedNotIn(List<Integer> values) {
            addCriterion("imagefileused not in", values, "imagefileused");
            return (Criteria) this;
        }

        public Criteria andImagefileusedBetween(Integer value1, Integer value2) {
            addCriterion("imagefileused between", value1, value2, "imagefileused");
            return (Criteria) this;
        }

        public Criteria andImagefileusedNotBetween(Integer value1, Integer value2) {
            addCriterion("imagefileused not between", value1, value2, "imagefileused");
            return (Criteria) this;
        }

        public Criteria andFilerealpathIsNull() {
            addCriterion("filerealpath is null");
            return (Criteria) this;
        }

        public Criteria andFilerealpathIsNotNull() {
            addCriterion("filerealpath is not null");
            return (Criteria) this;
        }

        public Criteria andFilerealpathEqualTo(String value) {
            addCriterion("filerealpath =", value, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathNotEqualTo(String value) {
            addCriterion("filerealpath <>", value, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathGreaterThan(String value) {
            addCriterion("filerealpath >", value, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathGreaterThanOrEqualTo(String value) {
            addCriterion("filerealpath >=", value, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathLessThan(String value) {
            addCriterion("filerealpath <", value, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathLessThanOrEqualTo(String value) {
            addCriterion("filerealpath <=", value, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathLike(String value) {
            addCriterion("filerealpath like", value, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathNotLike(String value) {
            addCriterion("filerealpath not like", value, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathIn(List<String> values) {
            addCriterion("filerealpath in", values, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathNotIn(List<String> values) {
            addCriterion("filerealpath not in", values, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathBetween(String value1, String value2) {
            addCriterion("filerealpath between", value1, value2, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andFilerealpathNotBetween(String value1, String value2) {
            addCriterion("filerealpath not between", value1, value2, "filerealpath");
            return (Criteria) this;
        }

        public Criteria andIszipIsNull() {
            addCriterion("iszip is null");
            return (Criteria) this;
        }

        public Criteria andIszipIsNotNull() {
            addCriterion("iszip is not null");
            return (Criteria) this;
        }

        public Criteria andIszipEqualTo(String value) {
            addCriterion("iszip =", value, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipNotEqualTo(String value) {
            addCriterion("iszip <>", value, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipGreaterThan(String value) {
            addCriterion("iszip >", value, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipGreaterThanOrEqualTo(String value) {
            addCriterion("iszip >=", value, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipLessThan(String value) {
            addCriterion("iszip <", value, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipLessThanOrEqualTo(String value) {
            addCriterion("iszip <=", value, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipLike(String value) {
            addCriterion("iszip like", value, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipNotLike(String value) {
            addCriterion("iszip not like", value, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipIn(List<String> values) {
            addCriterion("iszip in", values, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipNotIn(List<String> values) {
            addCriterion("iszip not in", values, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipBetween(String value1, String value2) {
            addCriterion("iszip between", value1, value2, "iszip");
            return (Criteria) this;
        }

        public Criteria andIszipNotBetween(String value1, String value2) {
            addCriterion("iszip not between", value1, value2, "iszip");
            return (Criteria) this;
        }

        public Criteria andIsencryptIsNull() {
            addCriterion("isencrypt is null");
            return (Criteria) this;
        }

        public Criteria andIsencryptIsNotNull() {
            addCriterion("isencrypt is not null");
            return (Criteria) this;
        }

        public Criteria andIsencryptEqualTo(String value) {
            addCriterion("isencrypt =", value, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptNotEqualTo(String value) {
            addCriterion("isencrypt <>", value, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptGreaterThan(String value) {
            addCriterion("isencrypt >", value, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptGreaterThanOrEqualTo(String value) {
            addCriterion("isencrypt >=", value, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptLessThan(String value) {
            addCriterion("isencrypt <", value, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptLessThanOrEqualTo(String value) {
            addCriterion("isencrypt <=", value, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptLike(String value) {
            addCriterion("isencrypt like", value, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptNotLike(String value) {
            addCriterion("isencrypt not like", value, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptIn(List<String> values) {
            addCriterion("isencrypt in", values, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptNotIn(List<String> values) {
            addCriterion("isencrypt not in", values, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptBetween(String value1, String value2) {
            addCriterion("isencrypt between", value1, value2, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andIsencryptNotBetween(String value1, String value2) {
            addCriterion("isencrypt not between", value1, value2, "isencrypt");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("fileSize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("fileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(String value) {
            addCriterion("fileSize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(String value) {
            addCriterion("fileSize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(String value) {
            addCriterion("fileSize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(String value) {
            addCriterion("fileSize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(String value) {
            addCriterion("fileSize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(String value) {
            addCriterion("fileSize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLike(String value) {
            addCriterion("fileSize like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotLike(String value) {
            addCriterion("fileSize not like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<String> values) {
            addCriterion("fileSize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<String> values) {
            addCriterion("fileSize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(String value1, String value2) {
            addCriterion("fileSize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(String value1, String value2) {
            addCriterion("fileSize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNull() {
            addCriterion("downloads is null");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNotNull() {
            addCriterion("downloads is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadsEqualTo(Integer value) {
            addCriterion("downloads =", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotEqualTo(Integer value) {
            addCriterion("downloads <>", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThan(Integer value) {
            addCriterion("downloads >", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("downloads >=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThan(Integer value) {
            addCriterion("downloads <", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThanOrEqualTo(Integer value) {
            addCriterion("downloads <=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsIn(List<Integer> values) {
            addCriterion("downloads in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotIn(List<Integer> values) {
            addCriterion("downloads not in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsBetween(Integer value1, Integer value2) {
            addCriterion("downloads between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotBetween(Integer value1, Integer value2) {
            addCriterion("downloads not between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathIsNull() {
            addCriterion("miniimgpath is null");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathIsNotNull() {
            addCriterion("miniimgpath is not null");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathEqualTo(String value) {
            addCriterion("miniimgpath =", value, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathNotEqualTo(String value) {
            addCriterion("miniimgpath <>", value, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathGreaterThan(String value) {
            addCriterion("miniimgpath >", value, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathGreaterThanOrEqualTo(String value) {
            addCriterion("miniimgpath >=", value, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathLessThan(String value) {
            addCriterion("miniimgpath <", value, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathLessThanOrEqualTo(String value) {
            addCriterion("miniimgpath <=", value, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathLike(String value) {
            addCriterion("miniimgpath like", value, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathNotLike(String value) {
            addCriterion("miniimgpath not like", value, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathIn(List<String> values) {
            addCriterion("miniimgpath in", values, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathNotIn(List<String> values) {
            addCriterion("miniimgpath not in", values, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathBetween(String value1, String value2) {
            addCriterion("miniimgpath between", value1, value2, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andMiniimgpathNotBetween(String value1, String value2) {
            addCriterion("miniimgpath not between", value1, value2, "miniimgpath");
            return (Criteria) this;
        }

        public Criteria andImgsizeIsNull() {
            addCriterion("imgsize is null");
            return (Criteria) this;
        }

        public Criteria andImgsizeIsNotNull() {
            addCriterion("imgsize is not null");
            return (Criteria) this;
        }

        public Criteria andImgsizeEqualTo(String value) {
            addCriterion("imgsize =", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeNotEqualTo(String value) {
            addCriterion("imgsize <>", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeGreaterThan(String value) {
            addCriterion("imgsize >", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeGreaterThanOrEqualTo(String value) {
            addCriterion("imgsize >=", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeLessThan(String value) {
            addCriterion("imgsize <", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeLessThanOrEqualTo(String value) {
            addCriterion("imgsize <=", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeLike(String value) {
            addCriterion("imgsize like", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeNotLike(String value) {
            addCriterion("imgsize not like", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeIn(List<String> values) {
            addCriterion("imgsize in", values, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeNotIn(List<String> values) {
            addCriterion("imgsize not in", values, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeBetween(String value1, String value2) {
            addCriterion("imgsize between", value1, value2, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeNotBetween(String value1, String value2) {
            addCriterion("imgsize not between", value1, value2, "imgsize");
            return (Criteria) this;
        }

        public Criteria andIsftpIsNull() {
            addCriterion("isFTP is null");
            return (Criteria) this;
        }

        public Criteria andIsftpIsNotNull() {
            addCriterion("isFTP is not null");
            return (Criteria) this;
        }

        public Criteria andIsftpEqualTo(String value) {
            addCriterion("isFTP =", value, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpNotEqualTo(String value) {
            addCriterion("isFTP <>", value, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpGreaterThan(String value) {
            addCriterion("isFTP >", value, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpGreaterThanOrEqualTo(String value) {
            addCriterion("isFTP >=", value, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpLessThan(String value) {
            addCriterion("isFTP <", value, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpLessThanOrEqualTo(String value) {
            addCriterion("isFTP <=", value, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpLike(String value) {
            addCriterion("isFTP like", value, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpNotLike(String value) {
            addCriterion("isFTP not like", value, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpIn(List<String> values) {
            addCriterion("isFTP in", values, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpNotIn(List<String> values) {
            addCriterion("isFTP not in", values, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpBetween(String value1, String value2) {
            addCriterion("isFTP between", value1, value2, "isftp");
            return (Criteria) this;
        }

        public Criteria andIsftpNotBetween(String value1, String value2) {
            addCriterion("isFTP not between", value1, value2, "isftp");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidIsNull() {
            addCriterion("FTPConfigId is null");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidIsNotNull() {
            addCriterion("FTPConfigId is not null");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidEqualTo(Integer value) {
            addCriterion("FTPConfigId =", value, "ftpconfigid");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidNotEqualTo(Integer value) {
            addCriterion("FTPConfigId <>", value, "ftpconfigid");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidGreaterThan(Integer value) {
            addCriterion("FTPConfigId >", value, "ftpconfigid");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FTPConfigId >=", value, "ftpconfigid");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidLessThan(Integer value) {
            addCriterion("FTPConfigId <", value, "ftpconfigid");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidLessThanOrEqualTo(Integer value) {
            addCriterion("FTPConfigId <=", value, "ftpconfigid");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidIn(List<Integer> values) {
            addCriterion("FTPConfigId in", values, "ftpconfigid");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidNotIn(List<Integer> values) {
            addCriterion("FTPConfigId not in", values, "ftpconfigid");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidBetween(Integer value1, Integer value2) {
            addCriterion("FTPConfigId between", value1, value2, "ftpconfigid");
            return (Criteria) this;
        }

        public Criteria andFtpconfigidNotBetween(Integer value1, Integer value2) {
            addCriterion("FTPConfigId not between", value1, value2, "ftpconfigid");
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