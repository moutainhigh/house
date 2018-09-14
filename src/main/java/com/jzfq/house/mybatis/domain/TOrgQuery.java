package com.jzfq.house.mybatis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOrgQuery {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    public TOrgQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
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
            addCriterion("tOrg.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("tOrg.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("tOrg.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("tOrg.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("tOrg.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("tOrg.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("tOrg.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("tOrg.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("tOrg.id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("tOrg.id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("tOrg.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("tOrg.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("tOrg.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("tOrg.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("tOrg.label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("tOrg.label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("tOrg.label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("tOrg.label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("tOrg.label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("tOrg.label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("tOrg.label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("tOrg.label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("tOrg.label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("tOrg.label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("tOrg.label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("tOrg.label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("tOrg.label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("tOrg.label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("tOrg.parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("tOrg.parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("tOrg.parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("tOrg.parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("tOrg.parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("tOrg.parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("tOrg.parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("tOrg.parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("tOrg.parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("tOrg.parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("tOrg.parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("tOrg.parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("tOrg.parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("tOrg.parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("tOrg.full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("tOrg.full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("tOrg.full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("tOrg.full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("tOrg.full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("tOrg.full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("tOrg.full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("tOrg.full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("tOrg.full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("tOrg.full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("tOrg.full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("tOrg.full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("tOrg.full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("tOrg.full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullPathIsNull() {
            addCriterion("tOrg.full_path is null");
            return (Criteria) this;
        }

        public Criteria andFullPathIsNotNull() {
            addCriterion("tOrg.full_path is not null");
            return (Criteria) this;
        }

        public Criteria andFullPathEqualTo(String value) {
            addCriterion("tOrg.full_path =", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathNotEqualTo(String value) {
            addCriterion("tOrg.full_path <>", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathGreaterThan(String value) {
            addCriterion("tOrg.full_path >", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathGreaterThanOrEqualTo(String value) {
            addCriterion("tOrg.full_path >=", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathLessThan(String value) {
            addCriterion("tOrg.full_path <", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathLessThanOrEqualTo(String value) {
            addCriterion("tOrg.full_path <=", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathLike(String value) {
            addCriterion("tOrg.full_path like", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathNotLike(String value) {
            addCriterion("tOrg.full_path not like", value, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathIn(List<String> values) {
            addCriterion("tOrg.full_path in", values, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathNotIn(List<String> values) {
            addCriterion("tOrg.full_path not in", values, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathBetween(String value1, String value2) {
            addCriterion("tOrg.full_path between", value1, value2, "fullPath");
            return (Criteria) this;
        }

        public Criteria andFullPathNotBetween(String value1, String value2) {
            addCriterion("tOrg.full_path not between", value1, value2, "fullPath");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNull() {
            addCriterion("tOrg.available is null");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("tOrg.available is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEqualTo(Boolean value) {
            addCriterion("tOrg.available =", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotEqualTo(Boolean value) {
            addCriterion("tOrg.available <>", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThan(Boolean value) {
            addCriterion("tOrg.available >", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tOrg.available >=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThan(Boolean value) {
            addCriterion("tOrg.available <", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThanOrEqualTo(Boolean value) {
            addCriterion("tOrg.available <=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableIn(List<Boolean> values) {
            addCriterion("tOrg.available in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotIn(List<Boolean> values) {
            addCriterion("tOrg.available not in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableBetween(Boolean value1, Boolean value2) {
            addCriterion("tOrg.available between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tOrg.available not between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("tOrg.level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("tOrg.level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("tOrg.level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("tOrg.level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("tOrg.level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tOrg.level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("tOrg.level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("tOrg.level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("tOrg.level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("tOrg.level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("tOrg.level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("tOrg.level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("tOrg.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("tOrg.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("tOrg.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("tOrg.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("tOrg.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tOrg.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("tOrg.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tOrg.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("tOrg.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("tOrg.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("tOrg.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tOrg.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("tOrg.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("tOrg.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("tOrg.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("tOrg.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("tOrg.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tOrg.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("tOrg.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tOrg.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("tOrg.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("tOrg.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tOrg.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tOrg.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(tOrg.id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andLabelLikeInsensitive(String value) {
            addCriterion("upper(tOrg.label) like", value.toUpperCase(), "label");
            return (Criteria) this;
        }

        public Criteria andParentIdLikeInsensitive(String value) {
            addCriterion("upper(tOrg.parent_id) like", value.toUpperCase(), "parentId");
            return (Criteria) this;
        }

        public Criteria andFullNameLikeInsensitive(String value) {
            addCriterion("upper(tOrg.full_name) like", value.toUpperCase(), "fullName");
            return (Criteria) this;
        }

        public Criteria andFullPathLikeInsensitive(String value) {
            addCriterion("upper(tOrg.full_path) like", value.toUpperCase(), "fullPath");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_org
     *
     * @mbggenerated do_not_delete_during_merge Fri Jun 01 14:39:16 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_org
     *
     * @mbggenerated Fri Jun 01 14:39:16 CST 2018
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