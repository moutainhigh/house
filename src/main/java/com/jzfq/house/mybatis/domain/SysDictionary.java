package com.jzfq.house.mybatis.domain;

import java.io.Serializable;

public class SysDictionary implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.id
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.parent_id
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.code
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.label
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    private String label;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.description
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.value
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.extend
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    private String extend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_dictionary
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.id
     *
     * @return the value of sys_dictionary.id
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.id
     *
     * @param id the value for sys_dictionary.id
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.parent_id
     *
     * @return the value of sys_dictionary.parent_id
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.parent_id
     *
     * @param parentId the value for sys_dictionary.parent_id
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.code
     *
     * @return the value of sys_dictionary.code
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.code
     *
     * @param code the value for sys_dictionary.code
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.label
     *
     * @return the value of sys_dictionary.label
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.label
     *
     * @param label the value for sys_dictionary.label
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.description
     *
     * @return the value of sys_dictionary.description
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.description
     *
     * @param description the value for sys_dictionary.description
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.value
     *
     * @return the value of sys_dictionary.value
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.value
     *
     * @param value the value for sys_dictionary.value
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.extend
     *
     * @return the value of sys_dictionary.extend
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public String getExtend() {
        return extend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.extend
     *
     * @param extend the value for sys_dictionary.extend
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysDictionary other = (SysDictionary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getExtend() == null ? other.getExtend() == null : this.getExtend().equals(other.getExtend()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbggenerated Tue May 15 14:45:43 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getExtend() == null) ? 0 : getExtend().hashCode());
        return result;
    }
}