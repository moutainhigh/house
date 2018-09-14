package com.jzfq.house.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

public class ouseMessage implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.house_id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private String houseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.from_person_id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private Integer fromPersonId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.to_person_id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private Integer toPersonId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.content
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.talk_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private Date talkTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.talk_back
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private String talkBack;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.back_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private Date backTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.description
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.del
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private Integer del;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.create_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.create_user
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.update_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_message.update_user
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.id
     *
     * @return the value of house_message.id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.id
     *
     * @param id the value for house_message.id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.house_id
     *
     * @return the value of house_message.house_id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public String getHouseId() {
        return houseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.house_id
     *
     * @param houseId the value for house_message.house_id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.from_person_id
     *
     * @return the value of house_message.from_person_id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public Integer getFromPersonId() {
        return fromPersonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.from_person_id
     *
     * @param fromPersonId the value for house_message.from_person_id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setFromPersonId(Integer fromPersonId) {
        this.fromPersonId = fromPersonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.to_person_id
     *
     * @return the value of house_message.to_person_id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public Integer getToPersonId() {
        return toPersonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.to_person_id
     *
     * @param toPersonId the value for house_message.to_person_id
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setToPersonId(Integer toPersonId) {
        this.toPersonId = toPersonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.content
     *
     * @return the value of house_message.content
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.content
     *
     * @param content the value for house_message.content
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.talk_time
     *
     * @return the value of house_message.talk_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public Date getTalkTime() {
        return talkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.talk_time
     *
     * @param talkTime the value for house_message.talk_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setTalkTime(Date talkTime) {
        this.talkTime = talkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.talk_back
     *
     * @return the value of house_message.talk_back
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public String getTalkBack() {
        return talkBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.talk_back
     *
     * @param talkBack the value for house_message.talk_back
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setTalkBack(String talkBack) {
        this.talkBack = talkBack == null ? null : talkBack.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.back_time
     *
     * @return the value of house_message.back_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public Date getBackTime() {
        return backTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.back_time
     *
     * @param backTime the value for house_message.back_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.description
     *
     * @return the value of house_message.description
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.description
     *
     * @param description the value for house_message.description
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.del
     *
     * @return the value of house_message.del
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public Integer getDel() {
        return del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.del
     *
     * @param del the value for house_message.del
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setDel(Integer del) {
        this.del = del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.create_time
     *
     * @return the value of house_message.create_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.create_time
     *
     * @param createTime the value for house_message.create_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.create_user
     *
     * @return the value of house_message.create_user
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.create_user
     *
     * @param createUser the value for house_message.create_user
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.update_time
     *
     * @return the value of house_message.update_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.update_time
     *
     * @param updateTime the value for house_message.update_time
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_message.update_user
     *
     * @return the value of house_message.update_user
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_message.update_user
     *
     * @param updateUser the value for house_message.update_user
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
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
        ouseMessage other = (ouseMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHouseId() == null ? other.getHouseId() == null : this.getHouseId().equals(other.getHouseId()))
            && (this.getFromPersonId() == null ? other.getFromPersonId() == null : this.getFromPersonId().equals(other.getFromPersonId()))
            && (this.getToPersonId() == null ? other.getToPersonId() == null : this.getToPersonId().equals(other.getToPersonId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getTalkTime() == null ? other.getTalkTime() == null : this.getTalkTime().equals(other.getTalkTime()))
            && (this.getTalkBack() == null ? other.getTalkBack() == null : this.getTalkBack().equals(other.getTalkBack()))
            && (this.getBackTime() == null ? other.getBackTime() == null : this.getBackTime().equals(other.getBackTime()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_message
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHouseId() == null) ? 0 : getHouseId().hashCode());
        result = prime * result + ((getFromPersonId() == null) ? 0 : getFromPersonId().hashCode());
        result = prime * result + ((getToPersonId() == null) ? 0 : getToPersonId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getTalkTime() == null) ? 0 : getTalkTime().hashCode());
        result = prime * result + ((getTalkBack() == null) ? 0 : getTalkBack().hashCode());
        result = prime * result + ((getBackTime() == null) ? 0 : getBackTime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        return result;
    }
}